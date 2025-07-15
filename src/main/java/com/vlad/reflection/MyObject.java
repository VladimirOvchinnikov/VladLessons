package com.vlad.reflection;

import java.io.Serializable;

public class MyObject implements Serializable {

    @MyValue(value = "sffff")
    private String stringField;
    public int intField;
    Object objField;

    public final String fField = "1111111111";


    private MyObject() {
        System.out.println("asasdasdasdas");
    }

    public MyObject(String integerField) {
        this.stringField = integerField;
    }


    @Deprecated(since = "aaaaaaaaaaaaaaaaaaaa")
    public void method1() {
        System.out.println("call method1");
    }

    private Integer method2(Object obj) {
        System.out.println("call method2 " + obj);
        return 2;
    }


    public static void main(String[] args) {
        System.out.println("Mainaaaaaaaaaaaaaa");


    }


}
