package com.vlad.inheritance;

public class ChildChildClass1 extends Child1Class1{


    public void method(){
        this.childPackageField = 1;
        this.childProtectedField = 1;
        this.childPublicField = 1;

        this.parentProtectedField = 1;
        this.parentPackageField = 1;
        this.parentPublicField = 1;
    }
}
