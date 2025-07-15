package com.vlad.polimorh;

public class Cat implements Animal {
    @Override
    public void scream() {
        System.out.println("meow");
    }
}
