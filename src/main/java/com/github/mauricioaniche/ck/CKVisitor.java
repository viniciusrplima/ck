package com.github.mauricioaniche.ck;

import com.github.mauricioaniche.ck.metric.CKASTVisitor;
import com.github.mauricioaniche.ck.metric.ClassLevelMetric;
import com.github.mauricioaniche.ck.metric.MethodLevelMetric;
import com.github.mauricioaniche.ck.util.JDTUtils;
import org.eclipse.jdt.core.dom.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.Callable;

import static com.github.mauricioaniche.ck.util.LOCCalculator.calculate;

public class CKVisitor extends ASTVisitor {

	private String sourceFilePath;
	private int anonymousNumber;
	private int initializerNumber;

	class MethodInTheStack {
		CKMethodResult result;
		List<MethodLevelMetric> methodLevelMetrics;
	}

	class ClassInTheStack {
		CKClassResult result;
		List<ClassLevelMetric> classLevelMetrics;
		Stack<MethodInTheStack> methods;


		ClassInTheStack() {
			methods = new Stack<>();
		}
	}
	private Stack<ClassInTheStack> classes;

	private Set<CKClassResult> collectedClasses;

	private CompilationUnit cu;
	private Callable<List<ClassLevelMetric>> classLevelMetrics;
	private Callable<List<MethodLevelMetric>> methodLevelMetrics;

	public CKVisitor(String sourceFilePath, CompilationUnit cu, Callable<List<ClassLevelMetric>> classLevelMetrics, Callable<List<MethodLevelMetric>> methodLevelMetrics) {
		this.sourceFilePath = sourceFilePath;
		this.cu = cu;
		this.classLevelMetrics = classLevelMetrics;
		this.methodLevelMetrics = methodLevelMetrics;
		this.classes = new Stack<>();
		this.collectedClasses = new HashSet<>();
	}

	@Override
	public boolean visit(TypeDeclaration node) {
		ITypeBinding binding = node.resolveBinding();

		// build a CKClassResult based on the current type
		// declaration we are visiting
		String className = binding != null ? binding.getBinaryName() : node.getName().getFullyQualifiedName();
		String type = getTypeOfTheUnit(node);
		int modifiers = node.getModifiers();
		CKClassResult currentClass = new CKClassResult(sourceFilePath, className, type, modifiers);
		currentClass.setLoc(calculate(node.toString()));
		
		// there might be metrics that use it
		// (even before a class is declared)
		if(!classes.isEmpty()) {			
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if (!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
				
		}

		// create a set of visitors, just for the current class
		List<ClassLevelMetric> classLevelMetrics = instantiateClassLevelMetricVisitors(className);

		// store everything in a 'class in the stack' data structure
		ClassInTheStack classInTheStack = new ClassInTheStack();
		classInTheStack.result = currentClass;
		classInTheStack.classLevelMetrics = classLevelMetrics;

		// push it to the stack, so we know the current class we are visiting
		classes.push(classInTheStack);

		// there might be class level metrics that use the TypeDeclaration
		// so, let's run them
		classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));

