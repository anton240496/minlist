package com.company;

class Printer1<T> {

    private T minx;


    Printer1(T minx) {
        this.minx = minx;

    }

    public T getId() {
        return minx;
    }
    public T min1() { return minx; }
}