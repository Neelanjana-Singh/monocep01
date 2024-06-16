package com.techlabs.exception;

public class AgeNotValidException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	public String getMessage()
	{
		return "Age not valid";
	}

}
