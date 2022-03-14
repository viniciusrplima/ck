package com.github.mauricioaniche.ck.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
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
        org.eclipse.jdt.core.dom.FieldDeclaration fieldDeclaration21 = null;
        cKVisitor4.endVisit(fieldDeclaration21);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
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
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable13 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable14 = null;
        com.github.mauricioaniche.ck.CKNotifier cKNotifier15 = null;
        com.github.mauricioaniche.ck.MetricsExecutor metricsExecutor16 = new com.github.mauricioaniche.ck.MetricsExecutor(classLevelMetricListCallable13, methodLevelMetricListCallable14, cKNotifier15);
        java.lang.String[] strArray22 = new java.lang.String[] { "", "CKMethodResult{cbo=10, rfc=0, wmc=0, methodName='hi!'}", "hi!", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=10, rfc=0, wmc=0, methodName='hi!'}" };
        org.eclipse.jdt.core.dom.IBinding[] iBindingArray23 = metricsExecutor16.createBindings(strArray22);
        org.eclipse.jdt.core.dom.IBinding iBinding25 = null;
        metricsExecutor16.acceptBinding("CKMethodResult{cbo=10, rfc=0, wmc=0, methodName='hi!'}", iBinding25);
        java.lang.String[] strArray27 = new java.lang.String[] {};
        org.eclipse.jdt.core.dom.IBinding[] iBindingArray28 = metricsExecutor16.createBindings(strArray27);
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable29 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable30 = null;
        com.github.mauricioaniche.ck.CKNotifier cKNotifier31 = null;
        com.github.mauricioaniche.ck.MetricsExecutor metricsExecutor32 = new com.github.mauricioaniche.ck.MetricsExecutor(classLevelMetricListCallable29, methodLevelMetricListCallable30, cKNotifier31);
        java.lang.String[] strArray34 = new java.lang.String[] { "" };
        org.eclipse.jdt.core.dom.IBinding[] iBindingArray35 = metricsExecutor32.createBindings(strArray34);
        org.eclipse.jdt.core.dom.IBinding[] iBindingArray36 = metricsExecutor16.createBindings(strArray34);
        org.eclipse.jdt.core.dom.IBinding[] iBindingArray37 = metricsExecutor3.createBindings(strArray34);
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable38 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable39 = null;
        com.github.mauricioaniche.ck.CKNotifier cKNotifier40 = null;
        com.github.mauricioaniche.ck.MetricsExecutor metricsExecutor41 = new com.github.mauricioaniche.ck.MetricsExecutor(classLevelMetricListCallable38, methodLevelMetricListCallable39, cKNotifier40);
        java.lang.String[] strArray43 = new java.lang.String[] { "" };
        org.eclipse.jdt.core.dom.IBinding[] iBindingArray44 = metricsExecutor41.createBindings(strArray43);
        org.eclipse.jdt.core.dom.IBinding[] iBindingArray45 = metricsExecutor3.createBindings(strArray43);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(iBindingArray6);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(iBindingArray23);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(iBindingArray28);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(iBindingArray35);
        org.junit.Assert.assertNotNull(iBindingArray36);
        org.junit.Assert.assertNotNull(iBindingArray37);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(iBindingArray44);
        org.junit.Assert.assertNotNull(iBindingArray45);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
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
        org.eclipse.jdt.core.dom.EmptyStatement emptyStatement13 = null;
        boolean boolean14 = cKVisitor4.visit(emptyStatement13);
        org.eclipse.jdt.core.dom.ExpressionMethodReference expressionMethodReference15 = null;
        boolean boolean16 = cKVisitor4.visit(expressionMethodReference15);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression17 = null;
        cKVisitor4.endVisit(parenthesizedExpression17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "", (int) '#');
        cKClassResult4.setCbo((int) (byte) 100);
        int int7 = cKClassResult4.getRfc();
        cKClassResult4.setLcomNormalized((float) ' ');
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setStringLiteralsQty((-1));
        int int7 = cKClassResult4.getNumberOfLogStatements();
        int int8 = cKClassResult4.getVariablesQty();
        cKClassResult4.setNumberOfPublicFields((-1));
        cKClassResult4.setInnerClassesQty((int) 'a');
        cKClassResult4.setNumberOfProtectedMethods(52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setAnonymousClassesQty((int) (byte) -1);
        java.util.Set<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultSet7 = cKClassResult4.getMethods();
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult12 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        cKMethodResult12.setLoc((int) (byte) 100);
        cKMethodResult12.setTryCatchQty((int) (byte) -1);
        int int17 = cKMethodResult12.getNumbersQty();
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult22 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int23 = cKMethodResult22.getComparisonsQty();
        cKMethodResult22.setReturnQty((int) (byte) -1);
        cKMethodResult22.setCboModified((int) (byte) 100);
        int int28 = cKMethodResult22.getFanout();
        boolean boolean29 = cKMethodResult12.equals((java.lang.Object) cKMethodResult22);
        int int30 = cKMethodResult22.getLogStatementsQty();
        cKMethodResult22.setCboModified((int) (short) 0);
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult37 = new com.github.mauricioaniche.ck.CKMethodResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", true, 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap38 = cKMethodResult37.getVariablesUsage();
        cKMethodResult22.setVariablesUsage(strMap38);
        int int40 = cKMethodResult22.getComparisonsQty();
        int int41 = cKMethodResult22.getNumbersQty();
        cKClassResult4.addMethod(cKMethodResult22);
        org.junit.Assert.assertNotNull(cKMethodResultSet7);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(strMap38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
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
        org.eclipse.jdt.core.dom.RequiresDirective requiresDirective15 = null;
        boolean boolean16 = cKVisitor4.visit(requiresDirective15);
        org.eclipse.jdt.core.dom.ProvidesDirective providesDirective17 = null;
        cKVisitor4.endVisit(providesDirective17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        cKMethodResult4.setLoc((int) (byte) 100);
        cKMethodResult4.setTryCatchQty((int) (byte) -1);
        int int9 = cKMethodResult4.getNumbersQty();
        int int10 = cKMethodResult4.getWmc();
        boolean boolean11 = cKMethodResult4.getIsVisible();
        java.lang.String str12 = cKMethodResult4.getMethodName();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        int int6 = cKMethodResult4.getStringLiteralsQty();
        cKMethodResult4.setWmc((int) (byte) 10);
        cKMethodResult4.setParametersQty((int) (byte) 1);
        int int11 = cKMethodResult4.getStartLine();
        int int12 = cKMethodResult4.getReturnQty();
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
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
        org.eclipse.jdt.core.dom.SuperMethodReference superMethodReference13 = null;
        cKVisitor4.endVisit(superMethodReference13);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression15 = null;
        cKVisitor4.endVisit(parenthesizedExpression15);
        org.eclipse.jdt.core.dom.QualifiedName qualifiedName17 = null;
        cKVisitor4.endVisit(qualifiedName17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
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
        org.eclipse.jdt.core.dom.ArrayInitializer arrayInitializer23 = null;
        boolean boolean24 = cKVisitor4.visit(arrayInitializer23);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getStringLiteralsQty();
        cKClassResult4.setNumberOfFinalFields((int) (short) 0);
        int int10 = cKClassResult4.getNumberOfFinalMethods();
        cKClassResult4.setNumbersQty((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("CKClassResult [file=, className=CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}]", "CKClassResult [file=, className=CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}]", false, (-1));
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocationsLocal();
        org.junit.Assert.assertNull(strSet5);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
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
        org.eclipse.jdt.core.dom.IfStatement ifStatement23 = null;
        boolean boolean24 = cKVisitor4.visit(ifStatement23);
        org.eclipse.jdt.core.dom.ArrayType arrayType25 = null;
        boolean boolean26 = cKVisitor4.visit(arrayType25);
        org.eclipse.jdt.core.dom.TypeLiteral typeLiteral27 = null;
        boolean boolean28 = cKVisitor4.visit(typeLiteral27);
        org.eclipse.jdt.core.dom.VariableDeclarationExpression variableDeclarationExpression29 = null;
        cKVisitor4.endVisit(variableDeclarationExpression29);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "hi!", false, (int) (byte) 0);
        cKMethodResult4.setWmc((int) (byte) 100);
        int int7 = cKMethodResult4.getMaxNestedBlocks();
        int int8 = cKMethodResult4.getMathOperationsQty();
        java.util.Map<java.lang.String, java.util.Set<java.lang.String>> strMap9 = cKMethodResult4.getMethodInvocationsIndirectLocal();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(strMap9);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getLcom();
        cKClassResult4.setLcom((int) '#');
        int int10 = cKClassResult4.getNumberOfPublicFields();
        cKClassResult4.setNumberOfProtectedFields((int) (short) 10);
        int int13 = cKClassResult4.getReturnQty();
        cKClassResult4.setNumberOfFinalFields(1);
        cKClassResult4.setLcom((int) (byte) 10);
        cKClassResult4.setNumberOfStaticFields((int) ' ');
        int int20 = cKClassResult4.getNumberOfMethods();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", true, 1);
        cKMethodResult4.setLoc((int) '4');
        int int7 = cKMethodResult4.getFanout();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getLcom();
        cKClassResult4.setLcom((int) '#');
        int int10 = cKClassResult4.getNumberOfPublicFields();
        cKClassResult4.setNumberOfProtectedFields((int) (short) 10);
        int int13 = cKClassResult4.getRfc();
        int int14 = cKClassResult4.getNumberOfPublicMethods();
        com.github.mauricioaniche.ck.CKClassResult cKClassResult19 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        float float20 = cKClassResult19.getTightClassCohesion();
        cKClassResult19.setAssignmentsQty((int) (short) -1);
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult27 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int28 = cKMethodResult27.getUniqueWordsQty();
        cKMethodResult27.setUniqueWordsQty((int) (byte) 10);
        cKMethodResult27.setAnonymousClassesQty((int) (short) 1);
        java.util.Set<java.lang.String> strSet33 = cKMethodResult27.getFieldsAccessed();
        cKClassResult19.setFieldNames(strSet33);
        cKClassResult4.setFieldNames(strSet33);
        int int36 = cKClassResult4.getNumberOfFinalFields();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
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
        org.eclipse.jdt.core.dom.MethodRef methodRef29 = null;
        cKVisitor4.endVisit(methodRef29);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
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
        org.eclipse.jdt.core.dom.UnionType unionType15 = null;
        boolean boolean16 = cKVisitor4.visit(unionType15);
        org.eclipse.jdt.core.dom.OpensDirective opensDirective17 = null;
        cKVisitor4.endVisit(opensDirective17);
        org.eclipse.jdt.core.dom.YieldStatement yieldStatement19 = null;
        boolean boolean20 = cKVisitor4.visit(yieldStatement19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
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
        org.eclipse.jdt.core.dom.UnionType unionType13 = null;
        boolean boolean14 = cKVisitor4.visit(unionType13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
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
        org.eclipse.jdt.core.dom.Dimension dimension21 = null;
        cKVisitor4.endVisit(dimension21);
        org.eclipse.jdt.core.dom.NameQualifiedType nameQualifiedType23 = null;
        boolean boolean24 = cKVisitor4.visit(nameQualifiedType23);
        org.eclipse.jdt.core.dom.IfStatement ifStatement25 = null;
        boolean boolean26 = cKVisitor4.visit(ifStatement25);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
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
        org.eclipse.jdt.core.dom.Assignment assignment17 = null;
        cKVisitor4.endVisit(assignment17);
        org.eclipse.jdt.core.dom.WildcardType wildcardType19 = null;
        cKVisitor4.endVisit(wildcardType19);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        cKMethodResult4.setLoc((int) (byte) 100);
        cKMethodResult4.setTryCatchQty((int) (byte) -1);
        int int9 = cKMethodResult4.getNumbersQty();
        int int10 = cKMethodResult4.getWmc();
        cKMethodResult4.setCboModified((int) (short) 100);
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult17 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "hi!", false, (int) (byte) 0);
        cKMethodResult17.setFanout(1);
        cKMethodResult17.setMathOperationsQty((int) (short) 1);
        java.lang.String str22 = cKMethodResult17.getMethodName();
        java.util.Map<java.lang.String, java.util.Set<java.lang.String>> strMap23 = cKMethodResult17.getMethodInvocationsIndirectLocal();
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult28 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int29 = cKMethodResult28.getUniqueWordsQty();
        cKMethodResult28.setUniqueWordsQty((int) (byte) 100);
        cKMethodResult28.setStartLine((-1));
        cKMethodResult28.setComparisonsQty((-1));
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult40 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "hi!", false, (int) (byte) 0);
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult45 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int46 = cKMethodResult45.getLambdasQty();
        java.util.Set<java.lang.String> strSet47 = cKMethodResult45.getMethodInvocations();
        cKMethodResult40.setMethodInvocations(strSet47);
        cKMethodResult28.setMethodInvocationLocal(strSet47);
        cKMethodResult17.setMethodInvocations(strSet47);
        cKMethodResult4.setMethodInvocationLocal(strSet47);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNull(strMap23);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(strSet47);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setStringLiteralsQty((-1));
        int int7 = cKClassResult4.getMaxNestedBlocks();
        int int8 = cKClassResult4.getNumberOfAbstractMethods();
        int int9 = cKClassResult4.getNumberOfStaticFields();
        int int10 = cKClassResult4.getAssignmentsQty();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setAnonymousClassesQty((int) (byte) -1);
        int int7 = cKClassResult4.getNumberOfSynchronizedFields();
        cKClassResult4.setAssignmentsQty((int) (byte) 1);
        int int10 = cKClassResult4.getNumberOfFields();
        cKClassResult4.setMaxNestedBlocks(10);
        int int13 = cKClassResult4.getNumberOfFields();
        cKClassResult4.setFanin((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
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
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression17 = null;
        boolean boolean18 = cKVisitor4.visit(patternInstanceofExpression17);
        org.eclipse.jdt.core.dom.OpensDirective opensDirective19 = null;
        cKVisitor4.endVisit(opensDirective19);
        org.eclipse.jdt.core.dom.ModuleModifier moduleModifier21 = null;
        boolean boolean22 = cKVisitor4.visit(moduleModifier21);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getFanout();
        java.util.Set<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultSet8 = cKClassResult4.getVisibleMethods();
        int int9 = cKClassResult4.getComparisonsQty();
        cKClassResult4.setNumbersQty((int) (short) 10);
        java.lang.String str12 = cKClassResult4.getType();
        int int13 = cKClassResult4.getFanout();
        int int14 = cKClassResult4.getModifiers();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(cKMethodResultSet8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}" + "'", str12, "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
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
        org.eclipse.jdt.core.dom.CastExpression castExpression13 = null;
        boolean boolean14 = cKVisitor4.visit(castExpression13);
        org.eclipse.jdt.core.dom.FieldDeclaration fieldDeclaration15 = null;
        cKVisitor4.endVisit(fieldDeclaration15);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
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
        org.eclipse.jdt.core.dom.ConstructorInvocation constructorInvocation13 = null;
        cKVisitor4.endVisit(constructorInvocation13);
        java.util.Set<com.github.mauricioaniche.ck.CKClassResult> cKClassResultSet15 = cKVisitor4.getCollectedClasses();
        org.eclipse.jdt.core.dom.PrefixExpression prefixExpression16 = null;
        cKVisitor4.endVisit(prefixExpression16);
        org.eclipse.jdt.core.dom.WhileStatement whileStatement18 = null;
        boolean boolean19 = cKVisitor4.visit(whileStatement18);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(cKClassResultSet15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getMathOperationsQty();
        cKMethodResult4.setReturnQty(100);
        cKMethodResult4.setFanout(35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression5 = null;
        boolean boolean6 = cKVisitor4.visit(patternInstanceofExpression5);
        org.eclipse.jdt.core.dom.ForStatement forStatement7 = null;
        boolean boolean8 = cKVisitor4.visit(forStatement7);
        org.eclipse.jdt.core.dom.ExpressionStatement expressionStatement9 = null;
        boolean boolean10 = cKVisitor4.visit(expressionStatement9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
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
        java.util.Set<com.github.mauricioaniche.ck.CKClassResult> cKClassResultSet13 = cKVisitor4.getCollectedClasses();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(cKClassResultSet13);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
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
        org.eclipse.jdt.core.dom.SuperMethodInvocation superMethodInvocation13 = null;
        boolean boolean14 = cKVisitor4.visit(superMethodInvocation13);
        org.eclipse.jdt.core.dom.QualifiedType qualifiedType15 = null;
        boolean boolean16 = cKVisitor4.visit(qualifiedType15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getComparisonsQty();
        cKMethodResult4.setLoc((int) (byte) 10);
        int int8 = cKMethodResult4.getStartLine();
        cKMethodResult4.setStartLine(0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
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
        org.eclipse.jdt.core.dom.PrefixExpression prefixExpression17 = null;
        boolean boolean18 = cKVisitor4.visit(prefixExpression17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
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
        org.eclipse.jdt.core.dom.ArrayAccess arrayAccess19 = null;
        boolean boolean20 = cKVisitor4.visit(arrayAccess19);
        org.eclipse.jdt.core.dom.DoStatement doStatement21 = null;
        boolean boolean22 = cKVisitor4.visit(doStatement21);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.UsesDirective usesDirective7 = null;
        boolean boolean8 = cKVisitor4.visit(usesDirective7);
        org.eclipse.jdt.core.dom.TextBlock textBlock9 = null;
        cKVisitor4.endVisit(textBlock9);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", true, 0);
        cKMethodResult4.setCbo(0);
        cKMethodResult4.setAnonymousClassesQty((int) (byte) 100);
        cKMethodResult4.setNumbersQty(52);
        cKMethodResult4.setStartLine((int) '4');
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
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
        org.eclipse.jdt.core.dom.MemberRef memberRef13 = null;
        cKVisitor4.endVisit(memberRef13);
        org.eclipse.jdt.core.dom.AssertStatement assertStatement15 = null;
        boolean boolean16 = cKVisitor4.visit(assertStatement15);
        org.eclipse.jdt.core.dom.UsesDirective usesDirective17 = null;
        boolean boolean18 = cKVisitor4.visit(usesDirective17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
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
        org.eclipse.jdt.core.dom.ArrayInitializer arrayInitializer21 = null;
        boolean boolean22 = cKVisitor4.visit(arrayInitializer21);
        org.eclipse.jdt.core.dom.Dimension dimension23 = null;
        boolean boolean24 = cKVisitor4.visit(dimension23);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
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
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression11 = null;
        cKVisitor4.endVisit(patternInstanceofExpression11);
        org.eclipse.jdt.core.dom.NullLiteral nullLiteral13 = null;
        boolean boolean14 = cKVisitor4.visit(nullLiteral13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getMaxNestedBlocks();
        cKClassResult4.setNosi(100);
        int int8 = cKClassResult4.getMaxNestedBlocks();
        cKClassResult4.setCboModified(10);
        int int11 = cKClassResult4.getLambdasQty();
        cKClassResult4.setFanout((int) (short) 0);
        int int14 = cKClassResult4.getWmc();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
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
        org.eclipse.jdt.core.dom.MemberValuePair memberValuePair11 = null;
        boolean boolean12 = cKVisitor4.visit(memberValuePair11);
        org.eclipse.jdt.core.dom.OpensDirective opensDirective13 = null;
        cKVisitor4.endVisit(opensDirective13);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        float float5 = cKClassResult4.getTightClassCohesion();
        cKClassResult4.setNumberOfPrivateMethods(0);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getLcom();
        cKClassResult4.setLcom((int) '#');
        cKClassResult4.setDit(10);
        cKClassResult4.setFanout((int) '#');
        cKClassResult4.setNumberOfStaticMethods(0);
        int int16 = cKClassResult4.getUniqueWordsQty();
        cKClassResult4.setTryCatchQty((int) (byte) 100);
        int int19 = cKClassResult4.getVariablesQty();
        int int20 = cKClassResult4.getComparisonsQty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
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
        org.eclipse.jdt.core.dom.Dimension dimension17 = null;
        boolean boolean18 = cKVisitor4.visit(dimension17);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression19 = null;
        cKVisitor4.endVisit(patternInstanceofExpression19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
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
        org.eclipse.jdt.core.dom.TagElement tagElement13 = null;
        cKVisitor4.endVisit(tagElement13);
        org.eclipse.jdt.core.dom.CreationReference creationReference15 = null;
        boolean boolean16 = cKVisitor4.visit(creationReference15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.IntersectionType intersectionType7 = null;
        boolean boolean8 = cKVisitor4.visit(intersectionType7);
        org.eclipse.jdt.core.dom.ParameterizedType parameterizedType9 = null;
        boolean boolean10 = cKVisitor4.visit(parameterizedType9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setAnonymousClassesQty((int) (byte) -1);
        int int7 = cKClassResult4.getNumberOfSynchronizedFields();
        cKClassResult4.setAssignmentsQty((int) (byte) 1);
        int int10 = cKClassResult4.getNumberOfFields();
        int int11 = cKClassResult4.getTryCatchQty();
        cKClassResult4.setLoc((int) (short) -1);
        int int14 = cKClassResult4.getNumberOfLogStatements();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getUniqueWordsQty();
        cKMethodResult4.setUniqueWordsQty((int) (byte) 100);
        cKMethodResult4.setStartLine((-1));
        int int10 = cKMethodResult4.getParenthesizedExpsQty();
        cKMethodResult4.setParenthesizedExpsQty((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getFanout();
        cKClassResult4.setNumberOfPublicMethods((int) (short) -1);
        java.util.Set<java.lang.String> strSet10 = cKClassResult4.getFieldNames();
        int int11 = cKClassResult4.getInnerClassesQty();
        cKClassResult4.setRfc(52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(strSet10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
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
        org.eclipse.jdt.core.dom.DoStatement doStatement11 = null;
        boolean boolean12 = cKVisitor4.visit(doStatement11);
        org.eclipse.jdt.core.dom.NormalAnnotation normalAnnotation13 = null;
        boolean boolean14 = cKVisitor4.visit(normalAnnotation13);
        org.eclipse.jdt.core.dom.SimpleType simpleType15 = null;
        cKVisitor4.endVisit(simpleType15);
        org.eclipse.jdt.core.dom.VariableDeclarationExpression variableDeclarationExpression17 = null;
        boolean boolean18 = cKVisitor4.visit(variableDeclarationExpression17);
        org.eclipse.jdt.core.dom.ArrayAccess arrayAccess19 = null;
        boolean boolean20 = cKVisitor4.visit(arrayAccess19);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
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
        org.eclipse.jdt.core.dom.SuperMethodReference superMethodReference13 = null;
        cKVisitor4.endVisit(superMethodReference13);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression15 = null;
        cKVisitor4.endVisit(parenthesizedExpression15);
        org.eclipse.jdt.core.dom.QualifiedType qualifiedType17 = null;
        cKVisitor4.endVisit(qualifiedType17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
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
        org.eclipse.jdt.core.dom.EmptyStatement emptyStatement13 = null;
        boolean boolean14 = cKVisitor4.visit(emptyStatement13);
        org.eclipse.jdt.core.dom.UnionType unionType15 = null;
        cKVisitor4.endVisit(unionType15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
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
        org.eclipse.jdt.core.dom.ModuleModifier moduleModifier19 = null;
        boolean boolean20 = cKVisitor4.visit(moduleModifier19);
        org.eclipse.jdt.core.dom.BooleanLiteral booleanLiteral21 = null;
        cKVisitor4.endVisit(booleanLiteral21);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
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
        org.eclipse.jdt.core.dom.PostfixExpression postfixExpression17 = null;
        cKVisitor4.endVisit(postfixExpression17);
        org.eclipse.jdt.core.dom.EnhancedForStatement enhancedForStatement19 = null;
        boolean boolean20 = cKVisitor4.visit(enhancedForStatement19);
        org.eclipse.jdt.core.dom.MethodDeclaration methodDeclaration21 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(methodDeclaration21);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
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
        org.eclipse.jdt.core.dom.AssertStatement assertStatement25 = null;
        boolean boolean26 = cKVisitor4.visit(assertStatement25);
        org.eclipse.jdt.core.dom.AssertStatement assertStatement27 = null;
        boolean boolean28 = cKVisitor4.visit(assertStatement27);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        java.util.Set<java.lang.String> strSet6 = cKMethodResult4.getMethodInvocationsLocal();
        java.util.Set<java.lang.String> strSet7 = cKMethodResult4.getFieldsAccessed();
        cKMethodResult4.setLogStatementsQty((int) ' ');
        cKMethodResult4.setLambdasQty(0);
        int int12 = cKMethodResult4.getLoopQty();
        java.lang.String str13 = cKMethodResult4.getQualifiedMethodName();
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
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
        org.eclipse.jdt.core.dom.ExportsDirective exportsDirective11 = null;
        boolean boolean12 = cKVisitor4.visit(exportsDirective11);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression13 = null;
        cKVisitor4.endVisit(patternInstanceofExpression13);
        org.eclipse.jdt.core.dom.LineComment lineComment15 = null;
        cKVisitor4.endVisit(lineComment15);
        org.eclipse.jdt.core.dom.SynchronizedStatement synchronizedStatement17 = null;
        boolean boolean18 = cKVisitor4.visit(synchronizedStatement17);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getRfc();
        cKClassResult4.setLcomNormalized((float) 1L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
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
        org.eclipse.jdt.core.dom.OpensDirective opensDirective17 = null;
        cKVisitor4.endVisit(opensDirective17);
        org.eclipse.jdt.core.dom.WildcardType wildcardType19 = null;
        cKVisitor4.endVisit(wildcardType19);
        org.eclipse.jdt.core.dom.UsesDirective usesDirective21 = null;
        cKVisitor4.endVisit(usesDirective21);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        float float5 = cKClassResult4.getTightClassCohesion();
        cKClassResult4.setAssignmentsQty((int) (short) -1);
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult12 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int13 = cKMethodResult12.getUniqueWordsQty();
        cKMethodResult12.setUniqueWordsQty((int) (byte) 10);
        cKMethodResult12.setAnonymousClassesQty((int) (short) 1);
        java.util.Set<java.lang.String> strSet18 = cKMethodResult12.getFieldsAccessed();
        cKClassResult4.setFieldNames(strSet18);
        cKClassResult4.setRfc((int) 'a');
        java.lang.String str22 = cKClassResult4.getType();
        cKClassResult4.setNumberOfStaticMethods(0);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}" + "'", str22, "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        float float5 = cKClassResult4.getTightClassCohesion();
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult10 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet11 = cKMethodResult10.getMethodInvocations();
        int int12 = cKMethodResult10.getStringLiteralsQty();
        cKMethodResult10.setWmc((int) (byte) 10);
        cKClassResult4.addMethod(cKMethodResult10);
        cKClassResult4.setLcomNormalized((float) (byte) -1);
        int int18 = cKClassResult4.getNumberOfLogStatements();
        int int19 = cKClassResult4.getMaxNestedBlocks();
        cKClassResult4.setNumberOfPrivateMethods(10);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
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
        org.eclipse.jdt.core.dom.MemberValuePair memberValuePair11 = null;
        boolean boolean12 = cKVisitor4.visit(memberValuePair11);
        org.eclipse.jdt.core.dom.Dimension dimension13 = null;
        boolean boolean14 = cKVisitor4.visit(dimension13);
        org.eclipse.jdt.core.dom.AssertStatement assertStatement15 = null;
        cKVisitor4.endVisit(assertStatement15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        com.github.mauricioaniche.ck.CK cK0 = new com.github.mauricioaniche.ck.CK();
        com.github.mauricioaniche.ck.CKNotifier cKNotifier2 = null;
// flaky:         cK0.calculate("CKClassResult [file=, className=CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}]", cKNotifier2);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.CastExpression castExpression7 = null;
        cKVisitor4.endVisit(castExpression7);
        org.eclipse.jdt.core.dom.ASTNode aSTNode9 = null;
        cKVisitor4.preVisit(aSTNode9);
        org.eclipse.jdt.core.dom.NumberLiteral numberLiteral11 = null;
        boolean boolean12 = cKVisitor4.visit(numberLiteral11);
        org.eclipse.jdt.core.dom.ExpressionStatement expressionStatement13 = null;
        boolean boolean14 = cKVisitor4.visit(expressionStatement13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
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
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression17 = null;
        cKVisitor4.endVisit(parenthesizedExpression17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", true, 0);
        int int5 = cKMethodResult4.getParenthesizedExpsQty();
        cKMethodResult4.setFanout((int) (byte) -1);
        boolean boolean8 = cKMethodResult4.isConstructor();
        int int9 = cKMethodResult4.getUniqueWordsQty();
        cKMethodResult4.setTryCatchQty((int) 'a');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        cKClassResult4.setFanout((int) 'a');
        int int8 = cKClassResult4.getNumberOfStaticFields();
        int int9 = cKClassResult4.getNumberOfAbstractMethods();
        int int10 = cKClassResult4.getLcom();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
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
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression15 = null;
        cKVisitor4.endVisit(parenthesizedExpression15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getFanout();
        cKClassResult4.setNoc(1);
        cKClassResult4.setMaxNestedBlocks((int) (short) 0);
        int int12 = cKClassResult4.getLoc();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
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
        cKClassResult4.setNumberOfDefaultMethods((int) (byte) 0);
        int int26 = cKClassResult4.getNumberOfFinalFields();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(strSet14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setStringLiteralsQty((int) (byte) 1);
        java.util.Optional<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultOptional8 = cKClassResult4.getMethod("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
        int int9 = cKClassResult4.getLoopQty();
        int int10 = cKClassResult4.getFanin();
        cKClassResult4.setAnonymousClassesQty((int) (short) 0);
        cKClassResult4.setLcom((int) (byte) 10);
        cKClassResult4.setNumberOfSynchronizedFields(10);
        cKClassResult4.setNumbersQty((int) (short) 1);
        cKClassResult4.setNumberOfSynchronizedFields((int) (short) 10);
        org.junit.Assert.assertNotNull(cKMethodResultOptional8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
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
        org.eclipse.jdt.core.dom.LambdaExpression lambdaExpression23 = null;
        boolean boolean24 = cKVisitor4.visit(lambdaExpression23);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
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
        org.eclipse.jdt.core.dom.MemberValuePair memberValuePair11 = null;
        boolean boolean12 = cKVisitor4.visit(memberValuePair11);
        org.eclipse.jdt.core.dom.MethodRef methodRef13 = null;
        cKVisitor4.endVisit(methodRef13);
        org.eclipse.jdt.core.dom.WildcardType wildcardType15 = null;
        cKVisitor4.endVisit(wildcardType15);
        org.eclipse.jdt.core.dom.VariableDeclarationExpression variableDeclarationExpression17 = null;
        boolean boolean18 = cKVisitor4.visit(variableDeclarationExpression17);
        org.eclipse.jdt.core.dom.QualifiedName qualifiedName19 = null;
        cKVisitor4.endVisit(qualifiedName19);
        org.eclipse.jdt.core.dom.SynchronizedStatement synchronizedStatement21 = null;
        boolean boolean22 = cKVisitor4.visit(synchronizedStatement21);
        org.eclipse.jdt.core.dom.TextElement textElement23 = null;
        cKVisitor4.endVisit(textElement23);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getLcom();
        cKClassResult4.setLcom((int) '#');
        int int10 = cKClassResult4.getNumberOfPublicFields();
        cKClassResult4.setNumberOfProtectedFields((int) (short) 10);
        int int13 = cKClassResult4.getRfc();
        int int14 = cKClassResult4.getNumberOfPublicMethods();
        com.github.mauricioaniche.ck.CKClassResult cKClassResult19 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        float float20 = cKClassResult19.getTightClassCohesion();
        cKClassResult19.setAssignmentsQty((int) (short) -1);
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult27 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int28 = cKMethodResult27.getUniqueWordsQty();
        cKMethodResult27.setUniqueWordsQty((int) (byte) 10);
        cKMethodResult27.setAnonymousClassesQty((int) (short) 1);
        java.util.Set<java.lang.String> strSet33 = cKMethodResult27.getFieldsAccessed();
        cKClassResult19.setFieldNames(strSet33);
        cKClassResult4.setFieldNames(strSet33);
        int int36 = cKClassResult4.getRfc();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        java.util.Set<java.lang.String> strSet6 = cKMethodResult4.getMethodInvocationsLocal();
        java.util.Set<java.lang.String> strSet7 = cKMethodResult4.getFieldsAccessed();
        java.lang.String str8 = cKMethodResult4.getQualifiedMethodName();
        cKMethodResult4.setStartLine(10);
        cKMethodResult4.setUniqueWordsQty((int) (byte) 100);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
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
        org.eclipse.jdt.core.dom.SwitchCase switchCase19 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(switchCase19);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
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
        org.eclipse.jdt.core.dom.SuperConstructorInvocation superConstructorInvocation17 = null;
        boolean boolean18 = cKVisitor4.visit(superConstructorInvocation17);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression19 = null;
        cKVisitor4.endVisit(parenthesizedExpression19);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
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
        org.eclipse.jdt.core.dom.NumberLiteral numberLiteral13 = null;
        boolean boolean14 = cKVisitor4.visit(numberLiteral13);
        org.eclipse.jdt.core.dom.TextBlock textBlock15 = null;
        cKVisitor4.endVisit(textBlock15);
        org.eclipse.jdt.core.dom.OpensDirective opensDirective17 = null;
        boolean boolean18 = cKVisitor4.visit(opensDirective17);
        org.eclipse.jdt.core.dom.NullLiteral nullLiteral19 = null;
        boolean boolean20 = cKVisitor4.visit(nullLiteral19);
        org.eclipse.jdt.core.dom.EnhancedForStatement enhancedForStatement21 = null;
        boolean boolean22 = cKVisitor4.visit(enhancedForStatement21);
        org.eclipse.jdt.core.dom.AssertStatement assertStatement23 = null;
        boolean boolean24 = cKVisitor4.visit(assertStatement23);
        org.eclipse.jdt.core.dom.AnnotationTypeDeclaration annotationTypeDeclaration25 = null;
        boolean boolean26 = cKVisitor4.visit(annotationTypeDeclaration25);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        java.util.Set<java.lang.String> strSet6 = cKMethodResult4.getMethodInvocationsLocal();
        java.util.Set<java.lang.String> strSet7 = cKMethodResult4.getFieldsAccessed();
        int int8 = cKMethodResult4.getComparisonsQty();
        int int9 = cKMethodResult4.getParametersQty();
        int int10 = cKMethodResult4.getAnonymousClassesQty();
        int int11 = cKMethodResult4.getMaxNestedBlocks();
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getInnerClassesQty();
        cKClassResult4.setLogStatementsQty(0);
        int int8 = cKClassResult4.getDit();
        int int9 = cKClassResult4.getModifiers();
        cKClassResult4.setInnerClassesQty((int) (byte) 1);
        int int12 = cKClassResult4.getNumberOfPrivateMethods();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
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
        org.eclipse.jdt.core.dom.Assignment assignment19 = null;
        cKVisitor4.endVisit(assignment19);
        org.eclipse.jdt.core.dom.QualifiedType qualifiedType21 = null;
        cKVisitor4.endVisit(qualifiedType21);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
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
        org.eclipse.jdt.core.dom.ModuleModifier moduleModifier21 = null;
        boolean boolean22 = cKVisitor4.visit(moduleModifier21);
        org.eclipse.jdt.core.dom.Dimension dimension23 = null;
        cKVisitor4.endVisit(dimension23);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        cKClassResult4.setRfc(0);
        cKClassResult4.setNumberOfDefaultFields(0);
        java.lang.String str10 = cKClassResult4.getClassName();
        cKClassResult4.setNumbersQty(52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}" + "'", str10, "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getMaxNestedBlocks();
        cKClassResult4.setReturnQty((int) (byte) 10);
        int int8 = cKClassResult4.getNumberOfLogStatements();
        int int9 = cKClassResult4.getNumberOfPrivateMethods();
        cKClassResult4.setLcomNormalized((float) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
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
        org.eclipse.jdt.core.dom.VariableDeclarationFragment variableDeclarationFragment19 = null;
        boolean boolean20 = cKVisitor4.visit(variableDeclarationFragment19);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression21 = null;
        cKVisitor4.endVisit(patternInstanceofExpression21);
        org.eclipse.jdt.core.dom.ContinueStatement continueStatement23 = null;
        boolean boolean24 = cKVisitor4.visit(continueStatement23);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
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
        org.eclipse.jdt.core.dom.StringLiteral stringLiteral13 = null;
        cKVisitor4.endVisit(stringLiteral13);
        org.eclipse.jdt.core.dom.CreationReference creationReference15 = null;
        boolean boolean16 = cKVisitor4.visit(creationReference15);
        org.eclipse.jdt.core.dom.SingleMemberAnnotation singleMemberAnnotation17 = null;
        cKVisitor4.endVisit(singleMemberAnnotation17);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getUniqueWordsQty();
        int int7 = cKClassResult4.getUniqueWordsQty();
        cKClassResult4.setNumberOfFields((int) (byte) 0);
        int int10 = cKClassResult4.getLoc();
        cKClassResult4.setMaxNestedBlocks(10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getLcom();
        cKClassResult4.setLcom((int) '#');
        cKClassResult4.setDit(10);
        cKClassResult4.setLcom((int) (byte) 100);
        int int14 = cKClassResult4.getNumberOfPrivateMethods();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
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
        org.eclipse.jdt.core.dom.MemberValuePair memberValuePair11 = null;
        boolean boolean12 = cKVisitor4.visit(memberValuePair11);
        org.eclipse.jdt.core.dom.MethodRef methodRef13 = null;
        cKVisitor4.endVisit(methodRef13);
        org.eclipse.jdt.core.dom.WildcardType wildcardType15 = null;
        cKVisitor4.endVisit(wildcardType15);
        org.eclipse.jdt.core.dom.VariableDeclarationExpression variableDeclarationExpression17 = null;
        boolean boolean18 = cKVisitor4.visit(variableDeclarationExpression17);
        org.eclipse.jdt.core.dom.QualifiedName qualifiedName19 = null;
        cKVisitor4.endVisit(qualifiedName19);
        org.eclipse.jdt.core.dom.StringLiteral stringLiteral21 = null;
        boolean boolean22 = cKVisitor4.visit(stringLiteral21);
        org.eclipse.jdt.core.dom.ModuleModifier moduleModifier23 = null;
        boolean boolean24 = cKVisitor4.visit(moduleModifier23);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "hi!", false, (int) (byte) 0);
        cKMethodResult4.setFanout(1);
        cKMethodResult4.setCbo(10);
        int int9 = cKMethodResult4.getAnonymousClassesQty();
        cKMethodResult4.setTryCatchQty((int) (short) 100);
        boolean boolean12 = cKMethodResult4.isConstructor();
        cKMethodResult4.setReturnQty((int) (short) 1);
        int int15 = cKMethodResult4.getWmc();
        cKMethodResult4.setNumbersQty((int) '4');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
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
        org.eclipse.jdt.core.dom.SuperConstructorInvocation superConstructorInvocation17 = null;
        boolean boolean18 = cKVisitor4.visit(superConstructorInvocation17);
        org.eclipse.jdt.core.dom.YieldStatement yieldStatement19 = null;
        cKVisitor4.endVisit(yieldStatement19);
        org.eclipse.jdt.core.dom.MemberRef memberRef21 = null;
        cKVisitor4.endVisit(memberRef21);
        org.eclipse.jdt.core.dom.ImportDeclaration importDeclaration23 = null;
        boolean boolean24 = cKVisitor4.visit(importDeclaration23);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
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
        org.eclipse.jdt.core.dom.Dimension dimension21 = null;
        cKVisitor4.endVisit(dimension21);
        org.eclipse.jdt.core.dom.EnhancedForStatement enhancedForStatement23 = null;
        boolean boolean24 = cKVisitor4.visit(enhancedForStatement23);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", true, (int) ' ');
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
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
        org.eclipse.jdt.core.dom.ASTNode aSTNode19 = null;
        boolean boolean20 = cKVisitor4.preVisit2(aSTNode19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
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
        org.eclipse.jdt.core.dom.ReturnStatement returnStatement11 = null;
        boolean boolean12 = cKVisitor4.visit(returnStatement11);
        org.eclipse.jdt.core.dom.LineComment lineComment13 = null;
        cKVisitor4.endVisit(lineComment13);
        org.eclipse.jdt.core.dom.MemberValuePair memberValuePair15 = null;
        boolean boolean16 = cKVisitor4.visit(memberValuePair15);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
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
        org.eclipse.jdt.core.dom.EnhancedForStatement enhancedForStatement15 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(enhancedForStatement15);
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
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        cKMethodResult4.setLoc((int) (byte) 100);
        cKMethodResult4.setTryCatchQty((int) (byte) -1);
        int int9 = cKMethodResult4.getNumbersQty();
        int int10 = cKMethodResult4.getWmc();
        cKMethodResult4.setCboModified((int) (short) 100);
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult17 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet18 = cKMethodResult17.getMethodInvocations();
        int int19 = cKMethodResult17.getStringLiteralsQty();
        cKMethodResult17.setWmc((int) (byte) 10);
        int int22 = cKMethodResult17.getMathOperationsQty();
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult27 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int28 = cKMethodResult27.getUniqueWordsQty();
        int int29 = cKMethodResult27.getAssignmentsQty();
        cKMethodResult27.setTryCatchQty((int) (byte) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap32 = cKMethodResult27.getFieldUsage();
        cKMethodResult17.setVariablesUsage(strMap32);
        cKMethodResult4.setVariablesUsage(strMap32);
        cKMethodResult4.setLambdasQty(52);
        int int37 = cKMethodResult4.getFanout();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
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
        org.eclipse.jdt.core.dom.WildcardType wildcardType23 = null;
        cKVisitor4.endVisit(wildcardType23);
        org.eclipse.jdt.core.dom.ConstructorInvocation constructorInvocation25 = null;
        boolean boolean26 = cKVisitor4.visit(constructorInvocation25);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getLcom();
        cKClassResult4.setNumberOfFinalFields((int) ' ');
        cKClassResult4.setAnonymousClassesQty((int) '4');
        java.util.Set<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultSet12 = cKClassResult4.getMethods();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(cKMethodResultSet12);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
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
        org.eclipse.jdt.core.dom.VariableDeclarationStatement variableDeclarationStatement13 = null;
        cKVisitor4.endVisit(variableDeclarationStatement13);
        org.eclipse.jdt.core.dom.LineComment lineComment15 = null;
        boolean boolean16 = cKVisitor4.visit(lineComment15);
        org.eclipse.jdt.core.dom.PackageDeclaration packageDeclaration17 = null;
        boolean boolean18 = cKVisitor4.visit(packageDeclaration17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
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
        org.eclipse.jdt.core.dom.ExportsDirective exportsDirective19 = null;
        cKVisitor4.endVisit(exportsDirective19);
        org.eclipse.jdt.core.dom.SingleMemberAnnotation singleMemberAnnotation21 = null;
        cKVisitor4.endVisit(singleMemberAnnotation21);
        org.eclipse.jdt.core.dom.EnumDeclaration enumDeclaration23 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = cKVisitor4.visit(enumDeclaration23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        cKClassResult4.setInnerClassesQty((int) (short) 100);
        cKClassResult4.setParenthesizedExpsQty((int) '4');
        cKClassResult4.setNumberOfPublicFields((int) (byte) 10);
        cKClassResult4.setVariablesQty((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getNumberOfFinalFields();
        int int8 = cKClassResult4.getLcom();
        int int9 = cKClassResult4.getNumberOfProtectedFields();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
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
        int int16 = cKClassResult4.getNumberOfPublicMethods();
        cKClassResult4.setCboModified((int) (byte) -1);
        int int19 = cKClassResult4.getNumberOfFields();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
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
        cKVisitor4.endVisit(arrayInitializer13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        com.github.mauricioaniche.ck.ResultWriter resultWriter5 = new com.github.mauricioaniche.ck.ResultWriter("CKClassResult [file=, className=CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}]", "CKMethodResult{cbo=10, rfc=0, wmc=0, methodName='hi!'}", "CKClassResult [file=, className=CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}]", "CKClassResult [file=, className=CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}]", false);
        com.github.mauricioaniche.ck.CKClassResult cKClassResult10 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int11 = cKClassResult10.getNumberOfFinalFields();
        int int12 = cKClassResult10.getLoc();
        int int13 = cKClassResult10.getNumberOfPublicFields();
        cKClassResult10.setNoc(0);
        resultWriter5.printResult(cKClassResult10);
        com.github.mauricioaniche.ck.CKClassResult cKClassResult21 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult21.setStringLiteralsQty((-1));
        resultWriter5.printResult(cKClassResult21);
        resultWriter5.flushAndClose();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getMaxNestedBlocks();
        int int6 = cKClassResult4.getMaxNestedBlocks();
        int int7 = cKClassResult4.getNumberOfPrivateMethods();
        java.lang.String str8 = cKClassResult4.getType();
        int int9 = cKClassResult4.getNumberOfProtectedMethods();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}" + "'", str8, "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
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
        org.eclipse.jdt.core.dom.ThisExpression thisExpression19 = null;
        cKVisitor4.endVisit(thisExpression19);
        org.eclipse.jdt.core.dom.TypeDeclarationStatement typeDeclarationStatement21 = null;
        boolean boolean22 = cKVisitor4.visit(typeDeclarationStatement21);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "hi!", false, (int) (byte) 0);
        cKMethodResult4.setWmc((int) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cKMethodResult4.getFieldUsage();
        boolean boolean8 = cKMethodResult4.isConstructor();
        java.lang.String str9 = cKMethodResult4.getQualifiedMethodName();
        int int10 = cKMethodResult4.getStartLine();
        cKMethodResult4.setStringLiteralsQty(0);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
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
        org.eclipse.jdt.core.dom.PrefixExpression prefixExpression17 = null;
        cKVisitor4.endVisit(prefixExpression17);
        org.eclipse.jdt.core.dom.ASTNode aSTNode19 = null;
        boolean boolean20 = cKVisitor4.preVisit2(aSTNode19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getMathOperationsQty();
        int int6 = cKMethodResult4.getRfc();
        int int7 = cKMethodResult4.getCbo();
        int int8 = cKMethodResult4.getParenthesizedExpsQty();
        cKMethodResult4.setMaxNestedBlocks((int) 'a');
        java.lang.String str11 = cKMethodResult4.getQualifiedMethodName();
        int int12 = cKMethodResult4.getRfc();
        cKMethodResult4.setRfc((int) (short) 10);
        int int15 = cKMethodResult4.getFanin();
        cKMethodResult4.setAssignmentsQty((int) (short) 0);
        boolean boolean18 = cKMethodResult4.isConstructor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
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
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression11 = null;
        cKVisitor4.endVisit(patternInstanceofExpression11);
        org.eclipse.jdt.core.dom.TryStatement tryStatement13 = null;
        boolean boolean14 = cKVisitor4.visit(tryStatement13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
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
        org.eclipse.jdt.core.dom.SwitchStatement switchStatement23 = null;
        boolean boolean24 = cKVisitor4.visit(switchStatement23);
        org.eclipse.jdt.core.dom.PrefixExpression prefixExpression25 = null;
        cKVisitor4.endVisit(prefixExpression25);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
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
        cKClassResult4.setVariablesQty((-1));
        int int26 = cKClassResult4.getReturnQty();
        int int27 = cKClassResult4.getTryCatchQty();
        cKClassResult4.setNumberOfStaticMethods((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(strSet14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
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
        org.eclipse.jdt.core.dom.Modifier modifier13 = null;
        boolean boolean14 = cKVisitor4.visit(modifier13);
        org.eclipse.jdt.core.dom.PostfixExpression postfixExpression15 = null;
        cKVisitor4.endVisit(postfixExpression15);
        org.eclipse.jdt.core.dom.NumberLiteral numberLiteral17 = null;
        cKVisitor4.endVisit(numberLiteral17);
        org.eclipse.jdt.core.dom.IfStatement ifStatement19 = null;
        boolean boolean20 = cKVisitor4.visit(ifStatement19);
        org.eclipse.jdt.core.dom.WildcardType wildcardType21 = null;
        boolean boolean22 = cKVisitor4.visit(wildcardType21);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", true, 0);
        int int5 = cKMethodResult4.getParenthesizedExpsQty();
        cKMethodResult4.setFanout((int) (byte) -1);
        cKMethodResult4.setHasJavadoc(true);
        int int10 = cKMethodResult4.getModifiers();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
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
        org.eclipse.jdt.core.dom.ExpressionMethodReference expressionMethodReference15 = null;
        boolean boolean16 = cKVisitor4.visit(expressionMethodReference15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
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
        org.eclipse.jdt.core.dom.BlockComment blockComment19 = null;
        cKVisitor4.endVisit(blockComment19);
        org.eclipse.jdt.core.dom.ArrayInitializer arrayInitializer21 = null;
        boolean boolean22 = cKVisitor4.visit(arrayInitializer21);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setStringLiteralsQty((int) (byte) 1);
        java.util.Optional<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultOptional8 = cKClassResult4.getMethod("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
        int int9 = cKClassResult4.getLoopQty();
        int int10 = cKClassResult4.getFanin();
        cKClassResult4.setAnonymousClassesQty((int) (short) 0);
        cKClassResult4.setCbo((int) ' ');
        org.junit.Assert.assertNotNull(cKMethodResultOptional8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        com.github.mauricioaniche.ck.CK cK3 = new com.github.mauricioaniche.ck.CK(true, (int) (short) 1, false);
        com.github.mauricioaniche.ck.CKNotifier cKNotifier5 = null;
        cK3.calculate("CKClassResult [file=, className=CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}]", cKNotifier5);
        com.github.mauricioaniche.ck.CKNotifier cKNotifier8 = null;
// flaky:         cK3.calculate("hi!", cKNotifier8);
        java.nio.file.Path path10 = null;
        com.github.mauricioaniche.ck.CKNotifier cKNotifier11 = null;
        java.nio.file.Path path12 = null;
        java.nio.file.Path[] pathArray13 = new java.nio.file.Path[] { path12 };
        // The following exception was thrown during execution in test generation
        try {
            cK3.calculate(path10, cKNotifier11, pathArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pathArray13);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
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
        org.eclipse.jdt.core.dom.PostfixExpression postfixExpression21 = null;
        cKVisitor4.endVisit(postfixExpression21);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
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
        org.eclipse.jdt.core.dom.PostfixExpression postfixExpression11 = null;
        cKVisitor4.endVisit(postfixExpression11);
        org.eclipse.jdt.core.dom.NormalAnnotation normalAnnotation13 = null;
        boolean boolean14 = cKVisitor4.visit(normalAnnotation13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
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
        org.eclipse.jdt.core.dom.ArrayType arrayType19 = null;
        cKVisitor4.endVisit(arrayType19);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
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
        cKClassResult4.setVariablesQty((-1));
        int int26 = cKClassResult4.getReturnQty();
        java.util.Set<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultSet27 = cKClassResult4.getMethods();
        cKClassResult4.setLoc((int) ' ');
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(strSet14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(cKMethodResultSet27);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
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
        cKClassResult4.setVariablesQty((-1));
        int int26 = cKClassResult4.getReturnQty();
        int int27 = cKClassResult4.getTryCatchQty();
        int int28 = cKClassResult4.getInnerClassesQty();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(strSet14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
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
        org.eclipse.jdt.core.dom.ModuleQualifiedName moduleQualifiedName23 = null;
        boolean boolean24 = cKVisitor4.visit(moduleQualifiedName23);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
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
        org.eclipse.jdt.core.dom.ProvidesDirective providesDirective15 = null;
        cKVisitor4.endVisit(providesDirective15);
        org.eclipse.jdt.core.dom.ReturnStatement returnStatement17 = null;
        cKVisitor4.endVisit(returnStatement17);
        org.eclipse.jdt.core.dom.EnumConstantDeclaration enumConstantDeclaration19 = null;
        boolean boolean20 = cKVisitor4.visit(enumConstantDeclaration19);
        org.eclipse.jdt.core.dom.MethodInvocation methodInvocation21 = null;
        cKVisitor4.endVisit(methodInvocation21);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
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
        org.eclipse.jdt.core.dom.ModuleModifier moduleModifier13 = null;
        boolean boolean14 = cKVisitor4.visit(moduleModifier13);
        org.eclipse.jdt.core.dom.AnonymousClassDeclaration anonymousClassDeclaration15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = cKVisitor4.visit(anonymousClassDeclaration15);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setStringLiteralsQty((-1));
        int int7 = cKClassResult4.getNumberOfLogStatements();
        int int8 = cKClassResult4.getCbo();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
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
        org.eclipse.jdt.core.dom.NumberLiteral numberLiteral13 = null;
        boolean boolean14 = cKVisitor4.visit(numberLiteral13);
        org.eclipse.jdt.core.dom.TextBlock textBlock15 = null;
        cKVisitor4.endVisit(textBlock15);
        org.eclipse.jdt.core.dom.OpensDirective opensDirective17 = null;
        boolean boolean18 = cKVisitor4.visit(opensDirective17);
        org.eclipse.jdt.core.dom.SingleVariableDeclaration singleVariableDeclaration19 = null;
        cKVisitor4.endVisit(singleVariableDeclaration19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getUniqueWordsQty();
        int int6 = cKMethodResult4.getAssignmentsQty();
        int int7 = cKMethodResult4.getReturnQty();
        cKMethodResult4.setInnerClassesQty(0);
        boolean boolean10 = cKMethodResult4.getHasJavadoc();
        int int11 = cKMethodResult4.getParenthesizedExpsQty();
        java.util.Set<java.lang.String> strSet12 = cKMethodResult4.getMethodInvocationsLocal();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(strSet12);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
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
        org.eclipse.jdt.core.dom.AssertStatement assertStatement23 = null;
        cKVisitor4.endVisit(assertStatement23);
        org.eclipse.jdt.core.dom.FieldDeclaration fieldDeclaration25 = null;
        boolean boolean26 = cKVisitor4.visit(fieldDeclaration25);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation27 = null;
        boolean boolean28 = cKVisitor4.visit(arrayCreation27);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
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
        org.eclipse.jdt.core.dom.ProvidesDirective providesDirective15 = null;
        cKVisitor4.endVisit(providesDirective15);
        org.eclipse.jdt.core.dom.VariableDeclarationFragment variableDeclarationFragment17 = null;
        cKVisitor4.endVisit(variableDeclarationFragment17);
        org.eclipse.jdt.core.dom.ExportsDirective exportsDirective19 = null;
        boolean boolean20 = cKVisitor4.visit(exportsDirective19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
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
        org.eclipse.jdt.core.dom.NormalAnnotation normalAnnotation13 = null;
        boolean boolean14 = cKVisitor4.visit(normalAnnotation13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
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
        org.eclipse.jdt.core.dom.TextBlock textBlock17 = null;
        boolean boolean18 = cKVisitor4.visit(textBlock17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
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
        org.eclipse.jdt.core.dom.ReturnStatement returnStatement17 = null;
        cKVisitor4.endVisit(returnStatement17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "hi!", false, (int) (byte) 0);
        cKMethodResult4.setFanout(1);
        int int7 = cKMethodResult4.getNumbersQty();
        int int8 = cKMethodResult4.getUniqueWordsQty();
        int int9 = cKMethodResult4.getVariablesQty();
        int int10 = cKMethodResult4.getStartLine();
        int int11 = cKMethodResult4.getVariablesQty();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        cKMethodResult4.setAssignmentsQty((int) (short) -1);
        int int8 = cKMethodResult4.getUniqueWordsQty();
        cKMethodResult4.setAnonymousClassesQty(52);
        cKMethodResult4.setAssignmentsQty((int) (short) 0);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
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
        org.eclipse.jdt.core.dom.MethodRef methodRef21 = null;
        cKVisitor4.endVisit(methodRef21);
        org.eclipse.jdt.core.dom.SynchronizedStatement synchronizedStatement23 = null;
        boolean boolean24 = cKVisitor4.visit(synchronizedStatement23);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
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
        org.eclipse.jdt.core.dom.NameQualifiedType nameQualifiedType23 = null;
        cKVisitor4.endVisit(nameQualifiedType23);
        org.eclipse.jdt.core.dom.EmptyStatement emptyStatement25 = null;
        cKVisitor4.endVisit(emptyStatement25);
        org.eclipse.jdt.core.dom.MethodRef methodRef27 = null;
        cKVisitor4.endVisit(methodRef27);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation29 = null;
        cKVisitor4.endVisit(arrayCreation29);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
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
        org.eclipse.jdt.core.dom.AssertStatement assertStatement15 = null;
        cKVisitor4.endVisit(assertStatement15);
        org.eclipse.jdt.core.dom.VariableDeclarationFragment variableDeclarationFragment17 = null;
        cKVisitor4.endVisit(variableDeclarationFragment17);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
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
        java.util.Optional<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultOptional27 = cKClassResult4.getMethod("CKMethodResult{cbo=10, rfc=0, wmc=0, methodName='hi!'}");
        cKClassResult4.setNumberOfProtectedFields(0);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(cKMethodResultOptional27);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
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
        cKClassResult4.setVariablesQty(35);
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
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        cKMethodResult4.setLoc((int) (byte) 100);
        cKMethodResult4.setTryCatchQty((int) (byte) -1);
        int int9 = cKMethodResult4.getNumbersQty();
        int int10 = cKMethodResult4.getWmc();
        cKMethodResult4.setLogStatementsQty((int) ' ');
        cKMethodResult4.setStartLine(100);
        cKMethodResult4.setLoc((int) '4');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable0 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable1 = null;
        com.github.mauricioaniche.ck.CKNotifier cKNotifier2 = null;
        com.github.mauricioaniche.ck.MetricsExecutor metricsExecutor3 = new com.github.mauricioaniche.ck.MetricsExecutor(classLevelMetricListCallable0, methodLevelMetricListCallable1, cKNotifier2);
        java.lang.String[] strArray9 = new java.lang.String[] { "", "CKMethodResult{cbo=10, rfc=0, wmc=0, methodName='hi!'}", "hi!", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=10, rfc=0, wmc=0, methodName='hi!'}" };
        org.eclipse.jdt.core.dom.IBinding[] iBindingArray10 = metricsExecutor3.createBindings(strArray9);
        org.eclipse.jdt.core.dom.IBinding iBinding12 = null;
        metricsExecutor3.acceptBinding("CKClassResult [file=, className=CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}]", iBinding12);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(iBindingArray10);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getUniqueWordsQty();
        cKMethodResult4.setUniqueWordsQty((int) (byte) 10);
        int int8 = cKMethodResult4.getLogStatementsQty();
        boolean boolean9 = cKMethodResult4.isConstructor();
        int int10 = cKMethodResult4.getMathOperationsQty();
        int int11 = cKMethodResult4.getInnerClassesQty();
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult16 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int17 = cKMethodResult16.getUniqueWordsQty();
        cKMethodResult16.setUniqueWordsQty((int) (byte) 10);
        int int20 = cKMethodResult16.getLogStatementsQty();
        int int21 = cKMethodResult16.getCbo();
        java.util.Set<java.lang.String> strSet22 = cKMethodResult16.getFieldsAccessed();
        cKMethodResult4.setMethodInvocationLocal(strSet22);
        int int24 = cKMethodResult4.getReturnQty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "hi!", false, (int) (byte) 0);
        cKMethodResult4.setWmc((int) (byte) 100);
        int int7 = cKMethodResult4.getMaxNestedBlocks();
        int int8 = cKMethodResult4.getMathOperationsQty();
        java.lang.String str9 = cKMethodResult4.getMethodName();
        cKMethodResult4.setAssignmentsQty((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
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
        org.eclipse.jdt.core.dom.ParameterizedType parameterizedType13 = null;
        cKVisitor4.endVisit(parameterizedType13);
        org.eclipse.jdt.core.dom.CreationReference creationReference15 = null;
        cKVisitor4.endVisit(creationReference15);
        org.eclipse.jdt.core.dom.SingleVariableDeclaration singleVariableDeclaration17 = null;
        cKVisitor4.endVisit(singleVariableDeclaration17);
        org.eclipse.jdt.core.dom.UnionType unionType19 = null;
        cKVisitor4.endVisit(unionType19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
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
        org.eclipse.jdt.core.dom.IfStatement ifStatement17 = null;
        boolean boolean18 = cKVisitor4.visit(ifStatement17);
        org.eclipse.jdt.core.dom.MethodRef methodRef19 = null;
        boolean boolean20 = cKVisitor4.visit(methodRef19);
        org.eclipse.jdt.core.dom.InfixExpression infixExpression21 = null;
        boolean boolean22 = cKVisitor4.visit(infixExpression21);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
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
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression19 = null;
        boolean boolean20 = cKVisitor4.visit(patternInstanceofExpression19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
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
        org.eclipse.jdt.core.dom.NormalAnnotation normalAnnotation11 = null;
        cKVisitor4.endVisit(normalAnnotation11);
        org.eclipse.jdt.core.dom.MemberValuePair memberValuePair13 = null;
        boolean boolean14 = cKVisitor4.visit(memberValuePair13);
        org.eclipse.jdt.core.dom.SuperFieldAccess superFieldAccess15 = null;
        boolean boolean16 = cKVisitor4.visit(superFieldAccess15);
        org.eclipse.jdt.core.dom.SuperFieldAccess superFieldAccess17 = null;
        cKVisitor4.endVisit(superFieldAccess17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getFanout();
        cKClassResult4.setLcomNormalized((float) (short) 10);
        cKClassResult4.setNumberOfFields((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
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
        cKMethodResult4.setMaxNestedBlocks(35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(strSet15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
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
        org.eclipse.jdt.core.dom.InstanceofExpression instanceofExpression11 = null;
        boolean boolean12 = cKVisitor4.visit(instanceofExpression11);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation13 = null;
        boolean boolean14 = cKVisitor4.visit(arrayCreation13);
        org.eclipse.jdt.core.dom.RecordDeclaration recordDeclaration15 = null;
        boolean boolean16 = cKVisitor4.visit(recordDeclaration15);
        org.eclipse.jdt.core.dom.AnnotationTypeDeclaration annotationTypeDeclaration17 = null;
        boolean boolean18 = cKVisitor4.visit(annotationTypeDeclaration17);
        org.eclipse.jdt.core.dom.MethodDeclaration methodDeclaration19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = cKVisitor4.visit(methodDeclaration19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("CKClassResult [file=, className=CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}]", "", false, (int) (byte) -1);
        cKMethodResult4.setMaxNestedBlocks(52);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
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
        org.eclipse.jdt.core.dom.CreationReference creationReference19 = null;
        boolean boolean20 = cKVisitor4.visit(creationReference19);
        org.eclipse.jdt.core.dom.ClassInstanceCreation classInstanceCreation21 = null;
        boolean boolean22 = cKVisitor4.visit(classInstanceCreation21);
        org.eclipse.jdt.core.dom.AnnotationTypeDeclaration annotationTypeDeclaration23 = null;
        boolean boolean24 = cKVisitor4.visit(annotationTypeDeclaration23);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
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
        org.eclipse.jdt.core.dom.ArrayType arrayType19 = null;
        boolean boolean20 = cKVisitor4.visit(arrayType19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
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
        org.eclipse.jdt.core.dom.TypeLiteral typeLiteral21 = null;
        boolean boolean22 = cKVisitor4.visit(typeLiteral21);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getUniqueWordsQty();
        cKMethodResult4.setUniqueWordsQty((int) (byte) 10);
        int int8 = cKMethodResult4.getMathOperationsQty();
        cKMethodResult4.setStringLiteralsQty((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getMathOperationsQty();
        cKMethodResult4.setReturnQty(100);
        java.util.Set<java.lang.String> strSet8 = cKMethodResult4.getFieldsAccessed();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
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
        org.eclipse.jdt.core.dom.SingleVariableDeclaration singleVariableDeclaration17 = null;
        cKVisitor4.endVisit(singleVariableDeclaration17);
        org.eclipse.jdt.core.dom.TextElement textElement19 = null;
        boolean boolean20 = cKVisitor4.visit(textElement19);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setAnonymousClassesQty((int) (byte) -1);
        int int7 = cKClassResult4.getNumberOfSynchronizedFields();
        cKClassResult4.setAssignmentsQty((int) (byte) 1);
        int int10 = cKClassResult4.getRfc();
        cKClassResult4.setNumberOfAbstractMethods((int) '#');
        int int13 = cKClassResult4.getUniqueWordsQty();
        cKClassResult4.setNumberOfAbstractMethods((int) (byte) 100);
        cKClassResult4.setAssignmentsQty(52);
        float float18 = cKClassResult4.getLooseClassCohesion();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.0f + "'", float18 == 0.0f);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
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
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression17 = null;
        boolean boolean18 = cKVisitor4.visit(patternInstanceofExpression17);
        org.eclipse.jdt.core.dom.ContinueStatement continueStatement19 = null;
        boolean boolean20 = cKVisitor4.visit(continueStatement19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
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
        org.eclipse.jdt.core.dom.ExpressionMethodReference expressionMethodReference11 = null;
        cKVisitor4.endVisit(expressionMethodReference11);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
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
        org.eclipse.jdt.core.dom.ContinueStatement continueStatement23 = null;
        boolean boolean24 = cKVisitor4.visit(continueStatement23);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
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
        org.eclipse.jdt.core.dom.QualifiedType qualifiedType13 = null;
        cKVisitor4.endVisit(qualifiedType13);
        org.eclipse.jdt.core.dom.SwitchCase switchCase15 = null;
        boolean boolean16 = cKVisitor4.visit(switchCase15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
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
        java.util.Map<java.lang.String, java.util.Set<java.lang.String>> strMap33 = null;
        cKMethodResult4.setMethodInvocationsIndirectLocal(strMap33);
        int int35 = cKMethodResult4.getReturnQty();
        int int36 = cKMethodResult4.getLogStatementsQty();
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
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
        org.eclipse.jdt.core.dom.ThrowStatement throwStatement17 = null;
        cKVisitor4.endVisit(throwStatement17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
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
        org.eclipse.jdt.core.dom.ClassInstanceCreation classInstanceCreation13 = null;
        cKVisitor4.endVisit(classInstanceCreation13);
        org.eclipse.jdt.core.dom.Dimension dimension15 = null;
        cKVisitor4.endVisit(dimension15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getLambdasQty();
        int int6 = cKMethodResult4.getFanout();
        int int7 = cKMethodResult4.getCboModified();
        int int8 = cKMethodResult4.getStartLine();
        boolean boolean9 = cKMethodResult4.getIsVisible();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        java.util.Set<java.lang.String> strSet6 = cKMethodResult4.getMethodInvocationsLocal();
        cKMethodResult4.setCboModified(100);
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult13 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int14 = cKMethodResult13.getLambdasQty();
        java.util.Set<java.lang.String> strSet15 = cKMethodResult13.getMethodInvocations();
        cKMethodResult4.setMethodInvocations(strSet15);
        int int17 = cKMethodResult4.getComparisonsQty();
        int int18 = cKMethodResult4.getLoopQty();
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        java.util.Set<java.lang.String> strSet6 = cKMethodResult4.getMethodInvocationsLocal();
        int int7 = cKMethodResult4.getLambdasQty();
        int int8 = cKMethodResult4.getWmc();
        cKMethodResult4.setReturnQty((int) '4');
        int int11 = cKMethodResult4.getReturnQty();
        int int12 = cKMethodResult4.getInnerClassesQty();
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
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
        org.eclipse.jdt.core.dom.SuperFieldAccess superFieldAccess19 = null;
        cKVisitor4.endVisit(superFieldAccess19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
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
        int int16 = cKClassResult4.getNumberOfPublicMethods();
        int int17 = cKClassResult4.getNumberOfProtectedMethods();
        java.lang.String str18 = cKClassResult4.toString();
        cKClassResult4.setFanout((int) '4');
        int int21 = cKClassResult4.getLambdasQty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "CKClassResult [file=, className=CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}]" + "'", str18, "CKClassResult [file=, className=CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getUniqueWordsQty();
        int int6 = cKMethodResult4.getAssignmentsQty();
        cKMethodResult4.setTryCatchQty((int) (byte) 0);
        java.lang.String str9 = cKMethodResult4.getMethodName();
        cKMethodResult4.setCbo((int) (short) 0);
        int int12 = cKMethodResult4.getInnerClassesQty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getLcom();
        cKClassResult4.setLcom((int) '#');
        int int10 = cKClassResult4.getNumberOfPublicFields();
        cKClassResult4.setNumberOfProtectedFields((int) (short) 10);
        int int13 = cKClassResult4.getRfc();
        cKClassResult4.setTightClassCohesion(0.0f);
        cKClassResult4.setParenthesizedExpsQty((int) ' ');
        int int18 = cKClassResult4.getNumberOfDefaultMethods();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
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
        org.eclipse.jdt.core.dom.SuperMethodInvocation superMethodInvocation19 = null;
        cKVisitor4.endVisit(superMethodInvocation19);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "hi!", false, (int) (byte) 0);
        cKMethodResult4.setFanout(1);
        cKMethodResult4.setMathOperationsQty((int) (short) 1);
        java.util.Map<java.lang.String, java.util.Set<java.lang.String>> strMap9 = null;
        cKMethodResult4.setMethodInvocationsIndirectLocal(strMap9);
        int int11 = cKMethodResult4.getMaxNestedBlocks();
        boolean boolean12 = cKMethodResult4.getHasJavadoc();
        cKMethodResult4.setLogStatementsQty(10);
        java.util.Set<java.lang.String> strSet15 = cKMethodResult4.getMethodInvocations();
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult20 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        cKMethodResult20.setLoc((int) (byte) 100);
        cKMethodResult20.setTryCatchQty((int) (byte) -1);
        int int25 = cKMethodResult20.getNumbersQty();
        int int26 = cKMethodResult20.getWmc();
        cKMethodResult20.setCboModified((int) (short) 100);
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult33 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet34 = cKMethodResult33.getMethodInvocations();
        int int35 = cKMethodResult33.getStringLiteralsQty();
        cKMethodResult33.setWmc((int) (byte) 10);
        int int38 = cKMethodResult33.getMathOperationsQty();
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult43 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int44 = cKMethodResult43.getUniqueWordsQty();
        int int45 = cKMethodResult43.getAssignmentsQty();
        cKMethodResult43.setTryCatchQty((int) (byte) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap48 = cKMethodResult43.getFieldUsage();
        cKMethodResult33.setVariablesUsage(strMap48);
        cKMethodResult20.setVariablesUsage(strMap48);
        cKMethodResult4.setFieldUsage(strMap48);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(strMap48);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
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
        org.eclipse.jdt.core.dom.AnnotationTypeDeclaration annotationTypeDeclaration11 = null;
        boolean boolean12 = cKVisitor4.visit(annotationTypeDeclaration11);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getUniqueWordsQty();
        cKMethodResult4.setUniqueWordsQty((int) (byte) 100);
        cKMethodResult4.setStartLine((-1));
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult14 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int15 = cKMethodResult14.getComparisonsQty();
        cKMethodResult14.setReturnQty((int) (byte) -1);
        cKMethodResult14.setCboModified((int) (byte) 100);
        int int20 = cKMethodResult14.getFanout();
        int int21 = cKMethodResult14.getTryCatchQty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap22 = cKMethodResult14.getFieldUsage();
        cKMethodResult4.setVariablesUsage(strMap22);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(strMap22);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        cKMethodResult4.setLoc((int) (byte) 100);
        cKMethodResult4.setTryCatchQty((int) (byte) -1);
        int int9 = cKMethodResult4.getNumbersQty();
        int int10 = cKMethodResult4.getWmc();
        boolean boolean11 = cKMethodResult4.getIsVisible();
        int int12 = cKMethodResult4.getAssignmentsQty();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setStringLiteralsQty((-1));
        int int7 = cKClassResult4.getMaxNestedBlocks();
        float float8 = cKClassResult4.getLcomNormalized();
        java.lang.String str9 = cKClassResult4.toString();
        int int10 = cKClassResult4.getNosi();
        java.util.Set<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultSet11 = cKClassResult4.getMethods();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CKClassResult [file=, className=CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}]" + "'", str9, "CKClassResult [file=, className=CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(cKMethodResultSet11);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
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
        org.eclipse.jdt.core.dom.SwitchExpression switchExpression21 = null;
        boolean boolean22 = cKVisitor4.visit(switchExpression21);
        org.eclipse.jdt.core.dom.TextBlock textBlock23 = null;
        boolean boolean24 = cKVisitor4.visit(textBlock23);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getUniqueWordsQty();
        int int7 = cKClassResult4.getUniqueWordsQty();
        int int8 = cKClassResult4.getNumberOfStaticFields();
        int int9 = cKClassResult4.getNumberOfAbstractMethods();
        int int10 = cKClassResult4.getWmc();
        cKClassResult4.setNumberOfPublicFields(1);
        float float13 = cKClassResult4.getTightClassCohesion();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
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
        org.eclipse.jdt.core.dom.SingleVariableDeclaration singleVariableDeclaration15 = null;
        boolean boolean16 = cKVisitor4.visit(singleVariableDeclaration15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
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
        org.eclipse.jdt.core.dom.SynchronizedStatement synchronizedStatement21 = null;
        cKVisitor4.endVisit(synchronizedStatement21);
        org.eclipse.jdt.core.dom.RecordDeclaration recordDeclaration23 = null;
        boolean boolean24 = cKVisitor4.visit(recordDeclaration23);
        org.eclipse.jdt.core.dom.SingleVariableDeclaration singleVariableDeclaration25 = null;
        cKVisitor4.endVisit(singleVariableDeclaration25);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "hi!", "", (int) (byte) 1);
        int int5 = cKClassResult4.getTryCatchQty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
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
        org.eclipse.jdt.core.dom.AnnotationTypeDeclaration annotationTypeDeclaration15 = null;
        cKVisitor4.endVisit(annotationTypeDeclaration15);
        org.eclipse.jdt.core.dom.TextElement textElement17 = null;
        boolean boolean18 = cKVisitor4.visit(textElement17);
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit19 = null;
        boolean boolean20 = cKVisitor4.visit(compilationUnit19);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getNumberOfPublicFields();
        int int8 = cKClassResult4.getTryCatchQty();
        int int9 = cKClassResult4.getNumberOfSynchronizedMethods();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getStringLiteralsQty();
        cKClassResult4.setNumberOfFinalFields((int) (short) 0);
        int int10 = cKClassResult4.getNumberOfFinalMethods();
        cKClassResult4.setLoopQty((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
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
        org.eclipse.jdt.core.dom.WhileStatement whileStatement15 = null;
        boolean boolean16 = cKVisitor4.visit(whileStatement15);
        org.eclipse.jdt.core.dom.UsesDirective usesDirective17 = null;
        boolean boolean18 = cKVisitor4.visit(usesDirective17);
        org.eclipse.jdt.core.dom.ReturnStatement returnStatement19 = null;
        cKVisitor4.endVisit(returnStatement19);
        org.eclipse.jdt.core.dom.SynchronizedStatement synchronizedStatement21 = null;
        cKVisitor4.endVisit(synchronizedStatement21);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setStringLiteralsQty((int) (byte) 1);
        java.util.Optional<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultOptional8 = cKClassResult4.getMethod("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
        int int9 = cKClassResult4.getLoopQty();
        cKClassResult4.setLcom(100);
        int int12 = cKClassResult4.getAssignmentsQty();
        cKClassResult4.setNoc((int) (byte) 0);
        cKClassResult4.setLoc((int) (byte) -1);
        int int17 = cKClassResult4.getNumberOfPublicFields();
        org.junit.Assert.assertNotNull(cKMethodResultOptional8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getFanout();
        java.util.Set<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultSet8 = cKClassResult4.getVisibleMethods();
        cKClassResult4.setMathOperationsQty(0);
        int int11 = cKClassResult4.getLcom();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(cKMethodResultSet8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        int int6 = cKMethodResult4.getStringLiteralsQty();
        cKMethodResult4.setComparisonsQty(100);
        int int9 = cKMethodResult4.getWmc();
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
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
        org.eclipse.jdt.core.dom.CreationReference creationReference13 = null;
        boolean boolean14 = cKVisitor4.visit(creationReference13);
        org.eclipse.jdt.core.dom.BooleanLiteral booleanLiteral15 = null;
        cKVisitor4.endVisit(booleanLiteral15);
        org.eclipse.jdt.core.dom.ModuleDeclaration moduleDeclaration17 = null;
        boolean boolean18 = cKVisitor4.visit(moduleDeclaration17);
        org.eclipse.jdt.core.dom.ExpressionStatement expressionStatement19 = null;
        boolean boolean20 = cKVisitor4.visit(expressionStatement19);
        org.eclipse.jdt.core.dom.TypeParameter typeParameter21 = null;
        boolean boolean22 = cKVisitor4.visit(typeParameter21);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
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
        org.eclipse.jdt.core.dom.SingleMemberAnnotation singleMemberAnnotation13 = null;
        boolean boolean14 = cKVisitor4.visit(singleMemberAnnotation13);
        org.eclipse.jdt.core.dom.ReturnStatement returnStatement15 = null;
        cKVisitor4.endVisit(returnStatement15);
        org.eclipse.jdt.core.dom.Dimension dimension17 = null;
        cKVisitor4.endVisit(dimension17);
        org.eclipse.jdt.core.dom.SingleVariableDeclaration singleVariableDeclaration19 = null;
        boolean boolean20 = cKVisitor4.visit(singleVariableDeclaration19);
        org.eclipse.jdt.core.dom.Assignment assignment21 = null;
        cKVisitor4.endVisit(assignment21);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("hi!", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
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
        org.eclipse.jdt.core.dom.SwitchExpression switchExpression21 = null;
        cKVisitor4.endVisit(switchExpression21);
        org.eclipse.jdt.core.dom.ClassInstanceCreation classInstanceCreation23 = null;
        boolean boolean24 = cKVisitor4.visit(classInstanceCreation23);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setStringLiteralsQty((-1));
        int int7 = cKClassResult4.getCbo();
        java.util.Set<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultSet8 = cKClassResult4.getVisibleMethods();
        cKClassResult4.setComparisonsQty(1);
        int int11 = cKClassResult4.getRfc();
        int int12 = cKClassResult4.getAssignmentsQty();
        int int13 = cKClassResult4.getNumberOfSynchronizedMethods();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(cKMethodResultSet8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
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
        org.eclipse.jdt.core.dom.MemberRef memberRef13 = null;
        cKVisitor4.endVisit(memberRef13);
        org.eclipse.jdt.core.dom.AssertStatement assertStatement15 = null;
        boolean boolean16 = cKVisitor4.visit(assertStatement15);
        org.eclipse.jdt.core.dom.MemberValuePair memberValuePair17 = null;
        cKVisitor4.endVisit(memberValuePair17);
        org.eclipse.jdt.core.dom.MemberRef memberRef19 = null;
        cKVisitor4.endVisit(memberRef19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
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
        org.eclipse.jdt.core.dom.SynchronizedStatement synchronizedStatement13 = null;
        boolean boolean14 = cKVisitor4.visit(synchronizedStatement13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
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
        org.eclipse.jdt.core.dom.AnnotationTypeDeclaration annotationTypeDeclaration15 = null;
        boolean boolean16 = cKVisitor4.visit(annotationTypeDeclaration15);
        org.eclipse.jdt.core.dom.SimpleType simpleType17 = null;
        cKVisitor4.endVisit(simpleType17);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getLcom();
        cKClassResult4.setLcom((int) '#');
        cKClassResult4.setTightClassCohesion((float) '#');
        java.lang.String str12 = cKClassResult4.toString();
        int int13 = cKClassResult4.getNumberOfPrivateFields();
        float float14 = cKClassResult4.getLcomNormalized();
        int int15 = cKClassResult4.getNumberOfFinalFields();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "CKClassResult [file=, className=CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}]" + "'", str12, "CKClassResult [file=, className=CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setStringLiteralsQty((int) (byte) 1);
        java.util.Optional<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultOptional8 = cKClassResult4.getMethod("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
        cKClassResult4.setLooseClassCohesion((float) 10L);
        int int11 = cKClassResult4.getNumberOfPublicMethods();
        cKClassResult4.setNumberOfDefaultMethods((int) (short) 10);
        org.junit.Assert.assertNotNull(cKMethodResultOptional8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.ModuleQualifiedName moduleQualifiedName7 = null;
        boolean boolean8 = cKVisitor4.visit(moduleQualifiedName7);
        org.eclipse.jdt.core.dom.ASTNode aSTNode9 = null;
        cKVisitor4.postVisit(aSTNode9);
        org.eclipse.jdt.core.dom.NumberLiteral numberLiteral11 = null;
        cKVisitor4.endVisit(numberLiteral11);
        org.eclipse.jdt.core.dom.InstanceofExpression instanceofExpression13 = null;
        cKVisitor4.endVisit(instanceofExpression13);
        org.eclipse.jdt.core.dom.MemberValuePair memberValuePair15 = null;
        boolean boolean16 = cKVisitor4.visit(memberValuePair15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        java.util.Set<java.lang.String> strSet6 = cKMethodResult4.getMethodInvocationsLocal();
        java.util.Set<java.lang.String> strSet7 = cKMethodResult4.getFieldsAccessed();
        int int8 = cKMethodResult4.getComparisonsQty();
        int int9 = cKMethodResult4.getParametersQty();
        int int10 = cKMethodResult4.getReturnQty();
        int int11 = cKMethodResult4.getInnerClassesQty();
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
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
        org.eclipse.jdt.core.dom.MemberValuePair memberValuePair11 = null;
        boolean boolean12 = cKVisitor4.visit(memberValuePair11);
        org.eclipse.jdt.core.dom.Dimension dimension13 = null;
        boolean boolean14 = cKVisitor4.visit(dimension13);
        org.eclipse.jdt.core.dom.SuperFieldAccess superFieldAccess15 = null;
        cKVisitor4.endVisit(superFieldAccess15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
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
        org.eclipse.jdt.core.dom.ParameterizedType parameterizedType13 = null;
        cKVisitor4.endVisit(parameterizedType13);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression15 = null;
        cKVisitor4.endVisit(patternInstanceofExpression15);
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
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
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
        org.eclipse.jdt.core.dom.ArrayInitializer arrayInitializer17 = null;
        boolean boolean18 = cKVisitor4.visit(arrayInitializer17);
        org.eclipse.jdt.core.dom.SingleMemberAnnotation singleMemberAnnotation19 = null;
        boolean boolean20 = cKVisitor4.visit(singleMemberAnnotation19);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
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
        org.eclipse.jdt.core.dom.LineComment lineComment13 = null;
        cKVisitor4.endVisit(lineComment13);
        org.eclipse.jdt.core.dom.TryStatement tryStatement15 = null;
        cKVisitor4.endVisit(tryStatement15);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
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
        cKMethodResult14.setLogStatementsQty(1);
        cKMethodResult14.setLambdasQty(100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
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
        org.eclipse.jdt.core.dom.VariableDeclarationFragment variableDeclarationFragment13 = null;
        boolean boolean14 = cKVisitor4.visit(variableDeclarationFragment13);
        org.eclipse.jdt.core.dom.TextBlock textBlock15 = null;
        cKVisitor4.endVisit(textBlock15);
        org.eclipse.jdt.core.dom.Assignment assignment17 = null;
        boolean boolean18 = cKVisitor4.visit(assignment17);
        org.eclipse.jdt.core.dom.SimpleName simpleName19 = null;
        boolean boolean20 = cKVisitor4.visit(simpleName19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setAnonymousClassesQty((int) (byte) -1);
        int int7 = cKClassResult4.getNumberOfSynchronizedFields();
        cKClassResult4.setRfc((-1));
        int int10 = cKClassResult4.getNumberOfVisibleMethods();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getLcom();
        cKClassResult4.setLcom((int) '#');
        int int10 = cKClassResult4.getNumberOfPublicFields();
        int int11 = cKClassResult4.getNumberOfPublicMethods();
        cKClassResult4.setLcomNormalized((float) 100L);
        cKClassResult4.setTightClassCohesion((float) (short) 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
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
        org.eclipse.jdt.core.dom.ThisExpression thisExpression17 = null;
        boolean boolean18 = cKVisitor4.visit(thisExpression17);
        org.eclipse.jdt.core.dom.QualifiedType qualifiedType19 = null;
        cKVisitor4.endVisit(qualifiedType19);
        org.eclipse.jdt.core.dom.NormalAnnotation normalAnnotation21 = null;
        cKVisitor4.endVisit(normalAnnotation21);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
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
        org.eclipse.jdt.core.dom.ProvidesDirective providesDirective15 = null;
        cKVisitor4.endVisit(providesDirective15);
        org.eclipse.jdt.core.dom.ReturnStatement returnStatement17 = null;
        cKVisitor4.endVisit(returnStatement17);
        org.eclipse.jdt.core.dom.CreationReference creationReference19 = null;
        boolean boolean20 = cKVisitor4.visit(creationReference19);
        org.eclipse.jdt.core.dom.SimpleName simpleName21 = null;
        cKVisitor4.endVisit(simpleName21);
        org.eclipse.jdt.core.dom.UsesDirective usesDirective23 = null;
        boolean boolean24 = cKVisitor4.visit(usesDirective23);
        org.eclipse.jdt.core.dom.ArrayType arrayType25 = null;
        boolean boolean26 = cKVisitor4.visit(arrayType25);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
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
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit11 = null;
        boolean boolean12 = cKVisitor4.visit(compilationUnit11);
        org.eclipse.jdt.core.dom.ModuleDeclaration moduleDeclaration13 = null;
        cKVisitor4.endVisit(moduleDeclaration13);
        org.eclipse.jdt.core.dom.PostfixExpression postfixExpression15 = null;
        cKVisitor4.endVisit(postfixExpression15);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        cKClassResult4.setUniqueWordsQty((int) '#');
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult12 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet13 = cKMethodResult12.getMethodInvocations();
        java.util.Set<java.lang.String> strSet14 = cKMethodResult12.getMethodInvocationsLocal();
        cKMethodResult12.setCboModified(100);
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult21 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int22 = cKMethodResult21.getLambdasQty();
        java.util.Set<java.lang.String> strSet23 = cKMethodResult21.getMethodInvocations();
        cKMethodResult12.setMethodInvocations(strSet23);
        cKClassResult4.setFieldNames(strSet23);
        int int26 = cKClassResult4.getFanin();
        int int27 = cKClassResult4.getRfc();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(strSet14);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
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
        org.eclipse.jdt.core.dom.Modifier modifier15 = null;
        cKVisitor4.endVisit(modifier15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
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
        org.eclipse.jdt.core.dom.IntersectionType intersectionType21 = null;
        cKVisitor4.endVisit(intersectionType21);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getMaxNestedBlocks();
        int int6 = cKClassResult4.getMathOperationsQty();
        cKClassResult4.setNumberOfAbstractMethods(0);
        cKClassResult4.setNumberOfDefaultFields(1);
        cKClassResult4.setNumberOfAbstractMethods((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
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
        org.eclipse.jdt.core.dom.Modifier modifier11 = null;
        cKVisitor4.endVisit(modifier11);
        org.eclipse.jdt.core.dom.TryStatement tryStatement13 = null;
        cKVisitor4.endVisit(tryStatement13);
        org.eclipse.jdt.core.dom.TagElement tagElement15 = null;
        boolean boolean16 = cKVisitor4.visit(tagElement15);
        org.eclipse.jdt.core.dom.OpensDirective opensDirective17 = null;
        cKVisitor4.endVisit(opensDirective17);
        org.eclipse.jdt.core.dom.CastExpression castExpression19 = null;
        cKVisitor4.endVisit(castExpression19);
        org.eclipse.jdt.core.dom.MemberValuePair memberValuePair21 = null;
        cKVisitor4.endVisit(memberValuePair21);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setAnonymousClassesQty((int) (byte) -1);
        int int7 = cKClassResult4.getNumberOfSynchronizedFields();
        cKClassResult4.setAssignmentsQty((int) (byte) 1);
        cKClassResult4.setLcomNormalized((float) (short) 10);
        cKClassResult4.setNumberOfPrivateMethods((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
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
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation23 = null;
        cKVisitor4.endVisit(arrayCreation23);
        org.eclipse.jdt.core.dom.BreakStatement breakStatement25 = null;
        boolean boolean26 = cKVisitor4.visit(breakStatement25);
        org.eclipse.jdt.core.dom.CharacterLiteral characterLiteral27 = null;
        cKVisitor4.endVisit(characterLiteral27);
        org.eclipse.jdt.core.dom.RequiresDirective requiresDirective29 = null;
        cKVisitor4.endVisit(requiresDirective29);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        java.util.Set<java.lang.String> strSet6 = cKMethodResult4.getMethodInvocationsLocal();
        int int7 = cKMethodResult4.getWmc();
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit9 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable10 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable11 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor12 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit9, classLevelMetricListCallable10, methodLevelMetricListCallable11);
        org.eclipse.jdt.core.dom.ASTNode aSTNode13 = null;
        boolean boolean14 = cKVisitor12.preVisit2(aSTNode13);
        org.eclipse.jdt.core.dom.MethodInvocation methodInvocation15 = null;
        boolean boolean16 = cKVisitor12.visit(methodInvocation15);
        org.eclipse.jdt.core.dom.SwitchExpression switchExpression17 = null;
        cKVisitor12.endVisit(switchExpression17);
        org.eclipse.jdt.core.dom.SwitchExpression switchExpression19 = null;
        boolean boolean20 = cKVisitor12.visit(switchExpression19);
        org.eclipse.jdt.core.dom.ThisExpression thisExpression21 = null;
        cKVisitor12.endVisit(thisExpression21);
        org.eclipse.jdt.core.dom.MemberValuePair memberValuePair23 = null;
        boolean boolean24 = cKVisitor12.visit(memberValuePair23);
        boolean boolean25 = cKMethodResult4.equals((java.lang.Object) boolean24);
        cKMethodResult4.setWmc(52);
        int int28 = cKMethodResult4.getCbo();
        cKMethodResult4.setLambdasQty((int) (byte) 10);
        int int31 = cKMethodResult4.getRfc();
        cKMethodResult4.setComparisonsQty((int) (short) 10);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
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
        org.eclipse.jdt.core.dom.ThrowStatement throwStatement15 = null;
        cKVisitor4.endVisit(throwStatement15);
        org.eclipse.jdt.core.dom.ThisExpression thisExpression17 = null;
        cKVisitor4.endVisit(thisExpression17);
        org.eclipse.jdt.core.dom.CatchClause catchClause19 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(catchClause19);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
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
        org.eclipse.jdt.core.dom.DoStatement doStatement19 = null;
        boolean boolean20 = cKVisitor4.visit(doStatement19);
        org.eclipse.jdt.core.dom.TypeParameter typeParameter21 = null;
        boolean boolean22 = cKVisitor4.visit(typeParameter21);
        org.eclipse.jdt.core.dom.ExpressionMethodReference expressionMethodReference23 = null;
        boolean boolean24 = cKVisitor4.visit(expressionMethodReference23);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        float float5 = cKClassResult4.getTightClassCohesion();
        cKClassResult4.setDit(1);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getLcom();
        cKClassResult4.setLcom((int) '#');
        cKClassResult4.setDit(10);
        cKClassResult4.setFanout((int) '#');
        cKClassResult4.setNumberOfStaticMethods(0);
        int int16 = cKClassResult4.getUniqueWordsQty();
        cKClassResult4.setTryCatchQty((int) (byte) 100);
        int int19 = cKClassResult4.getVariablesQty();
        cKClassResult4.setStringLiteralsQty((int) (short) 10);
        int int22 = cKClassResult4.getLoopQty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        java.util.Set<java.lang.String> strSet6 = cKMethodResult4.getFieldsAccessed();
        int int7 = cKMethodResult4.getMaxNestedBlocks();
        java.util.Set<java.lang.String> strSet8 = cKMethodResult4.getMethodInvocationsLocal();
        int int9 = cKMethodResult4.getModifiers();
        int int10 = cKMethodResult4.getAssignmentsQty();
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(strSet8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getLcom();
        int int8 = cKClassResult4.getNumberOfFields();
        int int9 = cKClassResult4.getVariablesQty();
        java.lang.String str10 = cKClassResult4.getFile();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
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
        org.eclipse.jdt.core.dom.NumberLiteral numberLiteral15 = null;
        cKVisitor4.endVisit(numberLiteral15);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression17 = null;
        cKVisitor4.endVisit(patternInstanceofExpression17);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
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
        java.util.Optional<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultOptional20 = cKClassResult4.getMethod("CKClassResult [file=, className=CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}]");
        cKClassResult4.setMaxNestedBlocks(10);
        org.junit.Assert.assertNotNull(cKMethodResultOptional8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertNotNull(cKMethodResultOptional20);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
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
        org.eclipse.jdt.core.dom.TagElement tagElement17 = null;
        cKVisitor4.endVisit(tagElement17);
        org.eclipse.jdt.core.dom.TextBlock textBlock19 = null;
        cKVisitor4.endVisit(textBlock19);
        org.eclipse.jdt.core.dom.QualifiedType qualifiedType21 = null;
        boolean boolean22 = cKVisitor4.visit(qualifiedType21);
        org.eclipse.jdt.core.dom.SwitchExpression switchExpression23 = null;
        boolean boolean24 = cKVisitor4.visit(switchExpression23);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
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
        org.eclipse.jdt.core.dom.ArrayInitializer arrayInitializer17 = null;
        boolean boolean18 = cKVisitor4.visit(arrayInitializer17);
        org.eclipse.jdt.core.dom.SimpleType simpleType19 = null;
        cKVisitor4.endVisit(simpleType19);
        org.eclipse.jdt.core.dom.VariableDeclarationStatement variableDeclarationStatement21 = null;
        boolean boolean22 = cKVisitor4.visit(variableDeclarationStatement21);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setStringLiteralsQty((int) (byte) 1);
        java.util.Optional<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultOptional8 = cKClassResult4.getMethod("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
        cKClassResult4.setLooseClassCohesion((float) 10L);
        int int11 = cKClassResult4.getNumberOfPublicMethods();
        int int12 = cKClassResult4.getUniqueWordsQty();
        org.junit.Assert.assertNotNull(cKMethodResultOptional8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        java.util.Set<java.lang.String> strSet6 = cKMethodResult4.getMethodInvocationsLocal();
        cKMethodResult4.setHasJavadoc(false);
        java.util.Map<java.lang.String, java.util.Set<java.lang.String>> strMap9 = null;
        cKMethodResult4.setMethodInvocationsIndirectLocal(strMap9);
        int int11 = cKMethodResult4.getModifiers();
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        cKMethodResult4.setLoc((int) (byte) 100);
        cKMethodResult4.setTryCatchQty((int) (byte) -1);
        int int9 = cKMethodResult4.getNumbersQty();
        cKMethodResult4.setAnonymousClassesQty((int) '#');
        int int12 = cKMethodResult4.getModifiers();
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult17 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int18 = cKMethodResult17.getUniqueWordsQty();
        int int19 = cKMethodResult17.getAssignmentsQty();
        cKMethodResult17.setTryCatchQty((int) (byte) 0);
        java.lang.String str22 = cKMethodResult17.getMethodName();
        java.util.Map<java.lang.String, java.lang.Integer> strMap23 = null;
        cKMethodResult17.setVariablesUsage(strMap23);
        cKMethodResult17.setHasJavadoc(false);
        int int27 = cKMethodResult17.getLambdasQty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap28 = cKMethodResult17.getFieldUsage();
        cKMethodResult4.setFieldUsage(strMap28);
        cKMethodResult4.setAssignmentsQty((int) (byte) 1);
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult36 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int37 = cKMethodResult36.getUniqueWordsQty();
        int int38 = cKMethodResult36.getAssignmentsQty();
        cKMethodResult36.setTryCatchQty((int) (byte) 0);
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult45 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet46 = cKMethodResult45.getMethodInvocations();
        java.util.Set<java.lang.String> strSet47 = cKMethodResult45.getMethodInvocationsLocal();
        int int48 = cKMethodResult45.getLambdasQty();
        cKMethodResult45.setParenthesizedExpsQty((int) (short) -1);
        java.util.Set<java.lang.String> strSet51 = cKMethodResult45.getFieldsAccessed();
        cKMethodResult36.setMethodInvocationLocal(strSet51);
        cKMethodResult4.setMethodInvocations(strSet51);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(strSet46);
        org.junit.Assert.assertNull(strSet47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(strSet51);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getNumberOfPublicFields();
        cKClassResult4.setNosi((int) (byte) 1);
        cKClassResult4.setLoc((int) (byte) 100);
        cKClassResult4.setInnerClassesQty(0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
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
        org.eclipse.jdt.core.dom.VariableDeclarationFragment variableDeclarationFragment17 = null;
        boolean boolean18 = cKVisitor4.visit(variableDeclarationFragment17);
        org.eclipse.jdt.core.dom.InfixExpression infixExpression19 = null;
        boolean boolean20 = cKVisitor4.visit(infixExpression19);
        org.eclipse.jdt.core.dom.PrimitiveType primitiveType21 = null;
        cKVisitor4.endVisit(primitiveType21);
        org.eclipse.jdt.core.dom.InstanceofExpression instanceofExpression23 = null;
        cKVisitor4.endVisit(instanceofExpression23);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
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
        org.eclipse.jdt.core.dom.CastExpression castExpression21 = null;
        cKVisitor4.endVisit(castExpression21);
        org.eclipse.jdt.core.dom.InfixExpression infixExpression23 = null;
        cKVisitor4.endVisit(infixExpression23);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setAnonymousClassesQty((int) (byte) -1);
        int int7 = cKClassResult4.getNumberOfSynchronizedFields();
        cKClassResult4.setRfc((-1));
        int int10 = cKClassResult4.getNumberOfProtectedFields();
        int int11 = cKClassResult4.getComparisonsQty();
        cKClassResult4.setLooseClassCohesion((float) 10L);
        cKClassResult4.setLoc((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
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
        org.eclipse.jdt.core.dom.TypeDeclarationStatement typeDeclarationStatement16 = null;
        boolean boolean17 = cKVisitor4.visit(typeDeclarationStatement16);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(cKClassResultSet11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
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
        int int23 = cKClassResult4.getInnerClassesQty();
        cKClassResult4.setLambdasQty((int) (short) 100);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        cKClassResult4.setInnerClassesQty((int) (short) 100);
        cKClassResult4.setParenthesizedExpsQty((int) '4');
        cKClassResult4.setNumberOfPrivateMethods((int) '4');
        java.util.Optional<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultOptional13 = cKClassResult4.getMethod("");
        cKClassResult4.setLcom(0);
        int int16 = cKClassResult4.getTryCatchQty();
        cKClassResult4.setFanout((int) (short) -1);
        cKClassResult4.setReturnQty((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(cKMethodResultOptional13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
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
        org.eclipse.jdt.core.dom.IntersectionType intersectionType19 = null;
        cKVisitor4.endVisit(intersectionType19);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
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
        org.eclipse.jdt.core.dom.LineComment lineComment15 = null;
        cKVisitor4.endVisit(lineComment15);
        org.eclipse.jdt.core.dom.SingleMemberAnnotation singleMemberAnnotation17 = null;
        cKVisitor4.endVisit(singleMemberAnnotation17);
        org.eclipse.jdt.core.dom.ExpressionStatement expressionStatement19 = null;
        boolean boolean20 = cKVisitor4.visit(expressionStatement19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
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
        org.eclipse.jdt.core.dom.NumberLiteral numberLiteral15 = null;
        boolean boolean16 = cKVisitor4.visit(numberLiteral15);
        org.eclipse.jdt.core.dom.WildcardType wildcardType17 = null;
        cKVisitor4.endVisit(wildcardType17);
        org.eclipse.jdt.core.dom.ConstructorInvocation constructorInvocation19 = null;
        cKVisitor4.endVisit(constructorInvocation19);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        cKMethodResult4.setLoc((int) (byte) 100);
        cKMethodResult4.setTryCatchQty((int) (byte) -1);
        int int9 = cKMethodResult4.getNumbersQty();
        cKMethodResult4.setAnonymousClassesQty((int) '#');
        int int12 = cKMethodResult4.getModifiers();
        int int13 = cKMethodResult4.getFanin();
        int int14 = cKMethodResult4.getParametersQty();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getComparisonsQty();
        cKMethodResult4.setReturnQty((int) (byte) -1);
        boolean boolean8 = cKMethodResult4.getHasJavadoc();
        java.util.Map<java.lang.String, java.util.Set<java.lang.String>> strMap9 = null;
        cKMethodResult4.setMethodInvocationsIndirectLocal(strMap9);
        int int11 = cKMethodResult4.getLogStatementsQty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        cKMethodResult4.setLoc((int) (byte) 100);
        cKMethodResult4.setTryCatchQty((int) (byte) -1);
        int int9 = cKMethodResult4.getNumbersQty();
        cKMethodResult4.setAnonymousClassesQty((int) '#');
        int int12 = cKMethodResult4.getTryCatchQty();
        boolean boolean13 = cKMethodResult4.getIsVisible();
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult18 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int19 = cKMethodResult18.getComparisonsQty();
        cKMethodResult18.setReturnQty((int) (byte) -1);
        cKMethodResult18.setCboModified((int) (byte) 100);
        int int24 = cKMethodResult18.getFanout();
        int int25 = cKMethodResult18.getTryCatchQty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap26 = cKMethodResult18.getFieldUsage();
        cKMethodResult4.setVariablesUsage(strMap26);
        cKMethodResult4.setAssignmentsQty(100);
        cKMethodResult4.setComparisonsQty((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(strMap26);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
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
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression13 = null;
        boolean boolean14 = cKVisitor4.visit(parenthesizedExpression13);
        org.eclipse.jdt.core.dom.VariableDeclarationStatement variableDeclarationStatement15 = null;
        boolean boolean16 = cKVisitor4.visit(variableDeclarationStatement15);
        org.eclipse.jdt.core.dom.ThisExpression thisExpression17 = null;
        boolean boolean18 = cKVisitor4.visit(thisExpression17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
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
        org.eclipse.jdt.core.dom.CastExpression castExpression25 = null;
        boolean boolean26 = cKVisitor4.visit(castExpression25);
        org.eclipse.jdt.core.dom.YieldStatement yieldStatement27 = null;
        boolean boolean28 = cKVisitor4.visit(yieldStatement27);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getLcom();
        cKClassResult4.setLcom((int) '#');
        cKClassResult4.setTightClassCohesion((float) '#');
        int int12 = cKClassResult4.getCbo();
        int int13 = cKClassResult4.getNumberOfSynchronizedFields();
        int int14 = cKClassResult4.getNumberOfSynchronizedFields();
        int int15 = cKClassResult4.getVariablesQty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
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
        org.eclipse.jdt.core.dom.MethodRef methodRef11 = null;
        cKVisitor4.endVisit(methodRef11);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", true, 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap5 = cKMethodResult4.getVariablesUsage();
        cKMethodResult4.setReturnQty(10);
        int int8 = cKMethodResult4.getLoopQty();
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
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
        org.eclipse.jdt.core.dom.TypeMethodReference typeMethodReference27 = null;
        boolean boolean28 = cKVisitor4.visit(typeMethodReference27);
        org.eclipse.jdt.core.dom.TextElement textElement29 = null;
        cKVisitor4.endVisit(textElement29);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
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
        org.eclipse.jdt.core.dom.ArrayInitializer arrayInitializer17 = null;
        boolean boolean18 = cKVisitor4.visit(arrayInitializer17);
        org.eclipse.jdt.core.dom.SimpleType simpleType19 = null;
        cKVisitor4.endVisit(simpleType19);
        org.eclipse.jdt.core.dom.VariableDeclarationFragment variableDeclarationFragment21 = null;
        boolean boolean22 = cKVisitor4.visit(variableDeclarationFragment21);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getUniqueWordsQty();
        int int6 = cKMethodResult4.getNumbersQty();
        int int7 = cKMethodResult4.getVariablesQty();
        cKMethodResult4.setCboModified((int) (byte) 100);
        int int10 = cKMethodResult4.getLoc();
        java.lang.String str11 = cKMethodResult4.getMethodName();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
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
        org.eclipse.jdt.core.dom.ArrayInitializer arrayInitializer21 = null;
        boolean boolean22 = cKVisitor4.visit(arrayInitializer21);
        org.eclipse.jdt.core.dom.NameQualifiedType nameQualifiedType23 = null;
        boolean boolean24 = cKVisitor4.visit(nameQualifiedType23);
        org.eclipse.jdt.core.dom.PrefixExpression prefixExpression25 = null;
        boolean boolean26 = cKVisitor4.visit(prefixExpression25);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
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
        org.eclipse.jdt.core.dom.TextElement textElement17 = null;
        cKVisitor4.endVisit(textElement17);
        org.eclipse.jdt.core.dom.ClassInstanceCreation classInstanceCreation19 = null;
        cKVisitor4.endVisit(classInstanceCreation19);
        org.eclipse.jdt.core.dom.Modifier modifier21 = null;
        cKVisitor4.endVisit(modifier21);
        org.eclipse.jdt.core.dom.ConditionalExpression conditionalExpression23 = null;
        boolean boolean24 = cKVisitor4.visit(conditionalExpression23);
        java.util.Set<com.github.mauricioaniche.ck.CKClassResult> cKClassResultSet25 = cKVisitor4.getCollectedClasses();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(cKClassResultSet25);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getMaxNestedBlocks();
        int int6 = cKClassResult4.getMaxNestedBlocks();
        int int7 = cKClassResult4.getNumberOfPrivateMethods();
        cKClassResult4.setDit((int) 'a');
        int int10 = cKClassResult4.getMaxNestedBlocks();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getUniqueWordsQty();
        cKMethodResult4.setUniqueWordsQty((int) (byte) 100);
        cKMethodResult4.setStartLine((-1));
        int int10 = cKMethodResult4.getCboModified();
        int int11 = cKMethodResult4.getLogStatementsQty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getUniqueWordsQty();
        int int6 = cKMethodResult4.getAssignmentsQty();
        cKMethodResult4.setTryCatchQty((int) (byte) 0);
        java.lang.String str9 = cKMethodResult4.getMethodName();
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = null;
        cKMethodResult4.setVariablesUsage(strMap10);
        cKMethodResult4.setHasJavadoc(false);
        int int14 = cKMethodResult4.getLambdasQty();
        com.github.mauricioaniche.ck.CKClassResult cKClassResult19 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int20 = cKClassResult19.getNumberOfFinalFields();
        int int21 = cKClassResult19.getLoc();
        int int22 = cKClassResult19.getLcom();
        cKClassResult19.setLcom((int) '#');
        int int25 = cKClassResult19.getNumberOfPublicFields();
        cKClassResult19.setNumberOfProtectedFields((int) (short) 10);
        int int28 = cKClassResult19.getRfc();
        int int29 = cKClassResult19.getNumberOfPublicMethods();
        com.github.mauricioaniche.ck.CKClassResult cKClassResult34 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        float float35 = cKClassResult34.getTightClassCohesion();
        cKClassResult34.setAssignmentsQty((int) (short) -1);
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult42 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int43 = cKMethodResult42.getUniqueWordsQty();
        cKMethodResult42.setUniqueWordsQty((int) (byte) 10);
        cKMethodResult42.setAnonymousClassesQty((int) (short) 1);
        java.util.Set<java.lang.String> strSet48 = cKMethodResult42.getFieldsAccessed();
        cKClassResult34.setFieldNames(strSet48);
        cKClassResult19.setFieldNames(strSet48);
        cKMethodResult4.setMethodInvocations(strSet48);
        int int52 = cKMethodResult4.getLoopQty();
        boolean boolean53 = cKMethodResult4.getHasJavadoc();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 0.0f + "'", float35 == 0.0f);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(strSet48);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
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
        org.eclipse.jdt.core.dom.VariableDeclarationStatement variableDeclarationStatement13 = null;
        cKVisitor4.endVisit(variableDeclarationStatement13);
        org.eclipse.jdt.core.dom.ASTNode aSTNode15 = null;
        cKVisitor4.preVisit(aSTNode15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
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
        org.eclipse.jdt.core.dom.ClassInstanceCreation classInstanceCreation17 = null;
        boolean boolean18 = cKVisitor4.visit(classInstanceCreation17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.LambdaExpression lambdaExpression5 = null;
        cKVisitor4.endVisit(lambdaExpression5);
        org.eclipse.jdt.core.dom.ReturnStatement returnStatement7 = null;
        cKVisitor4.endVisit(returnStatement7);
        org.eclipse.jdt.core.dom.AssertStatement assertStatement9 = null;
        boolean boolean10 = cKVisitor4.visit(assertStatement9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setStringLiteralsQty((int) (byte) 1);
        int int7 = cKClassResult4.getNumberOfAbstractMethods();
        cKClassResult4.setLogStatementsQty(0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
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
        org.eclipse.jdt.core.dom.ExpressionMethodReference expressionMethodReference17 = null;
        cKVisitor4.endVisit(expressionMethodReference17);
        org.eclipse.jdt.core.dom.TypeMethodReference typeMethodReference19 = null;
        cKVisitor4.endVisit(typeMethodReference19);
        org.eclipse.jdt.core.dom.LabeledStatement labeledStatement21 = null;
        cKVisitor4.endVisit(labeledStatement21);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        cKMethodResult4.setLoc((int) (byte) 100);
        cKMethodResult4.setTryCatchQty((int) (byte) -1);
        int int9 = cKMethodResult4.getNumbersQty();
        cKMethodResult4.setAnonymousClassesQty((int) '#');
        int int12 = cKMethodResult4.getModifiers();
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult17 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int18 = cKMethodResult17.getUniqueWordsQty();
        int int19 = cKMethodResult17.getAssignmentsQty();
        cKMethodResult17.setTryCatchQty((int) (byte) 0);
        java.lang.String str22 = cKMethodResult17.getMethodName();
        java.util.Map<java.lang.String, java.lang.Integer> strMap23 = null;
        cKMethodResult17.setVariablesUsage(strMap23);
        cKMethodResult17.setHasJavadoc(false);
        int int27 = cKMethodResult17.getLambdasQty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap28 = cKMethodResult17.getFieldUsage();
        cKMethodResult4.setFieldUsage(strMap28);
        cKMethodResult4.setFanin((int) (short) -1);
        cKMethodResult4.setLoc((int) ' ');
        int int34 = cKMethodResult4.getCboModified();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.ModuleQualifiedName moduleQualifiedName7 = null;
        boolean boolean8 = cKVisitor4.visit(moduleQualifiedName7);
        org.eclipse.jdt.core.dom.RequiresDirective requiresDirective9 = null;
        boolean boolean10 = cKVisitor4.visit(requiresDirective9);
        org.eclipse.jdt.core.dom.CastExpression castExpression11 = null;
        cKVisitor4.endVisit(castExpression11);
        org.eclipse.jdt.core.dom.TypeMethodReference typeMethodReference13 = null;
        boolean boolean14 = cKVisitor4.visit(typeMethodReference13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setAnonymousClassesQty((int) (byte) -1);
        int int7 = cKClassResult4.getNumberOfSynchronizedFields();
        cKClassResult4.setAssignmentsQty((int) (byte) 1);
        int int10 = cKClassResult4.getRfc();
        cKClassResult4.setNumberOfDefaultFields(0);
        cKClassResult4.setNumberOfStaticFields(0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
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
        org.eclipse.jdt.core.dom.UsesDirective usesDirective19 = null;
        cKVisitor4.endVisit(usesDirective19);
        org.eclipse.jdt.core.dom.TextElement textElement21 = null;
        boolean boolean22 = cKVisitor4.visit(textElement21);
        org.eclipse.jdt.core.dom.VariableDeclarationExpression variableDeclarationExpression23 = null;
        cKVisitor4.endVisit(variableDeclarationExpression23);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
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
        org.eclipse.jdt.core.dom.QualifiedName qualifiedName11 = null;
        boolean boolean12 = cKVisitor4.visit(qualifiedName11);
        org.eclipse.jdt.core.dom.ExpressionMethodReference expressionMethodReference13 = null;
        cKVisitor4.endVisit(expressionMethodReference13);
        org.eclipse.jdt.core.dom.TryStatement tryStatement15 = null;
        boolean boolean16 = cKVisitor4.visit(tryStatement15);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression17 = null;
        cKVisitor4.endVisit(parenthesizedExpression17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getUniqueWordsQty();
        cKClassResult4.setAnonymousClassesQty(0);
        int int9 = cKClassResult4.getDit();
        int int10 = cKClassResult4.getNumberOfSynchronizedMethods();
        int int11 = cKClassResult4.getNumberOfSynchronizedFields();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
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
        org.eclipse.jdt.core.dom.ExpressionStatement expressionStatement23 = null;
        cKVisitor4.endVisit(expressionStatement23);
        org.eclipse.jdt.core.dom.ModuleDeclaration moduleDeclaration25 = null;
        cKVisitor4.endVisit(moduleDeclaration25);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        cKMethodResult4.setLoc((int) (byte) 100);
        cKMethodResult4.setTryCatchQty((int) (byte) -1);
        int int9 = cKMethodResult4.getNumbersQty();
        cKMethodResult4.setAnonymousClassesQty((int) '#');
        int int12 = cKMethodResult4.getModifiers();
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult17 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int18 = cKMethodResult17.getUniqueWordsQty();
        int int19 = cKMethodResult17.getAssignmentsQty();
        cKMethodResult17.setTryCatchQty((int) (byte) 0);
        java.lang.String str22 = cKMethodResult17.getMethodName();
        java.util.Map<java.lang.String, java.lang.Integer> strMap23 = null;
        cKMethodResult17.setVariablesUsage(strMap23);
        cKMethodResult17.setHasJavadoc(false);
        int int27 = cKMethodResult17.getLambdasQty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap28 = cKMethodResult17.getFieldUsage();
        cKMethodResult4.setFieldUsage(strMap28);
        int int30 = cKMethodResult4.getParenthesizedExpsQty();
        int int31 = cKMethodResult4.getReturnQty();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.EnumConstantDeclaration enumConstantDeclaration7 = null;
        cKVisitor4.endVisit(enumConstantDeclaration7);
        org.eclipse.jdt.core.dom.TypeParameter typeParameter9 = null;
        boolean boolean10 = cKVisitor4.visit(typeParameter9);
        org.eclipse.jdt.core.dom.ContinueStatement continueStatement11 = null;
        cKVisitor4.endVisit(continueStatement11);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getLcom();
        int int8 = cKClassResult4.getNumberOfFields();
        java.lang.String str9 = cKClassResult4.toString();
        int int10 = cKClassResult4.getMathOperationsQty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CKClassResult [file=, className=CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}]" + "'", str9, "CKClassResult [file=, className=CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
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
        org.eclipse.jdt.core.dom.ExportsDirective exportsDirective11 = null;
        boolean boolean12 = cKVisitor4.visit(exportsDirective11);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression13 = null;
        cKVisitor4.endVisit(patternInstanceofExpression13);
        org.eclipse.jdt.core.dom.WildcardType wildcardType15 = null;
        cKVisitor4.endVisit(wildcardType15);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
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
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression13 = null;
        cKVisitor4.endVisit(patternInstanceofExpression13);
        org.eclipse.jdt.core.dom.EnhancedForStatement enhancedForStatement15 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(enhancedForStatement15);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
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
        org.eclipse.jdt.core.dom.CharacterLiteral characterLiteral13 = null;
        boolean boolean14 = cKVisitor4.visit(characterLiteral13);
        org.eclipse.jdt.core.dom.TypeLiteral typeLiteral15 = null;
        cKVisitor4.endVisit(typeLiteral15);
        org.eclipse.jdt.core.dom.LineComment lineComment17 = null;
        cKVisitor4.endVisit(lineComment17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
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
        org.eclipse.jdt.core.dom.DoStatement doStatement11 = null;
        boolean boolean12 = cKVisitor4.visit(doStatement11);
        org.eclipse.jdt.core.dom.NormalAnnotation normalAnnotation13 = null;
        boolean boolean14 = cKVisitor4.visit(normalAnnotation13);
        org.eclipse.jdt.core.dom.SimpleType simpleType15 = null;
        cKVisitor4.endVisit(simpleType15);
        org.eclipse.jdt.core.dom.SuperConstructorInvocation superConstructorInvocation17 = null;
        boolean boolean18 = cKVisitor4.visit(superConstructorInvocation17);
        org.eclipse.jdt.core.dom.IfStatement ifStatement19 = null;
        boolean boolean20 = cKVisitor4.visit(ifStatement19);
        org.eclipse.jdt.core.dom.TagElement tagElement21 = null;
        cKVisitor4.endVisit(tagElement21);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getUniqueWordsQty();
        int int7 = cKClassResult4.getUniqueWordsQty();
        int int8 = cKClassResult4.getNumberOfStaticFields();
        int int9 = cKClassResult4.getNumberOfAbstractMethods();
        int int10 = cKClassResult4.getWmc();
        cKClassResult4.setNumberOfPublicFields(1);
        cKClassResult4.setNumberOfFinalFields((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
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
        org.eclipse.jdt.core.dom.InstanceofExpression instanceofExpression11 = null;
        boolean boolean12 = cKVisitor4.visit(instanceofExpression11);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation13 = null;
        boolean boolean14 = cKVisitor4.visit(arrayCreation13);
        org.eclipse.jdt.core.dom.RecordDeclaration recordDeclaration15 = null;
        boolean boolean16 = cKVisitor4.visit(recordDeclaration15);
        org.eclipse.jdt.core.dom.InfixExpression infixExpression17 = null;
        cKVisitor4.endVisit(infixExpression17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        cKClassResult4.setNumberOfStaticMethods(1);
        int int8 = cKClassResult4.getParenthesizedExpsQty();
        int int9 = cKClassResult4.getNosi();
        cKClassResult4.setInnerClassesQty((int) (byte) -1);
        cKClassResult4.setDit((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
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
        org.eclipse.jdt.core.dom.MethodRef methodRef21 = null;
        cKVisitor4.endVisit(methodRef21);
        org.eclipse.jdt.core.dom.VariableDeclarationExpression variableDeclarationExpression23 = null;
        cKVisitor4.endVisit(variableDeclarationExpression23);
        org.eclipse.jdt.core.dom.SimpleName simpleName25 = null;
        cKVisitor4.endVisit(simpleName25);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
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
        org.eclipse.jdt.core.dom.ExportsDirective exportsDirective13 = null;
        boolean boolean14 = cKVisitor4.visit(exportsDirective13);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation15 = null;
        boolean boolean16 = cKVisitor4.visit(arrayCreation15);
        org.eclipse.jdt.core.dom.ConditionalExpression conditionalExpression17 = null;
        boolean boolean18 = cKVisitor4.visit(conditionalExpression17);
        org.eclipse.jdt.core.dom.Assignment assignment19 = null;
        boolean boolean20 = cKVisitor4.visit(assignment19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("", "CKClassResult [file=, className=CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}]", false, (int) (byte) 1);
        cKMethodResult4.setCboModified((int) (short) 0);
        java.lang.String str7 = cKMethodResult4.getMethodName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "hi!", false, (int) (byte) 0);
        cKMethodResult4.setFanout(1);
        cKMethodResult4.setMathOperationsQty((int) (short) 1);
        java.util.Map<java.lang.String, java.util.Set<java.lang.String>> strMap9 = null;
        cKMethodResult4.setMethodInvocationsIndirectLocal(strMap9);
        cKMethodResult4.setInnerClassesQty((int) (short) 0);
        cKMethodResult4.setLambdasQty(0);
        cKMethodResult4.setCbo((int) (byte) 1);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
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
        org.eclipse.jdt.core.dom.SuperMethodInvocation superMethodInvocation15 = null;
        cKVisitor4.endVisit(superMethodInvocation15);
        org.eclipse.jdt.core.dom.ConstructorInvocation constructorInvocation17 = null;
        boolean boolean18 = cKVisitor4.visit(constructorInvocation17);
        org.eclipse.jdt.core.dom.AnnotationTypeMemberDeclaration annotationTypeMemberDeclaration19 = null;
        boolean boolean20 = cKVisitor4.visit(annotationTypeMemberDeclaration19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
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
        org.eclipse.jdt.core.dom.TypeParameter typeParameter23 = null;
        cKVisitor4.endVisit(typeParameter23);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
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
        org.eclipse.jdt.core.dom.CatchClause catchClause15 = null;
        boolean boolean16 = cKVisitor4.visit(catchClause15);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getLcom();
        cKClassResult4.setLcom((int) '#');
        cKClassResult4.setDit(10);
        float float12 = cKClassResult4.getLcomNormalized();
        int int13 = cKClassResult4.getFanin();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getMaxNestedBlocks();
        int int6 = cKClassResult4.getMathOperationsQty();
        cKClassResult4.setNumberOfAbstractMethods(0);
        cKClassResult4.setCboModified((int) (short) 1);
        cKClassResult4.setNumberOfAbstractMethods(10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
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
        org.eclipse.jdt.core.dom.AnnotationTypeDeclaration annotationTypeDeclaration17 = null;
        cKVisitor4.endVisit(annotationTypeDeclaration17);
        org.eclipse.jdt.core.dom.Assignment assignment19 = null;
        boolean boolean20 = cKVisitor4.visit(assignment19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getUniqueWordsQty();
        cKMethodResult4.setUniqueWordsQty((int) (byte) 100);
        cKMethodResult4.setStartLine((-1));
        int int10 = cKMethodResult4.getCboModified();
        int int11 = cKMethodResult4.getReturnQty();
        int int12 = cKMethodResult4.getReturnQty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
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
        org.eclipse.jdt.core.dom.SuperMethodInvocation superMethodInvocation15 = null;
        cKVisitor4.endVisit(superMethodInvocation15);
        org.eclipse.jdt.core.dom.SuperMethodReference superMethodReference17 = null;
        boolean boolean18 = cKVisitor4.visit(superMethodReference17);
        org.eclipse.jdt.core.dom.SwitchStatement switchStatement19 = null;
        boolean boolean20 = cKVisitor4.visit(switchStatement19);
        org.eclipse.jdt.core.dom.InstanceofExpression instanceofExpression21 = null;
        cKVisitor4.endVisit(instanceofExpression21);
        org.eclipse.jdt.core.dom.BreakStatement breakStatement23 = null;
        boolean boolean24 = cKVisitor4.visit(breakStatement23);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
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
        org.eclipse.jdt.core.dom.ExportsDirective exportsDirective13 = null;
        boolean boolean14 = cKVisitor4.visit(exportsDirective13);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation15 = null;
        boolean boolean16 = cKVisitor4.visit(arrayCreation15);
        org.eclipse.jdt.core.dom.AssertStatement assertStatement17 = null;
        boolean boolean18 = cKVisitor4.visit(assertStatement17);
        org.eclipse.jdt.core.dom.TypeParameter typeParameter19 = null;
        boolean boolean20 = cKVisitor4.visit(typeParameter19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
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
        org.eclipse.jdt.core.dom.MemberRef memberRef13 = null;
        cKVisitor4.endVisit(memberRef13);
        org.eclipse.jdt.core.dom.AssertStatement assertStatement15 = null;
        boolean boolean16 = cKVisitor4.visit(assertStatement15);
        org.eclipse.jdt.core.dom.MemberValuePair memberValuePair17 = null;
        cKVisitor4.endVisit(memberValuePair17);
        org.eclipse.jdt.core.dom.TypeMethodReference typeMethodReference19 = null;
        cKVisitor4.endVisit(typeMethodReference19);
        org.eclipse.jdt.core.dom.IfStatement ifStatement21 = null;
        boolean boolean22 = cKVisitor4.visit(ifStatement21);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        com.github.mauricioaniche.ck.CK cK3 = new com.github.mauricioaniche.ck.CK(true, 35, true);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
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
        org.eclipse.jdt.core.dom.DoStatement doStatement11 = null;
        boolean boolean12 = cKVisitor4.visit(doStatement11);
        org.eclipse.jdt.core.dom.LabeledStatement labeledStatement13 = null;
        cKVisitor4.endVisit(labeledStatement13);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
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
        org.eclipse.jdt.core.dom.UnionType unionType19 = null;
        cKVisitor4.endVisit(unionType19);
        org.eclipse.jdt.core.dom.DoStatement doStatement21 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(doStatement21);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
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
        org.eclipse.jdt.core.dom.AssertStatement assertStatement17 = null;
        cKVisitor4.endVisit(assertStatement17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
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
        org.eclipse.jdt.core.dom.MemberValuePair memberValuePair11 = null;
        boolean boolean12 = cKVisitor4.visit(memberValuePair11);
        org.eclipse.jdt.core.dom.MethodRef methodRef13 = null;
        cKVisitor4.endVisit(methodRef13);
        org.eclipse.jdt.core.dom.WildcardType wildcardType15 = null;
        cKVisitor4.endVisit(wildcardType15);
        org.eclipse.jdt.core.dom.VariableDeclarationExpression variableDeclarationExpression17 = null;
        boolean boolean18 = cKVisitor4.visit(variableDeclarationExpression17);
        org.eclipse.jdt.core.dom.QualifiedName qualifiedName19 = null;
        cKVisitor4.endVisit(qualifiedName19);
        org.eclipse.jdt.core.dom.StringLiteral stringLiteral21 = null;
        boolean boolean22 = cKVisitor4.visit(stringLiteral21);
        org.eclipse.jdt.core.dom.EmptyStatement emptyStatement23 = null;
        boolean boolean24 = cKVisitor4.visit(emptyStatement23);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.Block block7 = null;
        boolean boolean8 = cKVisitor4.visit(block7);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression9 = null;
        cKVisitor4.endVisit(parenthesizedExpression9);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.Dimension dimension9 = null;
        cKVisitor4.endVisit(dimension9);
        org.eclipse.jdt.core.dom.LineComment lineComment11 = null;
        boolean boolean12 = cKVisitor4.visit(lineComment11);
        org.eclipse.jdt.core.dom.SuperConstructorInvocation superConstructorInvocation13 = null;
        boolean boolean14 = cKVisitor4.visit(superConstructorInvocation13);
        org.eclipse.jdt.core.dom.UnionType unionType15 = null;
        boolean boolean16 = cKVisitor4.visit(unionType15);
        org.eclipse.jdt.core.dom.MethodRefParameter methodRefParameter17 = null;
        boolean boolean18 = cKVisitor4.visit(methodRefParameter17);
        org.eclipse.jdt.core.dom.TypeDeclarationStatement typeDeclarationStatement19 = null;
        boolean boolean20 = cKVisitor4.visit(typeDeclarationStatement19);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getUniqueWordsQty();
        int int6 = cKMethodResult4.getNumbersQty();
        int int7 = cKMethodResult4.getStartLine();
        int int8 = cKMethodResult4.getLoc();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
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
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation21 = null;
        boolean boolean22 = cKVisitor4.visit(arrayCreation21);
        org.eclipse.jdt.core.dom.StringLiteral stringLiteral23 = null;
        cKVisitor4.endVisit(stringLiteral23);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
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
        org.eclipse.jdt.core.dom.MemberRef memberRef13 = null;
        cKVisitor4.endVisit(memberRef13);
        org.eclipse.jdt.core.dom.AssertStatement assertStatement15 = null;
        boolean boolean16 = cKVisitor4.visit(assertStatement15);
        org.eclipse.jdt.core.dom.MemberValuePair memberValuePair17 = null;
        cKVisitor4.endVisit(memberValuePair17);
        org.eclipse.jdt.core.dom.InstanceofExpression instanceofExpression19 = null;
        cKVisitor4.endVisit(instanceofExpression19);
        org.eclipse.jdt.core.dom.CreationReference creationReference21 = null;
        cKVisitor4.endVisit(creationReference21);
        org.eclipse.jdt.core.dom.SuperMethodReference superMethodReference23 = null;
        boolean boolean24 = cKVisitor4.visit(superMethodReference23);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getComparisonsQty();
        java.lang.String str6 = cKMethodResult4.toString();
        int int7 = cKMethodResult4.getStringLiteralsQty();
        int int8 = cKMethodResult4.getStringLiteralsQty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}" + "'", str6, "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
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
        org.eclipse.jdt.core.dom.SuperFieldAccess superFieldAccess17 = null;
        cKVisitor4.endVisit(superFieldAccess17);
        org.eclipse.jdt.core.dom.CharacterLiteral characterLiteral19 = null;
        cKVisitor4.endVisit(characterLiteral19);
        org.eclipse.jdt.core.dom.WhileStatement whileStatement21 = null;
        boolean boolean22 = cKVisitor4.visit(whileStatement21);
        org.eclipse.jdt.core.dom.ContinueStatement continueStatement23 = null;
        boolean boolean24 = cKVisitor4.visit(continueStatement23);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
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
        org.eclipse.jdt.core.dom.ExpressionMethodReference expressionMethodReference13 = null;
        cKVisitor4.endVisit(expressionMethodReference13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
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
        org.eclipse.jdt.core.dom.Assignment assignment15 = null;
        boolean boolean16 = cKVisitor4.visit(assignment15);
        org.eclipse.jdt.core.dom.NameQualifiedType nameQualifiedType17 = null;
        boolean boolean18 = cKVisitor4.visit(nameQualifiedType17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("hi!", "hi!", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", 0);
        cKClassResult4.setVariablesQty((int) '4');
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
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
        org.eclipse.jdt.core.dom.ExportsDirective exportsDirective13 = null;
        boolean boolean14 = cKVisitor4.visit(exportsDirective13);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation15 = null;
        boolean boolean16 = cKVisitor4.visit(arrayCreation15);
        org.eclipse.jdt.core.dom.AssertStatement assertStatement17 = null;
        boolean boolean18 = cKVisitor4.visit(assertStatement17);
        org.eclipse.jdt.core.dom.MemberValuePair memberValuePair19 = null;
        cKVisitor4.endVisit(memberValuePair19);
        org.eclipse.jdt.core.dom.ASTNode aSTNode21 = null;
        boolean boolean22 = cKVisitor4.preVisit2(aSTNode21);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
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
        org.eclipse.jdt.core.dom.ReturnStatement returnStatement11 = null;
        boolean boolean12 = cKVisitor4.visit(returnStatement11);
        org.eclipse.jdt.core.dom.ModuleModifier moduleModifier13 = null;
        boolean boolean14 = cKVisitor4.visit(moduleModifier13);
        org.eclipse.jdt.core.dom.CatchClause catchClause15 = null;
        boolean boolean16 = cKVisitor4.visit(catchClause15);
        org.eclipse.jdt.core.dom.UnionType unionType17 = null;
        cKVisitor4.endVisit(unionType17);
        org.eclipse.jdt.core.dom.LineComment lineComment19 = null;
        boolean boolean20 = cKVisitor4.visit(lineComment19);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        cKClassResult4.setInnerClassesQty((int) (short) 100);
        cKClassResult4.setParenthesizedExpsQty((int) '4');
        cKClassResult4.setNumberOfPublicFields((int) (byte) 10);
        cKClassResult4.setNumbersQty(0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
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
        org.eclipse.jdt.core.dom.PostfixExpression postfixExpression31 = null;
        boolean boolean32 = cKVisitor4.visit(postfixExpression31);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getFanout();
        cKClassResult4.setNumberOfPublicMethods((int) (short) -1);
        java.util.Set<java.lang.String> strSet10 = cKClassResult4.getFieldNames();
        int int11 = cKClassResult4.getInnerClassesQty();
        cKClassResult4.setLogStatementsQty((int) (short) 100);
        cKClassResult4.setDit((-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(strSet10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
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
        org.eclipse.jdt.core.dom.CreationReference creationReference13 = null;
        boolean boolean14 = cKVisitor4.visit(creationReference13);
        org.eclipse.jdt.core.dom.UsesDirective usesDirective15 = null;
        cKVisitor4.endVisit(usesDirective15);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
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
        org.eclipse.jdt.core.dom.MarkerAnnotation markerAnnotation13 = null;
        cKVisitor4.endVisit(markerAnnotation13);
        org.eclipse.jdt.core.dom.ReturnStatement returnStatement15 = null;
        boolean boolean16 = cKVisitor4.visit(returnStatement15);
        org.eclipse.jdt.core.dom.MethodRefParameter methodRefParameter17 = null;
        boolean boolean18 = cKVisitor4.visit(methodRefParameter17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        float float5 = cKClassResult4.getTightClassCohesion();
        cKClassResult4.setAssignmentsQty((int) (short) -1);
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult12 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int13 = cKMethodResult12.getUniqueWordsQty();
        cKMethodResult12.setUniqueWordsQty((int) (byte) 10);
        cKMethodResult12.setAnonymousClassesQty((int) (short) 1);
        java.util.Set<java.lang.String> strSet18 = cKMethodResult12.getFieldsAccessed();
        cKClassResult4.setFieldNames(strSet18);
        cKClassResult4.setRfc((int) 'a');
        java.lang.String str22 = cKClassResult4.getType();
        int int23 = cKClassResult4.getNumberOfLogStatements();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}" + "'", str22, "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
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
        org.eclipse.jdt.core.dom.BooleanLiteral booleanLiteral19 = null;
        cKVisitor4.endVisit(booleanLiteral19);
        org.eclipse.jdt.core.dom.BlockComment blockComment21 = null;
        boolean boolean22 = cKVisitor4.visit(blockComment21);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getComparisonsQty();
        cKMethodResult4.setReturnQty((int) (byte) -1);
        cKMethodResult4.setCboModified((int) (byte) 100);
        java.util.Set<java.lang.String> strSet10 = cKMethodResult4.getFieldsAccessed();
        java.lang.String str11 = cKMethodResult4.getQualifiedMethodName();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
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
        org.eclipse.jdt.core.dom.PrefixExpression prefixExpression15 = null;
        cKVisitor4.endVisit(prefixExpression15);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getUniqueWordsQty();
        int int6 = cKMethodResult4.getNumbersQty();
        int int7 = cKMethodResult4.getStartLine();
        cKMethodResult4.setLambdasQty(100);
        int int10 = cKMethodResult4.getInnerClassesQty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
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
        org.eclipse.jdt.core.dom.UsesDirective usesDirective13 = null;
        boolean boolean14 = cKVisitor4.visit(usesDirective13);
        org.eclipse.jdt.core.dom.AnnotationTypeMemberDeclaration annotationTypeMemberDeclaration15 = null;
        boolean boolean16 = cKVisitor4.visit(annotationTypeMemberDeclaration15);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
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
        org.eclipse.jdt.core.dom.WildcardType wildcardType25 = null;
        boolean boolean26 = cKVisitor4.visit(wildcardType25);
        org.eclipse.jdt.core.dom.ModuleQualifiedName moduleQualifiedName27 = null;
        boolean boolean28 = cKVisitor4.visit(moduleQualifiedName27);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        float float5 = cKClassResult4.getTightClassCohesion();
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult10 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet11 = cKMethodResult10.getMethodInvocations();
        int int12 = cKMethodResult10.getStringLiteralsQty();
        cKMethodResult10.setWmc((int) (byte) 10);
        cKClassResult4.addMethod(cKMethodResult10);
        cKClassResult4.setLcomNormalized((float) (byte) -1);
        int int18 = cKClassResult4.getNumberOfLogStatements();
        int int19 = cKClassResult4.getMaxNestedBlocks();
        cKClassResult4.setLcomNormalized((float) (short) 0);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setStringLiteralsQty((int) (byte) 1);
        java.util.Optional<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultOptional8 = cKClassResult4.getMethod("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
        cKClassResult4.setReturnQty((int) '4');
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult15 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet16 = cKMethodResult15.getMethodInvocations();
        java.util.Set<java.lang.String> strSet17 = cKMethodResult15.getFieldsAccessed();
        java.util.Set<java.lang.String> strSet18 = cKMethodResult15.getMethodInvocations();
        cKClassResult4.setFieldNames(strSet18);
        int int20 = cKClassResult4.getNumberOfDefaultMethods();
        int int21 = cKClassResult4.getNumberOfPublicMethods();
        cKClassResult4.setNumberOfProtectedFields((int) (byte) 0);
        org.junit.Assert.assertNotNull(cKMethodResultOptional8);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
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
        org.eclipse.jdt.core.dom.RecordDeclaration recordDeclaration11 = null;
        cKVisitor4.endVisit(recordDeclaration11);
        org.eclipse.jdt.core.dom.FieldDeclaration fieldDeclaration13 = null;
        cKVisitor4.endVisit(fieldDeclaration13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        cKClassResult4.setFanout((int) 'a');
        java.lang.String str8 = cKClassResult4.getType();
        cKClassResult4.setMaxNestedBlocks((int) (short) 100);
        int int11 = cKClassResult4.getRfc();
        int int12 = cKClassResult4.getNumberOfProtectedFields();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}" + "'", str8, "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setAnonymousClassesQty((int) (byte) -1);
        int int7 = cKClassResult4.getNumberOfSynchronizedFields();
        cKClassResult4.setRfc((-1));
        cKClassResult4.setNumberOfFields(10);
        cKClassResult4.setNumberOfPublicFields(0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getUniqueWordsQty();
        cKClassResult4.setAnonymousClassesQty(0);
        int int9 = cKClassResult4.getNumberOfPrivateFields();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
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
        org.eclipse.jdt.core.dom.LineComment lineComment15 = null;
        boolean boolean16 = cKVisitor4.visit(lineComment15);
        org.eclipse.jdt.core.dom.NormalAnnotation normalAnnotation17 = null;
        boolean boolean18 = cKVisitor4.visit(normalAnnotation17);
        org.eclipse.jdt.core.dom.MethodRef methodRef19 = null;
        cKVisitor4.endVisit(methodRef19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
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
        cKClassResult4.setLcomNormalized((float) 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(strSet14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        cKMethodResult4.setLoc((int) (byte) 100);
        cKMethodResult4.setTryCatchQty((int) (byte) -1);
        int int9 = cKMethodResult4.getNumbersQty();
        cKMethodResult4.setAnonymousClassesQty((int) '#');
        int int12 = cKMethodResult4.getModifiers();
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult17 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int18 = cKMethodResult17.getUniqueWordsQty();
        int int19 = cKMethodResult17.getAssignmentsQty();
        cKMethodResult17.setTryCatchQty((int) (byte) 0);
        java.lang.String str22 = cKMethodResult17.getMethodName();
        java.util.Map<java.lang.String, java.lang.Integer> strMap23 = null;
        cKMethodResult17.setVariablesUsage(strMap23);
        cKMethodResult17.setHasJavadoc(false);
        int int27 = cKMethodResult17.getLambdasQty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap28 = cKMethodResult17.getFieldUsage();
        cKMethodResult4.setFieldUsage(strMap28);
        java.util.Map<java.lang.String, java.util.Set<java.lang.String>> strMap30 = cKMethodResult4.getMethodInvocationsIndirectLocal();
        cKMethodResult4.setCboModified(35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNull(strMap30);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getFanout();
        java.util.Set<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultSet8 = cKClassResult4.getVisibleMethods();
        cKClassResult4.setLambdasQty(10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(cKMethodResultSet8);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getLcom();
        cKClassResult4.setLcom((int) '#');
        cKClassResult4.setTightClassCohesion((float) '#');
        int int12 = cKClassResult4.getCbo();
        int int13 = cKClassResult4.getNumberOfSynchronizedFields();
        cKClassResult4.setLambdasQty(100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
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
        org.eclipse.jdt.core.dom.ModuleDeclaration moduleDeclaration17 = null;
        boolean boolean18 = cKVisitor4.visit(moduleDeclaration17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getUniqueWordsQty();
        cKMethodResult4.setUniqueWordsQty((int) (byte) 10);
        int int8 = cKMethodResult4.getLogStatementsQty();
        boolean boolean9 = cKMethodResult4.isConstructor();
        int int10 = cKMethodResult4.getMathOperationsQty();
        boolean boolean11 = cKMethodResult4.isConstructor();
        cKMethodResult4.setTryCatchQty((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=10, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getUniqueWordsQty();
        cKMethodResult4.setUniqueWordsQty((int) (byte) 100);
        cKMethodResult4.setStartLine((-1));
        int int10 = cKMethodResult4.getParenthesizedExpsQty();
        cKMethodResult4.setTryCatchQty((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.ModuleQualifiedName moduleQualifiedName7 = null;
        boolean boolean8 = cKVisitor4.visit(moduleQualifiedName7);
        org.eclipse.jdt.core.dom.ASTNode aSTNode9 = null;
        cKVisitor4.postVisit(aSTNode9);
        org.eclipse.jdt.core.dom.ContinueStatement continueStatement11 = null;
        cKVisitor4.endVisit(continueStatement11);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
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
        org.eclipse.jdt.core.dom.ThisExpression thisExpression17 = null;
        cKVisitor4.endVisit(thisExpression17);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
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
        org.eclipse.jdt.core.dom.MemberValuePair memberValuePair11 = null;
        boolean boolean12 = cKVisitor4.visit(memberValuePair11);
        org.eclipse.jdt.core.dom.MethodRef methodRef13 = null;
        cKVisitor4.endVisit(methodRef13);
        org.eclipse.jdt.core.dom.WildcardType wildcardType15 = null;
        cKVisitor4.endVisit(wildcardType15);
        org.eclipse.jdt.core.dom.VariableDeclarationExpression variableDeclarationExpression17 = null;
        boolean boolean18 = cKVisitor4.visit(variableDeclarationExpression17);
        org.eclipse.jdt.core.dom.QualifiedName qualifiedName19 = null;
        cKVisitor4.endVisit(qualifiedName19);
        org.eclipse.jdt.core.dom.StringLiteral stringLiteral21 = null;
        boolean boolean22 = cKVisitor4.visit(stringLiteral21);
        org.eclipse.jdt.core.dom.StringLiteral stringLiteral23 = null;
        cKVisitor4.endVisit(stringLiteral23);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
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
        org.eclipse.jdt.core.dom.LineComment lineComment13 = null;
        cKVisitor4.endVisit(lineComment13);
        org.eclipse.jdt.core.dom.IntersectionType intersectionType15 = null;
        cKVisitor4.endVisit(intersectionType15);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
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
        org.eclipse.jdt.core.dom.RequiresDirective requiresDirective21 = null;
        cKVisitor4.endVisit(requiresDirective21);
        org.eclipse.jdt.core.dom.ExpressionStatement expressionStatement23 = null;
        boolean boolean24 = cKVisitor4.visit(expressionStatement23);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
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
        org.eclipse.jdt.core.dom.ArrayAccess arrayAccess19 = null;
        boolean boolean20 = cKVisitor4.visit(arrayAccess19);
        org.eclipse.jdt.core.dom.TextElement textElement21 = null;
        boolean boolean22 = cKVisitor4.visit(textElement21);
        org.eclipse.jdt.core.dom.TypeDeclarationStatement typeDeclarationStatement23 = null;
        cKVisitor4.endVisit(typeDeclarationStatement23);
        org.eclipse.jdt.core.dom.NameQualifiedType nameQualifiedType25 = null;
        boolean boolean26 = cKVisitor4.visit(nameQualifiedType25);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        java.util.Set<java.lang.String> strSet6 = cKMethodResult4.getMethodInvocationsLocal();
        java.util.Set<java.lang.String> strSet7 = cKMethodResult4.getFieldsAccessed();
        int int8 = cKMethodResult4.getComparisonsQty();
        cKMethodResult4.setLoc((-1));
        cKMethodResult4.setFanin((int) (byte) 1);
        int int13 = cKMethodResult4.getWmc();
        int int14 = cKMethodResult4.getModifiers();
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        java.util.Set<java.lang.String> strSet6 = cKMethodResult4.getMethodInvocationsLocal();
        int int7 = cKMethodResult4.getLambdasQty();
        cKMethodResult4.setParenthesizedExpsQty((int) (short) -1);
        int int10 = cKMethodResult4.getModifiers();
        cKMethodResult4.setReturnQty(100);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
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
        org.eclipse.jdt.core.dom.TypeMethodReference typeMethodReference23 = null;
        cKVisitor4.endVisit(typeMethodReference23);
        org.eclipse.jdt.core.dom.LineComment lineComment25 = null;
        cKVisitor4.endVisit(lineComment25);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
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
        org.eclipse.jdt.core.dom.TextBlock textBlock19 = null;
        cKVisitor4.endVisit(textBlock19);
        org.eclipse.jdt.core.dom.SwitchStatement switchStatement21 = null;
        boolean boolean22 = cKVisitor4.visit(switchStatement21);
        org.eclipse.jdt.core.dom.AnnotationTypeDeclaration annotationTypeDeclaration23 = null;
        boolean boolean24 = cKVisitor4.visit(annotationTypeDeclaration23);
        org.eclipse.jdt.core.dom.MemberRef memberRef25 = null;
        boolean boolean26 = cKVisitor4.visit(memberRef25);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
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
        org.eclipse.jdt.core.dom.Modifier modifier11 = null;
        cKVisitor4.endVisit(modifier11);
        org.eclipse.jdt.core.dom.InfixExpression infixExpression13 = null;
        boolean boolean14 = cKVisitor4.visit(infixExpression13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getUniqueWordsQty();
        int int7 = cKClassResult4.getUniqueWordsQty();
        int int8 = cKClassResult4.getNumberOfStaticFields();
        cKClassResult4.setLooseClassCohesion(0.0f);
        cKClassResult4.setNoc((int) ' ');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKClassResult [file=, className=CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}]", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.SwitchCase switchCase5 = null;
        boolean boolean6 = cKVisitor4.visit(switchCase5);
        org.eclipse.jdt.core.dom.FieldAccess fieldAccess7 = null;
        boolean boolean8 = cKVisitor4.visit(fieldAccess7);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        java.util.Set<java.lang.String> strSet6 = cKMethodResult4.getMethodInvocationsLocal();
        java.util.Set<java.lang.String> strSet7 = cKMethodResult4.getFieldsAccessed();
        java.lang.String str8 = cKMethodResult4.getQualifiedMethodName();
        int int9 = cKMethodResult4.getRfc();
        int int10 = cKMethodResult4.getModifiers();
        cKMethodResult4.setStringLiteralsQty((int) (short) 10);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
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
        org.eclipse.jdt.core.dom.PrefixExpression prefixExpression17 = null;
        boolean boolean18 = cKVisitor4.visit(prefixExpression17);
        org.eclipse.jdt.core.dom.FieldAccess fieldAccess19 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(fieldAccess19);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getUniqueWordsQty();
        cKMethodResult4.setUniqueWordsQty((int) (byte) 10);
        int int8 = cKMethodResult4.getLogStatementsQty();
        int int9 = cKMethodResult4.getCbo();
        cKMethodResult4.setParenthesizedExpsQty((int) (short) 100);
        int int12 = cKMethodResult4.getFanout();
        cKMethodResult4.setComparisonsQty((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getMathOperationsQty();
        int int6 = cKMethodResult4.getRfc();
        int int7 = cKMethodResult4.getCbo();
        int int8 = cKMethodResult4.getParenthesizedExpsQty();
        cKMethodResult4.setMaxNestedBlocks((int) 'a');
        java.lang.String str11 = cKMethodResult4.getQualifiedMethodName();
        int int12 = cKMethodResult4.getRfc();
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = cKMethodResult4.getFieldUsage();
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = cKMethodResult4.getVariablesUsage();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getNumberOfFinalFields();
        cKClassResult4.setTightClassCohesion((float) (byte) 100);
        int int10 = cKClassResult4.getInnerClassesQty();
        cKClassResult4.setTightClassCohesion((-1.0f));
        java.util.Optional<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultOptional14 = cKClassResult4.getMethod("CKMethodResult{cbo=10, rfc=0, wmc=0, methodName='hi!'}");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(cKMethodResultOptional14);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.Dimension dimension9 = null;
        cKVisitor4.endVisit(dimension9);
        org.eclipse.jdt.core.dom.LineComment lineComment11 = null;
        boolean boolean12 = cKVisitor4.visit(lineComment11);
        org.eclipse.jdt.core.dom.SuperConstructorInvocation superConstructorInvocation13 = null;
        boolean boolean14 = cKVisitor4.visit(superConstructorInvocation13);
        org.eclipse.jdt.core.dom.BreakStatement breakStatement15 = null;
        boolean boolean16 = cKVisitor4.visit(breakStatement15);
        org.eclipse.jdt.core.dom.SingleMemberAnnotation singleMemberAnnotation17 = null;
        cKVisitor4.endVisit(singleMemberAnnotation17);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
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
        org.eclipse.jdt.core.dom.ExportsDirective exportsDirective19 = null;
        cKVisitor4.endVisit(exportsDirective19);
        org.eclipse.jdt.core.dom.TryStatement tryStatement21 = null;
        boolean boolean22 = cKVisitor4.visit(tryStatement21);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
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
        org.eclipse.jdt.core.dom.CharacterLiteral characterLiteral21 = null;
        cKVisitor4.endVisit(characterLiteral21);
        org.eclipse.jdt.core.dom.CreationReference creationReference23 = null;
        boolean boolean24 = cKVisitor4.visit(creationReference23);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getNumberOfFinalFields();
        java.util.Set<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultSet8 = cKClassResult4.getMethods();
        int int9 = cKClassResult4.getNumberOfFinalFields();
        int int10 = cKClassResult4.getNumberOfLogStatements();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(cKMethodResultSet8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
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
        org.eclipse.jdt.core.dom.InfixExpression infixExpression17 = null;
        boolean boolean18 = cKVisitor4.visit(infixExpression17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getUniqueWordsQty();
        cKMethodResult4.setUniqueWordsQty((int) (byte) 10);
        int int8 = cKMethodResult4.getMathOperationsQty();
        int int9 = cKMethodResult4.getLoc();
        int int10 = cKMethodResult4.getStringLiteralsQty();
        cKMethodResult4.setComparisonsQty((int) ' ');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
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
        org.eclipse.jdt.core.dom.LineComment lineComment15 = null;
        boolean boolean16 = cKVisitor4.visit(lineComment15);
        org.eclipse.jdt.core.dom.ArrayAccess arrayAccess17 = null;
        boolean boolean18 = cKVisitor4.visit(arrayAccess17);
        org.eclipse.jdt.core.dom.EnhancedForStatement enhancedForStatement19 = null;
        boolean boolean20 = cKVisitor4.visit(enhancedForStatement19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
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
        org.eclipse.jdt.core.dom.VariableDeclarationStatement variableDeclarationStatement17 = null;
        cKVisitor4.endVisit(variableDeclarationStatement17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        java.util.Set<java.lang.String> strSet6 = cKMethodResult4.getMethodInvocationsLocal();
        java.util.Set<java.lang.String> strSet7 = cKMethodResult4.getFieldsAccessed();
        int int8 = cKMethodResult4.getComparisonsQty();
        int int9 = cKMethodResult4.getFanout();
        cKMethodResult4.setStartLine(52);
        int int12 = cKMethodResult4.getWmc();
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
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
        org.eclipse.jdt.core.dom.IfStatement ifStatement13 = null;
        boolean boolean14 = cKVisitor4.visit(ifStatement13);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getLambdasQty();
        java.util.Map<java.lang.String, java.util.Set<java.lang.String>> strMap6 = cKMethodResult4.getMethodInvocationsIndirectLocal();
        cKMethodResult4.setComparisonsQty(52);
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult13 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        cKMethodResult13.setLoc((int) (byte) 100);
        cKMethodResult13.setTryCatchQty((int) (byte) -1);
        int int18 = cKMethodResult13.getNumbersQty();
        cKMethodResult13.setAnonymousClassesQty((int) '#');
        int int21 = cKMethodResult13.getModifiers();
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult26 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int27 = cKMethodResult26.getUniqueWordsQty();
        cKMethodResult26.setUniqueWordsQty((int) (byte) 10);
        cKMethodResult26.setAnonymousClassesQty((int) (short) 1);
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult36 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet37 = cKMethodResult36.getMethodInvocations();
        cKMethodResult26.setMethodInvocationLocal(strSet37);
        cKMethodResult26.setAssignmentsQty((int) (byte) -1);
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult45 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "hi!", false, (int) (byte) 0);
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult50 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int51 = cKMethodResult50.getLambdasQty();
        java.util.Set<java.lang.String> strSet52 = cKMethodResult50.getMethodInvocations();
        cKMethodResult45.setMethodInvocations(strSet52);
        cKMethodResult26.setMethodInvocations(strSet52);
        cKMethodResult13.setMethodInvocations(strSet52);
        cKMethodResult4.setMethodInvocations(strSet52);
        int int57 = cKMethodResult4.getLoopQty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(strSet37);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(strSet52);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
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
        org.eclipse.jdt.core.dom.ASTNode aSTNode23 = null;
        cKVisitor4.preVisit(aSTNode23);
        org.eclipse.jdt.core.dom.QualifiedName qualifiedName25 = null;
        cKVisitor4.endVisit(qualifiedName25);
        org.eclipse.jdt.core.dom.BreakStatement breakStatement27 = null;
        cKVisitor4.endVisit(breakStatement27);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
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
        org.eclipse.jdt.core.dom.SuperConstructorInvocation superConstructorInvocation21 = null;
        boolean boolean22 = cKVisitor4.visit(superConstructorInvocation21);
        org.eclipse.jdt.core.dom.Initializer initializer23 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = cKVisitor4.visit(initializer23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getInnerClassesQty();
        cKClassResult4.setLogStatementsQty(0);
        int int8 = cKClassResult4.getDit();
        int int9 = cKClassResult4.getModifiers();
        int int10 = cKClassResult4.getRfc();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
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
        org.eclipse.jdt.core.dom.AssertStatement assertStatement15 = null;
        cKVisitor4.endVisit(assertStatement15);
        org.eclipse.jdt.core.dom.PackageDeclaration packageDeclaration17 = null;
        boolean boolean18 = cKVisitor4.visit(packageDeclaration17);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        cKClassResult4.setRfc(0);
        cKClassResult4.setNumberOfDefaultFields(0);
        cKClassResult4.setLcomNormalized(0.0f);
        int int12 = cKClassResult4.getWmc();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        java.util.Set<java.lang.String> strSet6 = cKMethodResult4.getMethodInvocationsLocal();
        int int7 = cKMethodResult4.getLambdasQty();
        cKMethodResult4.setLambdasQty((int) (short) -1);
        cKMethodResult4.setFanin((int) (short) 100);
        cKMethodResult4.setLogStatementsQty((int) '#');
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
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
        org.eclipse.jdt.core.dom.WildcardType wildcardType13 = null;
        boolean boolean14 = cKVisitor4.visit(wildcardType13);
        org.eclipse.jdt.core.dom.IfStatement ifStatement15 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(ifStatement15);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
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
        org.eclipse.jdt.core.dom.TryStatement tryStatement13 = null;
        boolean boolean14 = cKVisitor4.visit(tryStatement13);
        org.eclipse.jdt.core.dom.LineComment lineComment15 = null;
        cKVisitor4.endVisit(lineComment15);
        org.eclipse.jdt.core.dom.QualifiedType qualifiedType17 = null;
        boolean boolean18 = cKVisitor4.visit(qualifiedType17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
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
        org.eclipse.jdt.core.dom.MemberValuePair memberValuePair11 = null;
        cKVisitor4.endVisit(memberValuePair11);
        org.eclipse.jdt.core.dom.FieldAccess fieldAccess13 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(fieldAccess13);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
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
        org.eclipse.jdt.core.dom.MemberValuePair memberValuePair21 = null;
        boolean boolean22 = cKVisitor4.visit(memberValuePair21);
        org.eclipse.jdt.core.dom.AssertStatement assertStatement23 = null;
        boolean boolean24 = cKVisitor4.visit(assertStatement23);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getNumberOfFinalFields();
        int int8 = cKClassResult4.getLcom();
        int int9 = cKClassResult4.getStringLiteralsQty();
        int int10 = cKClassResult4.getLcom();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
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
        org.eclipse.jdt.core.dom.ModuleModifier moduleModifier19 = null;
        boolean boolean20 = cKVisitor4.visit(moduleModifier19);
        org.eclipse.jdt.core.dom.ConstructorInvocation constructorInvocation21 = null;
        cKVisitor4.endVisit(constructorInvocation21);
        org.eclipse.jdt.core.dom.FieldDeclaration fieldDeclaration23 = null;
        cKVisitor4.endVisit(fieldDeclaration23);
        org.eclipse.jdt.core.dom.AnonymousClassDeclaration anonymousClassDeclaration25 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(anonymousClassDeclaration25);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getLcom();
        cKClassResult4.setLcom((int) '#');
        cKClassResult4.setTightClassCohesion((float) '#');
        java.lang.String str12 = cKClassResult4.toString();
        int int13 = cKClassResult4.getNosi();
        cKClassResult4.setNumberOfPrivateFields(35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "CKClassResult [file=, className=CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}]" + "'", str12, "CKClassResult [file=, className=CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
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
        org.eclipse.jdt.core.dom.AssertStatement assertStatement23 = null;
        cKVisitor4.endVisit(assertStatement23);
        org.eclipse.jdt.core.dom.FieldDeclaration fieldDeclaration25 = null;
        boolean boolean26 = cKVisitor4.visit(fieldDeclaration25);
        org.eclipse.jdt.core.dom.ModuleDeclaration moduleDeclaration27 = null;
        cKVisitor4.endVisit(moduleDeclaration27);
        org.eclipse.jdt.core.dom.MemberValuePair memberValuePair29 = null;
        boolean boolean30 = cKVisitor4.visit(memberValuePair29);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
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
        org.eclipse.jdt.core.dom.UnionType unionType11 = null;
        cKVisitor4.endVisit(unionType11);
        org.eclipse.jdt.core.dom.YieldStatement yieldStatement13 = null;
        cKVisitor4.endVisit(yieldStatement13);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
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
        int int21 = cKClassResult4.getNumberOfSynchronizedFields();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
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
        org.eclipse.jdt.core.dom.MemberValuePair memberValuePair11 = null;
        boolean boolean12 = cKVisitor4.visit(memberValuePair11);
        org.eclipse.jdt.core.dom.ParameterizedType parameterizedType13 = null;
        boolean boolean14 = cKVisitor4.visit(parameterizedType13);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        float float5 = cKClassResult4.getTightClassCohesion();
        int int6 = cKClassResult4.getNumberOfProtectedMethods();
        java.lang.String str7 = cKClassResult4.toString();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CKClassResult [file=, className=CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}]" + "'", str7, "CKClassResult [file=, className=CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}]");
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
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
        org.eclipse.jdt.core.dom.ReturnStatement returnStatement15 = null;
        cKVisitor4.endVisit(returnStatement15);
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit17 = null;
        cKVisitor4.endVisit(compilationUnit17);
        org.eclipse.jdt.core.dom.SwitchExpression switchExpression19 = null;
        boolean boolean20 = cKVisitor4.visit(switchExpression19);
        org.eclipse.jdt.core.dom.ArrayInitializer arrayInitializer21 = null;
        boolean boolean22 = cKVisitor4.visit(arrayInitializer21);
        org.eclipse.jdt.core.dom.LineComment lineComment23 = null;
        boolean boolean24 = cKVisitor4.visit(lineComment23);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
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
        org.eclipse.jdt.core.dom.IfStatement ifStatement17 = null;
        boolean boolean18 = cKVisitor4.visit(ifStatement17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        cKMethodResult4.setLoc((int) (byte) 100);
        cKMethodResult4.setTryCatchQty((int) (byte) -1);
        int int9 = cKMethodResult4.getNumbersQty();
        int int10 = cKMethodResult4.getWmc();
        cKMethodResult4.setCboModified((int) (short) 100);
        int int13 = cKMethodResult4.getAnonymousClassesQty();
        cKMethodResult4.setStartLine((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setStringLiteralsQty((int) (byte) 1);
        java.util.Optional<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultOptional8 = cKClassResult4.getMethod("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
        cKClassResult4.setReturnQty((int) '4');
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult15 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet16 = cKMethodResult15.getMethodInvocations();
        java.util.Set<java.lang.String> strSet17 = cKMethodResult15.getFieldsAccessed();
        java.util.Set<java.lang.String> strSet18 = cKMethodResult15.getMethodInvocations();
        cKClassResult4.setFieldNames(strSet18);
        int int20 = cKClassResult4.getNumberOfDefaultMethods();
        java.lang.String str21 = cKClassResult4.getClassName();
        cKClassResult4.setNumbersQty(1);
        int int24 = cKClassResult4.getLoopQty();
        org.junit.Assert.assertNotNull(cKMethodResultOptional8);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}" + "'", str21, "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getUniqueWordsQty();
        int int6 = cKMethodResult4.getNumbersQty();
        int int7 = cKMethodResult4.getVariablesQty();
        cKMethodResult4.setMaxNestedBlocks(0);
        java.util.Set<java.lang.String> strSet10 = cKMethodResult4.getMethodInvocationsLocal();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(strSet10);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
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
        org.eclipse.jdt.core.dom.ThisExpression thisExpression17 = null;
        boolean boolean18 = cKVisitor4.visit(thisExpression17);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation19 = null;
        boolean boolean20 = cKVisitor4.visit(arrayCreation19);
        org.eclipse.jdt.core.dom.SuperMethodReference superMethodReference21 = null;
        boolean boolean22 = cKVisitor4.visit(superMethodReference21);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        cKMethodResult4.setLoc((int) (byte) 100);
        cKMethodResult4.setTryCatchQty((int) (byte) -1);
        int int9 = cKMethodResult4.getNumbersQty();
        cKMethodResult4.setAnonymousClassesQty((int) '#');
        int int12 = cKMethodResult4.getTryCatchQty();
        int int13 = cKMethodResult4.getNumbersQty();
        int int14 = cKMethodResult4.getComparisonsQty();
        cKMethodResult4.setFanin((int) (byte) -1);
        int int17 = cKMethodResult4.getFanout();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
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
        org.eclipse.jdt.core.dom.FieldDeclaration fieldDeclaration23 = null;
        boolean boolean24 = cKVisitor4.visit(fieldDeclaration23);
        org.eclipse.jdt.core.dom.Dimension dimension25 = null;
        cKVisitor4.endVisit(dimension25);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
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
        org.eclipse.jdt.core.dom.BlockComment blockComment19 = null;
        cKVisitor4.endVisit(blockComment19);
        org.eclipse.jdt.core.dom.BlockComment blockComment21 = null;
        boolean boolean22 = cKVisitor4.visit(blockComment21);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
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
        org.eclipse.jdt.core.dom.MethodRef methodRef15 = null;
        cKVisitor4.endVisit(methodRef15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        cKMethodResult4.setAssignmentsQty((int) (short) -1);
        cKMethodResult4.setFanout((int) (byte) 1);
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getStringLiteralsQty();
        cKClassResult4.setNumberOfFinalFields((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
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
        org.eclipse.jdt.core.dom.TagElement tagElement17 = null;
        cKVisitor4.endVisit(tagElement17);
        org.eclipse.jdt.core.dom.ArrayType arrayType19 = null;
        cKVisitor4.endVisit(arrayType19);
        org.eclipse.jdt.core.dom.EnumConstantDeclaration enumConstantDeclaration21 = null;
        boolean boolean22 = cKVisitor4.visit(enumConstantDeclaration21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getLcom();
        cKClassResult4.setLcom((int) '#');
        java.lang.String str10 = cKClassResult4.getClassName();
        cKClassResult4.setNumberOfMethods((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}" + "'", str10, "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
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
        org.eclipse.jdt.core.dom.TypeDeclarationStatement typeDeclarationStatement11 = null;
        cKVisitor4.endVisit(typeDeclarationStatement11);
        org.eclipse.jdt.core.dom.SimpleType simpleType13 = null;
        boolean boolean14 = cKVisitor4.visit(simpleType13);
        org.eclipse.jdt.core.dom.VariableDeclarationFragment variableDeclarationFragment15 = null;
        boolean boolean16 = cKVisitor4.visit(variableDeclarationFragment15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.EnumConstantDeclaration enumConstantDeclaration7 = null;
        cKVisitor4.endVisit(enumConstantDeclaration7);
        org.eclipse.jdt.core.dom.TypeParameter typeParameter9 = null;
        boolean boolean10 = cKVisitor4.visit(typeParameter9);
        org.eclipse.jdt.core.dom.QualifiedType qualifiedType11 = null;
        cKVisitor4.endVisit(qualifiedType11);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
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
        org.eclipse.jdt.core.dom.BooleanLiteral booleanLiteral15 = null;
        cKVisitor4.endVisit(booleanLiteral15);
        org.eclipse.jdt.core.dom.OpensDirective opensDirective17 = null;
        boolean boolean18 = cKVisitor4.visit(opensDirective17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
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
        org.eclipse.jdt.core.dom.OpensDirective opensDirective26 = null;
        cKVisitor4.endVisit(opensDirective26);
        org.eclipse.jdt.core.dom.DoStatement doStatement28 = null;
        boolean boolean29 = cKVisitor4.visit(doStatement28);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(cKClassResultSet25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
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
        org.eclipse.jdt.core.dom.ThisExpression thisExpression13 = null;
        boolean boolean14 = cKVisitor4.visit(thisExpression13);
        org.eclipse.jdt.core.dom.UnionType unionType15 = null;
        cKVisitor4.endVisit(unionType15);
        org.eclipse.jdt.core.dom.SynchronizedStatement synchronizedStatement17 = null;
        boolean boolean18 = cKVisitor4.visit(synchronizedStatement17);
        org.eclipse.jdt.core.dom.ModuleModifier moduleModifier19 = null;
        cKVisitor4.endVisit(moduleModifier19);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation21 = null;
        boolean boolean22 = cKVisitor4.visit(arrayCreation21);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
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
        org.eclipse.jdt.core.dom.PostfixExpression postfixExpression21 = null;
        cKVisitor4.endVisit(postfixExpression21);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
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
        org.eclipse.jdt.core.dom.ThisExpression thisExpression13 = null;
        boolean boolean14 = cKVisitor4.visit(thisExpression13);
        org.eclipse.jdt.core.dom.ExportsDirective exportsDirective15 = null;
        cKVisitor4.endVisit(exportsDirective15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        java.util.Set<java.lang.String> strSet6 = cKMethodResult4.getMethodInvocationsLocal();
        java.util.Set<java.lang.String> strSet7 = cKMethodResult4.getFieldsAccessed();
        int int8 = cKMethodResult4.getComparisonsQty();
        cKMethodResult4.setLoc((-1));
        cKMethodResult4.setNumbersQty((int) (short) 1);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
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
        java.util.Set<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultSet21 = cKClassResult4.getMethods();
        int int22 = cKClassResult4.getAnonymousClassesQty();
        int int23 = cKClassResult4.getNosi();
        cKClassResult4.setParenthesizedExpsQty((int) (short) 100);
        org.junit.Assert.assertNotNull(cKMethodResultOptional8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertNotNull(cKMethodResultSet21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
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
        org.eclipse.jdt.core.dom.ContinueStatement continueStatement13 = null;
        boolean boolean14 = cKVisitor4.visit(continueStatement13);
        org.eclipse.jdt.core.dom.PrefixExpression prefixExpression15 = null;
        boolean boolean16 = cKVisitor4.visit(prefixExpression15);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
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
        org.eclipse.jdt.core.dom.WildcardType wildcardType23 = null;
        cKVisitor4.endVisit(wildcardType23);
        org.eclipse.jdt.core.dom.SwitchExpression switchExpression25 = null;
        cKVisitor4.endVisit(switchExpression25);
        org.eclipse.jdt.core.dom.LabeledStatement labeledStatement27 = null;
        boolean boolean28 = cKVisitor4.visit(labeledStatement27);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
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
        org.eclipse.jdt.core.dom.ThisExpression thisExpression17 = null;
        boolean boolean18 = cKVisitor4.visit(thisExpression17);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation19 = null;
        boolean boolean20 = cKVisitor4.visit(arrayCreation19);
        org.eclipse.jdt.core.dom.TypeParameter typeParameter21 = null;
        cKVisitor4.endVisit(typeParameter21);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.CastExpression castExpression7 = null;
        cKVisitor4.endVisit(castExpression7);
        org.eclipse.jdt.core.dom.SingleVariableDeclaration singleVariableDeclaration9 = null;
        cKVisitor4.endVisit(singleVariableDeclaration9);
        org.eclipse.jdt.core.dom.SuperMethodInvocation superMethodInvocation11 = null;
        cKVisitor4.endVisit(superMethodInvocation11);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
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
        org.eclipse.jdt.core.dom.ConstructorInvocation constructorInvocation17 = null;
        boolean boolean18 = cKVisitor4.visit(constructorInvocation17);
        org.eclipse.jdt.core.dom.SynchronizedStatement synchronizedStatement19 = null;
        boolean boolean20 = cKVisitor4.visit(synchronizedStatement19);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
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
        org.eclipse.jdt.core.dom.VariableDeclarationFragment variableDeclarationFragment17 = null;
        boolean boolean18 = cKVisitor4.visit(variableDeclarationFragment17);
        org.eclipse.jdt.core.dom.SingleVariableDeclaration singleVariableDeclaration19 = null;
        cKVisitor4.endVisit(singleVariableDeclaration19);
        org.eclipse.jdt.core.dom.CharacterLiteral characterLiteral21 = null;
        boolean boolean22 = cKVisitor4.visit(characterLiteral21);
        org.eclipse.jdt.core.dom.SuperFieldAccess superFieldAccess23 = null;
        cKVisitor4.endVisit(superFieldAccess23);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", true, (int) '4');
        cKMethodResult4.setLambdasQty((int) (short) 1);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
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
        int int26 = cKClassResult4.getNumberOfVisibleMethods();
        int int27 = cKClassResult4.getDit();
        cKClassResult4.setAnonymousClassesQty((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getLcom();
        cKClassResult4.setLcom((int) '#');
        cKClassResult4.setUniqueWordsQty(10);
        int int12 = cKClassResult4.getNumberOfAbstractMethods();
        int int13 = cKClassResult4.getNumberOfProtectedFields();
        float float14 = cKClassResult4.getLcomNormalized();
        cKClassResult4.setFanin(35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable0 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable1 = null;
        com.github.mauricioaniche.ck.CKNotifier cKNotifier2 = null;
        com.github.mauricioaniche.ck.MetricsExecutor metricsExecutor3 = new com.github.mauricioaniche.ck.MetricsExecutor(classLevelMetricListCallable0, methodLevelMetricListCallable1, cKNotifier2);
        java.lang.String[] strArray9 = new java.lang.String[] { "", "CKMethodResult{cbo=10, rfc=0, wmc=0, methodName='hi!'}", "hi!", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=10, rfc=0, wmc=0, methodName='hi!'}" };
        org.eclipse.jdt.core.dom.IBinding[] iBindingArray10 = metricsExecutor3.createBindings(strArray9);
        org.eclipse.jdt.core.dom.IBinding iBinding12 = null;
        metricsExecutor3.acceptBinding("CKMethodResult{cbo=10, rfc=0, wmc=0, methodName='hi!'}", iBinding12);
        java.lang.String[] strArray14 = new java.lang.String[] {};
        org.eclipse.jdt.core.dom.IBinding[] iBindingArray15 = metricsExecutor3.createBindings(strArray14);
        org.eclipse.jdt.core.dom.IBinding iBinding17 = null;
        metricsExecutor3.acceptBinding("", iBinding17);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(iBindingArray10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(iBindingArray15);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        cKClassResult4.setRfc(0);
        cKClassResult4.setNumberOfDefaultFields(0);
        int int10 = cKClassResult4.getNumberOfPublicMethods();
        int int11 = cKClassResult4.getFanout();
        int int12 = cKClassResult4.getAnonymousClassesQty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
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
        java.lang.String str22 = cKMethodResult4.getMethodName();
        cKMethodResult4.setRfc(52);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
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
        org.eclipse.jdt.core.dom.ExpressionMethodReference expressionMethodReference23 = null;
        boolean boolean24 = cKVisitor4.visit(expressionMethodReference23);
        org.eclipse.jdt.core.dom.NameQualifiedType nameQualifiedType25 = null;
        cKVisitor4.endVisit(nameQualifiedType25);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getLambdasQty();
        java.util.Set<java.lang.String> strSet6 = cKMethodResult4.getMethodInvocations();
        java.lang.String str7 = cKMethodResult4.toString();
        cKMethodResult4.setLoc((int) '4');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}" + "'", str7, "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
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
        org.eclipse.jdt.core.dom.MemberValuePair memberValuePair11 = null;
        boolean boolean12 = cKVisitor4.visit(memberValuePair11);
        org.eclipse.jdt.core.dom.MethodRef methodRef13 = null;
        cKVisitor4.endVisit(methodRef13);
        org.eclipse.jdt.core.dom.WildcardType wildcardType15 = null;
        cKVisitor4.endVisit(wildcardType15);
        org.eclipse.jdt.core.dom.VariableDeclarationExpression variableDeclarationExpression17 = null;
        boolean boolean18 = cKVisitor4.visit(variableDeclarationExpression17);
        org.eclipse.jdt.core.dom.QualifiedName qualifiedName19 = null;
        cKVisitor4.endVisit(qualifiedName19);
        org.eclipse.jdt.core.dom.SynchronizedStatement synchronizedStatement21 = null;
        boolean boolean22 = cKVisitor4.visit(synchronizedStatement21);
        org.eclipse.jdt.core.dom.MethodRefParameter methodRefParameter23 = null;
        boolean boolean24 = cKVisitor4.visit(methodRefParameter23);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
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
        org.eclipse.jdt.core.dom.MarkerAnnotation markerAnnotation19 = null;
        cKVisitor4.endVisit(markerAnnotation19);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation21 = null;
        boolean boolean22 = cKVisitor4.visit(arrayCreation21);
        org.eclipse.jdt.core.dom.ModuleDeclaration moduleDeclaration23 = null;
        boolean boolean24 = cKVisitor4.visit(moduleDeclaration23);
        org.eclipse.jdt.core.dom.InfixExpression infixExpression25 = null;
        cKVisitor4.endVisit(infixExpression25);
        org.eclipse.jdt.core.dom.IntersectionType intersectionType27 = null;
        boolean boolean28 = cKVisitor4.visit(intersectionType27);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
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
        org.eclipse.jdt.core.dom.UsesDirective usesDirective19 = null;
        boolean boolean20 = cKVisitor4.visit(usesDirective19);
        org.eclipse.jdt.core.dom.ForStatement forStatement21 = null;
        boolean boolean22 = cKVisitor4.visit(forStatement21);
        org.eclipse.jdt.core.dom.ExpressionMethodReference expressionMethodReference23 = null;
        boolean boolean24 = cKVisitor4.visit(expressionMethodReference23);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setStringLiteralsQty((int) (byte) 1);
        java.util.Optional<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultOptional8 = cKClassResult4.getMethod("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
        int int9 = cKClassResult4.getLoopQty();
        cKClassResult4.setLcom(100);
        int int12 = cKClassResult4.getAssignmentsQty();
        int int13 = cKClassResult4.getLoc();
        cKClassResult4.setNumberOfPublicFields(52);
        cKClassResult4.setLoc((int) (byte) -1);
        cKClassResult4.setNosi(0);
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult24 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet25 = cKMethodResult24.getMethodInvocations();
        java.util.Set<java.lang.String> strSet26 = cKMethodResult24.getMethodInvocationsLocal();
        cKMethodResult24.setHasJavadoc(false);
        java.util.Map<java.lang.String, java.util.Set<java.lang.String>> strMap29 = null;
        cKMethodResult24.setMethodInvocationsIndirectLocal(strMap29);
        cKClassResult4.addMethod(cKMethodResult24);
        org.junit.Assert.assertNotNull(cKMethodResultOptional8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNull(strSet26);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
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
        org.eclipse.jdt.core.dom.ExportsDirective exportsDirective15 = null;
        cKVisitor4.endVisit(exportsDirective15);
        org.eclipse.jdt.core.dom.ParameterizedType parameterizedType17 = null;
        boolean boolean18 = cKVisitor4.visit(parameterizedType17);
        org.eclipse.jdt.core.dom.FieldAccess fieldAccess19 = null;
        boolean boolean20 = cKVisitor4.visit(fieldAccess19);
        org.eclipse.jdt.core.dom.ArrayType arrayType21 = null;
        cKVisitor4.endVisit(arrayType21);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
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
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression17 = null;
        boolean boolean18 = cKVisitor4.visit(patternInstanceofExpression17);
        org.eclipse.jdt.core.dom.SwitchCase switchCase19 = null;
        boolean boolean20 = cKVisitor4.visit(switchCase19);
        org.eclipse.jdt.core.dom.SimpleName simpleName21 = null;
        boolean boolean22 = cKVisitor4.visit(simpleName21);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        java.util.Optional<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultOptional6 = cKClassResult4.getMethod("hi!");
        cKClassResult4.setTryCatchQty((int) (byte) 0);
        org.junit.Assert.assertNotNull(cKMethodResultOptional6);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
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
        org.eclipse.jdt.core.dom.MethodRefParameter methodRefParameter17 = null;
        boolean boolean18 = cKVisitor4.visit(methodRefParameter17);
        org.eclipse.jdt.core.dom.QualifiedName qualifiedName19 = null;
        boolean boolean20 = cKVisitor4.visit(qualifiedName19);
        org.eclipse.jdt.core.dom.IntersectionType intersectionType21 = null;
        cKVisitor4.endVisit(intersectionType21);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
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
        org.eclipse.jdt.core.dom.SingleVariableDeclaration singleVariableDeclaration13 = null;
        cKVisitor4.endVisit(singleVariableDeclaration13);
        org.eclipse.jdt.core.dom.ArrayType arrayType15 = null;
        cKVisitor4.endVisit(arrayType15);
        org.eclipse.jdt.core.dom.Modifier modifier17 = null;
        boolean boolean18 = cKVisitor4.visit(modifier17);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
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
        org.eclipse.jdt.core.dom.Modifier modifier11 = null;
        cKVisitor4.endVisit(modifier11);
        org.eclipse.jdt.core.dom.TryStatement tryStatement13 = null;
        cKVisitor4.endVisit(tryStatement13);
        org.eclipse.jdt.core.dom.Assignment assignment15 = null;
        boolean boolean16 = cKVisitor4.visit(assignment15);
        org.eclipse.jdt.core.dom.ReturnStatement returnStatement17 = null;
        boolean boolean18 = cKVisitor4.visit(returnStatement17);
        org.eclipse.jdt.core.dom.AssertStatement assertStatement19 = null;
        boolean boolean20 = cKVisitor4.visit(assertStatement19);
        org.eclipse.jdt.core.dom.NullLiteral nullLiteral21 = null;
        cKVisitor4.endVisit(nullLiteral21);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getUniqueWordsQty();
        int int6 = cKMethodResult4.getNumbersQty();
        int int7 = cKMethodResult4.getVariablesQty();
        java.util.Set<java.lang.String> strSet8 = null;
        cKMethodResult4.setMethodInvocations(strSet8);
        java.lang.String str10 = cKMethodResult4.getMethodName();
        cKMethodResult4.setVariablesQty((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
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
        org.eclipse.jdt.core.dom.ArrayAccess arrayAccess17 = null;
        boolean boolean18 = cKVisitor4.visit(arrayAccess17);
        org.eclipse.jdt.core.dom.LineComment lineComment19 = null;
        cKVisitor4.endVisit(lineComment19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setAnonymousClassesQty((int) (byte) -1);
        int int7 = cKClassResult4.getNumberOfSynchronizedFields();
        cKClassResult4.setAssignmentsQty((int) (byte) 1);
        int int10 = cKClassResult4.getNumberOfDefaultMethods();
        int int11 = cKClassResult4.getNumberOfPrivateFields();
        int int12 = cKClassResult4.getNumberOfProtectedMethods();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
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
        org.eclipse.jdt.core.dom.Modifier modifier11 = null;
        cKVisitor4.endVisit(modifier11);
        org.eclipse.jdt.core.dom.TryStatement tryStatement13 = null;
        cKVisitor4.endVisit(tryStatement13);
        org.eclipse.jdt.core.dom.TypeDeclarationStatement typeDeclarationStatement15 = null;
        cKVisitor4.endVisit(typeDeclarationStatement15);
        org.eclipse.jdt.core.dom.SwitchStatement switchStatement17 = null;
        boolean boolean18 = cKVisitor4.visit(switchStatement17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
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
        org.eclipse.jdt.core.dom.SuperMethodReference superMethodReference13 = null;
        cKVisitor4.endVisit(superMethodReference13);
        org.eclipse.jdt.core.dom.PackageDeclaration packageDeclaration15 = null;
        boolean boolean16 = cKVisitor4.visit(packageDeclaration15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
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
        org.eclipse.jdt.core.dom.AnnotationTypeDeclaration annotationTypeDeclaration19 = null;
        cKVisitor4.endVisit(annotationTypeDeclaration19);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
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
        org.eclipse.jdt.core.dom.QualifiedType qualifiedType19 = null;
        boolean boolean20 = cKVisitor4.visit(qualifiedType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        cKClassResult4.setInnerClassesQty((int) (short) 100);
        cKClassResult4.setParenthesizedExpsQty((int) '4');
        cKClassResult4.setNumberOfPublicFields((int) (byte) 10);
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult16 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet17 = cKMethodResult16.getMethodInvocations();
        java.util.Set<java.lang.String> strSet18 = cKMethodResult16.getMethodInvocationsLocal();
        int int19 = cKMethodResult16.getWmc();
        java.util.Set<java.lang.String> strSet20 = cKMethodResult16.getMethodInvocations();
        cKClassResult4.setFieldNames(strSet20);
        cKClassResult4.setInnerClassesQty((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(strSet18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(strSet20);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
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
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression15 = null;
        cKVisitor4.endVisit(parenthesizedExpression15);
        org.eclipse.jdt.core.dom.ModuleQualifiedName moduleQualifiedName17 = null;
        boolean boolean18 = cKVisitor4.visit(moduleQualifiedName17);
        org.eclipse.jdt.core.dom.UnionType unionType19 = null;
        boolean boolean20 = cKVisitor4.visit(unionType19);
        org.eclipse.jdt.core.dom.SingleMemberAnnotation singleMemberAnnotation21 = null;
        boolean boolean22 = cKVisitor4.visit(singleMemberAnnotation21);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKClassResult [file=, className=CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}]", true, 0);
        boolean boolean5 = cKMethodResult4.getIsVisible();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        cKClassResult4.setNumbersQty((int) (short) 1);
        cKClassResult4.setLooseClassCohesion((float) ' ');
        int int10 = cKClassResult4.getNumberOfDefaultMethods();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
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
        org.eclipse.jdt.core.dom.PrefixExpression prefixExpression17 = null;
        boolean boolean18 = cKVisitor4.visit(prefixExpression17);
        org.eclipse.jdt.core.dom.SwitchExpression switchExpression19 = null;
        cKVisitor4.endVisit(switchExpression19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
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
        org.eclipse.jdt.core.dom.RecordDeclaration recordDeclaration17 = null;
        boolean boolean18 = cKVisitor4.visit(recordDeclaration17);
        org.eclipse.jdt.core.dom.ExportsDirective exportsDirective19 = null;
        cKVisitor4.endVisit(exportsDirective19);
        org.eclipse.jdt.core.dom.EnumDeclaration enumDeclaration21 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(enumDeclaration21);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
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
        org.eclipse.jdt.core.dom.BreakStatement breakStatement23 = null;
        boolean boolean24 = cKVisitor4.visit(breakStatement23);
        org.eclipse.jdt.core.dom.TypeDeclaration typeDeclaration25 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(typeDeclaration25);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getMathOperationsQty();
        int int6 = cKMethodResult4.getRfc();
        int int7 = cKMethodResult4.getCbo();
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult12 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        cKMethodResult12.setLoc((int) (byte) 100);
        cKMethodResult12.setNumbersQty((-1));
        java.lang.String str17 = cKMethodResult12.toString();
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult22 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "hi!", false, (int) (byte) 0);
        cKMethodResult22.setFanout(1);
        cKMethodResult22.setMathOperationsQty((int) (short) 1);
        cKMethodResult22.setInnerClassesQty(0);
        java.util.Map<java.lang.String, java.util.Set<java.lang.String>> strMap29 = null;
        cKMethodResult22.setMethodInvocationsIndirectLocal(strMap29);
        java.util.Map<java.lang.String, java.lang.Integer> strMap31 = cKMethodResult22.getVariablesUsage();
        cKMethodResult12.setFieldUsage(strMap31);
        cKMethodResult4.setFieldUsage(strMap31);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}" + "'", str17, "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
        org.junit.Assert.assertNotNull(strMap31);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        java.util.Set<java.lang.String> strSet6 = cKMethodResult4.getMethodInvocationsLocal();
        java.util.Set<java.lang.String> strSet7 = cKMethodResult4.getFieldsAccessed();
        int int8 = cKMethodResult4.getComparisonsQty();
        int int9 = cKMethodResult4.getFanout();
        cKMethodResult4.setParenthesizedExpsQty((int) 'a');
        cKMethodResult4.setUniqueWordsQty((int) ' ');
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
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
        org.eclipse.jdt.core.dom.DoStatement doStatement19 = null;
        boolean boolean20 = cKVisitor4.visit(doStatement19);
        org.eclipse.jdt.core.dom.TypeMethodReference typeMethodReference21 = null;
        boolean boolean22 = cKVisitor4.visit(typeMethodReference21);
        org.eclipse.jdt.core.dom.LambdaExpression lambdaExpression23 = null;
        boolean boolean24 = cKVisitor4.visit(lambdaExpression23);
        org.eclipse.jdt.core.dom.Block block25 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(block25);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getLcom();
        cKClassResult4.setLcom((int) '#');
        cKClassResult4.setTightClassCohesion((float) '#');
        java.lang.String str12 = cKClassResult4.toString();
        int int13 = cKClassResult4.getNosi();
        int int14 = cKClassResult4.getComparisonsQty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "CKClassResult [file=, className=CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}]" + "'", str12, "CKClassResult [file=, className=CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
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
        org.eclipse.jdt.core.dom.MethodInvocation methodInvocation19 = null;
        cKVisitor4.endVisit(methodInvocation19);
        org.eclipse.jdt.core.dom.InfixExpression infixExpression21 = null;
        boolean boolean22 = cKVisitor4.visit(infixExpression21);
        org.eclipse.jdt.core.dom.ModuleDeclaration moduleDeclaration23 = null;
        boolean boolean24 = cKVisitor4.visit(moduleDeclaration23);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
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
        org.eclipse.jdt.core.dom.SingleMemberAnnotation singleMemberAnnotation13 = null;
        boolean boolean14 = cKVisitor4.visit(singleMemberAnnotation13);
        org.eclipse.jdt.core.dom.ReturnStatement returnStatement15 = null;
        cKVisitor4.endVisit(returnStatement15);
        org.eclipse.jdt.core.dom.PostfixExpression postfixExpression17 = null;
        cKVisitor4.endVisit(postfixExpression17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
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
        org.eclipse.jdt.core.dom.ArrayType arrayType11 = null;
        cKVisitor4.endVisit(arrayType11);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getLcom();
        cKClassResult4.setLcom((int) '#');
        int int10 = cKClassResult4.getLoopQty();
        cKClassResult4.setNosi((int) (short) -1);
        cKClassResult4.setLoopQty(0);
        cKClassResult4.setCbo((-1));
        java.lang.String str17 = cKClassResult4.toString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "CKClassResult [file=, className=CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}]" + "'", str17, "CKClassResult [file=, className=CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}]");
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
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
        org.eclipse.jdt.core.dom.SwitchCase switchCase15 = null;
        boolean boolean16 = cKVisitor4.visit(switchCase15);
        org.eclipse.jdt.core.dom.TypeParameter typeParameter17 = null;
        boolean boolean18 = cKVisitor4.visit(typeParameter17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
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
        org.eclipse.jdt.core.dom.DoStatement doStatement19 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(doStatement19);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
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
        org.eclipse.jdt.core.dom.LineComment lineComment11 = null;
        boolean boolean12 = cKVisitor4.visit(lineComment11);
        org.eclipse.jdt.core.dom.NormalAnnotation normalAnnotation13 = null;
        cKVisitor4.endVisit(normalAnnotation13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
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
        int int22 = cKMethodResult14.getTryCatchQty();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
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
        org.eclipse.jdt.core.dom.VariableDeclarationExpression variableDeclarationExpression15 = null;
        boolean boolean16 = cKVisitor4.visit(variableDeclarationExpression15);
        org.eclipse.jdt.core.dom.Initializer initializer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = cKVisitor4.visit(initializer17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
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
        org.eclipse.jdt.core.dom.SynchronizedStatement synchronizedStatement15 = null;
        boolean boolean16 = cKVisitor4.visit(synchronizedStatement15);
        org.eclipse.jdt.core.dom.ExportsDirective exportsDirective17 = null;
        cKVisitor4.endVisit(exportsDirective17);
        org.eclipse.jdt.core.dom.ContinueStatement continueStatement19 = null;
        cKVisitor4.endVisit(continueStatement19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
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
        org.eclipse.jdt.core.dom.Dimension dimension21 = null;
        cKVisitor4.endVisit(dimension21);
        org.eclipse.jdt.core.dom.AnnotationTypeDeclaration annotationTypeDeclaration23 = null;
        cKVisitor4.endVisit(annotationTypeDeclaration23);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        java.util.Set<java.lang.String> strSet6 = cKMethodResult4.getMethodInvocationsLocal();
        java.util.Set<java.lang.String> strSet7 = cKMethodResult4.getFieldsAccessed();
        cKMethodResult4.setMathOperationsQty(100);
        int int10 = cKMethodResult4.getLogStatementsQty();
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        cKMethodResult4.setLoc((int) (byte) 100);
        cKMethodResult4.setTryCatchQty((int) (byte) -1);
        cKMethodResult4.setCbo(0);
        int int11 = cKMethodResult4.getCbo();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
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
        org.eclipse.jdt.core.dom.ProvidesDirective providesDirective15 = null;
        cKVisitor4.endVisit(providesDirective15);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression17 = null;
        cKVisitor4.endVisit(parenthesizedExpression17);
        org.eclipse.jdt.core.dom.QualifiedName qualifiedName19 = null;
        boolean boolean20 = cKVisitor4.visit(qualifiedName19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getMaxNestedBlocks();
        int int6 = cKClassResult4.getMaxNestedBlocks();
        int int7 = cKClassResult4.getNumbersQty();
        int int8 = cKClassResult4.getCbo();
        java.lang.String str9 = cKClassResult4.getType();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}" + "'", str9, "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
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
        org.eclipse.jdt.core.dom.ThrowStatement throwStatement19 = null;
        cKVisitor4.endVisit(throwStatement19);
        org.eclipse.jdt.core.dom.ExpressionMethodReference expressionMethodReference21 = null;
        boolean boolean22 = cKVisitor4.visit(expressionMethodReference21);
        org.eclipse.jdt.core.dom.SingleMemberAnnotation singleMemberAnnotation23 = null;
        cKVisitor4.endVisit(singleMemberAnnotation23);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
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
        int int21 = cKClassResult4.getNosi();
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
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
        org.eclipse.jdt.core.dom.ProvidesDirective providesDirective15 = null;
        cKVisitor4.endVisit(providesDirective15);
        org.eclipse.jdt.core.dom.ReturnStatement returnStatement17 = null;
        cKVisitor4.endVisit(returnStatement17);
        org.eclipse.jdt.core.dom.SimpleType simpleType19 = null;
        boolean boolean20 = cKVisitor4.visit(simpleType19);
        org.eclipse.jdt.core.dom.AnnotationTypeMemberDeclaration annotationTypeMemberDeclaration21 = null;
        boolean boolean22 = cKVisitor4.visit(annotationTypeMemberDeclaration21);
        org.eclipse.jdt.core.dom.ImportDeclaration importDeclaration23 = null;
        boolean boolean24 = cKVisitor4.visit(importDeclaration23);
        org.eclipse.jdt.core.dom.ArrayType arrayType25 = null;
        boolean boolean26 = cKVisitor4.visit(arrayType25);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getInnerClassesQty();
        cKClassResult4.setLogStatementsQty(0);
        int int8 = cKClassResult4.getCbo();
        float float9 = cKClassResult4.getLcomNormalized();
        cKClassResult4.setStringLiteralsQty((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
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
        java.util.Set<com.github.mauricioaniche.ck.CKClassResult> cKClassResultSet15 = cKVisitor4.getCollectedClasses();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(cKClassResultSet15);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
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
        org.eclipse.jdt.core.dom.ExportsDirective exportsDirective13 = null;
        boolean boolean14 = cKVisitor4.visit(exportsDirective13);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setStringLiteralsQty((int) (byte) 1);
        java.util.Optional<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultOptional8 = cKClassResult4.getMethod("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
        cKClassResult4.setNumberOfProtectedFields((int) (byte) 0);
        int int11 = cKClassResult4.getRfc();
        cKClassResult4.setNumberOfProtectedFields(35);
        org.junit.Assert.assertNotNull(cKMethodResultOptional8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
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
        org.eclipse.jdt.core.dom.ConstructorInvocation constructorInvocation23 = null;
        boolean boolean24 = cKVisitor4.visit(constructorInvocation23);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
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
        org.eclipse.jdt.core.dom.RecordDeclaration recordDeclaration17 = null;
        cKVisitor4.endVisit(recordDeclaration17);
        org.eclipse.jdt.core.dom.ClassInstanceCreation classInstanceCreation19 = null;
        boolean boolean20 = cKVisitor4.visit(classInstanceCreation19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        java.util.Set<java.lang.String> strSet6 = cKMethodResult4.getMethodInvocationsLocal();
        java.util.Set<java.lang.String> strSet7 = cKMethodResult4.getFieldsAccessed();
        int int8 = cKMethodResult4.getComparisonsQty();
        int int9 = cKMethodResult4.getParametersQty();
        cKMethodResult4.setComparisonsQty(100);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
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
        org.eclipse.jdt.core.dom.ThisExpression thisExpression19 = null;
        cKVisitor4.endVisit(thisExpression19);
        org.eclipse.jdt.core.dom.SwitchCase switchCase21 = null;
        boolean boolean22 = cKVisitor4.visit(switchCase21);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
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
        org.eclipse.jdt.core.dom.ContinueStatement continueStatement11 = null;
        boolean boolean12 = cKVisitor4.visit(continueStatement11);
        org.eclipse.jdt.core.dom.SuperMethodReference superMethodReference13 = null;
        boolean boolean14 = cKVisitor4.visit(superMethodReference13);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getUniqueWordsQty();
        int int7 = cKClassResult4.getUniqueWordsQty();
        int int8 = cKClassResult4.getNumberOfStaticFields();
        cKClassResult4.setComparisonsQty((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "hi!", false, (int) (byte) 0);
        cKMethodResult4.setFanout(1);
        cKMethodResult4.setCbo(10);
        int int9 = cKMethodResult4.getAnonymousClassesQty();
        cKMethodResult4.setTryCatchQty((int) (short) 100);
        cKMethodResult4.setInnerClassesQty((int) (byte) 100);
        cKMethodResult4.setFanin(0);
        cKMethodResult4.setTryCatchQty((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        float float5 = cKClassResult4.getTightClassCohesion();
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult10 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet11 = cKMethodResult10.getMethodInvocations();
        int int12 = cKMethodResult10.getStringLiteralsQty();
        cKMethodResult10.setWmc((int) (byte) 10);
        cKClassResult4.addMethod(cKMethodResult10);
        cKClassResult4.setLcomNormalized((float) (byte) -1);
        int int18 = cKClassResult4.getNumberOfLogStatements();
        int int19 = cKClassResult4.getLcom();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
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
        org.eclipse.jdt.core.dom.ArrayType arrayType17 = null;
        cKVisitor4.endVisit(arrayType17);
        org.eclipse.jdt.core.dom.LambdaExpression lambdaExpression19 = null;
        boolean boolean20 = cKVisitor4.visit(lambdaExpression19);
        org.eclipse.jdt.core.dom.QualifiedType qualifiedType21 = null;
        boolean boolean22 = cKVisitor4.visit(qualifiedType21);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
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
        org.eclipse.jdt.core.dom.ExportsDirective exportsDirective13 = null;
        boolean boolean14 = cKVisitor4.visit(exportsDirective13);
        org.eclipse.jdt.core.dom.SingleMemberAnnotation singleMemberAnnotation15 = null;
        cKVisitor4.endVisit(singleMemberAnnotation15);
        org.eclipse.jdt.core.dom.CharacterLiteral characterLiteral17 = null;
        boolean boolean18 = cKVisitor4.visit(characterLiteral17);
        org.eclipse.jdt.core.dom.InstanceofExpression instanceofExpression19 = null;
        boolean boolean20 = cKVisitor4.visit(instanceofExpression19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
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
        org.eclipse.jdt.core.dom.UsesDirective usesDirective19 = null;
        boolean boolean20 = cKVisitor4.visit(usesDirective19);
        org.eclipse.jdt.core.dom.ForStatement forStatement21 = null;
        boolean boolean22 = cKVisitor4.visit(forStatement21);
        org.eclipse.jdt.core.dom.CreationReference creationReference23 = null;
        cKVisitor4.endVisit(creationReference23);
        org.eclipse.jdt.core.dom.MethodRefParameter methodRefParameter25 = null;
        cKVisitor4.endVisit(methodRefParameter25);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getInnerClassesQty();
        cKClassResult4.setLogStatementsQty(0);
        cKClassResult4.setNumberOfPublicMethods((int) (byte) -1);
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult14 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet15 = cKMethodResult14.getMethodInvocations();
        java.lang.String str16 = cKMethodResult14.getQualifiedMethodName();
        cKMethodResult14.setLoc(100);
        cKMethodResult14.setLogStatementsQty((int) (short) -1);
        cKClassResult4.addMethod(cKMethodResult14);
        java.lang.String str22 = cKClassResult4.getClassName();
        cKClassResult4.setLambdasQty(35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}" + "'", str22, "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
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
        org.eclipse.jdt.core.dom.BlockComment blockComment21 = null;
        boolean boolean22 = cKVisitor4.visit(blockComment21);
        org.eclipse.jdt.core.dom.MemberValuePair memberValuePair23 = null;
        boolean boolean24 = cKVisitor4.visit(memberValuePair23);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getLambdasQty();
        java.util.Map<java.lang.String, java.util.Set<java.lang.String>> strMap6 = cKMethodResult4.getMethodInvocationsIndirectLocal();
        cKMethodResult4.setComparisonsQty(52);
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult13 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        cKMethodResult13.setLoc((int) (byte) 100);
        cKMethodResult13.setTryCatchQty((int) (byte) -1);
        int int18 = cKMethodResult13.getNumbersQty();
        cKMethodResult13.setAnonymousClassesQty((int) '#');
        int int21 = cKMethodResult13.getModifiers();
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult26 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int27 = cKMethodResult26.getUniqueWordsQty();
        cKMethodResult26.setUniqueWordsQty((int) (byte) 10);
        cKMethodResult26.setAnonymousClassesQty((int) (short) 1);
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult36 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet37 = cKMethodResult36.getMethodInvocations();
        cKMethodResult26.setMethodInvocationLocal(strSet37);
        cKMethodResult26.setAssignmentsQty((int) (byte) -1);
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult45 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "hi!", false, (int) (byte) 0);
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult50 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int51 = cKMethodResult50.getLambdasQty();
        java.util.Set<java.lang.String> strSet52 = cKMethodResult50.getMethodInvocations();
        cKMethodResult45.setMethodInvocations(strSet52);
        cKMethodResult26.setMethodInvocations(strSet52);
        cKMethodResult13.setMethodInvocations(strSet52);
        cKMethodResult4.setMethodInvocations(strSet52);
        cKMethodResult4.setInnerClassesQty(1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(strSet37);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(strSet52);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
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
        org.eclipse.jdt.core.dom.ThrowStatement throwStatement15 = null;
        cKVisitor4.endVisit(throwStatement15);
        org.eclipse.jdt.core.dom.LabeledStatement labeledStatement17 = null;
        cKVisitor4.endVisit(labeledStatement17);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setStringLiteralsQty((int) (byte) 1);
        java.util.Optional<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultOptional8 = cKClassResult4.getMethod("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
        int int9 = cKClassResult4.getLoopQty();
        cKClassResult4.setLcom(100);
        int int12 = cKClassResult4.getAssignmentsQty();
        cKClassResult4.setNoc((int) (byte) 0);
        int int15 = cKClassResult4.getVariablesQty();
        java.lang.String str16 = cKClassResult4.toString();
        org.junit.Assert.assertNotNull(cKMethodResultOptional8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "CKClassResult [file=, className=CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}]" + "'", str16, "CKClassResult [file=, className=CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}]");
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getInnerClassesQty();
        cKClassResult4.setLogStatementsQty(0);
        int int8 = cKClassResult4.getAssignmentsQty();
        float float9 = cKClassResult4.getTightClassCohesion();
        java.util.Set<java.lang.String> strSet10 = cKClassResult4.getFieldNames();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertNull(strSet10);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setAnonymousClassesQty((int) (byte) -1);
        int int7 = cKClassResult4.getNumberOfSynchronizedFields();
        java.util.Set<java.lang.String> strSet8 = cKClassResult4.getFieldNames();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(strSet8);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
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
        org.eclipse.jdt.core.dom.PackageDeclaration packageDeclaration17 = null;
        cKVisitor4.endVisit(packageDeclaration17);
        org.eclipse.jdt.core.dom.SwitchStatement switchStatement19 = null;
        boolean boolean20 = cKVisitor4.visit(switchStatement19);
        org.eclipse.jdt.core.dom.MethodInvocation methodInvocation21 = null;
        boolean boolean22 = cKVisitor4.visit(methodInvocation21);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }
}
