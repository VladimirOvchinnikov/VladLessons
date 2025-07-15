package com.vlad.generics.wildcards.domain;

public class Man implements IPeople{
    @Override
    public void say() {
        System.out.println("Hello, i am man!");
    }
}
