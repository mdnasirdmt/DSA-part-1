package com.masai.exception;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
public class ApiException extends RuntimeException {

	private static final long serialversionID = 1L;

	public ApiException(String message) {
		super(message);

	}

}
