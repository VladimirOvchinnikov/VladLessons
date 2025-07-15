package com.vlad.rec;

public record Rec1(String s, Integer i, String... ss) implements Rec{

    public Rec1(String s, Integer i, String... ss) {
        this.s = s;
        this.i = i;
        this.ss = ss;
    }

    public void print(){
        System.out.println("ssssssssss " + i());
    }

    @Override
    public void method() {

    }
}
