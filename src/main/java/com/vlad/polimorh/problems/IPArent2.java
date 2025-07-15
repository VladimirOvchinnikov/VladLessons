package com.vlad.polimorh.problems;

public interface IPArent2 extends IGrandParent{

    default void print(){
        System.out.println("IPArent2");
    }
}
