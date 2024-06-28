package com.techlabs.isp.violation.model;

public class Robot1 implements IWorkable {
    @Override
    public void start() {
        System.out.println("Robot starts working.");
    }

    @Override
    public void stop() {
        System.out.println("Robot stops working.");
    }
}
