package com.github.mauricioaniche.ck.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        cKMethodResult4.setLoc((int) (byte) 100);
        cKMethodResult4.setNumbersQty((-1));
        java.lang.String str9 = cKMethodResult4.toString();
        java.util.Map<java.lang.String, java.util.Set<java.lang.String>> strMap10 = cKMethodResult4.getMethodInvocationsIndirectLocal();
        boolean boolean11 = cKMethodResult4.getHasJavadoc();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}" + "'", str9, "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.EnumConstantDeclaration enumConstantDeclaration7 = null;
        cKVisitor4.endVisit(enumConstantDeclaration7);
        org.eclipse.jdt.core.dom.NormalAnnotation normalAnnotation9 = null;
        cKVisitor4.endVisit(normalAnnotation9);
        org.eclipse.jdt.core.dom.NumberLiteral numberLiteral11 = null;
        boolean boolean12 = cKVisitor4.visit(numberLiteral11);
        org.eclipse.jdt.core.dom.SingleMemberAnnotation singleMemberAnnotation13 = null;
        boolean boolean14 = cKVisitor4.visit(singleMemberAnnotation13);
        org.eclipse.jdt.core.dom.TypeDeclaration typeDeclaration15 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(typeDeclaration15);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ASTNode aSTNode5 = null;
        boolean boolean6 = cKVisitor4.preVisit2(aSTNode5);
        org.eclipse.jdt.core.dom.SwitchStatement switchStatement7 = null;
        boolean boolean8 = cKVisitor4.visit(switchStatement7);
        org.eclipse.jdt.core.dom.ConditionalExpression conditionalExpression9 = null;
        boolean boolean10 = cKVisitor4.visit(conditionalExpression9);
        org.eclipse.jdt.core.dom.MarkerAnnotation markerAnnotation11 = null;
        boolean boolean12 = cKVisitor4.visit(markerAnnotation11);
        org.eclipse.jdt.core.dom.AnnotationTypeDeclaration annotationTypeDeclaration13 = null;
        boolean boolean14 = cKVisitor4.visit(annotationTypeDeclaration13);
        org.eclipse.jdt.core.dom.ExpressionMethodReference expressionMethodReference15 = null;
        cKVisitor4.endVisit(expressionMethodReference15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getUniqueWordsQty();
        int int6 = cKMethodResult4.getNumbersQty();
        int int7 = cKMethodResult4.getStartLine();
        java.util.Map<java.lang.String, java.util.Set<java.lang.String>> strMap8 = cKMethodResult4.getMethodInvocationsIndirectLocal();
        int int9 = cKMethodResult4.getStartLine();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression9 = null;
        cKVisitor4.endVisit(patternInstanceofExpression9);
        org.eclipse.jdt.core.dom.InstanceofExpression instanceofExpression11 = null;
        cKVisitor4.endVisit(instanceofExpression11);
        org.eclipse.jdt.core.dom.InfixExpression infixExpression13 = null;
        boolean boolean14 = cKVisitor4.visit(infixExpression13);
        org.eclipse.jdt.core.dom.LineComment lineComment15 = null;
        boolean boolean16 = cKVisitor4.visit(lineComment15);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setStringLiteralsQty((int) (byte) 1);
        java.util.Optional<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultOptional8 = cKClassResult4.getMethod("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
        cKClassResult4.setNumberOfProtectedFields((int) (byte) 0);
        int int11 = cKClassResult4.getUniqueWordsQty();
        org.junit.Assert.assertNotNull(cKMethodResultOptional8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ASTNode aSTNode5 = null;
        boolean boolean6 = cKVisitor4.preVisit2(aSTNode5);
        org.eclipse.jdt.core.dom.MethodInvocation methodInvocation7 = null;
        boolean boolean8 = cKVisitor4.visit(methodInvocation7);
        org.eclipse.jdt.core.dom.EmptyStatement emptyStatement9 = null;
        cKVisitor4.endVisit(emptyStatement9);
        org.eclipse.jdt.core.dom.Modifier modifier11 = null;
        boolean boolean12 = cKVisitor4.visit(modifier11);
        org.eclipse.jdt.core.dom.ArrayType arrayType13 = null;
        cKVisitor4.endVisit(arrayType13);
        org.eclipse.jdt.core.dom.SwitchExpression switchExpression15 = null;
        boolean boolean16 = cKVisitor4.visit(switchExpression15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.ContinueStatement continueStatement9 = null;
        cKVisitor4.endVisit(continueStatement9);
        org.eclipse.jdt.core.dom.SingleVariableDeclaration singleVariableDeclaration11 = null;
        boolean boolean12 = cKVisitor4.visit(singleVariableDeclaration11);
        org.eclipse.jdt.core.dom.SuperFieldAccess superFieldAccess13 = null;
        cKVisitor4.endVisit(superFieldAccess13);
        org.eclipse.jdt.core.dom.IntersectionType intersectionType15 = null;
        boolean boolean16 = cKVisitor4.visit(intersectionType15);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression9 = null;
        cKVisitor4.endVisit(patternInstanceofExpression9);
        org.eclipse.jdt.core.dom.InstanceofExpression instanceofExpression11 = null;
        cKVisitor4.endVisit(instanceofExpression11);
        org.eclipse.jdt.core.dom.Assignment assignment13 = null;
        cKVisitor4.endVisit(assignment13);
        org.eclipse.jdt.core.dom.SimpleType simpleType15 = null;
        cKVisitor4.endVisit(simpleType15);
        org.eclipse.jdt.core.dom.Block block17 = null;
        boolean boolean18 = cKVisitor4.visit(block17);
        org.eclipse.jdt.core.dom.ClassInstanceCreation classInstanceCreation19 = null;
        cKVisitor4.endVisit(classInstanceCreation19);
        org.eclipse.jdt.core.dom.PrefixExpression prefixExpression21 = null;
        boolean boolean22 = cKVisitor4.visit(prefixExpression21);
        org.eclipse.jdt.core.dom.TypeParameter typeParameter23 = null;
        cKVisitor4.endVisit(typeParameter23);
        org.eclipse.jdt.core.dom.DoStatement doStatement25 = null;
        boolean boolean26 = cKVisitor4.visit(doStatement25);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.RecordDeclaration recordDeclaration7 = null;
        boolean boolean8 = cKVisitor4.visit(recordDeclaration7);
        org.eclipse.jdt.core.dom.StringLiteral stringLiteral9 = null;
        boolean boolean10 = cKVisitor4.visit(stringLiteral9);
        org.eclipse.jdt.core.dom.IfStatement ifStatement11 = null;
        boolean boolean12 = cKVisitor4.visit(ifStatement11);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.ProvidesDirective providesDirective9 = null;
        boolean boolean10 = cKVisitor4.visit(providesDirective9);
        org.eclipse.jdt.core.dom.ThisExpression thisExpression11 = null;
        cKVisitor4.endVisit(thisExpression11);
        org.eclipse.jdt.core.dom.ContinueStatement continueStatement13 = null;
        boolean boolean14 = cKVisitor4.visit(continueStatement13);
        org.eclipse.jdt.core.dom.PrefixExpression prefixExpression15 = null;
        cKVisitor4.endVisit(prefixExpression15);
        org.eclipse.jdt.core.dom.CatchClause catchClause17 = null;
        boolean boolean18 = cKVisitor4.visit(catchClause17);
        org.eclipse.jdt.core.dom.NameQualifiedType nameQualifiedType19 = null;
        cKVisitor4.endVisit(nameQualifiedType19);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setAnonymousClassesQty((int) (byte) -1);
        int int7 = cKClassResult4.getNumberOfSynchronizedFields();
        cKClassResult4.setAssignmentsQty((int) (byte) 1);
        int int10 = cKClassResult4.getRfc();
        cKClassResult4.setNumberOfAbstractMethods((int) '#');
        cKClassResult4.setWmc((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getLcom();
        int int8 = cKClassResult4.getNumberOfFields();
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult13 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet14 = cKMethodResult13.getMethodInvocations();
        java.util.Set<java.lang.String> strSet15 = cKMethodResult13.getMethodInvocationsLocal();
        java.util.Set<java.lang.String> strSet16 = cKMethodResult13.getFieldsAccessed();
        java.lang.String str17 = cKMethodResult13.getQualifiedMethodName();
        int int18 = cKMethodResult13.getRfc();
        int int19 = cKMethodResult13.getModifiers();
        cKClassResult4.addMethod(cKMethodResult13);
        cKClassResult4.setRfc((int) (byte) 1);
        int int23 = cKClassResult4.getMaxNestedBlocks();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(strSet15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getLambdasQty();
        int int6 = cKMethodResult4.getFanout();
        int int7 = cKMethodResult4.getCboModified();
        cKMethodResult4.setHasJavadoc(true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.ProvidesDirective providesDirective9 = null;
        boolean boolean10 = cKVisitor4.visit(providesDirective9);
        org.eclipse.jdt.core.dom.ThisExpression thisExpression11 = null;
        cKVisitor4.endVisit(thisExpression11);
        org.eclipse.jdt.core.dom.IntersectionType intersectionType13 = null;
        cKVisitor4.endVisit(intersectionType13);
        org.eclipse.jdt.core.dom.ArrayInitializer arrayInitializer15 = null;
        cKVisitor4.endVisit(arrayInitializer15);
        org.eclipse.jdt.core.dom.TryStatement tryStatement17 = null;
        boolean boolean18 = cKVisitor4.visit(tryStatement17);
        org.eclipse.jdt.core.dom.TypeLiteral typeLiteral19 = null;
        cKVisitor4.endVisit(typeLiteral19);
        org.eclipse.jdt.core.dom.ForStatement forStatement21 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(forStatement21);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        cKMethodResult4.setLoc((int) (byte) 100);
        cKMethodResult4.setNumbersQty((-1));
        java.lang.String str9 = cKMethodResult4.toString();
        java.util.Map<java.lang.String, java.util.Set<java.lang.String>> strMap10 = cKMethodResult4.getMethodInvocationsIndirectLocal();
        int int11 = cKMethodResult4.getLoc();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}" + "'", str9, "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.IntersectionType intersectionType7 = null;
        boolean boolean8 = cKVisitor4.visit(intersectionType7);
        org.eclipse.jdt.core.dom.ExportsDirective exportsDirective9 = null;
        boolean boolean10 = cKVisitor4.visit(exportsDirective9);
        org.eclipse.jdt.core.dom.ImportDeclaration importDeclaration11 = null;
        boolean boolean12 = cKVisitor4.visit(importDeclaration11);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ASTNode aSTNode5 = null;
        boolean boolean6 = cKVisitor4.preVisit2(aSTNode5);
        org.eclipse.jdt.core.dom.VariableDeclarationFragment variableDeclarationFragment7 = null;
        boolean boolean8 = cKVisitor4.visit(variableDeclarationFragment7);
        org.eclipse.jdt.core.dom.TagElement tagElement9 = null;
        cKVisitor4.endVisit(tagElement9);
        org.eclipse.jdt.core.dom.LambdaExpression lambdaExpression11 = null;
        cKVisitor4.endVisit(lambdaExpression11);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ASTNode aSTNode5 = null;
        boolean boolean6 = cKVisitor4.preVisit2(aSTNode5);
        org.eclipse.jdt.core.dom.MethodInvocation methodInvocation7 = null;
        boolean boolean8 = cKVisitor4.visit(methodInvocation7);
        org.eclipse.jdt.core.dom.SwitchExpression switchExpression9 = null;
        cKVisitor4.endVisit(switchExpression9);
        org.eclipse.jdt.core.dom.ParameterizedType parameterizedType11 = null;
        boolean boolean12 = cKVisitor4.visit(parameterizedType11);
        org.eclipse.jdt.core.dom.LineComment lineComment13 = null;
        boolean boolean14 = cKVisitor4.visit(lineComment13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression9 = null;
        cKVisitor4.endVisit(patternInstanceofExpression9);
        org.eclipse.jdt.core.dom.Block block11 = null;
        boolean boolean12 = cKVisitor4.visit(block11);
        org.eclipse.jdt.core.dom.Initializer initializer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(initializer13);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getInnerClassesQty();
        int int6 = cKClassResult4.getNumberOfDefaultMethods();
        com.github.mauricioaniche.ck.CKClassResult cKClassResult11 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult11.setAnonymousClassesQty((int) (byte) -1);
        int int14 = cKClassResult11.getNumberOfSynchronizedFields();
        cKClassResult11.setRfc((-1));
        int int17 = cKClassResult11.getNumberOfProtectedFields();
        int int18 = cKClassResult11.getComparisonsQty();
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult23 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet24 = cKMethodResult23.getMethodInvocations();
        java.util.Set<java.lang.String> strSet25 = cKMethodResult23.getMethodInvocationsLocal();
        int int26 = cKMethodResult23.getWmc();
        java.util.Set<java.lang.String> strSet27 = cKMethodResult23.getMethodInvocations();
        cKClassResult11.setFieldNames(strSet27);
        cKClassResult4.setFieldNames(strSet27);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNull(strSet25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(strSet27);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.ProvidesDirective providesDirective9 = null;
        boolean boolean10 = cKVisitor4.visit(providesDirective9);
        org.eclipse.jdt.core.dom.FieldDeclaration fieldDeclaration11 = null;
        boolean boolean12 = cKVisitor4.visit(fieldDeclaration11);
        org.eclipse.jdt.core.dom.CharacterLiteral characterLiteral13 = null;
        boolean boolean14 = cKVisitor4.visit(characterLiteral13);
        org.eclipse.jdt.core.dom.SwitchExpression switchExpression15 = null;
        cKVisitor4.endVisit(switchExpression15);
        org.eclipse.jdt.core.dom.ClassInstanceCreation classInstanceCreation17 = null;
        boolean boolean18 = cKVisitor4.visit(classInstanceCreation17);
        org.eclipse.jdt.core.dom.CastExpression castExpression19 = null;
        boolean boolean20 = cKVisitor4.visit(castExpression19);
        org.eclipse.jdt.core.dom.PackageDeclaration packageDeclaration21 = null;
        cKVisitor4.endVisit(packageDeclaration21);
        org.eclipse.jdt.core.dom.ArrayInitializer arrayInitializer23 = null;
        boolean boolean24 = cKVisitor4.visit(arrayInitializer23);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setAnonymousClassesQty((int) (byte) -1);
        int int7 = cKClassResult4.getNumberOfSynchronizedFields();
        cKClassResult4.setRfc((-1));
        int int10 = cKClassResult4.getNumberOfProtectedFields();
        int int11 = cKClassResult4.getComparisonsQty();
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult16 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet17 = cKMethodResult16.getMethodInvocations();
        java.util.Set<java.lang.String> strSet18 = cKMethodResult16.getMethodInvocationsLocal();
        int int19 = cKMethodResult16.getWmc();
        java.util.Set<java.lang.String> strSet20 = cKMethodResult16.getMethodInvocations();
        cKClassResult4.setFieldNames(strSet20);
        int int22 = cKClassResult4.getNumberOfStaticFields();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(strSet18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        cKClassResult4.setCbo(10);
        cKClassResult4.setNumberOfProtectedFields((-1));
        cKClassResult4.setLoc((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "hi!", false, (int) (byte) 0);
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult9 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int10 = cKMethodResult9.getLambdasQty();
        java.util.Set<java.lang.String> strSet11 = cKMethodResult9.getMethodInvocations();
        cKMethodResult4.setMethodInvocations(strSet11);
        int int13 = cKMethodResult4.getVariablesQty();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        java.util.Set<java.lang.String> strSet6 = cKMethodResult4.getMethodInvocationsLocal();
        java.util.Set<java.lang.String> strSet7 = cKMethodResult4.getFieldsAccessed();
        int int8 = cKMethodResult4.getComparisonsQty();
        int int9 = cKMethodResult4.getParametersQty();
        cKMethodResult4.setFanout(0);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.ContinueStatement continueStatement9 = null;
        cKVisitor4.endVisit(continueStatement9);
        org.eclipse.jdt.core.dom.NullLiteral nullLiteral11 = null;
        cKVisitor4.endVisit(nullLiteral11);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression13 = null;
        boolean boolean14 = cKVisitor4.visit(parenthesizedExpression13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.EnumConstantDeclaration enumConstantDeclaration7 = null;
        cKVisitor4.endVisit(enumConstantDeclaration7);
        org.eclipse.jdt.core.dom.NormalAnnotation normalAnnotation9 = null;
        boolean boolean10 = cKVisitor4.visit(normalAnnotation9);
        java.util.Set<com.github.mauricioaniche.ck.CKClassResult> cKClassResultSet11 = cKVisitor4.getCollectedClasses();
        org.eclipse.jdt.core.dom.TextElement textElement12 = null;
        cKVisitor4.endVisit(textElement12);
        org.eclipse.jdt.core.dom.TryStatement tryStatement14 = null;
        cKVisitor4.endVisit(tryStatement14);
        org.eclipse.jdt.core.dom.BooleanLiteral booleanLiteral16 = null;
        boolean boolean17 = cKVisitor4.visit(booleanLiteral16);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(cKClassResultSet11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.ProvidesDirective providesDirective9 = null;
        boolean boolean10 = cKVisitor4.visit(providesDirective9);
        org.eclipse.jdt.core.dom.ThisExpression thisExpression11 = null;
        cKVisitor4.endVisit(thisExpression11);
        org.eclipse.jdt.core.dom.IntersectionType intersectionType13 = null;
        cKVisitor4.endVisit(intersectionType13);
        org.eclipse.jdt.core.dom.ArrayInitializer arrayInitializer15 = null;
        cKVisitor4.endVisit(arrayInitializer15);
        org.eclipse.jdt.core.dom.TryStatement tryStatement17 = null;
        boolean boolean18 = cKVisitor4.visit(tryStatement17);
        org.eclipse.jdt.core.dom.TypeLiteral typeLiteral19 = null;
        cKVisitor4.endVisit(typeLiteral19);
        org.eclipse.jdt.core.dom.TypeMethodReference typeMethodReference21 = null;
        cKVisitor4.endVisit(typeMethodReference21);
        org.eclipse.jdt.core.dom.MarkerAnnotation markerAnnotation23 = null;
        boolean boolean24 = cKVisitor4.visit(markerAnnotation23);
        org.eclipse.jdt.core.dom.TextElement textElement25 = null;
        boolean boolean26 = cKVisitor4.visit(textElement25);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.EnumConstantDeclaration enumConstantDeclaration7 = null;
        cKVisitor4.endVisit(enumConstantDeclaration7);
        org.eclipse.jdt.core.dom.MarkerAnnotation markerAnnotation9 = null;
        boolean boolean10 = cKVisitor4.visit(markerAnnotation9);
        org.eclipse.jdt.core.dom.SuperConstructorInvocation superConstructorInvocation11 = null;
        boolean boolean12 = cKVisitor4.visit(superConstructorInvocation11);
        org.eclipse.jdt.core.dom.ClassInstanceCreation classInstanceCreation13 = null;
        cKVisitor4.endVisit(classInstanceCreation13);
        org.eclipse.jdt.core.dom.LineComment lineComment15 = null;
        cKVisitor4.endVisit(lineComment15);
        org.eclipse.jdt.core.dom.InfixExpression infixExpression17 = null;
        boolean boolean18 = cKVisitor4.visit(infixExpression17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.NameQualifiedType nameQualifiedType7 = null;
        boolean boolean8 = cKVisitor4.visit(nameQualifiedType7);
        org.eclipse.jdt.core.dom.SimpleName simpleName9 = null;
        boolean boolean10 = cKVisitor4.visit(simpleName9);
        org.eclipse.jdt.core.dom.MethodInvocation methodInvocation11 = null;
        boolean boolean12 = cKVisitor4.visit(methodInvocation11);
        org.eclipse.jdt.core.dom.SwitchCase switchCase13 = null;
        boolean boolean14 = cKVisitor4.visit(switchCase13);
        org.eclipse.jdt.core.dom.BlockComment blockComment15 = null;
        cKVisitor4.endVisit(blockComment15);
        org.eclipse.jdt.core.dom.ModuleQualifiedName moduleQualifiedName17 = null;
        cKVisitor4.endVisit(moduleQualifiedName17);
        org.eclipse.jdt.core.dom.LambdaExpression lambdaExpression19 = null;
        cKVisitor4.endVisit(lambdaExpression19);
        org.eclipse.jdt.core.dom.ExpressionMethodReference expressionMethodReference21 = null;
        cKVisitor4.endVisit(expressionMethodReference21);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ASTNode aSTNode5 = null;
        boolean boolean6 = cKVisitor4.preVisit2(aSTNode5);
        org.eclipse.jdt.core.dom.MethodInvocation methodInvocation7 = null;
        boolean boolean8 = cKVisitor4.visit(methodInvocation7);
        org.eclipse.jdt.core.dom.EmptyStatement emptyStatement9 = null;
        cKVisitor4.endVisit(emptyStatement9);
        org.eclipse.jdt.core.dom.Modifier modifier11 = null;
        boolean boolean12 = cKVisitor4.visit(modifier11);
        org.eclipse.jdt.core.dom.TypeDeclarationStatement typeDeclarationStatement13 = null;
        boolean boolean14 = cKVisitor4.visit(typeDeclarationStatement13);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression15 = null;
        cKVisitor4.endVisit(patternInstanceofExpression15);
        org.eclipse.jdt.core.dom.FieldDeclaration fieldDeclaration17 = null;
        cKVisitor4.endVisit(fieldDeclaration17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.ExpressionStatement expressionStatement7 = null;
        cKVisitor4.endVisit(expressionStatement7);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation9 = null;
        cKVisitor4.endVisit(arrayCreation9);
        org.eclipse.jdt.core.dom.MemberRef memberRef11 = null;
        cKVisitor4.endVisit(memberRef11);
        org.eclipse.jdt.core.dom.BreakStatement breakStatement13 = null;
        cKVisitor4.endVisit(breakStatement13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.NameQualifiedType nameQualifiedType7 = null;
        boolean boolean8 = cKVisitor4.visit(nameQualifiedType7);
        org.eclipse.jdt.core.dom.MemberRef memberRef9 = null;
        boolean boolean10 = cKVisitor4.visit(memberRef9);
        org.eclipse.jdt.core.dom.ModuleDeclaration moduleDeclaration11 = null;
        cKVisitor4.endVisit(moduleDeclaration11);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.ProvidesDirective providesDirective9 = null;
        boolean boolean10 = cKVisitor4.visit(providesDirective9);
        org.eclipse.jdt.core.dom.ThisExpression thisExpression11 = null;
        cKVisitor4.endVisit(thisExpression11);
        org.eclipse.jdt.core.dom.IntersectionType intersectionType13 = null;
        cKVisitor4.endVisit(intersectionType13);
        org.eclipse.jdt.core.dom.ArrayInitializer arrayInitializer15 = null;
        cKVisitor4.endVisit(arrayInitializer15);
        org.eclipse.jdt.core.dom.TryStatement tryStatement17 = null;
        boolean boolean18 = cKVisitor4.visit(tryStatement17);
        org.eclipse.jdt.core.dom.CharacterLiteral characterLiteral19 = null;
        cKVisitor4.endVisit(characterLiteral19);
        org.eclipse.jdt.core.dom.InfixExpression infixExpression21 = null;
        cKVisitor4.endVisit(infixExpression21);
        org.eclipse.jdt.core.dom.MemberRef memberRef23 = null;
        boolean boolean24 = cKVisitor4.visit(memberRef23);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getComparisonsQty();
        java.lang.String str6 = cKMethodResult4.toString();
        int int7 = cKMethodResult4.getLoopQty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}" + "'", str6, "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression9 = null;
        cKVisitor4.endVisit(patternInstanceofExpression9);
        org.eclipse.jdt.core.dom.InstanceofExpression instanceofExpression11 = null;
        cKVisitor4.endVisit(instanceofExpression11);
        org.eclipse.jdt.core.dom.Assignment assignment13 = null;
        cKVisitor4.endVisit(assignment13);
        org.eclipse.jdt.core.dom.SimpleType simpleType15 = null;
        cKVisitor4.endVisit(simpleType15);
        org.eclipse.jdt.core.dom.FieldDeclaration fieldDeclaration17 = null;
        cKVisitor4.endVisit(fieldDeclaration17);
        org.eclipse.jdt.core.dom.ArrayAccess arrayAccess19 = null;
        boolean boolean20 = cKVisitor4.visit(arrayAccess19);
        org.eclipse.jdt.core.dom.AnnotationTypeMemberDeclaration annotationTypeMemberDeclaration21 = null;
        boolean boolean22 = cKVisitor4.visit(annotationTypeMemberDeclaration21);
        org.eclipse.jdt.core.dom.LineComment lineComment23 = null;
        boolean boolean24 = cKVisitor4.visit(lineComment23);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ASTNode aSTNode5 = null;
        boolean boolean6 = cKVisitor4.preVisit2(aSTNode5);
        org.eclipse.jdt.core.dom.SwitchStatement switchStatement7 = null;
        boolean boolean8 = cKVisitor4.visit(switchStatement7);
        org.eclipse.jdt.core.dom.AnnotationTypeDeclaration annotationTypeDeclaration9 = null;
        cKVisitor4.endVisit(annotationTypeDeclaration9);
        org.eclipse.jdt.core.dom.ExpressionMethodReference expressionMethodReference11 = null;
        boolean boolean12 = cKVisitor4.visit(expressionMethodReference11);
        org.eclipse.jdt.core.dom.NormalAnnotation normalAnnotation13 = null;
        cKVisitor4.endVisit(normalAnnotation13);
        org.eclipse.jdt.core.dom.PackageDeclaration packageDeclaration15 = null;
        cKVisitor4.endVisit(packageDeclaration15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setStringLiteralsQty((int) (byte) 1);
        java.util.Optional<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultOptional8 = cKClassResult4.getMethod("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
        cKClassResult4.setLooseClassCohesion((float) 10L);
        int int11 = cKClassResult4.getModifiers();
        int int12 = cKClassResult4.getFanout();
        org.junit.Assert.assertNotNull(cKMethodResultOptional8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        cKMethodResult4.setLoc((int) (byte) 100);
        cKMethodResult4.setTryCatchQty((int) (byte) -1);
        int int9 = cKMethodResult4.getNumbersQty();
        cKMethodResult4.setAnonymousClassesQty((int) '#');
        int int12 = cKMethodResult4.getTryCatchQty();
        int int13 = cKMethodResult4.getLogStatementsQty();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.EnumConstantDeclaration enumConstantDeclaration7 = null;
        cKVisitor4.endVisit(enumConstantDeclaration7);
        org.eclipse.jdt.core.dom.AssertStatement assertStatement9 = null;
        boolean boolean10 = cKVisitor4.visit(assertStatement9);
        org.eclipse.jdt.core.dom.SynchronizedStatement synchronizedStatement11 = null;
        cKVisitor4.endVisit(synchronizedStatement11);
        org.eclipse.jdt.core.dom.SimpleName simpleName13 = null;
        cKVisitor4.endVisit(simpleName13);
        org.eclipse.jdt.core.dom.MethodRef methodRef15 = null;
        boolean boolean16 = cKVisitor4.visit(methodRef15);
        org.eclipse.jdt.core.dom.CastExpression castExpression17 = null;
        cKVisitor4.endVisit(castExpression17);
        org.eclipse.jdt.core.dom.EmptyStatement emptyStatement19 = null;
        cKVisitor4.endVisit(emptyStatement19);
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit21 = null;
        boolean boolean22 = cKVisitor4.visit(compilationUnit21);
        java.lang.Class<?> wildcardClass23 = cKVisitor4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression9 = null;
        cKVisitor4.endVisit(patternInstanceofExpression9);
        org.eclipse.jdt.core.dom.InstanceofExpression instanceofExpression11 = null;
        cKVisitor4.endVisit(instanceofExpression11);
        org.eclipse.jdt.core.dom.InfixExpression infixExpression13 = null;
        boolean boolean14 = cKVisitor4.visit(infixExpression13);
        org.eclipse.jdt.core.dom.ArrayType arrayType15 = null;
        boolean boolean16 = cKVisitor4.visit(arrayType15);
        org.eclipse.jdt.core.dom.Initializer initializer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = cKVisitor4.visit(initializer17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression9 = null;
        cKVisitor4.endVisit(patternInstanceofExpression9);
        org.eclipse.jdt.core.dom.InstanceofExpression instanceofExpression11 = null;
        cKVisitor4.endVisit(instanceofExpression11);
        org.eclipse.jdt.core.dom.Assignment assignment13 = null;
        cKVisitor4.endVisit(assignment13);
        org.eclipse.jdt.core.dom.TypeLiteral typeLiteral15 = null;
        boolean boolean16 = cKVisitor4.visit(typeLiteral15);
        org.eclipse.jdt.core.dom.VariableDeclarationStatement variableDeclarationStatement17 = null;
        cKVisitor4.endVisit(variableDeclarationStatement17);
        org.eclipse.jdt.core.dom.BreakStatement breakStatement19 = null;
        boolean boolean20 = cKVisitor4.visit(breakStatement19);
        org.eclipse.jdt.core.dom.ModuleQualifiedName moduleQualifiedName21 = null;
        cKVisitor4.endVisit(moduleQualifiedName21);
        org.eclipse.jdt.core.dom.SynchronizedStatement synchronizedStatement23 = null;
        cKVisitor4.endVisit(synchronizedStatement23);
        org.eclipse.jdt.core.dom.PrimitiveType primitiveType25 = null;
        cKVisitor4.endVisit(primitiveType25);
        org.eclipse.jdt.core.dom.BreakStatement breakStatement27 = null;
        boolean boolean28 = cKVisitor4.visit(breakStatement27);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.EnumConstantDeclaration enumConstantDeclaration7 = null;
        cKVisitor4.endVisit(enumConstantDeclaration7);
        org.eclipse.jdt.core.dom.AssertStatement assertStatement9 = null;
        boolean boolean10 = cKVisitor4.visit(assertStatement9);
        org.eclipse.jdt.core.dom.SynchronizedStatement synchronizedStatement11 = null;
        cKVisitor4.endVisit(synchronizedStatement11);
        org.eclipse.jdt.core.dom.Modifier modifier13 = null;
        cKVisitor4.endVisit(modifier13);
        org.eclipse.jdt.core.dom.InstanceofExpression instanceofExpression15 = null;
        boolean boolean16 = cKVisitor4.visit(instanceofExpression15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getComparisonsQty();
        cKMethodResult4.setReturnQty((int) (byte) -1);
        cKMethodResult4.setAssignmentsQty(0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        cKClassResult4.setInnerClassesQty((int) (short) 100);
        cKClassResult4.setParenthesizedExpsQty((int) '4');
        cKClassResult4.setNumberOfPrivateMethods((int) '4');
        int int12 = cKClassResult4.getVariablesQty();
        cKClassResult4.setTightClassCohesion((float) (short) 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.NameQualifiedType nameQualifiedType7 = null;
        boolean boolean8 = cKVisitor4.visit(nameQualifiedType7);
        org.eclipse.jdt.core.dom.SimpleName simpleName9 = null;
        boolean boolean10 = cKVisitor4.visit(simpleName9);
        org.eclipse.jdt.core.dom.MethodInvocation methodInvocation11 = null;
        boolean boolean12 = cKVisitor4.visit(methodInvocation11);
        org.eclipse.jdt.core.dom.SwitchCase switchCase13 = null;
        boolean boolean14 = cKVisitor4.visit(switchCase13);
        org.eclipse.jdt.core.dom.BlockComment blockComment15 = null;
        cKVisitor4.endVisit(blockComment15);
        org.eclipse.jdt.core.dom.ModuleQualifiedName moduleQualifiedName17 = null;
        cKVisitor4.endVisit(moduleQualifiedName17);
        org.eclipse.jdt.core.dom.LambdaExpression lambdaExpression19 = null;
        cKVisitor4.endVisit(lambdaExpression19);
        org.eclipse.jdt.core.dom.ModuleModifier moduleModifier21 = null;
        cKVisitor4.endVisit(moduleModifier21);
        org.eclipse.jdt.core.dom.ArrayInitializer arrayInitializer23 = null;
        boolean boolean24 = cKVisitor4.visit(arrayInitializer23);
        org.eclipse.jdt.core.dom.SynchronizedStatement synchronizedStatement25 = null;
        cKVisitor4.endVisit(synchronizedStatement25);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression9 = null;
        cKVisitor4.endVisit(patternInstanceofExpression9);
        org.eclipse.jdt.core.dom.InstanceofExpression instanceofExpression11 = null;
        cKVisitor4.endVisit(instanceofExpression11);
        org.eclipse.jdt.core.dom.Assignment assignment13 = null;
        cKVisitor4.endVisit(assignment13);
        org.eclipse.jdt.core.dom.TypeLiteral typeLiteral15 = null;
        boolean boolean16 = cKVisitor4.visit(typeLiteral15);
        org.eclipse.jdt.core.dom.VariableDeclarationStatement variableDeclarationStatement17 = null;
        cKVisitor4.endVisit(variableDeclarationStatement17);
        org.eclipse.jdt.core.dom.BreakStatement breakStatement19 = null;
        boolean boolean20 = cKVisitor4.visit(breakStatement19);
        org.eclipse.jdt.core.dom.ModuleQualifiedName moduleQualifiedName21 = null;
        cKVisitor4.endVisit(moduleQualifiedName21);
        org.eclipse.jdt.core.dom.SynchronizedStatement synchronizedStatement23 = null;
        cKVisitor4.endVisit(synchronizedStatement23);
        org.eclipse.jdt.core.dom.NumberLiteral numberLiteral25 = null;
        boolean boolean26 = cKVisitor4.visit(numberLiteral25);
        org.eclipse.jdt.core.dom.SwitchCase switchCase27 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(switchCase27);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.IntersectionType intersectionType7 = null;
        boolean boolean8 = cKVisitor4.visit(intersectionType7);
        org.eclipse.jdt.core.dom.ExportsDirective exportsDirective9 = null;
        boolean boolean10 = cKVisitor4.visit(exportsDirective9);
        org.eclipse.jdt.core.dom.UnionType unionType11 = null;
        cKVisitor4.endVisit(unionType11);
        org.eclipse.jdt.core.dom.EnumConstantDeclaration enumConstantDeclaration13 = null;
        boolean boolean14 = cKVisitor4.visit(enumConstantDeclaration13);
        org.eclipse.jdt.core.dom.ThrowStatement throwStatement15 = null;
        cKVisitor4.endVisit(throwStatement15);
        org.eclipse.jdt.core.dom.FieldDeclaration fieldDeclaration17 = null;
        boolean boolean18 = cKVisitor4.visit(fieldDeclaration17);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        com.github.mauricioaniche.ck.CK cK3 = new com.github.mauricioaniche.ck.CK(true, (int) (byte) 0, false);
        java.nio.file.Path path4 = null;
        com.github.mauricioaniche.ck.CKNotifier cKNotifier5 = null;
        // The following exception was thrown during execution in test generation
        try {
            cK3.calculate(path4, cKNotifier5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getInnerClassesQty();
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "hi!", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        cKClassResult4.setFieldNames((java.util.Set<java.lang.String>) strSet12);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ASTNode aSTNode5 = null;
        boolean boolean6 = cKVisitor4.preVisit2(aSTNode5);
        org.eclipse.jdt.core.dom.SwitchStatement switchStatement7 = null;
        boolean boolean8 = cKVisitor4.visit(switchStatement7);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression9 = null;
        boolean boolean10 = cKVisitor4.visit(patternInstanceofExpression9);
        org.eclipse.jdt.core.dom.TypeDeclarationStatement typeDeclarationStatement11 = null;
        cKVisitor4.endVisit(typeDeclarationStatement11);
        org.eclipse.jdt.core.dom.TextElement textElement13 = null;
        boolean boolean14 = cKVisitor4.visit(textElement13);
        org.eclipse.jdt.core.dom.MethodRef methodRef15 = null;
        cKVisitor4.endVisit(methodRef15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.Javadoc javadoc5 = null;
        cKVisitor4.endVisit(javadoc5);
        org.eclipse.jdt.core.dom.WildcardType wildcardType7 = null;
        cKVisitor4.endVisit(wildcardType7);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "hi!", false, (int) (byte) 0);
        cKMethodResult4.setFanout(1);
        cKMethodResult4.setCbo(10);
        boolean boolean9 = cKMethodResult4.getIsVisible();
        cKMethodResult4.setLambdasQty((int) '#');
        int int12 = cKMethodResult4.getLambdasQty();
        cKMethodResult4.setUniqueWordsQty((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setStringLiteralsQty((int) (byte) 1);
        java.util.Optional<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultOptional8 = cKClassResult4.getMethod("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
        int int9 = cKClassResult4.getLoopQty();
        cKClassResult4.setNumberOfPublicFields((int) (byte) 1);
        cKClassResult4.setTightClassCohesion((float) (-1));
        org.junit.Assert.assertNotNull(cKMethodResultOptional8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.SuperMethodReference superMethodReference7 = null;
        cKVisitor4.endVisit(superMethodReference7);
        org.eclipse.jdt.core.dom.SuperFieldAccess superFieldAccess9 = null;
        cKVisitor4.endVisit(superFieldAccess9);
        org.eclipse.jdt.core.dom.ModuleDeclaration moduleDeclaration11 = null;
        boolean boolean12 = cKVisitor4.visit(moduleDeclaration11);
        org.eclipse.jdt.core.dom.ArrayInitializer arrayInitializer13 = null;
        boolean boolean14 = cKVisitor4.visit(arrayInitializer13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        com.github.mauricioaniche.ck.ResultWriter resultWriter5 = new com.github.mauricioaniche.ck.ResultWriter("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKClassResult [file=, className=CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}]", "CKClassResult [file=, className=CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}]", "CKClassResult [file=, className=CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}]", true);
        resultWriter5.flushAndClose();
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ASTNode aSTNode5 = null;
        boolean boolean6 = cKVisitor4.preVisit2(aSTNode5);
        org.eclipse.jdt.core.dom.SwitchStatement switchStatement7 = null;
        boolean boolean8 = cKVisitor4.visit(switchStatement7);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression9 = null;
        boolean boolean10 = cKVisitor4.visit(patternInstanceofExpression9);
        org.eclipse.jdt.core.dom.TypeDeclarationStatement typeDeclarationStatement11 = null;
        cKVisitor4.endVisit(typeDeclarationStatement11);
        org.eclipse.jdt.core.dom.CharacterLiteral characterLiteral13 = null;
        boolean boolean14 = cKVisitor4.visit(characterLiteral13);
        org.eclipse.jdt.core.dom.LabeledStatement labeledStatement15 = null;
        cKVisitor4.endVisit(labeledStatement15);
        org.eclipse.jdt.core.dom.ExportsDirective exportsDirective17 = null;
        cKVisitor4.endVisit(exportsDirective17);
        org.eclipse.jdt.core.dom.EnumConstantDeclaration enumConstantDeclaration19 = null;
        cKVisitor4.endVisit(enumConstantDeclaration19);
        org.eclipse.jdt.core.dom.PrefixExpression prefixExpression21 = null;
        cKVisitor4.endVisit(prefixExpression21);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        float float5 = cKClassResult4.getTightClassCohesion();
        int int6 = cKClassResult4.getFanout();
        int int7 = cKClassResult4.getNumberOfProtectedMethods();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getLcom();
        int int8 = cKClassResult4.getNumberOfFields();
        int int9 = cKClassResult4.getVariablesQty();
        int int10 = cKClassResult4.getNoc();
        int int11 = cKClassResult4.getLcom();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getInnerClassesQty();
        cKClassResult4.setLogStatementsQty(0);
        cKClassResult4.setNumbersQty((int) '4');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.SuperMethodReference superMethodReference7 = null;
        cKVisitor4.endVisit(superMethodReference7);
        org.eclipse.jdt.core.dom.SuperFieldAccess superFieldAccess9 = null;
        cKVisitor4.endVisit(superFieldAccess9);
        org.eclipse.jdt.core.dom.QualifiedName qualifiedName11 = null;
        boolean boolean12 = cKVisitor4.visit(qualifiedName11);
        org.eclipse.jdt.core.dom.SimpleType simpleType13 = null;
        cKVisitor4.endVisit(simpleType13);
        org.eclipse.jdt.core.dom.UnionType unionType15 = null;
        cKVisitor4.endVisit(unionType15);
        org.eclipse.jdt.core.dom.UnionType unionType17 = null;
        boolean boolean18 = cKVisitor4.visit(unionType17);
        org.eclipse.jdt.core.dom.RequiresDirective requiresDirective19 = null;
        boolean boolean20 = cKVisitor4.visit(requiresDirective19);
        org.eclipse.jdt.core.dom.MarkerAnnotation markerAnnotation21 = null;
        cKVisitor4.endVisit(markerAnnotation21);
        org.eclipse.jdt.core.dom.TagElement tagElement23 = null;
        cKVisitor4.endVisit(tagElement23);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation25 = null;
        cKVisitor4.endVisit(arrayCreation25);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ASTNode aSTNode5 = null;
        boolean boolean6 = cKVisitor4.preVisit2(aSTNode5);
        org.eclipse.jdt.core.dom.SwitchStatement switchStatement7 = null;
        boolean boolean8 = cKVisitor4.visit(switchStatement7);
        org.eclipse.jdt.core.dom.MarkerAnnotation markerAnnotation9 = null;
        boolean boolean10 = cKVisitor4.visit(markerAnnotation9);
        org.eclipse.jdt.core.dom.SwitchExpression switchExpression11 = null;
        boolean boolean12 = cKVisitor4.visit(switchExpression11);
        org.eclipse.jdt.core.dom.SuperFieldAccess superFieldAccess13 = null;
        boolean boolean14 = cKVisitor4.visit(superFieldAccess13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "hi!", false, (int) (byte) 0);
        cKMethodResult4.setFanout(1);
        cKMethodResult4.setCbo(10);
        cKMethodResult4.setLoc((int) (byte) -1);
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult15 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int16 = cKMethodResult15.getLambdasQty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = null;
        cKMethodResult15.setVariablesUsage(strMap17);
        java.lang.String str19 = cKMethodResult15.getMethodName();
        boolean boolean20 = cKMethodResult15.getIsVisible();
        int int21 = cKMethodResult15.getLogStatementsQty();
        boolean boolean22 = cKMethodResult4.equals((java.lang.Object) cKMethodResult15);
        int int23 = cKMethodResult4.getInnerClassesQty();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression9 = null;
        cKVisitor4.endVisit(patternInstanceofExpression9);
        org.eclipse.jdt.core.dom.InstanceofExpression instanceofExpression11 = null;
        cKVisitor4.endVisit(instanceofExpression11);
        org.eclipse.jdt.core.dom.Assignment assignment13 = null;
        cKVisitor4.endVisit(assignment13);
        org.eclipse.jdt.core.dom.SimpleType simpleType15 = null;
        cKVisitor4.endVisit(simpleType15);
        org.eclipse.jdt.core.dom.FieldDeclaration fieldDeclaration17 = null;
        cKVisitor4.endVisit(fieldDeclaration17);
        org.eclipse.jdt.core.dom.ArrayAccess arrayAccess19 = null;
        boolean boolean20 = cKVisitor4.visit(arrayAccess19);
        org.eclipse.jdt.core.dom.LambdaExpression lambdaExpression21 = null;
        boolean boolean22 = cKVisitor4.visit(lambdaExpression21);
        org.eclipse.jdt.core.dom.VariableDeclarationStatement variableDeclarationStatement23 = null;
        cKVisitor4.endVisit(variableDeclarationStatement23);
        org.eclipse.jdt.core.dom.SuperConstructorInvocation superConstructorInvocation25 = null;
        cKVisitor4.endVisit(superConstructorInvocation25);
        org.eclipse.jdt.core.dom.BreakStatement breakStatement27 = null;
        cKVisitor4.endVisit(breakStatement27);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.NameQualifiedType nameQualifiedType7 = null;
        boolean boolean8 = cKVisitor4.visit(nameQualifiedType7);
        org.eclipse.jdt.core.dom.SimpleName simpleName9 = null;
        boolean boolean10 = cKVisitor4.visit(simpleName9);
        org.eclipse.jdt.core.dom.MethodInvocation methodInvocation11 = null;
        boolean boolean12 = cKVisitor4.visit(methodInvocation11);
        org.eclipse.jdt.core.dom.SwitchCase switchCase13 = null;
        boolean boolean14 = cKVisitor4.visit(switchCase13);
        org.eclipse.jdt.core.dom.BlockComment blockComment15 = null;
        cKVisitor4.endVisit(blockComment15);
        org.eclipse.jdt.core.dom.WildcardType wildcardType17 = null;
        boolean boolean18 = cKVisitor4.visit(wildcardType17);
        org.eclipse.jdt.core.dom.ForStatement forStatement19 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(forStatement19);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getMaxNestedBlocks();
        cKClassResult4.setNosi(100);
        int int8 = cKClassResult4.getMaxNestedBlocks();
        cKClassResult4.setCboModified(10);
        int int11 = cKClassResult4.getNumberOfSynchronizedFields();
        cKClassResult4.setNumberOfPrivateFields(35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.NameQualifiedType nameQualifiedType7 = null;
        boolean boolean8 = cKVisitor4.visit(nameQualifiedType7);
        org.eclipse.jdt.core.dom.SimpleName simpleName9 = null;
        boolean boolean10 = cKVisitor4.visit(simpleName9);
        org.eclipse.jdt.core.dom.MethodInvocation methodInvocation11 = null;
        boolean boolean12 = cKVisitor4.visit(methodInvocation11);
        org.eclipse.jdt.core.dom.SwitchCase switchCase13 = null;
        boolean boolean14 = cKVisitor4.visit(switchCase13);
        org.eclipse.jdt.core.dom.BlockComment blockComment15 = null;
        cKVisitor4.endVisit(blockComment15);
        org.eclipse.jdt.core.dom.ASTNode aSTNode17 = null;
        boolean boolean18 = cKVisitor4.preVisit2(aSTNode17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        cKClassResult4.setInnerClassesQty((int) (short) 100);
        cKClassResult4.setParenthesizedExpsQty((int) '4');
        cKClassResult4.setNumberOfPrivateMethods((int) '4');
        int int12 = cKClassResult4.getModifiers();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.NameQualifiedType nameQualifiedType7 = null;
        boolean boolean8 = cKVisitor4.visit(nameQualifiedType7);
        org.eclipse.jdt.core.dom.MarkerAnnotation markerAnnotation9 = null;
        cKVisitor4.endVisit(markerAnnotation9);
        org.eclipse.jdt.core.dom.ArrayAccess arrayAccess11 = null;
        cKVisitor4.endVisit(arrayAccess11);
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit13 = null;
        boolean boolean14 = cKVisitor4.visit(compilationUnit13);
        org.eclipse.jdt.core.dom.ContinueStatement continueStatement15 = null;
        cKVisitor4.endVisit(continueStatement15);
        org.eclipse.jdt.core.dom.OpensDirective opensDirective17 = null;
        boolean boolean18 = cKVisitor4.visit(opensDirective17);
        org.eclipse.jdt.core.dom.ExportsDirective exportsDirective19 = null;
        boolean boolean20 = cKVisitor4.visit(exportsDirective19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setStringLiteralsQty((int) (byte) 1);
        java.util.Optional<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultOptional8 = cKClassResult4.getMethod("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
        cKClassResult4.setReturnQty((int) '4');
        int int11 = cKClassResult4.getNumberOfLogStatements();
        org.junit.Assert.assertNotNull(cKMethodResultOptional8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ASTNode aSTNode5 = null;
        boolean boolean6 = cKVisitor4.preVisit2(aSTNode5);
        org.eclipse.jdt.core.dom.MethodInvocation methodInvocation7 = null;
        boolean boolean8 = cKVisitor4.visit(methodInvocation7);
        org.eclipse.jdt.core.dom.EmptyStatement emptyStatement9 = null;
        cKVisitor4.endVisit(emptyStatement9);
        org.eclipse.jdt.core.dom.Modifier modifier11 = null;
        boolean boolean12 = cKVisitor4.visit(modifier11);
        org.eclipse.jdt.core.dom.ContinueStatement continueStatement13 = null;
        cKVisitor4.endVisit(continueStatement13);
        org.eclipse.jdt.core.dom.ArrayAccess arrayAccess15 = null;
        boolean boolean16 = cKVisitor4.visit(arrayAccess15);
        org.eclipse.jdt.core.dom.SingleMemberAnnotation singleMemberAnnotation17 = null;
        boolean boolean18 = cKVisitor4.visit(singleMemberAnnotation17);
        org.eclipse.jdt.core.dom.EnumDeclaration enumDeclaration19 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(enumDeclaration19);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression9 = null;
        cKVisitor4.endVisit(patternInstanceofExpression9);
        org.eclipse.jdt.core.dom.InstanceofExpression instanceofExpression11 = null;
        cKVisitor4.endVisit(instanceofExpression11);
        org.eclipse.jdt.core.dom.SuperFieldAccess superFieldAccess13 = null;
        boolean boolean14 = cKVisitor4.visit(superFieldAccess13);
        org.eclipse.jdt.core.dom.QualifiedName qualifiedName15 = null;
        boolean boolean16 = cKVisitor4.visit(qualifiedName15);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.EnumConstantDeclaration enumConstantDeclaration7 = null;
        cKVisitor4.endVisit(enumConstantDeclaration7);
        org.eclipse.jdt.core.dom.AssertStatement assertStatement9 = null;
        boolean boolean10 = cKVisitor4.visit(assertStatement9);
        org.eclipse.jdt.core.dom.SynchronizedStatement synchronizedStatement11 = null;
        cKVisitor4.endVisit(synchronizedStatement11);
        org.eclipse.jdt.core.dom.SimpleName simpleName13 = null;
        cKVisitor4.endVisit(simpleName13);
        org.eclipse.jdt.core.dom.WildcardType wildcardType15 = null;
        cKVisitor4.endVisit(wildcardType15);
        org.eclipse.jdt.core.dom.SwitchStatement switchStatement17 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(switchStatement17);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getUniqueWordsQty();
        cKMethodResult4.setUniqueWordsQty((int) (byte) 10);
        int int8 = cKMethodResult4.getLogStatementsQty();
        int int9 = cKMethodResult4.getCbo();
        cKMethodResult4.setParenthesizedExpsQty((int) (short) 100);
        int int12 = cKMethodResult4.getFanout();
        int int13 = cKMethodResult4.getStartLine();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.NameQualifiedType nameQualifiedType7 = null;
        boolean boolean8 = cKVisitor4.visit(nameQualifiedType7);
        org.eclipse.jdt.core.dom.SimpleName simpleName9 = null;
        boolean boolean10 = cKVisitor4.visit(simpleName9);
        org.eclipse.jdt.core.dom.InstanceofExpression instanceofExpression11 = null;
        cKVisitor4.endVisit(instanceofExpression11);
        org.eclipse.jdt.core.dom.SingleVariableDeclaration singleVariableDeclaration13 = null;
        boolean boolean14 = cKVisitor4.visit(singleVariableDeclaration13);
        org.eclipse.jdt.core.dom.AnonymousClassDeclaration anonymousClassDeclaration15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = cKVisitor4.visit(anonymousClassDeclaration15);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.MarkerAnnotation markerAnnotation9 = null;
        boolean boolean10 = cKVisitor4.visit(markerAnnotation9);
        org.eclipse.jdt.core.dom.SimpleName simpleName11 = null;
        boolean boolean12 = cKVisitor4.visit(simpleName11);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.ContinueStatement continueStatement9 = null;
        cKVisitor4.endVisit(continueStatement9);
        org.eclipse.jdt.core.dom.SingleVariableDeclaration singleVariableDeclaration11 = null;
        boolean boolean12 = cKVisitor4.visit(singleVariableDeclaration11);
        org.eclipse.jdt.core.dom.MethodInvocation methodInvocation13 = null;
        cKVisitor4.endVisit(methodInvocation13);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression9 = null;
        cKVisitor4.endVisit(patternInstanceofExpression9);
        org.eclipse.jdt.core.dom.InstanceofExpression instanceofExpression11 = null;
        cKVisitor4.endVisit(instanceofExpression11);
        org.eclipse.jdt.core.dom.Assignment assignment13 = null;
        cKVisitor4.endVisit(assignment13);
        org.eclipse.jdt.core.dom.SimpleType simpleType15 = null;
        cKVisitor4.endVisit(simpleType15);
        org.eclipse.jdt.core.dom.TypeMethodReference typeMethodReference17 = null;
        boolean boolean18 = cKVisitor4.visit(typeMethodReference17);
        org.eclipse.jdt.core.dom.ConstructorInvocation constructorInvocation19 = null;
        cKVisitor4.endVisit(constructorInvocation19);
        org.eclipse.jdt.core.dom.ClassInstanceCreation classInstanceCreation21 = null;
        boolean boolean22 = cKVisitor4.visit(classInstanceCreation21);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.EnumConstantDeclaration enumConstantDeclaration7 = null;
        cKVisitor4.endVisit(enumConstantDeclaration7);
        org.eclipse.jdt.core.dom.NormalAnnotation normalAnnotation9 = null;
        cKVisitor4.endVisit(normalAnnotation9);
        org.eclipse.jdt.core.dom.YieldStatement yieldStatement11 = null;
        cKVisitor4.endVisit(yieldStatement11);
        org.eclipse.jdt.core.dom.DoStatement doStatement13 = null;
        boolean boolean14 = cKVisitor4.visit(doStatement13);
        org.eclipse.jdt.core.dom.FieldDeclaration fieldDeclaration15 = null;
        cKVisitor4.endVisit(fieldDeclaration15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.IntersectionType intersectionType7 = null;
        boolean boolean8 = cKVisitor4.visit(intersectionType7);
        org.eclipse.jdt.core.dom.ExportsDirective exportsDirective9 = null;
        boolean boolean10 = cKVisitor4.visit(exportsDirective9);
        org.eclipse.jdt.core.dom.UnionType unionType11 = null;
        cKVisitor4.endVisit(unionType11);
        org.eclipse.jdt.core.dom.EnumConstantDeclaration enumConstantDeclaration13 = null;
        boolean boolean14 = cKVisitor4.visit(enumConstantDeclaration13);
        org.eclipse.jdt.core.dom.AssertStatement assertStatement15 = null;
        cKVisitor4.endVisit(assertStatement15);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ASTNode aSTNode5 = null;
        boolean boolean6 = cKVisitor4.preVisit2(aSTNode5);
        org.eclipse.jdt.core.dom.MethodInvocation methodInvocation7 = null;
        boolean boolean8 = cKVisitor4.visit(methodInvocation7);
        org.eclipse.jdt.core.dom.EmptyStatement emptyStatement9 = null;
        cKVisitor4.endVisit(emptyStatement9);
        org.eclipse.jdt.core.dom.Modifier modifier11 = null;
        boolean boolean12 = cKVisitor4.visit(modifier11);
        org.eclipse.jdt.core.dom.ContinueStatement continueStatement13 = null;
        cKVisitor4.endVisit(continueStatement13);
        org.eclipse.jdt.core.dom.ArrayAccess arrayAccess15 = null;
        boolean boolean16 = cKVisitor4.visit(arrayAccess15);
        org.eclipse.jdt.core.dom.SingleMemberAnnotation singleMemberAnnotation17 = null;
        boolean boolean18 = cKVisitor4.visit(singleMemberAnnotation17);
        org.eclipse.jdt.core.dom.ArrayAccess arrayAccess19 = null;
        boolean boolean20 = cKVisitor4.visit(arrayAccess19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.NameQualifiedType nameQualifiedType7 = null;
        boolean boolean8 = cKVisitor4.visit(nameQualifiedType7);
        org.eclipse.jdt.core.dom.SimpleName simpleName9 = null;
        boolean boolean10 = cKVisitor4.visit(simpleName9);
        org.eclipse.jdt.core.dom.MethodInvocation methodInvocation11 = null;
        boolean boolean12 = cKVisitor4.visit(methodInvocation11);
        org.eclipse.jdt.core.dom.SwitchCase switchCase13 = null;
        boolean boolean14 = cKVisitor4.visit(switchCase13);
        org.eclipse.jdt.core.dom.BlockComment blockComment15 = null;
        cKVisitor4.endVisit(blockComment15);
        org.eclipse.jdt.core.dom.ModuleQualifiedName moduleQualifiedName17 = null;
        cKVisitor4.endVisit(moduleQualifiedName17);
        org.eclipse.jdt.core.dom.LambdaExpression lambdaExpression19 = null;
        cKVisitor4.endVisit(lambdaExpression19);
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit21 = null;
        cKVisitor4.endVisit(compilationUnit21);
        org.eclipse.jdt.core.dom.ParameterizedType parameterizedType23 = null;
        boolean boolean24 = cKVisitor4.visit(parameterizedType23);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setStringLiteralsQty((int) (byte) 1);
        java.util.Optional<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultOptional8 = cKClassResult4.getMethod("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
        cKClassResult4.setReturnQty((int) '4');
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult15 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet16 = cKMethodResult15.getMethodInvocations();
        java.util.Set<java.lang.String> strSet17 = cKMethodResult15.getFieldsAccessed();
        java.util.Set<java.lang.String> strSet18 = cKMethodResult15.getMethodInvocations();
        cKClassResult4.setFieldNames(strSet18);
        int int20 = cKClassResult4.getLoc();
        org.junit.Assert.assertNotNull(cKMethodResultOptional8);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.IntersectionType intersectionType7 = null;
        boolean boolean8 = cKVisitor4.visit(intersectionType7);
        org.eclipse.jdt.core.dom.ThrowStatement throwStatement9 = null;
        boolean boolean10 = cKVisitor4.visit(throwStatement9);
        org.eclipse.jdt.core.dom.Initializer initializer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = cKVisitor4.visit(initializer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.UsesDirective usesDirective7 = null;
        boolean boolean8 = cKVisitor4.visit(usesDirective7);
        org.eclipse.jdt.core.dom.VariableDeclarationExpression variableDeclarationExpression9 = null;
        boolean boolean10 = cKVisitor4.visit(variableDeclarationExpression9);
        org.eclipse.jdt.core.dom.IntersectionType intersectionType11 = null;
        cKVisitor4.endVisit(intersectionType11);
        org.eclipse.jdt.core.dom.PrimitiveType primitiveType13 = null;
        cKVisitor4.endVisit(primitiveType13);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.UsesDirective usesDirective7 = null;
        boolean boolean8 = cKVisitor4.visit(usesDirective7);
        org.eclipse.jdt.core.dom.VariableDeclarationExpression variableDeclarationExpression9 = null;
        boolean boolean10 = cKVisitor4.visit(variableDeclarationExpression9);
        org.eclipse.jdt.core.dom.IntersectionType intersectionType11 = null;
        cKVisitor4.endVisit(intersectionType11);
        org.eclipse.jdt.core.dom.SuperMethodReference superMethodReference13 = null;
        cKVisitor4.endVisit(superMethodReference13);
        org.eclipse.jdt.core.dom.MemberRef memberRef15 = null;
        cKVisitor4.endVisit(memberRef15);
        org.eclipse.jdt.core.dom.Initializer initializer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(initializer17);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        cKMethodResult4.setLoc((int) (byte) 100);
        cKMethodResult4.setTryCatchQty((int) (byte) -1);
        int int9 = cKMethodResult4.getNumbersQty();
        cKMethodResult4.setAnonymousClassesQty((int) '#');
        int int12 = cKMethodResult4.getTryCatchQty();
        int int13 = cKMethodResult4.getNumbersQty();
        int int14 = cKMethodResult4.getLogStatementsQty();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getFanout();
        cKClassResult4.setNumberOfPublicMethods((int) (short) -1);
        cKClassResult4.setLoc((int) '4');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.RecordDeclaration recordDeclaration7 = null;
        boolean boolean8 = cKVisitor4.visit(recordDeclaration7);
        org.eclipse.jdt.core.dom.ASTNode aSTNode9 = null;
        cKVisitor4.preVisit(aSTNode9);
        org.eclipse.jdt.core.dom.AnnotationTypeDeclaration annotationTypeDeclaration11 = null;
        cKVisitor4.endVisit(annotationTypeDeclaration11);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression13 = null;
        cKVisitor4.endVisit(patternInstanceofExpression13);
        org.eclipse.jdt.core.dom.ArrayType arrayType15 = null;
        cKVisitor4.endVisit(arrayType15);
        org.eclipse.jdt.core.dom.ThisExpression thisExpression17 = null;
        cKVisitor4.endVisit(thisExpression17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ASTNode aSTNode5 = null;
        boolean boolean6 = cKVisitor4.preVisit2(aSTNode5);
        org.eclipse.jdt.core.dom.SwitchStatement switchStatement7 = null;
        boolean boolean8 = cKVisitor4.visit(switchStatement7);
        org.eclipse.jdt.core.dom.MarkerAnnotation markerAnnotation9 = null;
        boolean boolean10 = cKVisitor4.visit(markerAnnotation9);
        org.eclipse.jdt.core.dom.CreationReference creationReference11 = null;
        boolean boolean12 = cKVisitor4.visit(creationReference11);
        org.eclipse.jdt.core.dom.BreakStatement breakStatement13 = null;
        cKVisitor4.endVisit(breakStatement13);
        org.eclipse.jdt.core.dom.NullLiteral nullLiteral15 = null;
        cKVisitor4.endVisit(nullLiteral15);
        org.eclipse.jdt.core.dom.VariableDeclarationStatement variableDeclarationStatement17 = null;
        boolean boolean18 = cKVisitor4.visit(variableDeclarationStatement17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression9 = null;
        cKVisitor4.endVisit(patternInstanceofExpression9);
        org.eclipse.jdt.core.dom.InstanceofExpression instanceofExpression11 = null;
        cKVisitor4.endVisit(instanceofExpression11);
        org.eclipse.jdt.core.dom.Assignment assignment13 = null;
        cKVisitor4.endVisit(assignment13);
        org.eclipse.jdt.core.dom.SimpleType simpleType15 = null;
        cKVisitor4.endVisit(simpleType15);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression17 = null;
        cKVisitor4.endVisit(patternInstanceofExpression17);
        org.eclipse.jdt.core.dom.UsesDirective usesDirective19 = null;
        boolean boolean20 = cKVisitor4.visit(usesDirective19);
        org.eclipse.jdt.core.dom.NumberLiteral numberLiteral21 = null;
        boolean boolean22 = cKVisitor4.visit(numberLiteral21);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "hi!", false, (int) (byte) 0);
        cKMethodResult4.setFanout(1);
        cKMethodResult4.setCbo(10);
        int int9 = cKMethodResult4.getAnonymousClassesQty();
        cKMethodResult4.setTryCatchQty((int) (short) 100);
        java.lang.String str12 = cKMethodResult4.getQualifiedMethodName();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getLcom();
        cKClassResult4.setLcom((int) '#');
        int int10 = cKClassResult4.getNumberOfPublicFields();
        cKClassResult4.setNumberOfFinalFields(35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.IntersectionType intersectionType7 = null;
        boolean boolean8 = cKVisitor4.visit(intersectionType7);
        org.eclipse.jdt.core.dom.ExportsDirective exportsDirective9 = null;
        boolean boolean10 = cKVisitor4.visit(exportsDirective9);
        org.eclipse.jdt.core.dom.UnionType unionType11 = null;
        cKVisitor4.endVisit(unionType11);
        org.eclipse.jdt.core.dom.ASTNode aSTNode13 = null;
        boolean boolean14 = cKVisitor4.preVisit2(aSTNode13);
        org.eclipse.jdt.core.dom.SingleMemberAnnotation singleMemberAnnotation15 = null;
        boolean boolean16 = cKVisitor4.visit(singleMemberAnnotation15);
        org.eclipse.jdt.core.dom.ThrowStatement throwStatement17 = null;
        cKVisitor4.endVisit(throwStatement17);
        org.eclipse.jdt.core.dom.ForStatement forStatement19 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(forStatement19);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression9 = null;
        cKVisitor4.endVisit(patternInstanceofExpression9);
        org.eclipse.jdt.core.dom.VariableDeclarationFragment variableDeclarationFragment11 = null;
        cKVisitor4.endVisit(variableDeclarationFragment11);
        org.eclipse.jdt.core.dom.TypeDeclarationStatement typeDeclarationStatement13 = null;
        boolean boolean14 = cKVisitor4.visit(typeDeclarationStatement13);
        org.eclipse.jdt.core.dom.TextElement textElement15 = null;
        cKVisitor4.endVisit(textElement15);
        org.eclipse.jdt.core.dom.Block block17 = null;
        boolean boolean18 = cKVisitor4.visit(block17);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        java.util.Set<java.lang.String> strSet6 = cKMethodResult4.getFieldsAccessed();
        java.util.Set<java.lang.String> strSet7 = cKMethodResult4.getMethodInvocations();
        int int8 = cKMethodResult4.getWmc();
        cKMethodResult4.setAnonymousClassesQty((int) '4');
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.EnumConstantDeclaration enumConstantDeclaration7 = null;
        cKVisitor4.endVisit(enumConstantDeclaration7);
        org.eclipse.jdt.core.dom.MarkerAnnotation markerAnnotation9 = null;
        boolean boolean10 = cKVisitor4.visit(markerAnnotation9);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression11 = null;
        cKVisitor4.endVisit(patternInstanceofExpression11);
        org.eclipse.jdt.core.dom.ThisExpression thisExpression13 = null;
        cKVisitor4.endVisit(thisExpression13);
        org.eclipse.jdt.core.dom.TextBlock textBlock15 = null;
        cKVisitor4.endVisit(textBlock15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.EnumConstantDeclaration enumConstantDeclaration7 = null;
        cKVisitor4.endVisit(enumConstantDeclaration7);
        org.eclipse.jdt.core.dom.AssertStatement assertStatement9 = null;
        boolean boolean10 = cKVisitor4.visit(assertStatement9);
        org.eclipse.jdt.core.dom.CreationReference creationReference11 = null;
        cKVisitor4.endVisit(creationReference11);
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit13 = null;
        boolean boolean14 = cKVisitor4.visit(compilationUnit13);
        org.eclipse.jdt.core.dom.Initializer initializer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(initializer15);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.EnumConstantDeclaration enumConstantDeclaration7 = null;
        cKVisitor4.endVisit(enumConstantDeclaration7);
        org.eclipse.jdt.core.dom.NormalAnnotation normalAnnotation9 = null;
        boolean boolean10 = cKVisitor4.visit(normalAnnotation9);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression11 = null;
        cKVisitor4.endVisit(patternInstanceofExpression11);
        org.eclipse.jdt.core.dom.BreakStatement breakStatement13 = null;
        boolean boolean14 = cKVisitor4.visit(breakStatement13);
        org.eclipse.jdt.core.dom.BreakStatement breakStatement15 = null;
        cKVisitor4.endVisit(breakStatement15);
        org.eclipse.jdt.core.dom.EmptyStatement emptyStatement17 = null;
        boolean boolean18 = cKVisitor4.visit(emptyStatement17);
        org.eclipse.jdt.core.dom.BooleanLiteral booleanLiteral19 = null;
        boolean boolean20 = cKVisitor4.visit(booleanLiteral19);
        org.eclipse.jdt.core.dom.VariableDeclarationStatement variableDeclarationStatement21 = null;
        cKVisitor4.endVisit(variableDeclarationStatement21);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getLcom();
        cKClassResult4.setLcom((int) '#');
        int int10 = cKClassResult4.getNumberOfPublicFields();
        cKClassResult4.setNumberOfProtectedFields((int) (short) 10);
        int int13 = cKClassResult4.getRfc();
        int int14 = cKClassResult4.getNumberOfPublicMethods();
        float float15 = cKClassResult4.getTightClassCohesion();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ASTNode aSTNode5 = null;
        boolean boolean6 = cKVisitor4.preVisit2(aSTNode5);
        org.eclipse.jdt.core.dom.SwitchStatement switchStatement7 = null;
        boolean boolean8 = cKVisitor4.visit(switchStatement7);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression9 = null;
        boolean boolean10 = cKVisitor4.visit(patternInstanceofExpression9);
        org.eclipse.jdt.core.dom.TypeDeclarationStatement typeDeclarationStatement11 = null;
        cKVisitor4.endVisit(typeDeclarationStatement11);
        org.eclipse.jdt.core.dom.CharacterLiteral characterLiteral13 = null;
        boolean boolean14 = cKVisitor4.visit(characterLiteral13);
        org.eclipse.jdt.core.dom.LabeledStatement labeledStatement15 = null;
        cKVisitor4.endVisit(labeledStatement15);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression17 = null;
        cKVisitor4.endVisit(patternInstanceofExpression17);
        org.eclipse.jdt.core.dom.InstanceofExpression instanceofExpression19 = null;
        cKVisitor4.endVisit(instanceofExpression19);
        org.eclipse.jdt.core.dom.ArrayAccess arrayAccess21 = null;
        cKVisitor4.endVisit(arrayAccess21);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getComparisonsQty();
        cKMethodResult4.setReturnQty((int) (byte) -1);
        cKMethodResult4.setCboModified((int) (byte) 100);
        int int10 = cKMethodResult4.getFanout();
        int int11 = cKMethodResult4.getTryCatchQty();
        int int12 = cKMethodResult4.getLambdasQty();
        java.util.Map<java.lang.String, java.util.Set<java.lang.String>> strMap13 = cKMethodResult4.getMethodInvocationsIndirectLocal();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(strMap13);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ASTNode aSTNode5 = null;
        boolean boolean6 = cKVisitor4.preVisit2(aSTNode5);
        org.eclipse.jdt.core.dom.SwitchStatement switchStatement7 = null;
        boolean boolean8 = cKVisitor4.visit(switchStatement7);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression9 = null;
        boolean boolean10 = cKVisitor4.visit(patternInstanceofExpression9);
        org.eclipse.jdt.core.dom.TypeDeclarationStatement typeDeclarationStatement11 = null;
        cKVisitor4.endVisit(typeDeclarationStatement11);
        org.eclipse.jdt.core.dom.SuperMethodReference superMethodReference13 = null;
        cKVisitor4.endVisit(superMethodReference13);
        org.eclipse.jdt.core.dom.ModuleQualifiedName moduleQualifiedName15 = null;
        boolean boolean16 = cKVisitor4.visit(moduleQualifiedName15);
        org.eclipse.jdt.core.dom.QualifiedName qualifiedName17 = null;
        cKVisitor4.endVisit(qualifiedName17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.ContinueStatement continueStatement9 = null;
        cKVisitor4.endVisit(continueStatement9);
        org.eclipse.jdt.core.dom.PrimitiveType primitiveType11 = null;
        cKVisitor4.endVisit(primitiveType11);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        cKClassResult4.setRfc(0);
        cKClassResult4.setNumberOfDefaultFields(0);
        java.lang.String str10 = cKClassResult4.getClassName();
        int int11 = cKClassResult4.getModifiers();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}" + "'", str10, "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getLcom();
        cKClassResult4.setLcom((int) '#');
        int int10 = cKClassResult4.getNumberOfPublicFields();
        cKClassResult4.setNumberOfProtectedFields((int) (short) 10);
        int int13 = cKClassResult4.getReturnQty();
        cKClassResult4.setNumberOfFinalFields(1);
        java.util.Set<java.lang.String> strSet16 = null;
        cKClassResult4.setFieldNames(strSet16);
        int int18 = cKClassResult4.getLoopQty();
        int int19 = cKClassResult4.getNumberOfProtectedFields();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        cKMethodResult4.setLoc((int) (byte) 100);
        cKMethodResult4.setTryCatchQty((int) (byte) -1);
        int int9 = cKMethodResult4.getWmc();
        int int10 = cKMethodResult4.getVariablesQty();
        java.lang.String str11 = cKMethodResult4.getQualifiedMethodName();
        cKMethodResult4.setHasJavadoc(true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ASTNode aSTNode5 = null;
        boolean boolean6 = cKVisitor4.preVisit2(aSTNode5);
        org.eclipse.jdt.core.dom.MethodInvocation methodInvocation7 = null;
        boolean boolean8 = cKVisitor4.visit(methodInvocation7);
        org.eclipse.jdt.core.dom.EmptyStatement emptyStatement9 = null;
        cKVisitor4.endVisit(emptyStatement9);
        org.eclipse.jdt.core.dom.SingleVariableDeclaration singleVariableDeclaration11 = null;
        boolean boolean12 = cKVisitor4.visit(singleVariableDeclaration11);
        org.eclipse.jdt.core.dom.ContinueStatement continueStatement13 = null;
        boolean boolean14 = cKVisitor4.visit(continueStatement13);
        org.eclipse.jdt.core.dom.RequiresDirective requiresDirective15 = null;
        boolean boolean16 = cKVisitor4.visit(requiresDirective15);
        org.eclipse.jdt.core.dom.VariableDeclarationFragment variableDeclarationFragment17 = null;
        cKVisitor4.endVisit(variableDeclarationFragment17);
        org.eclipse.jdt.core.dom.IfStatement ifStatement19 = null;
        boolean boolean20 = cKVisitor4.visit(ifStatement19);
        org.eclipse.jdt.core.dom.SwitchCase switchCase21 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(switchCase21);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getInnerClassesQty();
        cKClassResult4.setLogStatementsQty(0);
        int int8 = cKClassResult4.getAssignmentsQty();
        cKClassResult4.setTightClassCohesion((float) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getLcom();
        cKClassResult4.setLcom((int) '#');
        int int10 = cKClassResult4.getNumberOfPublicFields();
        cKClassResult4.setNumberOfProtectedFields((int) (short) 10);
        cKClassResult4.setNumberOfAbstractMethods(100);
        cKClassResult4.setFanin(100);
        int int17 = cKClassResult4.getAssignmentsQty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.ProvidesDirective providesDirective9 = null;
        boolean boolean10 = cKVisitor4.visit(providesDirective9);
        org.eclipse.jdt.core.dom.ThisExpression thisExpression11 = null;
        cKVisitor4.endVisit(thisExpression11);
        org.eclipse.jdt.core.dom.ContinueStatement continueStatement13 = null;
        boolean boolean14 = cKVisitor4.visit(continueStatement13);
        org.eclipse.jdt.core.dom.ProvidesDirective providesDirective15 = null;
        cKVisitor4.endVisit(providesDirective15);
        org.eclipse.jdt.core.dom.SimpleName simpleName17 = null;
        cKVisitor4.endVisit(simpleName17);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        java.util.Set<java.lang.String> strSet6 = cKMethodResult4.getMethodInvocationsLocal();
        java.util.Set<java.lang.String> strSet7 = cKMethodResult4.getFieldsAccessed();
        java.lang.String str8 = cKMethodResult4.getQualifiedMethodName();
        int int9 = cKMethodResult4.getParametersQty();
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.LambdaExpression lambdaExpression5 = null;
        cKVisitor4.endVisit(lambdaExpression5);
        org.eclipse.jdt.core.dom.ReturnStatement returnStatement7 = null;
        cKVisitor4.endVisit(returnStatement7);
        org.eclipse.jdt.core.dom.UsesDirective usesDirective9 = null;
        boolean boolean10 = cKVisitor4.visit(usesDirective9);
        org.eclipse.jdt.core.dom.ModuleDeclaration moduleDeclaration11 = null;
        cKVisitor4.endVisit(moduleDeclaration11);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.ProvidesDirective providesDirective9 = null;
        boolean boolean10 = cKVisitor4.visit(providesDirective9);
        org.eclipse.jdt.core.dom.ThisExpression thisExpression11 = null;
        cKVisitor4.endVisit(thisExpression11);
        org.eclipse.jdt.core.dom.IntersectionType intersectionType13 = null;
        cKVisitor4.endVisit(intersectionType13);
        org.eclipse.jdt.core.dom.ArrayInitializer arrayInitializer15 = null;
        cKVisitor4.endVisit(arrayInitializer15);
        org.eclipse.jdt.core.dom.TryStatement tryStatement17 = null;
        boolean boolean18 = cKVisitor4.visit(tryStatement17);
        org.eclipse.jdt.core.dom.CharacterLiteral characterLiteral19 = null;
        cKVisitor4.endVisit(characterLiteral19);
        org.eclipse.jdt.core.dom.InfixExpression infixExpression21 = null;
        boolean boolean22 = cKVisitor4.visit(infixExpression21);
        org.eclipse.jdt.core.dom.NumberLiteral numberLiteral23 = null;
        boolean boolean24 = cKVisitor4.visit(numberLiteral23);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression9 = null;
        cKVisitor4.endVisit(patternInstanceofExpression9);
        org.eclipse.jdt.core.dom.InstanceofExpression instanceofExpression11 = null;
        cKVisitor4.endVisit(instanceofExpression11);
        org.eclipse.jdt.core.dom.Assignment assignment13 = null;
        cKVisitor4.endVisit(assignment13);
        org.eclipse.jdt.core.dom.TypeLiteral typeLiteral15 = null;
        boolean boolean16 = cKVisitor4.visit(typeLiteral15);
        org.eclipse.jdt.core.dom.VariableDeclarationStatement variableDeclarationStatement17 = null;
        cKVisitor4.endVisit(variableDeclarationStatement17);
        org.eclipse.jdt.core.dom.BreakStatement breakStatement19 = null;
        boolean boolean20 = cKVisitor4.visit(breakStatement19);
        org.eclipse.jdt.core.dom.ModuleQualifiedName moduleQualifiedName21 = null;
        cKVisitor4.endVisit(moduleQualifiedName21);
        org.eclipse.jdt.core.dom.SynchronizedStatement synchronizedStatement23 = null;
        cKVisitor4.endVisit(synchronizedStatement23);
        org.eclipse.jdt.core.dom.PrimitiveType primitiveType25 = null;
        cKVisitor4.endVisit(primitiveType25);
        org.eclipse.jdt.core.dom.MarkerAnnotation markerAnnotation27 = null;
        boolean boolean28 = cKVisitor4.visit(markerAnnotation27);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression9 = null;
        cKVisitor4.endVisit(patternInstanceofExpression9);
        org.eclipse.jdt.core.dom.InstanceofExpression instanceofExpression11 = null;
        cKVisitor4.endVisit(instanceofExpression11);
        org.eclipse.jdt.core.dom.Assignment assignment13 = null;
        cKVisitor4.endVisit(assignment13);
        org.eclipse.jdt.core.dom.TypeLiteral typeLiteral15 = null;
        boolean boolean16 = cKVisitor4.visit(typeLiteral15);
        org.eclipse.jdt.core.dom.EnumConstantDeclaration enumConstantDeclaration17 = null;
        cKVisitor4.endVisit(enumConstantDeclaration17);
        org.eclipse.jdt.core.dom.ProvidesDirective providesDirective19 = null;
        cKVisitor4.endVisit(providesDirective19);
        org.eclipse.jdt.core.dom.LineComment lineComment21 = null;
        cKVisitor4.endVisit(lineComment21);
        org.eclipse.jdt.core.dom.TextElement textElement23 = null;
        cKVisitor4.endVisit(textElement23);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        cKMethodResult4.setLoc((int) (byte) 100);
        cKMethodResult4.setTryCatchQty((int) (byte) -1);
        int int9 = cKMethodResult4.getNumbersQty();
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult14 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int15 = cKMethodResult14.getComparisonsQty();
        cKMethodResult14.setReturnQty((int) (byte) -1);
        cKMethodResult14.setCboModified((int) (byte) 100);
        int int20 = cKMethodResult14.getFanout();
        boolean boolean21 = cKMethodResult4.equals((java.lang.Object) cKMethodResult14);
        int int22 = cKMethodResult14.getLogStatementsQty();
        java.util.Map<java.lang.String, java.util.Set<java.lang.String>> strMap23 = null;
        cKMethodResult14.setMethodInvocationsIndirectLocal(strMap23);
        java.lang.String str25 = cKMethodResult14.getMethodName();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        cKClassResult4.setInnerClassesQty((int) (short) 100);
        cKClassResult4.setParenthesizedExpsQty((int) '4');
        cKClassResult4.setNumberOfPublicFields((int) (byte) 10);
        int int12 = cKClassResult4.getNumberOfDefaultFields();
        int int13 = cKClassResult4.getModifiers();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression9 = null;
        cKVisitor4.endVisit(patternInstanceofExpression9);
        org.eclipse.jdt.core.dom.InstanceofExpression instanceofExpression11 = null;
        cKVisitor4.endVisit(instanceofExpression11);
        org.eclipse.jdt.core.dom.Assignment assignment13 = null;
        cKVisitor4.endVisit(assignment13);
        org.eclipse.jdt.core.dom.SimpleType simpleType15 = null;
        cKVisitor4.endVisit(simpleType15);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression17 = null;
        cKVisitor4.endVisit(patternInstanceofExpression17);
        org.eclipse.jdt.core.dom.UsesDirective usesDirective19 = null;
        boolean boolean20 = cKVisitor4.visit(usesDirective19);
        org.eclipse.jdt.core.dom.SwitchExpression switchExpression21 = null;
        cKVisitor4.endVisit(switchExpression21);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "hi!", false, (int) (byte) 0);
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult9 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int10 = cKMethodResult9.getLambdasQty();
        java.util.Set<java.lang.String> strSet11 = cKMethodResult9.getMethodInvocations();
        cKMethodResult4.setMethodInvocations(strSet11);
        cKMethodResult4.setTryCatchQty((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ASTNode aSTNode5 = null;
        boolean boolean6 = cKVisitor4.preVisit2(aSTNode5);
        org.eclipse.jdt.core.dom.MethodInvocation methodInvocation7 = null;
        boolean boolean8 = cKVisitor4.visit(methodInvocation7);
        org.eclipse.jdt.core.dom.SwitchExpression switchExpression9 = null;
        cKVisitor4.endVisit(switchExpression9);
        org.eclipse.jdt.core.dom.CatchClause catchClause11 = null;
        boolean boolean12 = cKVisitor4.visit(catchClause11);
        org.eclipse.jdt.core.dom.MarkerAnnotation markerAnnotation13 = null;
        boolean boolean14 = cKVisitor4.visit(markerAnnotation13);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation15 = null;
        boolean boolean16 = cKVisitor4.visit(arrayCreation15);
        org.eclipse.jdt.core.dom.TagElement tagElement17 = null;
        boolean boolean18 = cKVisitor4.visit(tagElement17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        float float5 = cKClassResult4.getTightClassCohesion();
        int int6 = cKClassResult4.getFanout();
        cKClassResult4.setRfc(35);
        cKClassResult4.setComparisonsQty((int) '4');
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression9 = null;
        cKVisitor4.endVisit(patternInstanceofExpression9);
        org.eclipse.jdt.core.dom.InstanceofExpression instanceofExpression11 = null;
        cKVisitor4.endVisit(instanceofExpression11);
        org.eclipse.jdt.core.dom.Assignment assignment13 = null;
        cKVisitor4.endVisit(assignment13);
        org.eclipse.jdt.core.dom.SimpleType simpleType15 = null;
        cKVisitor4.endVisit(simpleType15);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression17 = null;
        cKVisitor4.endVisit(patternInstanceofExpression17);
        org.eclipse.jdt.core.dom.LineComment lineComment19 = null;
        boolean boolean20 = cKVisitor4.visit(lineComment19);
        org.eclipse.jdt.core.dom.PrimitiveType primitiveType21 = null;
        boolean boolean22 = cKVisitor4.visit(primitiveType21);
        org.eclipse.jdt.core.dom.MarkerAnnotation markerAnnotation23 = null;
        cKVisitor4.endVisit(markerAnnotation23);
        org.eclipse.jdt.core.dom.EnhancedForStatement enhancedForStatement25 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(enhancedForStatement25);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.ProvidesDirective providesDirective9 = null;
        boolean boolean10 = cKVisitor4.visit(providesDirective9);
        org.eclipse.jdt.core.dom.ThisExpression thisExpression11 = null;
        cKVisitor4.endVisit(thisExpression11);
        org.eclipse.jdt.core.dom.IntersectionType intersectionType13 = null;
        cKVisitor4.endVisit(intersectionType13);
        org.eclipse.jdt.core.dom.ArrayInitializer arrayInitializer15 = null;
        cKVisitor4.endVisit(arrayInitializer15);
        org.eclipse.jdt.core.dom.TryStatement tryStatement17 = null;
        boolean boolean18 = cKVisitor4.visit(tryStatement17);
        org.eclipse.jdt.core.dom.ProvidesDirective providesDirective19 = null;
        boolean boolean20 = cKVisitor4.visit(providesDirective19);
        org.eclipse.jdt.core.dom.PackageDeclaration packageDeclaration21 = null;
        boolean boolean22 = cKVisitor4.visit(packageDeclaration21);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression9 = null;
        cKVisitor4.endVisit(patternInstanceofExpression9);
        org.eclipse.jdt.core.dom.InstanceofExpression instanceofExpression11 = null;
        cKVisitor4.endVisit(instanceofExpression11);
        org.eclipse.jdt.core.dom.Assignment assignment13 = null;
        cKVisitor4.endVisit(assignment13);
        org.eclipse.jdt.core.dom.TypeLiteral typeLiteral15 = null;
        boolean boolean16 = cKVisitor4.visit(typeLiteral15);
        org.eclipse.jdt.core.dom.EnumConstantDeclaration enumConstantDeclaration17 = null;
        cKVisitor4.endVisit(enumConstantDeclaration17);
        org.eclipse.jdt.core.dom.ProvidesDirective providesDirective19 = null;
        cKVisitor4.endVisit(providesDirective19);
        org.eclipse.jdt.core.dom.LineComment lineComment21 = null;
        cKVisitor4.endVisit(lineComment21);
        org.eclipse.jdt.core.dom.ConstructorInvocation constructorInvocation23 = null;
        boolean boolean24 = cKVisitor4.visit(constructorInvocation23);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getNumberOfFinalFields();
        int int8 = cKClassResult4.getLcom();
        int int9 = cKClassResult4.getStringLiteralsQty();
        int int10 = cKClassResult4.getMaxNestedBlocks();
        cKClassResult4.setLambdasQty((int) '#');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.EnumConstantDeclaration enumConstantDeclaration7 = null;
        cKVisitor4.endVisit(enumConstantDeclaration7);
        org.eclipse.jdt.core.dom.AssertStatement assertStatement9 = null;
        boolean boolean10 = cKVisitor4.visit(assertStatement9);
        org.eclipse.jdt.core.dom.SynchronizedStatement synchronizedStatement11 = null;
        cKVisitor4.endVisit(synchronizedStatement11);
        org.eclipse.jdt.core.dom.ModuleModifier moduleModifier13 = null;
        cKVisitor4.endVisit(moduleModifier13);
        org.eclipse.jdt.core.dom.MemberRef memberRef15 = null;
        cKVisitor4.endVisit(memberRef15);
        org.eclipse.jdt.core.dom.MethodRefParameter methodRefParameter17 = null;
        boolean boolean18 = cKVisitor4.visit(methodRefParameter17);
        org.eclipse.jdt.core.dom.QualifiedName qualifiedName19 = null;
        cKVisitor4.endVisit(qualifiedName19);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation21 = null;
        boolean boolean22 = cKVisitor4.visit(arrayCreation21);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.NameQualifiedType nameQualifiedType7 = null;
        boolean boolean8 = cKVisitor4.visit(nameQualifiedType7);
        org.eclipse.jdt.core.dom.MarkerAnnotation markerAnnotation9 = null;
        cKVisitor4.endVisit(markerAnnotation9);
        org.eclipse.jdt.core.dom.ArrayAccess arrayAccess11 = null;
        cKVisitor4.endVisit(arrayAccess11);
        org.eclipse.jdt.core.dom.ModuleModifier moduleModifier13 = null;
        cKVisitor4.endVisit(moduleModifier13);
        org.eclipse.jdt.core.dom.Javadoc javadoc15 = null;
        boolean boolean16 = cKVisitor4.visit(javadoc15);
        org.eclipse.jdt.core.dom.CatchClause catchClause17 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(catchClause17);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setStringLiteralsQty((int) (byte) 1);
        java.util.Optional<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultOptional8 = cKClassResult4.getMethod("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
        cKClassResult4.setNumberOfDefaultMethods(100);
        java.util.Set<java.lang.String> strSet11 = cKClassResult4.getFieldNames();
        cKClassResult4.setNumberOfDefaultMethods((int) 'a');
        cKClassResult4.setComparisonsQty((int) (short) 1);
        int int16 = cKClassResult4.getWmc();
        org.junit.Assert.assertNotNull(cKMethodResultOptional8);
        org.junit.Assert.assertNull(strSet11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        float float5 = cKClassResult4.getTightClassCohesion();
        int int6 = cKClassResult4.getMaxNestedBlocks();
        int int7 = cKClassResult4.getAnonymousClassesQty();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        float float5 = cKClassResult4.getTightClassCohesion();
        int int6 = cKClassResult4.getFanout();
        cKClassResult4.setRfc(35);
        cKClassResult4.setNumberOfDefaultMethods((int) ' ');
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setStringLiteralsQty((int) (byte) 1);
        java.util.Optional<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultOptional8 = cKClassResult4.getMethod("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
        int int9 = cKClassResult4.getLoopQty();
        cKClassResult4.setLcom(100);
        int int12 = cKClassResult4.getAssignmentsQty();
        int int13 = cKClassResult4.getLoc();
        cKClassResult4.setNumberOfPublicFields(52);
        float float16 = cKClassResult4.getTightClassCohesion();
        cKClassResult4.setFanout(0);
        cKClassResult4.setLoc((int) (short) 100);
        cKClassResult4.setDit(0);
        cKClassResult4.setLoc((int) (short) 10);
        org.junit.Assert.assertNotNull(cKMethodResultOptional8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.SuperMethodReference superMethodReference7 = null;
        cKVisitor4.endVisit(superMethodReference7);
        org.eclipse.jdt.core.dom.SuperFieldAccess superFieldAccess9 = null;
        cKVisitor4.endVisit(superFieldAccess9);
        org.eclipse.jdt.core.dom.MarkerAnnotation markerAnnotation11 = null;
        cKVisitor4.endVisit(markerAnnotation11);
        org.eclipse.jdt.core.dom.IfStatement ifStatement13 = null;
        boolean boolean14 = cKVisitor4.visit(ifStatement13);
        org.eclipse.jdt.core.dom.ModuleQualifiedName moduleQualifiedName15 = null;
        boolean boolean16 = cKVisitor4.visit(moduleQualifiedName15);
        org.eclipse.jdt.core.dom.BooleanLiteral booleanLiteral17 = null;
        boolean boolean18 = cKVisitor4.visit(booleanLiteral17);
        org.eclipse.jdt.core.dom.SingleVariableDeclaration singleVariableDeclaration19 = null;
        boolean boolean20 = cKVisitor4.visit(singleVariableDeclaration19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getNumberOfPublicFields();
        cKClassResult4.setNosi((int) (byte) 1);
        cKClassResult4.setLoc((int) (byte) 100);
        int int12 = cKClassResult4.getRfc();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression9 = null;
        cKVisitor4.endVisit(patternInstanceofExpression9);
        org.eclipse.jdt.core.dom.InstanceofExpression instanceofExpression11 = null;
        cKVisitor4.endVisit(instanceofExpression11);
        org.eclipse.jdt.core.dom.Assignment assignment13 = null;
        cKVisitor4.endVisit(assignment13);
        org.eclipse.jdt.core.dom.SimpleType simpleType15 = null;
        cKVisitor4.endVisit(simpleType15);
        org.eclipse.jdt.core.dom.Block block17 = null;
        boolean boolean18 = cKVisitor4.visit(block17);
        org.eclipse.jdt.core.dom.LabeledStatement labeledStatement19 = null;
        cKVisitor4.endVisit(labeledStatement19);
        org.eclipse.jdt.core.dom.AssertStatement assertStatement21 = null;
        cKVisitor4.endVisit(assertStatement21);
        org.eclipse.jdt.core.dom.PostfixExpression postfixExpression23 = null;
        cKVisitor4.endVisit(postfixExpression23);
        org.eclipse.jdt.core.dom.MethodRef methodRef25 = null;
        boolean boolean26 = cKVisitor4.visit(methodRef25);
        org.eclipse.jdt.core.dom.ConditionalExpression conditionalExpression27 = null;
        boolean boolean28 = cKVisitor4.visit(conditionalExpression27);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.EnumConstantDeclaration enumConstantDeclaration7 = null;
        cKVisitor4.endVisit(enumConstantDeclaration7);
        org.eclipse.jdt.core.dom.NormalAnnotation normalAnnotation9 = null;
        boolean boolean10 = cKVisitor4.visit(normalAnnotation9);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression11 = null;
        cKVisitor4.endVisit(patternInstanceofExpression11);
        org.eclipse.jdt.core.dom.BreakStatement breakStatement13 = null;
        boolean boolean14 = cKVisitor4.visit(breakStatement13);
        org.eclipse.jdt.core.dom.BreakStatement breakStatement15 = null;
        cKVisitor4.endVisit(breakStatement15);
        org.eclipse.jdt.core.dom.ThrowStatement throwStatement17 = null;
        boolean boolean18 = cKVisitor4.visit(throwStatement17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getLcom();
        cKClassResult4.setLcom((int) '#');
        int int10 = cKClassResult4.getNumberOfPublicFields();
        cKClassResult4.setNumberOfProtectedFields((int) (short) 10);
        int int13 = cKClassResult4.getReturnQty();
        cKClassResult4.setNumberOfFinalFields(1);
        java.util.Set<java.lang.String> strSet16 = null;
        cKClassResult4.setFieldNames(strSet16);
        cKClassResult4.setTightClassCohesion((float) 100);
        int int20 = cKClassResult4.getMathOperationsQty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.ProvidesDirective providesDirective9 = null;
        boolean boolean10 = cKVisitor4.visit(providesDirective9);
        org.eclipse.jdt.core.dom.ThisExpression thisExpression11 = null;
        cKVisitor4.endVisit(thisExpression11);
        org.eclipse.jdt.core.dom.IntersectionType intersectionType13 = null;
        cKVisitor4.endVisit(intersectionType13);
        org.eclipse.jdt.core.dom.ArrayInitializer arrayInitializer15 = null;
        cKVisitor4.endVisit(arrayInitializer15);
        org.eclipse.jdt.core.dom.EmptyStatement emptyStatement17 = null;
        cKVisitor4.endVisit(emptyStatement17);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression9 = null;
        cKVisitor4.endVisit(patternInstanceofExpression9);
        org.eclipse.jdt.core.dom.InstanceofExpression instanceofExpression11 = null;
        cKVisitor4.endVisit(instanceofExpression11);
        org.eclipse.jdt.core.dom.Assignment assignment13 = null;
        cKVisitor4.endVisit(assignment13);
        org.eclipse.jdt.core.dom.SimpleType simpleType15 = null;
        cKVisitor4.endVisit(simpleType15);
        org.eclipse.jdt.core.dom.Block block17 = null;
        boolean boolean18 = cKVisitor4.visit(block17);
        org.eclipse.jdt.core.dom.MemberValuePair memberValuePair19 = null;
        boolean boolean20 = cKVisitor4.visit(memberValuePair19);
        org.eclipse.jdt.core.dom.TryStatement tryStatement21 = null;
        boolean boolean22 = cKVisitor4.visit(tryStatement21);
        org.eclipse.jdt.core.dom.NullLiteral nullLiteral23 = null;
        cKVisitor4.endVisit(nullLiteral23);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        cKMethodResult4.setLoc((int) (byte) 100);
        cKMethodResult4.setTryCatchQty((int) (byte) -1);
        cKMethodResult4.setCbo(0);
        java.lang.String str11 = cKMethodResult4.getMethodName();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.ProvidesDirective providesDirective9 = null;
        boolean boolean10 = cKVisitor4.visit(providesDirective9);
        org.eclipse.jdt.core.dom.ThisExpression thisExpression11 = null;
        cKVisitor4.endVisit(thisExpression11);
        org.eclipse.jdt.core.dom.IntersectionType intersectionType13 = null;
        cKVisitor4.endVisit(intersectionType13);
        org.eclipse.jdt.core.dom.ArrayInitializer arrayInitializer15 = null;
        cKVisitor4.endVisit(arrayInitializer15);
        org.eclipse.jdt.core.dom.TryStatement tryStatement17 = null;
        boolean boolean18 = cKVisitor4.visit(tryStatement17);
        org.eclipse.jdt.core.dom.StringLiteral stringLiteral19 = null;
        cKVisitor4.endVisit(stringLiteral19);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ASTNode aSTNode5 = null;
        boolean boolean6 = cKVisitor4.preVisit2(aSTNode5);
        org.eclipse.jdt.core.dom.SwitchStatement switchStatement7 = null;
        boolean boolean8 = cKVisitor4.visit(switchStatement7);
        org.eclipse.jdt.core.dom.AnnotationTypeDeclaration annotationTypeDeclaration9 = null;
        cKVisitor4.endVisit(annotationTypeDeclaration9);
        org.eclipse.jdt.core.dom.AssertStatement assertStatement11 = null;
        boolean boolean12 = cKVisitor4.visit(assertStatement11);
        org.eclipse.jdt.core.dom.FieldDeclaration fieldDeclaration13 = null;
        boolean boolean14 = cKVisitor4.visit(fieldDeclaration13);
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit15 = null;
        cKVisitor4.endVisit(compilationUnit15);
        org.eclipse.jdt.core.dom.UsesDirective usesDirective17 = null;
        boolean boolean18 = cKVisitor4.visit(usesDirective17);
        org.eclipse.jdt.core.dom.SimpleType simpleType19 = null;
        boolean boolean20 = cKVisitor4.visit(simpleType19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        cKMethodResult4.setLoc((int) (byte) 100);
        cKMethodResult4.setTryCatchQty((int) (byte) -1);
        int int9 = cKMethodResult4.getNumbersQty();
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult14 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int15 = cKMethodResult14.getComparisonsQty();
        cKMethodResult14.setReturnQty((int) (byte) -1);
        cKMethodResult14.setCboModified((int) (byte) 100);
        int int20 = cKMethodResult14.getFanout();
        boolean boolean21 = cKMethodResult4.equals((java.lang.Object) cKMethodResult14);
        java.util.Map<java.lang.String, java.util.Set<java.lang.String>> strMap22 = null;
        cKMethodResult14.setMethodInvocationsIndirectLocal(strMap22);
        cKMethodResult14.setAssignmentsQty((int) (short) -1);
        cKMethodResult14.setReturnQty((int) (short) 100);
        cKMethodResult14.setLogStatementsQty(35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        java.util.Set<java.lang.String> strSet6 = cKMethodResult4.getFieldsAccessed();
        int int7 = cKMethodResult4.getReturnQty();
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult12 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int13 = cKMethodResult12.getLambdasQty();
        java.util.Set<java.lang.String> strSet14 = cKMethodResult12.getMethodInvocations();
        cKMethodResult4.setMethodInvocations(strSet14);
        java.util.Set<java.lang.String> strSet16 = cKMethodResult4.getMethodInvocations();
        cKMethodResult4.setParametersQty((-1));
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression9 = null;
        cKVisitor4.endVisit(patternInstanceofExpression9);
        org.eclipse.jdt.core.dom.InstanceofExpression instanceofExpression11 = null;
        cKVisitor4.endVisit(instanceofExpression11);
        org.eclipse.jdt.core.dom.Assignment assignment13 = null;
        cKVisitor4.endVisit(assignment13);
        org.eclipse.jdt.core.dom.SimpleType simpleType15 = null;
        cKVisitor4.endVisit(simpleType15);
        org.eclipse.jdt.core.dom.Block block17 = null;
        boolean boolean18 = cKVisitor4.visit(block17);
        org.eclipse.jdt.core.dom.YieldStatement yieldStatement19 = null;
        cKVisitor4.endVisit(yieldStatement19);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression21 = null;
        boolean boolean22 = cKVisitor4.visit(patternInstanceofExpression21);
        org.eclipse.jdt.core.dom.TextElement textElement23 = null;
        cKVisitor4.endVisit(textElement23);
        org.eclipse.jdt.core.dom.Javadoc javadoc25 = null;
        cKVisitor4.endVisit(javadoc25);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        com.github.mauricioaniche.ck.CK cK3 = new com.github.mauricioaniche.ck.CK(true, (int) (short) 1, false);
        java.nio.file.Path path4 = null;
        com.github.mauricioaniche.ck.CKNotifier cKNotifier5 = null;
        java.nio.file.Path path6 = null;
        java.nio.file.Path[] pathArray7 = new java.nio.file.Path[] { path6 };
        // The following exception was thrown during execution in test generation
        try {
            cK3.calculate(path4, cKNotifier5, pathArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pathArray7);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.ProvidesDirective providesDirective9 = null;
        boolean boolean10 = cKVisitor4.visit(providesDirective9);
        org.eclipse.jdt.core.dom.ThisExpression thisExpression11 = null;
        cKVisitor4.endVisit(thisExpression11);
        org.eclipse.jdt.core.dom.ContinueStatement continueStatement13 = null;
        boolean boolean14 = cKVisitor4.visit(continueStatement13);
        org.eclipse.jdt.core.dom.ArrayAccess arrayAccess15 = null;
        cKVisitor4.endVisit(arrayAccess15);
        org.eclipse.jdt.core.dom.RequiresDirective requiresDirective17 = null;
        boolean boolean18 = cKVisitor4.visit(requiresDirective17);
        org.eclipse.jdt.core.dom.PrimitiveType primitiveType19 = null;
        boolean boolean20 = cKVisitor4.visit(primitiveType19);
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit21 = null;
        cKVisitor4.endVisit(compilationUnit21);
        org.eclipse.jdt.core.dom.MethodRef methodRef23 = null;
        cKVisitor4.endVisit(methodRef23);
        org.eclipse.jdt.core.dom.LineComment lineComment25 = null;
        boolean boolean26 = cKVisitor4.visit(lineComment25);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression27 = null;
        cKVisitor4.endVisit(parenthesizedExpression27);
        org.eclipse.jdt.core.dom.FieldAccess fieldAccess29 = null;
        boolean boolean30 = cKVisitor4.visit(fieldAccess29);
        org.eclipse.jdt.core.dom.SwitchCase switchCase31 = null;
        boolean boolean32 = cKVisitor4.visit(switchCase31);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable0 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable1 = null;
        com.github.mauricioaniche.ck.CKNotifier cKNotifier2 = null;
        com.github.mauricioaniche.ck.MetricsExecutor metricsExecutor3 = new com.github.mauricioaniche.ck.MetricsExecutor(classLevelMetricListCallable0, methodLevelMetricListCallable1, cKNotifier2);
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        org.eclipse.jdt.core.dom.IBinding[] iBindingArray6 = metricsExecutor3.createBindings(strArray5);
        org.eclipse.jdt.core.dom.IBinding iBinding8 = null;
        metricsExecutor3.acceptBinding("CKClassResult [file=, className=CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}]", iBinding8);
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable10 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable11 = null;
        com.github.mauricioaniche.ck.CKNotifier cKNotifier12 = null;
        com.github.mauricioaniche.ck.MetricsExecutor metricsExecutor13 = new com.github.mauricioaniche.ck.MetricsExecutor(classLevelMetricListCallable10, methodLevelMetricListCallable11, cKNotifier12);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        org.eclipse.jdt.core.dom.IBinding[] iBindingArray16 = metricsExecutor13.createBindings(strArray15);
        org.eclipse.jdt.core.dom.IBinding[] iBindingArray17 = metricsExecutor3.createBindings(strArray15);
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            metricsExecutor3.acceptAST("", compilationUnit19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(iBindingArray6);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(iBindingArray16);
        org.junit.Assert.assertNotNull(iBindingArray17);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression9 = null;
        cKVisitor4.endVisit(patternInstanceofExpression9);
        org.eclipse.jdt.core.dom.InstanceofExpression instanceofExpression11 = null;
        cKVisitor4.endVisit(instanceofExpression11);
        org.eclipse.jdt.core.dom.Assignment assignment13 = null;
        cKVisitor4.endVisit(assignment13);
        org.eclipse.jdt.core.dom.SimpleType simpleType15 = null;
        cKVisitor4.endVisit(simpleType15);
        org.eclipse.jdt.core.dom.SynchronizedStatement synchronizedStatement17 = null;
        cKVisitor4.endVisit(synchronizedStatement17);
        org.eclipse.jdt.core.dom.BreakStatement breakStatement19 = null;
        boolean boolean20 = cKVisitor4.visit(breakStatement19);
        org.eclipse.jdt.core.dom.OpensDirective opensDirective21 = null;
        cKVisitor4.endVisit(opensDirective21);
        org.eclipse.jdt.core.dom.InfixExpression infixExpression23 = null;
        boolean boolean24 = cKVisitor4.visit(infixExpression23);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        // The following exception was thrown during execution in test generation
        try {
            com.github.mauricioaniche.ck.ResultWriter resultWriter5 = new com.github.mauricioaniche.ck.ResultWriter("CKMethodResult{cbo=10, rfc=0, wmc=0, methodName='hi!'}", "CKClassResult [file=, className=CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}]", "CKClassResult [file=, className=CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}]", "", true);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ASTNode aSTNode5 = null;
        boolean boolean6 = cKVisitor4.preVisit2(aSTNode5);
        org.eclipse.jdt.core.dom.SwitchStatement switchStatement7 = null;
        boolean boolean8 = cKVisitor4.visit(switchStatement7);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression9 = null;
        boolean boolean10 = cKVisitor4.visit(patternInstanceofExpression9);
        org.eclipse.jdt.core.dom.TypeDeclarationStatement typeDeclarationStatement11 = null;
        cKVisitor4.endVisit(typeDeclarationStatement11);
        org.eclipse.jdt.core.dom.SuperMethodReference superMethodReference13 = null;
        cKVisitor4.endVisit(superMethodReference13);
        org.eclipse.jdt.core.dom.BlockComment blockComment15 = null;
        cKVisitor4.endVisit(blockComment15);
        org.eclipse.jdt.core.dom.UsesDirective usesDirective17 = null;
        cKVisitor4.endVisit(usesDirective17);
        org.eclipse.jdt.core.dom.RecordDeclaration recordDeclaration19 = null;
        boolean boolean20 = cKVisitor4.visit(recordDeclaration19);
        org.eclipse.jdt.core.dom.TypeDeclarationStatement typeDeclarationStatement21 = null;
        cKVisitor4.endVisit(typeDeclarationStatement21);
        org.eclipse.jdt.core.dom.PackageDeclaration packageDeclaration23 = null;
        boolean boolean24 = cKVisitor4.visit(packageDeclaration23);
        org.eclipse.jdt.core.dom.PrefixExpression prefixExpression25 = null;
        boolean boolean26 = cKVisitor4.visit(prefixExpression25);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.ProvidesDirective providesDirective9 = null;
        boolean boolean10 = cKVisitor4.visit(providesDirective9);
        org.eclipse.jdt.core.dom.ThisExpression thisExpression11 = null;
        cKVisitor4.endVisit(thisExpression11);
        org.eclipse.jdt.core.dom.IntersectionType intersectionType13 = null;
        cKVisitor4.endVisit(intersectionType13);
        org.eclipse.jdt.core.dom.ConditionalExpression conditionalExpression15 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(conditionalExpression15);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.ProvidesDirective providesDirective9 = null;
        boolean boolean10 = cKVisitor4.visit(providesDirective9);
        org.eclipse.jdt.core.dom.ThisExpression thisExpression11 = null;
        cKVisitor4.endVisit(thisExpression11);
        org.eclipse.jdt.core.dom.ContinueStatement continueStatement13 = null;
        boolean boolean14 = cKVisitor4.visit(continueStatement13);
        org.eclipse.jdt.core.dom.ArrayAccess arrayAccess15 = null;
        cKVisitor4.endVisit(arrayAccess15);
        org.eclipse.jdt.core.dom.RequiresDirective requiresDirective17 = null;
        boolean boolean18 = cKVisitor4.visit(requiresDirective17);
        org.eclipse.jdt.core.dom.PrimitiveType primitiveType19 = null;
        boolean boolean20 = cKVisitor4.visit(primitiveType19);
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit21 = null;
        cKVisitor4.endVisit(compilationUnit21);
        org.eclipse.jdt.core.dom.MethodRef methodRef23 = null;
        cKVisitor4.endVisit(methodRef23);
        org.eclipse.jdt.core.dom.FieldDeclaration fieldDeclaration25 = null;
        cKVisitor4.endVisit(fieldDeclaration25);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression9 = null;
        cKVisitor4.endVisit(patternInstanceofExpression9);
        org.eclipse.jdt.core.dom.InstanceofExpression instanceofExpression11 = null;
        cKVisitor4.endVisit(instanceofExpression11);
        org.eclipse.jdt.core.dom.Assignment assignment13 = null;
        cKVisitor4.endVisit(assignment13);
        org.eclipse.jdt.core.dom.ASTNode aSTNode15 = null;
        cKVisitor4.postVisit(aSTNode15);
        org.eclipse.jdt.core.dom.ContinueStatement continueStatement17 = null;
        boolean boolean18 = cKVisitor4.visit(continueStatement17);
        org.eclipse.jdt.core.dom.NullLiteral nullLiteral19 = null;
        cKVisitor4.endVisit(nullLiteral19);
        org.eclipse.jdt.core.dom.CatchClause catchClause21 = null;
        boolean boolean22 = cKVisitor4.visit(catchClause21);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setAnonymousClassesQty((int) (byte) -1);
        int int7 = cKClassResult4.getNumberOfSynchronizedFields();
        cKClassResult4.setRfc((-1));
        cKClassResult4.setNumberOfFields(10);
        int int12 = cKClassResult4.getParenthesizedExpsQty();
        cKClassResult4.setWmc((int) (short) -1);
        int int15 = cKClassResult4.getUniqueWordsQty();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getComparisonsQty();
        cKMethodResult4.setReturnQty((int) (byte) -1);
        cKMethodResult4.setCboModified((int) (byte) 100);
        int int10 = cKMethodResult4.getFanout();
        cKMethodResult4.setAnonymousClassesQty((int) '4');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        com.github.mauricioaniche.ck.CK cK0 = new com.github.mauricioaniche.ck.CK();
        java.nio.file.Path path1 = null;
        com.github.mauricioaniche.ck.CKNotifier cKNotifier2 = null;
        java.nio.file.Path[] pathArray3 = new java.nio.file.Path[] {};
        // The following exception was thrown during execution in test generation
        try {
            cK0.calculate(path1, cKNotifier2, pathArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pathArray3);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        com.github.mauricioaniche.ck.CK cK3 = new com.github.mauricioaniche.ck.CK(false, (int) (short) -1, false);
        java.nio.file.Path path4 = null;
        com.github.mauricioaniche.ck.CKNotifier cKNotifier5 = null;
        // The following exception was thrown during execution in test generation
        try {
            cK3.calculate(path4, cKNotifier5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getMaxNestedBlocks();
        int int6 = cKClassResult4.getMaxNestedBlocks();
        int int7 = cKClassResult4.getNumberOfProtectedFields();
        java.lang.String str8 = cKClassResult4.getFile();
        int int9 = cKClassResult4.getNumberOfSynchronizedFields();
        int int10 = cKClassResult4.getNumberOfSynchronizedFields();
        int int11 = cKClassResult4.getReturnQty();
        cKClassResult4.setLooseClassCohesion((float) 'a');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.EnumConstantDeclaration enumConstantDeclaration7 = null;
        cKVisitor4.endVisit(enumConstantDeclaration7);
        org.eclipse.jdt.core.dom.AssertStatement assertStatement9 = null;
        boolean boolean10 = cKVisitor4.visit(assertStatement9);
        org.eclipse.jdt.core.dom.SynchronizedStatement synchronizedStatement11 = null;
        cKVisitor4.endVisit(synchronizedStatement11);
        org.eclipse.jdt.core.dom.TextElement textElement13 = null;
        cKVisitor4.endVisit(textElement13);
        org.eclipse.jdt.core.dom.ClassInstanceCreation classInstanceCreation15 = null;
        cKVisitor4.endVisit(classInstanceCreation15);
        org.eclipse.jdt.core.dom.TypeDeclaration typeDeclaration17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = cKVisitor4.visit(typeDeclaration17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.EnumConstantDeclaration enumConstantDeclaration7 = null;
        cKVisitor4.endVisit(enumConstantDeclaration7);
        org.eclipse.jdt.core.dom.NormalAnnotation normalAnnotation9 = null;
        boolean boolean10 = cKVisitor4.visit(normalAnnotation9);
        java.util.Set<com.github.mauricioaniche.ck.CKClassResult> cKClassResultSet11 = cKVisitor4.getCollectedClasses();
        org.eclipse.jdt.core.dom.TextElement textElement12 = null;
        cKVisitor4.endVisit(textElement12);
        org.eclipse.jdt.core.dom.TryStatement tryStatement14 = null;
        cKVisitor4.endVisit(tryStatement14);
        org.eclipse.jdt.core.dom.EmptyStatement emptyStatement16 = null;
        cKVisitor4.endVisit(emptyStatement16);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(cKClassResultSet11);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setAnonymousClassesQty((int) (byte) -1);
        int int7 = cKClassResult4.getNumberOfSynchronizedFields();
        cKClassResult4.setAssignmentsQty((int) (byte) 1);
        int int10 = cKClassResult4.getNumberOfFields();
        cKClassResult4.setLogStatementsQty(52);
        cKClassResult4.setNumberOfFields(10);
        cKClassResult4.setLogStatementsQty(10);
        int int17 = cKClassResult4.getAssignmentsQty();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ASTNode aSTNode5 = null;
        boolean boolean6 = cKVisitor4.preVisit2(aSTNode5);
        org.eclipse.jdt.core.dom.MethodInvocation methodInvocation7 = null;
        boolean boolean8 = cKVisitor4.visit(methodInvocation7);
        org.eclipse.jdt.core.dom.EmptyStatement emptyStatement9 = null;
        cKVisitor4.endVisit(emptyStatement9);
        org.eclipse.jdt.core.dom.Modifier modifier11 = null;
        boolean boolean12 = cKVisitor4.visit(modifier11);
        org.eclipse.jdt.core.dom.ContinueStatement continueStatement13 = null;
        cKVisitor4.endVisit(continueStatement13);
        org.eclipse.jdt.core.dom.ArrayType arrayType15 = null;
        cKVisitor4.endVisit(arrayType15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setStringLiteralsQty((int) (byte) 1);
        java.util.Optional<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultOptional8 = cKClassResult4.getMethod("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
        cKClassResult4.setLooseClassCohesion((float) 10L);
        cKClassResult4.setLooseClassCohesion((float) (byte) 100);
        org.junit.Assert.assertNotNull(cKMethodResultOptional8);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getLcom();
        cKClassResult4.setLcom((int) '#');
        cKClassResult4.setDit(10);
        cKClassResult4.setFanout((int) '#');
        int int14 = cKClassResult4.getMathOperationsQty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setAnonymousClassesQty((int) (byte) -1);
        int int7 = cKClassResult4.getNumberOfSynchronizedFields();
        cKClassResult4.setAssignmentsQty((int) (byte) 1);
        int int10 = cKClassResult4.getNumberOfFields();
        cKClassResult4.setLogStatementsQty(52);
        int int13 = cKClassResult4.getNumberOfDefaultMethods();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setAnonymousClassesQty((int) (byte) -1);
        int int7 = cKClassResult4.getNumberOfSynchronizedFields();
        cKClassResult4.setAssignmentsQty((int) (byte) 1);
        int int10 = cKClassResult4.getRfc();
        cKClassResult4.setNumberOfAbstractMethods((int) '#');
        int int13 = cKClassResult4.getUniqueWordsQty();
        cKClassResult4.setNumberOfAbstractMethods((int) (byte) 100);
        cKClassResult4.setLambdasQty((-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setStringLiteralsQty((int) (byte) 1);
        java.util.Optional<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultOptional8 = cKClassResult4.getMethod("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
        int int9 = cKClassResult4.getLoopQty();
        cKClassResult4.setNumberOfPublicFields((int) (byte) 1);
        cKClassResult4.setComparisonsQty((int) (short) 10);
        org.junit.Assert.assertNotNull(cKMethodResultOptional8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ASTNode aSTNode5 = null;
        boolean boolean6 = cKVisitor4.preVisit2(aSTNode5);
        org.eclipse.jdt.core.dom.SwitchStatement switchStatement7 = null;
        boolean boolean8 = cKVisitor4.visit(switchStatement7);
        org.eclipse.jdt.core.dom.VariableDeclarationFragment variableDeclarationFragment9 = null;
        cKVisitor4.endVisit(variableDeclarationFragment9);
        org.eclipse.jdt.core.dom.CreationReference creationReference11 = null;
        boolean boolean12 = cKVisitor4.visit(creationReference11);
        org.eclipse.jdt.core.dom.InstanceofExpression instanceofExpression13 = null;
        cKVisitor4.endVisit(instanceofExpression13);
        org.eclipse.jdt.core.dom.SimpleType simpleType15 = null;
        boolean boolean16 = cKVisitor4.visit(simpleType15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        com.github.mauricioaniche.ck.CK cK0 = new com.github.mauricioaniche.ck.CK();
        com.github.mauricioaniche.ck.CKNotifier cKNotifier2 = null;
// flaky:         cK0.calculate("hi!", cKNotifier2);
        com.github.mauricioaniche.ck.CKNotifier cKNotifier5 = null;
// flaky:         cK0.calculate("hi!", cKNotifier5);
        java.nio.file.Path path7 = null;
        com.github.mauricioaniche.ck.CKNotifier cKNotifier8 = null;
        // The following exception was thrown during execution in test generation
        try {
            cK0.calculate(path7, cKNotifier8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression9 = null;
        cKVisitor4.endVisit(patternInstanceofExpression9);
        org.eclipse.jdt.core.dom.VariableDeclarationFragment variableDeclarationFragment11 = null;
        cKVisitor4.endVisit(variableDeclarationFragment11);
        org.eclipse.jdt.core.dom.TypeDeclarationStatement typeDeclarationStatement13 = null;
        boolean boolean14 = cKVisitor4.visit(typeDeclarationStatement13);
        org.eclipse.jdt.core.dom.TextElement textElement15 = null;
        cKVisitor4.endVisit(textElement15);
        org.eclipse.jdt.core.dom.UsesDirective usesDirective17 = null;
        boolean boolean18 = cKVisitor4.visit(usesDirective17);
        org.eclipse.jdt.core.dom.StringLiteral stringLiteral19 = null;
        boolean boolean20 = cKVisitor4.visit(stringLiteral19);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        cKClassResult4.setRfc(0);
        cKClassResult4.setNumberOfDefaultFields(0);
        int int10 = cKClassResult4.getNumberOfPublicMethods();
        int int11 = cKClassResult4.getNosi();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.ProvidesDirective providesDirective9 = null;
        boolean boolean10 = cKVisitor4.visit(providesDirective9);
        org.eclipse.jdt.core.dom.ThisExpression thisExpression11 = null;
        cKVisitor4.endVisit(thisExpression11);
        org.eclipse.jdt.core.dom.ContinueStatement continueStatement13 = null;
        boolean boolean14 = cKVisitor4.visit(continueStatement13);
        org.eclipse.jdt.core.dom.ArrayAccess arrayAccess15 = null;
        cKVisitor4.endVisit(arrayAccess15);
        org.eclipse.jdt.core.dom.RequiresDirective requiresDirective17 = null;
        boolean boolean18 = cKVisitor4.visit(requiresDirective17);
        org.eclipse.jdt.core.dom.PackageDeclaration packageDeclaration19 = null;
        boolean boolean20 = cKVisitor4.visit(packageDeclaration19);
        org.eclipse.jdt.core.dom.CatchClause catchClause21 = null;
        boolean boolean22 = cKVisitor4.visit(catchClause21);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getUniqueWordsQty();
        int int6 = cKMethodResult4.getNumbersQty();
        int int7 = cKMethodResult4.getStartLine();
        cKMethodResult4.setHasJavadoc(true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.ProvidesDirective providesDirective9 = null;
        boolean boolean10 = cKVisitor4.visit(providesDirective9);
        org.eclipse.jdt.core.dom.ThisExpression thisExpression11 = null;
        cKVisitor4.endVisit(thisExpression11);
        org.eclipse.jdt.core.dom.WhileStatement whileStatement13 = null;
        boolean boolean14 = cKVisitor4.visit(whileStatement13);
        org.eclipse.jdt.core.dom.IfStatement ifStatement15 = null;
        boolean boolean16 = cKVisitor4.visit(ifStatement15);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression17 = null;
        cKVisitor4.endVisit(patternInstanceofExpression17);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.UsesDirective usesDirective7 = null;
        boolean boolean8 = cKVisitor4.visit(usesDirective7);
        org.eclipse.jdt.core.dom.ClassInstanceCreation classInstanceCreation9 = null;
        boolean boolean10 = cKVisitor4.visit(classInstanceCreation9);
        org.eclipse.jdt.core.dom.SynchronizedStatement synchronizedStatement11 = null;
        cKVisitor4.endVisit(synchronizedStatement11);
        org.eclipse.jdt.core.dom.TypeMethodReference typeMethodReference13 = null;
        boolean boolean14 = cKVisitor4.visit(typeMethodReference13);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.NameQualifiedType nameQualifiedType7 = null;
        boolean boolean8 = cKVisitor4.visit(nameQualifiedType7);
        org.eclipse.jdt.core.dom.SimpleName simpleName9 = null;
        boolean boolean10 = cKVisitor4.visit(simpleName9);
        org.eclipse.jdt.core.dom.MethodInvocation methodInvocation11 = null;
        boolean boolean12 = cKVisitor4.visit(methodInvocation11);
        org.eclipse.jdt.core.dom.SwitchCase switchCase13 = null;
        boolean boolean14 = cKVisitor4.visit(switchCase13);
        org.eclipse.jdt.core.dom.BlockComment blockComment15 = null;
        cKVisitor4.endVisit(blockComment15);
        org.eclipse.jdt.core.dom.ModuleQualifiedName moduleQualifiedName17 = null;
        cKVisitor4.endVisit(moduleQualifiedName17);
        org.eclipse.jdt.core.dom.MethodRefParameter methodRefParameter19 = null;
        boolean boolean20 = cKVisitor4.visit(methodRefParameter19);
        org.eclipse.jdt.core.dom.PackageDeclaration packageDeclaration21 = null;
        boolean boolean22 = cKVisitor4.visit(packageDeclaration21);
        org.eclipse.jdt.core.dom.TypeDeclarationStatement typeDeclarationStatement23 = null;
        cKVisitor4.endVisit(typeDeclarationStatement23);
        org.eclipse.jdt.core.dom.WhileStatement whileStatement25 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(whileStatement25);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", true, (int) '4');
        int int5 = cKMethodResult4.getAnonymousClassesQty();
        int int6 = cKMethodResult4.getParametersQty();
        cKMethodResult4.setLoc((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getFanout();
        cKClassResult4.setNumberOfPublicMethods((int) (short) -1);
        java.lang.String str10 = cKClassResult4.getType();
        int int11 = cKClassResult4.getVariablesQty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}" + "'", str10, "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression9 = null;
        cKVisitor4.endVisit(patternInstanceofExpression9);
        org.eclipse.jdt.core.dom.InstanceofExpression instanceofExpression11 = null;
        cKVisitor4.endVisit(instanceofExpression11);
        org.eclipse.jdt.core.dom.InfixExpression infixExpression13 = null;
        boolean boolean14 = cKVisitor4.visit(infixExpression13);
        org.eclipse.jdt.core.dom.CharacterLiteral characterLiteral15 = null;
        cKVisitor4.endVisit(characterLiteral15);
        org.eclipse.jdt.core.dom.MethodRefParameter methodRefParameter17 = null;
        boolean boolean18 = cKVisitor4.visit(methodRefParameter17);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setStringLiteralsQty((int) (byte) 1);
        java.util.Optional<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultOptional8 = cKClassResult4.getMethod("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
        int int9 = cKClassResult4.getLoopQty();
        cKClassResult4.setLcom(100);
        int int12 = cKClassResult4.getAssignmentsQty();
        int int13 = cKClassResult4.getLoc();
        cKClassResult4.setNumberOfPublicFields(52);
        float float16 = cKClassResult4.getTightClassCohesion();
        cKClassResult4.setFanout(0);
        cKClassResult4.setDit((int) ' ');
        org.junit.Assert.assertNotNull(cKMethodResultOptional8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.RecordDeclaration recordDeclaration7 = null;
        boolean boolean8 = cKVisitor4.visit(recordDeclaration7);
        org.eclipse.jdt.core.dom.TypeMethodReference typeMethodReference9 = null;
        cKVisitor4.endVisit(typeMethodReference9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getFanout();
        cKClassResult4.setNumberOfPublicMethods((int) (short) -1);
        cKClassResult4.setStringLiteralsQty(1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "hi!", false, (int) (byte) 0);
        cKMethodResult4.setFanout(1);
        cKMethodResult4.setCbo(10);
        int int9 = cKMethodResult4.getAnonymousClassesQty();
        int int10 = cKMethodResult4.getLoc();
        int int11 = cKMethodResult4.getRfc();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getUniqueWordsQty();
        cKMethodResult4.setUniqueWordsQty((int) (byte) 10);
        int int8 = cKMethodResult4.getMathOperationsQty();
        int int9 = cKMethodResult4.getLoc();
        int int10 = cKMethodResult4.getStringLiteralsQty();
        cKMethodResult4.setCbo((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKClassResult [file=, className=CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}]", "hi!", (int) '4');
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.EnumConstantDeclaration enumConstantDeclaration7 = null;
        cKVisitor4.endVisit(enumConstantDeclaration7);
        org.eclipse.jdt.core.dom.NormalAnnotation normalAnnotation9 = null;
        boolean boolean10 = cKVisitor4.visit(normalAnnotation9);
        java.util.Set<com.github.mauricioaniche.ck.CKClassResult> cKClassResultSet11 = cKVisitor4.getCollectedClasses();
        org.eclipse.jdt.core.dom.TextElement textElement12 = null;
        cKVisitor4.endVisit(textElement12);
        org.eclipse.jdt.core.dom.ArrayAccess arrayAccess14 = null;
        boolean boolean15 = cKVisitor4.visit(arrayAccess14);
        org.eclipse.jdt.core.dom.WhileStatement whileStatement16 = null;
        boolean boolean17 = cKVisitor4.visit(whileStatement16);
        org.eclipse.jdt.core.dom.FieldDeclaration fieldDeclaration18 = null;
        cKVisitor4.endVisit(fieldDeclaration18);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(cKClassResultSet11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        java.util.Set<java.lang.String> strSet6 = cKMethodResult4.getMethodInvocationsLocal();
        cKMethodResult4.setCboModified(100);
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult13 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int14 = cKMethodResult13.getLambdasQty();
        java.util.Set<java.lang.String> strSet15 = cKMethodResult13.getMethodInvocations();
        cKMethodResult4.setMethodInvocations(strSet15);
        int int17 = cKMethodResult4.getComparisonsQty();
        cKMethodResult4.setAnonymousClassesQty((int) (short) 0);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setStringLiteralsQty((int) (byte) 1);
        java.util.Optional<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultOptional8 = cKClassResult4.getMethod("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
        cKClassResult4.setNumberOfDefaultMethods(100);
        java.util.Set<java.lang.String> strSet11 = cKClassResult4.getFieldNames();
        cKClassResult4.setNumberOfDefaultMethods((int) 'a');
        int int14 = cKClassResult4.getNoc();
        int int15 = cKClassResult4.getLambdasQty();
        org.junit.Assert.assertNotNull(cKMethodResultOptional8);
        org.junit.Assert.assertNull(strSet11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression9 = null;
        cKVisitor4.endVisit(patternInstanceofExpression9);
        org.eclipse.jdt.core.dom.InstanceofExpression instanceofExpression11 = null;
        cKVisitor4.endVisit(instanceofExpression11);
        org.eclipse.jdt.core.dom.SuperFieldAccess superFieldAccess13 = null;
        boolean boolean14 = cKVisitor4.visit(superFieldAccess13);
        org.eclipse.jdt.core.dom.SingleVariableDeclaration singleVariableDeclaration15 = null;
        boolean boolean16 = cKVisitor4.visit(singleVariableDeclaration15);
        org.eclipse.jdt.core.dom.VariableDeclarationStatement variableDeclarationStatement17 = null;
        cKVisitor4.endVisit(variableDeclarationStatement17);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression9 = null;
        cKVisitor4.endVisit(patternInstanceofExpression9);
        org.eclipse.jdt.core.dom.InstanceofExpression instanceofExpression11 = null;
        cKVisitor4.endVisit(instanceofExpression11);
        org.eclipse.jdt.core.dom.Assignment assignment13 = null;
        cKVisitor4.endVisit(assignment13);
        org.eclipse.jdt.core.dom.SimpleType simpleType15 = null;
        cKVisitor4.endVisit(simpleType15);
        org.eclipse.jdt.core.dom.Block block17 = null;
        boolean boolean18 = cKVisitor4.visit(block17);
        org.eclipse.jdt.core.dom.LabeledStatement labeledStatement19 = null;
        cKVisitor4.endVisit(labeledStatement19);
        org.eclipse.jdt.core.dom.AssertStatement assertStatement21 = null;
        cKVisitor4.endVisit(assertStatement21);
        org.eclipse.jdt.core.dom.ProvidesDirective providesDirective23 = null;
        boolean boolean24 = cKVisitor4.visit(providesDirective23);
        org.eclipse.jdt.core.dom.InstanceofExpression instanceofExpression25 = null;
        boolean boolean26 = cKVisitor4.visit(instanceofExpression25);
        org.eclipse.jdt.core.dom.AnonymousClassDeclaration anonymousClassDeclaration27 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = cKVisitor4.visit(anonymousClassDeclaration27);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getUniqueWordsQty();
        int int7 = cKClassResult4.getUniqueWordsQty();
        int int8 = cKClassResult4.getNumberOfStaticFields();
        int int9 = cKClassResult4.getNumberOfAbstractMethods();
        int int10 = cKClassResult4.getWmc();
        cKClassResult4.setNumberOfPublicFields(1);
        int int13 = cKClassResult4.getNumberOfProtectedMethods();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.ContinueStatement continueStatement9 = null;
        cKVisitor4.endVisit(continueStatement9);
        org.eclipse.jdt.core.dom.NullLiteral nullLiteral11 = null;
        cKVisitor4.endVisit(nullLiteral11);
        org.eclipse.jdt.core.dom.AnnotationTypeDeclaration annotationTypeDeclaration13 = null;
        boolean boolean14 = cKVisitor4.visit(annotationTypeDeclaration13);
        org.eclipse.jdt.core.dom.BlockComment blockComment15 = null;
        cKVisitor4.endVisit(blockComment15);
        org.eclipse.jdt.core.dom.CatchClause catchClause17 = null;
        boolean boolean18 = cKVisitor4.visit(catchClause17);
        org.eclipse.jdt.core.dom.SynchronizedStatement synchronizedStatement19 = null;
        cKVisitor4.endVisit(synchronizedStatement19);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.SuperMethodReference superMethodReference7 = null;
        cKVisitor4.endVisit(superMethodReference7);
        org.eclipse.jdt.core.dom.SuperFieldAccess superFieldAccess9 = null;
        cKVisitor4.endVisit(superFieldAccess9);
        org.eclipse.jdt.core.dom.LabeledStatement labeledStatement11 = null;
        boolean boolean12 = cKVisitor4.visit(labeledStatement11);
        org.eclipse.jdt.core.dom.ArrayInitializer arrayInitializer13 = null;
        boolean boolean14 = cKVisitor4.visit(arrayInitializer13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        com.github.mauricioaniche.ck.CK cK3 = new com.github.mauricioaniche.ck.CK(false, 10, false);
        java.nio.file.Path path4 = null;
        com.github.mauricioaniche.ck.CKNotifier cKNotifier5 = null;
        java.nio.file.Path path6 = null;
        java.nio.file.Path[] pathArray7 = new java.nio.file.Path[] { path6 };
        // The following exception was thrown during execution in test generation
        try {
            cK3.calculate(path4, cKNotifier5, pathArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pathArray7);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ASTNode aSTNode5 = null;
        boolean boolean6 = cKVisitor4.preVisit2(aSTNode5);
        org.eclipse.jdt.core.dom.VariableDeclarationFragment variableDeclarationFragment7 = null;
        boolean boolean8 = cKVisitor4.visit(variableDeclarationFragment7);
        org.eclipse.jdt.core.dom.TagElement tagElement9 = null;
        cKVisitor4.endVisit(tagElement9);
        org.eclipse.jdt.core.dom.ConstructorInvocation constructorInvocation11 = null;
        boolean boolean12 = cKVisitor4.visit(constructorInvocation11);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ASTNode aSTNode5 = null;
        boolean boolean6 = cKVisitor4.preVisit2(aSTNode5);
        org.eclipse.jdt.core.dom.SwitchStatement switchStatement7 = null;
        boolean boolean8 = cKVisitor4.visit(switchStatement7);
        org.eclipse.jdt.core.dom.MarkerAnnotation markerAnnotation9 = null;
        boolean boolean10 = cKVisitor4.visit(markerAnnotation9);
        org.eclipse.jdt.core.dom.CreationReference creationReference11 = null;
        boolean boolean12 = cKVisitor4.visit(creationReference11);
        org.eclipse.jdt.core.dom.BreakStatement breakStatement13 = null;
        cKVisitor4.endVisit(breakStatement13);
        org.eclipse.jdt.core.dom.PrefixExpression prefixExpression15 = null;
        cKVisitor4.endVisit(prefixExpression15);
        org.eclipse.jdt.core.dom.TextElement textElement17 = null;
        cKVisitor4.endVisit(textElement17);
        org.eclipse.jdt.core.dom.TextBlock textBlock19 = null;
        cKVisitor4.endVisit(textBlock19);
        org.eclipse.jdt.core.dom.CreationReference creationReference21 = null;
        cKVisitor4.endVisit(creationReference21);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        cKClassResult4.setFanout((int) 'a');
        int int8 = cKClassResult4.getReturnQty();
        cKClassResult4.setNumberOfMethods((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ASTNode aSTNode5 = null;
        boolean boolean6 = cKVisitor4.preVisit2(aSTNode5);
        org.eclipse.jdt.core.dom.MethodInvocation methodInvocation7 = null;
        boolean boolean8 = cKVisitor4.visit(methodInvocation7);
        org.eclipse.jdt.core.dom.EmptyStatement emptyStatement9 = null;
        cKVisitor4.endVisit(emptyStatement9);
        org.eclipse.jdt.core.dom.ArrayInitializer arrayInitializer11 = null;
        cKVisitor4.endVisit(arrayInitializer11);
        org.eclipse.jdt.core.dom.SwitchExpression switchExpression13 = null;
        cKVisitor4.endVisit(switchExpression13);
        org.eclipse.jdt.core.dom.SimpleName simpleName15 = null;
        boolean boolean16 = cKVisitor4.visit(simpleName15);
        org.eclipse.jdt.core.dom.AnonymousClassDeclaration anonymousClassDeclaration17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = cKVisitor4.visit(anonymousClassDeclaration17);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.NameQualifiedType nameQualifiedType7 = null;
        boolean boolean8 = cKVisitor4.visit(nameQualifiedType7);
        org.eclipse.jdt.core.dom.SimpleName simpleName9 = null;
        boolean boolean10 = cKVisitor4.visit(simpleName9);
        org.eclipse.jdt.core.dom.MethodInvocation methodInvocation11 = null;
        boolean boolean12 = cKVisitor4.visit(methodInvocation11);
        org.eclipse.jdt.core.dom.ClassInstanceCreation classInstanceCreation13 = null;
        cKVisitor4.endVisit(classInstanceCreation13);
        org.eclipse.jdt.core.dom.ArrayInitializer arrayInitializer15 = null;
        cKVisitor4.endVisit(arrayInitializer15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setAnonymousClassesQty((int) (byte) -1);
        java.util.Set<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultSet7 = cKClassResult4.getMethods();
        cKClassResult4.setTightClassCohesion(100.0f);
        org.junit.Assert.assertNotNull(cKMethodResultSet7);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.NameQualifiedType nameQualifiedType7 = null;
        boolean boolean8 = cKVisitor4.visit(nameQualifiedType7);
        org.eclipse.jdt.core.dom.MarkerAnnotation markerAnnotation9 = null;
        cKVisitor4.endVisit(markerAnnotation9);
        org.eclipse.jdt.core.dom.ModuleDeclaration moduleDeclaration11 = null;
        cKVisitor4.endVisit(moduleDeclaration11);
        org.eclipse.jdt.core.dom.InfixExpression infixExpression13 = null;
        boolean boolean14 = cKVisitor4.visit(infixExpression13);
        org.eclipse.jdt.core.dom.ASTNode aSTNode15 = null;
        cKVisitor4.preVisit(aSTNode15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ASTNode aSTNode5 = null;
        boolean boolean6 = cKVisitor4.preVisit2(aSTNode5);
        org.eclipse.jdt.core.dom.SwitchStatement switchStatement7 = null;
        boolean boolean8 = cKVisitor4.visit(switchStatement7);
        org.eclipse.jdt.core.dom.AnnotationTypeDeclaration annotationTypeDeclaration9 = null;
        cKVisitor4.endVisit(annotationTypeDeclaration9);
        org.eclipse.jdt.core.dom.ExpressionMethodReference expressionMethodReference11 = null;
        boolean boolean12 = cKVisitor4.visit(expressionMethodReference11);
        org.eclipse.jdt.core.dom.NormalAnnotation normalAnnotation13 = null;
        cKVisitor4.endVisit(normalAnnotation13);
        org.eclipse.jdt.core.dom.WhileStatement whileStatement15 = null;
        boolean boolean16 = cKVisitor4.visit(whileStatement15);
        org.eclipse.jdt.core.dom.MethodRef methodRef17 = null;
        cKVisitor4.endVisit(methodRef17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.UsesDirective usesDirective9 = null;
        boolean boolean10 = cKVisitor4.visit(usesDirective9);
        org.eclipse.jdt.core.dom.BlockComment blockComment11 = null;
        cKVisitor4.endVisit(blockComment11);
        org.eclipse.jdt.core.dom.ModuleDeclaration moduleDeclaration13 = null;
        cKVisitor4.endVisit(moduleDeclaration13);
        org.eclipse.jdt.core.dom.CatchClause catchClause15 = null;
        boolean boolean16 = cKVisitor4.visit(catchClause15);
        org.eclipse.jdt.core.dom.InstanceofExpression instanceofExpression17 = null;
        cKVisitor4.endVisit(instanceofExpression17);
        org.eclipse.jdt.core.dom.LambdaExpression lambdaExpression19 = null;
        boolean boolean20 = cKVisitor4.visit(lambdaExpression19);
        org.eclipse.jdt.core.dom.ForStatement forStatement21 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(forStatement21);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.IntersectionType intersectionType7 = null;
        boolean boolean8 = cKVisitor4.visit(intersectionType7);
        org.eclipse.jdt.core.dom.UsesDirective usesDirective9 = null;
        cKVisitor4.endVisit(usesDirective9);
        org.eclipse.jdt.core.dom.LambdaExpression lambdaExpression11 = null;
        cKVisitor4.endVisit(lambdaExpression11);
        org.eclipse.jdt.core.dom.Block block13 = null;
        boolean boolean14 = cKVisitor4.visit(block13);
        org.eclipse.jdt.core.dom.AnonymousClassDeclaration anonymousClassDeclaration15 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(anonymousClassDeclaration15);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.ProvidesDirective providesDirective9 = null;
        boolean boolean10 = cKVisitor4.visit(providesDirective9);
        org.eclipse.jdt.core.dom.FieldDeclaration fieldDeclaration11 = null;
        boolean boolean12 = cKVisitor4.visit(fieldDeclaration11);
        org.eclipse.jdt.core.dom.CharacterLiteral characterLiteral13 = null;
        boolean boolean14 = cKVisitor4.visit(characterLiteral13);
        org.eclipse.jdt.core.dom.SwitchExpression switchExpression15 = null;
        cKVisitor4.endVisit(switchExpression15);
        org.eclipse.jdt.core.dom.ModuleDeclaration moduleDeclaration17 = null;
        boolean boolean18 = cKVisitor4.visit(moduleDeclaration17);
        org.eclipse.jdt.core.dom.OpensDirective opensDirective19 = null;
        cKVisitor4.endVisit(opensDirective19);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression9 = null;
        cKVisitor4.endVisit(patternInstanceofExpression9);
        org.eclipse.jdt.core.dom.InstanceofExpression instanceofExpression11 = null;
        cKVisitor4.endVisit(instanceofExpression11);
        org.eclipse.jdt.core.dom.Assignment assignment13 = null;
        cKVisitor4.endVisit(assignment13);
        org.eclipse.jdt.core.dom.ASTNode aSTNode15 = null;
        cKVisitor4.postVisit(aSTNode15);
        org.eclipse.jdt.core.dom.AnnotationTypeDeclaration annotationTypeDeclaration17 = null;
        boolean boolean18 = cKVisitor4.visit(annotationTypeDeclaration17);
        org.eclipse.jdt.core.dom.SwitchExpression switchExpression19 = null;
        boolean boolean20 = cKVisitor4.visit(switchExpression19);
        org.eclipse.jdt.core.dom.Dimension dimension21 = null;
        cKVisitor4.endVisit(dimension21);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.SuperMethodReference superMethodReference7 = null;
        cKVisitor4.endVisit(superMethodReference7);
        org.eclipse.jdt.core.dom.SuperFieldAccess superFieldAccess9 = null;
        cKVisitor4.endVisit(superFieldAccess9);
        org.eclipse.jdt.core.dom.QualifiedName qualifiedName11 = null;
        boolean boolean12 = cKVisitor4.visit(qualifiedName11);
        org.eclipse.jdt.core.dom.SimpleType simpleType13 = null;
        cKVisitor4.endVisit(simpleType13);
        org.eclipse.jdt.core.dom.UnionType unionType15 = null;
        cKVisitor4.endVisit(unionType15);
        org.eclipse.jdt.core.dom.UnionType unionType17 = null;
        boolean boolean18 = cKVisitor4.visit(unionType17);
        org.eclipse.jdt.core.dom.UsesDirective usesDirective19 = null;
        boolean boolean20 = cKVisitor4.visit(usesDirective19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.NameQualifiedType nameQualifiedType7 = null;
        boolean boolean8 = cKVisitor4.visit(nameQualifiedType7);
        org.eclipse.jdt.core.dom.MarkerAnnotation markerAnnotation9 = null;
        cKVisitor4.endVisit(markerAnnotation9);
        org.eclipse.jdt.core.dom.ArrayAccess arrayAccess11 = null;
        cKVisitor4.endVisit(arrayAccess11);
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit13 = null;
        boolean boolean14 = cKVisitor4.visit(compilationUnit13);
        org.eclipse.jdt.core.dom.BlockComment blockComment15 = null;
        boolean boolean16 = cKVisitor4.visit(blockComment15);
        org.eclipse.jdt.core.dom.ASTNode aSTNode17 = null;
        cKVisitor4.preVisit(aSTNode17);
        org.eclipse.jdt.core.dom.QualifiedType qualifiedType19 = null;
        boolean boolean20 = cKVisitor4.visit(qualifiedType19);
        org.eclipse.jdt.core.dom.TypeLiteral typeLiteral21 = null;
        boolean boolean22 = cKVisitor4.visit(typeLiteral21);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setStringLiteralsQty((-1));
        int int7 = cKClassResult4.getCbo();
        java.util.Set<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultSet8 = cKClassResult4.getVisibleMethods();
        int int9 = cKClassResult4.getNumberOfFields();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(cKMethodResultSet8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.EnumConstantDeclaration enumConstantDeclaration7 = null;
        cKVisitor4.endVisit(enumConstantDeclaration7);
        org.eclipse.jdt.core.dom.AssertStatement assertStatement9 = null;
        boolean boolean10 = cKVisitor4.visit(assertStatement9);
        org.eclipse.jdt.core.dom.SynchronizedStatement synchronizedStatement11 = null;
        cKVisitor4.endVisit(synchronizedStatement11);
        org.eclipse.jdt.core.dom.SimpleName simpleName13 = null;
        cKVisitor4.endVisit(simpleName13);
        org.eclipse.jdt.core.dom.WildcardType wildcardType15 = null;
        cKVisitor4.endVisit(wildcardType15);
        org.eclipse.jdt.core.dom.VariableDeclarationFragment variableDeclarationFragment17 = null;
        boolean boolean18 = cKVisitor4.visit(variableDeclarationFragment17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        // The following exception was thrown during execution in test generation
        try {
            com.github.mauricioaniche.ck.ResultWriter resultWriter5 = new com.github.mauricioaniche.ck.ResultWriter("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression9 = null;
        cKVisitor4.endVisit(patternInstanceofExpression9);
        org.eclipse.jdt.core.dom.InstanceofExpression instanceofExpression11 = null;
        cKVisitor4.endVisit(instanceofExpression11);
        org.eclipse.jdt.core.dom.InfixExpression infixExpression13 = null;
        boolean boolean14 = cKVisitor4.visit(infixExpression13);
        org.eclipse.jdt.core.dom.ArrayType arrayType15 = null;
        boolean boolean16 = cKVisitor4.visit(arrayType15);
        org.eclipse.jdt.core.dom.Dimension dimension17 = null;
        cKVisitor4.endVisit(dimension17);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getLambdasQty();
        java.util.Set<java.lang.String> strSet6 = cKMethodResult4.getMethodInvocations();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cKMethodResult4.getVariablesUsage();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strMap7);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.UsesDirective usesDirective7 = null;
        boolean boolean8 = cKVisitor4.visit(usesDirective7);
        org.eclipse.jdt.core.dom.VariableDeclarationExpression variableDeclarationExpression9 = null;
        boolean boolean10 = cKVisitor4.visit(variableDeclarationExpression9);
        org.eclipse.jdt.core.dom.IntersectionType intersectionType11 = null;
        cKVisitor4.endVisit(intersectionType11);
        org.eclipse.jdt.core.dom.BlockComment blockComment13 = null;
        cKVisitor4.endVisit(blockComment13);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.NameQualifiedType nameQualifiedType7 = null;
        boolean boolean8 = cKVisitor4.visit(nameQualifiedType7);
        org.eclipse.jdt.core.dom.SimpleName simpleName9 = null;
        boolean boolean10 = cKVisitor4.visit(simpleName9);
        org.eclipse.jdt.core.dom.MethodInvocation methodInvocation11 = null;
        boolean boolean12 = cKVisitor4.visit(methodInvocation11);
        org.eclipse.jdt.core.dom.SwitchCase switchCase13 = null;
        boolean boolean14 = cKVisitor4.visit(switchCase13);
        org.eclipse.jdt.core.dom.BlockComment blockComment15 = null;
        cKVisitor4.endVisit(blockComment15);
        org.eclipse.jdt.core.dom.ModuleQualifiedName moduleQualifiedName17 = null;
        cKVisitor4.endVisit(moduleQualifiedName17);
        org.eclipse.jdt.core.dom.LambdaExpression lambdaExpression19 = null;
        cKVisitor4.endVisit(lambdaExpression19);
        org.eclipse.jdt.core.dom.Modifier modifier21 = null;
        cKVisitor4.endVisit(modifier21);
        org.eclipse.jdt.core.dom.MarkerAnnotation markerAnnotation23 = null;
        boolean boolean24 = cKVisitor4.visit(markerAnnotation23);
        java.util.Set<com.github.mauricioaniche.ck.CKClassResult> cKClassResultSet25 = cKVisitor4.getCollectedClasses();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(cKClassResultSet25);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        cKClassResult4.setInnerClassesQty((int) (short) 100);
        cKClassResult4.setAnonymousClassesQty((int) (byte) 1);
        cKClassResult4.setLoopQty(1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression9 = null;
        cKVisitor4.endVisit(patternInstanceofExpression9);
        org.eclipse.jdt.core.dom.InstanceofExpression instanceofExpression11 = null;
        cKVisitor4.endVisit(instanceofExpression11);
        org.eclipse.jdt.core.dom.ParameterizedType parameterizedType13 = null;
        boolean boolean14 = cKVisitor4.visit(parameterizedType13);
        org.eclipse.jdt.core.dom.Dimension dimension15 = null;
        boolean boolean16 = cKVisitor4.visit(dimension15);
        org.eclipse.jdt.core.dom.ExpressionStatement expressionStatement17 = null;
        boolean boolean18 = cKVisitor4.visit(expressionStatement17);
        org.eclipse.jdt.core.dom.FieldDeclaration fieldDeclaration19 = null;
        boolean boolean20 = cKVisitor4.visit(fieldDeclaration19);
        org.eclipse.jdt.core.dom.Dimension dimension21 = null;
        boolean boolean22 = cKVisitor4.visit(dimension21);
        org.eclipse.jdt.core.dom.UsesDirective usesDirective23 = null;
        boolean boolean24 = cKVisitor4.visit(usesDirective23);
        java.util.Set<com.github.mauricioaniche.ck.CKClassResult> cKClassResultSet25 = cKVisitor4.getCollectedClasses();
        org.eclipse.jdt.core.dom.UsesDirective usesDirective26 = null;
        boolean boolean27 = cKVisitor4.visit(usesDirective26);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(cKClassResultSet25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.IntersectionType intersectionType7 = null;
        boolean boolean8 = cKVisitor4.visit(intersectionType7);
        org.eclipse.jdt.core.dom.VariableDeclarationFragment variableDeclarationFragment9 = null;
        boolean boolean10 = cKVisitor4.visit(variableDeclarationFragment9);
        org.eclipse.jdt.core.dom.ASTNode aSTNode11 = null;
        cKVisitor4.preVisit(aSTNode11);
        org.eclipse.jdt.core.dom.ThrowStatement throwStatement13 = null;
        cKVisitor4.endVisit(throwStatement13);
        org.eclipse.jdt.core.dom.SingleMemberAnnotation singleMemberAnnotation15 = null;
        boolean boolean16 = cKVisitor4.visit(singleMemberAnnotation15);
        org.eclipse.jdt.core.dom.ExportsDirective exportsDirective17 = null;
        cKVisitor4.endVisit(exportsDirective17);
        org.eclipse.jdt.core.dom.MethodRef methodRef19 = null;
        boolean boolean20 = cKVisitor4.visit(methodRef19);
        org.eclipse.jdt.core.dom.ContinueStatement continueStatement21 = null;
        cKVisitor4.endVisit(continueStatement21);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getAssignmentsQty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.EnumConstantDeclaration enumConstantDeclaration7 = null;
        cKVisitor4.endVisit(enumConstantDeclaration7);
        org.eclipse.jdt.core.dom.NormalAnnotation normalAnnotation9 = null;
        boolean boolean10 = cKVisitor4.visit(normalAnnotation9);
        java.util.Set<com.github.mauricioaniche.ck.CKClassResult> cKClassResultSet11 = cKVisitor4.getCollectedClasses();
        org.eclipse.jdt.core.dom.TextElement textElement12 = null;
        cKVisitor4.endVisit(textElement12);
        org.eclipse.jdt.core.dom.TryStatement tryStatement14 = null;
        cKVisitor4.endVisit(tryStatement14);
        org.eclipse.jdt.core.dom.UnionType unionType16 = null;
        boolean boolean17 = cKVisitor4.visit(unionType16);
        org.eclipse.jdt.core.dom.VariableDeclarationStatement variableDeclarationStatement18 = null;
        boolean boolean19 = cKVisitor4.visit(variableDeclarationStatement18);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(cKClassResultSet11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression5 = null;
        boolean boolean6 = cKVisitor4.visit(patternInstanceofExpression5);
        org.eclipse.jdt.core.dom.ForStatement forStatement7 = null;
        boolean boolean8 = cKVisitor4.visit(forStatement7);
        org.eclipse.jdt.core.dom.SuperMethodInvocation superMethodInvocation9 = null;
        boolean boolean10 = cKVisitor4.visit(superMethodInvocation9);
        org.eclipse.jdt.core.dom.SingleMemberAnnotation singleMemberAnnotation11 = null;
        cKVisitor4.endVisit(singleMemberAnnotation11);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.ProvidesDirective providesDirective9 = null;
        boolean boolean10 = cKVisitor4.visit(providesDirective9);
        org.eclipse.jdt.core.dom.ThisExpression thisExpression11 = null;
        cKVisitor4.endVisit(thisExpression11);
        org.eclipse.jdt.core.dom.ContinueStatement continueStatement13 = null;
        boolean boolean14 = cKVisitor4.visit(continueStatement13);
        org.eclipse.jdt.core.dom.VariableDeclarationStatement variableDeclarationStatement15 = null;
        cKVisitor4.endVisit(variableDeclarationStatement15);
        org.eclipse.jdt.core.dom.InfixExpression infixExpression17 = null;
        boolean boolean18 = cKVisitor4.visit(infixExpression17);
        org.eclipse.jdt.core.dom.AnnotationTypeMemberDeclaration annotationTypeMemberDeclaration19 = null;
        cKVisitor4.endVisit(annotationTypeMemberDeclaration19);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getLcom();
        cKClassResult4.setLcom((int) '#');
        cKClassResult4.setDit(10);
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit13 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable14 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable15 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor16 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit13, classLevelMetricListCallable14, methodLevelMetricListCallable15);
        org.eclipse.jdt.core.dom.ASTNode aSTNode17 = null;
        boolean boolean18 = cKVisitor16.preVisit2(aSTNode17);
        org.eclipse.jdt.core.dom.VariableDeclarationFragment variableDeclarationFragment19 = null;
        boolean boolean20 = cKVisitor16.visit(variableDeclarationFragment19);
        org.eclipse.jdt.core.dom.ModuleQualifiedName moduleQualifiedName21 = null;
        boolean boolean22 = cKVisitor16.visit(moduleQualifiedName21);
        boolean boolean23 = cKClassResult4.equals((java.lang.Object) cKVisitor16);
        org.eclipse.jdt.core.dom.BlockComment blockComment24 = null;
        boolean boolean25 = cKVisitor16.visit(blockComment24);
        org.eclipse.jdt.core.dom.TypeDeclarationStatement typeDeclarationStatement26 = null;
        boolean boolean27 = cKVisitor16.visit(typeDeclarationStatement26);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ASTNode aSTNode5 = null;
        boolean boolean6 = cKVisitor4.preVisit2(aSTNode5);
        org.eclipse.jdt.core.dom.MethodInvocation methodInvocation7 = null;
        boolean boolean8 = cKVisitor4.visit(methodInvocation7);
        org.eclipse.jdt.core.dom.EmptyStatement emptyStatement9 = null;
        cKVisitor4.endVisit(emptyStatement9);
        org.eclipse.jdt.core.dom.SingleVariableDeclaration singleVariableDeclaration11 = null;
        boolean boolean12 = cKVisitor4.visit(singleVariableDeclaration11);
        org.eclipse.jdt.core.dom.ContinueStatement continueStatement13 = null;
        boolean boolean14 = cKVisitor4.visit(continueStatement13);
        org.eclipse.jdt.core.dom.RequiresDirective requiresDirective15 = null;
        boolean boolean16 = cKVisitor4.visit(requiresDirective15);
        org.eclipse.jdt.core.dom.TypeDeclaration typeDeclaration17 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(typeDeclaration17);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ASTNode aSTNode5 = null;
        boolean boolean6 = cKVisitor4.preVisit2(aSTNode5);
        org.eclipse.jdt.core.dom.SwitchStatement switchStatement7 = null;
        boolean boolean8 = cKVisitor4.visit(switchStatement7);
        org.eclipse.jdt.core.dom.MarkerAnnotation markerAnnotation9 = null;
        boolean boolean10 = cKVisitor4.visit(markerAnnotation9);
        org.eclipse.jdt.core.dom.CreationReference creationReference11 = null;
        boolean boolean12 = cKVisitor4.visit(creationReference11);
        org.eclipse.jdt.core.dom.BreakStatement breakStatement13 = null;
        cKVisitor4.endVisit(breakStatement13);
        org.eclipse.jdt.core.dom.MarkerAnnotation markerAnnotation15 = null;
        cKVisitor4.endVisit(markerAnnotation15);
        org.eclipse.jdt.core.dom.EmptyStatement emptyStatement17 = null;
        cKVisitor4.endVisit(emptyStatement17);
        org.eclipse.jdt.core.dom.Block block19 = null;
        boolean boolean20 = cKVisitor4.visit(block19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression9 = null;
        cKVisitor4.endVisit(patternInstanceofExpression9);
        org.eclipse.jdt.core.dom.InstanceofExpression instanceofExpression11 = null;
        cKVisitor4.endVisit(instanceofExpression11);
        org.eclipse.jdt.core.dom.ParameterizedType parameterizedType13 = null;
        boolean boolean14 = cKVisitor4.visit(parameterizedType13);
        org.eclipse.jdt.core.dom.Dimension dimension15 = null;
        boolean boolean16 = cKVisitor4.visit(dimension15);
        org.eclipse.jdt.core.dom.ExpressionStatement expressionStatement17 = null;
        boolean boolean18 = cKVisitor4.visit(expressionStatement17);
        org.eclipse.jdt.core.dom.FieldDeclaration fieldDeclaration19 = null;
        boolean boolean20 = cKVisitor4.visit(fieldDeclaration19);
        org.eclipse.jdt.core.dom.TypeDeclaration typeDeclaration21 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = cKVisitor4.visit(typeDeclaration21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MarkerAnnotation markerAnnotation5 = null;
        boolean boolean6 = cKVisitor4.visit(markerAnnotation5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getUniqueWordsQty();
        int int7 = cKClassResult4.getUniqueWordsQty();
        int int8 = cKClassResult4.getNumberOfStaticFields();
        int int9 = cKClassResult4.getNumberOfAbstractMethods();
        int int10 = cKClassResult4.getWmc();
        int int11 = cKClassResult4.getRfc();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ASTNode aSTNode5 = null;
        boolean boolean6 = cKVisitor4.preVisit2(aSTNode5);
        org.eclipse.jdt.core.dom.SwitchStatement switchStatement7 = null;
        boolean boolean8 = cKVisitor4.visit(switchStatement7);
        org.eclipse.jdt.core.dom.MarkerAnnotation markerAnnotation9 = null;
        boolean boolean10 = cKVisitor4.visit(markerAnnotation9);
        org.eclipse.jdt.core.dom.ConstructorInvocation constructorInvocation11 = null;
        boolean boolean12 = cKVisitor4.visit(constructorInvocation11);
        org.eclipse.jdt.core.dom.ArrayAccess arrayAccess13 = null;
        cKVisitor4.endVisit(arrayAccess13);
        org.eclipse.jdt.core.dom.PackageDeclaration packageDeclaration15 = null;
        boolean boolean16 = cKVisitor4.visit(packageDeclaration15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.IntersectionType intersectionType7 = null;
        boolean boolean8 = cKVisitor4.visit(intersectionType7);
        org.eclipse.jdt.core.dom.ExportsDirective exportsDirective9 = null;
        boolean boolean10 = cKVisitor4.visit(exportsDirective9);
        org.eclipse.jdt.core.dom.UnionType unionType11 = null;
        cKVisitor4.endVisit(unionType11);
        org.eclipse.jdt.core.dom.ASTNode aSTNode13 = null;
        boolean boolean14 = cKVisitor4.preVisit2(aSTNode13);
        org.eclipse.jdt.core.dom.SingleMemberAnnotation singleMemberAnnotation15 = null;
        boolean boolean16 = cKVisitor4.visit(singleMemberAnnotation15);
        org.eclipse.jdt.core.dom.QualifiedName qualifiedName17 = null;
        cKVisitor4.endVisit(qualifiedName17);
        org.eclipse.jdt.core.dom.EnumConstantDeclaration enumConstantDeclaration19 = null;
        cKVisitor4.endVisit(enumConstantDeclaration19);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression9 = null;
        cKVisitor4.endVisit(patternInstanceofExpression9);
        org.eclipse.jdt.core.dom.InstanceofExpression instanceofExpression11 = null;
        cKVisitor4.endVisit(instanceofExpression11);
        org.eclipse.jdt.core.dom.Assignment assignment13 = null;
        cKVisitor4.endVisit(assignment13);
        org.eclipse.jdt.core.dom.SimpleType simpleType15 = null;
        cKVisitor4.endVisit(simpleType15);
        org.eclipse.jdt.core.dom.Block block17 = null;
        boolean boolean18 = cKVisitor4.visit(block17);
        org.eclipse.jdt.core.dom.VariableDeclarationExpression variableDeclarationExpression19 = null;
        cKVisitor4.endVisit(variableDeclarationExpression19);
        org.eclipse.jdt.core.dom.MethodDeclaration methodDeclaration21 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = cKVisitor4.visit(methodDeclaration21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getUniqueWordsQty();
        int int6 = cKMethodResult4.getAssignmentsQty();
        cKMethodResult4.setTryCatchQty((int) (byte) 0);
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult13 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet14 = cKMethodResult13.getMethodInvocations();
        java.util.Set<java.lang.String> strSet15 = cKMethodResult13.getMethodInvocationsLocal();
        int int16 = cKMethodResult13.getLambdasQty();
        cKMethodResult13.setParenthesizedExpsQty((int) (short) -1);
        java.util.Set<java.lang.String> strSet19 = cKMethodResult13.getFieldsAccessed();
        cKMethodResult4.setMethodInvocationLocal(strSet19);
        java.lang.String str21 = cKMethodResult4.getMethodName();
        cKMethodResult4.setStringLiteralsQty((int) (byte) -1);
        int int24 = cKMethodResult4.getAssignmentsQty();
        cKMethodResult4.setVariablesQty((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(strSet15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.IntersectionType intersectionType7 = null;
        boolean boolean8 = cKVisitor4.visit(intersectionType7);
        org.eclipse.jdt.core.dom.UsesDirective usesDirective9 = null;
        cKVisitor4.endVisit(usesDirective9);
        org.eclipse.jdt.core.dom.LambdaExpression lambdaExpression11 = null;
        cKVisitor4.endVisit(lambdaExpression11);
        org.eclipse.jdt.core.dom.Block block13 = null;
        boolean boolean14 = cKVisitor4.visit(block13);
        org.eclipse.jdt.core.dom.TextBlock textBlock15 = null;
        cKVisitor4.endVisit(textBlock15);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        int int6 = cKMethodResult4.getStringLiteralsQty();
        cKMethodResult4.setWmc((int) (byte) 10);
        int int9 = cKMethodResult4.getMathOperationsQty();
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult14 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int15 = cKMethodResult14.getUniqueWordsQty();
        int int16 = cKMethodResult14.getAssignmentsQty();
        cKMethodResult14.setTryCatchQty((int) (byte) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = cKMethodResult14.getFieldUsage();
        cKMethodResult4.setVariablesUsage(strMap19);
        boolean boolean21 = cKMethodResult4.getHasJavadoc();
        int int22 = cKMethodResult4.getCbo();
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.EnumConstantDeclaration enumConstantDeclaration7 = null;
        cKVisitor4.endVisit(enumConstantDeclaration7);
        org.eclipse.jdt.core.dom.YieldStatement yieldStatement9 = null;
        cKVisitor4.endVisit(yieldStatement9);
        org.eclipse.jdt.core.dom.DoStatement doStatement11 = null;
        boolean boolean12 = cKVisitor4.visit(doStatement11);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression9 = null;
        cKVisitor4.endVisit(patternInstanceofExpression9);
        org.eclipse.jdt.core.dom.BlockComment blockComment11 = null;
        boolean boolean12 = cKVisitor4.visit(blockComment11);
        org.eclipse.jdt.core.dom.UnionType unionType13 = null;
        boolean boolean14 = cKVisitor4.visit(unionType13);
        org.eclipse.jdt.core.dom.NameQualifiedType nameQualifiedType15 = null;
        cKVisitor4.endVisit(nameQualifiedType15);
        org.eclipse.jdt.core.dom.UsesDirective usesDirective17 = null;
        cKVisitor4.endVisit(usesDirective17);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.EnumConstantDeclaration enumConstantDeclaration7 = null;
        cKVisitor4.endVisit(enumConstantDeclaration7);
        org.eclipse.jdt.core.dom.AssertStatement assertStatement9 = null;
        boolean boolean10 = cKVisitor4.visit(assertStatement9);
        org.eclipse.jdt.core.dom.Dimension dimension11 = null;
        cKVisitor4.endVisit(dimension11);
        org.eclipse.jdt.core.dom.InstanceofExpression instanceofExpression13 = null;
        boolean boolean14 = cKVisitor4.visit(instanceofExpression13);
        org.eclipse.jdt.core.dom.ImportDeclaration importDeclaration15 = null;
        cKVisitor4.endVisit(importDeclaration15);
        org.eclipse.jdt.core.dom.Modifier modifier17 = null;
        cKVisitor4.endVisit(modifier17);
        org.eclipse.jdt.core.dom.ConstructorInvocation constructorInvocation19 = null;
        boolean boolean20 = cKVisitor4.visit(constructorInvocation19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getUniqueWordsQty();
        int int6 = cKMethodResult4.getNumbersQty();
        int int7 = cKMethodResult4.getStartLine();
        boolean boolean8 = cKMethodResult4.getHasJavadoc();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        cKMethodResult4.setLoc((int) (byte) 100);
        cKMethodResult4.setTryCatchQty((int) (byte) -1);
        int int9 = cKMethodResult4.getNumbersQty();
        cKMethodResult4.setAnonymousClassesQty((int) '#');
        int int12 = cKMethodResult4.getModifiers();
        int int13 = cKMethodResult4.getFanin();
        int int14 = cKMethodResult4.getNumbersQty();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression9 = null;
        cKVisitor4.endVisit(patternInstanceofExpression9);
        org.eclipse.jdt.core.dom.InstanceofExpression instanceofExpression11 = null;
        cKVisitor4.endVisit(instanceofExpression11);
        org.eclipse.jdt.core.dom.InfixExpression infixExpression13 = null;
        boolean boolean14 = cKVisitor4.visit(infixExpression13);
        org.eclipse.jdt.core.dom.CharacterLiteral characterLiteral15 = null;
        cKVisitor4.endVisit(characterLiteral15);
        org.eclipse.jdt.core.dom.SwitchExpression switchExpression17 = null;
        cKVisitor4.endVisit(switchExpression17);
        org.eclipse.jdt.core.dom.LabeledStatement labeledStatement19 = null;
        cKVisitor4.endVisit(labeledStatement19);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.EnumConstantDeclaration enumConstantDeclaration7 = null;
        cKVisitor4.endVisit(enumConstantDeclaration7);
        org.eclipse.jdt.core.dom.AssertStatement assertStatement9 = null;
        boolean boolean10 = cKVisitor4.visit(assertStatement9);
        org.eclipse.jdt.core.dom.ConstructorInvocation constructorInvocation11 = null;
        boolean boolean12 = cKVisitor4.visit(constructorInvocation11);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.UsesDirective usesDirective9 = null;
        boolean boolean10 = cKVisitor4.visit(usesDirective9);
        org.eclipse.jdt.core.dom.BlockComment blockComment11 = null;
        cKVisitor4.endVisit(blockComment11);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression13 = null;
        boolean boolean14 = cKVisitor4.visit(patternInstanceofExpression13);
        org.eclipse.jdt.core.dom.TagElement tagElement15 = null;
        cKVisitor4.endVisit(tagElement15);
        org.eclipse.jdt.core.dom.EnumDeclaration enumDeclaration17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = cKVisitor4.visit(enumDeclaration17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression9 = null;
        cKVisitor4.endVisit(patternInstanceofExpression9);
        org.eclipse.jdt.core.dom.BlockComment blockComment11 = null;
        boolean boolean12 = cKVisitor4.visit(blockComment11);
        org.eclipse.jdt.core.dom.UnionType unionType13 = null;
        boolean boolean14 = cKVisitor4.visit(unionType13);
        org.eclipse.jdt.core.dom.Dimension dimension15 = null;
        cKVisitor4.endVisit(dimension15);
        org.eclipse.jdt.core.dom.MethodDeclaration methodDeclaration17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = cKVisitor4.visit(methodDeclaration17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ASTNode aSTNode5 = null;
        boolean boolean6 = cKVisitor4.preVisit2(aSTNode5);
        org.eclipse.jdt.core.dom.SwitchStatement switchStatement7 = null;
        boolean boolean8 = cKVisitor4.visit(switchStatement7);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression9 = null;
        boolean boolean10 = cKVisitor4.visit(patternInstanceofExpression9);
        org.eclipse.jdt.core.dom.TypeDeclarationStatement typeDeclarationStatement11 = null;
        cKVisitor4.endVisit(typeDeclarationStatement11);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation13 = null;
        cKVisitor4.endVisit(arrayCreation13);
        org.eclipse.jdt.core.dom.VariableDeclarationFragment variableDeclarationFragment15 = null;
        cKVisitor4.endVisit(variableDeclarationFragment15);
        org.eclipse.jdt.core.dom.AssertStatement assertStatement17 = null;
        boolean boolean18 = cKVisitor4.visit(assertStatement17);
        org.eclipse.jdt.core.dom.ASTNode aSTNode19 = null;
        cKVisitor4.preVisit(aSTNode19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "hi!", false, (int) (byte) 0);
        cKMethodResult4.setFanout(1);
        cKMethodResult4.setCbo(10);
        int int9 = cKMethodResult4.getAnonymousClassesQty();
        int int10 = cKMethodResult4.getNumbersQty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = cKMethodResult4.getFieldUsage();
        cKMethodResult4.setMaxNestedBlocks((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(strMap11);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setStringLiteralsQty((-1));
        int int7 = cKClassResult4.getMaxNestedBlocks();
        float float8 = cKClassResult4.getLcomNormalized();
        java.lang.String str9 = cKClassResult4.toString();
        cKClassResult4.setNumberOfPublicFields((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CKClassResult [file=, className=CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}]" + "'", str9, "CKClassResult [file=, className=CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}]");
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", true, 0);
        boolean boolean5 = cKMethodResult4.getIsVisible();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ASTNode aSTNode5 = null;
        boolean boolean6 = cKVisitor4.preVisit2(aSTNode5);
        org.eclipse.jdt.core.dom.SwitchStatement switchStatement7 = null;
        boolean boolean8 = cKVisitor4.visit(switchStatement7);
        org.eclipse.jdt.core.dom.VariableDeclarationFragment variableDeclarationFragment9 = null;
        cKVisitor4.endVisit(variableDeclarationFragment9);
        org.eclipse.jdt.core.dom.CreationReference creationReference11 = null;
        boolean boolean12 = cKVisitor4.visit(creationReference11);
        org.eclipse.jdt.core.dom.PostfixExpression postfixExpression13 = null;
        cKVisitor4.endVisit(postfixExpression13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ASTNode aSTNode5 = null;
        boolean boolean6 = cKVisitor4.preVisit2(aSTNode5);
        org.eclipse.jdt.core.dom.SwitchStatement switchStatement7 = null;
        boolean boolean8 = cKVisitor4.visit(switchStatement7);
        org.eclipse.jdt.core.dom.MarkerAnnotation markerAnnotation9 = null;
        boolean boolean10 = cKVisitor4.visit(markerAnnotation9);
        org.eclipse.jdt.core.dom.BooleanLiteral booleanLiteral11 = null;
        boolean boolean12 = cKVisitor4.visit(booleanLiteral11);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.NameQualifiedType nameQualifiedType7 = null;
        boolean boolean8 = cKVisitor4.visit(nameQualifiedType7);
        org.eclipse.jdt.core.dom.MarkerAnnotation markerAnnotation9 = null;
        cKVisitor4.endVisit(markerAnnotation9);
        org.eclipse.jdt.core.dom.ArrayAccess arrayAccess11 = null;
        cKVisitor4.endVisit(arrayAccess11);
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit13 = null;
        boolean boolean14 = cKVisitor4.visit(compilationUnit13);
        org.eclipse.jdt.core.dom.ContinueStatement continueStatement15 = null;
        cKVisitor4.endVisit(continueStatement15);
        org.eclipse.jdt.core.dom.TextBlock textBlock17 = null;
        boolean boolean18 = cKVisitor4.visit(textBlock17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression9 = null;
        cKVisitor4.endVisit(patternInstanceofExpression9);
        org.eclipse.jdt.core.dom.InstanceofExpression instanceofExpression11 = null;
        cKVisitor4.endVisit(instanceofExpression11);
        org.eclipse.jdt.core.dom.Assignment assignment13 = null;
        cKVisitor4.endVisit(assignment13);
        org.eclipse.jdt.core.dom.SimpleType simpleType15 = null;
        cKVisitor4.endVisit(simpleType15);
        org.eclipse.jdt.core.dom.Block block17 = null;
        boolean boolean18 = cKVisitor4.visit(block17);
        org.eclipse.jdt.core.dom.VariableDeclarationExpression variableDeclarationExpression19 = null;
        cKVisitor4.endVisit(variableDeclarationExpression19);
        org.eclipse.jdt.core.dom.ModuleQualifiedName moduleQualifiedName21 = null;
        cKVisitor4.endVisit(moduleQualifiedName21);
        org.eclipse.jdt.core.dom.VariableDeclarationExpression variableDeclarationExpression23 = null;
        cKVisitor4.endVisit(variableDeclarationExpression23);
        org.eclipse.jdt.core.dom.SwitchStatement switchStatement25 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(switchStatement25);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setAnonymousClassesQty((int) (byte) -1);
        int int7 = cKClassResult4.getNumberOfSynchronizedFields();
        cKClassResult4.setRfc((-1));
        int int10 = cKClassResult4.getNumberOfProtectedFields();
        int int11 = cKClassResult4.getComparisonsQty();
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult16 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet17 = cKMethodResult16.getMethodInvocations();
        java.util.Set<java.lang.String> strSet18 = cKMethodResult16.getMethodInvocationsLocal();
        int int19 = cKMethodResult16.getWmc();
        java.util.Set<java.lang.String> strSet20 = cKMethodResult16.getMethodInvocations();
        cKClassResult4.setFieldNames(strSet20);
        int int22 = cKClassResult4.getLoc();
        cKClassResult4.setMaxNestedBlocks((int) (byte) 100);
        cKClassResult4.setNumberOfAbstractMethods((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(strSet18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        cKMethodResult4.setAssignmentsQty((int) (short) -1);
        cKMethodResult4.setRfc((int) '4');
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        java.util.Set<java.lang.String> strSet6 = cKMethodResult4.getMethodInvocationsLocal();
        java.util.Set<java.lang.String> strSet7 = cKMethodResult4.getFieldsAccessed();
        int int8 = cKMethodResult4.getComparisonsQty();
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit10 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable11 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable12 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor13 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit10, classLevelMetricListCallable11, methodLevelMetricListCallable12);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression14 = null;
        cKVisitor13.endVisit(parenthesizedExpression14);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation16 = null;
        cKVisitor13.endVisit(arrayCreation16);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression18 = null;
        cKVisitor13.endVisit(patternInstanceofExpression18);
        org.eclipse.jdt.core.dom.InstanceofExpression instanceofExpression20 = null;
        cKVisitor13.endVisit(instanceofExpression20);
        org.eclipse.jdt.core.dom.Assignment assignment22 = null;
        cKVisitor13.endVisit(assignment22);
        org.eclipse.jdt.core.dom.TypeLiteral typeLiteral24 = null;
        boolean boolean25 = cKVisitor13.visit(typeLiteral24);
        org.eclipse.jdt.core.dom.VariableDeclarationStatement variableDeclarationStatement26 = null;
        cKVisitor13.endVisit(variableDeclarationStatement26);
        org.eclipse.jdt.core.dom.DoStatement doStatement28 = null;
        boolean boolean29 = cKVisitor13.visit(doStatement28);
        org.eclipse.jdt.core.dom.TypeMethodReference typeMethodReference30 = null;
        boolean boolean31 = cKVisitor13.visit(typeMethodReference30);
        boolean boolean32 = cKMethodResult4.equals((java.lang.Object) cKVisitor13);
        org.eclipse.jdt.core.dom.ArrayInitializer arrayInitializer33 = null;
        boolean boolean34 = cKVisitor13.visit(arrayInitializer33);
        org.eclipse.jdt.core.dom.SwitchExpression switchExpression35 = null;
        boolean boolean36 = cKVisitor13.visit(switchExpression35);
        org.eclipse.jdt.core.dom.ModuleQualifiedName moduleQualifiedName37 = null;
        boolean boolean38 = cKVisitor13.visit(moduleQualifiedName37);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ASTNode aSTNode5 = null;
        boolean boolean6 = cKVisitor4.preVisit2(aSTNode5);
        org.eclipse.jdt.core.dom.MethodInvocation methodInvocation7 = null;
        boolean boolean8 = cKVisitor4.visit(methodInvocation7);
        org.eclipse.jdt.core.dom.EmptyStatement emptyStatement9 = null;
        cKVisitor4.endVisit(emptyStatement9);
        org.eclipse.jdt.core.dom.Modifier modifier11 = null;
        boolean boolean12 = cKVisitor4.visit(modifier11);
        org.eclipse.jdt.core.dom.SuperMethodReference superMethodReference13 = null;
        boolean boolean14 = cKVisitor4.visit(superMethodReference13);
        org.eclipse.jdt.core.dom.ExpressionMethodReference expressionMethodReference15 = null;
        cKVisitor4.endVisit(expressionMethodReference15);
        org.eclipse.jdt.core.dom.NullLiteral nullLiteral17 = null;
        boolean boolean18 = cKVisitor4.visit(nullLiteral17);
        org.eclipse.jdt.core.dom.ExpressionMethodReference expressionMethodReference19 = null;
        boolean boolean20 = cKVisitor4.visit(expressionMethodReference19);
        org.eclipse.jdt.core.dom.ReturnStatement returnStatement21 = null;
        boolean boolean22 = cKVisitor4.visit(returnStatement21);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.NameQualifiedType nameQualifiedType7 = null;
        boolean boolean8 = cKVisitor4.visit(nameQualifiedType7);
        org.eclipse.jdt.core.dom.SimpleName simpleName9 = null;
        boolean boolean10 = cKVisitor4.visit(simpleName9);
        org.eclipse.jdt.core.dom.OpensDirective opensDirective11 = null;
        cKVisitor4.endVisit(opensDirective11);
        org.eclipse.jdt.core.dom.BreakStatement breakStatement13 = null;
        cKVisitor4.endVisit(breakStatement13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ASTNode aSTNode5 = null;
        boolean boolean6 = cKVisitor4.preVisit2(aSTNode5);
        org.eclipse.jdt.core.dom.SwitchStatement switchStatement7 = null;
        boolean boolean8 = cKVisitor4.visit(switchStatement7);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression9 = null;
        boolean boolean10 = cKVisitor4.visit(patternInstanceofExpression9);
        org.eclipse.jdt.core.dom.TypeDeclarationStatement typeDeclarationStatement11 = null;
        cKVisitor4.endVisit(typeDeclarationStatement11);
        org.eclipse.jdt.core.dom.SuperMethodReference superMethodReference13 = null;
        cKVisitor4.endVisit(superMethodReference13);
        org.eclipse.jdt.core.dom.Assignment assignment15 = null;
        boolean boolean16 = cKVisitor4.visit(assignment15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ASTNode aSTNode5 = null;
        boolean boolean6 = cKVisitor4.preVisit2(aSTNode5);
        org.eclipse.jdt.core.dom.SwitchStatement switchStatement7 = null;
        boolean boolean8 = cKVisitor4.visit(switchStatement7);
        org.eclipse.jdt.core.dom.ClassInstanceCreation classInstanceCreation9 = null;
        cKVisitor4.endVisit(classInstanceCreation9);
        org.eclipse.jdt.core.dom.SingleMemberAnnotation singleMemberAnnotation11 = null;
        cKVisitor4.endVisit(singleMemberAnnotation11);
        org.eclipse.jdt.core.dom.TypeParameter typeParameter13 = null;
        cKVisitor4.endVisit(typeParameter13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        cKClassResult4.setInnerClassesQty((int) (short) 100);
        cKClassResult4.setParenthesizedExpsQty((int) '4');
        cKClassResult4.setNumberOfPublicFields((int) (byte) 10);
        int int12 = cKClassResult4.getNumberOfPrivateFields();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.EnumConstantDeclaration enumConstantDeclaration7 = null;
        cKVisitor4.endVisit(enumConstantDeclaration7);
        org.eclipse.jdt.core.dom.NormalAnnotation normalAnnotation9 = null;
        cKVisitor4.endVisit(normalAnnotation9);
        org.eclipse.jdt.core.dom.NumberLiteral numberLiteral11 = null;
        boolean boolean12 = cKVisitor4.visit(numberLiteral11);
        org.eclipse.jdt.core.dom.UnionType unionType13 = null;
        boolean boolean14 = cKVisitor4.visit(unionType13);
        org.eclipse.jdt.core.dom.SimpleName simpleName15 = null;
        cKVisitor4.endVisit(simpleName15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.NameQualifiedType nameQualifiedType7 = null;
        boolean boolean8 = cKVisitor4.visit(nameQualifiedType7);
        org.eclipse.jdt.core.dom.SimpleName simpleName9 = null;
        boolean boolean10 = cKVisitor4.visit(simpleName9);
        org.eclipse.jdt.core.dom.MethodInvocation methodInvocation11 = null;
        boolean boolean12 = cKVisitor4.visit(methodInvocation11);
        org.eclipse.jdt.core.dom.SwitchCase switchCase13 = null;
        boolean boolean14 = cKVisitor4.visit(switchCase13);
        org.eclipse.jdt.core.dom.EmptyStatement emptyStatement15 = null;
        boolean boolean16 = cKVisitor4.visit(emptyStatement15);
        org.eclipse.jdt.core.dom.MethodRef methodRef17 = null;
        boolean boolean18 = cKVisitor4.visit(methodRef17);
        org.eclipse.jdt.core.dom.DoStatement doStatement19 = null;
        boolean boolean20 = cKVisitor4.visit(doStatement19);
        org.eclipse.jdt.core.dom.WildcardType wildcardType21 = null;
        cKVisitor4.endVisit(wildcardType21);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ProvidesDirective providesDirective7 = null;
        cKVisitor4.endVisit(providesDirective7);
        org.eclipse.jdt.core.dom.SwitchCase switchCase9 = null;
        boolean boolean10 = cKVisitor4.visit(switchCase9);
        org.eclipse.jdt.core.dom.MemberValuePair memberValuePair11 = null;
        cKVisitor4.endVisit(memberValuePair11);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        cKMethodResult4.setLoc((int) (byte) 100);
        cKMethodResult4.setTryCatchQty((int) (byte) -1);
        cKMethodResult4.setCbo(0);
        cKMethodResult4.setLambdasQty((int) (byte) 100);
        java.util.Map<java.lang.String, java.util.Set<java.lang.String>> strMap13 = null;
        cKMethodResult4.setMethodInvocationsIndirectLocal(strMap13);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.ContinueStatement continueStatement9 = null;
        cKVisitor4.endVisit(continueStatement9);
        org.eclipse.jdt.core.dom.SingleVariableDeclaration singleVariableDeclaration11 = null;
        boolean boolean12 = cKVisitor4.visit(singleVariableDeclaration11);
        org.eclipse.jdt.core.dom.ConditionalExpression conditionalExpression13 = null;
        boolean boolean14 = cKVisitor4.visit(conditionalExpression13);
        org.eclipse.jdt.core.dom.SimpleType simpleType15 = null;
        cKVisitor4.endVisit(simpleType15);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression9 = null;
        cKVisitor4.endVisit(patternInstanceofExpression9);
        org.eclipse.jdt.core.dom.InstanceofExpression instanceofExpression11 = null;
        cKVisitor4.endVisit(instanceofExpression11);
        org.eclipse.jdt.core.dom.Assignment assignment13 = null;
        cKVisitor4.endVisit(assignment13);
        org.eclipse.jdt.core.dom.SimpleType simpleType15 = null;
        cKVisitor4.endVisit(simpleType15);
        org.eclipse.jdt.core.dom.Block block17 = null;
        boolean boolean18 = cKVisitor4.visit(block17);
        org.eclipse.jdt.core.dom.LabeledStatement labeledStatement19 = null;
        cKVisitor4.endVisit(labeledStatement19);
        org.eclipse.jdt.core.dom.AssertStatement assertStatement21 = null;
        cKVisitor4.endVisit(assertStatement21);
        org.eclipse.jdt.core.dom.CharacterLiteral characterLiteral23 = null;
        boolean boolean24 = cKVisitor4.visit(characterLiteral23);
        org.eclipse.jdt.core.dom.CreationReference creationReference25 = null;
        cKVisitor4.endVisit(creationReference25);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.SuperMethodReference superMethodReference7 = null;
        cKVisitor4.endVisit(superMethodReference7);
        org.eclipse.jdt.core.dom.SuperFieldAccess superFieldAccess9 = null;
        cKVisitor4.endVisit(superFieldAccess9);
        org.eclipse.jdt.core.dom.QualifiedName qualifiedName11 = null;
        boolean boolean12 = cKVisitor4.visit(qualifiedName11);
        org.eclipse.jdt.core.dom.RecordDeclaration recordDeclaration13 = null;
        boolean boolean14 = cKVisitor4.visit(recordDeclaration13);
        org.eclipse.jdt.core.dom.PrimitiveType primitiveType15 = null;
        boolean boolean16 = cKVisitor4.visit(primitiveType15);
        org.eclipse.jdt.core.dom.ModuleModifier moduleModifier17 = null;
        cKVisitor4.endVisit(moduleModifier17);
        org.eclipse.jdt.core.dom.PostfixExpression postfixExpression19 = null;
        cKVisitor4.endVisit(postfixExpression19);
        org.eclipse.jdt.core.dom.LineComment lineComment21 = null;
        cKVisitor4.endVisit(lineComment21);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        com.github.mauricioaniche.ck.CK cK3 = new com.github.mauricioaniche.ck.CK(false, (int) (short) -1, false);
        com.github.mauricioaniche.ck.CKNotifier cKNotifier5 = null;
        // The following exception was thrown during execution in test generation
        try {
            cK3.calculate("", cKNotifier5);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression9 = null;
        cKVisitor4.endVisit(patternInstanceofExpression9);
        org.eclipse.jdt.core.dom.InstanceofExpression instanceofExpression11 = null;
        cKVisitor4.endVisit(instanceofExpression11);
        org.eclipse.jdt.core.dom.Assignment assignment13 = null;
        cKVisitor4.endVisit(assignment13);
        org.eclipse.jdt.core.dom.SimpleType simpleType15 = null;
        cKVisitor4.endVisit(simpleType15);
        org.eclipse.jdt.core.dom.Block block17 = null;
        boolean boolean18 = cKVisitor4.visit(block17);
        org.eclipse.jdt.core.dom.YieldStatement yieldStatement19 = null;
        cKVisitor4.endVisit(yieldStatement19);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression21 = null;
        boolean boolean22 = cKVisitor4.visit(patternInstanceofExpression21);
        org.eclipse.jdt.core.dom.TextElement textElement23 = null;
        cKVisitor4.endVisit(textElement23);
        org.eclipse.jdt.core.dom.Assignment assignment25 = null;
        cKVisitor4.endVisit(assignment25);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        float float5 = cKClassResult4.getTightClassCohesion();
        cKClassResult4.setAssignmentsQty((int) (short) -1);
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult12 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int13 = cKMethodResult12.getUniqueWordsQty();
        cKMethodResult12.setUniqueWordsQty((int) (byte) 10);
        cKMethodResult12.setAnonymousClassesQty((int) (short) 1);
        java.util.Set<java.lang.String> strSet18 = cKMethodResult12.getFieldsAccessed();
        cKClassResult4.setFieldNames(strSet18);
        int int20 = cKClassResult4.getNoc();
        cKClassResult4.setRfc((int) (short) 0);
        cKClassResult4.setLoc((int) (byte) -1);
        int int25 = cKClassResult4.getNumberOfFields();
        int int26 = cKClassResult4.getNumberOfSynchronizedMethods();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "hi!", false, (int) (byte) 0);
        cKMethodResult4.setWmc((int) (byte) 100);
        int int7 = cKMethodResult4.getMaxNestedBlocks();
        int int8 = cKMethodResult4.getMathOperationsQty();
        cKMethodResult4.setVariablesQty((int) '4');
        int int11 = cKMethodResult4.getLogStatementsQty();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("CKMethodResult{cbo=10, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=10, rfc=0, wmc=0, methodName='hi!'}", true, (int) 'a');
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setStringLiteralsQty((-1));
        int int7 = cKClassResult4.getNumberOfLogStatements();
        int int8 = cKClassResult4.getVariablesQty();
        int int9 = cKClassResult4.getVariablesQty();
        int int10 = cKClassResult4.getNumberOfFields();
        int int11 = cKClassResult4.getNumberOfPrivateFields();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        cKMethodResult4.setLoc((int) (byte) 100);
        cKMethodResult4.setTryCatchQty((int) (byte) -1);
        int int9 = cKMethodResult4.getNumbersQty();
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult14 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int15 = cKMethodResult14.getComparisonsQty();
        cKMethodResult14.setReturnQty((int) (byte) -1);
        cKMethodResult14.setCboModified((int) (byte) 100);
        int int20 = cKMethodResult14.getFanout();
        boolean boolean21 = cKMethodResult4.equals((java.lang.Object) cKMethodResult14);
        java.util.Map<java.lang.String, java.util.Set<java.lang.String>> strMap22 = null;
        cKMethodResult14.setMethodInvocationsIndirectLocal(strMap22);
        cKMethodResult14.setAssignmentsQty((int) (short) -1);
        int int26 = cKMethodResult14.getLoc();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ASTNode aSTNode5 = null;
        boolean boolean6 = cKVisitor4.preVisit2(aSTNode5);
        org.eclipse.jdt.core.dom.SingleVariableDeclaration singleVariableDeclaration7 = null;
        boolean boolean8 = cKVisitor4.visit(singleVariableDeclaration7);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression9 = null;
        cKVisitor4.endVisit(patternInstanceofExpression9);
        org.eclipse.jdt.core.dom.InstanceofExpression instanceofExpression11 = null;
        cKVisitor4.endVisit(instanceofExpression11);
        org.eclipse.jdt.core.dom.Assignment assignment13 = null;
        cKVisitor4.endVisit(assignment13);
        org.eclipse.jdt.core.dom.TypeLiteral typeLiteral15 = null;
        boolean boolean16 = cKVisitor4.visit(typeLiteral15);
        org.eclipse.jdt.core.dom.VariableDeclarationStatement variableDeclarationStatement17 = null;
        cKVisitor4.endVisit(variableDeclarationStatement17);
        org.eclipse.jdt.core.dom.AssertStatement assertStatement19 = null;
        cKVisitor4.endVisit(assertStatement19);
        org.eclipse.jdt.core.dom.ASTNode aSTNode21 = null;
        cKVisitor4.postVisit(aSTNode21);
        org.eclipse.jdt.core.dom.InfixExpression infixExpression23 = null;
        boolean boolean24 = cKVisitor4.visit(infixExpression23);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression9 = null;
        cKVisitor4.endVisit(patternInstanceofExpression9);
        org.eclipse.jdt.core.dom.InstanceofExpression instanceofExpression11 = null;
        cKVisitor4.endVisit(instanceofExpression11);
        org.eclipse.jdt.core.dom.Assignment assignment13 = null;
        cKVisitor4.endVisit(assignment13);
        org.eclipse.jdt.core.dom.ASTNode aSTNode15 = null;
        cKVisitor4.postVisit(aSTNode15);
        org.eclipse.jdt.core.dom.UsesDirective usesDirective17 = null;
        cKVisitor4.endVisit(usesDirective17);
        org.eclipse.jdt.core.dom.SingleMemberAnnotation singleMemberAnnotation19 = null;
        boolean boolean20 = cKVisitor4.visit(singleMemberAnnotation19);
        org.eclipse.jdt.core.dom.SwitchExpression switchExpression21 = null;
        cKVisitor4.endVisit(switchExpression21);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getUniqueWordsQty();
        cKClassResult4.setFanin(52);
        cKClassResult4.setNumberOfStaticMethods((int) (short) 1);
        int int11 = cKClassResult4.getParenthesizedExpsQty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression9 = null;
        cKVisitor4.endVisit(patternInstanceofExpression9);
        org.eclipse.jdt.core.dom.InstanceofExpression instanceofExpression11 = null;
        cKVisitor4.endVisit(instanceofExpression11);
        org.eclipse.jdt.core.dom.VariableDeclarationStatement variableDeclarationStatement13 = null;
        cKVisitor4.endVisit(variableDeclarationStatement13);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression15 = null;
        boolean boolean16 = cKVisitor4.visit(parenthesizedExpression15);
        org.eclipse.jdt.core.dom.ClassInstanceCreation classInstanceCreation17 = null;
        cKVisitor4.endVisit(classInstanceCreation17);
        org.eclipse.jdt.core.dom.TagElement tagElement19 = null;
        boolean boolean20 = cKVisitor4.visit(tagElement19);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression9 = null;
        cKVisitor4.endVisit(patternInstanceofExpression9);
        org.eclipse.jdt.core.dom.InstanceofExpression instanceofExpression11 = null;
        cKVisitor4.endVisit(instanceofExpression11);
        org.eclipse.jdt.core.dom.InfixExpression infixExpression13 = null;
        boolean boolean14 = cKVisitor4.visit(infixExpression13);
        org.eclipse.jdt.core.dom.CharacterLiteral characterLiteral15 = null;
        cKVisitor4.endVisit(characterLiteral15);
        org.eclipse.jdt.core.dom.AnnotationTypeDeclaration annotationTypeDeclaration17 = null;
        cKVisitor4.endVisit(annotationTypeDeclaration17);
        org.eclipse.jdt.core.dom.VariableDeclarationStatement variableDeclarationStatement19 = null;
        boolean boolean20 = cKVisitor4.visit(variableDeclarationStatement19);
        org.eclipse.jdt.core.dom.WhileStatement whileStatement21 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(whileStatement21);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getComparisonsQty();
        cKMethodResult4.setReturnQty((int) (byte) -1);
        cKMethodResult4.setCboModified((int) (byte) 100);
        int int10 = cKMethodResult4.getStringLiteralsQty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getUniqueWordsQty();
        cKMethodResult4.setUniqueWordsQty((int) (byte) 100);
        cKMethodResult4.setFanin((int) (byte) 100);
        boolean boolean10 = cKMethodResult4.getHasJavadoc();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ASTNode aSTNode5 = null;
        boolean boolean6 = cKVisitor4.preVisit2(aSTNode5);
        org.eclipse.jdt.core.dom.SwitchStatement switchStatement7 = null;
        boolean boolean8 = cKVisitor4.visit(switchStatement7);
        org.eclipse.jdt.core.dom.ClassInstanceCreation classInstanceCreation9 = null;
        cKVisitor4.endVisit(classInstanceCreation9);
        org.eclipse.jdt.core.dom.SingleMemberAnnotation singleMemberAnnotation11 = null;
        cKVisitor4.endVisit(singleMemberAnnotation11);
        org.eclipse.jdt.core.dom.Javadoc javadoc13 = null;
        cKVisitor4.endVisit(javadoc13);
        org.eclipse.jdt.core.dom.NormalAnnotation normalAnnotation15 = null;
        cKVisitor4.endVisit(normalAnnotation15);
        org.eclipse.jdt.core.dom.InstanceofExpression instanceofExpression17 = null;
        cKVisitor4.endVisit(instanceofExpression17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getComparisonsQty();
        cKMethodResult4.setReturnQty((int) (byte) -1);
        cKMethodResult4.setCboModified((int) (byte) 100);
        int int10 = cKMethodResult4.getFanout();
        int int11 = cKMethodResult4.getTryCatchQty();
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult16 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet17 = cKMethodResult16.getMethodInvocations();
        java.util.Set<java.lang.String> strSet18 = cKMethodResult16.getFieldsAccessed();
        cKMethodResult4.setMethodInvocationLocal(strSet18);
        cKMethodResult4.setRfc((int) ' ');
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult26 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet27 = cKMethodResult26.getMethodInvocations();
        java.util.Set<java.lang.String> strSet28 = cKMethodResult26.getMethodInvocationsLocal();
        int int29 = cKMethodResult26.getWmc();
        java.util.Set<java.lang.String> strSet30 = cKMethodResult26.getMethodInvocations();
        cKMethodResult4.setMethodInvocationLocal(strSet30);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNull(strSet28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(strSet30);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "hi!", false, (int) (byte) 0);
        cKMethodResult4.setFanout(1);
        cKMethodResult4.setCbo(10);
        int int9 = cKMethodResult4.getAnonymousClassesQty();
        int int10 = cKMethodResult4.getNumbersQty();
        java.util.Set<java.lang.String> strSet11 = cKMethodResult4.getMethodInvocationsLocal();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(strSet11);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.IntersectionType intersectionType7 = null;
        boolean boolean8 = cKVisitor4.visit(intersectionType7);
        org.eclipse.jdt.core.dom.BooleanLiteral booleanLiteral9 = null;
        boolean boolean10 = cKVisitor4.visit(booleanLiteral9);
        org.eclipse.jdt.core.dom.SuperMethodInvocation superMethodInvocation11 = null;
        boolean boolean12 = cKVisitor4.visit(superMethodInvocation11);
        org.eclipse.jdt.core.dom.LabeledStatement labeledStatement13 = null;
        cKVisitor4.endVisit(labeledStatement13);
        org.eclipse.jdt.core.dom.RecordDeclaration recordDeclaration15 = null;
        cKVisitor4.endVisit(recordDeclaration15);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression9 = null;
        cKVisitor4.endVisit(patternInstanceofExpression9);
        org.eclipse.jdt.core.dom.InstanceofExpression instanceofExpression11 = null;
        cKVisitor4.endVisit(instanceofExpression11);
        org.eclipse.jdt.core.dom.Assignment assignment13 = null;
        cKVisitor4.endVisit(assignment13);
        org.eclipse.jdt.core.dom.TypeLiteral typeLiteral15 = null;
        boolean boolean16 = cKVisitor4.visit(typeLiteral15);
        org.eclipse.jdt.core.dom.VariableDeclarationStatement variableDeclarationStatement17 = null;
        cKVisitor4.endVisit(variableDeclarationStatement17);
        org.eclipse.jdt.core.dom.BreakStatement breakStatement19 = null;
        boolean boolean20 = cKVisitor4.visit(breakStatement19);
        org.eclipse.jdt.core.dom.SwitchStatement switchStatement21 = null;
        boolean boolean22 = cKVisitor4.visit(switchStatement21);
        org.eclipse.jdt.core.dom.RequiresDirective requiresDirective23 = null;
        cKVisitor4.endVisit(requiresDirective23);
        org.eclipse.jdt.core.dom.TypeParameter typeParameter25 = null;
        boolean boolean26 = cKVisitor4.visit(typeParameter25);
        org.eclipse.jdt.core.dom.IntersectionType intersectionType27 = null;
        boolean boolean28 = cKVisitor4.visit(intersectionType27);
        org.eclipse.jdt.core.dom.SwitchCase switchCase29 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(switchCase29);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setStringLiteralsQty((-1));
        int int7 = cKClassResult4.getCbo();
        int int8 = cKClassResult4.getFanin();
        cKClassResult4.setAnonymousClassesQty(0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getLcom();
        cKClassResult4.setLcom((int) '#');
        cKClassResult4.setDit(10);
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit13 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable14 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable15 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor16 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit13, classLevelMetricListCallable14, methodLevelMetricListCallable15);
        org.eclipse.jdt.core.dom.ASTNode aSTNode17 = null;
        boolean boolean18 = cKVisitor16.preVisit2(aSTNode17);
        org.eclipse.jdt.core.dom.VariableDeclarationFragment variableDeclarationFragment19 = null;
        boolean boolean20 = cKVisitor16.visit(variableDeclarationFragment19);
        org.eclipse.jdt.core.dom.ModuleQualifiedName moduleQualifiedName21 = null;
        boolean boolean22 = cKVisitor16.visit(moduleQualifiedName21);
        boolean boolean23 = cKClassResult4.equals((java.lang.Object) cKVisitor16);
        org.eclipse.jdt.core.dom.TypeLiteral typeLiteral24 = null;
        cKVisitor16.endVisit(typeLiteral24);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.ProvidesDirective providesDirective9 = null;
        boolean boolean10 = cKVisitor4.visit(providesDirective9);
        org.eclipse.jdt.core.dom.ThisExpression thisExpression11 = null;
        cKVisitor4.endVisit(thisExpression11);
        org.eclipse.jdt.core.dom.IntersectionType intersectionType13 = null;
        cKVisitor4.endVisit(intersectionType13);
        org.eclipse.jdt.core.dom.ArrayInitializer arrayInitializer15 = null;
        cKVisitor4.endVisit(arrayInitializer15);
        org.eclipse.jdt.core.dom.TryStatement tryStatement17 = null;
        boolean boolean18 = cKVisitor4.visit(tryStatement17);
        org.eclipse.jdt.core.dom.TypeLiteral typeLiteral19 = null;
        cKVisitor4.endVisit(typeLiteral19);
        org.eclipse.jdt.core.dom.ExpressionStatement expressionStatement21 = null;
        cKVisitor4.endVisit(expressionStatement21);
        org.eclipse.jdt.core.dom.QualifiedName qualifiedName23 = null;
        boolean boolean24 = cKVisitor4.visit(qualifiedName23);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setAnonymousClassesQty((int) (byte) -1);
        int int7 = cKClassResult4.getNumberOfSynchronizedFields();
        cKClassResult4.setRfc((-1));
        int int10 = cKClassResult4.getNumberOfFinalMethods();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.NameQualifiedType nameQualifiedType7 = null;
        boolean boolean8 = cKVisitor4.visit(nameQualifiedType7);
        org.eclipse.jdt.core.dom.SimpleName simpleName9 = null;
        boolean boolean10 = cKVisitor4.visit(simpleName9);
        org.eclipse.jdt.core.dom.OpensDirective opensDirective11 = null;
        cKVisitor4.endVisit(opensDirective11);
        org.eclipse.jdt.core.dom.DoStatement doStatement13 = null;
        boolean boolean14 = cKVisitor4.visit(doStatement13);
        org.eclipse.jdt.core.dom.TagElement tagElement15 = null;
        boolean boolean16 = cKVisitor4.visit(tagElement15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setNumberOfPublicMethods((int) '#');
        int int7 = cKClassResult4.getNoc();
        cKClassResult4.setNumberOfPublicFields(35);
        int int10 = cKClassResult4.getLcom();
        cKClassResult4.setNumberOfPublicMethods(35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.ContinueStatement continueStatement9 = null;
        cKVisitor4.endVisit(continueStatement9);
        org.eclipse.jdt.core.dom.SingleVariableDeclaration singleVariableDeclaration11 = null;
        boolean boolean12 = cKVisitor4.visit(singleVariableDeclaration11);
        org.eclipse.jdt.core.dom.ModuleQualifiedName moduleQualifiedName13 = null;
        cKVisitor4.endVisit(moduleQualifiedName13);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression15 = null;
        boolean boolean16 = cKVisitor4.visit(parenthesizedExpression15);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        cKClassResult4.setLcomNormalized((float) '4');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.SuperMethodReference superMethodReference7 = null;
        cKVisitor4.endVisit(superMethodReference7);
        org.eclipse.jdt.core.dom.SuperFieldAccess superFieldAccess9 = null;
        cKVisitor4.endVisit(superFieldAccess9);
        org.eclipse.jdt.core.dom.QualifiedName qualifiedName11 = null;
        boolean boolean12 = cKVisitor4.visit(qualifiedName11);
        org.eclipse.jdt.core.dom.MethodRefParameter methodRefParameter13 = null;
        cKVisitor4.endVisit(methodRefParameter13);
        org.eclipse.jdt.core.dom.Block block15 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(block15);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getInnerClassesQty();
        cKClassResult4.setLogStatementsQty(0);
        int int8 = cKClassResult4.getNumbersQty();
        float float9 = cKClassResult4.getLcomNormalized();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "hi!", false, (int) (byte) 0);
        cKMethodResult4.setFanout(1);
        cKMethodResult4.setMathOperationsQty((int) (short) 1);
        java.util.Map<java.lang.String, java.util.Set<java.lang.String>> strMap9 = null;
        cKMethodResult4.setMethodInvocationsIndirectLocal(strMap9);
        int int11 = cKMethodResult4.getMaxNestedBlocks();
        cKMethodResult4.setTryCatchQty((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        cKClassResult4.setNumberOfStaticMethods(1);
        cKClassResult4.setNumberOfStaticMethods((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.EnumConstantDeclaration enumConstantDeclaration7 = null;
        cKVisitor4.endVisit(enumConstantDeclaration7);
        org.eclipse.jdt.core.dom.NormalAnnotation normalAnnotation9 = null;
        cKVisitor4.endVisit(normalAnnotation9);
        org.eclipse.jdt.core.dom.NumberLiteral numberLiteral11 = null;
        boolean boolean12 = cKVisitor4.visit(numberLiteral11);
        org.eclipse.jdt.core.dom.SingleMemberAnnotation singleMemberAnnotation13 = null;
        boolean boolean14 = cKVisitor4.visit(singleMemberAnnotation13);
        org.eclipse.jdt.core.dom.ASTNode aSTNode15 = null;
        boolean boolean16 = cKVisitor4.preVisit2(aSTNode15);
        org.eclipse.jdt.core.dom.VariableDeclarationFragment variableDeclarationFragment17 = null;
        boolean boolean18 = cKVisitor4.visit(variableDeclarationFragment17);
        org.eclipse.jdt.core.dom.PostfixExpression postfixExpression19 = null;
        boolean boolean20 = cKVisitor4.visit(postfixExpression19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.UsesDirective usesDirective7 = null;
        boolean boolean8 = cKVisitor4.visit(usesDirective7);
        org.eclipse.jdt.core.dom.ClassInstanceCreation classInstanceCreation9 = null;
        boolean boolean10 = cKVisitor4.visit(classInstanceCreation9);
        org.eclipse.jdt.core.dom.RequiresDirective requiresDirective11 = null;
        cKVisitor4.endVisit(requiresDirective11);
        org.eclipse.jdt.core.dom.RecordDeclaration recordDeclaration13 = null;
        boolean boolean14 = cKVisitor4.visit(recordDeclaration13);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.EnumConstantDeclaration enumConstantDeclaration7 = null;
        cKVisitor4.endVisit(enumConstantDeclaration7);
        org.eclipse.jdt.core.dom.MarkerAnnotation markerAnnotation9 = null;
        boolean boolean10 = cKVisitor4.visit(markerAnnotation9);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression11 = null;
        cKVisitor4.endVisit(patternInstanceofExpression11);
        org.eclipse.jdt.core.dom.PackageDeclaration packageDeclaration13 = null;
        boolean boolean14 = cKVisitor4.visit(packageDeclaration13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        java.util.Set<java.lang.String> strSet6 = cKMethodResult4.getMethodInvocationsLocal();
        java.util.Set<java.lang.String> strSet7 = cKMethodResult4.getFieldsAccessed();
        int int8 = cKMethodResult4.getComparisonsQty();
        cKMethodResult4.setLoc((-1));
        cKMethodResult4.setVariablesQty(0);
        int int13 = cKMethodResult4.getModifiers();
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        cKMethodResult4.setLoc((int) (byte) 100);
        cKMethodResult4.setTryCatchQty((int) (byte) -1);
        int int9 = cKMethodResult4.getLoc();
        int int10 = cKMethodResult4.getMaxNestedBlocks();
        cKMethodResult4.setStringLiteralsQty((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getUniqueWordsQty();
        int int7 = cKClassResult4.getUniqueWordsQty();
        java.util.Optional<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultOptional9 = cKClassResult4.getMethod("hi!");
        cKClassResult4.setNumberOfSynchronizedFields((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(cKMethodResultOptional9);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.ProvidesDirective providesDirective9 = null;
        boolean boolean10 = cKVisitor4.visit(providesDirective9);
        org.eclipse.jdt.core.dom.ThisExpression thisExpression11 = null;
        cKVisitor4.endVisit(thisExpression11);
        org.eclipse.jdt.core.dom.ContinueStatement continueStatement13 = null;
        boolean boolean14 = cKVisitor4.visit(continueStatement13);
        org.eclipse.jdt.core.dom.ArrayAccess arrayAccess15 = null;
        cKVisitor4.endVisit(arrayAccess15);
        org.eclipse.jdt.core.dom.RequiresDirective requiresDirective17 = null;
        boolean boolean18 = cKVisitor4.visit(requiresDirective17);
        org.eclipse.jdt.core.dom.PrimitiveType primitiveType19 = null;
        boolean boolean20 = cKVisitor4.visit(primitiveType19);
        org.eclipse.jdt.core.dom.NameQualifiedType nameQualifiedType21 = null;
        cKVisitor4.endVisit(nameQualifiedType21);
        org.eclipse.jdt.core.dom.EnumDeclaration enumDeclaration23 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(enumDeclaration23);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.EnumConstantDeclaration enumConstantDeclaration7 = null;
        cKVisitor4.endVisit(enumConstantDeclaration7);
        org.eclipse.jdt.core.dom.AssertStatement assertStatement9 = null;
        boolean boolean10 = cKVisitor4.visit(assertStatement9);
        org.eclipse.jdt.core.dom.NumberLiteral numberLiteral11 = null;
        boolean boolean12 = cKVisitor4.visit(numberLiteral11);
        org.eclipse.jdt.core.dom.ParameterizedType parameterizedType13 = null;
        cKVisitor4.endVisit(parameterizedType13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getMaxNestedBlocks();
        cKClassResult4.setReturnQty((int) (byte) 10);
        int int8 = cKClassResult4.getNumberOfVisibleMethods();
        int int9 = cKClassResult4.getNumberOfProtectedFields();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.EnumConstantDeclaration enumConstantDeclaration7 = null;
        cKVisitor4.endVisit(enumConstantDeclaration7);
        org.eclipse.jdt.core.dom.NormalAnnotation normalAnnotation9 = null;
        boolean boolean10 = cKVisitor4.visit(normalAnnotation9);
        org.eclipse.jdt.core.dom.SuperMethodInvocation superMethodInvocation11 = null;
        cKVisitor4.endVisit(superMethodInvocation11);
        org.eclipse.jdt.core.dom.CatchClause catchClause13 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(catchClause13);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        com.github.mauricioaniche.ck.CK cK3 = new com.github.mauricioaniche.ck.CK(true, (int) (short) 1, false);
        com.github.mauricioaniche.ck.CKNotifier cKNotifier5 = null;
        cK3.calculate("CKClassResult [file=, className=CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}]", cKNotifier5);
        java.nio.file.Path path7 = null;
        com.github.mauricioaniche.ck.CKNotifier cKNotifier8 = null;
        // The following exception was thrown during execution in test generation
        try {
            cK3.calculate(path7, cKNotifier8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable0 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable1 = null;
        com.github.mauricioaniche.ck.CKNotifier cKNotifier2 = null;
        com.github.mauricioaniche.ck.MetricsExecutor metricsExecutor3 = new com.github.mauricioaniche.ck.MetricsExecutor(classLevelMetricListCallable0, methodLevelMetricListCallable1, cKNotifier2);
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        org.eclipse.jdt.core.dom.IBinding[] iBindingArray6 = metricsExecutor3.createBindings(strArray5);
        org.eclipse.jdt.core.dom.IBinding iBinding8 = null;
        metricsExecutor3.acceptBinding("CKClassResult [file=, className=CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}]", iBinding8);
        org.eclipse.jdt.core.dom.IBinding iBinding11 = null;
        metricsExecutor3.acceptBinding("hi!", iBinding11);
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            metricsExecutor3.acceptAST("hi!", compilationUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(iBindingArray6);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ASTNode aSTNode5 = null;
        boolean boolean6 = cKVisitor4.preVisit2(aSTNode5);
        org.eclipse.jdt.core.dom.SwitchStatement switchStatement7 = null;
        boolean boolean8 = cKVisitor4.visit(switchStatement7);
        org.eclipse.jdt.core.dom.ConditionalExpression conditionalExpression9 = null;
        boolean boolean10 = cKVisitor4.visit(conditionalExpression9);
        org.eclipse.jdt.core.dom.MarkerAnnotation markerAnnotation11 = null;
        boolean boolean12 = cKVisitor4.visit(markerAnnotation11);
        org.eclipse.jdt.core.dom.SuperMethodInvocation superMethodInvocation13 = null;
        cKVisitor4.endVisit(superMethodInvocation13);
        org.eclipse.jdt.core.dom.ExpressionMethodReference expressionMethodReference15 = null;
        boolean boolean16 = cKVisitor4.visit(expressionMethodReference15);
        org.eclipse.jdt.core.dom.YieldStatement yieldStatement17 = null;
        boolean boolean18 = cKVisitor4.visit(yieldStatement17);
        org.eclipse.jdt.core.dom.AnnotationTypeDeclaration annotationTypeDeclaration19 = null;
        cKVisitor4.endVisit(annotationTypeDeclaration19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setStringLiteralsQty((int) (byte) 1);
        java.util.Optional<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultOptional8 = cKClassResult4.getMethod("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
        int int9 = cKClassResult4.getLoopQty();
        cKClassResult4.setLcom(100);
        java.util.Set<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultSet12 = cKClassResult4.getVisibleMethods();
        org.junit.Assert.assertNotNull(cKMethodResultOptional8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(cKMethodResultSet12);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ASTNode aSTNode5 = null;
        boolean boolean6 = cKVisitor4.preVisit2(aSTNode5);
        org.eclipse.jdt.core.dom.MethodInvocation methodInvocation7 = null;
        boolean boolean8 = cKVisitor4.visit(methodInvocation7);
        org.eclipse.jdt.core.dom.EmptyStatement emptyStatement9 = null;
        cKVisitor4.endVisit(emptyStatement9);
        org.eclipse.jdt.core.dom.SingleVariableDeclaration singleVariableDeclaration11 = null;
        boolean boolean12 = cKVisitor4.visit(singleVariableDeclaration11);
        org.eclipse.jdt.core.dom.ContinueStatement continueStatement13 = null;
        boolean boolean14 = cKVisitor4.visit(continueStatement13);
        org.eclipse.jdt.core.dom.RequiresDirective requiresDirective15 = null;
        boolean boolean16 = cKVisitor4.visit(requiresDirective15);
        org.eclipse.jdt.core.dom.EnumConstantDeclaration enumConstantDeclaration17 = null;
        boolean boolean18 = cKVisitor4.visit(enumConstantDeclaration17);
        org.eclipse.jdt.core.dom.QualifiedName qualifiedName19 = null;
        boolean boolean20 = cKVisitor4.visit(qualifiedName19);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation21 = null;
        boolean boolean22 = cKVisitor4.visit(arrayCreation21);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getComparisonsQty();
        cKMethodResult4.setReturnQty((int) (byte) -1);
        cKMethodResult4.setCboModified((int) (byte) 100);
        int int10 = cKMethodResult4.getFanout();
        int int11 = cKMethodResult4.getTryCatchQty();
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult16 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet17 = cKMethodResult16.getMethodInvocations();
        java.util.Set<java.lang.String> strSet18 = cKMethodResult16.getFieldsAccessed();
        cKMethodResult4.setMethodInvocationLocal(strSet18);
        int int20 = cKMethodResult4.getLoopQty();
        int int21 = cKMethodResult4.getTryCatchQty();
        cKMethodResult4.setParenthesizedExpsQty((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression9 = null;
        cKVisitor4.endVisit(patternInstanceofExpression9);
        org.eclipse.jdt.core.dom.BlockComment blockComment11 = null;
        cKVisitor4.endVisit(blockComment11);
        org.eclipse.jdt.core.dom.PackageDeclaration packageDeclaration13 = null;
        boolean boolean14 = cKVisitor4.visit(packageDeclaration13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.EnumConstantDeclaration enumConstantDeclaration7 = null;
        cKVisitor4.endVisit(enumConstantDeclaration7);
        org.eclipse.jdt.core.dom.NormalAnnotation normalAnnotation9 = null;
        cKVisitor4.endVisit(normalAnnotation9);
        org.eclipse.jdt.core.dom.QualifiedType qualifiedType11 = null;
        cKVisitor4.endVisit(qualifiedType11);
        org.eclipse.jdt.core.dom.Initializer initializer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = cKVisitor4.visit(initializer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ASTNode aSTNode5 = null;
        boolean boolean6 = cKVisitor4.preVisit2(aSTNode5);
        org.eclipse.jdt.core.dom.MethodInvocation methodInvocation7 = null;
        boolean boolean8 = cKVisitor4.visit(methodInvocation7);
        org.eclipse.jdt.core.dom.SwitchExpression switchExpression9 = null;
        cKVisitor4.endVisit(switchExpression9);
        org.eclipse.jdt.core.dom.CatchClause catchClause11 = null;
        boolean boolean12 = cKVisitor4.visit(catchClause11);
        org.eclipse.jdt.core.dom.ImportDeclaration importDeclaration13 = null;
        cKVisitor4.endVisit(importDeclaration13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getLcom();
        cKClassResult4.setLcom((int) '#');
        int int10 = cKClassResult4.getLoopQty();
        cKClassResult4.setNosi((int) (short) -1);
        cKClassResult4.setNumberOfFields((int) 'a');
        java.lang.String str15 = cKClassResult4.getClassName();
        int int16 = cKClassResult4.getStringLiteralsQty();
        int int17 = cKClassResult4.getNumberOfStaticMethods();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}" + "'", str15, "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ASTNode aSTNode5 = null;
        boolean boolean6 = cKVisitor4.preVisit2(aSTNode5);
        org.eclipse.jdt.core.dom.SwitchStatement switchStatement7 = null;
        boolean boolean8 = cKVisitor4.visit(switchStatement7);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression9 = null;
        boolean boolean10 = cKVisitor4.visit(patternInstanceofExpression9);
        org.eclipse.jdt.core.dom.TypeDeclarationStatement typeDeclarationStatement11 = null;
        cKVisitor4.endVisit(typeDeclarationStatement11);
        org.eclipse.jdt.core.dom.CharacterLiteral characterLiteral13 = null;
        boolean boolean14 = cKVisitor4.visit(characterLiteral13);
        org.eclipse.jdt.core.dom.LabeledStatement labeledStatement15 = null;
        cKVisitor4.endVisit(labeledStatement15);
        org.eclipse.jdt.core.dom.ExportsDirective exportsDirective17 = null;
        cKVisitor4.endVisit(exportsDirective17);
        org.eclipse.jdt.core.dom.EnumConstantDeclaration enumConstantDeclaration19 = null;
        cKVisitor4.endVisit(enumConstantDeclaration19);
        org.eclipse.jdt.core.dom.ArrayAccess arrayAccess21 = null;
        cKVisitor4.endVisit(arrayAccess21);
        org.eclipse.jdt.core.dom.FieldAccess fieldAccess23 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(fieldAccess23);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setAnonymousClassesQty((int) (byte) -1);
        int int7 = cKClassResult4.getNumberOfSynchronizedFields();
        cKClassResult4.setRfc((-1));
        int int10 = cKClassResult4.getNumberOfProtectedFields();
        int int11 = cKClassResult4.getComparisonsQty();
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult16 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet17 = cKMethodResult16.getMethodInvocations();
        java.util.Set<java.lang.String> strSet18 = cKMethodResult16.getMethodInvocationsLocal();
        int int19 = cKMethodResult16.getWmc();
        java.util.Set<java.lang.String> strSet20 = cKMethodResult16.getMethodInvocations();
        cKClassResult4.setFieldNames(strSet20);
        int int22 = cKClassResult4.getLoc();
        cKClassResult4.setMaxNestedBlocks((int) (byte) 100);
        cKClassResult4.setNumberOfPublicMethods((int) (byte) 1);
        cKClassResult4.setLogStatementsQty((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(strSet18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setAnonymousClassesQty((int) (byte) -1);
        int int7 = cKClassResult4.getNumberOfSynchronizedFields();
        cKClassResult4.setRfc((-1));
        cKClassResult4.setNumberOfFinalMethods((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getUniqueWordsQty();
        int int6 = cKMethodResult4.getNumbersQty();
        cKMethodResult4.setAnonymousClassesQty(52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        cKClassResult4.setNumberOfStaticMethods(1);
        int int8 = cKClassResult4.getParenthesizedExpsQty();
        int int9 = cKClassResult4.getMaxNestedBlocks();
        cKClassResult4.setDit((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.NameQualifiedType nameQualifiedType7 = null;
        boolean boolean8 = cKVisitor4.visit(nameQualifiedType7);
        org.eclipse.jdt.core.dom.MarkerAnnotation markerAnnotation9 = null;
        cKVisitor4.endVisit(markerAnnotation9);
        org.eclipse.jdt.core.dom.FieldDeclaration fieldDeclaration11 = null;
        boolean boolean12 = cKVisitor4.visit(fieldDeclaration11);
        org.eclipse.jdt.core.dom.Javadoc javadoc13 = null;
        boolean boolean14 = cKVisitor4.visit(javadoc13);
        org.eclipse.jdt.core.dom.LineComment lineComment15 = null;
        boolean boolean16 = cKVisitor4.visit(lineComment15);
        org.eclipse.jdt.core.dom.MemberValuePair memberValuePair17 = null;
        boolean boolean18 = cKVisitor4.visit(memberValuePair17);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression19 = null;
        boolean boolean20 = cKVisitor4.visit(patternInstanceofExpression19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getLcom();
        cKClassResult4.setLcom((int) '#');
        int int10 = cKClassResult4.getNumberOfPublicFields();
        cKClassResult4.setNumberOfProtectedFields((int) (short) 10);
        int int13 = cKClassResult4.getRfc();
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult18 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        cKMethodResult18.setLoc((int) (byte) 100);
        cKMethodResult18.setTryCatchQty((int) (byte) -1);
        int int23 = cKMethodResult18.getWmc();
        cKClassResult4.addMethod(cKMethodResult18);
        cKClassResult4.setRfc(1);
        int int27 = cKClassResult4.getNumberOfDefaultMethods();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getLcom();
        cKClassResult4.setLcom((int) '#');
        int int10 = cKClassResult4.getNumberOfPublicFields();
        cKClassResult4.setNumberOfProtectedFields((int) (short) 10);
        int int13 = cKClassResult4.getRfc();
        int int14 = cKClassResult4.getNumberOfPublicMethods();
        int int15 = cKClassResult4.getFanout();
        cKClassResult4.setMathOperationsQty((-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getNumberOfPublicFields();
        int int8 = cKClassResult4.getTryCatchQty();
        cKClassResult4.setMaxNestedBlocks((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        float float5 = cKClassResult4.getTightClassCohesion();
        cKClassResult4.setAssignmentsQty((int) (short) -1);
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult12 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int13 = cKMethodResult12.getUniqueWordsQty();
        cKMethodResult12.setUniqueWordsQty((int) (byte) 10);
        cKMethodResult12.setAnonymousClassesQty((int) (short) 1);
        java.util.Set<java.lang.String> strSet18 = cKMethodResult12.getFieldsAccessed();
        cKClassResult4.setFieldNames(strSet18);
        int int20 = cKClassResult4.getNoc();
        cKClassResult4.setRfc((int) (short) 0);
        cKClassResult4.setLoc((int) (byte) -1);
        int int25 = cKClassResult4.getNoc();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression9 = null;
        cKVisitor4.endVisit(patternInstanceofExpression9);
        org.eclipse.jdt.core.dom.VariableDeclarationFragment variableDeclarationFragment11 = null;
        cKVisitor4.endVisit(variableDeclarationFragment11);
        java.util.Set<com.github.mauricioaniche.ck.CKClassResult> cKClassResultSet13 = cKVisitor4.getCollectedClasses();
        org.eclipse.jdt.core.dom.SwitchStatement switchStatement14 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(switchStatement14);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cKClassResultSet13);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getComparisonsQty();
        cKMethodResult4.setReturnQty((int) (byte) -1);
        cKMethodResult4.setCboModified((int) (byte) 100);
        int int10 = cKMethodResult4.getFanout();
        int int11 = cKMethodResult4.getTryCatchQty();
        int int12 = cKMethodResult4.getRfc();
        cKMethodResult4.setFanout((int) (short) 0);
        int int15 = cKMethodResult4.getInnerClassesQty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = cKMethodResult4.getFieldUsage();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setStringLiteralsQty((int) (byte) 1);
        java.util.Optional<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultOptional8 = cKClassResult4.getMethod("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
        int int9 = cKClassResult4.getNumberOfStaticMethods();
        int int10 = cKClassResult4.getWmc();
        cKClassResult4.setWmc((int) (byte) -1);
        int int13 = cKClassResult4.getParenthesizedExpsQty();
        org.junit.Assert.assertNotNull(cKMethodResultOptional8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.ProvidesDirective providesDirective9 = null;
        boolean boolean10 = cKVisitor4.visit(providesDirective9);
        org.eclipse.jdt.core.dom.ThisExpression thisExpression11 = null;
        cKVisitor4.endVisit(thisExpression11);
        org.eclipse.jdt.core.dom.ContinueStatement continueStatement13 = null;
        boolean boolean14 = cKVisitor4.visit(continueStatement13);
        org.eclipse.jdt.core.dom.ArrayAccess arrayAccess15 = null;
        cKVisitor4.endVisit(arrayAccess15);
        org.eclipse.jdt.core.dom.RequiresDirective requiresDirective17 = null;
        boolean boolean18 = cKVisitor4.visit(requiresDirective17);
        org.eclipse.jdt.core.dom.PrimitiveType primitiveType19 = null;
        boolean boolean20 = cKVisitor4.visit(primitiveType19);
        org.eclipse.jdt.core.dom.NameQualifiedType nameQualifiedType21 = null;
        cKVisitor4.endVisit(nameQualifiedType21);
        org.eclipse.jdt.core.dom.WildcardType wildcardType23 = null;
        boolean boolean24 = cKVisitor4.visit(wildcardType23);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getLcom();
        cKClassResult4.setLcom((int) '#');
        int int10 = cKClassResult4.getNumberOfPublicFields();
        cKClassResult4.setNumberOfProtectedFields((int) (short) 10);
        int int13 = cKClassResult4.getReturnQty();
        cKClassResult4.setNumberOfFinalFields(1);
        java.util.Set<java.lang.String> strSet16 = null;
        cKClassResult4.setFieldNames(strSet16);
        java.lang.String str18 = cKClassResult4.toString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "CKClassResult [file=, className=CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}]" + "'", str18, "CKClassResult [file=, className=CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}]");
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.NameQualifiedType nameQualifiedType7 = null;
        boolean boolean8 = cKVisitor4.visit(nameQualifiedType7);
        org.eclipse.jdt.core.dom.SimpleName simpleName9 = null;
        boolean boolean10 = cKVisitor4.visit(simpleName9);
        org.eclipse.jdt.core.dom.MethodInvocation methodInvocation11 = null;
        boolean boolean12 = cKVisitor4.visit(methodInvocation11);
        org.eclipse.jdt.core.dom.SwitchCase switchCase13 = null;
        boolean boolean14 = cKVisitor4.visit(switchCase13);
        org.eclipse.jdt.core.dom.BlockComment blockComment15 = null;
        cKVisitor4.endVisit(blockComment15);
        org.eclipse.jdt.core.dom.WildcardType wildcardType17 = null;
        boolean boolean18 = cKVisitor4.visit(wildcardType17);
        org.eclipse.jdt.core.dom.SimpleType simpleType19 = null;
        boolean boolean20 = cKVisitor4.visit(simpleType19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setAnonymousClassesQty((int) (byte) -1);
        int int7 = cKClassResult4.getNumberOfSynchronizedFields();
        cKClassResult4.setAssignmentsQty((int) (byte) 1);
        int int10 = cKClassResult4.getNumberOfDefaultMethods();
        int int11 = cKClassResult4.getNumberOfPrivateFields();
        cKClassResult4.setReturnQty(10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.SuperMethodReference superMethodReference7 = null;
        cKVisitor4.endVisit(superMethodReference7);
        org.eclipse.jdt.core.dom.SuperFieldAccess superFieldAccess9 = null;
        cKVisitor4.endVisit(superFieldAccess9);
        org.eclipse.jdt.core.dom.QualifiedName qualifiedName11 = null;
        boolean boolean12 = cKVisitor4.visit(qualifiedName11);
        org.eclipse.jdt.core.dom.SimpleType simpleType13 = null;
        cKVisitor4.endVisit(simpleType13);
        org.eclipse.jdt.core.dom.UnionType unionType15 = null;
        cKVisitor4.endVisit(unionType15);
        org.eclipse.jdt.core.dom.UnionType unionType17 = null;
        boolean boolean18 = cKVisitor4.visit(unionType17);
        org.eclipse.jdt.core.dom.RequiresDirective requiresDirective19 = null;
        boolean boolean20 = cKVisitor4.visit(requiresDirective19);
        org.eclipse.jdt.core.dom.MarkerAnnotation markerAnnotation21 = null;
        cKVisitor4.endVisit(markerAnnotation21);
        org.eclipse.jdt.core.dom.TagElement tagElement23 = null;
        cKVisitor4.endVisit(tagElement23);
        org.eclipse.jdt.core.dom.BlockComment blockComment25 = null;
        boolean boolean26 = cKVisitor4.visit(blockComment25);
        org.eclipse.jdt.core.dom.ReturnStatement returnStatement27 = null;
        cKVisitor4.endVisit(returnStatement27);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression9 = null;
        cKVisitor4.endVisit(patternInstanceofExpression9);
        org.eclipse.jdt.core.dom.InstanceofExpression instanceofExpression11 = null;
        cKVisitor4.endVisit(instanceofExpression11);
        org.eclipse.jdt.core.dom.Assignment assignment13 = null;
        cKVisitor4.endVisit(assignment13);
        org.eclipse.jdt.core.dom.SimpleType simpleType15 = null;
        cKVisitor4.endVisit(simpleType15);
        org.eclipse.jdt.core.dom.Block block17 = null;
        boolean boolean18 = cKVisitor4.visit(block17);
        org.eclipse.jdt.core.dom.YieldStatement yieldStatement19 = null;
        cKVisitor4.endVisit(yieldStatement19);
        java.util.Set<com.github.mauricioaniche.ck.CKClassResult> cKClassResultSet21 = cKVisitor4.getCollectedClasses();
        org.eclipse.jdt.core.dom.IfStatement ifStatement22 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(ifStatement22);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(cKClassResultSet21);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ASTNode aSTNode5 = null;
        boolean boolean6 = cKVisitor4.preVisit2(aSTNode5);
        org.eclipse.jdt.core.dom.SwitchStatement switchStatement7 = null;
        boolean boolean8 = cKVisitor4.visit(switchStatement7);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression9 = null;
        boolean boolean10 = cKVisitor4.visit(patternInstanceofExpression9);
        org.eclipse.jdt.core.dom.TypeDeclarationStatement typeDeclarationStatement11 = null;
        cKVisitor4.endVisit(typeDeclarationStatement11);
        org.eclipse.jdt.core.dom.CharacterLiteral characterLiteral13 = null;
        boolean boolean14 = cKVisitor4.visit(characterLiteral13);
        org.eclipse.jdt.core.dom.LabeledStatement labeledStatement15 = null;
        cKVisitor4.endVisit(labeledStatement15);
        org.eclipse.jdt.core.dom.EnumConstantDeclaration enumConstantDeclaration17 = null;
        cKVisitor4.endVisit(enumConstantDeclaration17);
        org.eclipse.jdt.core.dom.SingleVariableDeclaration singleVariableDeclaration19 = null;
        cKVisitor4.endVisit(singleVariableDeclaration19);
        org.eclipse.jdt.core.dom.ReturnStatement returnStatement21 = null;
        boolean boolean22 = cKVisitor4.visit(returnStatement21);
        org.eclipse.jdt.core.dom.CharacterLiteral characterLiteral23 = null;
        cKVisitor4.endVisit(characterLiteral23);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getUniqueWordsQty();
        cKMethodResult4.setUniqueWordsQty((int) (byte) 100);
        cKMethodResult4.setFanin((int) (byte) 100);
        cKMethodResult4.setVariablesQty(52);
        cKMethodResult4.setFanin(10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getLcom();
        cKClassResult4.setLcom((int) '#');
        cKClassResult4.setDit(10);
        cKClassResult4.setFanout((int) '#');
        int int14 = cKClassResult4.getNumberOfDefaultMethods();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setStringLiteralsQty((int) (byte) 1);
        java.util.Optional<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultOptional8 = cKClassResult4.getMethod("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
        int int9 = cKClassResult4.getLoopQty();
        cKClassResult4.setLcom(100);
        int int12 = cKClassResult4.getAssignmentsQty();
        int int13 = cKClassResult4.getLoc();
        cKClassResult4.setNumberOfPublicFields(52);
        float float16 = cKClassResult4.getTightClassCohesion();
        cKClassResult4.setFanout(0);
        cKClassResult4.setLoc((int) (short) 100);
        cKClassResult4.setDit(0);
        cKClassResult4.setFanin((int) '4');
        org.junit.Assert.assertNotNull(cKMethodResultOptional8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.NameQualifiedType nameQualifiedType7 = null;
        boolean boolean8 = cKVisitor4.visit(nameQualifiedType7);
        org.eclipse.jdt.core.dom.MarkerAnnotation markerAnnotation9 = null;
        cKVisitor4.endVisit(markerAnnotation9);
        org.eclipse.jdt.core.dom.ImportDeclaration importDeclaration11 = null;
        cKVisitor4.endVisit(importDeclaration11);
        org.eclipse.jdt.core.dom.ModuleDeclaration moduleDeclaration13 = null;
        boolean boolean14 = cKVisitor4.visit(moduleDeclaration13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.NameQualifiedType nameQualifiedType7 = null;
        boolean boolean8 = cKVisitor4.visit(nameQualifiedType7);
        org.eclipse.jdt.core.dom.MarkerAnnotation markerAnnotation9 = null;
        cKVisitor4.endVisit(markerAnnotation9);
        org.eclipse.jdt.core.dom.ArrayAccess arrayAccess11 = null;
        cKVisitor4.endVisit(arrayAccess11);
        org.eclipse.jdt.core.dom.MethodInvocation methodInvocation13 = null;
        cKVisitor4.endVisit(methodInvocation13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.SuperMethodReference superMethodReference7 = null;
        cKVisitor4.endVisit(superMethodReference7);
        org.eclipse.jdt.core.dom.SuperFieldAccess superFieldAccess9 = null;
        cKVisitor4.endVisit(superFieldAccess9);
        org.eclipse.jdt.core.dom.LabeledStatement labeledStatement11 = null;
        boolean boolean12 = cKVisitor4.visit(labeledStatement11);
        org.eclipse.jdt.core.dom.ParameterizedType parameterizedType13 = null;
        boolean boolean14 = cKVisitor4.visit(parameterizedType13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        java.util.Set<java.lang.String> strSet6 = cKMethodResult4.getMethodInvocationsLocal();
        int int7 = cKMethodResult4.getLambdasQty();
        cKMethodResult4.setParenthesizedExpsQty((int) (short) -1);
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult14 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int15 = cKMethodResult14.getUniqueWordsQty();
        cKMethodResult14.setUniqueWordsQty((int) (byte) 10);
        int int18 = cKMethodResult14.getLogStatementsQty();
        boolean boolean19 = cKMethodResult14.isConstructor();
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult24 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int25 = cKMethodResult24.getUniqueWordsQty();
        int int26 = cKMethodResult24.getNumbersQty();
        int int27 = cKMethodResult24.getStartLine();
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult32 = new com.github.mauricioaniche.ck.CKMethodResult("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", true, 0);
        cKMethodResult32.setCbo(0);
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult39 = new com.github.mauricioaniche.ck.CKMethodResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", true, 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap40 = cKMethodResult39.getVariablesUsage();
        cKMethodResult32.setFieldUsage(strMap40);
        cKMethodResult24.setVariablesUsage(strMap40);
        cKMethodResult14.setVariablesUsage(strMap40);
        cKMethodResult4.setFieldUsage(strMap40);
        java.lang.Object obj45 = null;
        boolean boolean46 = cKMethodResult4.equals(obj45);
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult51 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int52 = cKMethodResult51.getUniqueWordsQty();
        int int53 = cKMethodResult51.getNumbersQty();
        int int54 = cKMethodResult51.getStartLine();
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult59 = new com.github.mauricioaniche.ck.CKMethodResult("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", true, 0);
        cKMethodResult59.setCbo(0);
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult66 = new com.github.mauricioaniche.ck.CKMethodResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", true, 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap67 = cKMethodResult66.getVariablesUsage();
        cKMethodResult59.setFieldUsage(strMap67);
        cKMethodResult51.setVariablesUsage(strMap67);
        cKMethodResult4.setVariablesUsage(strMap67);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(strMap40);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(strMap67);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getMaxNestedBlocks();
        int int6 = cKClassResult4.getMaxNestedBlocks();
        int int7 = cKClassResult4.getNumberOfPrivateMethods();
        cKClassResult4.setLooseClassCohesion((float) (short) 100);
        cKClassResult4.setNumberOfMethods(0);
        cKClassResult4.setLooseClassCohesion((float) 10L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ASTNode aSTNode5 = null;
        boolean boolean6 = cKVisitor4.preVisit2(aSTNode5);
        org.eclipse.jdt.core.dom.SwitchStatement switchStatement7 = null;
        boolean boolean8 = cKVisitor4.visit(switchStatement7);
        org.eclipse.jdt.core.dom.MarkerAnnotation markerAnnotation9 = null;
        boolean boolean10 = cKVisitor4.visit(markerAnnotation9);
        org.eclipse.jdt.core.dom.CreationReference creationReference11 = null;
        boolean boolean12 = cKVisitor4.visit(creationReference11);
        org.eclipse.jdt.core.dom.BreakStatement breakStatement13 = null;
        cKVisitor4.endVisit(breakStatement13);
        org.eclipse.jdt.core.dom.VariableDeclarationStatement variableDeclarationStatement15 = null;
        boolean boolean16 = cKVisitor4.visit(variableDeclarationStatement15);
        org.eclipse.jdt.core.dom.MethodDeclaration methodDeclaration17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = cKVisitor4.visit(methodDeclaration17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getMaxNestedBlocks();
        cKClassResult4.setNosi(100);
        int int8 = cKClassResult4.getMaxNestedBlocks();
        cKClassResult4.setCboModified(10);
        java.lang.String str11 = cKClassResult4.getFile();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.IntersectionType intersectionType7 = null;
        boolean boolean8 = cKVisitor4.visit(intersectionType7);
        org.eclipse.jdt.core.dom.BooleanLiteral booleanLiteral9 = null;
        boolean boolean10 = cKVisitor4.visit(booleanLiteral9);
        org.eclipse.jdt.core.dom.SimpleType simpleType11 = null;
        cKVisitor4.endVisit(simpleType11);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression13 = null;
        cKVisitor4.endVisit(patternInstanceofExpression13);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getUniqueWordsQty();
        int int7 = cKClassResult4.getUniqueWordsQty();
        int int8 = cKClassResult4.getLcom();
        int int9 = cKClassResult4.getNumberOfAbstractMethods();
        int int10 = cKClassResult4.getNumberOfFinalMethods();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        cKMethodResult4.setLoc((int) (byte) 100);
        cKMethodResult4.setNumbersQty((-1));
        java.lang.String str9 = cKMethodResult4.toString();
        cKMethodResult4.setLoopQty(10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}" + "'", str9, "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getNumberOfPublicFields();
        int int8 = cKClassResult4.getNumberOfProtectedFields();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setNumberOfPublicMethods((int) '#');
        cKClassResult4.setCboModified((int) (byte) 1);
        float float9 = cKClassResult4.getTightClassCohesion();
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.MarkerAnnotation markerAnnotation9 = null;
        boolean boolean10 = cKVisitor4.visit(markerAnnotation9);
        org.eclipse.jdt.core.dom.EnhancedForStatement enhancedForStatement11 = null;
        boolean boolean12 = cKVisitor4.visit(enhancedForStatement11);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        java.lang.String str6 = cKMethodResult4.getQualifiedMethodName();
        cKMethodResult4.setLoc(100);
        java.util.Map<java.lang.String, java.util.Set<java.lang.String>> strMap9 = cKMethodResult4.getMethodInvocationsIndirectLocal();
        int int10 = cKMethodResult4.getMathOperationsQty();
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ASTNode aSTNode5 = null;
        boolean boolean6 = cKVisitor4.preVisit2(aSTNode5);
        org.eclipse.jdt.core.dom.MethodInvocation methodInvocation7 = null;
        boolean boolean8 = cKVisitor4.visit(methodInvocation7);
        org.eclipse.jdt.core.dom.SwitchExpression switchExpression9 = null;
        cKVisitor4.endVisit(switchExpression9);
        org.eclipse.jdt.core.dom.ExpressionMethodReference expressionMethodReference11 = null;
        boolean boolean12 = cKVisitor4.visit(expressionMethodReference11);
        org.eclipse.jdt.core.dom.PrimitiveType primitiveType13 = null;
        boolean boolean14 = cKVisitor4.visit(primitiveType13);
        org.eclipse.jdt.core.dom.SimpleName simpleName15 = null;
        boolean boolean16 = cKVisitor4.visit(simpleName15);
        org.eclipse.jdt.core.dom.SuperFieldAccess superFieldAccess17 = null;
        boolean boolean18 = cKVisitor4.visit(superFieldAccess17);
        org.eclipse.jdt.core.dom.ForStatement forStatement19 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(forStatement19);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getComparisonsQty();
        cKMethodResult4.setReturnQty((int) (byte) -1);
        cKMethodResult4.setCboModified((int) (byte) 100);
        int int10 = cKMethodResult4.getFanout();
        int int11 = cKMethodResult4.getVariablesQty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        java.util.Set<java.lang.String> strSet6 = cKMethodResult4.getMethodInvocationsLocal();
        int int7 = cKMethodResult4.getLambdasQty();
        cKMethodResult4.setParenthesizedExpsQty((int) (short) -1);
        java.util.Set<java.lang.String> strSet10 = cKMethodResult4.getFieldsAccessed();
        int int11 = cKMethodResult4.getStringLiteralsQty();
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getInnerClassesQty();
        cKClassResult4.setLogStatementsQty(0);
        int int8 = cKClassResult4.getAssignmentsQty();
        cKClassResult4.setNumberOfMethods((int) (short) -1);
        int int11 = cKClassResult4.getNoc();
        cKClassResult4.setInnerClassesQty((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression5 = null;
        boolean boolean6 = cKVisitor4.visit(patternInstanceofExpression5);
        org.eclipse.jdt.core.dom.ForStatement forStatement7 = null;
        boolean boolean8 = cKVisitor4.visit(forStatement7);
        org.eclipse.jdt.core.dom.SuperMethodInvocation superMethodInvocation9 = null;
        boolean boolean10 = cKVisitor4.visit(superMethodInvocation9);
        org.eclipse.jdt.core.dom.EnhancedForStatement enhancedForStatement11 = null;
        boolean boolean12 = cKVisitor4.visit(enhancedForStatement11);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ASTNode aSTNode5 = null;
        boolean boolean6 = cKVisitor4.preVisit2(aSTNode5);
        org.eclipse.jdt.core.dom.SwitchStatement switchStatement7 = null;
        boolean boolean8 = cKVisitor4.visit(switchStatement7);
        org.eclipse.jdt.core.dom.ConditionalExpression conditionalExpression9 = null;
        boolean boolean10 = cKVisitor4.visit(conditionalExpression9);
        org.eclipse.jdt.core.dom.AnnotationTypeMemberDeclaration annotationTypeMemberDeclaration11 = null;
        boolean boolean12 = cKVisitor4.visit(annotationTypeMemberDeclaration11);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getMaxNestedBlocks();
        cKClassResult4.setReturnQty((int) (byte) 10);
        int int8 = cKClassResult4.getNumberOfVisibleMethods();
        cKClassResult4.setNumberOfStaticMethods((-1));
        java.lang.String str11 = cKClassResult4.getClassName();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}" + "'", str11, "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", true, (int) '4');
        int int5 = cKMethodResult4.getAnonymousClassesQty();
        cKMethodResult4.setMaxNestedBlocks((int) ' ');
        cKMethodResult4.setStartLine((int) (short) -1);
        cKMethodResult4.setParenthesizedExpsQty(10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ASTNode aSTNode5 = null;
        boolean boolean6 = cKVisitor4.preVisit2(aSTNode5);
        org.eclipse.jdt.core.dom.SwitchStatement switchStatement7 = null;
        boolean boolean8 = cKVisitor4.visit(switchStatement7);
        org.eclipse.jdt.core.dom.AnnotationTypeDeclaration annotationTypeDeclaration9 = null;
        cKVisitor4.endVisit(annotationTypeDeclaration9);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression11 = null;
        boolean boolean12 = cKVisitor4.visit(parenthesizedExpression11);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression9 = null;
        cKVisitor4.endVisit(patternInstanceofExpression9);
        org.eclipse.jdt.core.dom.InstanceofExpression instanceofExpression11 = null;
        cKVisitor4.endVisit(instanceofExpression11);
        org.eclipse.jdt.core.dom.VariableDeclarationStatement variableDeclarationStatement13 = null;
        cKVisitor4.endVisit(variableDeclarationStatement13);
        org.eclipse.jdt.core.dom.TypeMethodReference typeMethodReference15 = null;
        cKVisitor4.endVisit(typeMethodReference15);
        org.eclipse.jdt.core.dom.ArrayInitializer arrayInitializer17 = null;
        boolean boolean18 = cKVisitor4.visit(arrayInitializer17);
        org.eclipse.jdt.core.dom.PrimitiveType primitiveType19 = null;
        cKVisitor4.endVisit(primitiveType19);
        org.eclipse.jdt.core.dom.SuperConstructorInvocation superConstructorInvocation21 = null;
        boolean boolean22 = cKVisitor4.visit(superConstructorInvocation21);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        java.util.Set<java.lang.String> strSet6 = cKMethodResult4.getFieldsAccessed();
        int int7 = cKMethodResult4.getReturnQty();
        java.util.Set<java.lang.String> strSet8 = cKMethodResult4.getMethodInvocationsLocal();
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(strSet8);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression9 = null;
        cKVisitor4.endVisit(patternInstanceofExpression9);
        org.eclipse.jdt.core.dom.InstanceofExpression instanceofExpression11 = null;
        cKVisitor4.endVisit(instanceofExpression11);
        org.eclipse.jdt.core.dom.Assignment assignment13 = null;
        cKVisitor4.endVisit(assignment13);
        org.eclipse.jdt.core.dom.ASTNode aSTNode15 = null;
        cKVisitor4.postVisit(aSTNode15);
        org.eclipse.jdt.core.dom.ImportDeclaration importDeclaration17 = null;
        boolean boolean18 = cKVisitor4.visit(importDeclaration17);
        org.eclipse.jdt.core.dom.TagElement tagElement19 = null;
        cKVisitor4.endVisit(tagElement19);
        org.eclipse.jdt.core.dom.OpensDirective opensDirective21 = null;
        boolean boolean22 = cKVisitor4.visit(opensDirective21);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        java.util.Set<java.lang.String> strSet6 = cKMethodResult4.getMethodInvocationsLocal();
        int int7 = cKMethodResult4.getFanin();
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.NameQualifiedType nameQualifiedType7 = null;
        boolean boolean8 = cKVisitor4.visit(nameQualifiedType7);
        org.eclipse.jdt.core.dom.SimpleName simpleName9 = null;
        boolean boolean10 = cKVisitor4.visit(simpleName9);
        org.eclipse.jdt.core.dom.MethodInvocation methodInvocation11 = null;
        boolean boolean12 = cKVisitor4.visit(methodInvocation11);
        org.eclipse.jdt.core.dom.SwitchCase switchCase13 = null;
        boolean boolean14 = cKVisitor4.visit(switchCase13);
        org.eclipse.jdt.core.dom.BlockComment blockComment15 = null;
        cKVisitor4.endVisit(blockComment15);
        org.eclipse.jdt.core.dom.ModuleQualifiedName moduleQualifiedName17 = null;
        cKVisitor4.endVisit(moduleQualifiedName17);
        org.eclipse.jdt.core.dom.LambdaExpression lambdaExpression19 = null;
        cKVisitor4.endVisit(lambdaExpression19);
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit21 = null;
        cKVisitor4.endVisit(compilationUnit21);
        org.eclipse.jdt.core.dom.Javadoc javadoc23 = null;
        boolean boolean24 = cKVisitor4.visit(javadoc23);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.NameQualifiedType nameQualifiedType7 = null;
        boolean boolean8 = cKVisitor4.visit(nameQualifiedType7);
        org.eclipse.jdt.core.dom.MarkerAnnotation markerAnnotation9 = null;
        cKVisitor4.endVisit(markerAnnotation9);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation11 = null;
        cKVisitor4.endVisit(arrayCreation11);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.EnumConstantDeclaration enumConstantDeclaration7 = null;
        cKVisitor4.endVisit(enumConstantDeclaration7);
        org.eclipse.jdt.core.dom.EmptyStatement emptyStatement9 = null;
        boolean boolean10 = cKVisitor4.visit(emptyStatement9);
        org.eclipse.jdt.core.dom.EnhancedForStatement enhancedForStatement11 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(enhancedForStatement11);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.NameQualifiedType nameQualifiedType7 = null;
        boolean boolean8 = cKVisitor4.visit(nameQualifiedType7);
        org.eclipse.jdt.core.dom.MarkerAnnotation markerAnnotation9 = null;
        cKVisitor4.endVisit(markerAnnotation9);
        org.eclipse.jdt.core.dom.ArrayAccess arrayAccess11 = null;
        cKVisitor4.endVisit(arrayAccess11);
        org.eclipse.jdt.core.dom.ModuleModifier moduleModifier13 = null;
        cKVisitor4.endVisit(moduleModifier13);
        org.eclipse.jdt.core.dom.Javadoc javadoc15 = null;
        boolean boolean16 = cKVisitor4.visit(javadoc15);
        org.eclipse.jdt.core.dom.Initializer initializer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(initializer17);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.EnumConstantDeclaration enumConstantDeclaration7 = null;
        cKVisitor4.endVisit(enumConstantDeclaration7);
        org.eclipse.jdt.core.dom.AssertStatement assertStatement9 = null;
        boolean boolean10 = cKVisitor4.visit(assertStatement9);
        org.eclipse.jdt.core.dom.SynchronizedStatement synchronizedStatement11 = null;
        cKVisitor4.endVisit(synchronizedStatement11);
        org.eclipse.jdt.core.dom.SimpleName simpleName13 = null;
        cKVisitor4.endVisit(simpleName13);
        org.eclipse.jdt.core.dom.MethodRef methodRef15 = null;
        boolean boolean16 = cKVisitor4.visit(methodRef15);
        org.eclipse.jdt.core.dom.CastExpression castExpression17 = null;
        cKVisitor4.endVisit(castExpression17);
        org.eclipse.jdt.core.dom.EmptyStatement emptyStatement19 = null;
        cKVisitor4.endVisit(emptyStatement19);
        org.eclipse.jdt.core.dom.BooleanLiteral booleanLiteral21 = null;
        cKVisitor4.endVisit(booleanLiteral21);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ASTNode aSTNode5 = null;
        boolean boolean6 = cKVisitor4.preVisit2(aSTNode5);
        org.eclipse.jdt.core.dom.MethodInvocation methodInvocation7 = null;
        boolean boolean8 = cKVisitor4.visit(methodInvocation7);
        org.eclipse.jdt.core.dom.EmptyStatement emptyStatement9 = null;
        cKVisitor4.endVisit(emptyStatement9);
        org.eclipse.jdt.core.dom.Modifier modifier11 = null;
        boolean boolean12 = cKVisitor4.visit(modifier11);
        org.eclipse.jdt.core.dom.ContinueStatement continueStatement13 = null;
        cKVisitor4.endVisit(continueStatement13);
        org.eclipse.jdt.core.dom.PrefixExpression prefixExpression15 = null;
        cKVisitor4.endVisit(prefixExpression15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getComparisonsQty();
        cKMethodResult4.setComparisonsQty((-1));
        com.github.mauricioaniche.ck.CKClassResult cKClassResult12 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int13 = cKClassResult12.getNumberOfFinalFields();
        cKClassResult12.setRfc(0);
        cKClassResult12.setNumberOfDefaultFields(0);
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult22 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int23 = cKMethodResult22.getComparisonsQty();
        cKMethodResult22.setReturnQty((int) (byte) -1);
        cKMethodResult22.setCboModified((int) (byte) 100);
        int int28 = cKMethodResult22.getFanout();
        int int29 = cKMethodResult22.getTryCatchQty();
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult34 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet35 = cKMethodResult34.getMethodInvocations();
        java.util.Set<java.lang.String> strSet36 = cKMethodResult34.getFieldsAccessed();
        cKMethodResult22.setMethodInvocationLocal(strSet36);
        cKClassResult12.setFieldNames(strSet36);
        cKMethodResult4.setMethodInvocationLocal(strSet36);
        int int40 = cKMethodResult4.getParametersQty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(strSet36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getInnerClassesQty();
        java.util.Optional<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultOptional7 = cKClassResult4.getMethod("hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(cKMethodResultOptional7);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.NameQualifiedType nameQualifiedType7 = null;
        boolean boolean8 = cKVisitor4.visit(nameQualifiedType7);
        org.eclipse.jdt.core.dom.SimpleName simpleName9 = null;
        boolean boolean10 = cKVisitor4.visit(simpleName9);
        org.eclipse.jdt.core.dom.MethodInvocation methodInvocation11 = null;
        boolean boolean12 = cKVisitor4.visit(methodInvocation11);
        org.eclipse.jdt.core.dom.CatchClause catchClause13 = null;
        boolean boolean14 = cKVisitor4.visit(catchClause13);
        org.eclipse.jdt.core.dom.IntersectionType intersectionType15 = null;
        cKVisitor4.endVisit(intersectionType15);
        org.eclipse.jdt.core.dom.ExpressionMethodReference expressionMethodReference17 = null;
        cKVisitor4.endVisit(expressionMethodReference17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.ContinueStatement continueStatement9 = null;
        cKVisitor4.endVisit(continueStatement9);
        org.eclipse.jdt.core.dom.SingleVariableDeclaration singleVariableDeclaration11 = null;
        boolean boolean12 = cKVisitor4.visit(singleVariableDeclaration11);
        org.eclipse.jdt.core.dom.MemberRef memberRef13 = null;
        cKVisitor4.endVisit(memberRef13);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression15 = null;
        cKVisitor4.endVisit(patternInstanceofExpression15);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "hi!", false, (int) (byte) 0);
        cKMethodResult4.setFanout(1);
        cKMethodResult4.setCbo(10);
        int int9 = cKMethodResult4.getAnonymousClassesQty();
        int int10 = cKMethodResult4.getNumbersQty();
        cKMethodResult4.setMathOperationsQty((int) ' ');
        boolean boolean13 = cKMethodResult4.isConstructor();
        cKMethodResult4.setFanout(10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getUniqueWordsQty();
        cKMethodResult4.setUniqueWordsQty((int) (byte) 10);
        int int8 = cKMethodResult4.getLogStatementsQty();
        int int9 = cKMethodResult4.getCbo();
        java.util.Set<java.lang.String> strSet10 = cKMethodResult4.getFieldsAccessed();
        cKMethodResult4.setCboModified((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        java.util.Set<java.lang.String> strSet6 = cKMethodResult4.getMethodInvocationsLocal();
        java.util.Set<java.lang.String> strSet7 = cKMethodResult4.getFieldsAccessed();
        int int8 = cKMethodResult4.getComparisonsQty();
        cKMethodResult4.setLoc((-1));
        int int11 = cKMethodResult4.getLogStatementsQty();
        cKMethodResult4.setUniqueWordsQty((int) (byte) 100);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getInnerClassesQty();
        cKClassResult4.setLogStatementsQty(0);
        int int8 = cKClassResult4.getAssignmentsQty();
        cKClassResult4.setNumberOfStaticFields((int) (short) 10);
        float float11 = cKClassResult4.getLcomNormalized();
        cKClassResult4.setNumberOfStaticMethods(100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ASTNode aSTNode5 = null;
        boolean boolean6 = cKVisitor4.preVisit2(aSTNode5);
        org.eclipse.jdt.core.dom.SwitchStatement switchStatement7 = null;
        boolean boolean8 = cKVisitor4.visit(switchStatement7);
        org.eclipse.jdt.core.dom.AnnotationTypeDeclaration annotationTypeDeclaration9 = null;
        cKVisitor4.endVisit(annotationTypeDeclaration9);
        org.eclipse.jdt.core.dom.AssertStatement assertStatement11 = null;
        boolean boolean12 = cKVisitor4.visit(assertStatement11);
        org.eclipse.jdt.core.dom.Assignment assignment13 = null;
        boolean boolean14 = cKVisitor4.visit(assignment13);
        org.eclipse.jdt.core.dom.BooleanLiteral booleanLiteral15 = null;
        cKVisitor4.endVisit(booleanLiteral15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        java.util.Set<java.lang.String> strSet6 = cKMethodResult4.getMethodInvocationsLocal();
        int int7 = cKMethodResult4.getLambdasQty();
        cKMethodResult4.setParenthesizedExpsQty((int) (short) -1);
        int int10 = cKMethodResult4.getModifiers();
        int int11 = cKMethodResult4.getVariablesQty();
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.SuperMethodReference superMethodReference7 = null;
        cKVisitor4.endVisit(superMethodReference7);
        org.eclipse.jdt.core.dom.SuperFieldAccess superFieldAccess9 = null;
        cKVisitor4.endVisit(superFieldAccess9);
        org.eclipse.jdt.core.dom.ArrayAccess arrayAccess11 = null;
        cKVisitor4.endVisit(arrayAccess11);
        org.eclipse.jdt.core.dom.MemberRef memberRef13 = null;
        cKVisitor4.endVisit(memberRef13);
        org.eclipse.jdt.core.dom.MethodInvocation methodInvocation15 = null;
        boolean boolean16 = cKVisitor4.visit(methodInvocation15);
        org.eclipse.jdt.core.dom.ASTNode aSTNode17 = null;
        boolean boolean18 = cKVisitor4.preVisit2(aSTNode17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setStringLiteralsQty((int) (byte) 1);
        java.util.Optional<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultOptional8 = cKClassResult4.getMethod("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
        cKClassResult4.setLooseClassCohesion((float) 10L);
        cKClassResult4.setFanin((int) 'a');
        int int13 = cKClassResult4.getFanout();
        org.junit.Assert.assertNotNull(cKMethodResultOptional8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        cKClassResult4.setInnerClassesQty((int) (short) 100);
        cKClassResult4.setParenthesizedExpsQty((int) '4');
        float float10 = cKClassResult4.getLcomNormalized();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        java.util.Set<java.lang.String> strSet6 = cKMethodResult4.getMethodInvocationsLocal();
        java.util.Set<java.lang.String> strSet7 = cKMethodResult4.getFieldsAccessed();
        java.lang.String str8 = cKMethodResult4.getQualifiedMethodName();
        cKMethodResult4.setStartLine(10);
        int int11 = cKMethodResult4.getModifiers();
        int int12 = cKMethodResult4.getLogStatementsQty();
        int int13 = cKMethodResult4.getFanin();
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ASTNode aSTNode5 = null;
        boolean boolean6 = cKVisitor4.preVisit2(aSTNode5);
        org.eclipse.jdt.core.dom.MethodInvocation methodInvocation7 = null;
        boolean boolean8 = cKVisitor4.visit(methodInvocation7);
        org.eclipse.jdt.core.dom.SwitchExpression switchExpression9 = null;
        cKVisitor4.endVisit(switchExpression9);
        org.eclipse.jdt.core.dom.SwitchExpression switchExpression11 = null;
        boolean boolean12 = cKVisitor4.visit(switchExpression11);
        java.util.Set<com.github.mauricioaniche.ck.CKClassResult> cKClassResultSet13 = cKVisitor4.getCollectedClasses();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(cKClassResultSet13);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.IntersectionType intersectionType7 = null;
        boolean boolean8 = cKVisitor4.visit(intersectionType7);
        org.eclipse.jdt.core.dom.ExportsDirective exportsDirective9 = null;
        boolean boolean10 = cKVisitor4.visit(exportsDirective9);
        org.eclipse.jdt.core.dom.UnionType unionType11 = null;
        cKVisitor4.endVisit(unionType11);
        org.eclipse.jdt.core.dom.ASTNode aSTNode13 = null;
        boolean boolean14 = cKVisitor4.preVisit2(aSTNode13);
        org.eclipse.jdt.core.dom.SingleMemberAnnotation singleMemberAnnotation15 = null;
        boolean boolean16 = cKVisitor4.visit(singleMemberAnnotation15);
        org.eclipse.jdt.core.dom.ThrowStatement throwStatement17 = null;
        cKVisitor4.endVisit(throwStatement17);
        org.eclipse.jdt.core.dom.Javadoc javadoc19 = null;
        boolean boolean20 = cKVisitor4.visit(javadoc19);
        org.eclipse.jdt.core.dom.TypeDeclarationStatement typeDeclarationStatement21 = null;
        boolean boolean22 = cKVisitor4.visit(typeDeclarationStatement21);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression9 = null;
        cKVisitor4.endVisit(patternInstanceofExpression9);
        org.eclipse.jdt.core.dom.InstanceofExpression instanceofExpression11 = null;
        cKVisitor4.endVisit(instanceofExpression11);
        org.eclipse.jdt.core.dom.ParameterizedType parameterizedType13 = null;
        boolean boolean14 = cKVisitor4.visit(parameterizedType13);
        org.eclipse.jdt.core.dom.Dimension dimension15 = null;
        boolean boolean16 = cKVisitor4.visit(dimension15);
        org.eclipse.jdt.core.dom.ReturnStatement returnStatement17 = null;
        cKVisitor4.endVisit(returnStatement17);
        org.eclipse.jdt.core.dom.ReturnStatement returnStatement19 = null;
        cKVisitor4.endVisit(returnStatement19);
        org.eclipse.jdt.core.dom.AssertStatement assertStatement21 = null;
        boolean boolean22 = cKVisitor4.visit(assertStatement21);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.MarkerAnnotation markerAnnotation9 = null;
        cKVisitor4.endVisit(markerAnnotation9);
        org.eclipse.jdt.core.dom.TextBlock textBlock11 = null;
        cKVisitor4.endVisit(textBlock11);
        org.eclipse.jdt.core.dom.ExpressionMethodReference expressionMethodReference13 = null;
        cKVisitor4.endVisit(expressionMethodReference13);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ASTNode aSTNode5 = null;
        boolean boolean6 = cKVisitor4.preVisit2(aSTNode5);
        org.eclipse.jdt.core.dom.SwitchStatement switchStatement7 = null;
        boolean boolean8 = cKVisitor4.visit(switchStatement7);
        org.eclipse.jdt.core.dom.ClassInstanceCreation classInstanceCreation9 = null;
        cKVisitor4.endVisit(classInstanceCreation9);
        org.eclipse.jdt.core.dom.TypeMethodReference typeMethodReference11 = null;
        cKVisitor4.endVisit(typeMethodReference11);
        org.eclipse.jdt.core.dom.LineComment lineComment13 = null;
        boolean boolean14 = cKVisitor4.visit(lineComment13);
        org.eclipse.jdt.core.dom.SingleVariableDeclaration singleVariableDeclaration15 = null;
        cKVisitor4.endVisit(singleVariableDeclaration15);
        org.eclipse.jdt.core.dom.EnumDeclaration enumDeclaration17 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(enumDeclaration17);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        java.util.Optional<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultOptional6 = cKClassResult4.getMethod("hi!");
        cKClassResult4.setTryCatchQty((int) '4');
        java.util.Set<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultSet9 = cKClassResult4.getMethods();
        org.junit.Assert.assertNotNull(cKMethodResultOptional6);
        org.junit.Assert.assertNotNull(cKMethodResultSet9);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression9 = null;
        cKVisitor4.endVisit(patternInstanceofExpression9);
        org.eclipse.jdt.core.dom.InstanceofExpression instanceofExpression11 = null;
        cKVisitor4.endVisit(instanceofExpression11);
        org.eclipse.jdt.core.dom.Assignment assignment13 = null;
        cKVisitor4.endVisit(assignment13);
        org.eclipse.jdt.core.dom.SimpleType simpleType15 = null;
        cKVisitor4.endVisit(simpleType15);
        org.eclipse.jdt.core.dom.Block block17 = null;
        boolean boolean18 = cKVisitor4.visit(block17);
        org.eclipse.jdt.core.dom.LabeledStatement labeledStatement19 = null;
        cKVisitor4.endVisit(labeledStatement19);
        org.eclipse.jdt.core.dom.Block block21 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(block21);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.UsesDirective usesDirective9 = null;
        boolean boolean10 = cKVisitor4.visit(usesDirective9);
        org.eclipse.jdt.core.dom.BlockComment blockComment11 = null;
        cKVisitor4.endVisit(blockComment11);
        org.eclipse.jdt.core.dom.ModuleDeclaration moduleDeclaration13 = null;
        cKVisitor4.endVisit(moduleDeclaration13);
        org.eclipse.jdt.core.dom.CatchClause catchClause15 = null;
        boolean boolean16 = cKVisitor4.visit(catchClause15);
        org.eclipse.jdt.core.dom.InstanceofExpression instanceofExpression17 = null;
        cKVisitor4.endVisit(instanceofExpression17);
        org.eclipse.jdt.core.dom.PrimitiveType primitiveType19 = null;
        cKVisitor4.endVisit(primitiveType19);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("hi!", "hi!", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", 0);
        cKClassResult4.setNumberOfDefaultMethods((int) ' ');
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.EnumConstantDeclaration enumConstantDeclaration7 = null;
        cKVisitor4.endVisit(enumConstantDeclaration7);
        org.eclipse.jdt.core.dom.MarkerAnnotation markerAnnotation9 = null;
        boolean boolean10 = cKVisitor4.visit(markerAnnotation9);
        org.eclipse.jdt.core.dom.SuperConstructorInvocation superConstructorInvocation11 = null;
        boolean boolean12 = cKVisitor4.visit(superConstructorInvocation11);
        org.eclipse.jdt.core.dom.ClassInstanceCreation classInstanceCreation13 = null;
        cKVisitor4.endVisit(classInstanceCreation13);
        org.eclipse.jdt.core.dom.ContinueStatement continueStatement15 = null;
        boolean boolean16 = cKVisitor4.visit(continueStatement15);
        org.eclipse.jdt.core.dom.ASTNode aSTNode17 = null;
        boolean boolean18 = cKVisitor4.preVisit2(aSTNode17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression9 = null;
        cKVisitor4.endVisit(patternInstanceofExpression9);
        org.eclipse.jdt.core.dom.InstanceofExpression instanceofExpression11 = null;
        cKVisitor4.endVisit(instanceofExpression11);
        org.eclipse.jdt.core.dom.Assignment assignment13 = null;
        cKVisitor4.endVisit(assignment13);
        org.eclipse.jdt.core.dom.SimpleType simpleType15 = null;
        cKVisitor4.endVisit(simpleType15);
        org.eclipse.jdt.core.dom.Block block17 = null;
        boolean boolean18 = cKVisitor4.visit(block17);
        org.eclipse.jdt.core.dom.LabeledStatement labeledStatement19 = null;
        cKVisitor4.endVisit(labeledStatement19);
        org.eclipse.jdt.core.dom.VariableDeclarationExpression variableDeclarationExpression21 = null;
        boolean boolean22 = cKVisitor4.visit(variableDeclarationExpression21);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression23 = null;
        boolean boolean24 = cKVisitor4.visit(patternInstanceofExpression23);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setStringLiteralsQty((-1));
        int int7 = cKClassResult4.getMaxNestedBlocks();
        int int8 = cKClassResult4.getNumberOfAbstractMethods();
        cKClassResult4.setNumberOfMethods((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getUniqueWordsQty();
        int int7 = cKClassResult4.getUniqueWordsQty();
        int int8 = cKClassResult4.getNumberOfStaticFields();
        cKClassResult4.setNosi((int) (byte) 100);
        int int11 = cKClassResult4.getNosi();
        java.util.Set<java.lang.String> strSet12 = cKClassResult4.getFieldNames();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNull(strSet12);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        int int6 = cKMethodResult4.getMaxNestedBlocks();
        cKMethodResult4.setVariablesQty((int) (short) 1);
        cKMethodResult4.setMaxNestedBlocks((-1));
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getLcom();
        cKClassResult4.setLcom((int) '#');
        int int10 = cKClassResult4.getNumberOfPublicFields();
        cKClassResult4.setNumberOfProtectedFields((int) (short) 10);
        int int13 = cKClassResult4.getRfc();
        int int14 = cKClassResult4.getStringLiteralsQty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getUniqueWordsQty();
        int int7 = cKClassResult4.getUniqueWordsQty();
        int int8 = cKClassResult4.getNosi();
        int int9 = cKClassResult4.getNumberOfDefaultFields();
        int int10 = cKClassResult4.getInnerClassesQty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getUniqueWordsQty();
        cKMethodResult4.setUniqueWordsQty((int) (byte) 10);
        cKMethodResult4.setAnonymousClassesQty((int) (short) 1);
        java.util.Set<java.lang.String> strSet10 = cKMethodResult4.getFieldsAccessed();
        boolean boolean11 = cKMethodResult4.getHasJavadoc();
        java.util.Map<java.lang.String, java.util.Set<java.lang.String>> strMap12 = cKMethodResult4.getMethodInvocationsIndirectLocal();
        cKMethodResult4.setStartLine((int) '4');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ASTNode aSTNode5 = null;
        boolean boolean6 = cKVisitor4.preVisit2(aSTNode5);
        org.eclipse.jdt.core.dom.SwitchStatement switchStatement7 = null;
        boolean boolean8 = cKVisitor4.visit(switchStatement7);
        org.eclipse.jdt.core.dom.ConditionalExpression conditionalExpression9 = null;
        boolean boolean10 = cKVisitor4.visit(conditionalExpression9);
        org.eclipse.jdt.core.dom.MarkerAnnotation markerAnnotation11 = null;
        boolean boolean12 = cKVisitor4.visit(markerAnnotation11);
        org.eclipse.jdt.core.dom.SuperMethodInvocation superMethodInvocation13 = null;
        cKVisitor4.endVisit(superMethodInvocation13);
        org.eclipse.jdt.core.dom.PrimitiveType primitiveType15 = null;
        boolean boolean16 = cKVisitor4.visit(primitiveType15);
        org.eclipse.jdt.core.dom.SuperConstructorInvocation superConstructorInvocation17 = null;
        boolean boolean18 = cKVisitor4.visit(superConstructorInvocation17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "hi!", false, (int) (byte) 0);
        cKMethodResult4.setFanout(1);
        cKMethodResult4.setCbo(10);
        int int9 = cKMethodResult4.getAnonymousClassesQty();
        int int10 = cKMethodResult4.getLoc();
        cKMethodResult4.setCboModified(10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getUniqueWordsQty();
        cKMethodResult4.setUniqueWordsQty((int) (byte) 10);
        cKMethodResult4.setAnonymousClassesQty((int) (short) 1);
        java.util.Set<java.lang.String> strSet10 = cKMethodResult4.getFieldsAccessed();
        boolean boolean11 = cKMethodResult4.getHasJavadoc();
        int int12 = cKMethodResult4.getLogStatementsQty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.UsesDirective usesDirective7 = null;
        boolean boolean8 = cKVisitor4.visit(usesDirective7);
        org.eclipse.jdt.core.dom.VariableDeclarationExpression variableDeclarationExpression9 = null;
        boolean boolean10 = cKVisitor4.visit(variableDeclarationExpression9);
        org.eclipse.jdt.core.dom.RecordDeclaration recordDeclaration11 = null;
        boolean boolean12 = cKVisitor4.visit(recordDeclaration11);
        org.eclipse.jdt.core.dom.SuperMethodInvocation superMethodInvocation13 = null;
        boolean boolean14 = cKVisitor4.visit(superMethodInvocation13);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ASTNode aSTNode5 = null;
        boolean boolean6 = cKVisitor4.preVisit2(aSTNode5);
        org.eclipse.jdt.core.dom.SwitchStatement switchStatement7 = null;
        boolean boolean8 = cKVisitor4.visit(switchStatement7);
        org.eclipse.jdt.core.dom.VariableDeclarationFragment variableDeclarationFragment9 = null;
        cKVisitor4.endVisit(variableDeclarationFragment9);
        org.eclipse.jdt.core.dom.CreationReference creationReference11 = null;
        boolean boolean12 = cKVisitor4.visit(creationReference11);
        org.eclipse.jdt.core.dom.InstanceofExpression instanceofExpression13 = null;
        cKVisitor4.endVisit(instanceofExpression13);
        org.eclipse.jdt.core.dom.UnionType unionType15 = null;
        cKVisitor4.endVisit(unionType15);
        org.eclipse.jdt.core.dom.TextBlock textBlock17 = null;
        cKVisitor4.endVisit(textBlock17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression9 = null;
        cKVisitor4.endVisit(patternInstanceofExpression9);
        org.eclipse.jdt.core.dom.InstanceofExpression instanceofExpression11 = null;
        cKVisitor4.endVisit(instanceofExpression11);
        org.eclipse.jdt.core.dom.ParameterizedType parameterizedType13 = null;
        boolean boolean14 = cKVisitor4.visit(parameterizedType13);
        org.eclipse.jdt.core.dom.Dimension dimension15 = null;
        boolean boolean16 = cKVisitor4.visit(dimension15);
        org.eclipse.jdt.core.dom.ExpressionStatement expressionStatement17 = null;
        boolean boolean18 = cKVisitor4.visit(expressionStatement17);
        org.eclipse.jdt.core.dom.FieldDeclaration fieldDeclaration19 = null;
        boolean boolean20 = cKVisitor4.visit(fieldDeclaration19);
        org.eclipse.jdt.core.dom.Dimension dimension21 = null;
        boolean boolean22 = cKVisitor4.visit(dimension21);
        org.eclipse.jdt.core.dom.SuperFieldAccess superFieldAccess23 = null;
        cKVisitor4.endVisit(superFieldAccess23);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.SuperMethodReference superMethodReference7 = null;
        cKVisitor4.endVisit(superMethodReference7);
        org.eclipse.jdt.core.dom.SuperFieldAccess superFieldAccess9 = null;
        cKVisitor4.endVisit(superFieldAccess9);
        org.eclipse.jdt.core.dom.ArrayAccess arrayAccess11 = null;
        cKVisitor4.endVisit(arrayAccess11);
        org.eclipse.jdt.core.dom.MemberRef memberRef13 = null;
        cKVisitor4.endVisit(memberRef13);
        org.eclipse.jdt.core.dom.MethodInvocation methodInvocation15 = null;
        boolean boolean16 = cKVisitor4.visit(methodInvocation15);
        org.eclipse.jdt.core.dom.EmptyStatement emptyStatement17 = null;
        boolean boolean18 = cKVisitor4.visit(emptyStatement17);
        org.eclipse.jdt.core.dom.MethodRef methodRef19 = null;
        cKVisitor4.endVisit(methodRef19);
        org.eclipse.jdt.core.dom.BreakStatement breakStatement21 = null;
        cKVisitor4.endVisit(breakStatement21);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.EnumConstantDeclaration enumConstantDeclaration7 = null;
        cKVisitor4.endVisit(enumConstantDeclaration7);
        org.eclipse.jdt.core.dom.MarkerAnnotation markerAnnotation9 = null;
        boolean boolean10 = cKVisitor4.visit(markerAnnotation9);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression11 = null;
        cKVisitor4.endVisit(patternInstanceofExpression11);
        org.eclipse.jdt.core.dom.ThisExpression thisExpression13 = null;
        cKVisitor4.endVisit(thisExpression13);
        org.eclipse.jdt.core.dom.InstanceofExpression instanceofExpression15 = null;
        boolean boolean16 = cKVisitor4.visit(instanceofExpression15);
        org.eclipse.jdt.core.dom.QualifiedName qualifiedName17 = null;
        boolean boolean18 = cKVisitor4.visit(qualifiedName17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.ProvidesDirective providesDirective9 = null;
        boolean boolean10 = cKVisitor4.visit(providesDirective9);
        org.eclipse.jdt.core.dom.ThisExpression thisExpression11 = null;
        cKVisitor4.endVisit(thisExpression11);
        org.eclipse.jdt.core.dom.ContinueStatement continueStatement13 = null;
        boolean boolean14 = cKVisitor4.visit(continueStatement13);
        org.eclipse.jdt.core.dom.ArrayAccess arrayAccess15 = null;
        cKVisitor4.endVisit(arrayAccess15);
        org.eclipse.jdt.core.dom.RequiresDirective requiresDirective17 = null;
        boolean boolean18 = cKVisitor4.visit(requiresDirective17);
        org.eclipse.jdt.core.dom.PrimitiveType primitiveType19 = null;
        boolean boolean20 = cKVisitor4.visit(primitiveType19);
        org.eclipse.jdt.core.dom.SuperMethodReference superMethodReference21 = null;
        cKVisitor4.endVisit(superMethodReference21);
        org.eclipse.jdt.core.dom.QualifiedType qualifiedType23 = null;
        boolean boolean24 = cKVisitor4.visit(qualifiedType23);
        org.eclipse.jdt.core.dom.SuperMethodReference superMethodReference25 = null;
        cKVisitor4.endVisit(superMethodReference25);
        org.eclipse.jdt.core.dom.MethodRefParameter methodRefParameter27 = null;
        boolean boolean28 = cKVisitor4.visit(methodRefParameter27);
        org.eclipse.jdt.core.dom.RecordDeclaration recordDeclaration29 = null;
        boolean boolean30 = cKVisitor4.visit(recordDeclaration29);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        com.github.mauricioaniche.ck.CK cK0 = new com.github.mauricioaniche.ck.CK();
        com.github.mauricioaniche.ck.CKNotifier cKNotifier2 = null;
// flaky:         cK0.calculate("hi!", cKNotifier2);
        java.nio.file.Path path4 = null;
        com.github.mauricioaniche.ck.CKNotifier cKNotifier5 = null;
        java.nio.file.Path[] pathArray6 = new java.nio.file.Path[] {};
        // The following exception was thrown during execution in test generation
        try {
            cK0.calculate(path4, cKNotifier5, pathArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pathArray6);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setStringLiteralsQty((int) (byte) 1);
        java.util.Optional<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultOptional8 = cKClassResult4.getMethod("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
        int int9 = cKClassResult4.getLoopQty();
        int int10 = cKClassResult4.getFanin();
        cKClassResult4.setAnonymousClassesQty((int) (short) 0);
        cKClassResult4.setParenthesizedExpsQty((int) (short) 100);
        org.junit.Assert.assertNotNull(cKMethodResultOptional8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.NameQualifiedType nameQualifiedType7 = null;
        boolean boolean8 = cKVisitor4.visit(nameQualifiedType7);
        org.eclipse.jdt.core.dom.SimpleName simpleName9 = null;
        boolean boolean10 = cKVisitor4.visit(simpleName9);
        org.eclipse.jdt.core.dom.OpensDirective opensDirective11 = null;
        cKVisitor4.endVisit(opensDirective11);
        org.eclipse.jdt.core.dom.ConstructorInvocation constructorInvocation13 = null;
        boolean boolean14 = cKVisitor4.visit(constructorInvocation13);
        org.eclipse.jdt.core.dom.LambdaExpression lambdaExpression15 = null;
        cKVisitor4.endVisit(lambdaExpression15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getUniqueWordsQty();
        int int6 = cKMethodResult4.getAssignmentsQty();
        cKMethodResult4.setTryCatchQty((int) (byte) 0);
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult13 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet14 = cKMethodResult13.getMethodInvocations();
        java.util.Set<java.lang.String> strSet15 = cKMethodResult13.getMethodInvocationsLocal();
        int int16 = cKMethodResult13.getLambdasQty();
        cKMethodResult13.setParenthesizedExpsQty((int) (short) -1);
        java.util.Set<java.lang.String> strSet19 = cKMethodResult13.getFieldsAccessed();
        cKMethodResult4.setMethodInvocationLocal(strSet19);
        java.lang.String str21 = cKMethodResult4.getMethodName();
        cKMethodResult4.setStringLiteralsQty((int) (byte) -1);
        int int24 = cKMethodResult4.getAssignmentsQty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap25 = cKMethodResult4.getVariablesUsage();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(strSet15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(strMap25);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        java.util.Set<java.lang.String> strSet6 = cKMethodResult4.getMethodInvocationsLocal();
        int int7 = cKMethodResult4.getLambdasQty();
        cKMethodResult4.setLambdasQty((int) (short) -1);
        int int10 = cKMethodResult4.getReturnQty();
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setStringLiteralsQty((int) (byte) 1);
        java.util.Optional<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultOptional8 = cKClassResult4.getMethod("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
        int int9 = cKClassResult4.getLoopQty();
        cKClassResult4.setLcom(100);
        int int12 = cKClassResult4.getAssignmentsQty();
        cKClassResult4.setNoc((int) (byte) 0);
        cKClassResult4.setNumberOfSynchronizedFields(35);
        org.junit.Assert.assertNotNull(cKMethodResultOptional8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        java.util.Set<java.lang.String> strSet6 = cKMethodResult4.getMethodInvocationsLocal();
        java.util.Set<java.lang.String> strSet7 = cKMethodResult4.getFieldsAccessed();
        java.lang.String str8 = cKMethodResult4.getQualifiedMethodName();
        cKMethodResult4.setStartLine(10);
        cKMethodResult4.setParametersQty((int) '4');
        int int13 = cKMethodResult4.getAnonymousClassesQty();
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getComparisonsQty();
        cKMethodResult4.setReturnQty((int) (byte) -1);
        cKMethodResult4.setCboModified((int) (byte) 100);
        int int10 = cKMethodResult4.getFanout();
        int int11 = cKMethodResult4.getTryCatchQty();
        int int12 = cKMethodResult4.getRfc();
        cKMethodResult4.setFanout((int) (short) 0);
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit16 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable17 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable18 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor19 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit16, classLevelMetricListCallable17, methodLevelMetricListCallable18);
        org.eclipse.jdt.core.dom.MemberRef memberRef20 = null;
        boolean boolean21 = cKVisitor19.visit(memberRef20);
        org.eclipse.jdt.core.dom.NameQualifiedType nameQualifiedType22 = null;
        boolean boolean23 = cKVisitor19.visit(nameQualifiedType22);
        org.eclipse.jdt.core.dom.MarkerAnnotation markerAnnotation24 = null;
        cKVisitor19.endVisit(markerAnnotation24);
        org.eclipse.jdt.core.dom.ArrayAccess arrayAccess26 = null;
        cKVisitor19.endVisit(arrayAccess26);
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit28 = null;
        boolean boolean29 = cKVisitor19.visit(compilationUnit28);
        org.eclipse.jdt.core.dom.ContinueStatement continueStatement30 = null;
        cKVisitor19.endVisit(continueStatement30);
        org.eclipse.jdt.core.dom.OpensDirective opensDirective32 = null;
        boolean boolean33 = cKVisitor19.visit(opensDirective32);
        org.eclipse.jdt.core.dom.MemberValuePair memberValuePair34 = null;
        boolean boolean35 = cKVisitor19.visit(memberValuePair34);
        boolean boolean36 = cKMethodResult4.equals((java.lang.Object) boolean35);
        int int37 = cKMethodResult4.getParametersQty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.UsesDirective usesDirective7 = null;
        boolean boolean8 = cKVisitor4.visit(usesDirective7);
        org.eclipse.jdt.core.dom.ClassInstanceCreation classInstanceCreation9 = null;
        boolean boolean10 = cKVisitor4.visit(classInstanceCreation9);
        org.eclipse.jdt.core.dom.UsesDirective usesDirective11 = null;
        cKVisitor4.endVisit(usesDirective11);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", true, 0);
        cKMethodResult4.setCbo(0);
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult11 = new com.github.mauricioaniche.ck.CKMethodResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", true, 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cKMethodResult11.getVariablesUsage();
        cKMethodResult4.setFieldUsage(strMap12);
        com.github.mauricioaniche.ck.CKClassResult cKClassResult18 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult18.setAnonymousClassesQty((int) (byte) -1);
        int int21 = cKClassResult18.getNumberOfSynchronizedFields();
        cKClassResult18.setAssignmentsQty((int) (byte) 1);
        cKClassResult18.setLcomNormalized((float) (short) 10);
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult30 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "hi!", false, (int) (byte) 0);
        cKMethodResult30.setFanout(1);
        cKMethodResult30.setCbo(10);
        int int35 = cKMethodResult30.getAnonymousClassesQty();
        int int36 = cKMethodResult30.getNumbersQty();
        cKMethodResult30.setMathOperationsQty((int) ' ');
        int int39 = cKMethodResult30.getTryCatchQty();
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult44 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int45 = cKMethodResult44.getUniqueWordsQty();
        int int46 = cKMethodResult44.getAssignmentsQty();
        cKMethodResult44.setTryCatchQty((int) (byte) 0);
        java.lang.String str49 = cKMethodResult44.getMethodName();
        java.util.Map<java.lang.String, java.lang.Integer> strMap50 = null;
        cKMethodResult44.setVariablesUsage(strMap50);
        cKMethodResult44.setHasJavadoc(false);
        int int54 = cKMethodResult44.getLambdasQty();
        com.github.mauricioaniche.ck.CKClassResult cKClassResult59 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int60 = cKClassResult59.getNumberOfFinalFields();
        int int61 = cKClassResult59.getLoc();
        int int62 = cKClassResult59.getLcom();
        cKClassResult59.setLcom((int) '#');
        int int65 = cKClassResult59.getNumberOfPublicFields();
        cKClassResult59.setNumberOfProtectedFields((int) (short) 10);
        int int68 = cKClassResult59.getRfc();
        int int69 = cKClassResult59.getNumberOfPublicMethods();
        com.github.mauricioaniche.ck.CKClassResult cKClassResult74 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        float float75 = cKClassResult74.getTightClassCohesion();
        cKClassResult74.setAssignmentsQty((int) (short) -1);
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult82 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int83 = cKMethodResult82.getUniqueWordsQty();
        cKMethodResult82.setUniqueWordsQty((int) (byte) 10);
        cKMethodResult82.setAnonymousClassesQty((int) (short) 1);
        java.util.Set<java.lang.String> strSet88 = cKMethodResult82.getFieldsAccessed();
        cKClassResult74.setFieldNames(strSet88);
        cKClassResult59.setFieldNames(strSet88);
        cKMethodResult44.setMethodInvocations(strSet88);
        cKMethodResult30.setMethodInvocationLocal(strSet88);
        cKClassResult18.setFieldNames(strSet88);
        cKMethodResult4.setMethodInvocations(strSet88);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + float75 + "' != '" + 0.0f + "'", float75 == 0.0f);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertNotNull(strSet88);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        cKMethodResult4.setLoc((int) (byte) 100);
        cKMethodResult4.setTryCatchQty((int) (byte) -1);
        int int9 = cKMethodResult4.getNumbersQty();
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult14 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int15 = cKMethodResult14.getComparisonsQty();
        cKMethodResult14.setReturnQty((int) (byte) -1);
        cKMethodResult14.setCboModified((int) (byte) 100);
        int int20 = cKMethodResult14.getFanout();
        boolean boolean21 = cKMethodResult4.equals((java.lang.Object) cKMethodResult14);
        cKMethodResult14.setParametersQty((int) '4');
        int int24 = cKMethodResult14.getReturnQty();
        int int25 = cKMethodResult14.getComparisonsQty();
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult30 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int31 = cKMethodResult30.getUniqueWordsQty();
        int int32 = cKMethodResult30.getNumbersQty();
        int int33 = cKMethodResult30.getVariablesQty();
        java.util.Set<java.lang.String> strSet34 = null;
        cKMethodResult30.setMethodInvocations(strSet34);
        java.util.Map<java.lang.String, java.lang.Integer> strMap36 = cKMethodResult30.getVariablesUsage();
        cKMethodResult14.setFieldUsage(strMap36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(strMap36);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression9 = null;
        cKVisitor4.endVisit(patternInstanceofExpression9);
        org.eclipse.jdt.core.dom.InstanceofExpression instanceofExpression11 = null;
        cKVisitor4.endVisit(instanceofExpression11);
        org.eclipse.jdt.core.dom.Assignment assignment13 = null;
        cKVisitor4.endVisit(assignment13);
        org.eclipse.jdt.core.dom.SimpleType simpleType15 = null;
        cKVisitor4.endVisit(simpleType15);
        org.eclipse.jdt.core.dom.Block block17 = null;
        boolean boolean18 = cKVisitor4.visit(block17);
        org.eclipse.jdt.core.dom.MemberValuePair memberValuePair19 = null;
        boolean boolean20 = cKVisitor4.visit(memberValuePair19);
        org.eclipse.jdt.core.dom.Assignment assignment21 = null;
        boolean boolean22 = cKVisitor4.visit(assignment21);
        org.eclipse.jdt.core.dom.TextBlock textBlock23 = null;
        cKVisitor4.endVisit(textBlock23);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.NameQualifiedType nameQualifiedType7 = null;
        boolean boolean8 = cKVisitor4.visit(nameQualifiedType7);
        org.eclipse.jdt.core.dom.MarkerAnnotation markerAnnotation9 = null;
        cKVisitor4.endVisit(markerAnnotation9);
        org.eclipse.jdt.core.dom.FieldDeclaration fieldDeclaration11 = null;
        boolean boolean12 = cKVisitor4.visit(fieldDeclaration11);
        org.eclipse.jdt.core.dom.Javadoc javadoc13 = null;
        boolean boolean14 = cKVisitor4.visit(javadoc13);
        org.eclipse.jdt.core.dom.LineComment lineComment15 = null;
        boolean boolean16 = cKVisitor4.visit(lineComment15);
        org.eclipse.jdt.core.dom.MemberValuePair memberValuePair17 = null;
        boolean boolean18 = cKVisitor4.visit(memberValuePair17);
        org.eclipse.jdt.core.dom.UsesDirective usesDirective19 = null;
        cKVisitor4.endVisit(usesDirective19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.IntersectionType intersectionType7 = null;
        boolean boolean8 = cKVisitor4.visit(intersectionType7);
        org.eclipse.jdt.core.dom.UsesDirective usesDirective9 = null;
        cKVisitor4.endVisit(usesDirective9);
        org.eclipse.jdt.core.dom.VariableDeclarationExpression variableDeclarationExpression11 = null;
        boolean boolean12 = cKVisitor4.visit(variableDeclarationExpression11);
        org.eclipse.jdt.core.dom.SuperFieldAccess superFieldAccess13 = null;
        boolean boolean14 = cKVisitor4.visit(superFieldAccess13);
        org.eclipse.jdt.core.dom.NameQualifiedType nameQualifiedType15 = null;
        cKVisitor4.endVisit(nameQualifiedType15);
        org.eclipse.jdt.core.dom.ProvidesDirective providesDirective17 = null;
        cKVisitor4.endVisit(providesDirective17);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getNumberOfFinalFields();
        int int8 = cKClassResult4.getLcom();
        int int9 = cKClassResult4.getStringLiteralsQty();
        cKClassResult4.setCbo(0);
        cKClassResult4.setLogStatementsQty((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.SuperMethodReference superMethodReference7 = null;
        cKVisitor4.endVisit(superMethodReference7);
        org.eclipse.jdt.core.dom.SuperFieldAccess superFieldAccess9 = null;
        cKVisitor4.endVisit(superFieldAccess9);
        org.eclipse.jdt.core.dom.QualifiedName qualifiedName11 = null;
        boolean boolean12 = cKVisitor4.visit(qualifiedName11);
        org.eclipse.jdt.core.dom.SimpleType simpleType13 = null;
        cKVisitor4.endVisit(simpleType13);
        org.eclipse.jdt.core.dom.UnionType unionType15 = null;
        cKVisitor4.endVisit(unionType15);
        org.eclipse.jdt.core.dom.UnionType unionType17 = null;
        boolean boolean18 = cKVisitor4.visit(unionType17);
        org.eclipse.jdt.core.dom.RequiresDirective requiresDirective19 = null;
        boolean boolean20 = cKVisitor4.visit(requiresDirective19);
        org.eclipse.jdt.core.dom.MarkerAnnotation markerAnnotation21 = null;
        cKVisitor4.endVisit(markerAnnotation21);
        org.eclipse.jdt.core.dom.TagElement tagElement23 = null;
        cKVisitor4.endVisit(tagElement23);
        org.eclipse.jdt.core.dom.BlockComment blockComment25 = null;
        boolean boolean26 = cKVisitor4.visit(blockComment25);
        org.eclipse.jdt.core.dom.ProvidesDirective providesDirective27 = null;
        cKVisitor4.endVisit(providesDirective27);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ASTNode aSTNode5 = null;
        boolean boolean6 = cKVisitor4.preVisit2(aSTNode5);
        org.eclipse.jdt.core.dom.LambdaExpression lambdaExpression7 = null;
        cKVisitor4.endVisit(lambdaExpression7);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "hi!", false, (int) (byte) 0);
        cKMethodResult4.setWmc((int) (byte) 100);
        boolean boolean7 = cKMethodResult4.getIsVisible();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.EnumConstantDeclaration enumConstantDeclaration7 = null;
        cKVisitor4.endVisit(enumConstantDeclaration7);
        org.eclipse.jdt.core.dom.MarkerAnnotation markerAnnotation9 = null;
        boolean boolean10 = cKVisitor4.visit(markerAnnotation9);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression11 = null;
        cKVisitor4.endVisit(patternInstanceofExpression11);
        org.eclipse.jdt.core.dom.ThisExpression thisExpression13 = null;
        cKVisitor4.endVisit(thisExpression13);
        org.eclipse.jdt.core.dom.RecordDeclaration recordDeclaration15 = null;
        cKVisitor4.endVisit(recordDeclaration15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getUniqueWordsQty();
        int int6 = cKMethodResult4.getAssignmentsQty();
        cKMethodResult4.setTryCatchQty((int) (byte) 0);
        java.lang.String str9 = cKMethodResult4.getMethodName();
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = null;
        cKMethodResult4.setVariablesUsage(strMap10);
        cKMethodResult4.setHasJavadoc(false);
        int int14 = cKMethodResult4.getLambdasQty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = cKMethodResult4.getFieldUsage();
        int int16 = cKMethodResult4.getVariablesQty();
        int int17 = cKMethodResult4.getLoopQty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setAnonymousClassesQty((int) (byte) -1);
        int int7 = cKClassResult4.getNumberOfSynchronizedFields();
        cKClassResult4.setAssignmentsQty((int) (byte) 1);
        int int10 = cKClassResult4.getRfc();
        cKClassResult4.setNumberOfAbstractMethods((int) '#');
        int int13 = cKClassResult4.getNumberOfStaticMethods();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ASTNode aSTNode5 = null;
        boolean boolean6 = cKVisitor4.preVisit2(aSTNode5);
        org.eclipse.jdt.core.dom.SwitchStatement switchStatement7 = null;
        boolean boolean8 = cKVisitor4.visit(switchStatement7);
        org.eclipse.jdt.core.dom.VariableDeclarationFragment variableDeclarationFragment9 = null;
        cKVisitor4.endVisit(variableDeclarationFragment9);
        org.eclipse.jdt.core.dom.ModuleModifier moduleModifier11 = null;
        cKVisitor4.endVisit(moduleModifier11);
        org.eclipse.jdt.core.dom.SynchronizedStatement synchronizedStatement13 = null;
        cKVisitor4.endVisit(synchronizedStatement13);
        org.eclipse.jdt.core.dom.TextElement textElement15 = null;
        boolean boolean16 = cKVisitor4.visit(textElement15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        com.github.mauricioaniche.ck.CK cK3 = new com.github.mauricioaniche.ck.CK(true, (int) (short) 1, false);
        com.github.mauricioaniche.ck.CKNotifier cKNotifier5 = null;
        cK3.calculate("CKClassResult [file=, className=CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}]", cKNotifier5);
        com.github.mauricioaniche.ck.CKNotifier cKNotifier8 = null;
// flaky:         cK3.calculate("hi!", cKNotifier8);
        java.nio.file.Path path10 = null;
        com.github.mauricioaniche.ck.CKNotifier cKNotifier11 = null;
        java.nio.file.Path[] pathArray12 = new java.nio.file.Path[] {};
        // The following exception was thrown during execution in test generation
        try {
            cK3.calculate(path10, cKNotifier11, pathArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pathArray12);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getNumberOfFinalFields();
        cKClassResult4.setNumberOfStaticFields(10);
        int int10 = cKClassResult4.getNumberOfStaticMethods();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        java.lang.String str6 = cKMethodResult4.getQualifiedMethodName();
        cKMethodResult4.setLoc(100);
        java.util.Map<java.lang.String, java.util.Set<java.lang.String>> strMap9 = cKMethodResult4.getMethodInvocationsIndirectLocal();
        cKMethodResult4.setLoopQty((int) (short) 1);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(strMap9);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.EnumConstantDeclaration enumConstantDeclaration7 = null;
        cKVisitor4.endVisit(enumConstantDeclaration7);
        org.eclipse.jdt.core.dom.AssertStatement assertStatement9 = null;
        boolean boolean10 = cKVisitor4.visit(assertStatement9);
        org.eclipse.jdt.core.dom.CreationReference creationReference11 = null;
        cKVisitor4.endVisit(creationReference11);
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit13 = null;
        boolean boolean14 = cKVisitor4.visit(compilationUnit13);
        org.eclipse.jdt.core.dom.CreationReference creationReference15 = null;
        boolean boolean16 = cKVisitor4.visit(creationReference15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setAnonymousClassesQty((int) (byte) -1);
        java.util.Set<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultSet7 = cKClassResult4.getMethods();
        cKClassResult4.setNumberOfMethods((int) (byte) -1);
        org.junit.Assert.assertNotNull(cKMethodResultSet7);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setAnonymousClassesQty((int) (byte) -1);
        int int7 = cKClassResult4.getNumberOfSynchronizedFields();
        cKClassResult4.setAssignmentsQty((int) (byte) 1);
        int int10 = cKClassResult4.getNumberOfDefaultMethods();
        int int11 = cKClassResult4.getNumberOfPrivateFields();
        java.lang.Class<?> wildcardClass12 = cKClassResult4.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", true, 0);
        cKMethodResult4.setCbo(0);
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult11 = new com.github.mauricioaniche.ck.CKMethodResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", true, 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cKMethodResult11.getVariablesUsage();
        cKMethodResult4.setFieldUsage(strMap12);
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = cKMethodResult4.getVariablesUsage();
        int int15 = cKMethodResult4.getStartLine();
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.CastExpression castExpression7 = null;
        cKVisitor4.endVisit(castExpression7);
        org.eclipse.jdt.core.dom.MemberValuePair memberValuePair9 = null;
        cKVisitor4.endVisit(memberValuePair9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.IntersectionType intersectionType7 = null;
        boolean boolean8 = cKVisitor4.visit(intersectionType7);
        org.eclipse.jdt.core.dom.VariableDeclarationFragment variableDeclarationFragment9 = null;
        boolean boolean10 = cKVisitor4.visit(variableDeclarationFragment9);
        org.eclipse.jdt.core.dom.ASTNode aSTNode11 = null;
        cKVisitor4.preVisit(aSTNode11);
        org.eclipse.jdt.core.dom.ThrowStatement throwStatement13 = null;
        cKVisitor4.endVisit(throwStatement13);
        org.eclipse.jdt.core.dom.SingleMemberAnnotation singleMemberAnnotation15 = null;
        boolean boolean16 = cKVisitor4.visit(singleMemberAnnotation15);
        org.eclipse.jdt.core.dom.ExportsDirective exportsDirective17 = null;
        cKVisitor4.endVisit(exportsDirective17);
        org.eclipse.jdt.core.dom.ImportDeclaration importDeclaration19 = null;
        boolean boolean20 = cKVisitor4.visit(importDeclaration19);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression9 = null;
        cKVisitor4.endVisit(patternInstanceofExpression9);
        org.eclipse.jdt.core.dom.InstanceofExpression instanceofExpression11 = null;
        cKVisitor4.endVisit(instanceofExpression11);
        org.eclipse.jdt.core.dom.InfixExpression infixExpression13 = null;
        boolean boolean14 = cKVisitor4.visit(infixExpression13);
        org.eclipse.jdt.core.dom.CharacterLiteral characterLiteral15 = null;
        cKVisitor4.endVisit(characterLiteral15);
        org.eclipse.jdt.core.dom.AnnotationTypeDeclaration annotationTypeDeclaration17 = null;
        cKVisitor4.endVisit(annotationTypeDeclaration17);
        org.eclipse.jdt.core.dom.VariableDeclarationStatement variableDeclarationStatement19 = null;
        boolean boolean20 = cKVisitor4.visit(variableDeclarationStatement19);
        org.eclipse.jdt.core.dom.TypeLiteral typeLiteral21 = null;
        cKVisitor4.endVisit(typeLiteral21);
        java.lang.Class<?> wildcardClass23 = cKVisitor4.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        java.util.Set<java.lang.String> strSet6 = cKMethodResult4.getMethodInvocationsLocal();
        int int7 = cKMethodResult4.getWmc();
        boolean boolean8 = cKMethodResult4.getHasJavadoc();
        int int9 = cKMethodResult4.getVariablesQty();
        int int10 = cKMethodResult4.getNumbersQty();
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.SuperMethodReference superMethodReference7 = null;
        cKVisitor4.endVisit(superMethodReference7);
        org.eclipse.jdt.core.dom.SuperFieldAccess superFieldAccess9 = null;
        cKVisitor4.endVisit(superFieldAccess9);
        org.eclipse.jdt.core.dom.QualifiedName qualifiedName11 = null;
        boolean boolean12 = cKVisitor4.visit(qualifiedName11);
        org.eclipse.jdt.core.dom.SimpleType simpleType13 = null;
        cKVisitor4.endVisit(simpleType13);
        org.eclipse.jdt.core.dom.UnionType unionType15 = null;
        cKVisitor4.endVisit(unionType15);
        org.eclipse.jdt.core.dom.UnionType unionType17 = null;
        boolean boolean18 = cKVisitor4.visit(unionType17);
        org.eclipse.jdt.core.dom.RequiresDirective requiresDirective19 = null;
        boolean boolean20 = cKVisitor4.visit(requiresDirective19);
        org.eclipse.jdt.core.dom.MarkerAnnotation markerAnnotation21 = null;
        cKVisitor4.endVisit(markerAnnotation21);
        org.eclipse.jdt.core.dom.TagElement tagElement23 = null;
        cKVisitor4.endVisit(tagElement23);
        org.eclipse.jdt.core.dom.CatchClause catchClause25 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(catchClause25);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getInnerClassesQty();
        cKClassResult4.setLogStatementsQty(0);
        cKClassResult4.setNumberOfPublicMethods((int) (byte) -1);
        cKClassResult4.setNumberOfPublicMethods((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        cKMethodResult4.setLoc((int) (byte) 100);
        cKMethodResult4.setTryCatchQty((int) (byte) -1);
        int int9 = cKMethodResult4.getNumbersQty();
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult14 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int15 = cKMethodResult14.getComparisonsQty();
        cKMethodResult14.setReturnQty((int) (byte) -1);
        cKMethodResult14.setCboModified((int) (byte) 100);
        int int20 = cKMethodResult14.getFanout();
        boolean boolean21 = cKMethodResult4.equals((java.lang.Object) cKMethodResult14);
        cKMethodResult14.setParametersQty((int) '4');
        int int24 = cKMethodResult14.getTryCatchQty();
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult29 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        cKMethodResult29.setLoc((int) (byte) 100);
        cKMethodResult29.setTryCatchQty((int) (byte) -1);
        int int34 = cKMethodResult29.getNumbersQty();
        cKMethodResult29.setAnonymousClassesQty((int) '#');
        int int37 = cKMethodResult29.getTryCatchQty();
        boolean boolean38 = cKMethodResult29.getIsVisible();
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult43 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int44 = cKMethodResult43.getComparisonsQty();
        cKMethodResult43.setReturnQty((int) (byte) -1);
        cKMethodResult43.setCboModified((int) (byte) 100);
        int int49 = cKMethodResult43.getFanout();
        int int50 = cKMethodResult43.getTryCatchQty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap51 = cKMethodResult43.getFieldUsage();
        cKMethodResult29.setVariablesUsage(strMap51);
        cKMethodResult14.setVariablesUsage(strMap51);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(strMap51);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ASTNode aSTNode5 = null;
        boolean boolean6 = cKVisitor4.preVisit2(aSTNode5);
        org.eclipse.jdt.core.dom.SwitchStatement switchStatement7 = null;
        boolean boolean8 = cKVisitor4.visit(switchStatement7);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression9 = null;
        boolean boolean10 = cKVisitor4.visit(patternInstanceofExpression9);
        org.eclipse.jdt.core.dom.TypeDeclarationStatement typeDeclarationStatement11 = null;
        cKVisitor4.endVisit(typeDeclarationStatement11);
        org.eclipse.jdt.core.dom.SuperMethodReference superMethodReference13 = null;
        cKVisitor4.endVisit(superMethodReference13);
        org.eclipse.jdt.core.dom.LabeledStatement labeledStatement15 = null;
        cKVisitor4.endVisit(labeledStatement15);
        org.eclipse.jdt.core.dom.YieldStatement yieldStatement17 = null;
        cKVisitor4.endVisit(yieldStatement17);
        org.eclipse.jdt.core.dom.LabeledStatement labeledStatement19 = null;
        boolean boolean20 = cKVisitor4.visit(labeledStatement19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        cKClassResult4.setInnerClassesQty((int) (short) 100);
        cKClassResult4.setParenthesizedExpsQty((int) '4');
        cKClassResult4.setNumberOfPrivateMethods((int) '4');
        java.util.Optional<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultOptional13 = cKClassResult4.getMethod("");
        cKClassResult4.setLcom(0);
        int int16 = cKClassResult4.getNoc();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(cKMethodResultOptional13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "", false, 0);
        cKMethodResult4.setMathOperationsQty((int) (short) 0);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        int int6 = cKMethodResult4.getStringLiteralsQty();
        cKMethodResult4.setWmc((int) (byte) 10);
        int int9 = cKMethodResult4.getMathOperationsQty();
        boolean boolean10 = cKMethodResult4.getIsVisible();
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult15 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        cKMethodResult15.setLoc((int) (byte) 100);
        cKMethodResult15.setTryCatchQty((int) (byte) -1);
        int int20 = cKMethodResult15.getNumbersQty();
        int int21 = cKMethodResult15.getWmc();
        cKMethodResult15.setLogStatementsQty((int) ' ');
        java.util.Set<java.lang.String> strSet24 = cKMethodResult15.getMethodInvocations();
        cKMethodResult4.setMethodInvocationLocal(strSet24);
        int int26 = cKMethodResult4.getMathOperationsQty();
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getComparisonsQty();
        cKMethodResult4.setReturnQty((int) (byte) -1);
        cKMethodResult4.setCboModified((int) (byte) 100);
        int int10 = cKMethodResult4.getFanout();
        int int11 = cKMethodResult4.getTryCatchQty();
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult16 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet17 = cKMethodResult16.getMethodInvocations();
        java.util.Set<java.lang.String> strSet18 = cKMethodResult16.getFieldsAccessed();
        cKMethodResult4.setMethodInvocationLocal(strSet18);
        cKMethodResult4.setRfc((int) ' ');
        int int22 = cKMethodResult4.getStartLine();
        int int23 = cKMethodResult4.getModifiers();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getNumberOfFinalFields();
        cKClassResult4.setNumberOfStaticFields(10);
        cKClassResult4.setTightClassCohesion((float) (byte) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.NameQualifiedType nameQualifiedType7 = null;
        boolean boolean8 = cKVisitor4.visit(nameQualifiedType7);
        org.eclipse.jdt.core.dom.MarkerAnnotation markerAnnotation9 = null;
        cKVisitor4.endVisit(markerAnnotation9);
        org.eclipse.jdt.core.dom.ArrayAccess arrayAccess11 = null;
        cKVisitor4.endVisit(arrayAccess11);
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit13 = null;
        boolean boolean14 = cKVisitor4.visit(compilationUnit13);
        org.eclipse.jdt.core.dom.SynchronizedStatement synchronizedStatement15 = null;
        cKVisitor4.endVisit(synchronizedStatement15);
        org.eclipse.jdt.core.dom.LineComment lineComment17 = null;
        boolean boolean18 = cKVisitor4.visit(lineComment17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setAnonymousClassesQty((int) (byte) -1);
        int int7 = cKClassResult4.getNumberOfSynchronizedFields();
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult12 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet13 = cKMethodResult12.getMethodInvocations();
        java.util.Set<java.lang.String> strSet14 = cKMethodResult12.getMethodInvocationsLocal();
        int int15 = cKMethodResult12.getLambdasQty();
        cKMethodResult12.setParenthesizedExpsQty((int) (short) -1);
        java.util.Set<java.lang.String> strSet18 = cKMethodResult12.getFieldsAccessed();
        cKMethodResult12.setWmc(0);
        boolean boolean21 = cKClassResult4.equals((java.lang.Object) 0);
        cKClassResult4.setComparisonsQty((int) (short) 100);
        java.lang.String str24 = cKClassResult4.getClassName();
        cKClassResult4.setCboModified((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(strSet14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}" + "'", str24, "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.ProvidesDirective providesDirective9 = null;
        boolean boolean10 = cKVisitor4.visit(providesDirective9);
        org.eclipse.jdt.core.dom.ThisExpression thisExpression11 = null;
        cKVisitor4.endVisit(thisExpression11);
        org.eclipse.jdt.core.dom.IntersectionType intersectionType13 = null;
        cKVisitor4.endVisit(intersectionType13);
        org.eclipse.jdt.core.dom.ArrayInitializer arrayInitializer15 = null;
        cKVisitor4.endVisit(arrayInitializer15);
        org.eclipse.jdt.core.dom.TryStatement tryStatement17 = null;
        boolean boolean18 = cKVisitor4.visit(tryStatement17);
        org.eclipse.jdt.core.dom.TypeLiteral typeLiteral19 = null;
        cKVisitor4.endVisit(typeLiteral19);
        org.eclipse.jdt.core.dom.TypeMethodReference typeMethodReference21 = null;
        cKVisitor4.endVisit(typeMethodReference21);
        org.eclipse.jdt.core.dom.MarkerAnnotation markerAnnotation23 = null;
        boolean boolean24 = cKVisitor4.visit(markerAnnotation23);
        org.eclipse.jdt.core.dom.VariableDeclarationFragment variableDeclarationFragment25 = null;
        boolean boolean26 = cKVisitor4.visit(variableDeclarationFragment25);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.NameQualifiedType nameQualifiedType7 = null;
        boolean boolean8 = cKVisitor4.visit(nameQualifiedType7);
        org.eclipse.jdt.core.dom.MarkerAnnotation markerAnnotation9 = null;
        cKVisitor4.endVisit(markerAnnotation9);
        org.eclipse.jdt.core.dom.ArrayAccess arrayAccess11 = null;
        cKVisitor4.endVisit(arrayAccess11);
        org.eclipse.jdt.core.dom.PackageDeclaration packageDeclaration13 = null;
        cKVisitor4.endVisit(packageDeclaration13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        java.util.Set<java.lang.String> strSet6 = cKMethodResult4.getMethodInvocationsLocal();
        java.util.Set<java.lang.String> strSet7 = cKMethodResult4.getFieldsAccessed();
        java.lang.String str8 = cKMethodResult4.getQualifiedMethodName();
        int int9 = cKMethodResult4.getRfc();
        int int10 = cKMethodResult4.getCboModified();
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        cKMethodResult4.setAssignmentsQty((int) (short) -1);
        int int8 = cKMethodResult4.getUniqueWordsQty();
        java.lang.String str9 = cKMethodResult4.getMethodName();
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getInnerClassesQty();
        cKClassResult4.setLogStatementsQty(0);
        int int8 = cKClassResult4.getAssignmentsQty();
        cKClassResult4.setNumberOfStaticFields((int) (short) 10);
        float float11 = cKClassResult4.getLcomNormalized();
        java.util.Set<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultSet12 = cKClassResult4.getMethods();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertNotNull(cKMethodResultSet12);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.SuperMethodReference superMethodReference7 = null;
        cKVisitor4.endVisit(superMethodReference7);
        org.eclipse.jdt.core.dom.SuperFieldAccess superFieldAccess9 = null;
        cKVisitor4.endVisit(superFieldAccess9);
        org.eclipse.jdt.core.dom.MarkerAnnotation markerAnnotation11 = null;
        cKVisitor4.endVisit(markerAnnotation11);
        org.eclipse.jdt.core.dom.YieldStatement yieldStatement13 = null;
        cKVisitor4.endVisit(yieldStatement13);
        java.lang.Class<?> wildcardClass15 = cKVisitor4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.EnumConstantDeclaration enumConstantDeclaration7 = null;
        cKVisitor4.endVisit(enumConstantDeclaration7);
        org.eclipse.jdt.core.dom.AssertStatement assertStatement9 = null;
        boolean boolean10 = cKVisitor4.visit(assertStatement9);
        org.eclipse.jdt.core.dom.SynchronizedStatement synchronizedStatement11 = null;
        cKVisitor4.endVisit(synchronizedStatement11);
        org.eclipse.jdt.core.dom.SimpleName simpleName13 = null;
        cKVisitor4.endVisit(simpleName13);
        org.eclipse.jdt.core.dom.WildcardType wildcardType15 = null;
        cKVisitor4.endVisit(wildcardType15);
        org.eclipse.jdt.core.dom.NormalAnnotation normalAnnotation17 = null;
        boolean boolean18 = cKVisitor4.visit(normalAnnotation17);
        org.eclipse.jdt.core.dom.Dimension dimension19 = null;
        boolean boolean20 = cKVisitor4.visit(dimension19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getStringLiteralsQty();
        java.lang.String str6 = cKMethodResult4.getMethodName();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getUniqueWordsQty();
        cKMethodResult4.setUniqueWordsQty((int) (byte) 10);
        int int8 = cKMethodResult4.getLogStatementsQty();
        int int9 = cKMethodResult4.getAnonymousClassesQty();
        int int10 = cKMethodResult4.getAssignmentsQty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ASTNode aSTNode5 = null;
        boolean boolean6 = cKVisitor4.preVisit2(aSTNode5);
        org.eclipse.jdt.core.dom.MethodInvocation methodInvocation7 = null;
        boolean boolean8 = cKVisitor4.visit(methodInvocation7);
        org.eclipse.jdt.core.dom.SwitchExpression switchExpression9 = null;
        cKVisitor4.endVisit(switchExpression9);
        org.eclipse.jdt.core.dom.ParameterizedType parameterizedType11 = null;
        boolean boolean12 = cKVisitor4.visit(parameterizedType11);
        org.eclipse.jdt.core.dom.IntersectionType intersectionType13 = null;
        cKVisitor4.endVisit(intersectionType13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setStringLiteralsQty((int) (byte) 1);
        java.util.Optional<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultOptional8 = cKClassResult4.getMethod("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
        cKClassResult4.setNumberOfStaticMethods((int) (byte) 1);
        org.junit.Assert.assertNotNull(cKMethodResultOptional8);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        cKMethodResult4.setReturnQty(52);
        cKMethodResult4.setMaxNestedBlocks(1);
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ASTNode aSTNode5 = null;
        boolean boolean6 = cKVisitor4.preVisit2(aSTNode5);
        org.eclipse.jdt.core.dom.MethodInvocation methodInvocation7 = null;
        boolean boolean8 = cKVisitor4.visit(methodInvocation7);
        org.eclipse.jdt.core.dom.EmptyStatement emptyStatement9 = null;
        cKVisitor4.endVisit(emptyStatement9);
        org.eclipse.jdt.core.dom.Modifier modifier11 = null;
        boolean boolean12 = cKVisitor4.visit(modifier11);
        org.eclipse.jdt.core.dom.TypeDeclarationStatement typeDeclarationStatement13 = null;
        boolean boolean14 = cKVisitor4.visit(typeDeclarationStatement13);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression15 = null;
        cKVisitor4.endVisit(patternInstanceofExpression15);
        org.eclipse.jdt.core.dom.EmptyStatement emptyStatement17 = null;
        cKVisitor4.endVisit(emptyStatement17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression9 = null;
        cKVisitor4.endVisit(patternInstanceofExpression9);
        org.eclipse.jdt.core.dom.InstanceofExpression instanceofExpression11 = null;
        cKVisitor4.endVisit(instanceofExpression11);
        org.eclipse.jdt.core.dom.Assignment assignment13 = null;
        cKVisitor4.endVisit(assignment13);
        org.eclipse.jdt.core.dom.SimpleType simpleType15 = null;
        cKVisitor4.endVisit(simpleType15);
        org.eclipse.jdt.core.dom.Block block17 = null;
        boolean boolean18 = cKVisitor4.visit(block17);
        org.eclipse.jdt.core.dom.LabeledStatement labeledStatement19 = null;
        cKVisitor4.endVisit(labeledStatement19);
        org.eclipse.jdt.core.dom.VariableDeclarationExpression variableDeclarationExpression21 = null;
        boolean boolean22 = cKVisitor4.visit(variableDeclarationExpression21);
        org.eclipse.jdt.core.dom.ThrowStatement throwStatement23 = null;
        boolean boolean24 = cKVisitor4.visit(throwStatement23);
        org.eclipse.jdt.core.dom.SuperMethodReference superMethodReference25 = null;
        boolean boolean26 = cKVisitor4.visit(superMethodReference25);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.ProvidesDirective providesDirective9 = null;
        boolean boolean10 = cKVisitor4.visit(providesDirective9);
        org.eclipse.jdt.core.dom.ThisExpression thisExpression11 = null;
        cKVisitor4.endVisit(thisExpression11);
        org.eclipse.jdt.core.dom.WhileStatement whileStatement13 = null;
        boolean boolean14 = cKVisitor4.visit(whileStatement13);
        org.eclipse.jdt.core.dom.IfStatement ifStatement15 = null;
        boolean boolean16 = cKVisitor4.visit(ifStatement15);
        org.eclipse.jdt.core.dom.LabeledStatement labeledStatement17 = null;
        boolean boolean18 = cKVisitor4.visit(labeledStatement17);
        org.eclipse.jdt.core.dom.ModuleQualifiedName moduleQualifiedName19 = null;
        cKVisitor4.endVisit(moduleQualifiedName19);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getLcom();
        int int8 = cKClassResult4.getNumberOfFields();
        cKClassResult4.setNumberOfFields(0);
        float float11 = cKClassResult4.getTightClassCohesion();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression9 = null;
        cKVisitor4.endVisit(patternInstanceofExpression9);
        org.eclipse.jdt.core.dom.InstanceofExpression instanceofExpression11 = null;
        cKVisitor4.endVisit(instanceofExpression11);
        org.eclipse.jdt.core.dom.Assignment assignment13 = null;
        cKVisitor4.endVisit(assignment13);
        org.eclipse.jdt.core.dom.SimpleType simpleType15 = null;
        cKVisitor4.endVisit(simpleType15);
        org.eclipse.jdt.core.dom.Block block17 = null;
        boolean boolean18 = cKVisitor4.visit(block17);
        org.eclipse.jdt.core.dom.VariableDeclarationExpression variableDeclarationExpression19 = null;
        cKVisitor4.endVisit(variableDeclarationExpression19);
        org.eclipse.jdt.core.dom.CreationReference creationReference21 = null;
        boolean boolean22 = cKVisitor4.visit(creationReference21);
        org.eclipse.jdt.core.dom.InfixExpression infixExpression23 = null;
        cKVisitor4.endVisit(infixExpression23);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression9 = null;
        cKVisitor4.endVisit(patternInstanceofExpression9);
        org.eclipse.jdt.core.dom.InstanceofExpression instanceofExpression11 = null;
        cKVisitor4.endVisit(instanceofExpression11);
        org.eclipse.jdt.core.dom.Assignment assignment13 = null;
        cKVisitor4.endVisit(assignment13);
        org.eclipse.jdt.core.dom.SimpleType simpleType15 = null;
        cKVisitor4.endVisit(simpleType15);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression17 = null;
        cKVisitor4.endVisit(patternInstanceofExpression17);
        org.eclipse.jdt.core.dom.LineComment lineComment19 = null;
        boolean boolean20 = cKVisitor4.visit(lineComment19);
        org.eclipse.jdt.core.dom.PrimitiveType primitiveType21 = null;
        boolean boolean22 = cKVisitor4.visit(primitiveType21);
        org.eclipse.jdt.core.dom.SuperMethodInvocation superMethodInvocation23 = null;
        cKVisitor4.endVisit(superMethodInvocation23);
        org.eclipse.jdt.core.dom.SimpleName simpleName25 = null;
        boolean boolean26 = cKVisitor4.visit(simpleName25);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getUniqueWordsQty();
        int int7 = cKClassResult4.getUniqueWordsQty();
        int int8 = cKClassResult4.getNosi();
        cKClassResult4.setLoopQty((int) (byte) 100);
        int int11 = cKClassResult4.getMaxNestedBlocks();
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult16 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "hi!", false, (int) (byte) 0);
        cKMethodResult16.setWmc((int) (byte) 100);
        int int19 = cKMethodResult16.getMaxNestedBlocks();
        int int20 = cKMethodResult16.getMathOperationsQty();
        cKClassResult4.addMethod(cKMethodResult16);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getInnerClassesQty();
        cKClassResult4.setLogStatementsQty(0);
        int int8 = cKClassResult4.getAssignmentsQty();
        cKClassResult4.setNumberOfMethods((int) (short) -1);
        int int11 = cKClassResult4.getMathOperationsQty();
        java.lang.String str12 = cKClassResult4.toString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "CKClassResult [file=, className=CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}]" + "'", str12, "CKClassResult [file=, className=CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}]");
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.ContinueStatement continueStatement9 = null;
        cKVisitor4.endVisit(continueStatement9);
        org.eclipse.jdt.core.dom.NullLiteral nullLiteral11 = null;
        cKVisitor4.endVisit(nullLiteral11);
        org.eclipse.jdt.core.dom.QualifiedName qualifiedName13 = null;
        cKVisitor4.endVisit(qualifiedName13);
        org.eclipse.jdt.core.dom.PrefixExpression prefixExpression15 = null;
        boolean boolean16 = cKVisitor4.visit(prefixExpression15);
        org.eclipse.jdt.core.dom.ReturnStatement returnStatement17 = null;
        boolean boolean18 = cKVisitor4.visit(returnStatement17);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.IntersectionType intersectionType7 = null;
        boolean boolean8 = cKVisitor4.visit(intersectionType7);
        org.eclipse.jdt.core.dom.VariableDeclarationFragment variableDeclarationFragment9 = null;
        boolean boolean10 = cKVisitor4.visit(variableDeclarationFragment9);
        org.eclipse.jdt.core.dom.TypeParameter typeParameter11 = null;
        boolean boolean12 = cKVisitor4.visit(typeParameter11);
        org.eclipse.jdt.core.dom.FieldAccess fieldAccess13 = null;
        boolean boolean14 = cKVisitor4.visit(fieldAccess13);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setStringLiteralsQty((int) (byte) 1);
        java.util.Optional<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultOptional8 = cKClassResult4.getMethod("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
        int int9 = cKClassResult4.getLoopQty();
        cKClassResult4.setLcom(100);
        int int12 = cKClassResult4.getAssignmentsQty();
        int int13 = cKClassResult4.getLoc();
        cKClassResult4.setNumberOfPublicFields(52);
        float float16 = cKClassResult4.getTightClassCohesion();
        cKClassResult4.setNumbersQty((int) (byte) 100);
        org.junit.Assert.assertNotNull(cKMethodResultOptional8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.IntersectionType intersectionType7 = null;
        boolean boolean8 = cKVisitor4.visit(intersectionType7);
        org.eclipse.jdt.core.dom.ExportsDirective exportsDirective9 = null;
        boolean boolean10 = cKVisitor4.visit(exportsDirective9);
        org.eclipse.jdt.core.dom.VariableDeclarationFragment variableDeclarationFragment11 = null;
        boolean boolean12 = cKVisitor4.visit(variableDeclarationFragment11);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.ContinueStatement continueStatement9 = null;
        cKVisitor4.endVisit(continueStatement9);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation11 = null;
        boolean boolean12 = cKVisitor4.visit(arrayCreation11);
        org.eclipse.jdt.core.dom.TextElement textElement13 = null;
        cKVisitor4.endVisit(textElement13);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.CastExpression castExpression7 = null;
        cKVisitor4.endVisit(castExpression7);
        org.eclipse.jdt.core.dom.SynchronizedStatement synchronizedStatement9 = null;
        boolean boolean10 = cKVisitor4.visit(synchronizedStatement9);
        org.eclipse.jdt.core.dom.UsesDirective usesDirective11 = null;
        boolean boolean12 = cKVisitor4.visit(usesDirective11);
        org.eclipse.jdt.core.dom.YieldStatement yieldStatement13 = null;
        boolean boolean14 = cKVisitor4.visit(yieldStatement13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("hi!", "CKMethodResult{cbo=10, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=10, rfc=0, wmc=0, methodName='hi!'}", 52);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.IntersectionType intersectionType7 = null;
        boolean boolean8 = cKVisitor4.visit(intersectionType7);
        org.eclipse.jdt.core.dom.VariableDeclarationFragment variableDeclarationFragment9 = null;
        boolean boolean10 = cKVisitor4.visit(variableDeclarationFragment9);
        java.lang.Class<?> wildcardClass11 = cKVisitor4.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ASTNode aSTNode5 = null;
        boolean boolean6 = cKVisitor4.preVisit2(aSTNode5);
        org.eclipse.jdt.core.dom.MethodInvocation methodInvocation7 = null;
        boolean boolean8 = cKVisitor4.visit(methodInvocation7);
        org.eclipse.jdt.core.dom.EmptyStatement emptyStatement9 = null;
        cKVisitor4.endVisit(emptyStatement9);
        org.eclipse.jdt.core.dom.Modifier modifier11 = null;
        boolean boolean12 = cKVisitor4.visit(modifier11);
        org.eclipse.jdt.core.dom.ContinueStatement continueStatement13 = null;
        cKVisitor4.endVisit(continueStatement13);
        org.eclipse.jdt.core.dom.ArrayAccess arrayAccess15 = null;
        boolean boolean16 = cKVisitor4.visit(arrayAccess15);
        org.eclipse.jdt.core.dom.WhileStatement whileStatement17 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(whileStatement17);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.NameQualifiedType nameQualifiedType7 = null;
        boolean boolean8 = cKVisitor4.visit(nameQualifiedType7);
        org.eclipse.jdt.core.dom.SimpleName simpleName9 = null;
        boolean boolean10 = cKVisitor4.visit(simpleName9);
        org.eclipse.jdt.core.dom.MethodInvocation methodInvocation11 = null;
        boolean boolean12 = cKVisitor4.visit(methodInvocation11);
        org.eclipse.jdt.core.dom.SwitchCase switchCase13 = null;
        boolean boolean14 = cKVisitor4.visit(switchCase13);
        org.eclipse.jdt.core.dom.BlockComment blockComment15 = null;
        cKVisitor4.endVisit(blockComment15);
        org.eclipse.jdt.core.dom.ModuleQualifiedName moduleQualifiedName17 = null;
        cKVisitor4.endVisit(moduleQualifiedName17);
        org.eclipse.jdt.core.dom.LambdaExpression lambdaExpression19 = null;
        cKVisitor4.endVisit(lambdaExpression19);
        org.eclipse.jdt.core.dom.ModuleModifier moduleModifier21 = null;
        cKVisitor4.endVisit(moduleModifier21);
        org.eclipse.jdt.core.dom.ArrayInitializer arrayInitializer23 = null;
        boolean boolean24 = cKVisitor4.visit(arrayInitializer23);
        org.eclipse.jdt.core.dom.ArrayAccess arrayAccess25 = null;
        cKVisitor4.endVisit(arrayAccess25);
        org.eclipse.jdt.core.dom.SwitchStatement switchStatement27 = null;
        boolean boolean28 = cKVisitor4.visit(switchStatement27);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        java.util.Set<java.lang.String> strSet6 = cKMethodResult4.getMethodInvocationsLocal();
        int int7 = cKMethodResult4.getLambdasQty();
        int int8 = cKMethodResult4.getWmc();
        cKMethodResult4.setLoopQty((int) (byte) 1);
        int int11 = cKMethodResult4.getAnonymousClassesQty();
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", true, 0);
        cKMethodResult4.setCbo(0);
        cKMethodResult4.setAnonymousClassesQty((int) (byte) 100);
        int int9 = cKMethodResult4.getRfc();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.EnumConstantDeclaration enumConstantDeclaration7 = null;
        cKVisitor4.endVisit(enumConstantDeclaration7);
        org.eclipse.jdt.core.dom.MarkerAnnotation markerAnnotation9 = null;
        boolean boolean10 = cKVisitor4.visit(markerAnnotation9);
        org.eclipse.jdt.core.dom.SuperConstructorInvocation superConstructorInvocation11 = null;
        boolean boolean12 = cKVisitor4.visit(superConstructorInvocation11);
        org.eclipse.jdt.core.dom.ClassInstanceCreation classInstanceCreation13 = null;
        cKVisitor4.endVisit(classInstanceCreation13);
        org.eclipse.jdt.core.dom.ContinueStatement continueStatement15 = null;
        boolean boolean16 = cKVisitor4.visit(continueStatement15);
        org.eclipse.jdt.core.dom.ASTNode aSTNode17 = null;
        cKVisitor4.postVisit(aSTNode17);
        org.eclipse.jdt.core.dom.LabeledStatement labeledStatement19 = null;
        cKVisitor4.endVisit(labeledStatement19);
        org.eclipse.jdt.core.dom.SuperFieldAccess superFieldAccess21 = null;
        cKVisitor4.endVisit(superFieldAccess21);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression9 = null;
        cKVisitor4.endVisit(patternInstanceofExpression9);
        org.eclipse.jdt.core.dom.InstanceofExpression instanceofExpression11 = null;
        cKVisitor4.endVisit(instanceofExpression11);
        org.eclipse.jdt.core.dom.Assignment assignment13 = null;
        cKVisitor4.endVisit(assignment13);
        org.eclipse.jdt.core.dom.ASTNode aSTNode15 = null;
        cKVisitor4.postVisit(aSTNode15);
        org.eclipse.jdt.core.dom.AnnotationTypeDeclaration annotationTypeDeclaration17 = null;
        boolean boolean18 = cKVisitor4.visit(annotationTypeDeclaration17);
        org.eclipse.jdt.core.dom.SwitchExpression switchExpression19 = null;
        boolean boolean20 = cKVisitor4.visit(switchExpression19);
        org.eclipse.jdt.core.dom.FieldAccess fieldAccess21 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(fieldAccess21);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getLambdasQty();
        java.util.Set<java.lang.String> strSet6 = cKMethodResult4.getMethodInvocations();
        java.lang.String str7 = cKMethodResult4.toString();
        int int8 = cKMethodResult4.getParenthesizedExpsQty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}" + "'", str7, "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getMathOperationsQty();
        int int6 = cKMethodResult4.getRfc();
        int int7 = cKMethodResult4.getCbo();
        int int8 = cKMethodResult4.getParenthesizedExpsQty();
        cKMethodResult4.setMaxNestedBlocks((int) 'a');
        java.lang.String str11 = cKMethodResult4.getQualifiedMethodName();
        int int12 = cKMethodResult4.getRfc();
        cKMethodResult4.setInnerClassesQty((int) '#');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setStringLiteralsQty((int) (byte) 1);
        java.util.Optional<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultOptional8 = cKClassResult4.getMethod("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
        int int9 = cKClassResult4.getLoopQty();
        cKClassResult4.setNumberOfPublicFields((int) (byte) 1);
        cKClassResult4.setNumbersQty((int) '4');
        org.junit.Assert.assertNotNull(cKMethodResultOptional8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.EnumConstantDeclaration enumConstantDeclaration7 = null;
        cKVisitor4.endVisit(enumConstantDeclaration7);
        org.eclipse.jdt.core.dom.AssertStatement assertStatement9 = null;
        boolean boolean10 = cKVisitor4.visit(assertStatement9);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression11 = null;
        cKVisitor4.endVisit(patternInstanceofExpression11);
        org.eclipse.jdt.core.dom.Javadoc javadoc13 = null;
        cKVisitor4.endVisit(javadoc13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getMaxNestedBlocks();
        cKClassResult4.setReturnQty((int) (byte) 10);
        int int8 = cKClassResult4.getNumberOfVisibleMethods();
        cKClassResult4.setParenthesizedExpsQty((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ASTNode aSTNode5 = null;
        boolean boolean6 = cKVisitor4.preVisit2(aSTNode5);
        org.eclipse.jdt.core.dom.SwitchStatement switchStatement7 = null;
        boolean boolean8 = cKVisitor4.visit(switchStatement7);
        org.eclipse.jdt.core.dom.ClassInstanceCreation classInstanceCreation9 = null;
        cKVisitor4.endVisit(classInstanceCreation9);
        org.eclipse.jdt.core.dom.TypeMethodReference typeMethodReference11 = null;
        cKVisitor4.endVisit(typeMethodReference11);
        org.eclipse.jdt.core.dom.SimpleType simpleType13 = null;
        boolean boolean14 = cKVisitor4.visit(simpleType13);
        org.eclipse.jdt.core.dom.ClassInstanceCreation classInstanceCreation15 = null;
        boolean boolean16 = cKVisitor4.visit(classInstanceCreation15);
        org.eclipse.jdt.core.dom.PrefixExpression prefixExpression17 = null;
        boolean boolean18 = cKVisitor4.visit(prefixExpression17);
        org.eclipse.jdt.core.dom.TextElement textElement19 = null;
        cKVisitor4.endVisit(textElement19);
        org.eclipse.jdt.core.dom.LambdaExpression lambdaExpression21 = null;
        cKVisitor4.endVisit(lambdaExpression21);
        org.eclipse.jdt.core.dom.SynchronizedStatement synchronizedStatement23 = null;
        boolean boolean24 = cKVisitor4.visit(synchronizedStatement23);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }
}
