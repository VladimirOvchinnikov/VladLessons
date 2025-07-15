package com.vlad.list;

import java.util.LinkedList;

public class MyArrayList<T> {

    private int capacity;

    private Object[] arr;

    private int pointer;

    public MyArrayList() {
        capacity = 10;
        pointer = 0;
        arr = new Object[capacity];
    }


    public void add(T val) {
        reSize();
        arr[pointer] = val;
        pointer++;
    }

    public void add(T val, int ind) {

        checkInd(ind);

        if (ind == pointer) {
            add(val);
            return;
        }

        reSize();
        System.arraycopy(arr, ind, arr, ind + 1, pointer - ind);
        arr[ind] = val;
        pointer++;


    }

    private void checkInd(int ind) {
        if (ind < 0) {
            throw new MyArrayListException("индекс < 0 ");
        }
        if (ind > pointer) {
            throw new MyArrayListException("индекс за границей списка " + ind + " =" + pointer);
        }
    }

    private void reSize() {
        if (pointer >= arr.length) {
            Object[] arr1 = new Object[arr.length * 2];
            System.arraycopy(arr, 0, arr1, 0, arr.length);
            arr = arr1;
        }
    }

    public T get(int ind) {
        return null;
    }

    public void remove(int ind) {
        checkInd(ind);
        if (ind == pointer) {
            throw new MyArrayListException("индекс за границей списка(remove) " + ind + " =" + pointer);
        }

        System.arraycopy(arr, ind + 1, arr, ind, pointer - ind);
        arr[pointer] = null;
        pointer--;
    }

    public int size() {
        return pointer;
    }


    public static void main(String[] args) {
//        MyArrayList<Integer> list = new MyArrayList<>();
//        try {
//            list.add(1, -1);
//        } catch (MyArrayListException e){
//            e.printStackTrace();
//        }
//
//        try {
//            list.add(1,1);
//        } catch (MyArrayListException e){
//            e.printStackTrace();
//        }
//
//
//        list.add(1, 0);
//        for (int i = 0; i < 100; i++) {
//            list.add(i, i);
//        }

//        list.add(100000, 98);
//        try {
//            list.add(102, 102);
//        } catch (MyArrayListException e) {
//            e.printStackTrace();
//        }
//        list.remove(99);

//        System.out.println(list.size());


        LinkedList<String> ll = new LinkedList<>();
        ll.add("SSSSS");
        System.out.println(ll.size());
    }
}
