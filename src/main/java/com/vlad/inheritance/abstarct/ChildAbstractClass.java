package com.vlad.inheritance.abstarct;

public abstract class ChildAbstractClass extends ParentAbstractClass {

    @Override
    public void abstractMethod3() {
        System.out.println("abstractMethod3");
    }

    @Override
    protected void abstractMethod2() {
        System.out.println("abstractMethod2");
    }

    @Override
    public void abstractMethod4() {
        System.out.println("abstractMethod4");
    }
}
