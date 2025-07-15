package com.vlad.collection;

import java.util.Objects;

public class ValueObject {

    private String f1;
    private String f2;

    public ValueObject(String f1, String f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    public String getF1() {
        return f1;
    }

    public void setF1(String f1) {
        this.f1 = f1;
    }

    public String getF2() {
        return f2;
    }

    public void setF2(String f2) {
        this.f2 = f2;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ValueObject that = (ValueObject) o;
        return Objects.equals(this.hashCode(), that.hashCode()) && Objects.equals(f1, that.f1) && Objects.equals(f2, that.f2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(f1, f2);
//        return 1;
    }

    @Override
    public String toString() {
        return "ValueObject{" +
                "f1='" + f1 + '\'' +
                ", f2='" + f2 + '\'' +
                '}';
    }
}
