package com.vlad.polimorh.problems;

public class ChildImpl implements IChild{


    public static void main(String[] args) {
        IChild c = new ChildImpl();
        c.print();
    }
}
