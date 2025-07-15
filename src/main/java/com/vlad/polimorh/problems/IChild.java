package com.vlad.polimorh.problems;

public interface IChild extends IPArent1, IPArent2{
    @Override
    default void print() {
        IPArent1.super.print();//это что еще????))))
    }
}
