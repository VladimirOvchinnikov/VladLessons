package com.vlad.generics;

public record RecordGenerics<T>() /*implements IGenerics<T>*/{

//    @Override
    public T method1(T a) {
        return a;
    }
}
