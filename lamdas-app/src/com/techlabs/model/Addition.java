package com.techlabs.model;

public class Addition {
    private int a;
    private int b;

    public Addition(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getSum() {
        return this.a + this.b;
    }
}