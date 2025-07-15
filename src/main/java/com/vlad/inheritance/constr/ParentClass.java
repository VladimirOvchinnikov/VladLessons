package com.vlad.inheritance.constr;

public class ParentClass extends GrandParentClass {

    public ParentClass() {
        System.out.println("ParentClass def");
    }

    public ParentClass(Integer field) {
        super(field);
        System.out.println("ParentClass");
    }
}
