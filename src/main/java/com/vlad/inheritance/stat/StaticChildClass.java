package com.vlad.inheritance.stat;

public class StaticChildClass extends StaticParentClass {

    public static void method(){
        System.out.println("ChildClass");
    }


    public static void main(String[] args) {
        StaticChildClass c1 = new StaticChildClass();
        StaticParentClass c2 = new StaticParentClass();
        StaticParentClass c3 = new StaticChildClass();


        c1.method();
        c2.method();
        c3.method();

    }
}
