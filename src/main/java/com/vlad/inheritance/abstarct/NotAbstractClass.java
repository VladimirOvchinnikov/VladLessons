package com.vlad.inheritance.abstarct;

public class NotAbstractClass extends ChildAbstractClass {

    private Integer age = 105;



    public Integer getAge1() {
        return age;
    }

    public Integer getAge2() {
        return super.getAge();
    }
}
