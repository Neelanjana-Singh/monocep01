package com.techlabs.exception;

public class InsufficientFundsException extends Exception {
    
    private static final long serialVersionUID = 1L;

    @Override
    public String getMessage() {
        return "Your account has insufficient funds";
    }
}