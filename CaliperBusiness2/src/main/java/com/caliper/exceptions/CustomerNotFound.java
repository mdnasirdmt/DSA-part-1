package com.caliper.exceptions;

public class CustomerNotFound extends RuntimeException{

	public CustomerNotFound() {
		super();
		
	}

	public CustomerNotFound(String message) {
		super(message);
		
	}

	
}
