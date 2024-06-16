package com.techlabs.exception;

public class NegativeAmountException extends Exception{

	private static final long serialVersionUID = 1L;
	private String message;
	
	public NegativeAmountException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}