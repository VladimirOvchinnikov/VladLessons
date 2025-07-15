package com.vlad.polimorh;

//@FunctionalInterface
public interface TypeIter {

    Integer filedInterface = 0;
//    private Integer field;

    void method1();

    default void method2(){
        method1();
    }

    default Integer getFiledInterface(){
        return filedInterface;
    }

    default void setFiledInterface(Integer filedInterface1){
//        filedInterface = filedInterface1;
    }

    private void method3(){
        System.out.println("private method in interface. WTF?");
    }

    default void method4(){
        method3();
    }

//    protected default void method5(){};


}
