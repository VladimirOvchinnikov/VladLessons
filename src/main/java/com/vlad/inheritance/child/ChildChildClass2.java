package com.vlad.inheritance.child;

import com.vlad.inheritance.Child1Class1;

public class ChildChildClass2 extends Child1Class1 {

    public void method() {
//        this.childPackageField = 1;
        this.childProtectedField = 1;
        this.childPublicField = 1;
        this.parentPublicField = 1;
        this.parentProtectedField = 1;
    }

}
