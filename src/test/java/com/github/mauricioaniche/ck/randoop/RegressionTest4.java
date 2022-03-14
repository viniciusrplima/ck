package com.github.mauricioaniche.ck.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
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
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
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
        org.eclipse.jdt.core.dom.SynchronizedStatement synchronizedStatement23 = null;
        boolean boolean24 = cKVisitor4.visit(synchronizedStatement23);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
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
        org.eclipse.jdt.core.dom.FieldDeclaration fieldDeclaration19 = null;
        boolean boolean20 = cKVisitor4.visit(fieldDeclaration19);
        org.eclipse.jdt.core.dom.CastExpression castExpression21 = null;
        cKVisitor4.endVisit(castExpression21);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getFanout();
        cKClassResult4.setNumberOfPublicMethods((int) (short) -1);
        java.util.Set<java.lang.String> strSet10 = cKClassResult4.getFieldNames();
        int int11 = cKClassResult4.getInnerClassesQty();
        cKClassResult4.setLcomNormalized((float) (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(strSet10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        java.util.Set<java.lang.String> strSet6 = cKMethodResult4.getFieldsAccessed();
        int int7 = cKMethodResult4.getReturnQty();
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult12 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int13 = cKMethodResult12.getLambdasQty();
        java.util.Set<java.lang.String> strSet14 = cKMethodResult12.getMethodInvocations();
        cKMethodResult4.setMethodInvocations(strSet14);
        java.util.Set<java.lang.String> strSet16 = cKMethodResult4.getMethodInvocations();
        cKMethodResult4.setFanin((int) (short) 0);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
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
        org.eclipse.jdt.core.dom.CastExpression castExpression25 = null;
        cKVisitor4.endVisit(castExpression25);
        org.eclipse.jdt.core.dom.SimpleType simpleType27 = null;
        boolean boolean28 = cKVisitor4.visit(simpleType27);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
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
        org.eclipse.jdt.core.dom.TypeParameter typeParameter15 = null;
        boolean boolean16 = cKVisitor4.visit(typeParameter15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
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
        org.eclipse.jdt.core.dom.ASTNode aSTNode25 = null;
        cKVisitor4.preVisit(aSTNode25);
        org.eclipse.jdt.core.dom.ReturnStatement returnStatement27 = null;
        boolean boolean28 = cKVisitor4.visit(returnStatement27);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
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
        org.eclipse.jdt.core.dom.PrimitiveType primitiveType15 = null;
        cKVisitor4.endVisit(primitiveType15);
        org.eclipse.jdt.core.dom.TypeLiteral typeLiteral17 = null;
        boolean boolean18 = cKVisitor4.visit(typeLiteral17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getMaxNestedBlocks();
        int int6 = cKClassResult4.getMaxNestedBlocks();
        int int7 = cKClassResult4.getNumberOfProtectedFields();
        java.lang.String str8 = cKClassResult4.getFile();
        int int9 = cKClassResult4.getNumberOfSynchronizedFields();
        int int10 = cKClassResult4.getNumberOfSynchronizedFields();
        cKClassResult4.setReturnQty((int) (short) 100);
        int int13 = cKClassResult4.getLcom();
        int int14 = cKClassResult4.getNumberOfPublicMethods();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        int int6 = cKMethodResult4.getStringLiteralsQty();
        cKMethodResult4.setWmc((int) (byte) 10);
        cKMethodResult4.setParametersQty((int) (byte) 1);
        int int11 = cKMethodResult4.getStartLine();
        cKMethodResult4.setAssignmentsQty((int) 'a');
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
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
        org.eclipse.jdt.core.dom.MethodDeclaration methodDeclaration19 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(methodDeclaration19);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
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
        int int28 = cKClassResult4.getRfc();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
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
        org.eclipse.jdt.core.dom.Block block15 = null;
        boolean boolean16 = cKVisitor4.visit(block15);
        org.eclipse.jdt.core.dom.VariableDeclarationStatement variableDeclarationStatement17 = null;
        cKVisitor4.endVisit(variableDeclarationStatement17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
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
        org.eclipse.jdt.core.dom.MethodInvocation methodInvocation11 = null;
        cKVisitor4.endVisit(methodInvocation11);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression13 = null;
        boolean boolean14 = cKVisitor4.visit(parenthesizedExpression13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
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
        org.eclipse.jdt.core.dom.ModuleDeclaration moduleDeclaration29 = null;
        cKVisitor4.endVisit(moduleDeclaration29);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
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
        org.eclipse.jdt.core.dom.CreationReference creationReference15 = null;
        cKVisitor4.endVisit(creationReference15);
        org.eclipse.jdt.core.dom.IfStatement ifStatement17 = null;
        boolean boolean18 = cKVisitor4.visit(ifStatement17);
        org.eclipse.jdt.core.dom.UnionType unionType19 = null;
        cKVisitor4.endVisit(unionType19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getUniqueWordsQty();
        cKClassResult4.setAnonymousClassesQty(0);
        cKClassResult4.setLcomNormalized((float) (short) -1);
        int int11 = cKClassResult4.getAnonymousClassesQty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getUniqueWordsQty();
        cKMethodResult4.setUniqueWordsQty((int) (byte) 10);
        int int8 = cKMethodResult4.getLogStatementsQty();
        int int9 = cKMethodResult4.getCbo();
        int int10 = cKMethodResult4.getLogStatementsQty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getUniqueWordsQty();
        int int6 = cKMethodResult4.getNumbersQty();
        int int7 = cKMethodResult4.getStartLine();
        cKMethodResult4.setCbo((int) (short) 100);
        int int10 = cKMethodResult4.getLogStatementsQty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
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
        org.eclipse.jdt.core.dom.ArrayInitializer arrayInitializer19 = null;
        cKVisitor4.endVisit(arrayInitializer19);
        org.eclipse.jdt.core.dom.ConstructorInvocation constructorInvocation21 = null;
        boolean boolean22 = cKVisitor4.visit(constructorInvocation21);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
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
        org.eclipse.jdt.core.dom.IntersectionType intersectionType15 = null;
        boolean boolean16 = cKVisitor4.visit(intersectionType15);
        org.eclipse.jdt.core.dom.Block block17 = null;
        boolean boolean18 = cKVisitor4.visit(block17);
        org.eclipse.jdt.core.dom.NullLiteral nullLiteral19 = null;
        cKVisitor4.endVisit(nullLiteral19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
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
        int int22 = cKClassResult4.getComparisonsQty();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
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
        cKClassResult4.setWmc((int) ' ');
        int int24 = cKClassResult4.getMaxNestedBlocks();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(strSet14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        cKClassResult4.setRfc(0);
        int int8 = cKClassResult4.getNumberOfFinalFields();
        int int9 = cKClassResult4.getLoc();
        int int10 = cKClassResult4.getNosi();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getFanout();
        cKClassResult4.setNoc(1);
        cKClassResult4.setMaxNestedBlocks((int) (short) 0);
        int int12 = cKClassResult4.getLoopQty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getInnerClassesQty();
        cKClassResult4.setLogStatementsQty(0);
        int int8 = cKClassResult4.getAssignmentsQty();
        cKClassResult4.setNumberOfStaticFields((int) (short) 10);
        float float11 = cKClassResult4.getLcomNormalized();
        cKClassResult4.setInnerClassesQty((int) '#');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
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
        org.eclipse.jdt.core.dom.ProvidesDirective providesDirective25 = null;
        boolean boolean26 = cKVisitor4.visit(providesDirective25);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "hi!", false, (int) (byte) 0);
        cKMethodResult4.setFanout(1);
        cKMethodResult4.setCbo(10);
        int int9 = cKMethodResult4.getAnonymousClassesQty();
        int int10 = cKMethodResult4.getNumbersQty();
        cKMethodResult4.setMathOperationsQty((int) ' ');
        cKMethodResult4.setTryCatchQty((int) (byte) 100);
        cKMethodResult4.setLoopQty((int) (byte) 10);
        cKMethodResult4.setFanin(1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
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
        org.eclipse.jdt.core.dom.MethodRefParameter methodRefParameter17 = null;
        boolean boolean18 = cKVisitor4.visit(methodRefParameter17);
        org.eclipse.jdt.core.dom.VariableDeclarationFragment variableDeclarationFragment19 = null;
        cKVisitor4.endVisit(variableDeclarationFragment19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getUniqueWordsQty();
        int int6 = cKMethodResult4.getNumbersQty();
        int int7 = cKMethodResult4.getVariablesQty();
        java.util.Set<java.lang.String> strSet8 = null;
        cKMethodResult4.setMethodInvocations(strSet8);
        java.lang.String str10 = cKMethodResult4.getMethodName();
        int int11 = cKMethodResult4.getTryCatchQty();
        java.util.Set<java.lang.String> strSet12 = cKMethodResult4.getMethodInvocations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getInnerClassesQty();
        cKClassResult4.setLogStatementsQty(0);
        int int8 = cKClassResult4.getAssignmentsQty();
        cKClassResult4.setNumberOfStaticFields((int) (short) 10);
        float float11 = cKClassResult4.getLcomNormalized();
        cKClassResult4.setNumberOfMethods(1);
        cKClassResult4.setReturnQty(100);
        java.util.Set<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultSet16 = cKClassResult4.getVisibleMethods();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertNotNull(cKMethodResultSet16);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
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
        int int22 = cKClassResult4.getNumberOfAbstractMethods();
        org.junit.Assert.assertNotNull(cKMethodResultOptional8);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}" + "'", str21, "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
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
        cKClassResult4.setNumberOfFinalMethods((int) (short) 0);
        org.junit.Assert.assertNotNull(cKMethodResultOptional8);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        cKClassResult4.setNumberOfProtectedMethods((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getComparisonsQty();
        cKMethodResult4.setComparisonsQty((-1));
        int int8 = cKMethodResult4.getMaxNestedBlocks();
        cKMethodResult4.setRfc((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
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
        org.eclipse.jdt.core.dom.TypeLiteral typeLiteral25 = null;
        boolean boolean26 = cKVisitor4.visit(typeLiteral25);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
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
        org.eclipse.jdt.core.dom.IfStatement ifStatement21 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(ifStatement21);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
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
        org.eclipse.jdt.core.dom.AnonymousClassDeclaration anonymousClassDeclaration19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = cKVisitor4.visit(anonymousClassDeclaration19);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
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
        org.eclipse.jdt.core.dom.FieldDeclaration fieldDeclaration25 = null;
        boolean boolean26 = cKVisitor4.visit(fieldDeclaration25);
        org.eclipse.jdt.core.dom.TypeParameter typeParameter27 = null;
        cKVisitor4.endVisit(typeParameter27);
        org.eclipse.jdt.core.dom.BreakStatement breakStatement29 = null;
        boolean boolean30 = cKVisitor4.visit(breakStatement29);
        org.eclipse.jdt.core.dom.LambdaExpression lambdaExpression31 = null;
        boolean boolean32 = cKVisitor4.visit(lambdaExpression31);
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
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
        cKVisitor4.endVisit(typeParameter15);
        org.eclipse.jdt.core.dom.NumberLiteral numberLiteral17 = null;
        cKVisitor4.endVisit(numberLiteral17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getLcom();
        cKClassResult4.setNumberOfFinalFields((int) ' ');
        int int10 = cKClassResult4.getFanout();
        cKClassResult4.setLooseClassCohesion(1.0f);
        int int13 = cKClassResult4.getLcom();
        cKClassResult4.setNumberOfFinalMethods((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
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
        org.eclipse.jdt.core.dom.UsesDirective usesDirective15 = null;
        boolean boolean16 = cKVisitor4.visit(usesDirective15);
        org.eclipse.jdt.core.dom.ImportDeclaration importDeclaration17 = null;
        cKVisitor4.endVisit(importDeclaration17);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getUniqueWordsQty();
        int int6 = cKMethodResult4.getNumbersQty();
        int int7 = cKMethodResult4.getStartLine();
        java.util.Map<java.lang.String, java.util.Set<java.lang.String>> strMap8 = cKMethodResult4.getMethodInvocationsIndirectLocal();
        java.util.Set<java.lang.String> strSet9 = cKMethodResult4.getMethodInvocations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        java.util.Set<java.lang.String> strSet6 = cKMethodResult4.getMethodInvocationsLocal();
        java.util.Set<java.lang.String> strSet7 = cKMethodResult4.getFieldsAccessed();
        int int8 = cKMethodResult4.getComparisonsQty();
        int int9 = cKMethodResult4.getFanout();
        java.util.Map<java.lang.String, java.util.Set<java.lang.String>> strMap10 = null;
        cKMethodResult4.setMethodInvocationsIndirectLocal(strMap10);
        int int12 = cKMethodResult4.getLoopQty();
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
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
        cKClassResult4.setNumberOfDefaultFields((int) (short) 0);
        int int28 = cKClassResult4.getComparisonsQty();
        int int29 = cKClassResult4.getFanin();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
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
        org.eclipse.jdt.core.dom.RequiresDirective requiresDirective25 = null;
        boolean boolean26 = cKVisitor4.visit(requiresDirective25);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
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
        org.eclipse.jdt.core.dom.WhileStatement whileStatement27 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(whileStatement27);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
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
        org.eclipse.jdt.core.dom.CatchClause catchClause17 = null;
        boolean boolean18 = cKVisitor4.visit(catchClause17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
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
        org.eclipse.jdt.core.dom.SingleMemberAnnotation singleMemberAnnotation21 = null;
        boolean boolean22 = cKVisitor4.visit(singleMemberAnnotation21);
        org.eclipse.jdt.core.dom.TextBlock textBlock23 = null;
        cKVisitor4.endVisit(textBlock23);
        org.eclipse.jdt.core.dom.NumberLiteral numberLiteral25 = null;
        boolean boolean26 = cKVisitor4.visit(numberLiteral25);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        java.util.Set<java.lang.String> strSet6 = cKMethodResult4.getMethodInvocationsLocal();
        cKMethodResult4.setHasJavadoc(false);
        java.util.Map<java.lang.String, java.util.Set<java.lang.String>> strMap9 = null;
        cKMethodResult4.setMethodInvocationsIndirectLocal(strMap9);
        java.util.Set<java.lang.String> strSet11 = cKMethodResult4.getMethodInvocationsLocal();
        int int12 = cKMethodResult4.getStringLiteralsQty();
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertNull(strSet11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        cKClassResult4.setCbo(10);
        cKClassResult4.setNumberOfProtectedFields((-1));
        cKClassResult4.setInnerClassesQty(35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        int int6 = cKMethodResult4.getStringLiteralsQty();
        cKMethodResult4.setWmc((int) (byte) 10);
        int int9 = cKMethodResult4.getMathOperationsQty();
        boolean boolean10 = cKMethodResult4.getIsVisible();
        cKMethodResult4.setStartLine(10);
        int int13 = cKMethodResult4.getStringLiteralsQty();
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "hi!", false, (int) (byte) 0);
        cKMethodResult4.setFanout(1);
        cKMethodResult4.setMathOperationsQty((int) (short) 1);
        java.util.Map<java.lang.String, java.util.Set<java.lang.String>> strMap9 = null;
        cKMethodResult4.setMethodInvocationsIndirectLocal(strMap9);
        cKMethodResult4.setInnerClassesQty((int) (short) 0);
        cKMethodResult4.setLambdasQty(0);
        int int15 = cKMethodResult4.getLoc();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setStringLiteralsQty((-1));
        int int7 = cKClassResult4.getNumberOfLogStatements();
        int int8 = cKClassResult4.getVariablesQty();
        cKClassResult4.setNumberOfPublicFields((-1));
        cKClassResult4.setInnerClassesQty((int) 'a');
        int int13 = cKClassResult4.getAssignmentsQty();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
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
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation25 = null;
        boolean boolean26 = cKVisitor4.visit(arrayCreation25);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
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
        org.eclipse.jdt.core.dom.ReturnStatement returnStatement17 = null;
        boolean boolean18 = cKVisitor4.visit(returnStatement17);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
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
        org.eclipse.jdt.core.dom.TypeDeclarationStatement typeDeclarationStatement17 = null;
        boolean boolean18 = cKVisitor4.visit(typeDeclarationStatement17);
        org.eclipse.jdt.core.dom.QualifiedType qualifiedType19 = null;
        boolean boolean20 = cKVisitor4.visit(qualifiedType19);
        org.eclipse.jdt.core.dom.ReturnStatement returnStatement21 = null;
        cKVisitor4.endVisit(returnStatement21);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
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
        org.eclipse.jdt.core.dom.SuperMethodReference superMethodReference15 = null;
        boolean boolean16 = cKVisitor4.visit(superMethodReference15);
        org.eclipse.jdt.core.dom.SuperMethodInvocation superMethodInvocation17 = null;
        boolean boolean18 = cKVisitor4.visit(superMethodInvocation17);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
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
        org.eclipse.jdt.core.dom.ArrayAccess arrayAccess17 = null;
        boolean boolean18 = cKVisitor4.visit(arrayAccess17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
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
        org.eclipse.jdt.core.dom.RequiresDirective requiresDirective21 = null;
        boolean boolean22 = cKVisitor4.visit(requiresDirective21);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
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
        org.eclipse.jdt.core.dom.SingleMemberAnnotation singleMemberAnnotation13 = null;
        cKVisitor4.endVisit(singleMemberAnnotation13);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
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
        org.eclipse.jdt.core.dom.RequiresDirective requiresDirective15 = null;
        boolean boolean16 = cKVisitor4.visit(requiresDirective15);
        org.eclipse.jdt.core.dom.EmptyStatement emptyStatement17 = null;
        cKVisitor4.endVisit(emptyStatement17);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
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
        org.eclipse.jdt.core.dom.RecordDeclaration recordDeclaration19 = null;
        cKVisitor4.endVisit(recordDeclaration19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
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
        org.eclipse.jdt.core.dom.InstanceofExpression instanceofExpression23 = null;
        cKVisitor4.endVisit(instanceofExpression23);
        org.eclipse.jdt.core.dom.SwitchStatement switchStatement25 = null;
        boolean boolean26 = cKVisitor4.visit(switchStatement25);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getUniqueWordsQty();
        int int7 = cKClassResult4.getUniqueWordsQty();
        int int8 = cKClassResult4.getNumberOfStaticFields();
        cKClassResult4.setNosi((int) (byte) 100);
        int int11 = cKClassResult4.getNumberOfStaticFields();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
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
        int int24 = cKMethodResult4.getVariablesQty();
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
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        cKClassResult4.setUniqueWordsQty((int) '#');
        cKClassResult4.setAnonymousClassesQty((-1));
        int int10 = cKClassResult4.getDit();
        cKClassResult4.setInnerClassesQty((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
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
        org.eclipse.jdt.core.dom.SuperMethodInvocation superMethodInvocation17 = null;
        cKVisitor4.endVisit(superMethodInvocation17);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
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
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression17 = null;
        boolean boolean18 = cKVisitor4.visit(patternInstanceofExpression17);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
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
        org.eclipse.jdt.core.dom.SwitchStatement switchStatement15 = null;
        boolean boolean16 = cKVisitor4.visit(switchStatement15);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        float float5 = cKClassResult4.getTightClassCohesion();
        cKClassResult4.setNumberOfSynchronizedFields(35);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
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
        int int36 = cKClassResult4.getNumberOfFields();
        int int37 = cKClassResult4.getNumberOfLogStatements();
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
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
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
        org.eclipse.jdt.core.dom.UnionType unionType15 = null;
        boolean boolean16 = cKVisitor4.visit(unionType15);
        org.eclipse.jdt.core.dom.SwitchStatement switchStatement17 = null;
        boolean boolean18 = cKVisitor4.visit(switchStatement17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getLcom();
        cKClassResult4.setLcom((int) '#');
        int int10 = cKClassResult4.getLoopQty();
        int int11 = cKClassResult4.getMaxNestedBlocks();
        int int12 = cKClassResult4.getNumberOfSynchronizedFields();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        int int6 = cKMethodResult4.getStringLiteralsQty();
        cKMethodResult4.setInnerClassesQty((int) (short) -1);
        cKMethodResult4.setRfc(10);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
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
        org.eclipse.jdt.core.dom.VariableDeclarationExpression variableDeclarationExpression21 = null;
        boolean boolean22 = cKVisitor4.visit(variableDeclarationExpression21);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setNumberOfAbstractMethods((int) (short) 0);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
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
        int int24 = cKClassResult4.getNumberOfFields();
        cKClassResult4.setParenthesizedExpsQty((int) (short) 10);
        org.junit.Assert.assertNotNull(cKMethodResultOptional8);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
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
        org.eclipse.jdt.core.dom.UnionType unionType23 = null;
        cKVisitor4.endVisit(unionType23);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        cKClassResult4.setNumberOfStaticMethods(1);
        int int8 = cKClassResult4.getParenthesizedExpsQty();
        int int9 = cKClassResult4.getNosi();
        int int10 = cKClassResult4.getNumberOfStaticMethods();
        float float11 = cKClassResult4.getLcomNormalized();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setStringLiteralsQty((int) (byte) 1);
        java.util.Optional<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultOptional8 = cKClassResult4.getMethod("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
        int int9 = cKClassResult4.getLoopQty();
        cKClassResult4.setLcom(100);
        int int12 = cKClassResult4.getAssignmentsQty();
        cKClassResult4.setNoc((int) (byte) 0);
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit16 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable17 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable18 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor19 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit16, classLevelMetricListCallable17, methodLevelMetricListCallable18);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression20 = null;
        cKVisitor19.endVisit(parenthesizedExpression20);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation22 = null;
        cKVisitor19.endVisit(arrayCreation22);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression24 = null;
        cKVisitor19.endVisit(patternInstanceofExpression24);
        org.eclipse.jdt.core.dom.InstanceofExpression instanceofExpression26 = null;
        cKVisitor19.endVisit(instanceofExpression26);
        org.eclipse.jdt.core.dom.Assignment assignment28 = null;
        cKVisitor19.endVisit(assignment28);
        org.eclipse.jdt.core.dom.SimpleType simpleType30 = null;
        cKVisitor19.endVisit(simpleType30);
        org.eclipse.jdt.core.dom.PatternInstanceofExpression patternInstanceofExpression32 = null;
        cKVisitor19.endVisit(patternInstanceofExpression32);
        org.eclipse.jdt.core.dom.LineComment lineComment34 = null;
        boolean boolean35 = cKVisitor19.visit(lineComment34);
        org.eclipse.jdt.core.dom.PrimitiveType primitiveType36 = null;
        boolean boolean37 = cKVisitor19.visit(primitiveType36);
        org.eclipse.jdt.core.dom.SuperMethodInvocation superMethodInvocation38 = null;
        cKVisitor19.endVisit(superMethodInvocation38);
        boolean boolean40 = cKClassResult4.equals((java.lang.Object) cKVisitor19);
        org.junit.Assert.assertNotNull(cKMethodResultOptional8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
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
        org.eclipse.jdt.core.dom.Assignment assignment21 = null;
        cKVisitor4.endVisit(assignment21);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setStringLiteralsQty((-1));
        int int7 = cKClassResult4.getCbo();
        java.util.Set<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultSet8 = cKClassResult4.getVisibleMethods();
        cKClassResult4.setComparisonsQty(1);
        int int11 = cKClassResult4.getCbo();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(cKMethodResultSet8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getMaxNestedBlocks();
        cKClassResult4.setNosi(100);
        int int8 = cKClassResult4.getMaxNestedBlocks();
        cKClassResult4.setCboModified(10);
        int int11 = cKClassResult4.getLambdasQty();
        cKClassResult4.setFanout((int) (short) 0);
        java.util.Set<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultSet14 = cKClassResult4.getVisibleMethods();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(cKMethodResultSet14);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
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
        org.eclipse.jdt.core.dom.RecordDeclaration recordDeclaration15 = null;
        boolean boolean16 = cKVisitor4.visit(recordDeclaration15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        com.github.mauricioaniche.ck.ResultWriter resultWriter5 = new com.github.mauricioaniche.ck.ResultWriter("CKClassResult [file=, className=CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}]", "CKMethodResult{cbo=10, rfc=0, wmc=0, methodName='hi!'}", "CKClassResult [file=, className=CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}]", "CKClassResult [file=, className=CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}]", false);
        com.github.mauricioaniche.ck.CKClassResult cKClassResult10 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult10.setStringLiteralsQty((int) (byte) 1);
        java.util.Optional<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultOptional14 = cKClassResult10.getMethod("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
        cKClassResult10.setNumberOfDefaultMethods(100);
        int int17 = cKClassResult10.getRfc();
        cKClassResult10.setNosi(1);
        resultWriter5.printResult(cKClassResult10);
        cKClassResult10.setNumberOfPublicMethods((int) (byte) -1);
        org.junit.Assert.assertNotNull(cKMethodResultOptional14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getComparisonsQty();
        cKMethodResult4.setReturnQty((int) (byte) -1);
        cKMethodResult4.setCboModified((int) (byte) 100);
        int int10 = cKMethodResult4.getFanout();
        int int11 = cKMethodResult4.getTryCatchQty();
        cKMethodResult4.setMaxNestedBlocks(35);
        java.lang.String str14 = cKMethodResult4.toString();
        cKMethodResult4.setLogStatementsQty((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}" + "'", str14, "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
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
        org.eclipse.jdt.core.dom.ProvidesDirective providesDirective37 = null;
        boolean boolean38 = cKVisitor13.visit(providesDirective37);
        org.eclipse.jdt.core.dom.ASTNode aSTNode39 = null;
        cKVisitor13.postVisit(aSTNode39);
        org.eclipse.jdt.core.dom.Dimension dimension41 = null;
        boolean boolean42 = cKVisitor13.visit(dimension41);
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
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        com.github.mauricioaniche.ck.CK cK3 = new com.github.mauricioaniche.ck.CK(false, (-1), true);
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
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
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
        org.eclipse.jdt.core.dom.BooleanLiteral booleanLiteral17 = null;
        boolean boolean18 = cKVisitor4.visit(booleanLiteral17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
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
        org.eclipse.jdt.core.dom.MemberRef memberRef21 = null;
        boolean boolean22 = cKVisitor4.visit(memberRef21);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
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
        org.eclipse.jdt.core.dom.BreakStatement breakStatement13 = null;
        cKVisitor4.endVisit(breakStatement13);
        org.eclipse.jdt.core.dom.NumberLiteral numberLiteral15 = null;
        cKVisitor4.endVisit(numberLiteral15);
        org.eclipse.jdt.core.dom.ExpressionMethodReference expressionMethodReference17 = null;
        cKVisitor4.endVisit(expressionMethodReference17);
        org.eclipse.jdt.core.dom.ProvidesDirective providesDirective19 = null;
        cKVisitor4.endVisit(providesDirective19);
        org.eclipse.jdt.core.dom.TryStatement tryStatement21 = null;
        cKVisitor4.endVisit(tryStatement21);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        cKClassResult4.setNumberOfStaticMethods(1);
        int int8 = cKClassResult4.getParenthesizedExpsQty();
        int int9 = cKClassResult4.getNosi();
        int int10 = cKClassResult4.getNumberOfSynchronizedFields();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        java.util.Set<java.lang.String> strSet6 = cKMethodResult4.getMethodInvocationsLocal();
        int int7 = cKMethodResult4.getLambdasQty();
        cKMethodResult4.setParametersQty((int) (byte) 1);
        cKMethodResult4.setCboModified((int) (short) 10);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
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
        org.eclipse.jdt.core.dom.TagElement tagElement25 = null;
        boolean boolean26 = cKVisitor4.visit(tagElement25);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
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
        org.eclipse.jdt.core.dom.MethodDeclaration methodDeclaration13 = null;
        // The following exception was thrown during execution in test generation
        try {
            cKVisitor4.endVisit(methodDeclaration13);
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setStringLiteralsQty((int) (byte) 1);
        java.util.Optional<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultOptional8 = cKClassResult4.getMethod("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
        int int9 = cKClassResult4.getLoopQty();
        int int10 = cKClassResult4.getFanin();
        cKClassResult4.setAnonymousClassesQty((int) (short) 0);
        cKClassResult4.setLcom((int) (byte) 10);
        cKClassResult4.setNumberOfProtectedMethods((int) ' ');
        int int17 = cKClassResult4.getNumberOfPrivateFields();
        int int18 = cKClassResult4.getCboModified();
        org.junit.Assert.assertNotNull(cKMethodResultOptional8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
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
        org.eclipse.jdt.core.dom.BooleanLiteral booleanLiteral23 = null;
        cKVisitor4.endVisit(booleanLiteral23);
        org.eclipse.jdt.core.dom.MethodDeclaration methodDeclaration25 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = cKVisitor4.visit(methodDeclaration25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "hi!", false, (int) (byte) 0);
        cKMethodResult4.setFanout(1);
        cKMethodResult4.setCbo(10);
        int int9 = cKMethodResult4.getAnonymousClassesQty();
        int int10 = cKMethodResult4.getNumbersQty();
        cKMethodResult4.setAnonymousClassesQty(1);
        java.lang.String str13 = cKMethodResult4.getQualifiedMethodName();
        int int14 = cKMethodResult4.getInnerClassesQty();
        int int15 = cKMethodResult4.getLogStatementsQty();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setStringLiteralsQty((int) (byte) 1);
        java.util.Optional<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultOptional8 = cKClassResult4.getMethod("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}");
        cKClassResult4.setNumberOfDefaultMethods(100);
        java.util.Set<java.lang.String> strSet11 = cKClassResult4.getFieldNames();
        cKClassResult4.setNumberOfDefaultMethods((int) 'a');
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult18 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int19 = cKMethodResult18.getUniqueWordsQty();
        int int20 = cKMethodResult18.getNumbersQty();
        int int21 = cKMethodResult18.getStartLine();
        java.util.Map<java.lang.String, java.lang.Integer> strMap22 = cKMethodResult18.getFieldUsage();
        cKMethodResult18.setRfc(0);
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult29 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int30 = cKMethodResult29.getUniqueWordsQty();
        cKMethodResult29.setUniqueWordsQty((int) (byte) 10);
        int int33 = cKMethodResult29.getLogStatementsQty();
        boolean boolean34 = cKMethodResult29.isConstructor();
        int int35 = cKMethodResult29.getMathOperationsQty();
        int int36 = cKMethodResult29.getInnerClassesQty();
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult41 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int42 = cKMethodResult41.getUniqueWordsQty();
        cKMethodResult41.setUniqueWordsQty((int) (byte) 10);
        int int45 = cKMethodResult41.getLogStatementsQty();
        int int46 = cKMethodResult41.getCbo();
        java.util.Set<java.lang.String> strSet47 = cKMethodResult41.getFieldsAccessed();
        cKMethodResult29.setMethodInvocationLocal(strSet47);
        cKMethodResult18.setMethodInvocations(strSet47);
        cKClassResult4.setFieldNames(strSet47);
        org.junit.Assert.assertNotNull(cKMethodResultOptional8);
        org.junit.Assert.assertNull(strSet11);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(strSet47);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
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
        org.eclipse.jdt.core.dom.MemberValuePair memberValuePair19 = null;
        boolean boolean20 = cKVisitor4.visit(memberValuePair19);
        org.eclipse.jdt.core.dom.ASTNode aSTNode21 = null;
        cKVisitor4.preVisit(aSTNode21);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
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
        org.eclipse.jdt.core.dom.RecordDeclaration recordDeclaration17 = null;
        boolean boolean18 = cKVisitor4.visit(recordDeclaration17);
        org.eclipse.jdt.core.dom.TypeLiteral typeLiteral19 = null;
        cKVisitor4.endVisit(typeLiteral19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        com.github.mauricioaniche.ck.CK cK3 = new com.github.mauricioaniche.ck.CK(true, (int) (byte) 0, true);
        com.github.mauricioaniche.ck.CKNotifier cKNotifier5 = null;
        cK3.calculate("CKMethodResult{cbo=10, rfc=0, wmc=0, methodName='hi!'}", cKNotifier5);
        com.github.mauricioaniche.ck.CKNotifier cKNotifier8 = null;
        // The following exception was thrown during execution in test generation
        try {
            cK3.calculate("", cKNotifier8);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getUniqueWordsQty();
        int int6 = cKMethodResult4.getAssignmentsQty();
        cKMethodResult4.setTryCatchQty((int) (byte) 0);
        java.lang.String str9 = cKMethodResult4.getMethodName();
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = null;
        cKMethodResult4.setVariablesUsage(strMap10);
        cKMethodResult4.setHasJavadoc(false);
        int int14 = cKMethodResult4.getLambdasQty();
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult19 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int20 = cKMethodResult19.getUniqueWordsQty();
        int int21 = cKMethodResult19.getAssignmentsQty();
        cKMethodResult19.setTryCatchQty((int) (byte) 0);
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult28 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet29 = cKMethodResult28.getMethodInvocations();
        java.util.Set<java.lang.String> strSet30 = cKMethodResult28.getMethodInvocationsLocal();
        int int31 = cKMethodResult28.getLambdasQty();
        cKMethodResult28.setParenthesizedExpsQty((int) (short) -1);
        java.util.Set<java.lang.String> strSet34 = cKMethodResult28.getFieldsAccessed();
        cKMethodResult19.setMethodInvocationLocal(strSet34);
        cKMethodResult4.setMethodInvocationLocal(strSet34);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertNull(strSet30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(strSet34);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
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
        org.eclipse.jdt.core.dom.EnumDeclaration enumDeclaration15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = cKVisitor4.visit(enumDeclaration15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        float float5 = cKClassResult4.getTightClassCohesion();
        int int6 = cKClassResult4.getFanout();
        cKClassResult4.setRfc(35);
        cKClassResult4.setLoopQty((int) (byte) 1);
        int int11 = cKClassResult4.getNumberOfLogStatements();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
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
        org.eclipse.jdt.core.dom.CreationReference creationReference15 = null;
        cKVisitor4.endVisit(creationReference15);
        org.eclipse.jdt.core.dom.IfStatement ifStatement17 = null;
        boolean boolean18 = cKVisitor4.visit(ifStatement17);
        org.eclipse.jdt.core.dom.WhileStatement whileStatement19 = null;
        boolean boolean20 = cKVisitor4.visit(whileStatement19);
        org.eclipse.jdt.core.dom.TypeMethodReference typeMethodReference21 = null;
        cKVisitor4.endVisit(typeMethodReference21);
        org.eclipse.jdt.core.dom.ArrayCreation arrayCreation23 = null;
        cKVisitor4.endVisit(arrayCreation23);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        cKMethodResult4.setLoc((int) (byte) 100);
        cKMethodResult4.setTryCatchQty((int) (byte) -1);
        int int9 = cKMethodResult4.getNumbersQty();
        int int10 = cKMethodResult4.getWmc();
        boolean boolean11 = cKMethodResult4.getIsVisible();
        int int12 = cKMethodResult4.getStringLiteralsQty();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
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
        java.util.Set<com.github.mauricioaniche.ck.CKClassResult> cKClassResultSet15 = cKVisitor4.getCollectedClasses();
        org.eclipse.jdt.core.dom.WildcardType wildcardType16 = null;
        cKVisitor4.endVisit(wildcardType16);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(cKClassResultSet15);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
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
        org.eclipse.jdt.core.dom.ForStatement forStatement13 = null;
        boolean boolean14 = cKVisitor4.visit(forStatement13);
        org.eclipse.jdt.core.dom.BreakStatement breakStatement15 = null;
        cKVisitor4.endVisit(breakStatement15);
        org.eclipse.jdt.core.dom.RecordDeclaration recordDeclaration17 = null;
        cKVisitor4.endVisit(recordDeclaration17);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
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
        org.eclipse.jdt.core.dom.MethodRef methodRef17 = null;
        cKVisitor4.endVisit(methodRef17);
        org.eclipse.jdt.core.dom.EnumConstantDeclaration enumConstantDeclaration19 = null;
        cKVisitor4.endVisit(enumConstantDeclaration19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getUniqueWordsQty();
        cKMethodResult4.setUniqueWordsQty((int) (byte) 10);
        cKMethodResult4.setAnonymousClassesQty((int) (short) 1);
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult14 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet15 = cKMethodResult14.getMethodInvocations();
        cKMethodResult4.setMethodInvocationLocal(strSet15);
        cKMethodResult4.setAssignmentsQty((int) (byte) -1);
        cKMethodResult4.setFanout((int) (short) 1);
        int int21 = cKMethodResult4.getAssignmentsQty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
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
        org.eclipse.jdt.core.dom.TypeParameter typeParameter19 = null;
        boolean boolean20 = cKVisitor4.visit(typeParameter19);
        org.eclipse.jdt.core.dom.VariableDeclarationFragment variableDeclarationFragment21 = null;
        cKVisitor4.endVisit(variableDeclarationFragment21);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
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
        org.eclipse.jdt.core.dom.BooleanLiteral booleanLiteral13 = null;
        boolean boolean14 = cKVisitor4.visit(booleanLiteral13);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "hi!", false, (int) (byte) 0);
        cKMethodResult4.setWmc((int) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cKMethodResult4.getFieldUsage();
        java.util.Map<java.lang.String, java.util.Set<java.lang.String>> strMap8 = cKMethodResult4.getMethodInvocationsIndirectLocal();
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(strMap8);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "hi!", false, (int) (byte) 0);
        cKMethodResult4.setFanout(1);
        cKMethodResult4.setMathOperationsQty((int) (short) 1);
        java.lang.String str9 = cKMethodResult4.getMethodName();
        java.util.Map<java.lang.String, java.util.Set<java.lang.String>> strMap10 = cKMethodResult4.getMethodInvocationsIndirectLocal();
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult15 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int16 = cKMethodResult15.getUniqueWordsQty();
        cKMethodResult15.setUniqueWordsQty((int) (byte) 100);
        cKMethodResult15.setStartLine((-1));
        cKMethodResult15.setComparisonsQty((-1));
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult27 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "hi!", false, (int) (byte) 0);
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult32 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int33 = cKMethodResult32.getLambdasQty();
        java.util.Set<java.lang.String> strSet34 = cKMethodResult32.getMethodInvocations();
        cKMethodResult27.setMethodInvocations(strSet34);
        cKMethodResult15.setMethodInvocationLocal(strSet34);
        cKMethodResult4.setMethodInvocations(strSet34);
        java.util.Set<java.lang.String> strSet38 = cKMethodResult4.getMethodInvocationsLocal();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertNull(strSet38);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
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
        org.eclipse.jdt.core.dom.CreationReference creationReference21 = null;
        cKVisitor4.endVisit(creationReference21);
        org.eclipse.jdt.core.dom.BlockComment blockComment23 = null;
        cKVisitor4.endVisit(blockComment23);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit1 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable2 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable3 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor4 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit1, classLevelMetricListCallable2, methodLevelMetricListCallable3);
        org.eclipse.jdt.core.dom.ParenthesizedExpression parenthesizedExpression5 = null;
        cKVisitor4.endVisit(parenthesizedExpression5);
        org.eclipse.jdt.core.dom.Block block7 = null;
        boolean boolean8 = cKVisitor4.visit(block7);
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
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getNumberOfFinalFields();
        java.util.Set<com.github.mauricioaniche.ck.CKMethodResult> cKMethodResultSet8 = cKClassResult4.getMethods();
        cKClassResult4.setLooseClassCohesion((float) '4');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(cKMethodResultSet8);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getUniqueWordsQty();
        int int6 = cKMethodResult4.getNumbersQty();
        cKMethodResult4.setLoopQty((-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
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
        cKClassResult4.setCbo(35);
        int int21 = cKClassResult4.getNoc();
        int int22 = cKClassResult4.getNumberOfSynchronizedFields();
        cKClassResult4.setNumberOfStaticMethods((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
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
        org.eclipse.jdt.core.dom.SuperFieldAccess superFieldAccess23 = null;
        cKVisitor4.endVisit(superFieldAccess23);
        org.eclipse.jdt.core.dom.IntersectionType intersectionType25 = null;
        boolean boolean26 = cKVisitor4.visit(intersectionType25);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        cKClassResult4.setInnerClassesQty((int) (short) 100);
        cKClassResult4.setParenthesizedExpsQty((int) '4');
        int int10 = cKClassResult4.getNosi();
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit12 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable13 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable14 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor15 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit12, classLevelMetricListCallable13, methodLevelMetricListCallable14);
        org.eclipse.jdt.core.dom.ASTNode aSTNode16 = null;
        boolean boolean17 = cKVisitor15.preVisit2(aSTNode16);
        org.eclipse.jdt.core.dom.SwitchStatement switchStatement18 = null;
        boolean boolean19 = cKVisitor15.visit(switchStatement18);
        org.eclipse.jdt.core.dom.AnnotationTypeDeclaration annotationTypeDeclaration20 = null;
        cKVisitor15.endVisit(annotationTypeDeclaration20);
        org.eclipse.jdt.core.dom.AssertStatement assertStatement22 = null;
        boolean boolean23 = cKVisitor15.visit(assertStatement22);
        org.eclipse.jdt.core.dom.FieldDeclaration fieldDeclaration24 = null;
        boolean boolean25 = cKVisitor15.visit(fieldDeclaration24);
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit26 = null;
        cKVisitor15.endVisit(compilationUnit26);
        org.eclipse.jdt.core.dom.UsesDirective usesDirective28 = null;
        boolean boolean29 = cKVisitor15.visit(usesDirective28);
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit30 = null;
        boolean boolean31 = cKVisitor15.visit(compilationUnit30);
        boolean boolean32 = cKClassResult4.equals((java.lang.Object) cKVisitor15);
        int int33 = cKClassResult4.getFanout();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setLogStatementsQty(10);
        int int7 = cKClassResult4.getCbo();
        org.eclipse.jdt.core.dom.CompilationUnit compilationUnit9 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.ClassLevelMetric>> classLevelMetricListCallable10 = null;
        java.util.concurrent.Callable<java.util.List<com.github.mauricioaniche.ck.metric.MethodLevelMetric>> methodLevelMetricListCallable11 = null;
        com.github.mauricioaniche.ck.CKVisitor cKVisitor12 = new com.github.mauricioaniche.ck.CKVisitor("CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", compilationUnit9, classLevelMetricListCallable10, methodLevelMetricListCallable11);
        org.eclipse.jdt.core.dom.MemberRef memberRef13 = null;
        boolean boolean14 = cKVisitor12.visit(memberRef13);
        org.eclipse.jdt.core.dom.SuperMethodReference superMethodReference15 = null;
        cKVisitor12.endVisit(superMethodReference15);
        org.eclipse.jdt.core.dom.SuperFieldAccess superFieldAccess17 = null;
        cKVisitor12.endVisit(superFieldAccess17);
        org.eclipse.jdt.core.dom.MarkerAnnotation markerAnnotation19 = null;
        cKVisitor12.endVisit(markerAnnotation19);
        org.eclipse.jdt.core.dom.IfStatement ifStatement21 = null;
        boolean boolean22 = cKVisitor12.visit(ifStatement21);
        org.eclipse.jdt.core.dom.ConstructorInvocation constructorInvocation23 = null;
        cKVisitor12.endVisit(constructorInvocation23);
        boolean boolean25 = cKClassResult4.equals((java.lang.Object) cKVisitor12);
        cKClassResult4.setNumberOfPrivateMethods((int) '4');
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
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
        org.eclipse.jdt.core.dom.ExpressionStatement expressionStatement27 = null;
        boolean boolean28 = cKVisitor4.visit(expressionStatement27);
        org.eclipse.jdt.core.dom.InfixExpression infixExpression29 = null;
        boolean boolean30 = cKVisitor4.visit(infixExpression29);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
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
        org.eclipse.jdt.core.dom.MarkerAnnotation markerAnnotation23 = null;
        boolean boolean24 = cKVisitor4.visit(markerAnnotation23);
        org.eclipse.jdt.core.dom.MethodRef methodRef25 = null;
        cKVisitor4.endVisit(methodRef25);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
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
        org.eclipse.jdt.core.dom.ArrayInitializer arrayInitializer17 = null;
        cKVisitor4.endVisit(arrayInitializer17);
        org.eclipse.jdt.core.dom.ExpressionMethodReference expressionMethodReference19 = null;
        cKVisitor4.endVisit(expressionMethodReference19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
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
        boolean boolean53 = cKMethodResult4.isConstructor();
        int int54 = cKMethodResult4.getStartLine();
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
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
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
        org.eclipse.jdt.core.dom.UnionType unionType17 = null;
        boolean boolean18 = cKVisitor4.visit(unionType17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
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
        org.eclipse.jdt.core.dom.FieldAccess fieldAccess17 = null;
        boolean boolean18 = cKVisitor4.visit(fieldAccess17);
        org.eclipse.jdt.core.dom.NumberLiteral numberLiteral19 = null;
        cKVisitor4.endVisit(numberLiteral19);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
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
        org.eclipse.jdt.core.dom.TypeLiteral typeLiteral27 = null;
        cKVisitor4.endVisit(typeLiteral27);
        org.eclipse.jdt.core.dom.InstanceofExpression instanceofExpression29 = null;
        cKVisitor4.endVisit(instanceofExpression29);
        org.eclipse.jdt.core.dom.MethodInvocation methodInvocation31 = null;
        boolean boolean32 = cKVisitor4.visit(methodInvocation31);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getMaxNestedBlocks();
        int int6 = cKClassResult4.getNumberOfPrivateFields();
        int int7 = cKClassResult4.getRfc();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
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
        org.eclipse.jdt.core.dom.IntersectionType intersectionType21 = null;
        boolean boolean22 = cKVisitor4.visit(intersectionType21);
        org.eclipse.jdt.core.dom.QualifiedType qualifiedType23 = null;
        cKVisitor4.endVisit(qualifiedType23);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
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
        org.eclipse.jdt.core.dom.InstanceofExpression instanceofExpression23 = null;
        boolean boolean24 = cKVisitor4.visit(instanceofExpression23);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
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
        org.eclipse.jdt.core.dom.AnnotationTypeDeclaration annotationTypeDeclaration13 = null;
        boolean boolean14 = cKVisitor4.visit(annotationTypeDeclaration13);
        org.eclipse.jdt.core.dom.ProvidesDirective providesDirective15 = null;
        boolean boolean16 = cKVisitor4.visit(providesDirective15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setLogStatementsQty(10);
        int int7 = cKClassResult4.getRfc();
        cKClassResult4.setAnonymousClassesQty((int) '4');
        cKClassResult4.setNumberOfDefaultMethods((int) ' ');
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
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
        int int17 = cKMethodResult4.getInnerClassesQty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        int int6 = cKMethodResult4.getMaxNestedBlocks();
        int int7 = cKMethodResult4.getModifiers();
        int int8 = cKMethodResult4.getLoopQty();
        cKMethodResult4.setFanin((int) 'a');
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
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
        org.eclipse.jdt.core.dom.NumberLiteral numberLiteral13 = null;
        boolean boolean14 = cKVisitor4.visit(numberLiteral13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
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
        org.eclipse.jdt.core.dom.ContinueStatement continueStatement17 = null;
        cKVisitor4.endVisit(continueStatement17);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("CKMethodResult{cbo=10, rfc=0, wmc=0, methodName='hi!'}", "CKClassResult [file=, className=CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}]", "hi!", (int) (short) 1);
        cKClassResult4.setNumberOfPublicMethods((int) '#');
        cKClassResult4.setRfc((int) (short) 1);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
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
        org.eclipse.jdt.core.dom.IntersectionType intersectionType17 = null;
        boolean boolean18 = cKVisitor4.visit(intersectionType17);
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
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
        org.eclipse.jdt.core.dom.MethodRef methodRef27 = null;
        cKVisitor4.endVisit(methodRef27);
        org.eclipse.jdt.core.dom.UnionType unionType29 = null;
        cKVisitor4.endVisit(unionType29);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
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
        org.eclipse.jdt.core.dom.TypeParameter typeParameter17 = null;
        boolean boolean18 = cKVisitor4.visit(typeParameter17);
        org.eclipse.jdt.core.dom.AnnotationTypeDeclaration annotationTypeDeclaration19 = null;
        boolean boolean20 = cKVisitor4.visit(annotationTypeDeclaration19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
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
        org.eclipse.jdt.core.dom.BooleanLiteral booleanLiteral17 = null;
        cKVisitor4.endVisit(booleanLiteral17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getUniqueWordsQty();
        int int7 = cKClassResult4.getUniqueWordsQty();
        cKClassResult4.setNumberOfProtectedMethods(52);
        cKClassResult4.setInnerClassesQty((-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
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
        org.eclipse.jdt.core.dom.Modifier modifier15 = null;
        cKVisitor4.endVisit(modifier15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getUniqueWordsQty();
        cKClassResult4.setNumberOfSynchronizedFields(0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getNumberOfPublicFields();
        cKClassResult4.setNosi((int) (byte) 1);
        int int10 = cKClassResult4.getFanout();
        int int11 = cKClassResult4.getNumberOfProtectedMethods();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        cKClassResult4.setAnonymousClassesQty((int) (byte) -1);
        int int7 = cKClassResult4.getNumberOfSynchronizedFields();
        cKClassResult4.setRfc((-1));
        int int10 = cKClassResult4.getNumberOfProtectedFields();
        int int11 = cKClassResult4.getComparisonsQty();
        int int12 = cKClassResult4.getModifiers();
        int int13 = cKClassResult4.getLambdasQty();
        int int14 = cKClassResult4.getNumberOfFinalFields();
        int int15 = cKClassResult4.getNosi();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
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
        cKClassResult4.setVariablesQty((int) (short) 100);
        int int25 = cKClassResult4.getNumberOfPublicFields();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(strSet18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
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
        int int22 = cKClassResult4.getFanin();
        org.junit.Assert.assertNotNull(cKMethodResultOptional8);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
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
        org.eclipse.jdt.core.dom.MemberRef memberRef17 = null;
        cKVisitor4.endVisit(memberRef17);
        org.eclipse.jdt.core.dom.SynchronizedStatement synchronizedStatement19 = null;
        boolean boolean20 = cKVisitor4.visit(synchronizedStatement19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
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
        org.eclipse.jdt.core.dom.RecordDeclaration recordDeclaration15 = null;
        boolean boolean16 = cKVisitor4.visit(recordDeclaration15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
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
        org.eclipse.jdt.core.dom.TypeMethodReference typeMethodReference23 = null;
        boolean boolean24 = cKVisitor4.visit(typeMethodReference23);
        org.eclipse.jdt.core.dom.ModuleDeclaration moduleDeclaration25 = null;
        boolean boolean26 = cKVisitor4.visit(moduleDeclaration25);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getLcom();
        cKClassResult4.setLcom((int) '#');
        int int10 = cKClassResult4.getNumberOfPublicFields();
        cKClassResult4.setNumberOfProtectedFields((int) (short) 10);
        int int13 = cKClassResult4.getReturnQty();
        cKClassResult4.setNumberOfFinalFields(1);
        cKClassResult4.setNumbersQty(10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        java.util.Set<java.lang.String> strSet5 = cKMethodResult4.getMethodInvocations();
        int int6 = cKMethodResult4.getStringLiteralsQty();
        cKMethodResult4.setWmc((int) (byte) 10);
        cKMethodResult4.setParametersQty((int) (byte) 1);
        cKMethodResult4.setLoopQty((int) (byte) 1);
        java.util.Map<java.lang.String, java.util.Set<java.lang.String>> strMap13 = cKMethodResult4.getMethodInvocationsIndirectLocal();
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(strMap13);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
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
        org.eclipse.jdt.core.dom.InfixExpression infixExpression15 = null;
        cKVisitor4.endVisit(infixExpression15);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
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
        org.eclipse.jdt.core.dom.OpensDirective opensDirective21 = null;
        cKVisitor4.endVisit(opensDirective21);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getUniqueWordsQty();
        int int7 = cKClassResult4.getUniqueWordsQty();
        int int8 = cKClassResult4.getNosi();
        cKClassResult4.setLoopQty((int) (byte) 100);
        int int11 = cKClassResult4.getMaxNestedBlocks();
        int int12 = cKClassResult4.getLcom();
        int int13 = cKClassResult4.getNumberOfLogStatements();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
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
        org.eclipse.jdt.core.dom.Dimension dimension19 = null;
        cKVisitor4.endVisit(dimension19);
        org.eclipse.jdt.core.dom.CastExpression castExpression21 = null;
        cKVisitor4.endVisit(castExpression21);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
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
        org.eclipse.jdt.core.dom.ConstructorInvocation constructorInvocation17 = null;
        cKVisitor4.endVisit(constructorInvocation17);
        org.eclipse.jdt.core.dom.SimpleName simpleName19 = null;
        cKVisitor4.endVisit(simpleName19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
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
        org.eclipse.jdt.core.dom.IntersectionType intersectionType17 = null;
        boolean boolean18 = cKVisitor4.visit(intersectionType17);
        org.eclipse.jdt.core.dom.OpensDirective opensDirective19 = null;
        boolean boolean20 = cKVisitor4.visit(opensDirective19);
        org.eclipse.jdt.core.dom.IntersectionType intersectionType21 = null;
        cKVisitor4.endVisit(intersectionType21);
        org.eclipse.jdt.core.dom.ProvidesDirective providesDirective23 = null;
        boolean boolean24 = cKVisitor4.visit(providesDirective23);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", true, 1);
        cKMethodResult4.setLoc((int) '4');
        int int7 = cKMethodResult4.getLoc();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
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
        org.eclipse.jdt.core.dom.QualifiedName qualifiedName19 = null;
        boolean boolean20 = cKVisitor4.visit(qualifiedName19);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        com.github.mauricioaniche.ck.CKClassResult cKClassResult4 = new com.github.mauricioaniche.ck.CKClassResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", (int) (short) -1);
        int int5 = cKClassResult4.getNumberOfFinalFields();
        int int6 = cKClassResult4.getLoc();
        int int7 = cKClassResult4.getLcom();
        cKClassResult4.setLcom((int) '#');
        cKClassResult4.setDit(10);
        cKClassResult4.setFanout((int) '#');
        cKClassResult4.setNumberOfStaticMethods(0);
        int int16 = cKClassResult4.getNoc();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult4 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int5 = cKMethodResult4.getComparisonsQty();
        cKMethodResult4.setReturnQty((int) (byte) -1);
        cKMethodResult4.setCboModified((int) (byte) 100);
        int int10 = cKMethodResult4.getLoc();
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult15 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        cKMethodResult15.setLoc((int) (byte) 100);
        cKMethodResult15.setTryCatchQty((int) (byte) -1);
        int int20 = cKMethodResult15.getNumbersQty();
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult25 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int26 = cKMethodResult25.getComparisonsQty();
        cKMethodResult25.setReturnQty((int) (byte) -1);
        cKMethodResult25.setCboModified((int) (byte) 100);
        int int31 = cKMethodResult25.getFanout();
        boolean boolean32 = cKMethodResult15.equals((java.lang.Object) cKMethodResult25);
        int int33 = cKMethodResult25.getLogStatementsQty();
        cKMethodResult25.setCboModified((int) (short) 0);
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult40 = new com.github.mauricioaniche.ck.CKMethodResult("", "CKMethodResult{cbo=0, rfc=0, wmc=0, methodName='hi!'}", true, 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap41 = cKMethodResult40.getVariablesUsage();
        cKMethodResult25.setVariablesUsage(strMap41);
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult47 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        cKMethodResult47.setLoc((int) (byte) 100);
        cKMethodResult47.setTryCatchQty((int) (byte) -1);
        int int52 = cKMethodResult47.getNumbersQty();
        cKMethodResult47.setAnonymousClassesQty((int) '#');
        int int55 = cKMethodResult47.getTryCatchQty();
        boolean boolean56 = cKMethodResult47.getIsVisible();
        com.github.mauricioaniche.ck.CKMethodResult cKMethodResult61 = new com.github.mauricioaniche.ck.CKMethodResult("hi!", "", false, 100);
        int int62 = cKMethodResult61.getComparisonsQty();
        cKMethodResult61.setReturnQty((int) (byte) -1);
        cKMethodResult61.setCboModified((int) (byte) 100);
        int int67 = cKMethodResult61.getFanout();
        int int68 = cKMethodResult61.getTryCatchQty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap69 = cKMethodResult61.getFieldUsage();
        cKMethodResult47.setVariablesUsage(strMap69);
        cKMethodResult25.setVariablesUsage(strMap69);
        cKMethodResult4.setVariablesUsage(strMap69);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(strMap41);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(strMap69);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
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
        org.eclipse.jdt.core.dom.SimpleName simpleName23 = null;
        cKVisitor4.endVisit(simpleName23);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }
}

