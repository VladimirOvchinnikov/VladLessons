package com.vlad.generics.wildcards.domain;

public class Student extends Man{


    @Override
    public void say() {
        super.say();
        System.out.println("and student");
    }
}
