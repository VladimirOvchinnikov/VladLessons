package com.vlad.inheritance.child;

import com.vlad.inheritance.ChildChildClass1;
import com.vlad.inheritance.Parent1Class;

public class Parent3Class {


    public void method(ChildChildClass1 c) {
        Parent1Class p = new Parent1Class();
//        p.parentPackageField = 1;
//        p.parentProtectedField = 1;
        p.parentPublicField = 1;

        c.parentPublicField = 1;
        c.childPublicField = 1;
    }

}
