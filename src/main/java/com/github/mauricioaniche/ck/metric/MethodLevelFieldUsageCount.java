package com.github.mauricioaniche.ck.metric;

import com.github.mauricioaniche.ck.CKMethodResult;
import org.eclipse.jdt.core.dom.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MethodLevelFieldUsageCount implements CKASTVisitor, MethodLevelMetric, VariableOrFieldMetric {
	private Set<String> declaredFields;
	private Map<String, Integer> occurrences;

	private Set<String> variables;
	private boolean isFieldAccess;
	private boolean isQualifiedName;

	public MethodLevelFieldUsageCount() {
		declaredFields = new HashSet<>();
		this.occurrences = new HashMap<>();
		this.variables = new HashSet<>();
	}

    @Override
	public void visit(MethodDeclaration node) {
		IMethodBinding binding = node.resolveBinding();
		if(binding==null)
			return;

		IVariableBinding[] fields = binding.getDeclaringClass().getDeclaredFields();

		for (IVariableBinding field : fields) {
			declaredFields.add(field.getName());
		}
	}

    @Override
	public void visit(VariableDeclarationFragment node) {
		String variable = node.getName().toString();
		variables.add(variable);
	}

    @Override
	public void visit(FieldAccess node) {
		isFieldAccess = true;
	}

    @Override
	public void endVisit(FieldAccess node) {
		isFieldAccess = false;
	}

    @Override
	public void visit(QualifiedName node){
		isQualifiedName = true;
	}

    @Override
	public void endVisit(QualifiedName node) {
		isQualifiedName = false;
	}

	private void plusOne(String variable) {
		if (!occurrences.containsKey(variable))
			occurrences.put(variable, 0);
		occurrences.put(variable, occurrences.get(variable) + 1);
	}

    @Override
	public void visit(SimpleName node) {
		String variableName = node.getIdentifier();

		boolean accessFieldUsingThis = isFieldAccess && declaredFields.contains(variableName);
		boolean accessFieldUsingOnlyVariableName = !isFieldAccess && declaredFields.contains(variableName) && !variables.contains(variableName);
		if((accessFieldUsingThis || accessFieldUsingOnlyVariableName) && !isQualifiedName) {
			plusOne(variableName);
		}
	}

	@Override
	public void setResult(CKMethodResult result) {
		result.setFieldUsage(occurrences);
	}
}