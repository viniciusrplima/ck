package com.github.mauricioaniche.ck.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        com.github.mauricioaniche.ck.CK cK0 = new com.github.mauricioaniche.ck.CK();
        java.lang.Class<?> wildcardClass1 = cK0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        // The following exception was thrown during execution in test generation
        try {
            com.github.mauricioaniche.ck.ResultWriter resultWriter5 = new com.github.mauricioaniche.ck.ResultWriter("hi!", "", "hi!", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable0 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable1 = null;
        com.github.mauricioaniche.ck.CK cK2 = new com.github.mauricioaniche.ck.CK(classLevelMetricListCallable0, methodLevelMetricListCallable1);
        com.github.mauricioaniche.ck.CKNotifier cKNotifier4 = null;
        // The following exception was thrown during execution in test generation
        try {
            cK2.calculate("", cKNotifier4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        com.github.mauricioaniche.ck.Runner runner0 = new com.github.mauricioaniche.ck.Runner();
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        java.lang.String str6 = cKMethodResult4.getMethodName();
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        cKMethodResult4.setLoc((int) (byte) 100);
        int int7 = cKMethodResult4.getReturnQty();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getUniqueWordsQty();
        cKMethodResult4.setUniqueWordsQty((int) (byte) 10);
        int int8 = cKMethodResult4.getMathOperationsQty();
        int int9 = cKMethodResult4.getLoc();
        cKMethodResult4.setInnerClassesQty((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable0 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable1 = null;
        com.github.mauricioaniche.ck.CK cK2 = new com.github.mauricioaniche.ck.CK(classLevelMetricListCallable0, methodLevelMetricListCallable1);
        java.nio.file.Path path3 = null;
        com.github.mauricioaniche.ck.CKNotifier cKNotifier4 = null;
        java.nio.file.Path[] pathArray5 = new java.nio.file.Path[] {};
        // The following exception was thrown during execution in test generation
        try {
            cK2.calculate(path3, cKNotifier4, pathArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pathArray5);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        // The following exception was thrown during execution in test generation
        try {
            com.github.mauricioaniche.ck.ResultWriter resultWriter5 = new com.github.mauricioaniche.ck.ResultWriter("", "hi!", "", "", true);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.TypeDeclaration typeDeclaration9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = cKVisitor4.visit(typeDeclaration9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.EnumConstantDeclaration enumConstantDeclaration7 = null;
        cKVisitor4.endVisit(enumConstantDeclaration7);
        org.eclipse.jdt.core.dom.SwitchStatement switchStatement9 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(switchStatement9);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.SuperMethodReference superMethodReference7 = null;
        cKVisitor4.endVisit(superMethodReference7);
        org.eclipse.jdt.core.dom.AnonymousClassDeclaration anonymousClassDeclaration9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = cKVisitor4.visit(anonymousClassDeclaration9);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.EnumDeclaration enumDeclaration9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = cKVisitor4.visit(enumDeclaration9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        // The following exception was thrown during execution in test generation
        try {
            com.github.mauricioaniche.ck.ResultWriter resultWriter5 = new com.github.mauricioaniche.ck.ResultWriter("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "", true);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
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
        org.eclipse.jdt.core.dom.TypeDeclaration typeDeclaration11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = cKVisitor4.visit(typeDeclaration11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.EnhancedForStatement enhancedForStatement5 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(enhancedForStatement5);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        java.lang.String str6 = cKMethodResult4.getQualifiedMethodName();
        java.lang.Class<?> wildcardClass7 = cKMethodResult4.getClass();
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable0 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable1 = null;
        com.github.mauricioaniche.ck.CK cK2 = new com.github.mauricioaniche.ck.CK(classLevelMetricListCallable0, methodLevelMetricListCallable1);
        java.nio.file.Path path3 = null;
        com.github.mauricioaniche.ck.CKNotifier cKNotifier4 = null;
        // The following exception was thrown during execution in test generation
        try {
            cK2.calculate(path3, cKNotifier4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
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
        org.eclipse.jdt.core.dom.ASTNode aSTNode15 = null;
        cKVisitor4.postVisit(aSTNode15);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
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
        org.eclipse.jdt.core.dom.ReturnStatement returnStatement11 = null;
        cKVisitor4.endVisit(returnStatement11);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ASTNode aSTNode5 = null;
        boolean boolean6 = cKVisitor4.preVisit2(aSTNode5);
        org.eclipse.jdt.core.dom.SwitchStatement switchStatement7 = null;
        boolean boolean8 = cKVisitor4.visit(switchStatement7);
        org.eclipse.jdt.core.dom.ArrayType arrayType9 = null;
        boolean boolean10 = cKVisitor4.visit(arrayType9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        cKMethodResult4.setStartLine((int) (byte) -1);
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        // The following exception was thrown during execution in test generation
        try {
            com.github.mauricioaniche.ck.ResultWriter resultWriter5 = new com.github.mauricioaniche.ck.ResultWriter("hi!", "", "hi!", "", false);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getComparisonsQty();
        cKMethodResult4.setReturnQty((int) (byte) -1);
        cKMethodResult4.setCboModified((int) (byte) 100);
        int int10 = cKMethodResult4.getFanout();
        int int11 = cKMethodResult4.getTryCatchQty();
        int int12 = cKMethodResult4.getNumbersQty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.EnumConstantDeclaration enumConstantDeclaration7 = null;
        cKVisitor4.endVisit(enumConstantDeclaration7);
        org.eclipse.jdt.core.dom.IfStatement ifStatement9 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(ifStatement9);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
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
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
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
        org.eclipse.jdt.core.dom.SwitchStatement switchStatement11 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(switchStatement11);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MethodRef methodRef5 = null;
        boolean boolean6 = cKVisitor4.visit(methodRef5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
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
        org.eclipse.jdt.core.dom.Assignment assignment17 = null;
        cKVisitor4.endVisit(assignment17);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
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
        org.eclipse.jdt.core.dom.IfStatement ifStatement11 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(ifStatement11);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.WhileStatement whileStatement9 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(whileStatement9);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
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
        org.eclipse.jdt.core.dom.FieldAccess fieldAccess17 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(fieldAccess17);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
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
        org.eclipse.jdt.core.dom.ASTNode aSTNode17 = null;
        cKVisitor4.preVisit(aSTNode17);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
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
        org.eclipse.jdt.core.dom.LabeledStatement labeledStatement13 = null;
        boolean boolean14 = cKVisitor4.visit(labeledStatement13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        int int6 = cKMethodResult4.getMaxNestedBlocks();
        boolean boolean7 = cKMethodResult4.getIsVisible();
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.IntersectionType intersectionType7 = null;
        boolean boolean8 = cKVisitor4.visit(intersectionType7);
        org.eclipse.jdt.core.dom.SwitchStatement switchStatement9 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(switchStatement9);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
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
        org.eclipse.jdt.core.dom.IfStatement ifStatement13 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(ifStatement13);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.VariableDeclarationFragment variableDeclarationFragment5 = null;
        boolean boolean6 = cKVisitor4.visit(variableDeclarationFragment5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
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
        org.eclipse.jdt.core.dom.CatchClause catchClause19 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(catchClause19);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
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
        java.util.Map<java.lang.String, java.lang.Integer> strMap25 = null;
        cKMethodResult14.setVariablesUsage(strMap25);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
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
        org.eclipse.jdt.core.dom.AnonymousClassDeclaration anonymousClassDeclaration17 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(anonymousClassDeclaration17);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
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
        org.eclipse.jdt.core.dom.WildcardType wildcardType17 = null;
        boolean boolean18 = cKVisitor4.visit(wildcardType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", true, 0);
        int int5 = cKMethodResult4.getParenthesizedExpsQty();
        cKMethodResult4.setReturnQty((int) (byte) 100);
        int int8 = cKMethodResult4.getAnonymousClassesQty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
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
        org.eclipse.jdt.core.dom.AnonymousClassDeclaration anonymousClassDeclaration15 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(anonymousClassDeclaration15);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation7 = null;
        cKVisitor4.endVisit(arrayCreation7);
        org.eclipse.jdt.core.dom.CatchClause catchClause9 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(catchClause9);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
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
        org.eclipse.jdt.core.dom.InfixExpression infixExpression13 = null;
        cKVisitor4.endVisit(infixExpression13);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
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
        org.eclipse.jdt.core.dom.ForStatement forStatement15 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(forStatement15);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
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
        org.eclipse.jdt.core.dom.DoStatement doStatement15 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(doStatement15);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
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
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
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
        org.eclipse.jdt.core.dom.LabeledStatement labeledStatement13 = null;
        boolean boolean14 = cKVisitor4.visit(labeledStatement13);
        org.eclipse.jdt.core.dom.SwitchCase switchCase15 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(switchCase15);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
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
        org.eclipse.jdt.core.dom.Initializer initializer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = cKVisitor4.visit(initializer15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
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
        org.eclipse.jdt.core.dom.IfStatement ifStatement15 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(ifStatement15);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.Javadoc javadoc5 = null;
        cKVisitor4.endVisit(javadoc5);
        org.eclipse.jdt.core.dom.MethodDeclaration methodDeclaration7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = cKVisitor4.visit(methodDeclaration7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
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
        org.eclipse.jdt.core.dom.NumberLiteral numberLiteral13 = null;
        boolean boolean14 = cKVisitor4.visit(numberLiteral13);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
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
        org.eclipse.jdt.core.dom.Block block19 = null;
        boolean boolean20 = cKVisitor4.visit(block19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ASTNode aSTNode5 = null;
        boolean boolean6 = cKVisitor4.preVisit2(aSTNode5);
        org.eclipse.jdt.core.dom.FieldAccess fieldAccess7 = null;
        boolean boolean8 = cKVisitor4.visit(fieldAccess7);
        org.eclipse.jdt.core.dom.ContinueStatement continueStatement9 = null;
        cKVisitor4.endVisit(continueStatement9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
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
        org.eclipse.jdt.core.dom.DoStatement doStatement21 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(doStatement21);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
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
        org.eclipse.jdt.core.dom.RecordDeclaration recordDeclaration15 = null;
        boolean boolean16 = cKVisitor4.visit(recordDeclaration15);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation17 = null;
        cKVisitor4.endVisit(arrayCreation17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
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
        org.eclipse.jdt.core.dom.RecordDeclaration recordDeclaration15 = null;
        boolean boolean16 = cKVisitor4.visit(recordDeclaration15);
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
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
        org.eclipse.jdt.core.dom.NumberLiteral numberLiteral11 = null;
        cKVisitor4.endVisit(numberLiteral11);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
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
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        com.github.mauricioaniche.ck.CK cK3 = new com.github.mauricioaniche.ck.CK(false, (int) '4', true);
        java.nio.file.Path path4 = null;
        com.github.mauricioaniche.ck.CKNotifier cKNotifier5 = null;
        java.nio.file.Path[] pathArray6 = new java.nio.file.Path[] {};
        // The following exception was thrown during execution in test generation
        try {
            cK3.calculate(path4, cKNotifier5, pathArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pathArray6);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        // The following exception was thrown during execution in test generation
        try {
            com.github.mauricioaniche.ck.ResultWriter resultWriter5 = new com.github.mauricioaniche.ck.ResultWriter("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "", "", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        com.github.mauricioaniche.ck.CK cK0 = new com.github.mauricioaniche.ck.CK();
        com.github.mauricioaniche.ck.CKNotifier cKNotifier2 = null;
        cK0.calculate("hi!", cKNotifier2);
        java.nio.file.Path path4 = null;
        com.github.mauricioaniche.ck.CKNotifier cKNotifier5 = null;
        // The following exception was thrown during execution in test generation
        try {
            cK0.calculate(path4, cKNotifier5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getUniqueWordsQty();
        cKMethodResult4.setUniqueWordsQty((int) (byte) 10);
        cKMethodResult4.setAnonymousClassesQty((int) (short) 1);
        int int10 = cKMethodResult4.getComparisonsQty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", true, (int) '4');
        int int5 = cKMethodResult4.getAnonymousClassesQty();
        cKMethodResult4.setFanout((int) (short) 100);
        int int8 = cKMethodResult4.getReturnQty();
        cKMethodResult4.setVariablesQty(0);
        cKMethodResult4.setWmc((int) 'a');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
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
        org.eclipse.jdt.core.dom.Block block11 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(block11);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", true, 0);
        cKMethodResult4.setCbo(0);
        int int7 = cKMethodResult4.getAssignmentsQty();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
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
        org.eclipse.jdt.core.dom.SimpleName simpleName19 = null;
        boolean boolean20 = cKVisitor4.visit(simpleName19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
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
        org.eclipse.jdt.core.dom.YieldStatement yieldStatement15 = null;
        cKVisitor4.endVisit(yieldStatement15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getLambdasQty();
        int int6 = cKMethodResult4.getLogStatementsQty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
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
        org.eclipse.jdt.core.dom.SwitchStatement switchStatement13 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(switchStatement13);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
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
        org.eclipse.jdt.core.dom.ConditionalExpression conditionalExpression19 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(conditionalExpression19);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
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
        org.eclipse.jdt.core.dom.ForStatement forStatement13 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(forStatement13);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", true, (int) '4');
        int int5 = cKMethodResult4.getAnonymousClassesQty();
        int int6 = cKMethodResult4.getParametersQty();
        int int7 = cKMethodResult4.getReturnQty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
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
        org.eclipse.jdt.core.dom.Initializer initializer21 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(initializer21);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
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
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression15 = null;
        cKVisitor4.endVisit(parenthesizedExpression15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        java.util.Set<java.lang.String> strSet6 = cKMethodResult4.getFieldsAccessed();
        cKMethodResult4.setNumbersQty((int) (short) 0);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
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
        org.eclipse.jdt.core.dom.ExportsDirective exportsDirective13 = null;
        cKVisitor4.endVisit(exportsDirective13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "hi!", false, (int) (byte) 0);
        cKMethodResult4.setFanout(1);
        cKMethodResult4.setCbo(10);
        int int9 = cKMethodResult4.getAnonymousClassesQty();
        int int10 = cKMethodResult4.getFanin();
        java.util.Set<java.lang.String> strSet11 = cKMethodResult4.getMethodInvocations();
        int int12 = cKMethodResult4.getLogStatementsQty();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
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
        org.eclipse.jdt.core.dom.UsesDirective usesDirective11 = null;
        cKVisitor4.endVisit(usesDirective11);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
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
        org.eclipse.jdt.core.dom.OpensDirective opensDirective11 = null;
        boolean boolean12 = cKVisitor4.visit(opensDirective11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
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
        org.eclipse.jdt.core.dom.SwitchCase switchCase13 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(switchCase13);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
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
        org.eclipse.jdt.core.dom.Javadoc javadoc17 = null;
        cKVisitor4.endVisit(javadoc17);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
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
        org.eclipse.jdt.core.dom.SynchronizedStatement synchronizedStatement15 = null;
        cKVisitor4.endVisit(synchronizedStatement15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
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
        org.eclipse.jdt.core.dom.IfStatement ifStatement13 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(ifStatement13);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
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
        org.eclipse.jdt.core.dom.EnhancedForStatement enhancedForStatement23 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(enhancedForStatement23);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
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
        org.eclipse.jdt.core.dom.AnnotationTypeMemberDeclaration annotationTypeMemberDeclaration15 = null;
        cKVisitor4.endVisit(annotationTypeMemberDeclaration15);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
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
        org.eclipse.jdt.core.dom.EnumDeclaration enumDeclaration15 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(enumDeclaration15);
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
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        int int6 = cKMethodResult4.getStringLiteralsQty();
        int int7 = cKMethodResult4.getRfc();
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
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
        org.eclipse.jdt.core.dom.Initializer initializer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = cKVisitor4.visit(initializer17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
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
        org.eclipse.jdt.core.dom.WhileStatement whileStatement19 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(whileStatement19);
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
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
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
        org.eclipse.jdt.core.dom.Initializer initializer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = cKVisitor4.visit(initializer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        com.github.mauricioaniche.ck.CK cK0 = new com.github.mauricioaniche.ck.CK();
        java.nio.file.Path path1 = null;
        com.github.mauricioaniche.ck.CKNotifier cKNotifier2 = null;
        java.nio.file.Path path3 = null;
        java.nio.file.Path[] pathArray4 = new java.nio.file.Path[] { path3 };
        // The following exception was thrown during execution in test generation
        try {
            cK0.calculate(path1, cKNotifier2, pathArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pathArray4);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
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
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation11 = null;
        cKVisitor4.endVisit(arrayCreation11);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
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
        org.eclipse.jdt.core.dom.SimpleType simpleType11 = null;
        boolean boolean12 = cKVisitor4.visit(simpleType11);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
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
        org.eclipse.jdt.core.dom.Initializer initializer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = cKVisitor4.visit(initializer19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
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
        org.eclipse.jdt.core.dom.SynchronizedStatement synchronizedStatement13 = null;
        boolean boolean14 = cKVisitor4.visit(synchronizedStatement13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
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
        org.eclipse.jdt.core.dom.MethodInvocation methodInvocation19 = null;
        boolean boolean20 = cKVisitor4.visit(methodInvocation19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.LambdaExpression lambdaExpression5 = null;
        cKVisitor4.endVisit(lambdaExpression5);
        org.eclipse.jdt.core.dom.MethodDeclaration methodDeclaration7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = cKVisitor4.visit(methodDeclaration7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
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
        org.eclipse.jdt.core.dom.IfStatement ifStatement11 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(ifStatement11);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
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
        org.eclipse.jdt.core.dom.SwitchExpression switchExpression15 = null;
        cKVisitor4.endVisit(switchExpression15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", true, (int) '4');
        int int5 = cKMethodResult4.getAnonymousClassesQty();
        int int6 = cKMethodResult4.getInnerClassesQty();
        int int7 = cKMethodResult4.getLogStatementsQty();
        int int8 = cKMethodResult4.getFanin();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getLcom();
        cKClassResult4.setLcom((int) '#');
        int int10 = cKClassResult4.getNumberOfPublicFields();
        cKClassResult4.setNumberOfProtectedFields((int) (short) 10);
        int int13 = cKClassResult4.getLoc();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
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
        org.eclipse.jdt.core.dom.SingleMemberAnnotation singleMemberAnnotation19 = null;
        cKVisitor4.endVisit(singleMemberAnnotation19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable0 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable1 = null;
        com.github.mauricioaniche.ck.CKNotifier cKNotifier2 = null;
        com.github.mauricioaniche.ck.MetricsExecutor metricsExecutor3 = new com.github.mauricioaniche.ck.MetricsExecutor(classLevelMetricListCallable0, methodLevelMetricListCallable1, cKNotifier2);
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit5 = null;
        // The following exception was thrown during execution in test generation
        try {
            metricsExecutor3.acceptAST("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getLambdasQty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        cKMethodResult4.setVariablesUsage(strMap6);
        java.lang.String str8 = cKMethodResult4.toString();
        cKMethodResult4.setFanout(1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}" + "'", str8, "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", true, 1);
        cKMethodResult4.setLoc((int) '4');
        cKMethodResult4.setStartLine((int) (byte) 10);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
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
        org.eclipse.jdt.core.dom.BreakStatement breakStatement13 = null;
        cKVisitor4.endVisit(breakStatement13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
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
        org.eclipse.jdt.core.dom.SimpleType simpleType11 = null;
        boolean boolean12 = cKVisitor4.visit(simpleType11);
        org.eclipse.jdt.core.dom.ForStatement forStatement13 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(forStatement13);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
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
        org.eclipse.jdt.core.dom.TypeDeclaration typeDeclaration11 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(typeDeclaration11);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", true, (int) '4');
        int int5 = cKMethodResult4.getAnonymousClassesQty();
        int int6 = cKMethodResult4.getInnerClassesQty();
        int int7 = cKMethodResult4.getModifiers();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
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
        org.eclipse.jdt.core.dom.ConditionalExpression conditionalExpression15 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(conditionalExpression15);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
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
        org.eclipse.jdt.core.dom.BooleanLiteral booleanLiteral11 = null;
        boolean boolean12 = cKVisitor4.visit(booleanLiteral11);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        com.github.mauricioaniche.ck.ResultWriter resultWriter5 = new com.github.mauricioaniche.ck.ResultWriter("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "hi!", "", "", false);
        com.github.mauricioaniche.ck.CKClassResult cKClassResult10 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int11 = cKClassResult10.getNumberOfFinalFields();
        int int12 = cKClassResult10.getLoc();
        resultWriter5.printResult(cKClassResult10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
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
        org.eclipse.jdt.core.dom.FieldDeclaration fieldDeclaration15 = null;
        boolean boolean16 = cKVisitor4.visit(fieldDeclaration15);
        org.eclipse.jdt.core.dom.AnonymousClassDeclaration anonymousClassDeclaration17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = cKVisitor4.visit(anonymousClassDeclaration17);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getUniqueWordsQty();
        int int6 = cKMethodResult4.getNumbersQty();
        int int7 = cKMethodResult4.getStartLine();
        cKMethodResult4.setParenthesizedExpsQty((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
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
        org.eclipse.jdt.core.dom.MethodRef methodRef11 = null;
        cKVisitor4.endVisit(methodRef11);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
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
        org.eclipse.jdt.core.dom.MemberValuePair memberValuePair21 = null;
        cKVisitor4.endVisit(memberValuePair21);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
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
        org.eclipse.jdt.core.dom.WildcardType wildcardType13 = null;
        boolean boolean14 = cKVisitor4.visit(wildcardType13);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setAnonymousClassesQty((int) (byte) -1);
        cKClassResult4.setNumberOfFields(52);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
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
        org.eclipse.jdt.core.dom.SwitchStatement switchStatement13 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(switchStatement13);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
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
        org.eclipse.jdt.core.dom.SwitchStatement switchStatement13 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(switchStatement13);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression7 = null;
        cKVisitor4.endVisit(patternInstanceofExpression7);
        org.eclipse.jdt.core.dom.WhileStatement whileStatement9 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(whileStatement9);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
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
        org.eclipse.jdt.core.dom.SuperMethodInvocation superMethodInvocation23 = null;
        cKVisitor4.endVisit(superMethodInvocation23);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
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
        org.eclipse.jdt.core.dom.SuperFieldAccess superFieldAccess11 = null;
        cKVisitor4.endVisit(superFieldAccess11);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
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
        org.eclipse.jdt.core.dom.QualifiedType qualifiedType13 = null;
        boolean boolean14 = cKVisitor4.visit(qualifiedType13);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getMathOperationsQty();
        cKMethodResult4.setLambdasQty((int) (byte) 0);
        int int8 = cKMethodResult4.getUniqueWordsQty();
        cKMethodResult4.setLoc((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
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
        org.eclipse.jdt.core.dom.CatchClause catchClause15 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(catchClause15);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
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
        org.eclipse.jdt.core.dom.TypeMethodReference typeMethodReference11 = null;
        cKVisitor4.endVisit(typeMethodReference11);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
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
        org.eclipse.jdt.core.dom.PackageDeclaration packageDeclaration19 = null;
        cKVisitor4.endVisit(packageDeclaration19);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getUniqueWordsQty();
        cKMethodResult4.setUniqueWordsQty((int) (byte) 10);
        int int8 = cKMethodResult4.getLogStatementsQty();
        boolean boolean9 = cKMethodResult4.isConstructor();
        int int10 = cKMethodResult4.getMathOperationsQty();
        int int11 = cKMethodResult4.getWmc();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
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
        int int33 = cKMethodResult4.getAnonymousClassesQty();
        cKMethodResult4.setNumbersQty((int) 'a');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
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
        org.eclipse.jdt.core.dom.ArrayInitializer arrayInitializer21 = null;
        cKVisitor4.endVisit(arrayInitializer21);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
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
        org.eclipse.jdt.core.dom.EnhancedForStatement enhancedForStatement19 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(enhancedForStatement19);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
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
        org.eclipse.jdt.core.dom.NumberLiteral numberLiteral15 = null;
        boolean boolean16 = cKVisitor4.visit(numberLiteral15);
        org.eclipse.jdt.core.dom.MethodRef methodRef17 = null;
        cKVisitor4.endVisit(methodRef17);
        org.eclipse.jdt.core.dom.EnhancedForStatement enhancedForStatement19 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(enhancedForStatement19);
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
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
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
        org.eclipse.jdt.core.dom.VariableDeclarationExpression variableDeclarationExpression17 = null;
        boolean boolean18 = cKVisitor4.visit(variableDeclarationExpression17);
        org.eclipse.jdt.core.dom.CatchClause catchClause19 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(catchClause19);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        int int6 = cKMethodResult4.getCboModified();
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
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
        org.eclipse.jdt.core.dom.MethodRef methodRef13 = null;
        boolean boolean14 = cKVisitor4.visit(methodRef13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
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
        org.eclipse.jdt.core.dom.ThrowStatement throwStatement25 = null;
        cKVisitor4.endVisit(throwStatement25);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "hi!", false, (int) (byte) 0);
        int int5 = cKMethodResult4.getReturnQty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
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
        org.eclipse.jdt.core.dom.ConditionalExpression conditionalExpression23 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(conditionalExpression23);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
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
        org.eclipse.jdt.core.dom.YieldStatement yieldStatement23 = null;
        cKVisitor4.endVisit(yieldStatement23);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
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
        org.eclipse.jdt.core.dom.QualifiedName qualifiedName17 = null;
        boolean boolean18 = cKVisitor4.visit(qualifiedName17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
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
        org.eclipse.jdt.core.dom.ArrayAccess arrayAccess17 = null;
        cKVisitor4.endVisit(arrayAccess17);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
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
        org.eclipse.jdt.core.dom.QualifiedName qualifiedName15 = null;
        cKVisitor4.endVisit(qualifiedName15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
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
        org.eclipse.jdt.core.dom.SynchronizedStatement synchronizedStatement13 = null;
        boolean boolean14 = cKVisitor4.visit(synchronizedStatement13);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression15 = null;
        cKVisitor4.endVisit(parenthesizedExpression15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
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
        org.eclipse.jdt.core.dom.WhileStatement whileStatement21 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(whileStatement21);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
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
        org.eclipse.jdt.core.dom.WhileStatement whileStatement15 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(whileStatement15);
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
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
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
        java.util.Set<com.github.mauricioaniche.ck.CKClassResult> cKClassResultSet17 = cKVisitor4.getCollectedClasses();
        org.eclipse.jdt.core.dom.EnhancedForStatement enhancedForStatement18 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(enhancedForStatement18);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(cKClassResultSet17);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
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
        org.eclipse.jdt.core.dom.MethodDeclaration methodDeclaration13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = cKVisitor4.visit(methodDeclaration13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        float float5 = cKClassResult4.getTightClassCohesion();
        cKClassResult4.setAssignmentsQty((int) (short) -1);
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult12 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int13 = cKMethodResult12.getUniqueWordsQty();
        cKMethodResult12.setUniqueWordsQty((int) (byte) 10);
        cKMethodResult12.setAnonymousClassesQty((int) (short) 1);
        java.util.Set<java.lang.String> strSet18 = cKMethodResult12.getFieldsAccessed();
        cKClassResult4.setFieldNames(strSet18);
        int int20 = cKClassResult4.getUniqueWordsQty();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression5 = null;
        boolean boolean6 = cKVisitor4.visit(patternInstanceofExpression5);
        org.eclipse.jdt.core.dom.IfStatement ifStatement7 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(ifStatement7);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        cKClassResult4.setCbo(10);
        java.util.Optional<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultOptional10 = cKClassResult4.getMethod("hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(cKMethodResultOptional10);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
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
        org.eclipse.jdt.core.dom.RequiresDirective requiresDirective15 = null;
        cKVisitor4.endVisit(requiresDirective15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
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
        org.eclipse.jdt.core.dom.SuperMethodInvocation superMethodInvocation15 = null;
        boolean boolean16 = cKVisitor4.visit(superMethodInvocation15);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        java.util.Set<java.lang.String> strSet6 = cKMethodResult4.getMethodInvocationsLocal();
        int int7 = cKMethodResult4.getLambdasQty();
        int int8 = cKMethodResult4.getWmc();
        int int9 = cKMethodResult4.getWmc();
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
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
        boolean boolean22 = cKVisitor4.visit(switchCase21);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
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
        org.eclipse.jdt.core.dom.TextBlock textBlock13 = null;
        cKVisitor4.endVisit(textBlock13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
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
        cKMethodResult18.setLoopQty(10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        cKMethodResult4.setLoc((int) (byte) 100);
        cKMethodResult4.setNumbersQty((-1));
        java.lang.String str9 = cKMethodResult4.toString();
        java.util.Set<java.lang.String> strSet10 = cKMethodResult4.getMethodInvocationsLocal();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}" + "'", str9, "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
        org.junit.Assert.assertNull(strSet10);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
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
        org.eclipse.jdt.core.dom.EnhancedForStatement enhancedForStatement17 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(enhancedForStatement17);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
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
        org.eclipse.jdt.core.dom.ConditionalExpression conditionalExpression23 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(conditionalExpression23);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
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
        org.eclipse.jdt.core.dom.ParameterizedType parameterizedType15 = null;
        boolean boolean16 = cKVisitor4.visit(parameterizedType15);
        org.eclipse.jdt.core.dom.Initializer initializer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = cKVisitor4.visit(initializer17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        com.github.mauricioaniche.ck.CK cK0 = new com.github.mauricioaniche.ck.CK();
        java.nio.file.Path path1 = null;
        com.github.mauricioaniche.ck.CKNotifier cKNotifier2 = null;
        // The following exception was thrown during execution in test generation
        try {
            cK0.calculate(path1, cKNotifier2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
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
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
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
        org.eclipse.jdt.core.dom.MethodRef methodRef13 = null;
        cKVisitor4.endVisit(methodRef13);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
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
        org.eclipse.jdt.core.dom.InstanceofExpression instanceofExpression15 = null;
        cKVisitor4.endVisit(instanceofExpression15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        cKClassResult4.setInnerClassesQty((int) (short) 100);
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit9 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable10 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable11 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor12 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit9, classLevelMetricListCallable10, methodLevelMetricListCallable11);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression13 = null;
        cKVisitor12.endVisit(parenthesizedExpression13);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation15 = null;
        cKVisitor12.endVisit(arrayCreation15);
        org.eclipse.jdt.core.dom.Dimension dimension17 = null;
        cKVisitor12.endVisit(dimension17);
        org.eclipse.jdt.core.dom.LineComment lineComment19 = null;
        boolean boolean20 = cKVisitor12.visit(lineComment19);
        org.eclipse.jdt.core.dom.SuperConstructorInvocation superConstructorInvocation21 = null;
        boolean boolean22 = cKVisitor12.visit(superConstructorInvocation21);
        org.eclipse.jdt.core.dom.TypeParameter typeParameter23 = null;
        cKVisitor12.endVisit(typeParameter23);
        boolean boolean25 = cKClassResult4.equals((java.lang.Object) typeParameter23);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        // The following exception was thrown during execution in test generation
        try {
            com.github.mauricioaniche.ck.ResultWriter resultWriter5 = new com.github.mauricioaniche.ck.ResultWriter("", "", "CKClassResult [file=, className=CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}]", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
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
        org.eclipse.jdt.core.dom.SingleVariableDeclaration singleVariableDeclaration15 = null;
        cKVisitor4.endVisit(singleVariableDeclaration15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
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
        org.eclipse.jdt.core.dom.OpensDirective opensDirective15 = null;
        boolean boolean16 = cKVisitor4.visit(opensDirective15);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
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
        org.eclipse.jdt.core.dom.SynchronizedStatement synchronizedStatement13 = null;
        cKVisitor4.endVisit(synchronizedStatement13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getComparisonsQty();
        cKMethodResult4.setLoc((int) (byte) 10);
        cKMethodResult4.setComparisonsQty(1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
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
        org.eclipse.jdt.core.dom.InstanceofExpression instanceofExpression13 = null;
        boolean boolean14 = cKVisitor4.visit(instanceofExpression13);
        org.eclipse.jdt.core.dom.ClassInstanceCreation classInstanceCreation15 = null;
        boolean boolean16 = cKVisitor4.visit(classInstanceCreation15);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
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
        org.eclipse.jdt.core.dom.VariableDeclarationFragment variableDeclarationFragment17 = null;
        boolean boolean18 = cKVisitor4.visit(variableDeclarationFragment17);
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit19 = null;
        cKVisitor4.endVisit(compilationUnit19);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        java.util.Set<java.lang.String> strSet6 = cKMethodResult4.getMethodInvocationsLocal();
        int int7 = cKMethodResult4.getLambdasQty();
        int int8 = cKMethodResult4.getModifiers();
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
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
        org.eclipse.jdt.core.dom.ASTNode aSTNode19 = null;
        cKVisitor4.preVisit(aSTNode19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
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
        org.eclipse.jdt.core.dom.MethodRef methodRef13 = null;
        boolean boolean14 = cKVisitor4.visit(methodRef13);
        org.eclipse.jdt.core.dom.StringLiteral stringLiteral15 = null;
        cKVisitor4.endVisit(stringLiteral15);
        java.util.Set<com.github.mauricioaniche.ck.CKClassResult> cKClassResultSet17 = cKVisitor4.getCollectedClasses();
        org.eclipse.jdt.core.dom.CharacterLiteral characterLiteral18 = null;
        cKVisitor4.endVisit(characterLiteral18);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(cKClassResultSet17);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
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
        org.eclipse.jdt.core.dom.ConstructorInvocation constructorInvocation15 = null;
        boolean boolean16 = cKVisitor4.visit(constructorInvocation15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
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
        org.eclipse.jdt.core.dom.EnumConstantDeclaration enumConstantDeclaration11 = null;
        boolean boolean12 = cKVisitor4.visit(enumConstantDeclaration11);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        com.github.mauricioaniche.ck.CK cK3 = new com.github.mauricioaniche.ck.CK(false, (int) '4', true);
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
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
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
        org.eclipse.jdt.core.dom.DoStatement doStatement15 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(doStatement15);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
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
        org.eclipse.jdt.core.dom.ArrayInitializer arrayInitializer15 = null;
        cKVisitor4.endVisit(arrayInitializer15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getLcom();
        int int8 = cKClassResult4.getNumberOfFields();
        cKClassResult4.setLcomNormalized((float) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "hi!", false, (int) (byte) 0);
        cKMethodResult4.setFanout(1);
        cKMethodResult4.setCbo(10);
        cKMethodResult4.setLoc((int) (byte) -1);
        java.util.Set<java.lang.String> strSet11 = cKMethodResult4.getMethodInvocationsLocal();
        org.junit.Assert.assertNull(strSet11);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getComparisonsQty();
        cKMethodResult4.setReturnQty((int) (byte) -1);
        cKMethodResult4.setCboModified((int) (byte) 100);
        int int10 = cKMethodResult4.getFanout();
        int int11 = cKMethodResult4.getTryCatchQty();
        int int12 = cKMethodResult4.getRfc();
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = null;
        cKMethodResult4.setFieldUsage(strMap13);
        cKMethodResult4.setAnonymousClassesQty(100);
        int int17 = cKMethodResult4.getModifiers();
        cKMethodResult4.setVariablesQty((-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getLcom();
        cKClassResult4.setLcom((int) '#');
        int int10 = cKClassResult4.getLoopQty();
        cKClassResult4.setNosi((int) (short) -1);
        cKClassResult4.setLoopQty(0);
        int int15 = cKClassResult4.getNumberOfProtectedFields();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
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
        org.eclipse.jdt.core.dom.VariableDeclarationFragment variableDeclarationFragment17 = null;
        cKVisitor4.endVisit(variableDeclarationFragment17);
        org.eclipse.jdt.core.dom.EnumDeclaration enumDeclaration19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = cKVisitor4.visit(enumDeclaration19);
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
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
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
        org.eclipse.jdt.core.dom.SimpleType simpleType19 = null;
        boolean boolean20 = cKVisitor4.visit(simpleType19);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
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
        org.eclipse.jdt.core.dom.ASTNode aSTNode11 = null;
        boolean boolean12 = cKVisitor4.preVisit2(aSTNode11);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getUniqueWordsQty();
        cKMethodResult4.setUniqueWordsQty((int) (byte) 100);
        cKMethodResult4.setFanin((int) (byte) 100);
        int int10 = cKMethodResult4.getInnerClassesQty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
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
        org.eclipse.jdt.core.dom.SuperConstructorInvocation superConstructorInvocation17 = null;
        cKVisitor4.endVisit(superConstructorInvocation17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
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
        org.eclipse.jdt.core.dom.EmptyStatement emptyStatement25 = null;
        boolean boolean26 = cKVisitor4.visit(emptyStatement25);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getUniqueWordsQty();
        cKMethodResult4.setUniqueWordsQty((int) (byte) 10);
        java.util.Set<java.lang.String> strSet8 = cKMethodResult4.getMethodInvocationsLocal();
        cKMethodResult4.setReturnQty((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(strSet8);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getLcom();
        cKClassResult4.setLcom((int) '#');
        int int10 = cKClassResult4.getNumberOfPublicFields();
        int int11 = cKClassResult4.getNumberOfPrivateMethods();
        int int12 = cKClassResult4.getNumberOfAbstractMethods();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
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
        org.eclipse.jdt.core.dom.CatchClause catchClause11 = null;
        boolean boolean12 = cKVisitor4.visit(catchClause11);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getMaxNestedBlocks();
        cKClassResult4.setReturnQty((int) (byte) 10);
        int int8 = cKClassResult4.getNumberOfPrivateMethods();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
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
        org.eclipse.jdt.core.dom.AnnotationTypeMemberDeclaration annotationTypeMemberDeclaration11 = null;
        cKVisitor4.endVisit(annotationTypeMemberDeclaration11);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
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
        org.eclipse.jdt.core.dom.CastExpression castExpression13 = null;
        boolean boolean14 = cKVisitor4.visit(castExpression13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        int int6 = cKMethodResult4.getRfc();
        cKMethodResult4.setFanout(0);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
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
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult30 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "hi!", false, (int) (byte) 0);
        cKMethodResult30.setWmc((int) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap33 = cKMethodResult30.getFieldUsage();
        cKMethodResult14.setVariablesUsage(strMap33);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strMap33);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        com.github.mauricioaniche.ck.CK cK3 = new com.github.mauricioaniche.ck.CK(false, 10, false);
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
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getComparisonsQty();
        java.lang.String str6 = cKMethodResult4.toString();
        boolean boolean7 = cKMethodResult4.getIsVisible();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}" + "'", str6, "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
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
        org.eclipse.jdt.core.dom.PrimitiveType primitiveType15 = null;
        cKVisitor4.endVisit(primitiveType15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ASTNode aSTNode5 = null;
        boolean boolean6 = cKVisitor4.preVisit2(aSTNode5);
        org.eclipse.jdt.core.dom.VariableDeclarationFragment variableDeclarationFragment7 = null;
        boolean boolean8 = cKVisitor4.visit(variableDeclarationFragment7);
        org.eclipse.jdt.core.dom.MethodDeclaration methodDeclaration9 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(methodDeclaration9);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        int int6 = cKMethodResult4.getStringLiteralsQty();
        com.github.mauricioaniche.ck.CKClassResult cKClassResult11 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult11.setStringLiteralsQty((int) (byte) 1);
        java.util.Optional<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultOptional15 = cKClassResult11.getMethod("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
        cKClassResult11.setReturnQty((int) '4');
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult22 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet23 = cKMethodResult22.getMethodInvocations();
        java.util.Set<java.lang.String> strSet24 = cKMethodResult22.getFieldsAccessed();
        java.util.Set<java.lang.String> strSet25 = cKMethodResult22.getMethodInvocations();
        cKClassResult11.setFieldNames(strSet25);
        cKMethodResult4.setMethodInvocations(strSet25);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(cKMethodResultOptional15);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(strSet25);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        float float5 = cKClassResult4.getTightClassCohesion();
        int int6 = cKClassResult4.getMaxNestedBlocks();
        int int7 = cKClassResult4.getMathOperationsQty();
        cKClassResult4.setLcom((-1));
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getLcom();
        cKClassResult4.setLcom((int) '#');
        cKClassResult4.setTightClassCohesion((float) '#');
        int int12 = cKClassResult4.getCbo();
        cKClassResult4.setLoc(0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", true, 0);
        int int5 = cKMethodResult4.getParenthesizedExpsQty();
        int int6 = cKMethodResult4.getLogStatementsQty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
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
        org.eclipse.jdt.core.dom.SwitchStatement switchStatement13 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(switchStatement13);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
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
        org.eclipse.jdt.core.dom.NormalAnnotation normalAnnotation13 = null;
        boolean boolean14 = cKVisitor4.visit(normalAnnotation13);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
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
        org.eclipse.jdt.core.dom.PostfixExpression postfixExpression21 = null;
        boolean boolean22 = cKVisitor4.visit(postfixExpression21);
        org.eclipse.jdt.core.dom.IfStatement ifStatement23 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(ifStatement23);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        java.util.Set<java.lang.String> strSet6 = cKMethodResult4.getFieldsAccessed();
        int int7 = cKMethodResult4.getMaxNestedBlocks();
        java.util.Map<java.lang.String, java.util.Set<java.lang.String>> strMap8 = cKMethodResult4.getMethodInvocationsIndirectLocal();
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(strMap8);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
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
        org.eclipse.jdt.core.dom.SuperFieldAccess superFieldAccess11 = null;
        boolean boolean12 = cKVisitor4.visit(superFieldAccess11);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
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
        org.eclipse.jdt.core.dom.ModuleQualifiedName moduleQualifiedName15 = null;
        boolean boolean16 = cKVisitor4.visit(moduleQualifiedName15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", true, (int) '4');
        int int5 = cKMethodResult4.getAnonymousClassesQty();
        cKMethodResult4.setFanout((int) (short) 100);
        boolean boolean8 = cKMethodResult4.getHasJavadoc();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
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
        org.eclipse.jdt.core.dom.CastExpression castExpression15 = null;
        cKVisitor4.endVisit(castExpression15);
        org.eclipse.jdt.core.dom.FieldAccess fieldAccess17 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(fieldAccess17);
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
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "hi!", false, (int) (byte) 0);
        cKMethodResult4.setFanout(1);
        cKMethodResult4.setCbo(10);
        cKMethodResult4.setAssignmentsQty(0);
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit12 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable13 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable14 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor15 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit12, classLevelMetricListCallable13, methodLevelMetricListCallable14);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression16 = null;
        cKVisitor15.endVisit(parenthesizedExpression16);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation18 = null;
        cKVisitor15.endVisit(arrayCreation18);
        org.eclipse.jdt.core.dom.UsesDirective usesDirective20 = null;
        boolean boolean21 = cKVisitor15.visit(usesDirective20);
        org.eclipse.jdt.core.dom.BlockComment blockComment22 = null;
        cKVisitor15.endVisit(blockComment22);
        org.eclipse.jdt.core.dom.ModuleDeclaration moduleDeclaration24 = null;
        cKVisitor15.endVisit(moduleDeclaration24);
        org.eclipse.jdt.core.dom.ImportDeclaration importDeclaration26 = null;
        cKVisitor15.endVisit(importDeclaration26);
        boolean boolean28 = cKMethodResult4.equals((java.lang.Object) importDeclaration26);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
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
        org.eclipse.jdt.core.dom.TypeDeclaration typeDeclaration15 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(typeDeclaration15);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getComparisonsQty();
        cKMethodResult4.setReturnQty((int) (byte) -1);
        cKMethodResult4.setCboModified((int) (byte) 100);
        int int10 = cKMethodResult4.getFanout();
        int int11 = cKMethodResult4.getTryCatchQty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cKMethodResult4.getFieldUsage();
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult17 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet18 = cKMethodResult17.getMethodInvocations();
        java.util.Set<java.lang.String> strSet19 = cKMethodResult17.getFieldsAccessed();
        int int20 = cKMethodResult17.getReturnQty();
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult25 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int26 = cKMethodResult25.getLambdasQty();
        java.util.Set<java.lang.String> strSet27 = cKMethodResult25.getMethodInvocations();
        cKMethodResult17.setMethodInvocations(strSet27);
        cKMethodResult4.setMethodInvocations(strSet27);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(strSet27);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setStringLiteralsQty((int) (byte) 1);
        int int7 = cKClassResult4.getNumberOfAbstractMethods();
        cKClassResult4.setAnonymousClassesQty(100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
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
        org.eclipse.jdt.core.dom.SwitchExpression switchExpression11 = null;
        cKVisitor4.endVisit(switchExpression11);
        org.eclipse.jdt.core.dom.EmptyStatement emptyStatement13 = null;
        cKVisitor4.endVisit(emptyStatement13);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
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
        java.lang.Class<?> wildcardClass17 = cKVisitor4.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
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
        org.eclipse.jdt.core.dom.ThisExpression thisExpression14 = null;
        boolean boolean15 = cKVisitor4.visit(thisExpression14);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(cKClassResultSet11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
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
        org.eclipse.jdt.core.dom.WhileStatement whileStatement25 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(whileStatement25);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
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
        org.eclipse.jdt.core.dom.LabeledStatement labeledStatement17 = null;
        boolean boolean18 = cKVisitor4.visit(labeledStatement17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
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
        org.eclipse.jdt.core.dom.SingleMemberAnnotation singleMemberAnnotation25 = null;
        cKVisitor4.endVisit(singleMemberAnnotation25);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
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
        org.eclipse.jdt.core.dom.ReturnStatement returnStatement15 = null;
        cKVisitor4.endVisit(returnStatement15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
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
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression17 = null;
        boolean boolean18 = cKVisitor4.visit(parenthesizedExpression17);
        org.eclipse.jdt.core.dom.AnonymousClassDeclaration anonymousClassDeclaration19 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(anonymousClassDeclaration19);
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
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
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
        org.eclipse.jdt.core.dom.SwitchExpression switchExpression17 = null;
        cKVisitor4.endVisit(switchExpression17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
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
        org.eclipse.jdt.core.dom.Initializer initializer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(initializer11);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "hi!", false, (int) (byte) 0);
        cKMethodResult4.setFanout(1);
        cKMethodResult4.setCbo(10);
        int int9 = cKMethodResult4.getAnonymousClassesQty();
        int int10 = cKMethodResult4.getNumbersQty();
        cKMethodResult4.setMathOperationsQty((int) ' ');
        boolean boolean13 = cKMethodResult4.isConstructor();
        java.lang.String str14 = cKMethodResult4.toString();
        int int15 = cKMethodResult4.getParenthesizedExpsQty();
        cKMethodResult4.setRfc((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "CKMethodResult{cbo=10, rfc=0, wmc=0, methodName='hi!'}" + "'", str14, "CKMethodResult{cbo=10, rfc=0, wmc=0, methodName='hi!'}");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
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
        org.eclipse.jdt.core.dom.SwitchCase switchCase11 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(switchCase11);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
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
        org.eclipse.jdt.core.dom.EnumDeclaration enumDeclaration19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = cKVisitor4.visit(enumDeclaration19);
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
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getUniqueWordsQty();
        cKMethodResult4.setUniqueWordsQty((int) (byte) 10);
        int int8 = cKMethodResult4.getMathOperationsQty();
        int int9 = cKMethodResult4.getLoc();
        int int10 = cKMethodResult4.getParenthesizedExpsQty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
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
        org.eclipse.jdt.core.dom.FieldAccess fieldAccess11 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(fieldAccess11);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "hi!", false, (int) (byte) 0);
        cKMethodResult4.setFanout(1);
        cKMethodResult4.setCbo(10);
        int int9 = cKMethodResult4.getAnonymousClassesQty();
        int int10 = cKMethodResult4.getFanin();
        int int11 = cKMethodResult4.getCbo();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
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
        org.eclipse.jdt.core.dom.FieldDeclaration fieldDeclaration13 = null;
        boolean boolean14 = cKVisitor4.visit(fieldDeclaration13);
        org.eclipse.jdt.core.dom.FieldAccess fieldAccess15 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(fieldAccess15);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        cKMethodResult4.setLoc((int) (byte) 100);
        cKMethodResult4.setNumbersQty((-1));
        java.lang.String str9 = cKMethodResult4.toString();
        java.util.Map<java.lang.String, java.util.Set<java.lang.String>> strMap10 = cKMethodResult4.getMethodInvocationsIndirectLocal();
        int int11 = cKMethodResult4.getVariablesQty();
        cKMethodResult4.setCboModified((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}" + "'", str9, "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
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
        org.eclipse.jdt.core.dom.AnonymousClassDeclaration anonymousClassDeclaration17 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(anonymousClassDeclaration17);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
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
        org.eclipse.jdt.core.dom.TypeLiteral typeLiteral23 = null;
        cKVisitor4.endVisit(typeLiteral23);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
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
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression17 = null;
        boolean boolean18 = cKVisitor4.visit(parenthesizedExpression17);
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
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
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
        org.eclipse.jdt.core.dom.DoStatement doStatement17 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(doStatement17);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
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
        org.eclipse.jdt.core.dom.NullLiteral nullLiteral13 = null;
        boolean boolean14 = cKVisitor4.visit(nullLiteral13);
        org.eclipse.jdt.core.dom.DoStatement doStatement15 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(doStatement15);
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
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
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
        org.eclipse.jdt.core.dom.FieldAccess fieldAccess15 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(fieldAccess15);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        com.github.mauricioaniche.ck.ResultWriter resultWriter5 = new com.github.mauricioaniche.ck.ResultWriter("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "hi!", "", "", false);
        resultWriter5.flushAndClose();
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getUniqueWordsQty();
        cKMethodResult4.setUniqueWordsQty((int) (byte) 10);
        int int8 = cKMethodResult4.getMathOperationsQty();
        int int9 = cKMethodResult4.getNumbersQty();
        cKMethodResult4.setAnonymousClassesQty((int) ' ');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
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
        org.eclipse.jdt.core.dom.AssertStatement assertStatement16 = null;
        cKVisitor4.endVisit(assertStatement16);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(cKClassResultSet15);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
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
        org.eclipse.jdt.core.dom.ArrayInitializer arrayInitializer17 = null;
        boolean boolean18 = cKVisitor4.visit(arrayInitializer17);
        org.eclipse.jdt.core.dom.VariableDeclarationExpression variableDeclarationExpression19 = null;
        cKVisitor4.endVisit(variableDeclarationExpression19);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
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
        org.eclipse.jdt.core.dom.InfixExpression infixExpression13 = null;
        boolean boolean14 = cKVisitor4.visit(infixExpression13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
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
        org.eclipse.jdt.core.dom.AnonymousClassDeclaration anonymousClassDeclaration19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = cKVisitor4.visit(anonymousClassDeclaration19);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
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
        org.eclipse.jdt.core.dom.SwitchCase switchCase17 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(switchCase17);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
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
        org.eclipse.jdt.core.dom.EnumDeclaration enumDeclaration11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = cKVisitor4.visit(enumDeclaration11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        java.util.Set<java.lang.String> strSet6 = cKMethodResult4.getMethodInvocationsLocal();
        java.util.Set<java.lang.String> strSet7 = cKMethodResult4.getFieldsAccessed();
        int int8 = cKMethodResult4.getComparisonsQty();
        int int9 = cKMethodResult4.getParametersQty();
        int int10 = cKMethodResult4.getParametersQty();
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getMaxNestedBlocks();
        cKClassResult4.setReturnQty((int) (byte) 10);
        float float8 = cKClassResult4.getLcomNormalized();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
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
        org.eclipse.jdt.core.dom.MethodRef methodRef13 = null;
        boolean boolean14 = cKVisitor4.visit(methodRef13);
        org.eclipse.jdt.core.dom.Initializer initializer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = cKVisitor4.visit(initializer15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable0 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable1 = null;
        com.github.mauricioaniche.ck.CKNotifier cKNotifier2 = null;
        com.github.mauricioaniche.ck.MetricsExecutor metricsExecutor3 = new com.github.mauricioaniche.ck.MetricsExecutor(classLevelMetricListCallable0, methodLevelMetricListCallable1, cKNotifier2);
        java.lang.String[] strArray9 = new java.lang.String[] { "", "CKMethodResult{cbo=10, rfc=0, wmc=0, methodName='hi!'}", "hi!", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=10, rfc=0, wmc=0, methodName='hi!'}" };
        org.eclipse.jdt.core.dom.IBinding[] iBindingArray10 = metricsExecutor3.createBindings(strArray9);
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            metricsExecutor3.acceptAST("hi!", compilationUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(iBindingArray10);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("", "CKClassResult [file=, className=CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}]", false, (int) 'a');
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        cKClassResult4.setInnerClassesQty((int) (short) 100);
        cKClassResult4.setParenthesizedExpsQty((int) '4');
        cKClassResult4.setLoopQty((int) ' ');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setStringLiteralsQty((-1));
        int int7 = cKClassResult4.getCbo();
        int int8 = cKClassResult4.getNumberOfPublicMethods();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        int int6 = cKMethodResult4.getRfc();
        int int7 = cKMethodResult4.getReturnQty();
        int int8 = cKMethodResult4.getMathOperationsQty();
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
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
        org.eclipse.jdt.core.dom.SwitchCase switchCase18 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(switchCase18);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(cKClassResultSet11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
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
        org.eclipse.jdt.core.dom.CatchClause catchClause12 = null;
        boolean boolean13 = cKVisitor4.visit(catchClause12);
        org.eclipse.jdt.core.dom.LabeledStatement labeledStatement14 = null;
        cKVisitor4.endVisit(labeledStatement14);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(cKClassResultSet11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
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
        org.eclipse.jdt.core.dom.ArrayInitializer arrayInitializer19 = null;
        cKVisitor4.endVisit(arrayInitializer19);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getComparisonsQty();
        cKMethodResult4.setReturnQty((int) (byte) -1);
        cKMethodResult4.setMaxNestedBlocks((int) ' ');
        java.lang.String str10 = cKMethodResult4.toString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}" + "'", str10, "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        cKMethodResult4.setLoc((int) (byte) 100);
        cKMethodResult4.setTryCatchQty((int) (byte) -1);
        int int9 = cKMethodResult4.getLoc();
        cKMethodResult4.setHasJavadoc(true);
        int int12 = cKMethodResult4.getLoopQty();
        cKMethodResult4.setInnerClassesQty(52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
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
        org.eclipse.jdt.core.dom.ContinueStatement continueStatement21 = null;
        boolean boolean22 = cKVisitor4.visit(continueStatement21);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
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
        org.eclipse.jdt.core.dom.Modifier modifier17 = null;
        cKVisitor4.endVisit(modifier17);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
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
        org.eclipse.jdt.core.dom.TextBlock textBlock13 = null;
        cKVisitor4.endVisit(textBlock13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
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
        org.eclipse.jdt.core.dom.LabeledStatement labeledStatement13 = null;
        cKVisitor4.endVisit(labeledStatement13);
        org.eclipse.jdt.core.dom.VariableDeclarationFragment variableDeclarationFragment15 = null;
        cKVisitor4.endVisit(variableDeclarationFragment15);
        org.eclipse.jdt.core.dom.IfStatement ifStatement17 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(ifStatement17);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable0 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable1 = null;
        com.github.mauricioaniche.ck.CKNotifier cKNotifier2 = null;
        com.github.mauricioaniche.ck.MetricsExecutor metricsExecutor3 = new com.github.mauricioaniche.ck.MetricsExecutor(classLevelMetricListCallable0, methodLevelMetricListCallable1, cKNotifier2);
        java.lang.String[] strArray9 = new java.lang.String[] { "", "CKMethodResult{cbo=10, rfc=0, wmc=0, methodName='hi!'}", "hi!", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "hi!" };
        org.eclipse.jdt.core.dom.IBinding[] iBindingArray10 = metricsExecutor3.createBindings(strArray9);
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            metricsExecutor3.acceptAST("", compilationUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(iBindingArray10);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        java.util.Set<java.lang.String> strSet6 = cKMethodResult4.getMethodInvocationsLocal();
        cKMethodResult4.setMathOperationsQty((int) '#');
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(strSet6);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
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
        org.eclipse.jdt.core.dom.MemberValuePair memberValuePair15 = null;
        boolean boolean16 = cKVisitor4.visit(memberValuePair15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
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
        org.eclipse.jdt.core.dom.ParameterizedType parameterizedType15 = null;
        boolean boolean16 = cKVisitor4.visit(parameterizedType15);
        org.eclipse.jdt.core.dom.VariableDeclarationStatement variableDeclarationStatement17 = null;
        boolean boolean18 = cKVisitor4.visit(variableDeclarationStatement17);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
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
        org.eclipse.jdt.core.dom.AnnotationTypeDeclaration annotationTypeDeclaration23 = null;
        cKVisitor4.endVisit(annotationTypeDeclaration23);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
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
        org.eclipse.jdt.core.dom.InstanceofExpression instanceofExpression13 = null;
        cKVisitor4.endVisit(instanceofExpression13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getUniqueWordsQty();
        int int6 = cKMethodResult4.getAssignmentsQty();
        cKMethodResult4.setAnonymousClassesQty((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
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
        org.eclipse.jdt.core.dom.MethodRefParameter methodRefParameter17 = null;
        cKVisitor4.endVisit(methodRefParameter17);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
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
        java.lang.String str22 = cKClassResult4.getClassName();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(strSet14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}" + "'", str22, "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getUniqueWordsQty();
        int int7 = cKClassResult4.getUniqueWordsQty();
        cKClassResult4.setMathOperationsQty((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
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
        org.eclipse.jdt.core.dom.SuperMethodInvocation superMethodInvocation15 = null;
        cKVisitor4.endVisit(superMethodInvocation15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "hi!", false, (int) (byte) 0);
        cKMethodResult4.setFanout(1);
        cKMethodResult4.setMathOperationsQty((int) (short) 1);
        java.util.Map<java.lang.String, java.util.Set<java.lang.String>> strMap9 = null;
        cKMethodResult4.setMethodInvocationsIndirectLocal(strMap9);
        cKMethodResult4.setInnerClassesQty((int) (short) 0);
        cKMethodResult4.setStartLine(0);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
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
        org.eclipse.jdt.core.dom.ArrayInitializer arrayInitializer13 = null;
        boolean boolean14 = cKVisitor4.visit(arrayInitializer13);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
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
        boolean boolean21 = cKMethodResult4.isConstructor();
        int int22 = cKMethodResult4.getNumbersQty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(strSet15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
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
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression19 = null;
        boolean boolean20 = cKVisitor4.visit(patternInstanceofExpression19);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
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
        org.eclipse.jdt.core.dom.TextElement textElement13 = null;
        boolean boolean14 = cKVisitor4.visit(textElement13);
        org.eclipse.jdt.core.dom.AnnotationTypeMemberDeclaration annotationTypeMemberDeclaration15 = null;
        boolean boolean16 = cKVisitor4.visit(annotationTypeMemberDeclaration15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
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
        org.eclipse.jdt.core.dom.RecordDeclaration recordDeclaration21 = null;
        boolean boolean22 = cKVisitor4.visit(recordDeclaration21);
        org.eclipse.jdt.core.dom.ContinueStatement continueStatement23 = null;
        cKVisitor4.endVisit(continueStatement23);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getLcom();
        cKClassResult4.setLcom((int) '#');
        cKClassResult4.setTightClassCohesion((float) '#');
        int int12 = cKClassResult4.getNumberOfLogStatements();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
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
        org.eclipse.jdt.core.dom.IntersectionType intersectionType19 = null;
        boolean boolean20 = cKVisitor4.visit(intersectionType19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
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
        org.eclipse.jdt.core.dom.SwitchExpression switchExpression13 = null;
        cKVisitor4.endVisit(switchExpression13);
        org.eclipse.jdt.core.dom.FieldDeclaration fieldDeclaration15 = null;
        cKVisitor4.endVisit(fieldDeclaration15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getLcom();
        cKClassResult4.setLcom((int) '#');
        int int10 = cKClassResult4.getNumberOfPublicFields();
        cKClassResult4.setNumberOfProtectedFields((int) (short) 10);
        int int13 = cKClassResult4.getRfc();
        int int14 = cKClassResult4.getNumberOfPublicMethods();
        cKClassResult4.setLooseClassCohesion((float) 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
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
        cKClassResult4.setNumberOfDefaultMethods((-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
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
        org.eclipse.jdt.core.dom.NumberLiteral numberLiteral15 = null;
        boolean boolean16 = cKVisitor4.visit(numberLiteral15);
        org.eclipse.jdt.core.dom.MethodRef methodRef17 = null;
        cKVisitor4.endVisit(methodRef17);
        org.eclipse.jdt.core.dom.AnnotationTypeMemberDeclaration annotationTypeMemberDeclaration19 = null;
        cKVisitor4.endVisit(annotationTypeMemberDeclaration19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
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
        org.eclipse.jdt.core.dom.ClassInstanceCreation classInstanceCreation17 = null;
        boolean boolean18 = cKVisitor4.visit(classInstanceCreation17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
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
        org.eclipse.jdt.core.dom.ModuleModifier moduleModifier15 = null;
        boolean boolean16 = cKVisitor4.visit(moduleModifier15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getLcom();
        int int8 = cKClassResult4.getNumberOfFields();
        cKClassResult4.setLambdasQty((int) '4');
        cKClassResult4.setNumberOfProtectedMethods(0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
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
        org.eclipse.jdt.core.dom.RecordDeclaration recordDeclaration19 = null;
        cKVisitor4.endVisit(recordDeclaration19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
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
        org.eclipse.jdt.core.dom.PostfixExpression postfixExpression17 = null;
        boolean boolean18 = cKVisitor4.visit(postfixExpression17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        cKMethodResult4.setLoc((int) (byte) 100);
        cKMethodResult4.setNumbersQty((-1));
        int int9 = cKMethodResult4.getWmc();
        int int10 = cKMethodResult4.getRfc();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
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
        org.eclipse.jdt.core.dom.Javadoc javadoc15 = null;
        boolean boolean16 = cKVisitor4.visit(javadoc15);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
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
        org.eclipse.jdt.core.dom.MethodRef methodRef13 = null;
        cKVisitor4.endVisit(methodRef13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
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
        org.eclipse.jdt.core.dom.BooleanLiteral booleanLiteral23 = null;
        boolean boolean24 = cKVisitor4.visit(booleanLiteral23);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
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
        cKClassResult4.setWmc((int) (short) 10);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
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
        org.eclipse.jdt.core.dom.PostfixExpression postfixExpression21 = null;
        boolean boolean22 = cKVisitor4.visit(postfixExpression21);
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit23 = null;
        cKVisitor4.endVisit(compilationUnit23);
        org.eclipse.jdt.core.dom.WhileStatement whileStatement25 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(whileStatement25);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
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
        org.eclipse.jdt.core.dom.QualifiedName qualifiedName19 = null;
        boolean boolean20 = cKVisitor4.visit(qualifiedName19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
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
        int int26 = cKClassResult4.getNumberOfDefaultMethods();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(strSet14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", true, 1);
        int int5 = cKMethodResult4.getWmc();
        boolean boolean6 = cKMethodResult4.getHasJavadoc();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
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
        java.lang.Class<?> wildcardClass25 = cKVisitor4.getClass();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "hi!", false, (int) (byte) 0);
        cKMethodResult4.setFanout(1);
        cKMethodResult4.setCbo(10);
        int int9 = cKMethodResult4.getAnonymousClassesQty();
        cKMethodResult4.setTryCatchQty((int) (short) 100);
        boolean boolean12 = cKMethodResult4.isConstructor();
        cKMethodResult4.setFanout((int) (short) 10);
        int int15 = cKMethodResult4.getRfc();
        int int16 = cKMethodResult4.getMathOperationsQty();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
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
        org.eclipse.jdt.core.dom.NormalAnnotation normalAnnotation13 = null;
        cKVisitor4.endVisit(normalAnnotation13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getLcom();
        cKClassResult4.setLcom((int) '#');
        int int10 = cKClassResult4.getLoopQty();
        cKClassResult4.setNosi((int) (short) -1);
        cKClassResult4.setLoopQty(0);
        cKClassResult4.setCbo((-1));
        cKClassResult4.setNumberOfProtectedMethods(100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
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
        org.eclipse.jdt.core.dom.WildcardType wildcardType15 = null;
        boolean boolean16 = cKVisitor4.visit(wildcardType15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        float float5 = cKClassResult4.getTightClassCohesion();
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult10 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet11 = cKMethodResult10.getMethodInvocations();
        int int12 = cKMethodResult10.getStringLiteralsQty();
        cKMethodResult10.setWmc((int) (byte) 10);
        cKClassResult4.addMethod(cKMethodResult10);
        int int16 = cKClassResult4.getLoc();
        cKClassResult4.setNumberOfAbstractMethods(35);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
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
        org.eclipse.jdt.core.dom.TypeDeclaration typeDeclaration21 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(typeDeclaration21);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
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
        org.eclipse.jdt.core.dom.UnionType unionType17 = null;
        cKVisitor4.endVisit(unionType17);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
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
        org.eclipse.jdt.core.dom.PrimitiveType primitiveType17 = null;
        cKVisitor4.endVisit(primitiveType17);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setStringLiteralsQty((int) (byte) 1);
        cKClassResult4.setNumberOfPrivateMethods((int) (byte) 100);
        int int9 = cKClassResult4.getCbo();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
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
        org.eclipse.jdt.core.dom.ContinueStatement continueStatement19 = null;
        boolean boolean20 = cKVisitor4.visit(continueStatement19);
        org.eclipse.jdt.core.dom.VariableDeclarationStatement variableDeclarationStatement21 = null;
        boolean boolean22 = cKVisitor4.visit(variableDeclarationStatement21);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
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
        org.eclipse.jdt.core.dom.CastExpression castExpression13 = null;
        cKVisitor4.endVisit(castExpression13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getLcom();
        cKClassResult4.setLcom((int) '#');
        int int10 = cKClassResult4.getLoopQty();
        int int11 = cKClassResult4.getMaxNestedBlocks();
        int int12 = cKClassResult4.getMaxNestedBlocks();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getUniqueWordsQty();
        int int7 = cKClassResult4.getUniqueWordsQty();
        int int8 = cKClassResult4.getNosi();
        int int9 = cKClassResult4.getNoc();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
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
        org.eclipse.jdt.core.dom.TagElement tagElement28 = null;
        cKVisitor4.endVisit(tagElement28);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(cKClassResultSet25);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
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
        org.eclipse.jdt.core.dom.Modifier modifier21 = null;
        boolean boolean22 = cKVisitor4.visit(modifier21);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
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
        org.eclipse.jdt.core.dom.TypeLiteral typeLiteral19 = null;
        boolean boolean20 = cKVisitor4.visit(typeLiteral19);
        org.eclipse.jdt.core.dom.Block block21 = null;
        boolean boolean22 = cKVisitor4.visit(block21);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        // The following exception was thrown during execution in test generation
        try {
            com.github.mauricioaniche.ck.ResultWriter resultWriter5 = new com.github.mauricioaniche.ck.ResultWriter("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "", "CKClassResult [file=, className=CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}]", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ASTNode aSTNode5 = null;
        boolean boolean6 = cKVisitor4.preVisit2(aSTNode5);
        org.eclipse.jdt.core.dom.VariableDeclarationStatement variableDeclarationStatement7 = null;
        cKVisitor4.endVisit(variableDeclarationStatement7);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
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
        org.eclipse.jdt.core.dom.QualifiedType qualifiedType13 = null;
        boolean boolean14 = cKVisitor4.visit(qualifiedType13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
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
        org.eclipse.jdt.core.dom.QualifiedName qualifiedName23 = null;
        cKVisitor4.endVisit(qualifiedName23);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getComparisonsQty();
        cKMethodResult4.setReturnQty((int) (byte) -1);
        cKMethodResult4.setCboModified((int) (byte) 100);
        int int10 = cKMethodResult4.getLoc();
        java.util.Map<java.lang.String, java.util.Set<java.lang.String>> strMap11 = null;
        cKMethodResult4.setMethodInvocationsIndirectLocal(strMap11);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
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
        org.eclipse.jdt.core.dom.UnionType unionType15 = null;
        boolean boolean16 = cKVisitor4.visit(unionType15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
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
        org.eclipse.jdt.core.dom.VariableDeclarationExpression variableDeclarationExpression15 = null;
        boolean boolean16 = cKVisitor4.visit(variableDeclarationExpression15);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
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
        org.eclipse.jdt.core.dom.MethodRefParameter methodRefParameter19 = null;
        boolean boolean20 = cKVisitor4.visit(methodRefParameter19);
        org.eclipse.jdt.core.dom.ExpressionMethodReference expressionMethodReference21 = null;
        cKVisitor4.endVisit(expressionMethodReference21);
        org.eclipse.jdt.core.dom.TagElement tagElement23 = null;
        cKVisitor4.endVisit(tagElement23);
        org.eclipse.jdt.core.dom.SwitchStatement switchStatement25 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(switchStatement25);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
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
        org.eclipse.jdt.core.dom.SwitchStatement switchStatement23 = null;
        boolean boolean24 = cKVisitor4.visit(switchStatement23);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
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
        org.eclipse.jdt.core.dom.QualifiedType qualifiedType23 = null;
        boolean boolean24 = cKVisitor4.visit(qualifiedType23);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getLcom();
        cKClassResult4.setLcom((int) '#');
        int int10 = cKClassResult4.getNumberOfPublicFields();
        int int11 = cKClassResult4.getNumberOfPrivateMethods();
        int int12 = cKClassResult4.getNumbersQty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.ModuleQualifiedName moduleQualifiedName7 = null;
        boolean boolean8 = cKVisitor4.visit(moduleQualifiedName7);
        org.eclipse.jdt.core.dom.TypeDeclaration typeDeclaration9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = cKVisitor4.visit(typeDeclaration9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
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
        org.eclipse.jdt.core.dom.InstanceofExpression instanceofExpression19 = null;
        cKVisitor4.endVisit(instanceofExpression19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
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
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
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
        org.eclipse.jdt.core.dom.FieldDeclaration fieldDeclaration15 = null;
        boolean boolean16 = cKVisitor4.visit(fieldDeclaration15);
        org.eclipse.jdt.core.dom.MethodInvocation methodInvocation17 = null;
        boolean boolean18 = cKVisitor4.visit(methodInvocation17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setAnonymousClassesQty((int) (byte) -1);
        int int7 = cKClassResult4.getNumberOfSynchronizedFields();
        cKClassResult4.setAssignmentsQty((int) (byte) 1);
        cKClassResult4.setNumberOfProtectedMethods((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getComparisonsQty();
        cKMethodResult4.setReturnQty((int) (byte) -1);
        int int8 = cKMethodResult4.getModifiers();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
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
        org.eclipse.jdt.core.dom.ArrayInitializer arrayInitializer11 = null;
        cKVisitor4.endVisit(arrayInitializer11);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
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
        org.eclipse.jdt.core.dom.ThrowStatement throwStatement19 = null;
        cKVisitor4.endVisit(throwStatement19);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        java.lang.String str6 = cKMethodResult4.getQualifiedMethodName();
        int int7 = cKMethodResult4.getFanin();
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        cKClassResult4.setNumbersQty((int) (short) 1);
        cKClassResult4.setNosi((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getUniqueWordsQty();
        int int6 = cKMethodResult4.getAssignmentsQty();
        cKMethodResult4.setTryCatchQty((int) (byte) 0);
        cKMethodResult4.setMaxNestedBlocks((int) 'a');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        cKMethodResult4.setLoc((int) (byte) 100);
        cKMethodResult4.setNumbersQty((-1));
        cKMethodResult4.setAssignmentsQty((int) (byte) 100);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
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
        org.eclipse.jdt.core.dom.PrefixExpression prefixExpression11 = null;
        boolean boolean12 = cKVisitor4.visit(prefixExpression11);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
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
        org.eclipse.jdt.core.dom.LineComment lineComment13 = null;
        cKVisitor4.endVisit(lineComment13);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", true, (int) '4');
        int int5 = cKMethodResult4.getAnonymousClassesQty();
        cKMethodResult4.setMaxNestedBlocks((int) ' ');
        cKMethodResult4.setStartLine((int) (short) -1);
        cKMethodResult4.setStringLiteralsQty((int) '4');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
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
        org.eclipse.jdt.core.dom.WhileStatement whileStatement11 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(whileStatement11);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
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
        org.eclipse.jdt.core.dom.Block block11 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(block11);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getUniqueWordsQty();
        cKMethodResult4.setUniqueWordsQty((int) (byte) 10);
        cKMethodResult4.setAnonymousClassesQty((int) (short) 1);
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult14 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet15 = cKMethodResult14.getMethodInvocations();
        cKMethodResult4.setMethodInvocationLocal(strSet15);
        cKMethodResult4.setInnerClassesQty((-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
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
        org.eclipse.jdt.core.dom.QualifiedType qualifiedType23 = null;
        cKVisitor4.endVisit(qualifiedType23);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
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
        org.eclipse.jdt.core.dom.Modifier modifier15 = null;
        cKVisitor4.endVisit(modifier15);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("", "CKClassResult [file=, className=CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}]", false, (int) (byte) 1);
        cKMethodResult4.setMathOperationsQty((int) '#');
        int int7 = cKMethodResult4.getInnerClassesQty();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
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
        org.eclipse.jdt.core.dom.MethodInvocation methodInvocation21 = null;
        cKVisitor4.endVisit(methodInvocation21);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
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
        org.eclipse.jdt.core.dom.TypeLiteral typeLiteral19 = null;
        boolean boolean20 = cKVisitor4.visit(typeLiteral19);
        org.eclipse.jdt.core.dom.IfStatement ifStatement21 = null;
        boolean boolean22 = cKVisitor4.visit(ifStatement21);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
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
        org.eclipse.jdt.core.dom.ParameterizedType parameterizedType15 = null;
        cKVisitor4.endVisit(parameterizedType15);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setStringLiteralsQty((int) (byte) 1);
        java.util.Optional<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultOptional8 = cKClassResult4.getMethod("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
        int int9 = cKClassResult4.getLoopQty();
        cKClassResult4.setLcom(100);
        cKClassResult4.setAnonymousClassesQty(0);
        org.junit.Assert.assertNotNull(cKMethodResultOptional8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        com.github.mauricioaniche.ck.CK cK3 = new com.github.mauricioaniche.ck.CK(false, (int) (byte) 0, true);
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
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", true, 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap5 = cKMethodResult4.getFieldUsage();
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
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
        org.eclipse.jdt.core.dom.EnumDeclaration enumDeclaration17 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(enumDeclaration17);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "", "", 0);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
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
        org.eclipse.jdt.core.dom.MemberValuePair memberValuePair21 = null;
        cKVisitor4.endVisit(memberValuePair21);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
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
        org.eclipse.jdt.core.dom.AnonymousClassDeclaration anonymousClassDeclaration13 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(anonymousClassDeclaration13);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
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
        org.eclipse.jdt.core.dom.NormalAnnotation normalAnnotation15 = null;
        cKVisitor4.endVisit(normalAnnotation15);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
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
        org.eclipse.jdt.core.dom.TextElement textElement18 = null;
        cKVisitor4.endVisit(textElement18);
        org.eclipse.jdt.core.dom.UsesDirective usesDirective20 = null;
        cKVisitor4.endVisit(usesDirective20);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(cKClassResultSet11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
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
        org.eclipse.jdt.core.dom.ContinueStatement continueStatement25 = null;
        boolean boolean26 = cKVisitor4.visit(continueStatement25);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
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
        org.eclipse.jdt.core.dom.TypeDeclaration typeDeclaration13 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(typeDeclaration13);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
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
        org.eclipse.jdt.core.dom.NullLiteral nullLiteral13 = null;
        cKVisitor4.endVisit(nullLiteral13);
        org.eclipse.jdt.core.dom.TryStatement tryStatement15 = null;
        cKVisitor4.endVisit(tryStatement15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getNumberOfFinalFields();
        cKClassResult4.setNumberOfSynchronizedMethods((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        cKMethodResult4.setLoc((int) (byte) 100);
        cKMethodResult4.setTryCatchQty((int) (byte) -1);
        int int9 = cKMethodResult4.getNumbersQty();
        int int10 = cKMethodResult4.getWmc();
        int int11 = cKMethodResult4.getVariablesQty();
        int int12 = cKMethodResult4.getUniqueWordsQty();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
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
        cKVisitor4.endVisit(stringLiteral15);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getUniqueWordsQty();
        cKMethodResult4.setUniqueWordsQty((int) (byte) 10);
        int int8 = cKMethodResult4.getLogStatementsQty();
        boolean boolean9 = cKMethodResult4.isConstructor();
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult14 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int15 = cKMethodResult14.getUniqueWordsQty();
        int int16 = cKMethodResult14.getNumbersQty();
        int int17 = cKMethodResult14.getStartLine();
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult22 = new com.github.mauricioaniche.ck.CKMethodResult("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", true, 0);
        cKMethodResult22.setCbo(0);
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult29 = new com.github.mauricioaniche.ck.CKMethodResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", true, 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap30 = cKMethodResult29.getVariablesUsage();
        cKMethodResult22.setFieldUsage(strMap30);
        cKMethodResult14.setVariablesUsage(strMap30);
        cKMethodResult4.setVariablesUsage(strMap30);
        boolean boolean34 = cKMethodResult4.isConstructor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
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
        java.lang.Class<?> wildcardClass19 = cKVisitor4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
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
        org.eclipse.jdt.core.dom.MethodInvocation methodInvocation17 = null;
        boolean boolean18 = cKVisitor4.visit(methodInvocation17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
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
        org.eclipse.jdt.core.dom.TypeLiteral typeLiteral19 = null;
        boolean boolean20 = cKVisitor4.visit(typeLiteral19);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
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
        org.eclipse.jdt.core.dom.SuperConstructorInvocation superConstructorInvocation19 = null;
        boolean boolean20 = cKVisitor4.visit(superConstructorInvocation19);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getFanout();
        cKClassResult4.setNoc(1);
        int int10 = cKClassResult4.getReturnQty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "hi!", false, (int) (byte) 0);
        cKMethodResult4.setFanout(1);
        cKMethodResult4.setCbo(10);
        boolean boolean9 = cKMethodResult4.getIsVisible();
        cKMethodResult4.setLambdasQty((int) '#');
        int int12 = cKMethodResult4.getStringLiteralsQty();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        java.util.Set<java.lang.String> strSet6 = cKMethodResult4.getMethodInvocationsLocal();
        java.util.Set<java.lang.String> strSet7 = cKMethodResult4.getFieldsAccessed();
        java.lang.String str8 = cKMethodResult4.getQualifiedMethodName();
        int int9 = cKMethodResult4.getRfc();
        int int10 = cKMethodResult4.getModifiers();
        int int11 = cKMethodResult4.getUniqueWordsQty();
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
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
        org.eclipse.jdt.core.dom.TypeDeclaration typeDeclaration15 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(typeDeclaration15);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
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
        org.eclipse.jdt.core.dom.TextBlock textBlock15 = null;
        cKVisitor4.endVisit(textBlock15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
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
        org.eclipse.jdt.core.dom.VariableDeclarationFragment variableDeclarationFragment17 = null;
        boolean boolean18 = cKVisitor4.visit(variableDeclarationFragment17);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getLcom();
        cKClassResult4.setLcom((int) '#');
        int int10 = cKClassResult4.getNumberOfPublicFields();
        int int11 = cKClassResult4.getNumberOfPrivateMethods();
        cKClassResult4.setNumberOfMethods((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
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
        org.eclipse.jdt.core.dom.TypeParameter typeParameter15 = null;
        boolean boolean16 = cKVisitor4.visit(typeParameter15);
        org.eclipse.jdt.core.dom.EnumDeclaration enumDeclaration17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = cKVisitor4.visit(enumDeclaration17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
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
        org.eclipse.jdt.core.dom.Block block21 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(block21);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
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
        org.eclipse.jdt.core.dom.SimpleType simpleType21 = null;
        cKVisitor4.endVisit(simpleType21);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
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
        org.eclipse.jdt.core.dom.NullLiteral nullLiteral13 = null;
        cKVisitor4.endVisit(nullLiteral13);
        org.eclipse.jdt.core.dom.TypeMethodReference typeMethodReference15 = null;
        boolean boolean16 = cKVisitor4.visit(typeMethodReference15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ASTNode aSTNode5 = null;
        boolean boolean6 = cKVisitor4.preVisit2(aSTNode5);
        org.eclipse.jdt.core.dom.SwitchStatement switchStatement7 = null;
        boolean boolean8 = cKVisitor4.visit(switchStatement7);
        org.eclipse.jdt.core.dom.Javadoc javadoc9 = null;
        cKVisitor4.endVisit(javadoc9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getMathOperationsQty();
        cKMethodResult4.setReturnQty(100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cKMethodResult4.getVariablesUsage();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strMap8);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
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
        org.eclipse.jdt.core.dom.TextElement textElement13 = null;
        boolean boolean14 = cKVisitor4.visit(textElement13);
        org.eclipse.jdt.core.dom.RecordDeclaration recordDeclaration15 = null;
        boolean boolean16 = cKVisitor4.visit(recordDeclaration15);
        org.eclipse.jdt.core.dom.QualifiedType qualifiedType17 = null;
        boolean boolean18 = cKVisitor4.visit(qualifiedType17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        int int6 = cKMethodResult4.getStringLiteralsQty();
        cKMethodResult4.setWmc((int) (byte) 10);
        cKMethodResult4.setParametersQty((int) (byte) 1);
        int int11 = cKMethodResult4.getUniqueWordsQty();
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
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
        org.eclipse.jdt.core.dom.BreakStatement breakStatement23 = null;
        boolean boolean24 = cKVisitor4.visit(breakStatement23);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
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
        org.eclipse.jdt.core.dom.FieldDeclaration fieldDeclaration19 = null;
        cKVisitor4.endVisit(fieldDeclaration19);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
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
        org.eclipse.jdt.core.dom.SingleVariableDeclaration singleVariableDeclaration11 = null;
        boolean boolean12 = cKVisitor4.visit(singleVariableDeclaration11);
        org.eclipse.jdt.core.dom.Javadoc javadoc13 = null;
        cKVisitor4.endVisit(javadoc13);
        org.eclipse.jdt.core.dom.ExportsDirective exportsDirective15 = null;
        cKVisitor4.endVisit(exportsDirective15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
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
        org.eclipse.jdt.core.dom.ExpressionMethodReference expressionMethodReference21 = null;
        cKVisitor4.endVisit(expressionMethodReference21);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "hi!", false, (int) (byte) 0);
        cKMethodResult4.setFanout(1);
        cKMethodResult4.setCbo(10);
        int int9 = cKMethodResult4.getAnonymousClassesQty();
        cKMethodResult4.setReturnQty((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
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
        org.eclipse.jdt.core.dom.SimpleType simpleType17 = null;
        cKVisitor4.endVisit(simpleType17);
        org.eclipse.jdt.core.dom.MethodRef methodRef19 = null;
        boolean boolean20 = cKVisitor4.visit(methodRef19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getUniqueWordsQty();
        int int7 = cKClassResult4.getUniqueWordsQty();
        int int8 = cKClassResult4.getNumberOfStaticFields();
        cKClassResult4.setNumberOfDefaultFields(100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getUniqueWordsQty();
        cKClassResult4.setAnonymousClassesQty(0);
        cKClassResult4.setFanin((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
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
        org.eclipse.jdt.core.dom.Initializer initializer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(initializer17);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.RecordDeclaration recordDeclaration7 = null;
        boolean boolean8 = cKVisitor4.visit(recordDeclaration7);
        org.eclipse.jdt.core.dom.Block block9 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(block9);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "hi!", false, (int) (byte) 0);
        cKMethodResult4.setFanout(1);
        cKMethodResult4.setCbo(10);
        cKMethodResult4.setLoc((int) (byte) -1);
        int int11 = cKMethodResult4.getModifiers();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
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
        org.eclipse.jdt.core.dom.FieldAccess fieldAccess19 = null;
        boolean boolean20 = cKVisitor4.visit(fieldAccess19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getComparisonsQty();
        cKMethodResult4.setReturnQty((int) (byte) -1);
        cKMethodResult4.setMaxNestedBlocks((int) ' ');
        int int10 = cKMethodResult4.getParenthesizedExpsQty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        cKClassResult4.setRfc(0);
        cKClassResult4.setNumberOfDefaultFields(0);
        java.lang.String str10 = cKClassResult4.getClassName();
        int int11 = cKClassResult4.getVariablesQty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}" + "'", str10, "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
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
        org.eclipse.jdt.core.dom.VariableDeclarationExpression variableDeclarationExpression15 = null;
        cKVisitor4.endVisit(variableDeclarationExpression15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
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
        org.eclipse.jdt.core.dom.ConstructorInvocation constructorInvocation25 = null;
        cKVisitor4.endVisit(constructorInvocation25);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        com.github.mauricioaniche.ck.CK cK3 = new com.github.mauricioaniche.ck.CK(true, (int) (short) 1, false);
        java.nio.file.Path path4 = null;
        com.github.mauricioaniche.ck.CKNotifier cKNotifier5 = null;
        java.nio.file.Path[] pathArray6 = new java.nio.file.Path[] {};
        // The following exception was thrown during execution in test generation
        try {
            cK3.calculate(path4, cKNotifier5, pathArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pathArray6);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
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
        org.eclipse.jdt.core.dom.Dimension dimension19 = null;
        boolean boolean20 = cKVisitor4.visit(dimension19);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        java.util.Set<java.lang.String> strSet6 = cKMethodResult4.getMethodInvocationsLocal();
        cKMethodResult4.setCboModified(100);
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult13 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int14 = cKMethodResult13.getLambdasQty();
        java.util.Set<java.lang.String> strSet15 = cKMethodResult13.getMethodInvocations();
        cKMethodResult4.setMethodInvocations(strSet15);
        int int17 = cKMethodResult4.getInnerClassesQty();
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getMaxNestedBlocks();
        cKClassResult4.setReturnQty((int) (byte) 10);
        int int8 = cKClassResult4.getNumberOfLogStatements();
        int int9 = cKClassResult4.getNumberOfPrivateMethods();
        int int10 = cKClassResult4.getNumberOfProtectedMethods();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getMaxNestedBlocks();
        int int6 = cKClassResult4.getMaxNestedBlocks();
        int int7 = cKClassResult4.getNumberOfProtectedFields();
        java.lang.String str8 = cKClassResult4.getFile();
        int int9 = cKClassResult4.getNumberOfSynchronizedFields();
        int int10 = cKClassResult4.getNumberOfSynchronizedFields();
        java.util.Optional<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultOptional12 = cKClassResult4.getMethod("");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(cKMethodResultOptional12);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
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
        int int33 = cKMethodResult4.getTryCatchQty();
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
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
        org.eclipse.jdt.core.dom.SingleMemberAnnotation singleMemberAnnotation13 = null;
        cKVisitor4.endVisit(singleMemberAnnotation13);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
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
        org.eclipse.jdt.core.dom.RequiresDirective requiresDirective23 = null;
        boolean boolean24 = cKVisitor4.visit(requiresDirective23);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getUniqueWordsQty();
        int int7 = cKClassResult4.getUniqueWordsQty();
        int int8 = cKClassResult4.getNumberOfStaticFields();
        int int9 = cKClassResult4.getNumberOfAbstractMethods();
        int int10 = cKClassResult4.getWmc();
        int int11 = cKClassResult4.getReturnQty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
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
        org.eclipse.jdt.core.dom.EnumDeclaration enumDeclaration23 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(enumDeclaration23);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.Dimension dimension7 = null;
        cKVisitor4.endVisit(dimension7);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
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
        org.eclipse.jdt.core.dom.SwitchExpression switchExpression11 = null;
        cKVisitor4.endVisit(switchExpression11);
        org.eclipse.jdt.core.dom.SwitchStatement switchStatement13 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(switchStatement13);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setStringLiteralsQty((int) (byte) 1);
        java.util.Optional<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultOptional8 = cKClassResult4.getMethod("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
        int int9 = cKClassResult4.getLoopQty();
        cKClassResult4.setLcom(100);
        int int12 = cKClassResult4.getAssignmentsQty();
        cKClassResult4.setNoc((int) (byte) 0);
        cKClassResult4.setLoc((int) (byte) -1);
        cKClassResult4.setInnerClassesQty((int) (byte) 100);
        org.junit.Assert.assertNotNull(cKMethodResultOptional8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", true, (int) '4');
        int int5 = cKMethodResult4.getAnonymousClassesQty();
        cKMethodResult4.setFanout((int) (short) 100);
        int int8 = cKMethodResult4.getFanin();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable0 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable1 = null;
        com.github.mauricioaniche.ck.CKNotifier cKNotifier2 = null;
        com.github.mauricioaniche.ck.MetricsExecutor metricsExecutor3 = new com.github.mauricioaniche.ck.MetricsExecutor(classLevelMetricListCallable0, methodLevelMetricListCallable1, cKNotifier2);
        java.lang.String[] strArray9 = new java.lang.String[] { "", "CKMethodResult{cbo=10, rfc=0, wmc=0, methodName='hi!'}", "hi!", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "hi!" };
        org.eclipse.jdt.core.dom.IBinding[] iBindingArray10 = metricsExecutor3.createBindings(strArray9);
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            metricsExecutor3.acceptAST("CKMethodResult{cbo=10, rfc=0, wmc=0, methodName='hi!'}", compilationUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(iBindingArray10);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getUniqueWordsQty();
        int int6 = cKMethodResult4.getNumbersQty();
        int int7 = cKMethodResult4.getStartLine();
        cKMethodResult4.setAnonymousClassesQty((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
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
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation17 = null;
        cKVisitor4.endVisit(arrayCreation17);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getInnerClassesQty();
        cKClassResult4.setLogStatementsQty(0);
        int int8 = cKClassResult4.getComparisonsQty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getNumberOfPublicFields();
        int int8 = cKClassResult4.getNumberOfDefaultMethods();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
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
        org.eclipse.jdt.core.dom.UnionType unionType17 = null;
        boolean boolean18 = cKVisitor4.visit(unionType17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        cKMethodResult4.setLoc((int) (byte) 100);
        cKMethodResult4.setTryCatchQty((int) (byte) -1);
        cKMethodResult4.setCbo(0);
        cKMethodResult4.setLambdasQty((int) (byte) 100);
        cKMethodResult4.setNumbersQty((int) (byte) 1);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("", "CKClassResult [file=, className=CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}]", false, (int) (byte) 1);
        cKMethodResult4.setMathOperationsQty((int) '#');
        int int7 = cKMethodResult4.getParametersQty();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
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
        org.eclipse.jdt.core.dom.StringLiteral stringLiteral17 = null;
        boolean boolean18 = cKVisitor4.visit(stringLiteral17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
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
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit19 = null;
        boolean boolean20 = cKVisitor4.visit(compilationUnit19);
        org.eclipse.jdt.core.dom.VariableDeclarationExpression variableDeclarationExpression21 = null;
        cKVisitor4.endVisit(variableDeclarationExpression21);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
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
        boolean boolean14 = cKVisitor4.visit(thisExpression13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
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
        org.eclipse.jdt.core.dom.LambdaExpression lambdaExpression17 = null;
        cKVisitor4.endVisit(lambdaExpression17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
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
        org.eclipse.jdt.core.dom.SingleVariableDeclaration singleVariableDeclaration11 = null;
        boolean boolean12 = cKVisitor4.visit(singleVariableDeclaration11);
        org.eclipse.jdt.core.dom.Javadoc javadoc13 = null;
        cKVisitor4.endVisit(javadoc13);
        org.eclipse.jdt.core.dom.StringLiteral stringLiteral15 = null;
        boolean boolean16 = cKVisitor4.visit(stringLiteral15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        float float5 = cKClassResult4.getTightClassCohesion();
        cKClassResult4.setAssignmentsQty((int) (short) -1);
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult12 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int13 = cKMethodResult12.getUniqueWordsQty();
        cKMethodResult12.setUniqueWordsQty((int) (byte) 10);
        cKMethodResult12.setAnonymousClassesQty((int) (short) 1);
        java.util.Set<java.lang.String> strSet18 = cKMethodResult12.getFieldsAccessed();
        cKClassResult4.setFieldNames(strSet18);
        cKClassResult4.setUniqueWordsQty((int) 'a');
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(strSet18);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.MemberRef memberRef5 = null;
        boolean boolean6 = cKVisitor4.visit(memberRef5);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression7 = null;
        cKVisitor4.endVisit(patternInstanceofExpression7);
        org.eclipse.jdt.core.dom.StringLiteral stringLiteral9 = null;
        cKVisitor4.endVisit(stringLiteral9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
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
        org.eclipse.jdt.core.dom.ModuleDeclaration moduleDeclaration17 = null;
        cKVisitor4.endVisit(moduleDeclaration17);
        org.eclipse.jdt.core.dom.SynchronizedStatement synchronizedStatement19 = null;
        boolean boolean20 = cKVisitor4.visit(synchronizedStatement19);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
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
        org.eclipse.jdt.core.dom.LabeledStatement labeledStatement14 = null;
        cKVisitor4.endVisit(labeledStatement14);
        org.junit.Assert.assertNotNull(cKClassResultSet13);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
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
        org.eclipse.jdt.core.dom.WildcardType wildcardType15 = null;
        boolean boolean16 = cKVisitor4.visit(wildcardType15);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
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
        org.eclipse.jdt.core.dom.FieldDeclaration fieldDeclaration13 = null;
        cKVisitor4.endVisit(fieldDeclaration13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getComparisonsQty();
        cKMethodResult4.setReturnQty((int) (byte) -1);
        cKMethodResult4.setCboModified((int) (byte) 100);
        int int10 = cKMethodResult4.getFanout();
        cKMethodResult4.setParametersQty((-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
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
        org.eclipse.jdt.core.dom.ParameterizedType parameterizedType15 = null;
        boolean boolean16 = cKVisitor4.visit(parameterizedType15);
        org.eclipse.jdt.core.dom.ASTNode aSTNode17 = null;
        boolean boolean18 = cKVisitor4.preVisit2(aSTNode17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
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
        cKClassResult4.setNosi((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
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
        org.eclipse.jdt.core.dom.ReturnStatement returnStatement13 = null;
        cKVisitor4.endVisit(returnStatement13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
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
        org.eclipse.jdt.core.dom.Initializer initializer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = cKVisitor4.visit(initializer19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
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
        cKMethodResult14.setAnonymousClassesQty((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getLambdasQty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = null;
        cKMethodResult4.setVariablesUsage(strMap6);
        java.lang.String str8 = cKMethodResult4.toString();
        int int9 = cKMethodResult4.getReturnQty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}" + "'", str8, "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setNumberOfPublicMethods((int) '#');
        int int7 = cKClassResult4.getNoc();
        cKClassResult4.setNumberOfProtectedFields((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
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
        org.eclipse.jdt.core.dom.Initializer initializer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = cKVisitor4.visit(initializer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getUniqueWordsQty();
        int int6 = cKMethodResult4.getAssignmentsQty();
        cKMethodResult4.setTryCatchQty((int) (byte) 0);
        java.lang.String str9 = cKMethodResult4.getMethodName();
        cKMethodResult4.setLoopQty(52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
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
        org.eclipse.jdt.core.dom.CharacterLiteral characterLiteral15 = null;
        boolean boolean16 = cKVisitor4.visit(characterLiteral15);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression5 = null;
        boolean boolean6 = cKVisitor4.visit(patternInstanceofExpression5);
        org.eclipse.jdt.core.dom.TryStatement tryStatement7 = null;
        boolean boolean8 = cKVisitor4.visit(tryStatement7);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKClassResult [file=, className=CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}]", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.TypeLiteral typeLiteral5 = null;
        cKVisitor4.endVisit(typeLiteral5);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
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
        org.eclipse.jdt.core.dom.CastExpression castExpression15 = null;
        cKVisitor4.endVisit(castExpression15);
        org.eclipse.jdt.core.dom.SingleVariableDeclaration singleVariableDeclaration17 = null;
        boolean boolean18 = cKVisitor4.visit(singleVariableDeclaration17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getMaxNestedBlocks();
        cKClassResult4.setNosi(100);
        int int8 = cKClassResult4.getMaxNestedBlocks();
        cKClassResult4.setVariablesQty(0);
        int int11 = cKClassResult4.getLambdasQty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
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
        org.eclipse.jdt.core.dom.ThrowStatement throwStatement11 = null;
        cKVisitor4.endVisit(throwStatement11);
        org.eclipse.jdt.core.dom.EnumConstantDeclaration enumConstantDeclaration13 = null;
        boolean boolean14 = cKVisitor4.visit(enumConstantDeclaration13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
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
        cKClassResult4.setNumberOfSynchronizedFields((-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
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
        org.eclipse.jdt.core.dom.NumberLiteral numberLiteral23 = null;
        cKVisitor4.endVisit(numberLiteral23);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
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
        org.eclipse.jdt.core.dom.WhileStatement whileStatement17 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(whileStatement17);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
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
        org.eclipse.jdt.core.dom.DoStatement doStatement13 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(doStatement13);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
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
        org.eclipse.jdt.core.dom.NumberLiteral numberLiteral15 = null;
        cKVisitor4.endVisit(numberLiteral15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setStringLiteralsQty((-1));
        int int7 = cKClassResult4.getCbo();
        cKClassResult4.setNumberOfAbstractMethods(100);
        int int10 = cKClassResult4.getCbo();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
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
        int int38 = cKClassResult4.getRfc();
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
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
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
        org.eclipse.jdt.core.dom.CastExpression castExpression25 = null;
        boolean boolean26 = cKVisitor4.visit(castExpression25);
        org.eclipse.jdt.core.dom.QualifiedType qualifiedType27 = null;
        boolean boolean28 = cKVisitor4.visit(qualifiedType27);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
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
        org.eclipse.jdt.core.dom.SuperConstructorInvocation superConstructorInvocation13 = null;
        cKVisitor4.endVisit(superConstructorInvocation13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        com.github.mauricioaniche.ck.CK cK3 = new com.github.mauricioaniche.ck.CK(false, 10, false);
        com.github.mauricioaniche.ck.CKNotifier cKNotifier5 = null;
// flaky:         cK3.calculate("CKClassResult [file=, className=CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}]", cKNotifier5);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
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
        org.eclipse.jdt.core.dom.SingleMemberAnnotation singleMemberAnnotation15 = null;
        cKVisitor4.endVisit(singleMemberAnnotation15);
        org.eclipse.jdt.core.dom.NumberLiteral numberLiteral17 = null;
        boolean boolean18 = cKVisitor4.visit(numberLiteral17);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getUniqueWordsQty();
        int int7 = cKClassResult4.getUniqueWordsQty();
        cKClassResult4.setNumberOfProtectedMethods(52);
        int int10 = cKClassResult4.getNumberOfPublicMethods();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
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
        org.eclipse.jdt.core.dom.TypeLiteral typeLiteral19 = null;
        boolean boolean20 = cKVisitor4.visit(typeLiteral19);
        org.eclipse.jdt.core.dom.ProvidesDirective providesDirective21 = null;
        cKVisitor4.endVisit(providesDirective21);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression23 = null;
        boolean boolean24 = cKVisitor4.visit(parenthesizedExpression23);
        org.eclipse.jdt.core.dom.IntersectionType intersectionType25 = null;
        cKVisitor4.endVisit(intersectionType25);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
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
        org.eclipse.jdt.core.dom.VariableDeclarationFragment variableDeclarationFragment13 = null;
        boolean boolean14 = cKVisitor4.visit(variableDeclarationFragment13);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
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
        org.eclipse.jdt.core.dom.ConditionalExpression conditionalExpression15 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(conditionalExpression15);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
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
        org.eclipse.jdt.core.dom.LabeledStatement labeledStatement21 = null;
        cKVisitor4.endVisit(labeledStatement21);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
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
        org.eclipse.jdt.core.dom.TypeMethodReference typeMethodReference17 = null;
        boolean boolean18 = cKVisitor4.visit(typeMethodReference17);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
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
        org.eclipse.jdt.core.dom.ArrayInitializer arrayInitializer17 = null;
        boolean boolean18 = cKVisitor4.visit(arrayInitializer17);
        org.eclipse.jdt.core.dom.LineComment lineComment19 = null;
        boolean boolean20 = cKVisitor4.visit(lineComment19);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getUniqueWordsQty();
        int int7 = cKClassResult4.getUniqueWordsQty();
        int int8 = cKClassResult4.getNumberOfStaticFields();
        int int9 = cKClassResult4.getNumberOfAbstractMethods();
        int int10 = cKClassResult4.getWmc();
        cKClassResult4.setNumberOfPublicFields(1);
        int int13 = cKClassResult4.getNumberOfSynchronizedMethods();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getUniqueWordsQty();
        int int7 = cKClassResult4.getLoopQty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        java.util.Set<java.lang.String> strSet6 = cKMethodResult4.getFieldsAccessed();
        int int7 = cKMethodResult4.getReturnQty();
        int int8 = cKMethodResult4.getReturnQty();
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getLcom();
        cKClassResult4.setNumberOfFinalFields((int) ' ');
        cKClassResult4.setAnonymousClassesQty((int) '4');
        cKClassResult4.setWmc((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
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
        org.eclipse.jdt.core.dom.WhileStatement whileStatement21 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(whileStatement21);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
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
        org.eclipse.jdt.core.dom.YieldStatement yieldStatement15 = null;
        boolean boolean16 = cKVisitor4.visit(yieldStatement15);
        org.eclipse.jdt.core.dom.ASTNode aSTNode17 = null;
        boolean boolean18 = cKVisitor4.preVisit2(aSTNode17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getLcom();
        cKClassResult4.setLcom((int) '#');
        cKClassResult4.setTightClassCohesion((float) '#');
        java.lang.String str12 = cKClassResult4.toString();
        cKClassResult4.setWmc((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "CKClassResult [file=, className=CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}]" + "'", str12, "CKClassResult [file=, className=CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}]");
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
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
        org.eclipse.jdt.core.dom.LabeledStatement labeledStatement13 = null;
        cKVisitor4.endVisit(labeledStatement13);
        org.eclipse.jdt.core.dom.VariableDeclarationFragment variableDeclarationFragment15 = null;
        cKVisitor4.endVisit(variableDeclarationFragment15);
        org.eclipse.jdt.core.dom.VariableDeclarationFragment variableDeclarationFragment17 = null;
        boolean boolean18 = cKVisitor4.visit(variableDeclarationFragment17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
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
        org.eclipse.jdt.core.dom.NumberLiteral numberLiteral15 = null;
        boolean boolean16 = cKVisitor4.visit(numberLiteral15);
        org.eclipse.jdt.core.dom.MethodRef methodRef17 = null;
        cKVisitor4.endVisit(methodRef17);
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
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
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
        org.eclipse.jdt.core.dom.SuperConstructorInvocation superConstructorInvocation23 = null;
        boolean boolean24 = cKVisitor4.visit(superConstructorInvocation23);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
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
        org.eclipse.jdt.core.dom.TextBlock textBlock15 = null;
        cKVisitor4.endVisit(textBlock15);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "hi!", false, (int) (byte) 0);
        cKMethodResult4.setFanout(1);
        cKMethodResult4.setCbo(10);
        cKMethodResult4.setAssignmentsQty(0);
        cKMethodResult4.setLambdasQty((-1));
        cKMethodResult4.setUniqueWordsQty(52);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getMaxNestedBlocks();
        cKClassResult4.setNosi(100);
        int int8 = cKClassResult4.getMaxNestedBlocks();
        cKClassResult4.setCboModified(10);
        int int11 = cKClassResult4.getNumberOfMethods();
        java.util.Set<java.lang.String> strSet12 = cKClassResult4.getFieldNames();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(strSet12);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
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
        java.lang.Class<?> wildcardClass19 = cKVisitor4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
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
        org.eclipse.jdt.core.dom.SuperMethodReference superMethodReference17 = null;
        cKVisitor4.endVisit(superMethodReference17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
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
        org.eclipse.jdt.core.dom.ArrayType arrayType21 = null;
        cKVisitor4.endVisit(arrayType21);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
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
        org.eclipse.jdt.core.dom.ExpressionStatement expressionStatement27 = null;
        cKVisitor4.endVisit(expressionStatement27);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
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
        org.eclipse.jdt.core.dom.SimpleName simpleName13 = null;
        cKVisitor4.endVisit(simpleName13);
        org.eclipse.jdt.core.dom.AnnotationTypeDeclaration annotationTypeDeclaration15 = null;
        cKVisitor4.endVisit(annotationTypeDeclaration15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getMathOperationsQty();
        int int6 = cKMethodResult4.getRfc();
        boolean boolean7 = cKMethodResult4.getIsVisible();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }
}
