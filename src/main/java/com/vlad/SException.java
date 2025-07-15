package com.vlad;

public class SException extends RuntimeException {


    private Integer filed;

    public SException(String message, Integer filed) {
        super(message);
        this.filed = filed;
    }


    public Integer getFiled() {
        return filed;
    }
}
