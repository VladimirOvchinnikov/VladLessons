package com.vlad.inheritance.constr;

public class ChildClass extends ParentClass{
    public ChildClass() {
//        super(1);
//        super();
        System.out.println("ChildClass def");

    }

    public ChildClass(Integer field) {
        super(field);
        System.out.println("ChildClass");
    }


    public static void main(String[] args) {
        ChildClass c = new ChildClass(1);
        System.out.println("");

        ChildClass c1 = new ChildClass();
    }
}
