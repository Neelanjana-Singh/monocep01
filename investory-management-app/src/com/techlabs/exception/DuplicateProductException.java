package com.techlabs.exception;

public class DuplicateProductException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public DuplicateProductException(String message) {
        super(message);
    }
}