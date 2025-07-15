package com.vlad.io;

import java.io.Serializable;

public class MySerialClass implements Serializable {


    private static final long serialVersionUID = 1L;

    private String str = "aaaaaa1111111";
    private int iF;
    private int iF1;
    private int iF2;
    private transient String tSF;


    public MySerialClass(int iF, String tSF) {
        this.iF = iF;
        this.tSF = tSF;
    }

    @Override
    public String toString() {
        return "MySerialClass{" +
                "str='" + str + '\'' +
                ", iF=" + iF +
                ", iF1=" + iF1 +
                ", iF2=" + iF2 +
                ", tSF='" + tSF + '\'' +
                '}';
    }
}
