package com.techlabs.exception;

public class InsufficientFundsException extends Exception{
	private static final long serialVersionUID = 1L;
	public String getMessage() {
		return "your account has insufficient balance";
	}
}