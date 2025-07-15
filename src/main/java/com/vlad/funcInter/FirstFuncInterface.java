package com.vlad.funcInter;
//Анотация ниже не обязательная
@FunctionalInterface
public interface FirstFuncInterface {

    void firstFunc();


    default void firstFunc1() {
    }


//    void  firstFunc2();


}
