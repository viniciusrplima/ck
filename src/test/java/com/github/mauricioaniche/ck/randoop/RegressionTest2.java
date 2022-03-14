package com.github.mauricioaniche.ck.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setNumberOfPublicMethods((int) '#');
        int int7 = cKClassResult4.getNumberOfLogStatements();
        cKClassResult4.setWmc((int) 'a');
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getLambdasQty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        cKMethodResult4.setVariablesUsage(strMap6);
        java.lang.String str8 = cKMethodResult4.getMethodName();
        boolean boolean9 = cKMethodResult4.getIsVisible();
        cKMethodResult4.setHasJavadoc(true);
        int int12 = cKMethodResult4.getLambdasQty();
        cKMethodResult4.setFanin((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setStringLiteralsQty((int) (byte) 1);
        java.util.Optional<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultOptional8 = cKClassResult4.getMethod("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
        cKClassResult4.setLooseClassCohesion((float) 10L);
        int int11 = cKClassResult4.getModifiers();
        cKClassResult4.setLcom((int) (byte) 1);
        org.junit.Assert.assertNotNull(cKMethodResultOptional8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        float float5 = cKClassResult4.getTightClassCohesion();
        int int6 = cKClassResult4.getMaxNestedBlocks();
        int int7 = cKClassResult4.getMathOperationsQty();
        int int8 = cKClassResult4.getNumbersQty();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setStringLiteralsQty((int) (byte) 1);
        java.util.Optional<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultOptional8 = cKClassResult4.getMethod("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
        cKClassResult4.setReturnQty((int) '4');
        cKClassResult4.setNumberOfSynchronizedFields((int) '#');
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult17 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet18 = cKMethodResult17.getMethodInvocations();
        int int19 = cKMethodResult17.getMaxNestedBlocks();
        int int20 = cKMethodResult17.getModifiers();
        cKClassResult4.addMethod(cKMethodResult17);
        cKMethodResult17.setNumbersQty((int) (short) 10);
        org.junit.Assert.assertNotNull(cKMethodResultOptional8);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
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
        org.eclipse.jdt.core.dom.ModuleModifier moduleModifier15 = null;
        cKVisitor4.endVisit(moduleModifier15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        float float5 = cKClassResult4.getTightClassCohesion();
        int int6 = cKClassResult4.getMaxNestedBlocks();
        int int7 = cKClassResult4.getMathOperationsQty();
        java.util.Set<java.lang.String> strSet8 = cKClassResult4.getFieldNames();
        cKClassResult4.setStringLiteralsQty(1);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(strSet8);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
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
        org.eclipse.jdt.core.dom.ClassInstanceCreation classInstanceCreation13 = null;
        cKVisitor4.endVisit(classInstanceCreation13);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getStringLiteralsQty();
        cKClassResult4.setNumberOfFinalFields((int) (short) 0);
        int int10 = cKClassResult4.getNumberOfFinalMethods();
        int int11 = cKClassResult4.getParenthesizedExpsQty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
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
        org.eclipse.jdt.core.dom.MethodRef methodRef19 = null;
        boolean boolean20 = cKVisitor4.visit(methodRef19);
        org.eclipse.jdt.core.dom.BreakStatement breakStatement21 = null;
        cKVisitor4.endVisit(breakStatement21);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
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
        org.eclipse.jdt.core.dom.SwitchCase switchCase15 = null;
        boolean boolean16 = cKVisitor4.visit(switchCase15);
        org.eclipse.jdt.core.dom.AssertStatement assertStatement17 = null;
        boolean boolean18 = cKVisitor4.visit(assertStatement17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        cKClassResult4.setInnerClassesQty((int) (short) 100);
        cKClassResult4.setLcom((int) '#');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
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
        java.lang.String str22 = cKMethodResult4.getQualifiedMethodName();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        cKClassResult4.setRfc(0);
        cKClassResult4.setNumberOfDefaultFields(0);
        cKClassResult4.setLcomNormalized(0.0f);
        int int12 = cKClassResult4.getNumberOfSynchronizedFields();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        float float5 = cKClassResult4.getTightClassCohesion();
        int int6 = cKClassResult4.getMaxNestedBlocks();
        cKClassResult4.setLoopQty((int) (short) 100);
        int int9 = cKClassResult4.getNumberOfVisibleMethods();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
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
        org.eclipse.jdt.core.dom.WildcardType wildcardType21 = null;
        boolean boolean22 = cKVisitor4.visit(wildcardType21);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
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
        org.eclipse.jdt.core.dom.LineComment lineComment17 = null;
        boolean boolean18 = cKVisitor4.visit(lineComment17);
        org.eclipse.jdt.core.dom.AnonymousClassDeclaration anonymousClassDeclaration19 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(anonymousClassDeclaration19);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
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
        org.eclipse.jdt.core.dom.Initializer initializer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(initializer19);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
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
        java.util.Set<com.github.mauricioaniche.ck.CKClassResult> cKClassResultSet13 = cKVisitor4.getCollectedClasses();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(cKClassResultSet13);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
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
        org.eclipse.jdt.core.dom.QualifiedType qualifiedType21 = null;
        cKVisitor4.endVisit(qualifiedType21);
        org.eclipse.jdt.core.dom.ProvidesDirective providesDirective23 = null;
        boolean boolean24 = cKVisitor4.visit(providesDirective23);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
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
        org.eclipse.jdt.core.dom.LambdaExpression lambdaExpression17 = null;
        boolean boolean18 = cKVisitor4.visit(lambdaExpression17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getLcom();
        cKClassResult4.setLcom((int) '#');
        int int10 = cKClassResult4.getNumberOfPublicFields();
        int int11 = cKClassResult4.getNumberOfPublicMethods();
        cKClassResult4.setLcomNormalized((float) 100L);
        cKClassResult4.setFanout(10);
        int int16 = cKClassResult4.getNumberOfFields();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getComparisonsQty();
        cKMethodResult4.setReturnQty((int) (byte) -1);
        cKMethodResult4.setCboModified((int) (byte) 100);
        int int10 = cKMethodResult4.getFanout();
        int int11 = cKMethodResult4.getTryCatchQty();
        int int12 = cKMethodResult4.getRfc();
        cKMethodResult4.setFanout((int) (short) 0);
        int int15 = cKMethodResult4.getInnerClassesQty();
        cKMethodResult4.setFanout(35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getUniqueWordsQty();
        int int7 = cKClassResult4.getUniqueWordsQty();
        int int8 = cKClassResult4.getNumberOfStaticFields();
        cKClassResult4.setNosi((int) (byte) 100);
        int int11 = cKClassResult4.getCboModified();
        cKClassResult4.setLcom(10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
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
        int int27 = cKClassResult4.getNumberOfProtectedMethods();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setStringLiteralsQty((-1));
        int int7 = cKClassResult4.getCbo();
        java.util.Set<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultSet8 = cKClassResult4.getVisibleMethods();
        cKClassResult4.setNumberOfDefaultMethods((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(cKMethodResultSet8);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        cKMethodResult4.setLoc((int) (byte) 100);
        cKMethodResult4.setTryCatchQty((int) (byte) -1);
        int int9 = cKMethodResult4.getWmc();
        int int10 = cKMethodResult4.getVariablesQty();
        int int11 = cKMethodResult4.getInnerClassesQty();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        java.util.Set<java.lang.String> strSet6 = cKMethodResult4.getMethodInvocationsLocal();
        cKMethodResult4.setCboModified(100);
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult13 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int14 = cKMethodResult13.getLambdasQty();
        java.util.Set<java.lang.String> strSet15 = cKMethodResult13.getMethodInvocations();
        cKMethodResult4.setMethodInvocations(strSet15);
        int int17 = cKMethodResult4.getComparisonsQty();
        int int18 = cKMethodResult4.getWmc();
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
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
        org.eclipse.jdt.core.dom.MemberValuePair memberValuePair19 = null;
        boolean boolean20 = cKVisitor4.visit(memberValuePair19);
        org.eclipse.jdt.core.dom.Assignment assignment21 = null;
        cKVisitor4.endVisit(assignment21);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        cKMethodResult4.setLoc((int) (byte) 100);
        cKMethodResult4.setTryCatchQty((int) (byte) -1);
        cKMethodResult4.setCbo(0);
        int int11 = cKMethodResult4.getLogStatementsQty();
        java.util.Map<java.lang.String, java.util.Set<java.lang.String>> strMap12 = cKMethodResult4.getMethodInvocationsIndirectLocal();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setAnonymousClassesQty((int) (byte) -1);
        int int7 = cKClassResult4.getNumberOfSynchronizedFields();
        cKClassResult4.setAssignmentsQty((int) (byte) 1);
        cKClassResult4.setLcomNormalized((float) (short) 10);
        cKClassResult4.setNumberOfSynchronizedFields(35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
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
        org.eclipse.jdt.core.dom.TypeDeclarationStatement typeDeclarationStatement13 = null;
        boolean boolean14 = cKVisitor4.visit(typeDeclarationStatement13);
        org.eclipse.jdt.core.dom.ModuleDeclaration moduleDeclaration15 = null;
        boolean boolean16 = cKVisitor4.visit(moduleDeclaration15);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getComparisonsQty();
        cKMethodResult4.setReturnQty((int) (byte) -1);
        cKMethodResult4.setCboModified((int) (byte) 100);
        int int10 = cKMethodResult4.getFanout();
        int int11 = cKMethodResult4.getTryCatchQty();
        int int12 = cKMethodResult4.getRfc();
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = null;
        cKMethodResult4.setFieldUsage(strMap13);
        int int15 = cKMethodResult4.getTryCatchQty();
        java.util.Set<java.lang.String> strSet16 = cKMethodResult4.getMethodInvocationsLocal();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(strSet16);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getInnerClassesQty();
        cKClassResult4.setLogStatementsQty(0);
        int int8 = cKClassResult4.getAssignmentsQty();
        float float9 = cKClassResult4.getTightClassCohesion();
        cKClassResult4.setTryCatchQty((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getLambdasQty();
        java.util.Set<java.lang.String> strSet6 = cKMethodResult4.getMethodInvocations();
        java.lang.String str7 = cKMethodResult4.toString();
        int int8 = cKMethodResult4.getFanout();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}" + "'", str7, "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
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
        org.eclipse.jdt.core.dom.SwitchCase switchCase21 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(switchCase21);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
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
        org.eclipse.jdt.core.dom.Javadoc javadoc11 = null;
        cKVisitor4.endVisit(javadoc11);
        org.eclipse.jdt.core.dom.Dimension dimension13 = null;
        cKVisitor4.endVisit(dimension13);
        org.eclipse.jdt.core.dom.TextBlock textBlock15 = null;
        cKVisitor4.endVisit(textBlock15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getMaxNestedBlocks();
        cKClassResult4.setNosi(100);
        cKClassResult4.setComparisonsQty(52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
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
        org.eclipse.jdt.core.dom.UsesDirective usesDirective15 = null;
        cKVisitor4.endVisit(usesDirective15);
        org.eclipse.jdt.core.dom.TypeDeclaration typeDeclaration17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = cKVisitor4.visit(typeDeclaration17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        cKClassResult4.setFanout((int) 'a');
        int int8 = cKClassResult4.getNumberOfPrivateFields();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getInnerClassesQty();
        cKClassResult4.setLogStatementsQty(0);
        int int8 = cKClassResult4.getAssignmentsQty();
        cKClassResult4.setNumberOfFinalFields((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getUniqueWordsQty();
        int int6 = cKMethodResult4.getAssignmentsQty();
        int int7 = cKMethodResult4.getModifiers();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
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
        org.eclipse.jdt.core.dom.PackageDeclaration packageDeclaration13 = null;
        boolean boolean14 = cKVisitor4.visit(packageDeclaration13);
        org.eclipse.jdt.core.dom.EnumDeclaration enumDeclaration15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = cKVisitor4.visit(enumDeclaration15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("", "CKMethodResult{cbo=10, rfc=0, wmc=0, methodName='hi!'}", true, (int) (byte) 10);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getRfc();
        int int6 = cKClassResult4.getLcom();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getLcom();
        cKClassResult4.setLcom((int) '#');
        int int10 = cKClassResult4.getNumberOfPublicFields();
        cKClassResult4.setNumberOfProtectedFields((int) (short) 10);
        int int13 = cKClassResult4.getRfc();
        cKClassResult4.setNumberOfFields(0);
        int int16 = cKClassResult4.getNumberOfFields();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
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
        org.eclipse.jdt.core.dom.BreakStatement breakStatement15 = null;
        boolean boolean16 = cKVisitor4.visit(breakStatement15);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
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
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult35 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet36 = cKMethodResult35.getMethodInvocations();
        java.util.Set<java.lang.String> strSet37 = cKMethodResult35.getMethodInvocationsLocal();
        int int38 = cKMethodResult35.getLambdasQty();
        cKMethodResult35.setParenthesizedExpsQty((int) (short) -1);
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult45 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int46 = cKMethodResult45.getUniqueWordsQty();
        cKMethodResult45.setUniqueWordsQty((int) (byte) 10);
        int int49 = cKMethodResult45.getLogStatementsQty();
        boolean boolean50 = cKMethodResult45.isConstructor();
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult55 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int56 = cKMethodResult55.getUniqueWordsQty();
        int int57 = cKMethodResult55.getNumbersQty();
        int int58 = cKMethodResult55.getStartLine();
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult63 = new com.github.mauricioaniche.ck.CKMethodResult("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", true, 0);
        cKMethodResult63.setCbo(0);
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult70 = new com.github.mauricioaniche.ck.CKMethodResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", true, 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap71 = cKMethodResult70.getVariablesUsage();
        cKMethodResult63.setFieldUsage(strMap71);
        cKMethodResult55.setVariablesUsage(strMap71);
        cKMethodResult45.setVariablesUsage(strMap71);
        cKMethodResult35.setFieldUsage(strMap71);
        cKMethodResult4.setFieldUsage(strMap71);
        int int77 = cKMethodResult4.getTryCatchQty();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(strSet36);
        org.junit.Assert.assertNull(strSet37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(strMap71);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
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
        org.eclipse.jdt.core.dom.RequiresDirective requiresDirective21 = null;
        cKVisitor4.endVisit(requiresDirective21);
        org.eclipse.jdt.core.dom.ArrayAccess arrayAccess23 = null;
        cKVisitor4.endVisit(arrayAccess23);
        org.eclipse.jdt.core.dom.TryStatement tryStatement25 = null;
        cKVisitor4.endVisit(tryStatement25);
        org.eclipse.jdt.core.dom.ModuleQualifiedName moduleQualifiedName27 = null;
        boolean boolean28 = cKVisitor4.visit(moduleQualifiedName27);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
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
        org.eclipse.jdt.core.dom.CharacterLiteral characterLiteral19 = null;
        boolean boolean20 = cKVisitor4.visit(characterLiteral19);
        org.eclipse.jdt.core.dom.SingleVariableDeclaration singleVariableDeclaration21 = null;
        cKVisitor4.endVisit(singleVariableDeclaration21);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        cKClassResult4.setUniqueWordsQty((int) '#');
        cKClassResult4.setAnonymousClassesQty((-1));
        int int10 = cKClassResult4.getDit();
        cKClassResult4.setNumberOfPublicMethods((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getComparisonsQty();
        cKMethodResult4.setLoc((int) (byte) 10);
        int int8 = cKMethodResult4.getStartLine();
        java.util.Map<java.lang.String, java.util.Set<java.lang.String>> strMap9 = cKMethodResult4.getMethodInvocationsIndirectLocal();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(strMap9);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
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
        org.eclipse.jdt.core.dom.SwitchStatement switchStatement21 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(switchStatement21);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
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
        int int22 = cKClassResult4.getNumberOfFields();
        org.junit.Assert.assertNotNull(cKMethodResultOptional8);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}" + "'", str21, "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
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
        org.eclipse.jdt.core.dom.StringLiteral stringLiteral15 = null;
        boolean boolean16 = cKVisitor4.visit(stringLiteral15);
        org.eclipse.jdt.core.dom.MethodDeclaration methodDeclaration17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = cKVisitor4.visit(methodDeclaration17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
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
        org.eclipse.jdt.core.dom.AnnotationTypeMemberDeclaration annotationTypeMemberDeclaration23 = null;
        boolean boolean24 = cKVisitor4.visit(annotationTypeMemberDeclaration23);
        org.eclipse.jdt.core.dom.SuperFieldAccess superFieldAccess25 = null;
        cKVisitor4.endVisit(superFieldAccess25);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
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
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit15 = null;
        boolean boolean16 = cKVisitor4.visit(compilationUnit15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
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
        org.eclipse.jdt.core.dom.MemberRef memberRef19 = null;
        boolean boolean20 = cKVisitor4.visit(memberRef19);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getFanout();
        java.util.Set<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultSet8 = cKClassResult4.getVisibleMethods();
        int int9 = cKClassResult4.getComparisonsQty();
        cKClassResult4.setInnerClassesQty((int) (short) 100);
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit13 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable14 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable15 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor16 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit13, classLevelMetricListCallable14, methodLevelMetricListCallable15);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression17 = null;
        cKVisitor16.endVisit(parenthesizedExpression17);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation19 = null;
        cKVisitor16.endVisit(arrayCreation19);
        org.eclipse.jdt.core.dom.ContinueStatement continueStatement21 = null;
        cKVisitor16.endVisit(continueStatement21);
        org.eclipse.jdt.core.dom.NullLiteral nullLiteral23 = null;
        cKVisitor16.endVisit(nullLiteral23);
        org.eclipse.jdt.core.dom.AnnotationTypeDeclaration annotationTypeDeclaration25 = null;
        boolean boolean26 = cKVisitor16.visit(annotationTypeDeclaration25);
        boolean boolean27 = cKClassResult4.equals((java.lang.Object) boolean26);
        cKClassResult4.setNumberOfPrivateMethods((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(cKMethodResultSet8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setStringLiteralsQty((int) (byte) 1);
        java.util.Optional<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultOptional8 = cKClassResult4.getMethod("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
        cKClassResult4.setReturnQty((int) '4');
        cKClassResult4.setNumberOfSynchronizedFields((int) '#');
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult17 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet18 = cKMethodResult17.getMethodInvocations();
        int int19 = cKMethodResult17.getMaxNestedBlocks();
        int int20 = cKMethodResult17.getModifiers();
        cKClassResult4.addMethod(cKMethodResult17);
        int int22 = cKMethodResult17.getAnonymousClassesQty();
        org.junit.Assert.assertNotNull(cKMethodResultOptional8);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getUniqueWordsQty();
        int int7 = cKClassResult4.getUniqueWordsQty();
        cKClassResult4.setNumberOfFields((int) (byte) 0);
        int int10 = cKClassResult4.getLoc();
        float float11 = cKClassResult4.getLcomNormalized();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setStringLiteralsQty((int) (byte) 1);
        java.util.Optional<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultOptional8 = cKClassResult4.getMethod("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
        cKClassResult4.setLooseClassCohesion((float) 10L);
        cKClassResult4.setFanin((int) 'a');
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult17 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet18 = cKMethodResult17.getMethodInvocations();
        java.util.Set<java.lang.String> strSet19 = cKMethodResult17.getMethodInvocationsLocal();
        java.util.Set<java.lang.String> strSet20 = cKMethodResult17.getFieldsAccessed();
        int int21 = cKMethodResult17.getComparisonsQty();
        cKMethodResult17.setLoc((-1));
        cKMethodResult17.setFanin((int) (byte) 1);
        boolean boolean26 = cKClassResult4.equals((java.lang.Object) (byte) 1);
        org.junit.Assert.assertNotNull(cKMethodResultOptional8);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNull(strSet19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getMaxNestedBlocks();
        cKClassResult4.setNosi(100);
        int int8 = cKClassResult4.getNumberOfAbstractMethods();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
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
        org.eclipse.jdt.core.dom.ASTNode aSTNode23 = null;
        boolean boolean24 = cKVisitor4.preVisit2(aSTNode23);
        org.eclipse.jdt.core.dom.ThisExpression thisExpression25 = null;
        cKVisitor4.endVisit(thisExpression25);
        org.eclipse.jdt.core.dom.ModuleQualifiedName moduleQualifiedName27 = null;
        boolean boolean28 = cKVisitor4.visit(moduleQualifiedName27);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
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
        org.eclipse.jdt.core.dom.QualifiedType qualifiedType15 = null;
        cKVisitor4.endVisit(qualifiedType15);
        org.eclipse.jdt.core.dom.ModuleDeclaration moduleDeclaration17 = null;
        boolean boolean18 = cKVisitor4.visit(moduleDeclaration17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "hi!", false, (int) (byte) 0);
        cKMethodResult4.setFanout(1);
        cKMethodResult4.setMathOperationsQty((int) (short) 1);
        java.util.Map<java.lang.String, java.util.Set<java.lang.String>> strMap9 = null;
        cKMethodResult4.setMethodInvocationsIndirectLocal(strMap9);
        int int11 = cKMethodResult4.getLambdasQty();
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult16 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int17 = cKMethodResult16.getUniqueWordsQty();
        cKMethodResult16.setUniqueWordsQty((int) (byte) 10);
        int int20 = cKMethodResult16.getLogStatementsQty();
        boolean boolean21 = cKMethodResult16.isConstructor();
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult26 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int27 = cKMethodResult26.getUniqueWordsQty();
        int int28 = cKMethodResult26.getNumbersQty();
        int int29 = cKMethodResult26.getStartLine();
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult34 = new com.github.mauricioaniche.ck.CKMethodResult("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", true, 0);
        cKMethodResult34.setCbo(0);
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult41 = new com.github.mauricioaniche.ck.CKMethodResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", true, 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap42 = cKMethodResult41.getVariablesUsage();
        cKMethodResult34.setFieldUsage(strMap42);
        cKMethodResult26.setVariablesUsage(strMap42);
        cKMethodResult16.setVariablesUsage(strMap42);
        cKMethodResult4.setFieldUsage(strMap42);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(strMap42);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        com.github.mauricioaniche.ck.ResultWriter resultWriter5 = new com.github.mauricioaniche.ck.ResultWriter("hi!", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKClassResult [file=, className=CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}]", "CKMethodResult{cbo=10, rfc=0, wmc=0, methodName='hi!'}", true);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getUniqueWordsQty();
        int int6 = cKMethodResult4.getAssignmentsQty();
        cKMethodResult4.setTryCatchQty((int) (byte) 0);
        java.lang.String str9 = cKMethodResult4.getMethodName();
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = null;
        cKMethodResult4.setVariablesUsage(strMap10);
        cKMethodResult4.setReturnQty(35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
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
        org.eclipse.jdt.core.dom.Javadoc javadoc23 = null;
        cKVisitor4.endVisit(javadoc23);
        org.eclipse.jdt.core.dom.NumberLiteral numberLiteral25 = null;
        boolean boolean26 = cKVisitor4.visit(numberLiteral25);
        org.eclipse.jdt.core.dom.LabeledStatement labeledStatement27 = null;
        boolean boolean28 = cKVisitor4.visit(labeledStatement27);
        org.eclipse.jdt.core.dom.PrefixExpression prefixExpression29 = null;
        boolean boolean30 = cKVisitor4.visit(prefixExpression29);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
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
        org.eclipse.jdt.core.dom.Javadoc javadoc23 = null;
        cKVisitor4.endVisit(javadoc23);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "hi!", false, (int) (byte) 0);
        cKMethodResult4.setFanout(1);
        cKMethodResult4.setCbo(10);
        cKMethodResult4.setAssignmentsQty(0);
        int int11 = cKMethodResult4.getRfc();
        int int12 = cKMethodResult4.getMaxNestedBlocks();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getUniqueWordsQty();
        int int7 = cKClassResult4.getUniqueWordsQty();
        int int8 = cKClassResult4.getNosi();
        cKClassResult4.setVariablesQty(100);
        int int11 = cKClassResult4.getCbo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
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
        org.eclipse.jdt.core.dom.OpensDirective opensDirective29 = null;
        boolean boolean30 = cKVisitor4.visit(opensDirective29);
        org.eclipse.jdt.core.dom.TypeMethodReference typeMethodReference31 = null;
        cKVisitor4.endVisit(typeMethodReference31);
        org.eclipse.jdt.core.dom.CreationReference creationReference33 = null;
        cKVisitor4.endVisit(creationReference33);
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
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
        org.eclipse.jdt.core.dom.MemberValuePair memberValuePair19 = null;
        boolean boolean20 = cKVisitor4.visit(memberValuePair19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
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
        metricsExecutor3.acceptBinding("CKMethodResult{cbo=10, rfc=0, wmc=0, methodName='hi!'}", iBinding17);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(iBindingArray10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(iBindingArray15);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.LambdaExpression lambdaExpression5 = null;
        cKVisitor4.endVisit(lambdaExpression5);
        org.eclipse.jdt.core.dom.ReturnStatement returnStatement7 = null;
        cKVisitor4.endVisit(returnStatement7);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation9 = null;
        cKVisitor4.endVisit(arrayCreation9);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        cKMethodResult4.setLoc((int) (byte) 100);
        cKMethodResult4.setTryCatchQty((int) (byte) -1);
        int int9 = cKMethodResult4.getNumbersQty();
        int int10 = cKMethodResult4.getWmc();
        cKMethodResult4.setLogStatementsQty((int) ' ');
        java.util.Set<java.lang.String> strSet13 = cKMethodResult4.getMethodInvocations();
        cKMethodResult4.setStartLine((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
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
        org.eclipse.jdt.core.dom.MethodDeclaration methodDeclaration23 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(methodDeclaration23);
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
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
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
        org.eclipse.jdt.core.dom.TypeDeclarationStatement typeDeclarationStatement21 = null;
        cKVisitor4.endVisit(typeDeclarationStatement21);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getComparisonsQty();
        cKMethodResult4.setReturnQty((int) (byte) -1);
        cKMethodResult4.setCboModified((int) (byte) 100);
        int int10 = cKMethodResult4.getFanout();
        int int11 = cKMethodResult4.getTryCatchQty();
        java.lang.String str12 = cKMethodResult4.toString();
        int int13 = cKMethodResult4.getStartLine();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}" + "'", str12, "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
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
        org.eclipse.jdt.core.dom.NullLiteral nullLiteral19 = null;
        cKVisitor4.endVisit(nullLiteral19);
        org.eclipse.jdt.core.dom.AssertStatement assertStatement21 = null;
        cKVisitor4.endVisit(assertStatement21);
        org.eclipse.jdt.core.dom.NullLiteral nullLiteral23 = null;
        cKVisitor4.endVisit(nullLiteral23);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        cKClassResult4.setInnerClassesQty((int) (short) 100);
        cKClassResult4.setMathOperationsQty((int) '#');
        int int10 = cKClassResult4.getLambdasQty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
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
        org.eclipse.jdt.core.dom.TypeLiteral typeLiteral15 = null;
        boolean boolean16 = cKVisitor4.visit(typeLiteral15);
        org.eclipse.jdt.core.dom.ThisExpression thisExpression17 = null;
        boolean boolean18 = cKVisitor4.visit(thisExpression17);
        org.eclipse.jdt.core.dom.ModuleDeclaration moduleDeclaration19 = null;
        cKVisitor4.endVisit(moduleDeclaration19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getUniqueWordsQty();
        int int6 = cKMethodResult4.getNumbersQty();
        int int7 = cKMethodResult4.getStartLine();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cKMethodResult4.getFieldUsage();
        cKMethodResult4.setRfc(0);
        int int11 = cKMethodResult4.getModifiers();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
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
        org.eclipse.jdt.core.dom.MethodInvocation methodInvocation17 = null;
        cKVisitor4.endVisit(methodInvocation17);
        org.eclipse.jdt.core.dom.QualifiedName qualifiedName19 = null;
        boolean boolean20 = cKVisitor4.visit(qualifiedName19);
        org.eclipse.jdt.core.dom.EnhancedForStatement enhancedForStatement21 = null;
        boolean boolean22 = cKVisitor4.visit(enhancedForStatement21);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getUniqueWordsQty();
        int int7 = cKClassResult4.getUniqueWordsQty();
        int int8 = cKClassResult4.getNumberOfStaticFields();
        int int9 = cKClassResult4.getNumberOfAbstractMethods();
        int int10 = cKClassResult4.getWmc();
        cKClassResult4.setAssignmentsQty((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getFanout();
        cKClassResult4.setNumberOfPublicMethods((int) (short) -1);
        java.lang.String str10 = cKClassResult4.getType();
        cKClassResult4.setNumberOfFinalFields((int) ' ');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}" + "'", str10, "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.CastExpression castExpression7 = null;
        cKVisitor4.endVisit(castExpression7);
        org.eclipse.jdt.core.dom.YieldStatement yieldStatement9 = null;
        boolean boolean10 = cKVisitor4.visit(yieldStatement9);
        org.eclipse.jdt.core.dom.SimpleType simpleType11 = null;
        cKVisitor4.endVisit(simpleType11);
        org.eclipse.jdt.core.dom.ThrowStatement throwStatement13 = null;
        boolean boolean14 = cKVisitor4.visit(throwStatement13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
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
        org.eclipse.jdt.core.dom.MethodRefParameter methodRefParameter11 = null;
        boolean boolean12 = cKVisitor4.visit(methodRefParameter11);
        org.eclipse.jdt.core.dom.SimpleType simpleType13 = null;
        boolean boolean14 = cKVisitor4.visit(simpleType13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
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
        cKMethodResult4.setParenthesizedExpsQty(52);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        cKClassResult4.setInnerClassesQty((int) (short) 100);
        cKClassResult4.setParenthesizedExpsQty((int) '4');
        cKClassResult4.setNumberOfPrivateMethods((int) '4');
        java.util.Optional<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultOptional13 = cKClassResult4.getMethod("");
        cKClassResult4.setLcom(0);
        cKClassResult4.setNumberOfFinalMethods((int) (byte) 0);
        cKClassResult4.setLogStatementsQty((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(cKMethodResultOptional13);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
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
        org.eclipse.jdt.core.dom.SwitchStatement switchStatement13 = null;
        boolean boolean14 = cKVisitor4.visit(switchStatement13);
        org.eclipse.jdt.core.dom.Initializer initializer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = cKVisitor4.visit(initializer15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
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
        org.eclipse.jdt.core.dom.CreationReference creationReference16 = null;
        boolean boolean17 = cKVisitor4.visit(creationReference16);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(cKClassResultSet15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
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
        org.eclipse.jdt.core.dom.VariableDeclarationExpression variableDeclarationExpression17 = null;
        cKVisitor4.endVisit(variableDeclarationExpression17);
        org.eclipse.jdt.core.dom.SimpleName simpleName19 = null;
        boolean boolean20 = cKVisitor4.visit(simpleName19);
        org.eclipse.jdt.core.dom.MethodInvocation methodInvocation21 = null;
        boolean boolean22 = cKVisitor4.visit(methodInvocation21);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
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
        org.eclipse.jdt.core.dom.QualifiedType qualifiedType15 = null;
        cKVisitor4.endVisit(qualifiedType15);
        org.eclipse.jdt.core.dom.MethodInvocation methodInvocation17 = null;
        cKVisitor4.endVisit(methodInvocation17);
        org.eclipse.jdt.core.dom.Dimension dimension19 = null;
        boolean boolean20 = cKVisitor4.visit(dimension19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getInnerClassesQty();
        cKClassResult4.setLogStatementsQty(0);
        int int8 = cKClassResult4.getAssignmentsQty();
        cKClassResult4.setNumberOfMethods((int) (short) -1);
        cKClassResult4.setNumberOfFields((int) ' ');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getUniqueWordsQty();
        int int7 = cKClassResult4.getUniqueWordsQty();
        int int8 = cKClassResult4.getNosi();
        int int9 = cKClassResult4.getNumberOfDefaultFields();
        int int10 = cKClassResult4.getFanin();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        float float5 = cKClassResult4.getTightClassCohesion();
        int int6 = cKClassResult4.getNumberOfProtectedMethods();
        int int7 = cKClassResult4.getNoc();
        int int8 = cKClassResult4.getParenthesizedExpsQty();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        cKMethodResult4.setLoc((int) (byte) 100);
        cKMethodResult4.setNumbersQty((-1));
        java.lang.String str9 = cKMethodResult4.toString();
        java.util.Map<java.lang.String, java.util.Set<java.lang.String>> strMap10 = cKMethodResult4.getMethodInvocationsIndirectLocal();
        int int11 = cKMethodResult4.getNumbersQty();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}" + "'", str9, "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getMaxNestedBlocks();
        int int6 = cKClassResult4.getMathOperationsQty();
        cKClassResult4.setNumberOfAbstractMethods(0);
        int int9 = cKClassResult4.getParenthesizedExpsQty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
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
        org.eclipse.jdt.core.dom.ASTNode aSTNode21 = null;
        cKVisitor4.postVisit(aSTNode21);
        org.eclipse.jdt.core.dom.NumberLiteral numberLiteral23 = null;
        cKVisitor4.endVisit(numberLiteral23);
        org.eclipse.jdt.core.dom.TypeDeclarationStatement typeDeclarationStatement25 = null;
        boolean boolean26 = cKVisitor4.visit(typeDeclarationStatement25);
        org.eclipse.jdt.core.dom.Modifier modifier27 = null;
        cKVisitor4.endVisit(modifier27);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
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
        cKMethodResult14.setNumbersQty((int) 'a');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getUniqueWordsQty();
        cKMethodResult4.setUniqueWordsQty((int) (byte) 10);
        cKMethodResult4.setAnonymousClassesQty((int) (short) 1);
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult14 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet15 = cKMethodResult14.getMethodInvocations();
        cKMethodResult4.setMethodInvocationLocal(strSet15);
        cKMethodResult4.setAssignmentsQty((int) (byte) -1);
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult23 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "hi!", false, (int) (byte) 0);
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult28 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int29 = cKMethodResult28.getLambdasQty();
        java.util.Set<java.lang.String> strSet30 = cKMethodResult28.getMethodInvocations();
        cKMethodResult23.setMethodInvocations(strSet30);
        cKMethodResult4.setMethodInvocations(strSet30);
        cKMethodResult4.setHasJavadoc(true);
        int int35 = cKMethodResult4.getReturnQty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
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
        org.eclipse.jdt.core.dom.RecordDeclaration recordDeclaration19 = null;
        cKVisitor4.endVisit(recordDeclaration19);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ASTNode aSTNode5 = null;
        boolean boolean6 = cKVisitor4.preVisit2(aSTNode5);
        org.eclipse.jdt.core.dom.SwitchStatement switchStatement7 = null;
        boolean boolean8 = cKVisitor4.visit(switchStatement7);
        org.eclipse.jdt.core.dom.NullLiteral nullLiteral9 = null;
        cKVisitor4.endVisit(nullLiteral9);
        org.eclipse.jdt.core.dom.TextBlock textBlock11 = null;
        boolean boolean12 = cKVisitor4.visit(textBlock11);
        org.eclipse.jdt.core.dom.CreationReference creationReference13 = null;
        boolean boolean14 = cKVisitor4.visit(creationReference13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
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
        org.eclipse.jdt.core.dom.SuperMethodInvocation superMethodInvocation37 = null;
        boolean boolean38 = cKVisitor13.visit(superMethodInvocation37);
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
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getLcom();
        cKClassResult4.setLcom((int) '#');
        cKClassResult4.setLoc((int) (byte) 10);
        cKClassResult4.setReturnQty(0);
        cKClassResult4.setCboModified((-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
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
        org.eclipse.jdt.core.dom.OpensDirective opensDirective15 = null;
        cKVisitor4.endVisit(opensDirective15);
        org.eclipse.jdt.core.dom.ReturnStatement returnStatement17 = null;
        cKVisitor4.endVisit(returnStatement17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getLcom();
        cKClassResult4.setLcom((int) '#');
        int int10 = cKClassResult4.getNumberOfPublicFields();
        cKClassResult4.setNumberOfProtectedFields((int) (short) 10);
        int int13 = cKClassResult4.getRfc();
        int int14 = cKClassResult4.getNumberOfPublicMethods();
        cKClassResult4.setNumberOfPublicMethods((int) (short) -1);
        cKClassResult4.setCboModified((-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
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
        org.eclipse.jdt.core.dom.ExpressionStatement expressionStatement13 = null;
        cKVisitor4.endVisit(expressionStatement13);
        org.eclipse.jdt.core.dom.RecordDeclaration recordDeclaration15 = null;
        cKVisitor4.endVisit(recordDeclaration15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getLcom();
        cKClassResult4.setLcom((int) '#');
        cKClassResult4.setUniqueWordsQty(10);
        int int12 = cKClassResult4.getNumberOfAbstractMethods();
        int int13 = cKClassResult4.getNumberOfProtectedFields();
        int int14 = cKClassResult4.getNumberOfDefaultMethods();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
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
        cKClassResult4.setNoc((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
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
        org.eclipse.jdt.core.dom.VariableDeclarationFragment variableDeclarationFragment23 = null;
        boolean boolean24 = cKVisitor4.visit(variableDeclarationFragment23);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setLogStatementsQty(10);
        int int7 = cKClassResult4.getRfc();
        cKClassResult4.setAnonymousClassesQty((int) '4');
        int int10 = cKClassResult4.getNumberOfProtectedMethods();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getInnerClassesQty();
        cKClassResult4.setLogStatementsQty(0);
        int int8 = cKClassResult4.getNumbersQty();
        int int9 = cKClassResult4.getParenthesizedExpsQty();
        int int10 = cKClassResult4.getNumberOfAbstractMethods();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
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
        org.eclipse.jdt.core.dom.BlockComment blockComment27 = null;
        cKVisitor4.endVisit(blockComment27);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
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
        int int18 = cKClassResult4.getVariablesQty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
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
        org.eclipse.jdt.core.dom.TypeMethodReference typeMethodReference15 = null;
        cKVisitor4.endVisit(typeMethodReference15);
        org.eclipse.jdt.core.dom.ExpressionMethodReference expressionMethodReference17 = null;
        cKVisitor4.endVisit(expressionMethodReference17);
        org.eclipse.jdt.core.dom.CharacterLiteral characterLiteral19 = null;
        boolean boolean20 = cKVisitor4.visit(characterLiteral19);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
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
        org.eclipse.jdt.core.dom.LabeledStatement labeledStatement15 = null;
        cKVisitor4.endVisit(labeledStatement15);
        org.eclipse.jdt.core.dom.SuperConstructorInvocation superConstructorInvocation17 = null;
        boolean boolean18 = cKVisitor4.visit(superConstructorInvocation17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
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
        org.eclipse.jdt.core.dom.ArrayAccess arrayAccess19 = null;
        boolean boolean20 = cKVisitor4.visit(arrayAccess19);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
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
        org.eclipse.jdt.core.dom.OpensDirective opensDirective11 = null;
        cKVisitor4.endVisit(opensDirective11);
        org.eclipse.jdt.core.dom.Javadoc javadoc13 = null;
        boolean boolean14 = cKVisitor4.visit(javadoc13);
        org.eclipse.jdt.core.dom.CreationReference creationReference15 = null;
        cKVisitor4.endVisit(creationReference15);
        org.eclipse.jdt.core.dom.MethodRefParameter methodRefParameter17 = null;
        boolean boolean18 = cKVisitor4.visit(methodRefParameter17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
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
        int int18 = cKClassResult4.getLoc();
        java.lang.String str19 = cKClassResult4.getClassName();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}" + "'", str19, "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        cKClassResult4.setRfc(0);
        cKClassResult4.setNumberOfDefaultFields(0);
        int int10 = cKClassResult4.getNumberOfPublicMethods();
        com.github.mauricioaniche.ck.CKClassResult cKClassResult15 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        float float16 = cKClassResult15.getTightClassCohesion();
        cKClassResult15.setAssignmentsQty((int) (short) -1);
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult23 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int24 = cKMethodResult23.getUniqueWordsQty();
        cKMethodResult23.setUniqueWordsQty((int) (byte) 10);
        cKMethodResult23.setAnonymousClassesQty((int) (short) 1);
        java.util.Set<java.lang.String> strSet29 = cKMethodResult23.getFieldsAccessed();
        cKClassResult15.setFieldNames(strSet29);
        cKClassResult4.setFieldNames(strSet29);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(strSet29);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        float float5 = cKClassResult4.getTightClassCohesion();
        int int6 = cKClassResult4.getNumberOfPublicMethods();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
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
        org.eclipse.jdt.core.dom.ExpressionStatement expressionStatement25 = null;
        boolean boolean26 = cKVisitor4.visit(expressionStatement25);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getLcom();
        cKClassResult4.setLcom((int) '#');
        cKClassResult4.setUniqueWordsQty(10);
        int int12 = cKClassResult4.getNumberOfAbstractMethods();
        int int13 = cKClassResult4.getNumberOfProtectedFields();
        int int14 = cKClassResult4.getNumberOfFinalMethods();
        float float15 = cKClassResult4.getLcomNormalized();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
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
        org.eclipse.jdt.core.dom.VariableDeclarationExpression variableDeclarationExpression19 = null;
        cKVisitor4.endVisit(variableDeclarationExpression19);
        org.eclipse.jdt.core.dom.ModuleQualifiedName moduleQualifiedName21 = null;
        cKVisitor4.endVisit(moduleQualifiedName21);
        org.eclipse.jdt.core.dom.NameQualifiedType nameQualifiedType23 = null;
        cKVisitor4.endVisit(nameQualifiedType23);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
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
        org.eclipse.jdt.core.dom.CreationReference creationReference13 = null;
        cKVisitor4.endVisit(creationReference13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", true, (int) '4');
        int int5 = cKMethodResult4.getCboModified();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        java.util.Set<java.lang.String> strSet6 = cKMethodResult4.getFieldsAccessed();
        int int7 = cKMethodResult4.getMaxNestedBlocks();
        cKMethodResult4.setComparisonsQty((int) 'a');
        int int10 = cKMethodResult4.getStartLine();
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
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
        org.eclipse.jdt.core.dom.OpensDirective opensDirective29 = null;
        boolean boolean30 = cKVisitor4.visit(opensDirective29);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation31 = null;
        boolean boolean32 = cKVisitor4.visit(arrayCreation31);
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setAnonymousClassesQty((int) (byte) -1);
        int int7 = cKClassResult4.getNumberOfSynchronizedFields();
        cKClassResult4.setLoopQty(1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
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
        org.eclipse.jdt.core.dom.TypeDeclarationStatement typeDeclarationStatement15 = null;
        boolean boolean16 = cKVisitor4.visit(typeDeclarationStatement15);
        org.eclipse.jdt.core.dom.ConstructorInvocation constructorInvocation17 = null;
        boolean boolean18 = cKVisitor4.visit(constructorInvocation17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
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
        org.eclipse.jdt.core.dom.LineComment lineComment17 = null;
        cKVisitor4.endVisit(lineComment17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
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
        int int16 = cKMethodResult4.getFanin();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "hi!", false, (int) (byte) 0);
        cKMethodResult4.setFanout(1);
        int int7 = cKMethodResult4.getParenthesizedExpsQty();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
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
        org.eclipse.jdt.core.dom.TypeLiteral typeLiteral13 = null;
        boolean boolean14 = cKVisitor4.visit(typeLiteral13);
        org.eclipse.jdt.core.dom.ProvidesDirective providesDirective15 = null;
        boolean boolean16 = cKVisitor4.visit(providesDirective15);
        org.eclipse.jdt.core.dom.StringLiteral stringLiteral17 = null;
        cKVisitor4.endVisit(stringLiteral17);
        org.eclipse.jdt.core.dom.ParameterizedType parameterizedType19 = null;
        cKVisitor4.endVisit(parameterizedType19);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.DoStatement doStatement5 = null;
        boolean boolean6 = cKVisitor4.visit(doStatement5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
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
        org.eclipse.jdt.core.dom.ModuleQualifiedName moduleQualifiedName23 = null;
        boolean boolean24 = cKVisitor4.visit(moduleQualifiedName23);
        org.eclipse.jdt.core.dom.BreakStatement breakStatement25 = null;
        cKVisitor4.endVisit(breakStatement25);
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
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
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
        org.eclipse.jdt.core.dom.FieldDeclaration fieldDeclaration21 = null;
        cKVisitor4.endVisit(fieldDeclaration21);
        org.eclipse.jdt.core.dom.MemberValuePair memberValuePair23 = null;
        cKVisitor4.endVisit(memberValuePair23);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "", (int) '#');
        cKClassResult4.setCbo((int) (byte) 100);
        cKClassResult4.setNumberOfFinalMethods(35);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        java.util.Set<java.lang.String> strSet6 = cKMethodResult4.getMethodInvocationsLocal();
        java.util.Set<java.lang.String> strSet7 = cKMethodResult4.getFieldsAccessed();
        java.lang.String str8 = cKMethodResult4.getQualifiedMethodName();
        cKMethodResult4.setStartLine(10);
        int int11 = cKMethodResult4.getModifiers();
        int int12 = cKMethodResult4.getWmc();
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
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
        org.eclipse.jdt.core.dom.RequiresDirective requiresDirective17 = null;
        cKVisitor4.endVisit(requiresDirective17);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
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
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression11 = null;
        cKVisitor4.endVisit(parenthesizedExpression11);
        org.eclipse.jdt.core.dom.ExportsDirective exportsDirective13 = null;
        cKVisitor4.endVisit(exportsDirective13);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
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
        org.eclipse.jdt.core.dom.FieldAccess fieldAccess21 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(fieldAccess21);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
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
        org.eclipse.jdt.core.dom.CastExpression castExpression13 = null;
        boolean boolean14 = cKVisitor4.visit(castExpression13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("CKMethodResult{cbo=10, rfc=0, wmc=0, methodName='hi!'}", "CKClassResult [file=, className=CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}]", false, (int) (short) 0);
        cKMethodResult4.setUniqueWordsQty((int) (byte) 0);
        cKMethodResult4.setLambdasQty((int) (byte) 1);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getComparisonsQty();
        cKMethodResult4.setReturnQty((int) (byte) -1);
        cKMethodResult4.setCboModified((int) (byte) 100);
        int int10 = cKMethodResult4.getReturnQty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "hi!", false, (int) (byte) 0);
        cKMethodResult4.setWmc((int) (byte) 100);
        int int7 = cKMethodResult4.getMaxNestedBlocks();
        int int8 = cKMethodResult4.getMathOperationsQty();
        cKMethodResult4.setVariablesQty((int) '4');
        java.util.Map<java.lang.String, java.util.Set<java.lang.String>> strMap11 = null;
        cKMethodResult4.setMethodInvocationsIndirectLocal(strMap11);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
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
        org.eclipse.jdt.core.dom.NullLiteral nullLiteral17 = null;
        cKVisitor4.endVisit(nullLiteral17);
        org.eclipse.jdt.core.dom.ExpressionMethodReference expressionMethodReference19 = null;
        boolean boolean20 = cKVisitor4.visit(expressionMethodReference19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
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
        org.eclipse.jdt.core.dom.MethodRefParameter methodRefParameter11 = null;
        boolean boolean12 = cKVisitor4.visit(methodRefParameter11);
        org.eclipse.jdt.core.dom.TextElement textElement13 = null;
        cKVisitor4.endVisit(textElement13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
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
        org.eclipse.jdt.core.dom.ASTNode aSTNode23 = null;
        boolean boolean24 = cKVisitor4.preVisit2(aSTNode23);
        org.eclipse.jdt.core.dom.ThisExpression thisExpression25 = null;
        cKVisitor4.endVisit(thisExpression25);
        org.eclipse.jdt.core.dom.SuperMethodInvocation superMethodInvocation27 = null;
        cKVisitor4.endVisit(superMethodInvocation27);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getLcom();
        cKClassResult4.setLcom((int) '#');
        int int10 = cKClassResult4.getLoopQty();
        cKClassResult4.setNosi((int) (short) -1);
        cKClassResult4.setLoopQty(0);
        int int15 = cKClassResult4.getAnonymousClassesQty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
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
        org.eclipse.jdt.core.dom.ProvidesDirective providesDirective21 = null;
        boolean boolean22 = cKVisitor4.visit(providesDirective21);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
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
        org.eclipse.jdt.core.dom.Javadoc javadoc13 = null;
        boolean boolean14 = cKVisitor4.visit(javadoc13);
        org.eclipse.jdt.core.dom.NormalAnnotation normalAnnotation15 = null;
        boolean boolean16 = cKVisitor4.visit(normalAnnotation15);
        org.eclipse.jdt.core.dom.TryStatement tryStatement17 = null;
        cKVisitor4.endVisit(tryStatement17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
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
        org.eclipse.jdt.core.dom.ForStatement forStatement19 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(forStatement19);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
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
        org.eclipse.jdt.core.dom.ReturnStatement returnStatement17 = null;
        boolean boolean18 = cKVisitor4.visit(returnStatement17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
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
        int int31 = cKMethodResult4.getCbo();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNull(strMap30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
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
        org.eclipse.jdt.core.dom.AssertStatement assertStatement27 = null;
        boolean boolean28 = cKVisitor4.visit(assertStatement27);
        org.eclipse.jdt.core.dom.SwitchCase switchCase29 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(switchCase29);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getLcom();
        cKClassResult4.setLcom((int) '#');
        int int10 = cKClassResult4.getLoopQty();
        cKClassResult4.setNosi((int) (short) -1);
        cKClassResult4.setNumberOfFields((int) 'a');
        java.lang.String str15 = cKClassResult4.getClassName();
        int int16 = cKClassResult4.getNumberOfPrivateMethods();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}" + "'", str15, "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getMaxNestedBlocks();
        cKClassResult4.setReturnQty((int) (byte) 10);
        int int8 = cKClassResult4.getNumberOfVisibleMethods();
        cKClassResult4.setNumberOfStaticMethods((-1));
        int int11 = cKClassResult4.getNumberOfProtectedFields();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getLcom();
        cKClassResult4.setLcom((int) '#');
        cKClassResult4.setDit(10);
        cKClassResult4.setFanout((int) '#');
        cKClassResult4.setNumberOfStaticMethods(0);
        int int16 = cKClassResult4.getUniqueWordsQty();
        cKClassResult4.setNumberOfPublicFields(0);
        int int19 = cKClassResult4.getNumberOfSynchronizedFields();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getLcom();
        cKClassResult4.setLcom((int) '#');
        cKClassResult4.setUniqueWordsQty(10);
        cKClassResult4.setParenthesizedExpsQty((int) (short) -1);
        cKClassResult4.setLogStatementsQty((int) (byte) -1);
        float float16 = cKClassResult4.getLcomNormalized();
        java.util.Optional<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultOptional18 = cKClassResult4.getMethod("");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertNotNull(cKMethodResultOptional18);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
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
        org.eclipse.jdt.core.dom.NullLiteral nullLiteral21 = null;
        boolean boolean22 = cKVisitor4.visit(nullLiteral21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
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
        cKMethodResult14.setStringLiteralsQty((int) '4');
        cKMethodResult14.setHasJavadoc(true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", true, 0);
        cKMethodResult4.setCbo(0);
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult11 = new com.github.mauricioaniche.ck.CKMethodResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", true, 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cKMethodResult11.getVariablesUsage();
        cKMethodResult4.setFieldUsage(strMap12);
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = cKMethodResult4.getVariablesUsage();
        cKMethodResult4.setUniqueWordsQty((int) (byte) -1);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
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
        cKClassResult4.setNumbersQty(52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setAnonymousClassesQty((int) (byte) -1);
        int int7 = cKClassResult4.getNumberOfSynchronizedFields();
        int int8 = cKClassResult4.getCboModified();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getLambdasQty();
        java.util.Set<java.lang.String> strSet6 = cKMethodResult4.getMethodInvocations();
        java.lang.String str7 = cKMethodResult4.toString();
        cKMethodResult4.setComparisonsQty((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}" + "'", str7, "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
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
        org.eclipse.jdt.core.dom.AnnotationTypeMemberDeclaration annotationTypeMemberDeclaration11 = null;
        cKVisitor4.endVisit(annotationTypeMemberDeclaration11);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        com.github.mauricioaniche.ck.CK cK3 = new com.github.mauricioaniche.ck.CK(true, (int) (byte) 0, true);
        com.github.mauricioaniche.ck.CKNotifier cKNotifier5 = null;
        cK3.calculate("hi!", cKNotifier5);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
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
        org.eclipse.jdt.core.dom.IntersectionType intersectionType21 = null;
        boolean boolean22 = cKVisitor4.visit(intersectionType21);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getLcom();
        cKClassResult4.setLcom((int) '#');
        int int10 = cKClassResult4.getNumberOfPublicFields();
        int int11 = cKClassResult4.getNumberOfPrivateMethods();
        cKClassResult4.setNumberOfProtectedMethods(52);
        cKClassResult4.setNosi((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
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
        org.eclipse.jdt.core.dom.Assignment assignment15 = null;
        boolean boolean16 = cKVisitor4.visit(assignment15);
        org.eclipse.jdt.core.dom.TextBlock textBlock17 = null;
        boolean boolean18 = cKVisitor4.visit(textBlock17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
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
        org.eclipse.jdt.core.dom.ProvidesDirective providesDirective11 = null;
        boolean boolean12 = cKVisitor4.visit(providesDirective11);
        org.eclipse.jdt.core.dom.EnumDeclaration enumDeclaration13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = cKVisitor4.visit(enumDeclaration13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
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
        org.eclipse.jdt.core.dom.NormalAnnotation normalAnnotation13 = null;
        cKVisitor4.endVisit(normalAnnotation13);
        org.eclipse.jdt.core.dom.ModuleQualifiedName moduleQualifiedName15 = null;
        cKVisitor4.endVisit(moduleQualifiedName15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getLcom();
        cKClassResult4.setLcom((int) '#');
        int int10 = cKClassResult4.getNumberOfPublicFields();
        cKClassResult4.setNumberOfProtectedFields((int) (short) 10);
        int int13 = cKClassResult4.getReturnQty();
        int int14 = cKClassResult4.getNumberOfPrivateFields();
        cKClassResult4.setCbo(52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getInnerClassesQty();
        cKClassResult4.setLogStatementsQty(0);
        int int8 = cKClassResult4.getAssignmentsQty();
        cKClassResult4.setNumberOfMethods((int) (short) -1);
        int int11 = cKClassResult4.getNoc();
        int int12 = cKClassResult4.getUniqueWordsQty();
        cKClassResult4.setComparisonsQty((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
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
        org.eclipse.jdt.core.dom.ModuleQualifiedName moduleQualifiedName25 = null;
        boolean boolean26 = cKVisitor4.visit(moduleQualifiedName25);
        org.eclipse.jdt.core.dom.ImportDeclaration importDeclaration27 = null;
        cKVisitor4.endVisit(importDeclaration27);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getFanout();
        java.util.Set<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultSet8 = cKClassResult4.getVisibleMethods();
        int int9 = cKClassResult4.getComparisonsQty();
        cKClassResult4.setInnerClassesQty((int) (short) 100);
        cKClassResult4.setAnonymousClassesQty((int) (short) 100);
        int int14 = cKClassResult4.getAssignmentsQty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(cKMethodResultSet8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
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
        org.eclipse.jdt.core.dom.EnumConstantDeclaration enumConstantDeclaration11 = null;
        cKVisitor4.endVisit(enumConstantDeclaration11);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ASTNode aSTNode5 = null;
        boolean boolean6 = cKVisitor4.preVisit2(aSTNode5);
        org.eclipse.jdt.core.dom.VariableDeclarationFragment variableDeclarationFragment7 = null;
        boolean boolean8 = cKVisitor4.visit(variableDeclarationFragment7);
        org.eclipse.jdt.core.dom.CharacterLiteral characterLiteral9 = null;
        cKVisitor4.endVisit(characterLiteral9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getMaxNestedBlocks();
        java.lang.String str6 = cKClassResult4.getClassName();
        cKClassResult4.setNumberOfPublicMethods((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}" + "'", str6, "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
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
        org.eclipse.jdt.core.dom.OpensDirective opensDirective21 = null;
        cKVisitor4.endVisit(opensDirective21);
        org.eclipse.jdt.core.dom.WhileStatement whileStatement23 = null;
        boolean boolean24 = cKVisitor4.visit(whileStatement23);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
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
        cKClassResult4.setLogStatementsQty((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "hi!", false, (int) (byte) 0);
        cKMethodResult4.setFanout(1);
        cKMethodResult4.setCbo(10);
        boolean boolean9 = cKMethodResult4.isConstructor();
        int int10 = cKMethodResult4.getReturnQty();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        com.github.mauricioaniche.ck.CK cK3 = new com.github.mauricioaniche.ck.CK(true, (int) (byte) 0, true);
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
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
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
        org.eclipse.jdt.core.dom.InfixExpression infixExpression15 = null;
        boolean boolean16 = cKVisitor4.visit(infixExpression15);
        org.eclipse.jdt.core.dom.SwitchCase switchCase17 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(switchCase17);
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
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
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
        org.eclipse.jdt.core.dom.CastExpression castExpression18 = null;
        cKVisitor4.endVisit(castExpression18);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(cKClassResultSet11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
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
        org.eclipse.jdt.core.dom.SuperMethodReference superMethodReference17 = null;
        boolean boolean18 = cKVisitor4.visit(superMethodReference17);
        org.eclipse.jdt.core.dom.AnonymousClassDeclaration anonymousClassDeclaration19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = cKVisitor4.visit(anonymousClassDeclaration19);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
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
        org.eclipse.jdt.core.dom.MemberValuePair memberValuePair13 = null;
        boolean boolean14 = cKVisitor4.visit(memberValuePair13);
        org.eclipse.jdt.core.dom.CharacterLiteral characterLiteral15 = null;
        boolean boolean16 = cKVisitor4.visit(characterLiteral15);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
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
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation19 = null;
        cKVisitor4.endVisit(arrayCreation19);
        org.eclipse.jdt.core.dom.MethodDeclaration methodDeclaration21 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(methodDeclaration21);
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
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
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
        org.eclipse.jdt.core.dom.TryStatement tryStatement23 = null;
        boolean boolean24 = cKVisitor4.visit(tryStatement23);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getComparisonsQty();
        cKMethodResult4.setReturnQty((int) (byte) -1);
        cKMethodResult4.setCboModified((int) (byte) 100);
        int int10 = cKMethodResult4.getLoopQty();
        cKMethodResult4.setWmc((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
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
        org.eclipse.jdt.core.dom.BlockComment blockComment17 = null;
        boolean boolean18 = cKVisitor4.visit(blockComment17);
        org.eclipse.jdt.core.dom.ProvidesDirective providesDirective19 = null;
        cKVisitor4.endVisit(providesDirective19);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
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
        org.eclipse.jdt.core.dom.MarkerAnnotation markerAnnotation15 = null;
        cKVisitor4.endVisit(markerAnnotation15);
        org.eclipse.jdt.core.dom.QualifiedType qualifiedType17 = null;
        cKVisitor4.endVisit(qualifiedType17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
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
        org.eclipse.jdt.core.dom.FieldAccess fieldAccess17 = null;
        boolean boolean18 = cKVisitor4.visit(fieldAccess17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
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
        org.eclipse.jdt.core.dom.FieldDeclaration fieldDeclaration19 = null;
        cKVisitor4.endVisit(fieldDeclaration19);
        org.eclipse.jdt.core.dom.NumberLiteral numberLiteral21 = null;
        cKVisitor4.endVisit(numberLiteral21);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setStringLiteralsQty((-1));
        int int7 = cKClassResult4.getCbo();
        cKClassResult4.setNumberOfAbstractMethods(100);
        cKClassResult4.setNumberOfFinalFields(10);
        int int12 = cKClassResult4.getNumberOfDefaultFields();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setStringLiteralsQty((int) (byte) 1);
        java.util.Optional<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultOptional8 = cKClassResult4.getMethod("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
        int int9 = cKClassResult4.getLoopQty();
        int int10 = cKClassResult4.getFanin();
        cKClassResult4.setAnonymousClassesQty((int) (short) 0);
        cKClassResult4.setLcom((int) (byte) 10);
        cKClassResult4.setNumberOfSynchronizedFields(10);
        cKClassResult4.setNumbersQty((int) (short) 1);
        java.lang.String str19 = cKClassResult4.toString();
        org.junit.Assert.assertNotNull(cKMethodResultOptional8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "CKClassResult [file=, className=CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}]" + "'", str19, "CKClassResult [file=, className=CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}]");
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.NameQualifiedType nameQualifiedType9 = null;
        cKVisitor4.endVisit(nameQualifiedType9);
        org.eclipse.jdt.core.dom.MemberValuePair memberValuePair11 = null;
        boolean boolean12 = cKVisitor4.visit(memberValuePair11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
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
        org.eclipse.jdt.core.dom.ClassInstanceCreation classInstanceCreation18 = null;
        boolean boolean19 = cKVisitor4.visit(classInstanceCreation18);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(cKClassResultSet15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
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
        org.eclipse.jdt.core.dom.Javadoc javadoc11 = null;
        cKVisitor4.endVisit(javadoc11);
        org.eclipse.jdt.core.dom.Dimension dimension13 = null;
        cKVisitor4.endVisit(dimension13);
        org.eclipse.jdt.core.dom.ExportsDirective exportsDirective15 = null;
        boolean boolean16 = cKVisitor4.visit(exportsDirective15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
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
        org.eclipse.jdt.core.dom.SimpleName simpleName21 = null;
        boolean boolean22 = cKVisitor4.visit(simpleName21);
        org.eclipse.jdt.core.dom.BlockComment blockComment23 = null;
        boolean boolean24 = cKVisitor4.visit(blockComment23);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
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
        cKClassResult4.setTryCatchQty((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(strSet14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
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
        int int16 = cKClassResult4.getStringLiteralsQty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setAnonymousClassesQty((int) (byte) -1);
        int int7 = cKClassResult4.getNumberOfSynchronizedFields();
        cKClassResult4.setRfc((-1));
        cKClassResult4.setNumberOfFields(10);
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult16 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet17 = cKMethodResult16.getMethodInvocations();
        java.util.Set<java.lang.String> strSet18 = cKMethodResult16.getMethodInvocationsLocal();
        int int19 = cKMethodResult16.getLambdasQty();
        cKMethodResult16.setLambdasQty((int) (short) -1);
        boolean boolean22 = cKClassResult4.equals((java.lang.Object) cKMethodResult16);
        int int23 = cKClassResult4.getReturnQty();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(strSet18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getUniqueWordsQty();
        cKMethodResult4.setUniqueWordsQty((int) (byte) 10);
        cKMethodResult4.setAnonymousClassesQty((int) (short) 1);
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult14 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet15 = cKMethodResult14.getMethodInvocations();
        cKMethodResult4.setMethodInvocationLocal(strSet15);
        cKMethodResult4.setAssignmentsQty((int) (byte) -1);
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult23 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "hi!", false, (int) (byte) 0);
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult28 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int29 = cKMethodResult28.getLambdasQty();
        java.util.Set<java.lang.String> strSet30 = cKMethodResult28.getMethodInvocations();
        cKMethodResult23.setMethodInvocations(strSet30);
        cKMethodResult4.setMethodInvocations(strSet30);
        java.lang.String str33 = cKMethodResult4.getQualifiedMethodName();
        cKMethodResult4.setFanin(0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
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
        java.util.Map<java.lang.String, java.lang.Integer> strMap23 = cKMethodResult15.getVariablesUsage();
        cKMethodResult15.setUniqueWordsQty((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strMap23);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
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
        org.eclipse.jdt.core.dom.FieldDeclaration fieldDeclaration17 = null;
        cKVisitor4.endVisit(fieldDeclaration17);
        org.eclipse.jdt.core.dom.TypeDeclaration typeDeclaration19 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(typeDeclaration19);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
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
        org.eclipse.jdt.core.dom.TypeLiteral typeLiteral15 = null;
        boolean boolean16 = cKVisitor4.visit(typeLiteral15);
        org.eclipse.jdt.core.dom.TypeMethodReference typeMethodReference17 = null;
        cKVisitor4.endVisit(typeMethodReference17);
        org.eclipse.jdt.core.dom.EnumConstantDeclaration enumConstantDeclaration19 = null;
        boolean boolean20 = cKVisitor4.visit(enumConstantDeclaration19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
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
        org.eclipse.jdt.core.dom.UsesDirective usesDirective19 = null;
        cKVisitor4.endVisit(usesDirective19);
        org.eclipse.jdt.core.dom.ConstructorInvocation constructorInvocation21 = null;
        cKVisitor4.endVisit(constructorInvocation21);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable0 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable1 = null;
        com.github.mauricioaniche.ck.CKNotifier cKNotifier2 = null;
        com.github.mauricioaniche.ck.MetricsExecutor metricsExecutor3 = new com.github.mauricioaniche.ck.MetricsExecutor(classLevelMetricListCallable0, methodLevelMetricListCallable1, cKNotifier2);
        org.eclipse.jdt.core.dom.IBinding iBinding5 = null;
        metricsExecutor3.acceptBinding("CKMethodResult{cbo=10, rfc=0, wmc=0, methodName='hi!'}", iBinding5);
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable7 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable8 = null;
        com.github.mauricioaniche.ck.CKNotifier cKNotifier9 = null;
        com.github.mauricioaniche.ck.MetricsExecutor metricsExecutor10 = new com.github.mauricioaniche.ck.MetricsExecutor(classLevelMetricListCallable7, methodLevelMetricListCallable8, cKNotifier9);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "CKMethodResult{cbo=10, rfc=0, wmc=0, methodName='hi!'}", "hi!", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=10, rfc=0, wmc=0, methodName='hi!'}" };
        org.eclipse.jdt.core.dom.IBinding[] iBindingArray17 = metricsExecutor10.createBindings(strArray16);
        org.eclipse.jdt.core.dom.IBinding iBinding19 = null;
        metricsExecutor10.acceptBinding("CKMethodResult{cbo=10, rfc=0, wmc=0, methodName='hi!'}", iBinding19);
        java.lang.String[] strArray21 = new java.lang.String[] {};
        org.eclipse.jdt.core.dom.IBinding[] iBindingArray22 = metricsExecutor10.createBindings(strArray21);
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable23 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable24 = null;
        com.github.mauricioaniche.ck.CKNotifier cKNotifier25 = null;
        com.github.mauricioaniche.ck.MetricsExecutor metricsExecutor26 = new com.github.mauricioaniche.ck.MetricsExecutor(classLevelMetricListCallable23, methodLevelMetricListCallable24, cKNotifier25);
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        org.eclipse.jdt.core.dom.IBinding[] iBindingArray29 = metricsExecutor26.createBindings(strArray28);
        org.eclipse.jdt.core.dom.IBinding[] iBindingArray30 = metricsExecutor10.createBindings(strArray28);
        org.eclipse.jdt.core.dom.IBinding[] iBindingArray31 = metricsExecutor3.createBindings(strArray28);
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit33 = null;
        // The following exception was thrown during execution in test generation
        try {
            metricsExecutor3.acceptAST("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(iBindingArray17);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(iBindingArray22);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(iBindingArray29);
        org.junit.Assert.assertNotNull(iBindingArray30);
        org.junit.Assert.assertNotNull(iBindingArray31);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
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
        org.eclipse.jdt.core.dom.CreationReference creationReference27 = null;
        cKVisitor4.endVisit(creationReference27);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
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
        org.eclipse.jdt.core.dom.QualifiedType qualifiedType15 = null;
        cKVisitor4.endVisit(qualifiedType15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.SuperMethodReference superMethodReference7 = null;
        cKVisitor4.endVisit(superMethodReference7);
        org.eclipse.jdt.core.dom.NumberLiteral numberLiteral9 = null;
        cKVisitor4.endVisit(numberLiteral9);
        org.eclipse.jdt.core.dom.PrimitiveType primitiveType11 = null;
        boolean boolean12 = cKVisitor4.visit(primitiveType11);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
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
        org.eclipse.jdt.core.dom.EnumConstantDeclaration enumConstantDeclaration21 = null;
        cKVisitor4.endVisit(enumConstantDeclaration21);
        org.eclipse.jdt.core.dom.TypeParameter typeParameter23 = null;
        boolean boolean24 = cKVisitor4.visit(typeParameter23);
        org.eclipse.jdt.core.dom.SuperConstructorInvocation superConstructorInvocation25 = null;
        cKVisitor4.endVisit(superConstructorInvocation25);
        org.eclipse.jdt.core.dom.TypeDeclaration typeDeclaration27 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = cKVisitor4.visit(typeDeclaration27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
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
        org.eclipse.jdt.core.dom.MemberValuePair memberValuePair15 = null;
        cKVisitor4.endVisit(memberValuePair15);
        org.eclipse.jdt.core.dom.FieldDeclaration fieldDeclaration17 = null;
        boolean boolean18 = cKVisitor4.visit(fieldDeclaration17);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getUniqueWordsQty();
        int int7 = cKClassResult4.getUniqueWordsQty();
        int int8 = cKClassResult4.getNumberOfStaticFields();
        cKClassResult4.setNosi((int) (byte) 100);
        int int11 = cKClassResult4.getNumbersQty();
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit13 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable14 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable15 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor16 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit13, classLevelMetricListCallable14, methodLevelMetricListCallable15);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression17 = null;
        cKVisitor16.endVisit(parenthesizedExpression17);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation19 = null;
        cKVisitor16.endVisit(arrayCreation19);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression21 = null;
        cKVisitor16.endVisit(patternInstanceofExpression21);
        org.eclipse.jdt.core.dom.InstanceofExpression instanceofExpression23 = null;
        cKVisitor16.endVisit(instanceofExpression23);
        org.eclipse.jdt.core.dom.ParameterizedType parameterizedType25 = null;
        boolean boolean26 = cKVisitor16.visit(parameterizedType25);
        boolean boolean27 = cKClassResult4.equals((java.lang.Object) cKVisitor16);
        cKClassResult4.setAnonymousClassesQty(0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
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
        org.eclipse.jdt.core.dom.MemberValuePair memberValuePair21 = null;
        boolean boolean22 = cKVisitor4.visit(memberValuePair21);
        org.eclipse.jdt.core.dom.TypeLiteral typeLiteral23 = null;
        boolean boolean24 = cKVisitor4.visit(typeLiteral23);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
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
        org.eclipse.jdt.core.dom.PrimitiveType primitiveType25 = null;
        cKVisitor4.endVisit(primitiveType25);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setStringLiteralsQty((int) (byte) 1);
        java.util.Optional<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultOptional8 = cKClassResult4.getMethod("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
        cKClassResult4.setLooseClassCohesion((float) 10L);
        int int11 = cKClassResult4.getLoc();
        org.junit.Assert.assertNotNull(cKMethodResultOptional8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
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
        org.eclipse.jdt.core.dom.YieldStatement yieldStatement25 = null;
        cKVisitor4.endVisit(yieldStatement25);
        org.eclipse.jdt.core.dom.ModuleModifier moduleModifier27 = null;
        boolean boolean28 = cKVisitor4.visit(moduleModifier27);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "hi!", false, (int) (byte) 0);
        cKMethodResult4.setWmc((int) (byte) 100);
        int int7 = cKMethodResult4.getMaxNestedBlocks();
        int int8 = cKMethodResult4.getMathOperationsQty();
        cKMethodResult4.setVariablesQty((int) '4');
        cKMethodResult4.setFanout((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
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
        org.eclipse.jdt.core.dom.CatchClause catchClause15 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(catchClause15);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ASTNode aSTNode5 = null;
        boolean boolean6 = cKVisitor4.preVisit2(aSTNode5);
        org.eclipse.jdt.core.dom.UsesDirective usesDirective7 = null;
        cKVisitor4.endVisit(usesDirective7);
        org.eclipse.jdt.core.dom.QualifiedName qualifiedName9 = null;
        boolean boolean10 = cKVisitor4.visit(qualifiedName9);
        org.eclipse.jdt.core.dom.BooleanLiteral booleanLiteral11 = null;
        cKVisitor4.endVisit(booleanLiteral11);
        org.eclipse.jdt.core.dom.VariableDeclarationFragment variableDeclarationFragment13 = null;
        boolean boolean14 = cKVisitor4.visit(variableDeclarationFragment13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
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
        org.eclipse.jdt.core.dom.IBinding iBinding18 = null;
        metricsExecutor13.acceptBinding("CKClassResult [file=, className=CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}]", iBinding18);
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable20 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable21 = null;
        com.github.mauricioaniche.ck.CKNotifier cKNotifier22 = null;
        com.github.mauricioaniche.ck.MetricsExecutor metricsExecutor23 = new com.github.mauricioaniche.ck.MetricsExecutor(classLevelMetricListCallable20, methodLevelMetricListCallable21, cKNotifier22);
        java.lang.String[] strArray25 = new java.lang.String[] { "" };
        org.eclipse.jdt.core.dom.IBinding[] iBindingArray26 = metricsExecutor23.createBindings(strArray25);
        org.eclipse.jdt.core.dom.IBinding[] iBindingArray27 = metricsExecutor13.createBindings(strArray25);
        org.eclipse.jdt.core.dom.IBinding[] iBindingArray28 = metricsExecutor3.createBindings(strArray25);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(iBindingArray6);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(iBindingArray16);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(iBindingArray26);
        org.junit.Assert.assertNotNull(iBindingArray27);
        org.junit.Assert.assertNotNull(iBindingArray28);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setStringLiteralsQty((int) (byte) 1);
        cKClassResult4.setNumberOfStaticMethods(100);
        cKClassResult4.setLogStatementsQty(0);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getUniqueWordsQty();
        cKMethodResult4.setUniqueWordsQty((int) (byte) 100);
        cKMethodResult4.setFanin((int) (byte) 100);
        cKMethodResult4.setTryCatchQty((int) (short) 0);
        int int12 = cKMethodResult4.getLoc();
        cKMethodResult4.setNumbersQty((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
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
        org.eclipse.jdt.core.dom.RecordDeclaration recordDeclaration25 = null;
        boolean boolean26 = cKVisitor4.visit(recordDeclaration25);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
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
        org.eclipse.jdt.core.dom.SynchronizedStatement synchronizedStatement11 = null;
        cKVisitor4.endVisit(synchronizedStatement11);
        org.eclipse.jdt.core.dom.MarkerAnnotation markerAnnotation13 = null;
        cKVisitor4.endVisit(markerAnnotation13);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getFanout();
        java.util.Set<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultSet8 = cKClassResult4.getVisibleMethods();
        int int9 = cKClassResult4.getComparisonsQty();
        cKClassResult4.setNumbersQty((int) (short) 10);
        int int12 = cKClassResult4.getNumberOfSynchronizedMethods();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(cKMethodResultSet8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ASTNode aSTNode5 = null;
        boolean boolean6 = cKVisitor4.preVisit2(aSTNode5);
        org.eclipse.jdt.core.dom.VariableDeclarationFragment variableDeclarationFragment7 = null;
        boolean boolean8 = cKVisitor4.visit(variableDeclarationFragment7);
        org.eclipse.jdt.core.dom.TagElement tagElement9 = null;
        boolean boolean10 = cKVisitor4.visit(tagElement9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression5 = null;
        boolean boolean6 = cKVisitor4.visit(patternInstanceofExpression5);
        org.eclipse.jdt.core.dom.FieldAccess fieldAccess7 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(fieldAccess7);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        com.github.mauricioaniche.ck.ResultWriter resultWriter5 = new com.github.mauricioaniche.ck.ResultWriter("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=10, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=10, rfc=0, wmc=0, methodName='hi!'}", "hi!", false);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
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
        org.eclipse.jdt.core.dom.IfStatement ifStatement13 = null;
        boolean boolean14 = cKVisitor4.visit(ifStatement13);
        org.eclipse.jdt.core.dom.StringLiteral stringLiteral15 = null;
        boolean boolean16 = cKVisitor4.visit(stringLiteral15);
        org.eclipse.jdt.core.dom.EnumDeclaration enumDeclaration17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = cKVisitor4.visit(enumDeclaration17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
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
        org.eclipse.jdt.core.dom.Javadoc javadoc23 = null;
        cKVisitor4.endVisit(javadoc23);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        java.util.Set<java.lang.String> strSet6 = cKMethodResult4.getMethodInvocationsLocal();
        int int7 = cKMethodResult4.getLambdasQty();
        boolean boolean8 = cKMethodResult4.getIsVisible();
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        java.util.Set<java.lang.String> strSet6 = cKMethodResult4.getMethodInvocationsLocal();
        int int7 = cKMethodResult4.getLambdasQty();
        int int8 = cKMethodResult4.getWmc();
        cKMethodResult4.setReturnQty((int) '4');
        cKMethodResult4.setAssignmentsQty(0);
        boolean boolean13 = cKMethodResult4.getIsVisible();
        int int14 = cKMethodResult4.getComparisonsQty();
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        cKMethodResult4.setLoc((int) (byte) 100);
        cKMethodResult4.setTryCatchQty((int) (byte) -1);
        int int9 = cKMethodResult4.getNumbersQty();
        int int10 = cKMethodResult4.getWmc();
        cKMethodResult4.setLogStatementsQty((int) ' ');
        cKMethodResult4.setParametersQty((int) (short) 10);
        java.util.Map<java.lang.String, java.util.Set<java.lang.String>> strMap15 = null;
        cKMethodResult4.setMethodInvocationsIndirectLocal(strMap15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
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
        org.eclipse.jdt.core.dom.PrefixExpression prefixExpression11 = null;
        cKVisitor4.endVisit(prefixExpression11);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getUniqueWordsQty();
        cKMethodResult4.setUniqueWordsQty((int) (byte) 10);
        int int8 = cKMethodResult4.getLogStatementsQty();
        boolean boolean9 = cKMethodResult4.isConstructor();
        int int10 = cKMethodResult4.getMathOperationsQty();
        boolean boolean11 = cKMethodResult4.isConstructor();
        int int12 = cKMethodResult4.getRfc();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
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
        org.eclipse.jdt.core.dom.MemberValuePair memberValuePair17 = null;
        cKVisitor4.endVisit(memberValuePair17);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
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
        org.eclipse.jdt.core.dom.SuperMethodReference superMethodReference17 = null;
        cKVisitor4.endVisit(superMethodReference17);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
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
        org.eclipse.jdt.core.dom.ConstructorInvocation constructorInvocation17 = null;
        boolean boolean18 = cKVisitor4.visit(constructorInvocation17);
        org.eclipse.jdt.core.dom.CastExpression castExpression19 = null;
        boolean boolean20 = cKVisitor4.visit(castExpression19);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getUniqueWordsQty();
        int int6 = cKMethodResult4.getNumbersQty();
        int int7 = cKMethodResult4.getStartLine();
        java.util.Map<java.lang.String, java.util.Set<java.lang.String>> strMap8 = cKMethodResult4.getMethodInvocationsIndirectLocal();
        cKMethodResult4.setLogStatementsQty((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(strMap8);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
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
        org.eclipse.jdt.core.dom.InfixExpression infixExpression18 = null;
        cKVisitor4.endVisit(infixExpression18);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(cKClassResultSet15);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
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
        org.eclipse.jdt.core.dom.TypeLiteral typeLiteral13 = null;
        boolean boolean14 = cKVisitor4.visit(typeLiteral13);
        org.eclipse.jdt.core.dom.TypeDeclarationStatement typeDeclarationStatement15 = null;
        boolean boolean16 = cKVisitor4.visit(typeDeclarationStatement15);
        org.eclipse.jdt.core.dom.TextBlock textBlock17 = null;
        cKVisitor4.endVisit(textBlock17);
        org.eclipse.jdt.core.dom.SynchronizedStatement synchronizedStatement19 = null;
        boolean boolean20 = cKVisitor4.visit(synchronizedStatement19);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
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
        org.eclipse.jdt.core.dom.TextBlock textBlock21 = null;
        cKVisitor4.endVisit(textBlock21);
        org.eclipse.jdt.core.dom.VariableDeclarationStatement variableDeclarationStatement23 = null;
        cKVisitor4.endVisit(variableDeclarationStatement23);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
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
        cKClassResult4.setNumberOfProtectedMethods(0);
        cKClassResult4.setNumberOfAbstractMethods((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getLambdasQty();
        int int6 = cKMethodResult4.getFanout();
        boolean boolean7 = cKMethodResult4.getIsVisible();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
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
        org.eclipse.jdt.core.dom.ThrowStatement throwStatement21 = null;
        boolean boolean22 = cKVisitor4.visit(throwStatement21);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
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
        org.eclipse.jdt.core.dom.SwitchCase switchCase25 = null;
        boolean boolean26 = cKVisitor4.visit(switchCase25);
        org.eclipse.jdt.core.dom.ImportDeclaration importDeclaration27 = null;
        cKVisitor4.endVisit(importDeclaration27);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        cKMethodResult4.setLoc((int) (byte) 100);
        cKMethodResult4.setTryCatchQty((int) (byte) -1);
        int int9 = cKMethodResult4.getWmc();
        int int10 = cKMethodResult4.getLoc();
        int int11 = cKMethodResult4.getModifiers();
        java.lang.String str12 = cKMethodResult4.getQualifiedMethodName();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
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
        org.eclipse.jdt.core.dom.MethodRef methodRef17 = null;
        cKVisitor4.endVisit(methodRef17);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getMaxNestedBlocks();
        int int6 = cKClassResult4.getNumberOfProtectedMethods();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setAnonymousClassesQty((int) (byte) -1);
        int int7 = cKClassResult4.getNumberOfSynchronizedFields();
        cKClassResult4.setAssignmentsQty((int) (byte) 1);
        int int10 = cKClassResult4.getRfc();
        cKClassResult4.setNumberOfDefaultFields(0);
        cKClassResult4.setDit((int) 'a');
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getRfc();
        cKClassResult4.setFanout((int) '#');
        int int8 = cKClassResult4.getNumberOfProtectedFields();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getUniqueWordsQty();
        int int7 = cKClassResult4.getUniqueWordsQty();
        int int8 = cKClassResult4.getNumberOfStaticFields();
        int int9 = cKClassResult4.getComparisonsQty();
        int int10 = cKClassResult4.getParenthesizedExpsQty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        com.github.mauricioaniche.ck.ResultWriter resultWriter5 = new com.github.mauricioaniche.ck.ResultWriter("CKClassResult [file=, className=CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}]", "CKMethodResult{cbo=10, rfc=0, wmc=0, methodName='hi!'}", "CKClassResult [file=, className=CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}]", "CKClassResult [file=, className=CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}]", false);
        com.github.mauricioaniche.ck.CKClassResult cKClassResult10 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int11 = cKClassResult10.getNumberOfFinalFields();
        int int12 = cKClassResult10.getLoc();
        int int13 = cKClassResult10.getNumberOfPublicFields();
        cKClassResult10.setNoc(0);
        resultWriter5.printResult(cKClassResult10);
        com.github.mauricioaniche.ck.CKClassResult cKClassResult21 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult21.setStringLiteralsQty((-1));
        int int24 = cKClassResult21.getMaxNestedBlocks();
        int int25 = cKClassResult21.getNumberOfAbstractMethods();
        resultWriter5.printResult(cKClassResult21);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
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
        org.eclipse.jdt.core.dom.QualifiedType qualifiedType25 = null;
        boolean boolean26 = cKVisitor4.visit(qualifiedType25);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "hi!", false, (int) (byte) 0);
        cKMethodResult4.setFanout(1);
        cKMethodResult4.setCbo(10);
        int int9 = cKMethodResult4.getAnonymousClassesQty();
        cKMethodResult4.setTryCatchQty((int) (short) 100);
        cKMethodResult4.setInnerClassesQty((int) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = cKMethodResult4.getVariablesUsage();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
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
        org.eclipse.jdt.core.dom.ExpressionStatement expressionStatement13 = null;
        cKVisitor4.endVisit(expressionStatement13);
        org.eclipse.jdt.core.dom.TypeParameter typeParameter15 = null;
        boolean boolean16 = cKVisitor4.visit(typeParameter15);
        org.eclipse.jdt.core.dom.SuperConstructorInvocation superConstructorInvocation17 = null;
        boolean boolean18 = cKVisitor4.visit(superConstructorInvocation17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
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
        org.eclipse.jdt.core.dom.RequiresDirective requiresDirective13 = null;
        cKVisitor4.endVisit(requiresDirective13);
        org.eclipse.jdt.core.dom.EmptyStatement emptyStatement15 = null;
        cKVisitor4.endVisit(emptyStatement15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
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
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation15 = null;
        boolean boolean16 = cKVisitor4.visit(arrayCreation15);
        org.eclipse.jdt.core.dom.QualifiedName qualifiedName17 = null;
        boolean boolean18 = cKVisitor4.visit(qualifiedName17);
        org.eclipse.jdt.core.dom.SwitchStatement switchStatement19 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(switchStatement19);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKClassResult [file=, className=CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}]", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.RecordDeclaration recordDeclaration5 = null;
        boolean boolean6 = cKVisitor4.visit(recordDeclaration5);
        org.eclipse.jdt.core.dom.SingleVariableDeclaration singleVariableDeclaration7 = null;
        cKVisitor4.endVisit(singleVariableDeclaration7);
        org.eclipse.jdt.core.dom.NameQualifiedType nameQualifiedType9 = null;
        cKVisitor4.endVisit(nameQualifiedType9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
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
        org.eclipse.jdt.core.dom.MethodInvocation methodInvocation13 = null;
        boolean boolean14 = cKVisitor4.visit(methodInvocation13);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.CastExpression castExpression7 = null;
        cKVisitor4.endVisit(castExpression7);
        org.eclipse.jdt.core.dom.YieldStatement yieldStatement9 = null;
        boolean boolean10 = cKVisitor4.visit(yieldStatement9);
        org.eclipse.jdt.core.dom.SimpleType simpleType11 = null;
        cKVisitor4.endVisit(simpleType11);
        org.eclipse.jdt.core.dom.EnumDeclaration enumDeclaration13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = cKVisitor4.visit(enumDeclaration13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        int int6 = cKMethodResult4.getStringLiteralsQty();
        cKMethodResult4.setComparisonsQty(100);
        cKMethodResult4.setLambdasQty((int) (short) -1);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
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
        cKClassResult4.setNumberOfProtectedMethods(0);
        int int27 = cKClassResult4.getCboModified();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
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
        org.eclipse.jdt.core.dom.StringLiteral stringLiteral13 = null;
        cKVisitor4.endVisit(stringLiteral13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
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
        org.eclipse.jdt.core.dom.SynchronizedStatement synchronizedStatement19 = null;
        cKVisitor4.endVisit(synchronizedStatement19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        // The following exception was thrown during execution in test generation
        try {
            com.github.mauricioaniche.ck.ResultWriter resultWriter5 = new com.github.mauricioaniche.ck.ResultWriter("hi!", "", "CKClassResult [file=, className=CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}]", "", false);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
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
        org.eclipse.jdt.core.dom.SuperConstructorInvocation superConstructorInvocation15 = null;
        boolean boolean16 = cKVisitor4.visit(superConstructorInvocation15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
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
        org.eclipse.jdt.core.dom.MemberValuePair memberValuePair21 = null;
        boolean boolean22 = cKVisitor4.visit(memberValuePair21);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getComparisonsQty();
        cKMethodResult4.setReturnQty((int) (byte) -1);
        cKMethodResult4.setCboModified((int) (byte) 100);
        int int10 = cKMethodResult4.getFanout();
        int int11 = cKMethodResult4.getLoopQty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getUniqueWordsQty();
        int int7 = cKClassResult4.getUniqueWordsQty();
        cKClassResult4.setNumberOfProtectedMethods(52);
        cKClassResult4.setTightClassCohesion((float) 1);
        java.util.Set<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultSet12 = cKClassResult4.getVisibleMethods();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(cKMethodResultSet12);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
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
        org.eclipse.jdt.core.dom.RecordDeclaration recordDeclaration17 = null;
        cKVisitor4.endVisit(recordDeclaration17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.CastExpression castExpression7 = null;
        cKVisitor4.endVisit(castExpression7);
        org.eclipse.jdt.core.dom.ExpressionMethodReference expressionMethodReference9 = null;
        cKVisitor4.endVisit(expressionMethodReference9);
        org.eclipse.jdt.core.dom.DoStatement doStatement11 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(doStatement11);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "hi!", false, (int) (byte) 0);
        cKMethodResult4.setFanout(1);
        cKMethodResult4.setCbo(10);
        int int9 = cKMethodResult4.getCbo();
        java.lang.String str10 = cKMethodResult4.toString();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CKMethodResult{cbo=10, rfc=0, wmc=0, methodName='hi!'}" + "'", str10, "CKMethodResult{cbo=10, rfc=0, wmc=0, methodName='hi!'}");
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        cKMethodResult4.setLoc((int) (byte) 100);
        cKMethodResult4.setTryCatchQty((int) (byte) -1);
        int int9 = cKMethodResult4.getNumbersQty();
        cKMethodResult4.setAnonymousClassesQty((int) '#');
        cKMethodResult4.setStartLine((int) (byte) -1);
        cKMethodResult4.setAnonymousClassesQty((int) (short) 1);
        int int16 = cKMethodResult4.getLambdasQty();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
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
        int int23 = cKClassResult4.getNumberOfPrivateMethods();
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
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
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
        org.eclipse.jdt.core.dom.SuperMethodReference superMethodReference21 = null;
        cKVisitor4.endVisit(superMethodReference21);
        org.eclipse.jdt.core.dom.SuperFieldAccess superFieldAccess23 = null;
        boolean boolean24 = cKVisitor4.visit(superFieldAccess23);
        org.eclipse.jdt.core.dom.SimpleName simpleName25 = null;
        cKVisitor4.endVisit(simpleName25);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getUniqueWordsQty();
        int int6 = cKMethodResult4.getAssignmentsQty();
        cKMethodResult4.setTryCatchQty((int) (byte) 0);
        java.lang.String str9 = cKMethodResult4.getMethodName();
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = null;
        cKMethodResult4.setVariablesUsage(strMap10);
        cKMethodResult4.setHasJavadoc(false);
        int int14 = cKMethodResult4.getLambdasQty();
        cKMethodResult4.setParenthesizedExpsQty(100);
        int int17 = cKMethodResult4.getStartLine();
        cKMethodResult4.setFanout(1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        java.util.Set<java.lang.String> strSet6 = cKMethodResult4.getMethodInvocationsLocal();
        cKMethodResult4.setHasJavadoc(false);
        int int9 = cKMethodResult4.getNumbersQty();
        boolean boolean10 = cKMethodResult4.getHasJavadoc();
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
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
        org.eclipse.jdt.core.dom.IntersectionType intersectionType23 = null;
        boolean boolean24 = cKVisitor4.visit(intersectionType23);
        org.eclipse.jdt.core.dom.SimpleType simpleType25 = null;
        cKVisitor4.endVisit(simpleType25);
        org.eclipse.jdt.core.dom.ContinueStatement continueStatement27 = null;
        boolean boolean28 = cKVisitor4.visit(continueStatement27);
        org.eclipse.jdt.core.dom.SingleVariableDeclaration singleVariableDeclaration29 = null;
        boolean boolean30 = cKVisitor4.visit(singleVariableDeclaration29);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        cKClassResult4.setNumbersQty((int) (short) 1);
        cKClassResult4.setNumberOfDefaultMethods((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
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
        org.eclipse.jdt.core.dom.TypeDeclarationStatement typeDeclarationStatement17 = null;
        cKVisitor4.endVisit(typeDeclarationStatement17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
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
        org.eclipse.jdt.core.dom.WildcardType wildcardType17 = null;
        boolean boolean18 = cKVisitor4.visit(wildcardType17);
        org.eclipse.jdt.core.dom.WhileStatement whileStatement19 = null;
        boolean boolean20 = cKVisitor4.visit(whileStatement19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        java.util.Set<java.lang.String> strSet6 = cKMethodResult4.getMethodInvocationsLocal();
        int int7 = cKMethodResult4.getWmc();
        java.util.Set<java.lang.String> strSet8 = cKMethodResult4.getMethodInvocations();
        int int9 = cKMethodResult4.getLambdasQty();
        cKMethodResult4.setFanout((int) (byte) 100);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        java.util.Set<java.lang.String> strSet6 = cKMethodResult4.getMethodInvocationsLocal();
        java.util.Set<java.lang.String> strSet7 = cKMethodResult4.getFieldsAccessed();
        int int8 = cKMethodResult4.getComparisonsQty();
        cKMethodResult4.setLoc((-1));
        cKMethodResult4.setFanin((int) (byte) 1);
        int int13 = cKMethodResult4.getWmc();
        int int14 = cKMethodResult4.getNumbersQty();
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
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
        org.eclipse.jdt.core.dom.SwitchStatement switchStatement19 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(switchStatement19);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
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
        org.eclipse.jdt.core.dom.SuperMethodInvocation superMethodInvocation21 = null;
        boolean boolean22 = cKVisitor4.visit(superMethodInvocation21);
        org.eclipse.jdt.core.dom.QualifiedName qualifiedName23 = null;
        boolean boolean24 = cKVisitor4.visit(qualifiedName23);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getUniqueWordsQty();
        java.lang.String str6 = cKMethodResult4.getQualifiedMethodName();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getRfc();
        int int6 = cKClassResult4.getUniqueWordsQty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getUniqueWordsQty();
        int int7 = cKClassResult4.getUniqueWordsQty();
        int int8 = cKClassResult4.getLcom();
        int int9 = cKClassResult4.getLambdasQty();
        cKClassResult4.setReturnQty((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
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
        org.eclipse.jdt.core.dom.MethodInvocation methodInvocation11 = null;
        cKVisitor4.endVisit(methodInvocation11);
        org.eclipse.jdt.core.dom.SuperFieldAccess superFieldAccess13 = null;
        cKVisitor4.endVisit(superFieldAccess13);
        org.eclipse.jdt.core.dom.SuperFieldAccess superFieldAccess15 = null;
        boolean boolean16 = cKVisitor4.visit(superFieldAccess15);
        org.eclipse.jdt.core.dom.TypeLiteral typeLiteral17 = null;
        cKVisitor4.endVisit(typeLiteral17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
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
        org.eclipse.jdt.core.dom.BooleanLiteral booleanLiteral13 = null;
        cKVisitor4.endVisit(booleanLiteral13);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
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
        org.eclipse.jdt.core.dom.PrefixExpression prefixExpression11 = null;
        cKVisitor4.endVisit(prefixExpression11);
        org.eclipse.jdt.core.dom.PackageDeclaration packageDeclaration13 = null;
        cKVisitor4.endVisit(packageDeclaration13);
        org.eclipse.jdt.core.dom.Modifier modifier15 = null;
        boolean boolean16 = cKVisitor4.visit(modifier15);
        org.eclipse.jdt.core.dom.ModuleQualifiedName moduleQualifiedName17 = null;
        cKVisitor4.endVisit(moduleQualifiedName17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
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
        org.eclipse.jdt.core.dom.ClassInstanceCreation classInstanceCreation19 = null;
        cKVisitor4.endVisit(classInstanceCreation19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setStringLiteralsQty((int) (byte) 1);
        java.util.Optional<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultOptional8 = cKClassResult4.getMethod("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
        int int9 = cKClassResult4.getLoopQty();
        cKClassResult4.setLcom(100);
        int int12 = cKClassResult4.getAssignmentsQty();
        cKClassResult4.setNoc((int) (byte) 0);
        int int15 = cKClassResult4.getVariablesQty();
        cKClassResult4.setUniqueWordsQty((int) (short) 100);
        org.junit.Assert.assertNotNull(cKMethodResultOptional8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
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
        org.eclipse.jdt.core.dom.ConditionalExpression conditionalExpression23 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(conditionalExpression23);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
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
        org.eclipse.jdt.core.dom.Initializer initializer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = cKVisitor4.visit(initializer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setAnonymousClassesQty((int) (byte) -1);
        int int7 = cKClassResult4.getNumberOfSynchronizedFields();
        cKClassResult4.setRfc((-1));
        cKClassResult4.setNumberOfFields(10);
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult16 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet17 = cKMethodResult16.getMethodInvocations();
        java.util.Set<java.lang.String> strSet18 = cKMethodResult16.getMethodInvocationsLocal();
        int int19 = cKMethodResult16.getLambdasQty();
        cKMethodResult16.setLambdasQty((int) (short) -1);
        boolean boolean22 = cKClassResult4.equals((java.lang.Object) cKMethodResult16);
        cKMethodResult16.setReturnQty((int) '#');
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(strSet18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
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
        org.eclipse.jdt.core.dom.FieldDeclaration fieldDeclaration11 = null;
        cKVisitor4.endVisit(fieldDeclaration11);
        org.eclipse.jdt.core.dom.ImportDeclaration importDeclaration13 = null;
        cKVisitor4.endVisit(importDeclaration13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setAnonymousClassesQty((int) (byte) -1);
        int int7 = cKClassResult4.getNumberOfSynchronizedFields();
        cKClassResult4.setAssignmentsQty((int) (byte) 1);
        int int10 = cKClassResult4.getRfc();
        cKClassResult4.setNumberOfAbstractMethods((int) '#');
        int int13 = cKClassResult4.getUniqueWordsQty();
        cKClassResult4.setNumberOfAbstractMethods((int) (byte) 100);
        int int16 = cKClassResult4.getNumberOfStaticMethods();
        int int17 = cKClassResult4.getMathOperationsQty();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
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
        org.eclipse.jdt.core.dom.OpensDirective opensDirective29 = null;
        boolean boolean30 = cKVisitor4.visit(opensDirective29);
        org.eclipse.jdt.core.dom.ExportsDirective exportsDirective31 = null;
        boolean boolean32 = cKVisitor4.visit(exportsDirective31);
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
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
        org.eclipse.jdt.core.dom.UsesDirective usesDirective19 = null;
        boolean boolean20 = cKVisitor4.visit(usesDirective19);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getComparisonsQty();
        cKMethodResult4.setReturnQty((int) (byte) -1);
        cKMethodResult4.setCboModified((int) (byte) 100);
        int int10 = cKMethodResult4.getFanout();
        int int11 = cKMethodResult4.getTryCatchQty();
        cKMethodResult4.setMaxNestedBlocks(35);
        cKMethodResult4.setParenthesizedExpsQty((int) (short) 10);
        cKMethodResult4.setWmc(0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.Javadoc javadoc5 = null;
        cKVisitor4.endVisit(javadoc5);
        org.eclipse.jdt.core.dom.ImportDeclaration importDeclaration7 = null;
        cKVisitor4.endVisit(importDeclaration7);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
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
        org.eclipse.jdt.core.dom.TypeDeclarationStatement typeDeclarationStatement15 = null;
        cKVisitor4.endVisit(typeDeclarationStatement15);
        org.eclipse.jdt.core.dom.ForStatement forStatement17 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(forStatement17);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        java.util.Set<java.lang.String> strSet6 = cKMethodResult4.getMethodInvocationsLocal();
        java.util.Set<java.lang.String> strSet7 = cKMethodResult4.getFieldsAccessed();
        java.lang.String str8 = cKMethodResult4.getQualifiedMethodName();
        cKMethodResult4.setStartLine(10);
        int int11 = cKMethodResult4.getTryCatchQty();
        boolean boolean12 = cKMethodResult4.getIsVisible();
        int int13 = cKMethodResult4.getComparisonsQty();
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
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
        org.eclipse.jdt.core.dom.WildcardType wildcardType17 = null;
        cKVisitor4.endVisit(wildcardType17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
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
        org.eclipse.jdt.core.dom.TypeLiteral typeLiteral15 = null;
        boolean boolean16 = cKVisitor4.visit(typeLiteral15);
        org.eclipse.jdt.core.dom.RecordDeclaration recordDeclaration17 = null;
        cKVisitor4.endVisit(recordDeclaration17);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getUniqueWordsQty();
        cKMethodResult4.setUniqueWordsQty((int) (byte) 100);
        cKMethodResult4.setFanin((int) (byte) 100);
        cKMethodResult4.setVariablesQty(52);
        boolean boolean12 = cKMethodResult4.isConstructor();
        int int13 = cKMethodResult4.getParenthesizedExpsQty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
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
        int int21 = cKClassResult4.getNumberOfMethods();
        cKClassResult4.setNumberOfFinalFields((int) (short) 100);
        cKClassResult4.setLcomNormalized((float) (byte) 1);
        org.junit.Assert.assertNotNull(cKMethodResultOptional8);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
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
        org.eclipse.jdt.core.dom.ThrowStatement throwStatement15 = null;
        boolean boolean16 = cKVisitor4.visit(throwStatement15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getUniqueWordsQty();
        cKMethodResult4.setUniqueWordsQty((int) (byte) 10);
        int int8 = cKMethodResult4.getLogStatementsQty();
        boolean boolean9 = cKMethodResult4.isConstructor();
        int int10 = cKMethodResult4.getMathOperationsQty();
        cKMethodResult4.setLoopQty(100);
        cKMethodResult4.setWmc((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        int int6 = cKMethodResult4.getStringLiteralsQty();
        cKMethodResult4.setInnerClassesQty((int) (short) -1);
        cKMethodResult4.setVariablesQty(100);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
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
        org.eclipse.jdt.core.dom.TagElement tagElement17 = null;
        cKVisitor4.endVisit(tagElement17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.lang.String str5 = cKMethodResult4.toString();
        int int6 = cKMethodResult4.getFanout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}" + "'", str5, "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
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
        boolean boolean20 = cKVisitor4.visit(arrayType19);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setAnonymousClassesQty((int) (byte) -1);
        int int7 = cKClassResult4.getNumberOfSynchronizedFields();
        cKClassResult4.setRfc((-1));
        cKClassResult4.setNosi(1);
        cKClassResult4.setComparisonsQty(100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
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
        org.eclipse.jdt.core.dom.TypeDeclarationStatement typeDeclarationStatement15 = null;
        cKVisitor4.endVisit(typeDeclarationStatement15);
        org.eclipse.jdt.core.dom.QualifiedType qualifiedType17 = null;
        cKVisitor4.endVisit(qualifiedType17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
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
        org.eclipse.jdt.core.dom.SuperMethodReference superMethodReference19 = null;
        cKVisitor4.endVisit(superMethodReference19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setStringLiteralsQty((int) (byte) 1);
        java.util.Optional<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultOptional8 = cKClassResult4.getMethod("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
        int int9 = cKClassResult4.getLoopQty();
        cKClassResult4.setLcom(100);
        int int12 = cKClassResult4.getAssignmentsQty();
        java.lang.String str13 = cKClassResult4.getClassName();
        org.junit.Assert.assertNotNull(cKMethodResultOptional8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}" + "'", str13, "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
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
        org.eclipse.jdt.core.dom.ExpressionMethodReference expressionMethodReference19 = null;
        cKVisitor4.endVisit(expressionMethodReference19);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getUniqueWordsQty();
        int int6 = cKMethodResult4.getNumbersQty();
        int int7 = cKMethodResult4.getVariablesQty();
        cKMethodResult4.setMaxNestedBlocks(0);
        java.util.Map<java.lang.String, java.util.Set<java.lang.String>> strMap10 = null;
        cKMethodResult4.setMethodInvocationsIndirectLocal(strMap10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
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
        org.eclipse.jdt.core.dom.ModuleModifier moduleModifier21 = null;
        boolean boolean22 = cKVisitor4.visit(moduleModifier21);
        org.eclipse.jdt.core.dom.ThrowStatement throwStatement23 = null;
        boolean boolean24 = cKVisitor4.visit(throwStatement23);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
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
        org.eclipse.jdt.core.dom.CatchClause catchClause19 = null;
        boolean boolean20 = cKVisitor4.visit(catchClause19);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getLcom();
        cKClassResult4.setLcom((int) '#');
        int int10 = cKClassResult4.getNumberOfPublicFields();
        cKClassResult4.setNumberOfProtectedFields((int) (short) 10);
        cKClassResult4.setNumberOfAbstractMethods(100);
        cKClassResult4.setLambdasQty((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
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
        cKClassResult4.setComparisonsQty(52);
        cKClassResult4.setLcomNormalized((float) '#');
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(strSet14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        com.github.mauricioaniche.ck.ResultWriter resultWriter5 = new com.github.mauricioaniche.ck.ResultWriter("CKClassResult [file=, className=CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}]", "CKMethodResult{cbo=10, rfc=0, wmc=0, methodName='hi!'}", "CKClassResult [file=, className=CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}]", "CKClassResult [file=, className=CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}]", false);
        com.github.mauricioaniche.ck.CKClassResult cKClassResult10 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult10.setStringLiteralsQty((int) (byte) 1);
        java.util.Optional<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultOptional14 = cKClassResult10.getMethod("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
        cKClassResult10.setNumberOfDefaultMethods(100);
        int int17 = cKClassResult10.getRfc();
        cKClassResult10.setNosi(1);
        resultWriter5.printResult(cKClassResult10);
        resultWriter5.flushAndClose();
        org.junit.Assert.assertNotNull(cKMethodResultOptional14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        float float5 = cKClassResult4.getTightClassCohesion();
        int int6 = cKClassResult4.getMaxNestedBlocks();
        cKClassResult4.setCbo(1);
        cKClassResult4.setNumberOfStaticFields((int) (short) 10);
        cKClassResult4.setMaxNestedBlocks(0);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
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
        org.eclipse.jdt.core.dom.PackageDeclaration packageDeclaration17 = null;
        cKVisitor4.endVisit(packageDeclaration17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
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
        org.eclipse.jdt.core.dom.VariableDeclarationExpression variableDeclarationExpression23 = null;
        boolean boolean24 = cKVisitor4.visit(variableDeclarationExpression23);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        java.util.Set<java.lang.String> strSet6 = cKMethodResult4.getMethodInvocationsLocal();
        int int7 = cKMethodResult4.getLambdasQty();
        cKMethodResult4.setCboModified((int) (short) 0);
        int int10 = cKMethodResult4.getModifiers();
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
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
        org.eclipse.jdt.core.dom.Assignment assignment35 = null;
        cKVisitor13.endVisit(assignment35);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
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
        org.eclipse.jdt.core.dom.CharacterLiteral characterLiteral23 = null;
        cKVisitor4.endVisit(characterLiteral23);
        org.eclipse.jdt.core.dom.TextBlock textBlock25 = null;
        cKVisitor4.endVisit(textBlock25);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
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
        org.eclipse.jdt.core.dom.WildcardType wildcardType23 = null;
        cKVisitor4.endVisit(wildcardType23);
        org.eclipse.jdt.core.dom.ExportsDirective exportsDirective25 = null;
        boolean boolean26 = cKVisitor4.visit(exportsDirective25);
        org.eclipse.jdt.core.dom.TypeDeclaration typeDeclaration27 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(typeDeclaration27);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
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
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression15 = null;
        boolean boolean16 = cKVisitor4.visit(parenthesizedExpression15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
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
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression21 = null;
        cKVisitor4.endVisit(patternInstanceofExpression21);
        org.eclipse.jdt.core.dom.SingleVariableDeclaration singleVariableDeclaration23 = null;
        cKVisitor4.endVisit(singleVariableDeclaration23);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
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
        org.eclipse.jdt.core.dom.PackageDeclaration packageDeclaration21 = null;
        cKVisitor4.endVisit(packageDeclaration21);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
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
        org.eclipse.jdt.core.dom.ModuleQualifiedName moduleQualifiedName25 = null;
        boolean boolean26 = cKVisitor4.visit(moduleQualifiedName25);
        org.eclipse.jdt.core.dom.EnumDeclaration enumDeclaration27 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = cKVisitor4.visit(enumDeclaration27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
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
        org.eclipse.jdt.core.dom.PostfixExpression postfixExpression21 = null;
        boolean boolean22 = cKVisitor4.visit(postfixExpression21);
        org.eclipse.jdt.core.dom.SuperConstructorInvocation superConstructorInvocation23 = null;
        boolean boolean24 = cKVisitor4.visit(superConstructorInvocation23);
        org.eclipse.jdt.core.dom.ClassInstanceCreation classInstanceCreation25 = null;
        boolean boolean26 = cKVisitor4.visit(classInstanceCreation25);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.SingleVariableDeclaration singleVariableDeclaration7 = null;
        boolean boolean8 = cKVisitor4.visit(singleVariableDeclaration7);
        org.eclipse.jdt.core.dom.CastExpression castExpression9 = null;
        cKVisitor4.endVisit(castExpression9);
        org.eclipse.jdt.core.dom.ClassInstanceCreation classInstanceCreation11 = null;
        boolean boolean12 = cKVisitor4.visit(classInstanceCreation11);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
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
        org.eclipse.jdt.core.dom.TagElement tagElement17 = null;
        boolean boolean18 = cKVisitor4.visit(tagElement17);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setStringLiteralsQty((int) (byte) 1);
        cKClassResult4.setNumberOfPrivateMethods((int) (byte) 100);
        int int9 = cKClassResult4.getNumberOfProtectedFields();
        cKClassResult4.setNosi(1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        float float5 = cKClassResult4.getTightClassCohesion();
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult10 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet11 = cKMethodResult10.getMethodInvocations();
        int int12 = cKMethodResult10.getStringLiteralsQty();
        cKMethodResult10.setWmc((int) (byte) 10);
        cKClassResult4.addMethod(cKMethodResult10);
        int int16 = cKClassResult4.getTryCatchQty();
        cKClassResult4.setNumberOfProtectedMethods((int) (short) 1);
        java.lang.String str19 = cKClassResult4.toString();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "CKClassResult [file=, className=CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}]" + "'", str19, "CKClassResult [file=, className=CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}]");
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
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
        org.eclipse.jdt.core.dom.VariableDeclarationStatement variableDeclarationStatement15 = null;
        cKVisitor4.endVisit(variableDeclarationStatement15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
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
        org.eclipse.jdt.core.dom.SwitchStatement switchStatement23 = null;
        boolean boolean24 = cKVisitor4.visit(switchStatement23);
        org.eclipse.jdt.core.dom.TryStatement tryStatement25 = null;
        boolean boolean26 = cKVisitor4.visit(tryStatement25);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "hi!", false, (int) (byte) 0);
        cKMethodResult4.setFanout(1);
        cKMethodResult4.setCbo(10);
        int int9 = cKMethodResult4.getAnonymousClassesQty();
        cKMethodResult4.setTryCatchQty((int) (short) 100);
        boolean boolean12 = cKMethodResult4.isConstructor();
        cKMethodResult4.setCbo(10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        float float5 = cKClassResult4.getTightClassCohesion();
        int int6 = cKClassResult4.getNumberOfProtectedMethods();
        int int7 = cKClassResult4.getNoc();
        cKClassResult4.setNumberOfDefaultMethods((int) 'a');
        int int10 = cKClassResult4.getInnerClassesQty();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
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
        org.eclipse.jdt.core.dom.Assignment assignment13 = null;
        boolean boolean14 = cKVisitor4.visit(assignment13);
        org.eclipse.jdt.core.dom.ArrayAccess arrayAccess15 = null;
        boolean boolean16 = cKVisitor4.visit(arrayAccess15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
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
        org.eclipse.jdt.core.dom.RecordDeclaration recordDeclaration13 = null;
        cKVisitor4.endVisit(recordDeclaration13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
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
        org.eclipse.jdt.core.dom.MethodInvocation methodInvocation13 = null;
        boolean boolean14 = cKVisitor4.visit(methodInvocation13);
        org.eclipse.jdt.core.dom.ASTNode aSTNode15 = null;
        cKVisitor4.postVisit(aSTNode15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getUniqueWordsQty();
        int int6 = cKMethodResult4.getNumbersQty();
        int int7 = cKMethodResult4.getVariablesQty();
        cKMethodResult4.setCboModified((int) (byte) 100);
        int int10 = cKMethodResult4.getLoc();
        int int11 = cKMethodResult4.getFanin();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
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
        org.eclipse.jdt.core.dom.Assignment assignment17 = null;
        boolean boolean18 = cKVisitor4.visit(assignment17);
        org.eclipse.jdt.core.dom.AnonymousClassDeclaration anonymousClassDeclaration19 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(anonymousClassDeclaration19);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        com.github.mauricioaniche.ck.CK cK3 = new com.github.mauricioaniche.ck.CK(true, (int) (short) 1, false);
        com.github.mauricioaniche.ck.CKNotifier cKNotifier5 = null;
        cK3.calculate("CKClassResult [file=, className=CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}]", cKNotifier5);
        com.github.mauricioaniche.ck.CKNotifier cKNotifier8 = null;
        cK3.calculate("hi!", cKNotifier8);
        java.nio.file.Path path10 = null;
        com.github.mauricioaniche.ck.CKNotifier cKNotifier11 = null;
        // The following exception was thrown during execution in test generation
        try {
            cK3.calculate(path10, cKNotifier11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
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
        int int22 = cKClassResult4.getRfc();
        int int23 = cKClassResult4.getNumberOfFinalMethods();
        int int24 = cKClassResult4.getNumbersQty();
        org.junit.Assert.assertNotNull(cKMethodResultOptional8);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}" + "'", str21, "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
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
        org.eclipse.jdt.core.dom.NameQualifiedType nameQualifiedType19 = null;
        boolean boolean20 = cKVisitor4.visit(nameQualifiedType19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setStringLiteralsQty((int) (byte) 1);
        java.util.Optional<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultOptional8 = cKClassResult4.getMethod("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
        int int9 = cKClassResult4.getLoopQty();
        cKClassResult4.setLcom(100);
        int int12 = cKClassResult4.getReturnQty();
        org.junit.Assert.assertNotNull(cKMethodResultOptional8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
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
        org.eclipse.jdt.core.dom.MarkerAnnotation markerAnnotation23 = null;
        boolean boolean24 = cKVisitor4.visit(markerAnnotation23);
        org.eclipse.jdt.core.dom.NullLiteral nullLiteral25 = null;
        boolean boolean26 = cKVisitor4.visit(nullLiteral25);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
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
        org.eclipse.jdt.core.dom.StringLiteral stringLiteral15 = null;
        boolean boolean16 = cKVisitor4.visit(stringLiteral15);
        org.eclipse.jdt.core.dom.MethodInvocation methodInvocation17 = null;
        cKVisitor4.endVisit(methodInvocation17);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression19 = null;
        cKVisitor4.endVisit(parenthesizedExpression19);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
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
        cKClassResult4.setNumberOfDefaultFields((int) (short) 100);
        int int23 = cKClassResult4.getWmc();
        cKClassResult4.setCboModified((int) '#');
        org.junit.Assert.assertNotNull(cKMethodResultOptional8);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
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
        cKClassResult4.setNumberOfDefaultFields((int) (short) 100);
        cKClassResult4.setNumberOfSynchronizedMethods((-1));
        org.junit.Assert.assertNotNull(cKMethodResultOptional8);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setStringLiteralsQty((int) (byte) 1);
        java.util.Optional<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultOptional8 = cKClassResult4.getMethod("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
        int int9 = cKClassResult4.getLoopQty();
        cKClassResult4.setLcom(100);
        int int12 = cKClassResult4.getAssignmentsQty();
        int int13 = cKClassResult4.getLoc();
        cKClassResult4.setNumberOfPublicFields(52);
        cKClassResult4.setLoc((int) (byte) -1);
        cKClassResult4.setLambdasQty((int) (short) 1);
        org.junit.Assert.assertNotNull(cKMethodResultOptional8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        float float5 = cKClassResult4.getTightClassCohesion();
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult10 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet11 = cKMethodResult10.getMethodInvocations();
        int int12 = cKMethodResult10.getStringLiteralsQty();
        cKMethodResult10.setWmc((int) (byte) 10);
        cKClassResult4.addMethod(cKMethodResult10);
        int int16 = cKClassResult4.getTryCatchQty();
        cKClassResult4.setCbo(100);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
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
        org.eclipse.jdt.core.dom.MarkerAnnotation markerAnnotation11 = null;
        boolean boolean12 = cKVisitor4.visit(markerAnnotation11);
        org.eclipse.jdt.core.dom.Initializer initializer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = cKVisitor4.visit(initializer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getMaxNestedBlocks();
        int int6 = cKClassResult4.getNumberOfPrivateFields();
        java.lang.String str7 = cKClassResult4.getType();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}" + "'", str7, "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
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
        org.eclipse.jdt.core.dom.AssertStatement assertStatement23 = null;
        boolean boolean24 = cKVisitor4.visit(assertStatement23);
        org.eclipse.jdt.core.dom.InstanceofExpression instanceofExpression25 = null;
        boolean boolean26 = cKVisitor4.visit(instanceofExpression25);
        org.eclipse.jdt.core.dom.QualifiedName qualifiedName27 = null;
        cKVisitor4.endVisit(qualifiedName27);
        org.eclipse.jdt.core.dom.ExpressionMethodReference expressionMethodReference29 = null;
        boolean boolean30 = cKVisitor4.visit(expressionMethodReference29);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
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
        java.util.Set<com.github.mauricioaniche.ck.CKClassResult> cKClassResultSet17 = cKVisitor4.getCollectedClasses();
        org.eclipse.jdt.core.dom.MethodInvocation methodInvocation18 = null;
        boolean boolean19 = cKVisitor4.visit(methodInvocation18);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(cKClassResultSet17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getMaxNestedBlocks();
        int int6 = cKClassResult4.getMaxNestedBlocks();
        int int7 = cKClassResult4.getNumberOfProtectedFields();
        java.lang.String str8 = cKClassResult4.getFile();
        int int9 = cKClassResult4.getNumberOfSynchronizedFields();
        int int10 = cKClassResult4.getNumberOfSynchronizedFields();
        int int11 = cKClassResult4.getReturnQty();
        cKClassResult4.setNumberOfSynchronizedMethods(0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
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
        org.eclipse.jdt.core.dom.EnhancedForStatement enhancedForStatement25 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(enhancedForStatement25);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
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
        org.eclipse.jdt.core.dom.NameQualifiedType nameQualifiedType13 = null;
        boolean boolean14 = cKVisitor4.visit(nameQualifiedType13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
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
        int int17 = cKClassResult4.getNumberOfVisibleMethods();
        int int18 = cKClassResult4.getNumberOfPrivateMethods();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "hi!", false, (int) (byte) 0);
        cKMethodResult4.setFanout(1);
        cKMethodResult4.setCbo(10);
        int int9 = cKMethodResult4.getAnonymousClassesQty();
        cKMethodResult4.setTryCatchQty((int) (short) 100);
        cKMethodResult4.setComparisonsQty((int) (short) 10);
        cKMethodResult4.setLoc(1);
        cKMethodResult4.setComparisonsQty(100);
        int int18 = cKMethodResult4.getNumbersQty();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
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
        cKClassResult4.setNumberOfPrivateMethods(100);
        int int29 = cKClassResult4.getCboModified();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(strSet14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setStringLiteralsQty((-1));
        int int7 = cKClassResult4.getCbo();
        int int8 = cKClassResult4.getFanin();
        cKClassResult4.setUniqueWordsQty((int) ' ');
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
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
        org.eclipse.jdt.core.dom.SynchronizedStatement synchronizedStatement15 = null;
        boolean boolean16 = cKVisitor4.visit(synchronizedStatement15);
        org.eclipse.jdt.core.dom.ClassInstanceCreation classInstanceCreation17 = null;
        boolean boolean18 = cKVisitor4.visit(classInstanceCreation17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
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
        org.eclipse.jdt.core.dom.Assignment assignment15 = null;
        boolean boolean16 = cKVisitor4.visit(assignment15);
        org.eclipse.jdt.core.dom.FieldDeclaration fieldDeclaration17 = null;
        boolean boolean18 = cKVisitor4.visit(fieldDeclaration17);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
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
        org.eclipse.jdt.core.dom.TextBlock textBlock11 = null;
        boolean boolean12 = cKVisitor4.visit(textBlock11);
        org.eclipse.jdt.core.dom.EmptyStatement emptyStatement13 = null;
        boolean boolean14 = cKVisitor4.visit(emptyStatement13);
        org.eclipse.jdt.core.dom.StringLiteral stringLiteral15 = null;
        boolean boolean16 = cKVisitor4.visit(stringLiteral15);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getUniqueWordsQty();
        cKMethodResult4.setUniqueWordsQty((int) (byte) 10);
        cKMethodResult4.setAnonymousClassesQty((int) (short) 1);
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult14 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet15 = cKMethodResult14.getMethodInvocations();
        cKMethodResult4.setMethodInvocationLocal(strSet15);
        cKMethodResult4.setAssignmentsQty((int) (byte) -1);
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult23 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "hi!", false, (int) (byte) 0);
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult28 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int29 = cKMethodResult28.getLambdasQty();
        java.util.Set<java.lang.String> strSet30 = cKMethodResult28.getMethodInvocations();
        cKMethodResult23.setMethodInvocations(strSet30);
        cKMethodResult4.setMethodInvocations(strSet30);
        int int33 = cKMethodResult4.getLoopQty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable0 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable1 = null;
        com.github.mauricioaniche.ck.CKNotifier cKNotifier2 = null;
        com.github.mauricioaniche.ck.MetricsExecutor metricsExecutor3 = new com.github.mauricioaniche.ck.MetricsExecutor(classLevelMetricListCallable0, methodLevelMetricListCallable1, cKNotifier2);
        java.lang.String[] strArray9 = new java.lang.String[] { "", "CKMethodResult{cbo=10, rfc=0, wmc=0, methodName='hi!'}", "hi!", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=10, rfc=0, wmc=0, methodName='hi!'}" };
        org.eclipse.jdt.core.dom.IBinding[] iBindingArray10 = metricsExecutor3.createBindings(strArray9);
        org.eclipse.jdt.core.dom.IBinding iBinding12 = null;
        metricsExecutor3.acceptBinding("hi!", iBinding12);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(iBindingArray10);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
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
        org.eclipse.jdt.core.dom.VariableDeclarationStatement variableDeclarationStatement19 = null;
        cKVisitor4.endVisit(variableDeclarationStatement19);
        org.eclipse.jdt.core.dom.ParameterizedType parameterizedType21 = null;
        cKVisitor4.endVisit(parameterizedType21);
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit23 = null;
        boolean boolean24 = cKVisitor4.visit(compilationUnit23);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
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
        int int25 = cKMethodResult18.getComparisonsQty();
        cKMethodResult18.setUniqueWordsQty((int) '#');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
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
        org.eclipse.jdt.core.dom.RequiresDirective requiresDirective21 = null;
        cKVisitor4.endVisit(requiresDirective21);
        org.eclipse.jdt.core.dom.ArrayAccess arrayAccess23 = null;
        cKVisitor4.endVisit(arrayAccess23);
        java.util.Set<com.github.mauricioaniche.ck.CKClassResult> cKClassResultSet25 = cKVisitor4.getCollectedClasses();
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(cKClassResultSet25);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setAnonymousClassesQty((int) (byte) -1);
        int int7 = cKClassResult4.getNumberOfSynchronizedFields();
        cKClassResult4.setRfc((-1));
        cKClassResult4.setNumberOfFields(10);
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult16 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet17 = cKMethodResult16.getMethodInvocations();
        java.util.Set<java.lang.String> strSet18 = cKMethodResult16.getMethodInvocationsLocal();
        int int19 = cKMethodResult16.getLambdasQty();
        cKMethodResult16.setLambdasQty((int) (short) -1);
        boolean boolean22 = cKClassResult4.equals((java.lang.Object) cKMethodResult16);
        cKClassResult4.setNumberOfStaticFields((int) (short) 10);
        int int25 = cKClassResult4.getNumberOfFields();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(strSet18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setStringLiteralsQty((-1));
        int int7 = cKClassResult4.getMaxNestedBlocks();
        float float8 = cKClassResult4.getLcomNormalized();
        java.lang.String str9 = cKClassResult4.toString();
        int int10 = cKClassResult4.getNumberOfLogStatements();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CKClassResult [file=, className=CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}]" + "'", str9, "CKClassResult [file=, className=CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
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
        org.eclipse.jdt.core.dom.IfStatement ifStatement18 = null;
        boolean boolean19 = cKVisitor4.visit(ifStatement18);
        org.eclipse.jdt.core.dom.ForStatement forStatement20 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(forStatement20);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(cKClassResultSet11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        cKMethodResult4.setAssignmentsQty((int) (short) -1);
        int int8 = cKMethodResult4.getUniqueWordsQty();
        cKMethodResult4.setLoc((int) (byte) 1);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        java.lang.String str6 = cKMethodResult4.getQualifiedMethodName();
        cKMethodResult4.setLoc(100);
        cKMethodResult4.setLogStatementsQty((int) (short) -1);
        int int11 = cKMethodResult4.getStringLiteralsQty();
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
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
        org.eclipse.jdt.core.dom.PrefixExpression prefixExpression11 = null;
        cKVisitor4.endVisit(prefixExpression11);
        org.eclipse.jdt.core.dom.LineComment lineComment13 = null;
        boolean boolean14 = cKVisitor4.visit(lineComment13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getUniqueWordsQty();
        int int7 = cKClassResult4.getUniqueWordsQty();
        int int8 = cKClassResult4.getNumberOfStaticFields();
        cKClassResult4.setNosi((int) (byte) 100);
        int int11 = cKClassResult4.getNumbersQty();
        cKClassResult4.setInnerClassesQty((int) 'a');
        int int14 = cKClassResult4.getNumberOfStaticMethods();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getLcom();
        cKClassResult4.setLcom((int) '#');
        cKClassResult4.setUniqueWordsQty(10);
        int int12 = cKClassResult4.getNumberOfAbstractMethods();
        cKClassResult4.setMaxNestedBlocks((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
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
        org.eclipse.jdt.core.dom.ContinueStatement continueStatement13 = null;
        boolean boolean14 = cKVisitor4.visit(continueStatement13);
        org.eclipse.jdt.core.dom.VariableDeclarationExpression variableDeclarationExpression15 = null;
        cKVisitor4.endVisit(variableDeclarationExpression15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
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
        org.eclipse.jdt.core.dom.NumberLiteral numberLiteral17 = null;
        cKVisitor4.endVisit(numberLiteral17);
        org.eclipse.jdt.core.dom.PrimitiveType primitiveType19 = null;
        boolean boolean20 = cKVisitor4.visit(primitiveType19);
        org.eclipse.jdt.core.dom.InstanceofExpression instanceofExpression21 = null;
        cKVisitor4.endVisit(instanceofExpression21);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
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
        org.eclipse.jdt.core.dom.RequiresDirective requiresDirective19 = null;
        cKVisitor4.endVisit(requiresDirective19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setStringLiteralsQty((-1));
        int int7 = cKClassResult4.getMaxNestedBlocks();
        float float8 = cKClassResult4.getLcomNormalized();
        java.lang.String str9 = cKClassResult4.toString();
        cKClassResult4.setNumberOfDefaultFields((int) ' ');
        int int12 = cKClassResult4.getVariablesQty();
        cKClassResult4.setNumberOfPrivateMethods((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CKClassResult [file=, className=CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}]" + "'", str9, "CKClassResult [file=, className=CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        cKMethodResult4.setLoc((int) (byte) 100);
        cKMethodResult4.setTryCatchQty((int) (byte) -1);
        int int9 = cKMethodResult4.getWmc();
        int int10 = cKMethodResult4.getLoc();
        int int11 = cKMethodResult4.getModifiers();
        cKMethodResult4.setMathOperationsQty((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
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
        org.eclipse.jdt.core.dom.AnnotationTypeMemberDeclaration annotationTypeMemberDeclaration11 = null;
        boolean boolean12 = cKVisitor4.visit(annotationTypeMemberDeclaration11);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
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
        org.eclipse.jdt.core.dom.MethodDeclaration methodDeclaration15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = cKVisitor4.visit(methodDeclaration15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
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
        org.eclipse.jdt.core.dom.QualifiedType qualifiedType21 = null;
        cKVisitor4.endVisit(qualifiedType21);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
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
        org.eclipse.jdt.core.dom.TagElement tagElement17 = null;
        cKVisitor4.endVisit(tagElement17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getLcom();
        cKClassResult4.setLcom((int) '#');
        cKClassResult4.setUniqueWordsQty(10);
        int int12 = cKClassResult4.getNumberOfAbstractMethods();
        cKClassResult4.setVariablesQty((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
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
        org.eclipse.jdt.core.dom.EnumConstantDeclaration enumConstantDeclaration21 = null;
        cKVisitor4.endVisit(enumConstantDeclaration21);
        org.eclipse.jdt.core.dom.TypeParameter typeParameter23 = null;
        boolean boolean24 = cKVisitor4.visit(typeParameter23);
        org.eclipse.jdt.core.dom.ModuleQualifiedName moduleQualifiedName25 = null;
        cKVisitor4.endVisit(moduleQualifiedName25);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
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
        org.eclipse.jdt.core.dom.SuperConstructorInvocation superConstructorInvocation17 = null;
        cKVisitor4.endVisit(superConstructorInvocation17);
        org.eclipse.jdt.core.dom.InfixExpression infixExpression19 = null;
        cKVisitor4.endVisit(infixExpression19);
        org.eclipse.jdt.core.dom.FieldAccess fieldAccess21 = null;
        boolean boolean22 = cKVisitor4.visit(fieldAccess21);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
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
        org.eclipse.jdt.core.dom.TypeLiteral typeLiteral13 = null;
        boolean boolean14 = cKVisitor4.visit(typeLiteral13);
        org.eclipse.jdt.core.dom.TypeDeclarationStatement typeDeclarationStatement15 = null;
        boolean boolean16 = cKVisitor4.visit(typeDeclarationStatement15);
        org.eclipse.jdt.core.dom.AnonymousClassDeclaration anonymousClassDeclaration17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = cKVisitor4.visit(anonymousClassDeclaration17);
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
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
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
        org.eclipse.jdt.core.dom.Block block23 = null;
        boolean boolean24 = cKVisitor4.visit(block23);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getUniqueWordsQty();
        int int7 = cKClassResult4.getUniqueWordsQty();
        cKClassResult4.setNumberOfFields((int) (byte) 0);
        cKClassResult4.setNumbersQty((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
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
        org.eclipse.jdt.core.dom.SuperConstructorInvocation superConstructorInvocation19 = null;
        cKVisitor4.endVisit(superConstructorInvocation19);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
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
        int int25 = cKClassResult4.getTryCatchQty();
        int int26 = cKClassResult4.getNumberOfPublicFields();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
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
        org.eclipse.jdt.core.dom.ProvidesDirective providesDirective19 = null;
        cKVisitor4.endVisit(providesDirective19);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getUniqueWordsQty();
        int int6 = cKMethodResult4.getAssignmentsQty();
        int int7 = cKMethodResult4.getReturnQty();
        cKMethodResult4.setInnerClassesQty(0);
        boolean boolean10 = cKMethodResult4.getHasJavadoc();
        int int11 = cKMethodResult4.getParenthesizedExpsQty();
        cKMethodResult4.setLambdasQty(1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
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
        org.eclipse.jdt.core.dom.AnnotationTypeDeclaration annotationTypeDeclaration11 = null;
        boolean boolean12 = cKVisitor4.visit(annotationTypeDeclaration11);
        org.eclipse.jdt.core.dom.ModuleDeclaration moduleDeclaration13 = null;
        boolean boolean14 = cKVisitor4.visit(moduleDeclaration13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
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
        org.eclipse.jdt.core.dom.TypeDeclaration typeDeclaration21 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = cKVisitor4.visit(typeDeclaration21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getMaxNestedBlocks();
        cKClassResult4.setReturnQty((int) (byte) 10);
        int int8 = cKClassResult4.getNumberOfDefaultMethods();
        cKClassResult4.setTightClassCohesion(100.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
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
        int int21 = cKMethodResult4.getVariablesQty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getUniqueWordsQty();
        int int6 = cKMethodResult4.getAssignmentsQty();
        int int7 = cKMethodResult4.getReturnQty();
        cKMethodResult4.setInnerClassesQty(0);
        boolean boolean10 = cKMethodResult4.getHasJavadoc();
        int int11 = cKMethodResult4.getParenthesizedExpsQty();
        cKMethodResult4.setFanout((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
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
        org.eclipse.jdt.core.dom.ConditionalExpression conditionalExpression23 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(conditionalExpression23);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
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
        org.eclipse.jdt.core.dom.InstanceofExpression instanceofExpression23 = null;
        cKVisitor4.endVisit(instanceofExpression23);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
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
        org.eclipse.jdt.core.dom.MethodInvocation methodInvocation19 = null;
        boolean boolean20 = cKVisitor4.visit(methodInvocation19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.ModuleQualifiedName moduleQualifiedName7 = null;
        boolean boolean8 = cKVisitor4.visit(moduleQualifiedName7);
        org.eclipse.jdt.core.dom.NameQualifiedType nameQualifiedType9 = null;
        boolean boolean10 = cKVisitor4.visit(nameQualifiedType9);
        org.eclipse.jdt.core.dom.TryStatement tryStatement11 = null;
        cKVisitor4.endVisit(tryStatement11);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
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
        org.eclipse.jdt.core.dom.ArrayInitializer arrayInitializer11 = null;
        boolean boolean12 = cKVisitor4.visit(arrayInitializer11);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getLcom();
        cKClassResult4.setLcom((int) '#');
        int int10 = cKClassResult4.getNumberOfPublicFields();
        java.util.Set<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultSet11 = cKClassResult4.getVisibleMethods();
        cKClassResult4.setCbo(100);
        int int14 = cKClassResult4.getNumberOfDefaultFields();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(cKMethodResultSet11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setStringLiteralsQty((-1));
        int int7 = cKClassResult4.getNumberOfLogStatements();
        int int8 = cKClassResult4.getVariablesQty();
        int int9 = cKClassResult4.getVariablesQty();
        cKClassResult4.setReturnQty((int) (byte) 0);
        cKClassResult4.setNumberOfPublicMethods((int) '#');
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getUniqueWordsQty();
        int int6 = cKMethodResult4.getNumbersQty();
        int int7 = cKMethodResult4.getStartLine();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cKMethodResult4.getFieldUsage();
        cKMethodResult4.setRfc(0);
        boolean boolean11 = cKMethodResult4.getIsVisible();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
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
        org.eclipse.jdt.core.dom.MemberValuePair memberValuePair15 = null;
        cKVisitor4.endVisit(memberValuePair15);
        org.eclipse.jdt.core.dom.ProvidesDirective providesDirective17 = null;
        cKVisitor4.endVisit(providesDirective17);
        org.eclipse.jdt.core.dom.TypeParameter typeParameter19 = null;
        cKVisitor4.endVisit(typeParameter19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getLcom();
        int int8 = cKClassResult4.getNumberOfProtectedMethods();
        java.util.Set<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultSet9 = cKClassResult4.getMethods();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(cKMethodResultSet9);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
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
        org.eclipse.jdt.core.dom.BlockComment blockComment17 = null;
        boolean boolean18 = cKVisitor4.visit(blockComment17);
        org.eclipse.jdt.core.dom.EmptyStatement emptyStatement19 = null;
        cKVisitor4.endVisit(emptyStatement19);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "hi!", false, (int) (byte) 0);
        cKMethodResult4.setWmc((int) (byte) 100);
        int int7 = cKMethodResult4.getMaxNestedBlocks();
        int int8 = cKMethodResult4.getMathOperationsQty();
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult13 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        cKMethodResult13.setLoc((int) (byte) 100);
        cKMethodResult13.setTryCatchQty((int) (byte) -1);
        int int18 = cKMethodResult13.getNumbersQty();
        cKMethodResult13.setAnonymousClassesQty((int) '#');
        int int21 = cKMethodResult13.getModifiers();
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult26 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int27 = cKMethodResult26.getUniqueWordsQty();
        int int28 = cKMethodResult26.getAssignmentsQty();
        cKMethodResult26.setTryCatchQty((int) (byte) 0);
        java.lang.String str31 = cKMethodResult26.getMethodName();
        java.util.Map<java.lang.String, java.lang.Integer> strMap32 = null;
        cKMethodResult26.setVariablesUsage(strMap32);
        cKMethodResult26.setHasJavadoc(false);
        int int36 = cKMethodResult26.getLambdasQty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap37 = cKMethodResult26.getFieldUsage();
        cKMethodResult13.setFieldUsage(strMap37);
        int int39 = cKMethodResult13.getParenthesizedExpsQty();
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult44 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet45 = cKMethodResult44.getMethodInvocations();
        java.util.Set<java.lang.String> strSet46 = cKMethodResult44.getMethodInvocationsLocal();
        int int47 = cKMethodResult44.getLambdasQty();
        cKMethodResult44.setParenthesizedExpsQty((int) (short) -1);
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult54 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int55 = cKMethodResult54.getUniqueWordsQty();
        cKMethodResult54.setUniqueWordsQty((int) (byte) 10);
        int int58 = cKMethodResult54.getLogStatementsQty();
        boolean boolean59 = cKMethodResult54.isConstructor();
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult64 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int65 = cKMethodResult64.getUniqueWordsQty();
        int int66 = cKMethodResult64.getNumbersQty();
        int int67 = cKMethodResult64.getStartLine();
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult72 = new com.github.mauricioaniche.ck.CKMethodResult("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", true, 0);
        cKMethodResult72.setCbo(0);
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult79 = new com.github.mauricioaniche.ck.CKMethodResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", true, 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap80 = cKMethodResult79.getVariablesUsage();
        cKMethodResult72.setFieldUsage(strMap80);
        cKMethodResult64.setVariablesUsage(strMap80);
        cKMethodResult54.setVariablesUsage(strMap80);
        cKMethodResult44.setFieldUsage(strMap80);
        cKMethodResult13.setFieldUsage(strMap80);
        cKMethodResult4.setFieldUsage(strMap80);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(strMap37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(strSet45);
        org.junit.Assert.assertNull(strSet46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(strMap80);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
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
        org.eclipse.jdt.core.dom.CharacterLiteral characterLiteral15 = null;
        boolean boolean16 = cKVisitor4.visit(characterLiteral15);
        org.eclipse.jdt.core.dom.EmptyStatement emptyStatement17 = null;
        cKVisitor4.endVisit(emptyStatement17);
        org.eclipse.jdt.core.dom.IfStatement ifStatement19 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(ifStatement19);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
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
        int int21 = cKMethodResult4.getParametersQty();
        int int22 = cKMethodResult4.getMaxNestedBlocks();
        cKMethodResult4.setNumbersQty((-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(strSet15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
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
        org.eclipse.jdt.core.dom.ExportsDirective exportsDirective21 = null;
        cKVisitor4.endVisit(exportsDirective21);
        org.eclipse.jdt.core.dom.TypeDeclarationStatement typeDeclarationStatement23 = null;
        boolean boolean24 = cKVisitor4.visit(typeDeclarationStatement23);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setNumberOfPublicMethods((int) '#');
        int int7 = cKClassResult4.getParenthesizedExpsQty();
        cKClassResult4.setNumberOfSynchronizedMethods(10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
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
        cKClassResult4.setMaxNestedBlocks(100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}" + "'", str15, "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
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
        cKClassResult4.setNumberOfDefaultFields(0);
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
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
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
        org.eclipse.jdt.core.dom.TypeLiteral typeLiteral19 = null;
        boolean boolean20 = cKVisitor4.visit(typeLiteral19);
        org.eclipse.jdt.core.dom.ModuleDeclaration moduleDeclaration21 = null;
        cKVisitor4.endVisit(moduleDeclaration21);
        org.eclipse.jdt.core.dom.UnionType unionType23 = null;
        boolean boolean24 = cKVisitor4.visit(unionType23);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setAnonymousClassesQty((int) (byte) -1);
        int int7 = cKClassResult4.getNumberOfSynchronizedFields();
        cKClassResult4.setAssignmentsQty((int) (byte) 1);
        cKClassResult4.setLcomNormalized((float) (short) 10);
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult16 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "hi!", false, (int) (byte) 0);
        cKMethodResult16.setFanout(1);
        cKMethodResult16.setCbo(10);
        int int21 = cKMethodResult16.getAnonymousClassesQty();
        int int22 = cKMethodResult16.getNumbersQty();
        cKMethodResult16.setMathOperationsQty((int) ' ');
        int int25 = cKMethodResult16.getTryCatchQty();
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult30 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int31 = cKMethodResult30.getUniqueWordsQty();
        int int32 = cKMethodResult30.getAssignmentsQty();
        cKMethodResult30.setTryCatchQty((int) (byte) 0);
        java.lang.String str35 = cKMethodResult30.getMethodName();
        java.util.Map<java.lang.String, java.lang.Integer> strMap36 = null;
        cKMethodResult30.setVariablesUsage(strMap36);
        cKMethodResult30.setHasJavadoc(false);
        int int40 = cKMethodResult30.getLambdasQty();
        com.github.mauricioaniche.ck.CKClassResult cKClassResult45 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int46 = cKClassResult45.getNumberOfFinalFields();
        int int47 = cKClassResult45.getLoc();
        int int48 = cKClassResult45.getLcom();
        cKClassResult45.setLcom((int) '#');
        int int51 = cKClassResult45.getNumberOfPublicFields();
        cKClassResult45.setNumberOfProtectedFields((int) (short) 10);
        int int54 = cKClassResult45.getRfc();
        int int55 = cKClassResult45.getNumberOfPublicMethods();
        com.github.mauricioaniche.ck.CKClassResult cKClassResult60 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        float float61 = cKClassResult60.getTightClassCohesion();
        cKClassResult60.setAssignmentsQty((int) (short) -1);
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult68 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int69 = cKMethodResult68.getUniqueWordsQty();
        cKMethodResult68.setUniqueWordsQty((int) (byte) 10);
        cKMethodResult68.setAnonymousClassesQty((int) (short) 1);
        java.util.Set<java.lang.String> strSet74 = cKMethodResult68.getFieldsAccessed();
        cKClassResult60.setFieldNames(strSet74);
        cKClassResult45.setFieldNames(strSet74);
        cKMethodResult30.setMethodInvocations(strSet74);
        cKMethodResult16.setMethodInvocationLocal(strSet74);
        cKClassResult4.setFieldNames(strSet74);
        int int80 = cKClassResult4.getParenthesizedExpsQty();
        int int81 = cKClassResult4.getNumberOfFinalFields();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + float61 + "' != '" + 0.0f + "'", float61 == 0.0f);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(strSet74);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getNumberOfFinalFields();
        int int8 = cKClassResult4.getLcom();
        int int9 = cKClassResult4.getStringLiteralsQty();
        java.lang.String str10 = cKClassResult4.toString();
        cKClassResult4.setNumberOfFinalFields((int) ' ');
        int int13 = cKClassResult4.getModifiers();
        cKClassResult4.setNumberOfPublicMethods((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CKClassResult [file=, className=CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}]" + "'", str10, "CKClassResult [file=, className=CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
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
        org.eclipse.jdt.core.dom.TypeLiteral typeLiteral19 = null;
        boolean boolean20 = cKVisitor4.visit(typeLiteral19);
        org.eclipse.jdt.core.dom.DoStatement doStatement21 = null;
        boolean boolean22 = cKVisitor4.visit(doStatement21);
        org.eclipse.jdt.core.dom.Modifier modifier23 = null;
        boolean boolean24 = cKVisitor4.visit(modifier23);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
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
        org.eclipse.jdt.core.dom.Javadoc javadoc11 = null;
        cKVisitor4.endVisit(javadoc11);
        org.eclipse.jdt.core.dom.CatchClause catchClause13 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(catchClause13);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
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
        org.eclipse.jdt.core.dom.PackageDeclaration packageDeclaration13 = null;
        boolean boolean14 = cKVisitor4.visit(packageDeclaration13);
        org.eclipse.jdt.core.dom.EnumConstantDeclaration enumConstantDeclaration15 = null;
        cKVisitor4.endVisit(enumConstantDeclaration15);
        org.eclipse.jdt.core.dom.TypeParameter typeParameter17 = null;
        cKVisitor4.endVisit(typeParameter17);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getMaxNestedBlocks();
        int int6 = cKClassResult4.getMaxNestedBlocks();
        int int7 = cKClassResult4.getNumberOfPrivateMethods();
        java.lang.String str8 = cKClassResult4.getType();
        int int9 = cKClassResult4.getNosi();
        cKClassResult4.setRfc((int) 'a');
        int int12 = cKClassResult4.getNumberOfFinalFields();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}" + "'", str8, "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getMathOperationsQty();
        cKMethodResult4.setReturnQty(100);
        cKMethodResult4.setVariablesQty((int) '#');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
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
        int int36 = cKClassResult4.getNumberOfPublicMethods();
        int int37 = cKClassResult4.getNumberOfPublicFields();
        float float38 = cKClassResult4.getLcomNormalized();
        int int39 = cKClassResult4.getMathOperationsQty();
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
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 0.0f + "'", float38 == 0.0f);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
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
        org.eclipse.jdt.core.dom.VariableDeclarationExpression variableDeclarationExpression19 = null;
        cKVisitor4.endVisit(variableDeclarationExpression19);
        org.eclipse.jdt.core.dom.ModuleQualifiedName moduleQualifiedName21 = null;
        cKVisitor4.endVisit(moduleQualifiedName21);
        org.eclipse.jdt.core.dom.SwitchExpression switchExpression23 = null;
        cKVisitor4.endVisit(switchExpression23);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable0 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable1 = null;
        com.github.mauricioaniche.ck.CKNotifier cKNotifier2 = null;
        com.github.mauricioaniche.ck.MetricsExecutor metricsExecutor3 = new com.github.mauricioaniche.ck.MetricsExecutor(classLevelMetricListCallable0, methodLevelMetricListCallable1, cKNotifier2);
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        org.eclipse.jdt.core.dom.IBinding[] iBindingArray6 = metricsExecutor3.createBindings(strArray5);
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable7 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable8 = null;
        com.github.mauricioaniche.ck.CKNotifier cKNotifier9 = null;
        com.github.mauricioaniche.ck.MetricsExecutor metricsExecutor10 = new com.github.mauricioaniche.ck.MetricsExecutor(classLevelMetricListCallable7, methodLevelMetricListCallable8, cKNotifier9);
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        org.eclipse.jdt.core.dom.IBinding[] iBindingArray13 = metricsExecutor10.createBindings(strArray12);
        org.eclipse.jdt.core.dom.IBinding[] iBindingArray14 = metricsExecutor3.createBindings(strArray12);
        org.eclipse.jdt.core.dom.IBinding iBinding16 = null;
        metricsExecutor3.acceptBinding("", iBinding16);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(iBindingArray6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(iBindingArray13);
        org.junit.Assert.assertNotNull(iBindingArray14);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "hi!", false, (int) (byte) 0);
        cKMethodResult4.setFanout(1);
        cKMethodResult4.setMathOperationsQty((int) (short) 1);
        java.util.Map<java.lang.String, java.util.Set<java.lang.String>> strMap9 = null;
        cKMethodResult4.setMethodInvocationsIndirectLocal(strMap9);
        int int11 = cKMethodResult4.getMaxNestedBlocks();
        int int12 = cKMethodResult4.getFanin();
        cKMethodResult4.setNumbersQty((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
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
        org.eclipse.jdt.core.dom.ExpressionMethodReference expressionMethodReference21 = null;
        cKVisitor4.endVisit(expressionMethodReference21);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
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
        org.eclipse.jdt.core.dom.IntersectionType intersectionType23 = null;
        boolean boolean24 = cKVisitor4.visit(intersectionType23);
        org.eclipse.jdt.core.dom.SimpleType simpleType25 = null;
        cKVisitor4.endVisit(simpleType25);
        org.eclipse.jdt.core.dom.DoStatement doStatement27 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(doStatement27);
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
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        cKClassResult4.setUniqueWordsQty((int) '#');
        cKClassResult4.setNumberOfDefaultFields(0);
        int int10 = cKClassResult4.getNumberOfSynchronizedMethods();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        cKClassResult4.setInnerClassesQty((int) (short) 100);
        cKClassResult4.setParenthesizedExpsQty((int) '4');
        cKClassResult4.setNumberOfPublicFields((int) (byte) 10);
        int int12 = cKClassResult4.getNumberOfDefaultFields();
        int int13 = cKClassResult4.getLcom();
        int int14 = cKClassResult4.getFanout();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
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
        java.util.Set<com.github.mauricioaniche.ck.CKClassResult> cKClassResultSet21 = cKVisitor4.getCollectedClasses();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(cKClassResultSet21);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
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
        org.eclipse.jdt.core.dom.IntersectionType intersectionType23 = null;
        cKVisitor4.endVisit(intersectionType23);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
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
        org.eclipse.jdt.core.dom.NameQualifiedType nameQualifiedType19 = null;
        cKVisitor4.endVisit(nameQualifiedType19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getLcom();
        cKClassResult4.setLcom((int) '#');
        int int10 = cKClassResult4.getNumberOfPublicFields();
        cKClassResult4.setNumberOfProtectedFields((int) (short) 10);
        int int13 = cKClassResult4.getReturnQty();
        int int14 = cKClassResult4.getMathOperationsQty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
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
        cKMethodResult14.setCboModified((int) (short) 0);
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult29 = new com.github.mauricioaniche.ck.CKMethodResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", true, 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap30 = cKMethodResult29.getVariablesUsage();
        cKMethodResult14.setVariablesUsage(strMap30);
        int int32 = cKMethodResult14.getComparisonsQty();
        int int33 = cKMethodResult14.getNumbersQty();
        cKMethodResult14.setVariablesQty(35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
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
        org.eclipse.jdt.core.dom.ReturnStatement returnStatement17 = null;
        cKVisitor4.endVisit(returnStatement17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getUniqueWordsQty();
        cKMethodResult4.setUniqueWordsQty((int) (byte) 10);
        cKMethodResult4.setAnonymousClassesQty((int) (short) 1);
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult14 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet15 = cKMethodResult14.getMethodInvocations();
        cKMethodResult4.setMethodInvocationLocal(strSet15);
        cKMethodResult4.setAssignmentsQty((int) (byte) -1);
        cKMethodResult4.setFanin(10);
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult25 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int26 = cKMethodResult25.getUniqueWordsQty();
        cKMethodResult25.setUniqueWordsQty((int) (byte) 10);
        int int29 = cKMethodResult25.getLogStatementsQty();
        int int30 = cKMethodResult25.getCbo();
        java.util.Set<java.lang.String> strSet31 = cKMethodResult25.getFieldsAccessed();
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult36 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet37 = cKMethodResult36.getMethodInvocations();
        java.util.Set<java.lang.String> strSet38 = cKMethodResult36.getMethodInvocationsLocal();
        int int39 = cKMethodResult36.getLambdasQty();
        cKMethodResult36.setParenthesizedExpsQty((int) (short) -1);
        java.util.Set<java.lang.String> strSet42 = cKMethodResult36.getFieldsAccessed();
        cKMethodResult25.setMethodInvocations(strSet42);
        cKMethodResult4.setMethodInvocations(strSet42);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertNotNull(strSet37);
        org.junit.Assert.assertNull(strSet38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(strSet42);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        java.util.Set<java.lang.String> strSet6 = cKMethodResult4.getMethodInvocationsLocal();
        java.util.Set<java.lang.String> strSet7 = cKMethodResult4.getFieldsAccessed();
        java.lang.String str8 = cKMethodResult4.getQualifiedMethodName();
        cKMethodResult4.setStartLine(10);
        int int11 = cKMethodResult4.getModifiers();
        java.util.Set<java.lang.String> strSet12 = cKMethodResult4.getMethodInvocationsLocal();
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNull(strSet12);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        cKClassResult4.setInnerClassesQty((int) (short) 100);
        cKClassResult4.setParenthesizedExpsQty((int) '4');
        cKClassResult4.setNumberOfPrivateMethods((int) '4');
        java.util.Optional<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultOptional13 = cKClassResult4.getMethod("");
        cKClassResult4.setLcom(0);
        int int16 = cKClassResult4.getTryCatchQty();
        cKClassResult4.setFanout((int) (short) -1);
        int int19 = cKClassResult4.getNumberOfPublicFields();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(cKMethodResultOptional13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        cKMethodResult4.setLoc((int) (byte) 100);
        cKMethodResult4.setTryCatchQty((int) (byte) -1);
        int int9 = cKMethodResult4.getWmc();
        int int10 = cKMethodResult4.getVariablesQty();
        java.lang.String str11 = cKMethodResult4.getQualifiedMethodName();
        int int12 = cKMethodResult4.getNumbersQty();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
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
        org.eclipse.jdt.core.dom.QualifiedName qualifiedName23 = null;
        boolean boolean24 = cKVisitor4.visit(qualifiedName23);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
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
        org.eclipse.jdt.core.dom.ContinueStatement continueStatement23 = null;
        boolean boolean24 = cKVisitor4.visit(continueStatement23);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
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
        org.eclipse.jdt.core.dom.TextBlock textBlock11 = null;
        boolean boolean12 = cKVisitor4.visit(textBlock11);
        org.eclipse.jdt.core.dom.ProvidesDirective providesDirective13 = null;
        cKVisitor4.endVisit(providesDirective13);
        org.eclipse.jdt.core.dom.BooleanLiteral booleanLiteral15 = null;
        cKVisitor4.endVisit(booleanLiteral15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
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
        org.eclipse.jdt.core.dom.TypeLiteral typeLiteral19 = null;
        boolean boolean20 = cKVisitor4.visit(typeLiteral19);
        org.eclipse.jdt.core.dom.MemberRef memberRef21 = null;
        boolean boolean22 = cKVisitor4.visit(memberRef21);
        org.eclipse.jdt.core.dom.CastExpression castExpression23 = null;
        cKVisitor4.endVisit(castExpression23);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
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
        org.eclipse.jdt.core.dom.MethodRef methodRef17 = null;
        boolean boolean18 = cKVisitor4.visit(methodRef17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getNumberOfFinalFields();
        cKClassResult4.setTightClassCohesion((float) (byte) 100);
        int int10 = cKClassResult4.getNumberOfPrivateFields();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
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
        org.eclipse.jdt.core.dom.SimpleName simpleName21 = null;
        boolean boolean22 = cKVisitor4.visit(simpleName21);
        org.eclipse.jdt.core.dom.CreationReference creationReference23 = null;
        cKVisitor4.endVisit(creationReference23);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
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
        org.eclipse.jdt.core.dom.CharacterLiteral characterLiteral21 = null;
        boolean boolean22 = cKVisitor4.visit(characterLiteral21);
        org.eclipse.jdt.core.dom.BooleanLiteral booleanLiteral23 = null;
        cKVisitor4.endVisit(booleanLiteral23);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
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
        org.eclipse.jdt.core.dom.NumberLiteral numberLiteral17 = null;
        cKVisitor4.endVisit(numberLiteral17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        java.util.Set<java.lang.String> strSet6 = cKMethodResult4.getMethodInvocationsLocal();
        cKMethodResult4.setHasJavadoc(false);
        java.lang.String str9 = cKMethodResult4.getMethodName();
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        float float5 = cKClassResult4.getTightClassCohesion();
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult10 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet11 = cKMethodResult10.getMethodInvocations();
        int int12 = cKMethodResult10.getStringLiteralsQty();
        cKMethodResult10.setWmc((int) (byte) 10);
        cKClassResult4.addMethod(cKMethodResult10);
        int int16 = cKClassResult4.getLoc();
        int int17 = cKClassResult4.getAssignmentsQty();
        int int18 = cKClassResult4.getNumberOfProtectedMethods();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
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
        org.eclipse.jdt.core.dom.Javadoc javadoc11 = null;
        cKVisitor4.endVisit(javadoc11);
        org.eclipse.jdt.core.dom.QualifiedType qualifiedType13 = null;
        boolean boolean14 = cKVisitor4.visit(qualifiedType13);
        org.eclipse.jdt.core.dom.RequiresDirective requiresDirective15 = null;
        boolean boolean16 = cKVisitor4.visit(requiresDirective15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
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
        org.eclipse.jdt.core.dom.TryStatement tryStatement19 = null;
        boolean boolean20 = cKVisitor4.visit(tryStatement19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
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
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression13 = null;
        cKVisitor4.endVisit(patternInstanceofExpression13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
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
        org.eclipse.jdt.core.dom.ParameterizedType parameterizedType21 = null;
        cKVisitor4.endVisit(parameterizedType21);
        org.eclipse.jdt.core.dom.Modifier modifier23 = null;
        cKVisitor4.endVisit(modifier23);
        org.eclipse.jdt.core.dom.MemberValuePair memberValuePair25 = null;
        boolean boolean26 = cKVisitor4.visit(memberValuePair25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
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
        org.eclipse.jdt.core.dom.CharacterLiteral characterLiteral21 = null;
        boolean boolean22 = cKVisitor4.visit(characterLiteral21);
        org.eclipse.jdt.core.dom.RecordDeclaration recordDeclaration23 = null;
        cKVisitor4.endVisit(recordDeclaration23);
        org.eclipse.jdt.core.dom.QualifiedType qualifiedType25 = null;
        cKVisitor4.endVisit(qualifiedType25);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getUniqueWordsQty();
        int int7 = cKClassResult4.getUniqueWordsQty();
        int int8 = cKClassResult4.getLcom();
        int int9 = cKClassResult4.getNumberOfAbstractMethods();
        cKClassResult4.setInnerClassesQty((int) (byte) -1);
        cKClassResult4.setNumberOfSynchronizedFields((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
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
        org.eclipse.jdt.core.dom.EnumConstantDeclaration enumConstantDeclaration21 = null;
        cKVisitor4.endVisit(enumConstantDeclaration21);
        org.eclipse.jdt.core.dom.MemberValuePair memberValuePair23 = null;
        cKVisitor4.endVisit(memberValuePair23);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
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
        org.eclipse.jdt.core.dom.ForStatement forStatement15 = null;
        boolean boolean16 = cKVisitor4.visit(forStatement15);
        org.eclipse.jdt.core.dom.ExpressionMethodReference expressionMethodReference17 = null;
        cKVisitor4.endVisit(expressionMethodReference17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("CKMethodResult{cbo=10, rfc=0, wmc=0, methodName='hi!'}", "hi!", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", 1);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getComparisonsQty();
        cKMethodResult4.setReturnQty((int) (byte) -1);
        cKMethodResult4.setCboModified((int) (byte) 100);
        int int10 = cKMethodResult4.getFanout();
        int int11 = cKMethodResult4.getTryCatchQty();
        cKMethodResult4.setMaxNestedBlocks(35);
        cKMethodResult4.setParenthesizedExpsQty((int) (short) 10);
        cKMethodResult4.setReturnQty((int) ' ');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
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
        org.eclipse.jdt.core.dom.ClassInstanceCreation classInstanceCreation15 = null;
        cKVisitor4.endVisit(classInstanceCreation15);
        org.eclipse.jdt.core.dom.SimpleType simpleType17 = null;
        boolean boolean18 = cKVisitor4.visit(simpleType17);
        org.eclipse.jdt.core.dom.SingleMemberAnnotation singleMemberAnnotation19 = null;
        boolean boolean20 = cKVisitor4.visit(singleMemberAnnotation19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
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
        org.eclipse.jdt.core.dom.TryStatement tryStatement11 = null;
        boolean boolean12 = cKVisitor4.visit(tryStatement11);
        org.eclipse.jdt.core.dom.TypeMethodReference typeMethodReference13 = null;
        cKVisitor4.endVisit(typeMethodReference13);
        org.eclipse.jdt.core.dom.Modifier modifier15 = null;
        boolean boolean16 = cKVisitor4.visit(modifier15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
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
        org.eclipse.jdt.core.dom.VariableDeclarationStatement variableDeclarationStatement21 = null;
        boolean boolean22 = cKVisitor4.visit(variableDeclarationStatement21);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
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
        org.eclipse.jdt.core.dom.MethodDeclaration methodDeclaration15 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(methodDeclaration15);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
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
        org.eclipse.jdt.core.dom.Dimension dimension26 = null;
        cKVisitor4.endVisit(dimension26);
        org.eclipse.jdt.core.dom.ModuleModifier moduleModifier28 = null;
        boolean boolean29 = cKVisitor4.visit(moduleModifier28);
        org.eclipse.jdt.core.dom.EnumDeclaration enumDeclaration30 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = cKVisitor4.visit(enumDeclaration30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
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
        org.eclipse.jdt.core.dom.MethodDeclaration methodDeclaration19 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(methodDeclaration19);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
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
        org.eclipse.jdt.core.dom.QualifiedType qualifiedType13 = null;
        cKVisitor4.endVisit(qualifiedType13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
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
        org.eclipse.jdt.core.dom.MethodRefParameter methodRefParameter11 = null;
        boolean boolean12 = cKVisitor4.visit(methodRefParameter11);
        org.eclipse.jdt.core.dom.PrimitiveType primitiveType13 = null;
        boolean boolean14 = cKVisitor4.visit(primitiveType13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
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
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression15 = null;
        cKVisitor4.endVisit(parenthesizedExpression15);
        org.eclipse.jdt.core.dom.DoStatement doStatement17 = null;
        boolean boolean18 = cKVisitor4.visit(doStatement17);
        org.eclipse.jdt.core.dom.MethodInvocation methodInvocation19 = null;
        cKVisitor4.endVisit(methodInvocation19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getNumberOfFinalFields();
        java.util.Set<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultSet8 = cKClassResult4.getMethods();
        cKClassResult4.setNumberOfAbstractMethods((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(cKMethodResultSet8);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
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
        org.eclipse.jdt.core.dom.MemberValuePair memberValuePair15 = null;
        cKVisitor4.endVisit(memberValuePair15);
        org.eclipse.jdt.core.dom.StringLiteral stringLiteral17 = null;
        cKVisitor4.endVisit(stringLiteral17);
        org.eclipse.jdt.core.dom.VariableDeclarationStatement variableDeclarationStatement19 = null;
        cKVisitor4.endVisit(variableDeclarationStatement19);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
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
        org.eclipse.jdt.core.dom.TypeParameter typeParameter15 = null;
        cKVisitor4.endVisit(typeParameter15);
        org.eclipse.jdt.core.dom.DoStatement doStatement17 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(doStatement17);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
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
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation11 = null;
        boolean boolean12 = cKVisitor4.visit(arrayCreation11);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
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
        int int22 = cKMethodResult4.getMaxNestedBlocks();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
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
        org.eclipse.jdt.core.dom.Block block23 = null;
        boolean boolean24 = cKVisitor4.visit(block23);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }
}

