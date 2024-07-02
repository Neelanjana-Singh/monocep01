package com.techlabs.exception;

public class InvalidSupplierIdException extends RuntimeException{
    private static final long serialVersionUID = 1L;

	public InvalidSupplierIdException(String message) {
        super(message);
    }
}