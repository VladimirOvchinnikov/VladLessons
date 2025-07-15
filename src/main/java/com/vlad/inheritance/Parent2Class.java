package com.vlad.inheritance;

public class Parent2Class {


    public void method(ChildChildClass1 c) {
        Parent1Class p = new Parent1Class();
        p.parentPackageField = 1;
        p.parentProtectedField = 1;
        p.parentPublicField = 1;

        c.parentProtectedField = 1;
    }

}
