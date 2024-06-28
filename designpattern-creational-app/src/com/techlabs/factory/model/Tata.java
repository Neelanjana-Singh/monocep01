package com.techlabs.factory.model;


public class Tata implements ICar {
    @Override
    public void start() {
        System.out.println("Tata car starting.");
    }

    @Override
    public void stop() {
        System.out.println("Tata car stopping.");
    }
}