		return true;
	}


	@Override
	public void endVisit(TypeDeclaration node) {

		// let's first visit any metrics that might make use of this endVisit
		classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.endVisit(node));

		ClassInTheStack completedClass = classes.pop();

		// persist the results of the class level metrics in the result
		completedClass.classLevelMetrics.forEach(m -> m.setResult(completedClass.result));

		// we are done processing this class, so now let's
		// store it in the collected classes set
		collectedClasses.add(completedClass.result);
	}

    @Override
	public boolean visit(MethodDeclaration node) {

        String currentMethodName = JDTUtils.getMethodFullName(node);
		String currentQualifiedMethodName = JDTUtils.getQualifiedMethodFullName(node);
		boolean isConstructor = node.isConstructor();

        CKMethodResult currentMethod = new CKMethodResult(currentMethodName, currentQualifiedMethodName, isConstructor, node.getModifiers());
		currentMethod.setLoc(calculate(node.toString()));
		currentMethod.setStartLine(JDTUtils.getStartLine(cu, node));

		// let's instantiate method level visitors for this current method
		List<MethodLevelMetric> methodLevelMetrics = instantiateMethodLevelMetricVisitors(currentQualifiedMethodName);

		// we add it to the current class we are visiting
		MethodInTheStack methodInTheStack = new MethodInTheStack();
		methodInTheStack.result = currentMethod;
		methodInTheStack.methodLevelMetrics = methodLevelMetrics;
		classes.peek().methods.push(methodInTheStack);

		// and there might be metrics that also use the methoddeclaration node.
		// so, let's call them
		classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		if(!classes.peek().methods.isEmpty())
			classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));

		return true;
	}

	@Override
	public void endVisit(MethodDeclaration node) {

		// let's first invoke the metrics, because they might use this node
		classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.endVisit(node));
		classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.endVisit(node));

		// remove the method from the stack
		MethodInTheStack completedMethod = classes.peek().methods.pop();

		// persist the data of the visitors in the CKMethodResult
		completedMethod.methodLevelMetrics.forEach(m -> m.setResult(completedMethod.result));

		// store its final version in the current class
		classes.peek().result.addMethod(completedMethod.result);
	}


    @Override
	public boolean visit(AnonymousClassDeclaration node) {
		// there might be metrics that use it
		// (even before an anonymous class is created)
		classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		if(!classes.peek().methods.isEmpty())
			classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));

		// we give the anonymous class a 'class$AnonymousN' name
		String anonClassName = classes.peek().result.getClassName() + "$Anonymous" + ++anonymousNumber;
		CKClassResult currentClass = new CKClassResult(sourceFilePath, anonClassName, "anonymous", -1);
		currentClass.setLoc(calculate(node.toString()));

		// create a set of visitors, just for the current class
		List<ClassLevelMetric> classLevelMetrics = instantiateClassLevelMetricVisitors(anonClassName);

		// store everything in a 'class in the stack' data structure
		ClassInTheStack classInTheStack = new ClassInTheStack();
		classInTheStack.result = currentClass;
		classInTheStack.classLevelMetrics = classLevelMetrics;

		// push it to the stack, so we know the current class we are visiting
		classes.push(classInTheStack);

		// and there might be metrics that also use the methoddeclaration node.
		// so, let's call them
		classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		if(!classes.peek().methods.isEmpty())
			classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));

		return true;
	}

    @Override
	public void endVisit(AnonymousClassDeclaration node) {

		classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.endVisit(node));

		ClassInTheStack completedClass = classes.pop();

		// persist the results of the class level metrics in the result
		completedClass.classLevelMetrics.forEach(m -> m.setResult(completedClass.result));

		// we are done processing this class, so now let's
		// store it in the collected classes set
		collectedClasses.add(completedClass.result);
	}

	// static blocks
    @Override
	public boolean visit(Initializer node) {

		String currentMethodName = "(initializer " + (++initializerNumber) + ")";

		CKMethodResult currentMethod = new CKMethodResult(currentMethodName, currentMethodName, false, node.getModifiers());
		currentMethod.setLoc(calculate(node.toString()));
		currentMethod.setStartLine(JDTUtils.getStartLine(cu, node));

		// let's instantiate method level visitors for this current method
		List<MethodLevelMetric> methodLevelMetrics = instantiateMethodLevelMetricVisitors(currentMethodName);

		// we add it to the current class we are visiting
		MethodInTheStack methodInTheStack = new MethodInTheStack();
		methodInTheStack.result = currentMethod;
		methodInTheStack.methodLevelMetrics = methodLevelMetrics;
		classes.peek().methods.push(methodInTheStack);

		// and there might be metrics that also use the methoddeclaration node.
		// so, let's call them
		classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		if(!classes.peek().methods.isEmpty())
			classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));

		return true;
	}

	@Override
	public void endVisit(Initializer node) {

		// let's first invoke the metrics, because they might use this node
		classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.endVisit(node));
		classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.endVisit(node));

		// remove the method from the stack
		MethodInTheStack completedMethod = classes.peek().methods.pop();

		// persist the data of the visitors in the CKMethodResult
		completedMethod.methodLevelMetrics.forEach(m -> m.setResult(completedMethod.result));

		// store its final version in the current class
		classes.peek().result.addMethod(completedMethod.result);
	}


    @Override
	public boolean visit(EnumDeclaration node) {
		ITypeBinding binding = node.resolveBinding();

		// there might be metrics that use it
		// (even before a enum is declared)
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if (!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}

		// build a CKClassResult based on the current type
		// declaration we are visiting
		String className = binding != null ? binding.getBinaryName() : node.getName().getFullyQualifiedName();
		String type = "enum";
		int modifiers = node.getModifiers();
		CKClassResult currentClass = new CKClassResult(sourceFilePath, className, type, modifiers);
		currentClass.setLoc(calculate(node.toString()));

		// create a set of visitors, just for the current class
		List<ClassLevelMetric> classLevelMetrics = instantiateClassLevelMetricVisitors(className);

		// store everything in a 'class in the stack' data structure
		ClassInTheStack classInTheStack = new ClassInTheStack();
		classInTheStack.result = currentClass;
		classInTheStack.classLevelMetrics = classLevelMetrics;

		// push it to the stack, so we know the current class we are visiting
		classes.push(classInTheStack);

		// there might be class level metrics that use the TypeDeclaration
		// so, let's run them
		classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));

		return true;

	}

	@Override
	public void endVisit(EnumDeclaration node) {
		// let's first visit any metrics that might make use of this endVisit
		classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.endVisit(node));

		ClassInTheStack completedClass = classes.pop();

		// persist the results of the class level metrics in the result
		completedClass.classLevelMetrics.forEach(m -> m.setResult(completedClass.result));

		// we are done processing this class, so now let's
		// store it in the collected classes set
		collectedClasses.add(completedClass.result);
	}

	private List<ClassLevelMetric> instantiateClassLevelMetricVisitors(String className) {
		try {
			List<ClassLevelMetric> classes = classLevelMetrics.call();
			classes.forEach(c -> { c.setClassName(className); });
			return classes;
		} catch(Exception e) {
			throw new RuntimeException("Could not instantiate class level visitors", e);
		}
	}

	private List<MethodLevelMetric> instantiateMethodLevelMetricVisitors(String methodName) {
		try {
			List<MethodLevelMetric> methods = methodLevelMetrics.call();
			methods.forEach(m -> { m.setMethodName(methodName); });
			return methods;
		} catch(Exception e) {
			throw new RuntimeException("Could not instantiate method level visitors", e);
		}
	}

	public Set<CKClassResult> getCollectedClasses() {
		return collectedClasses;
	}

	private String getTypeOfTheUnit(TypeDeclaration node) {
		return node.isInterface() ? "interface" : (classes.isEmpty() ? "class" : "innerclass");
	}

	// -------------------------------------------------------
	// From here, just delegating the calls to the metrics
    @Override
	public boolean visit(AnnotationTypeDeclaration node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

    @Override
	public boolean visit(AnnotationTypeMemberDeclaration node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

    @Override
	public boolean visit(ArrayAccess node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

    @Override
	public boolean visit(ArrayCreation node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

    @Override
	public boolean visit(ArrayInitializer node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

    @Override
	public boolean visit(ArrayType node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

    @Override
	public boolean visit(AssertStatement node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

    @Override
	public boolean visit(Assignment node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

    @Override
	public boolean visit(Block node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

    @Override
	public boolean visit(BlockComment node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

    @Override
	public boolean visit(BooleanLiteral node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

    @Override
	public boolean visit(BreakStatement node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

    @Override
	public boolean visit(CastExpression node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

    @Override
	public boolean visit(CatchClause node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

    @Override
	public boolean visit(CharacterLiteral node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

    @Override
	public boolean visit(ClassInstanceCreation node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

    @Override
	public boolean visit(CompilationUnit node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;
	}

    @Override
	public boolean visit(ConditionalExpression node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

    @Override
	public boolean visit(ConstructorInvocation node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

    @Override
	public boolean visit(ContinueStatement node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

    @Override
	public boolean visit(CreationReference node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

    @Override
	public boolean visit(Dimension node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

    @Override
	public boolean visit(DoStatement node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

    @Override
	public boolean visit(EmptyStatement node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

    @Override
	public boolean visit(EnhancedForStatement node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

    @Override
	public boolean visit(EnumConstantDeclaration node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

    @Override
	public boolean visit(ExpressionMethodReference node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

    @Override
	public boolean visit(ExpressionStatement node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

    @Override
	public boolean visit(FieldAccess node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

    @Override
	public boolean visit(FieldDeclaration node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

    @Override
	public boolean visit(ForStatement node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

    @Override
	public boolean visit(IfStatement node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

    @Override
	public boolean visit(ImportDeclaration node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

    @Override
	public boolean visit(InfixExpression node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

    @Override
	public boolean visit(InstanceofExpression node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

    @Override
	public boolean visit(IntersectionType node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

    @Override
	public boolean visit(LabeledStatement node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

    @Override
	public boolean visit(LambdaExpression node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

    @Override
	public boolean visit(LineComment node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

    @Override
	public boolean visit(MarkerAnnotation node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

    @Override
	public boolean visit(MemberRef node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

    @Override
	public boolean visit(MemberValuePair node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

    @Override
	public boolean visit(MethodRef node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

    @Override
	public boolean visit(MethodRefParameter node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

    @Override
	public boolean visit(MethodInvocation node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

    @Override
	public boolean visit(Modifier node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

    @Override
	public boolean visit(NameQualifiedType node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

    @Override
	public boolean visit(NormalAnnotation node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

    @Override
	public boolean visit(NullLiteral node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

    @Override
	public boolean visit(NumberLiteral node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

    @Override
	public boolean visit(PackageDeclaration node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

    @Override
	public boolean visit(ParameterizedType node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

    @Override
	public boolean visit(ParenthesizedExpression node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

    @Override
	public boolean visit(PostfixExpression node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

    @Override
	public boolean visit(PrefixExpression node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

    @Override
	public boolean visit(PrimitiveType node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

    @Override
	public boolean visit(QualifiedName node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

    @Override
	public boolean visit(QualifiedType node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

    @Override
	public boolean visit(ReturnStatement node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

    @Override
	public boolean visit(SimpleName node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

    @Override
	public boolean visit(SimpleType node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

    @Override
	public boolean visit(SingleMemberAnnotation node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

    @Override
	public boolean visit(SingleVariableDeclaration node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

    @Override
	public boolean visit(StringLiteral node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

    @Override
	public boolean visit(SuperConstructorInvocation node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

    @Override
	public boolean visit(SuperFieldAccess node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

    @Override
	public boolean visit(SuperMethodInvocation node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

    @Override
	public boolean visit(SuperMethodReference node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

    @Override
	public boolean visit(SwitchCase node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

    @Override
	public boolean visit(SwitchStatement node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

    @Override
	public boolean visit(SynchronizedStatement node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

    @Override
	public boolean visit(TagElement node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

    @Override
	public boolean visit(TextElement node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

    @Override
	public boolean visit(ThisExpression node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

    @Override
	public boolean visit(ThrowStatement node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

    @Override
	public boolean visit(TryStatement node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

    @Override
	public boolean visit(TypeDeclarationStatement node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

    @Override
	public boolean visit(TypeLiteral node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

    @Override
	public boolean visit(TypeMethodReference node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

    @Override
	public boolean visit(TypeParameter node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

    @Override
	public boolean visit(UnionType node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

    @Override
	public boolean visit(VariableDeclarationExpression node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

    @Override
	public boolean visit(VariableDeclarationStatement node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

    @Override
	public boolean visit(VariableDeclarationFragment node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

    @Override
	public boolean visit(WhileStatement node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

    @Override
	public boolean visit(WildcardType node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

	// we only visit if we found a type already.
	// TODO: understand what happens with a javadoc in a class. Will the TypeDeclaration come first?
    @Override
	public boolean visit(Javadoc node) {
		if(!classes.isEmpty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
			if(!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.visit(node));
		}
		return true;

	}

	// ---------------------------------------------
	// End visits

	@Override
	public void endVisit(Block node) {
		classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.endVisit(node));
		if(!classes.peek().methods.isEmpty())
			classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.endVisit(node));
	}

	@Override
	public void endVisit(FieldAccess node) {
		classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.endVisit(node));
		if(!classes.peek().methods.isEmpty())
			classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.endVisit(node));
	}

	@Override
	public void endVisit(ConditionalExpression node) {
		classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.endVisit(node));
		if(!classes.peek().methods.isEmpty())
			classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.endVisit(node));
	}

    @Override
	public void endVisit(ForStatement node) {
		classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.endVisit(node));
		if(!classes.peek().methods.isEmpty())
			classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.endVisit(node));
	}

    @Override
	public void endVisit(EnhancedForStatement node) {
		classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.endVisit(node));
		if(!classes.peek().methods.isEmpty())
			classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.endVisit(node));
	}

    @Override
	public void endVisit(DoStatement node) {
		classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.endVisit(node));
		if(!classes.peek().methods.isEmpty())
			classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.endVisit(node));
	}

    @Override
	public void endVisit(WhileStatement node) {
		classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.endVisit(node));
		if(!classes.peek().methods.isEmpty())
			classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.endVisit(node));
	}

    @Override
	public void endVisit(SwitchCase node) {
		classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.endVisit(node));
		if(!classes.peek().methods.isEmpty())
			classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.endVisit(node));
	}

    @Override
	public void endVisit(IfStatement node) {
		classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.endVisit(node));
		if(!classes.peek().methods.isEmpty())
			classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.endVisit(node));
	}

    @Override
	public void endVisit(SwitchStatement node) {
		classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.endVisit(node));
		if(!classes.peek().methods.isEmpty())
			classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.endVisit(node));
	}

    @Override
	public void endVisit(CatchClause node) {
		classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.endVisit(node));
		if(!classes.peek().methods.isEmpty())
			classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.endVisit(node));
	}

    @Override
	public void endVisit(Javadoc node) {
		if(!classes.empty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.endVisit(node));
			if (!classes.peek().methods.isEmpty())
				classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.endVisit(node));
		}
	}

    @Override
	public void endVisit(QualifiedName node) {
		if(!classes.empty()) {
			classes.peek().classLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.endVisit(node));
		}
		if(!classes.isEmpty() && !classes.peek().methods.isEmpty())
			classes.peek().methods.peek().methodLevelMetrics.stream().map(metric -> (CKASTVisitor) metric).forEach(ast -> ast.endVisit(node));
	}
	// TODO: add all other endVisit blocks
}