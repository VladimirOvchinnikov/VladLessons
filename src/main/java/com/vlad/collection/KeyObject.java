package com.vlad.collection;

import java.util.Objects;

public class KeyObject {

    private String f1;
    private String f2;

    public KeyObject(String f1, String f2) {
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
        KeyObject keyObject = (KeyObject) o;

        return Objects.equals(this.hashCode(), keyObject.hashCode()) && Objects.equals(f1, keyObject.f1) && Objects.equals(f2, keyObject.f2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(f1, f2);
//        return 1;
    }

    @Override
    public String toString() {
        return "KeyObject{" +
                "f1='" + f1 + '\'' +
                ", f2='" + f2 + '\'' +
                '}';
    }
}
