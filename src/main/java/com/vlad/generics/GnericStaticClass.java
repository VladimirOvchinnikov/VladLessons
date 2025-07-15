package com.vlad.generics;

public class GnericStaticClass {


    public <T> String toString(T o) {
        return o.toString();
    }


//    public <T> T method(ClassGenerics<T> t) {
//        return t.getT();
//    }


}
