package com.vlad.inheritance;

public class Child1Class1 extends Parent1Class {


    private Integer childPrivateField;
    protected Integer childProtectedField;
    public Integer childPublicField;
    Integer childPackageField;


//    private Integer getChildPrivateField() {
//        return childPrivateField;
//    }
//
//    private void setChildPrivateField(Integer childPrivateField) {
//        this.childPrivateField = childPrivateField;
//    }
//
//    protected Integer getChildProtectedField() {
//        return childProtectedField;
//    }
//
//    protected void setChildProtectedField(Integer childProtectedField) {
//        this.childProtectedField = childProtectedField;
//    }
//
//    public Integer getChildPublicField() {
//        return childPublicField;
//    }
//
//    public void setChildPublicField(Integer childPublicField) {
//        this.childPublicField = childPublicField;
//    }
//
//    Integer getChildPackageField() {
//        return childPackageField;
//    }
//
//    void setChildPackageField(Integer childPackageField) {
//        this.childPackageField = childPackageField;
//    }


    public void method(){
        Integer s1 = this.parentPublicField;
        Integer s2 = this.parentProtectedField;
        Integer s3 = this.parentPackageField;

    }
}
