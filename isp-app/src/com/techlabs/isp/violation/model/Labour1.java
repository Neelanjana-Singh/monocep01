package com.techlabs.isp.violation.model;

public class Labour1 implements IWorker1 {
    @Override
    public void start() {
        System.out.println("Labour starts working.");
    }

    @Override
    public void stop() {
        System.out.println("Labour stops working.");
    }

    @Override
    public void eat() {
        System.out.println("Labour is eating.");
    }

    @Override
    public void rest() {
        System.out.println("Labour is resting.");
    }
}

