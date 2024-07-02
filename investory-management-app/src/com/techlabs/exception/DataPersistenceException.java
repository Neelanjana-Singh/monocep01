package com.techlabs.exception;

public class DataPersistenceException extends RuntimeException{
    private static final long serialVersionUID = 1L;

	public DataPersistenceException(String message, Throwable cause) {
        super(message, cause);
    }
}