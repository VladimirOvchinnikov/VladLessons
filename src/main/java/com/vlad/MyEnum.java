package com.vlad;

public enum MyEnum {

    E("EMPTY"), S("START");

    MyEnum(String s) {
        this.fieldEnum = s;
    }

    private String fieldEnum;

    public void method(){
//        fieldEnum = 5;
    }

    public String getFieldEnum() {
        return fieldEnum;
    }

//    public void setFieldEnum(Integer fieldEnum) {
//        this.fieldEnum = fieldEnum;
//    }

//    public MyEnum of()

    public static MyEnum of(String value){
        if (E.fieldEnum.equals(value)){
            return E;
        }

        if (S.fieldEnum.equals(value)){
            return S;
        }
        return null;
    }
}
