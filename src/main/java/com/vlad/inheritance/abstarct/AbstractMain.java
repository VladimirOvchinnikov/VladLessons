package com.vlad.inheritance.abstarct;

public class AbstractMain {


    public static void main(String[] args) {
        EmptyAbstractClass emptyAbstractClass = new EmptyAbstractClass() {};


        NotAbstractClass notAbstractClass = new NotAbstractClass();

        notAbstractClass.abstractMethod1();
        notAbstractClass.abstractMethod2();
        notAbstractClass.abstractMethod3();
        notAbstractClass.abstractMethod4();
        notAbstractClass.method();


//        System.out.println(notAbstractClass.getAge());
//        System.out.println(notAbstractClass.getAge1());
//        System.out.println(notAbstractClass.getAge2());

    }
}
