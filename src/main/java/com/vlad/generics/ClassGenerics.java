package com.vlad.generics;

import java.util.ArrayList;
import java.util.List;

public class ClassGenerics<T extends Number> implements IGenerics<T>{
    @Override
    public T method1(T a) {
//        T f = getT();
        return a;
    }


    public T getT(){
        return (T)new Object();
    }

    public <Z> Z getZ(){
        return (Z) new Object();
    }

    public static void main(String[] args) {
        ClassGenerics<Integer> s1 = new ClassGenerics<>();
        ClassGenerics<Float> s2 = new ClassGenerics<>();
        ClassGenerics<Number> s3 = new ClassGenerics<>();


        List<String> list = new ArrayList<>();
        List<Object> list1 = new ArrayList<>(list);


//        int[] aa = {1,1};
//        int[] aa1 = new int[]{1,1};



    }

}
