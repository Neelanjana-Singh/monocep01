package com.techlabs.exception;

public class InvalidProductIdException extends RuntimeException{
   private static final long serialVersionUID = 1L;

	public InvalidProductIdException(String message) {
        super(message);
    }
}
