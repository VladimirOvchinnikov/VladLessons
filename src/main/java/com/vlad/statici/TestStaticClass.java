package com.vlad.statici;

public class TestStaticClass {

    private Integer intVariable = 10;


    public static final Integer INT_1_VARIABLE;
    private static final Integer INT_2_VARIABLE = 4;

    private static Integer intChangeStaticVariable;

    static {
        INT_1_VARIABLE = 8;
    }


    public static Integer getStaticIntVar(){
        return INT_2_VARIABLE;
    }


    public Integer getIntVariable() {
        if (this.INT_1_VARIABLE == 1){

        }
        return intVariable;
    }


    public static Integer getIntChangeStaticVariable() {
        return intChangeStaticVariable;
    }

    public static void setIntChangeStaticVariable(Integer intChangeStaticVariable) {
        TestStaticClass.intChangeStaticVariable = intChangeStaticVariable;
    }


}
