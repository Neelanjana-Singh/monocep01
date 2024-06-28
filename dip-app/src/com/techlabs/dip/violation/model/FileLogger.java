package com.techlabs.dip.violation.model;

public class FileLogger implements ILogger {
    @Override
    public void log(String err) {
        System.out.println("Logging error message to a file: " + err);
    }
}