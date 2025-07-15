package com.vlad.inheritance.abstarct;

public abstract class GrandParentAbstractClass {

    private Integer age = 5;


    public abstract void abstractMethod1();
    public abstract void abstractMethod3();
    protected abstract void abstractMethod2();

    public void method(){
        //логика
        abstractMethod1();
        //логика
    }


    public Integer getAge() {
        return age;
    }
}
