package com.vlad.inheritance.constr;

public class GrandParentClass {


    private Integer field;


    public GrandParentClass(){
        System.out.println("GrandParentClass def");
    }

    public GrandParentClass(Integer field) {
        this.field = field;
        System.out.println("GrandParentClass");
    }

    public Integer getField() {
        return field;
    }

    public void setField(Integer field) {
        this.field = field;
    }
}
