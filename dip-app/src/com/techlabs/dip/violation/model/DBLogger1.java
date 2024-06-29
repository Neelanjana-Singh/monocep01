package com.techlabs.dip.violation.model;

public class DBLogger1 implements ILogger {
    @Override
    public void log(String err) {
        System.out.println("Logging error message to the database: " + err);
    }
}