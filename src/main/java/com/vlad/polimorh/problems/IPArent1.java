package com.vlad.polimorh.problems;

public interface IPArent1 extends IGrandParent {

    default void print() {
        System.out.println("IPArent1");
    }
}
