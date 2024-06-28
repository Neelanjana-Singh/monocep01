package com.techlabs.factory.model;

public class Mahindra implements ICar {
    @Override
    public void start() {
        System.out.println("Mahindra car starting.");
    }

    @Override
    public void stop() {
        System.out.println("Mahindra car stopping.");
    }
}

