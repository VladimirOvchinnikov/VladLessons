package com.vlad.statici;

public class StaticMain {


    public static void main(String[] args) {
        System.out.println(TestStaticClass.getIntChangeStaticVariable());
        System.out.println(TestStaticClass.getStaticIntVar());
        System.out.println(TestStaticClass.INT_1_VARIABLE);
        TestStaticClass.setIntChangeStaticVariable(99);

        System.out.println(TestStaticClass.getIntChangeStaticVariable());

        TestStaticClass testStaticClass = new TestStaticClass();

        System.out.println();
        System.out.println(testStaticClass.getIntVariable());
        System.out.println(testStaticClass.INT_1_VARIABLE);
        System.out.println(testStaticClass.getStaticIntVar());
        System.out.println(testStaticClass.getIntChangeStaticVariable());
        testStaticClass.setIntChangeStaticVariable(88);
        System.out.println(testStaticClass.getIntChangeStaticVariable());



    }
}
