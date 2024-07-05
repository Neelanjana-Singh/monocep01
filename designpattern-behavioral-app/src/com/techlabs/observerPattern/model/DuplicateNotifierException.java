package com.techlabs.observerPattern.model;


public class DuplicateNotifierException extends Exception {
    private static final long serialVersionUID = 1L;

	public DuplicateNotifierException(String message) {
        super(message);
    }
}
