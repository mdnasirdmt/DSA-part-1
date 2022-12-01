package com.masai.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourseNotFound extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ResourseNotFound() {
		super();
	}

	public ResourseNotFound(String message) {
		super(message);
	}

	public ResourseNotFound(String message, Throwable cause) {
		super(message, cause);
	}
}