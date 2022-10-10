package com.masai.exception;

import java.sql.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

	// specific exception
	@ExceptionHandler(ResourceNotFound.class)
	public ResponseEntity<?> handleResourceNotFound(ResourceNotFound exception, WebRequest request) {

		ErrorDetails errorDetails = new ErrorDetails(new Date(0), exception.getMessage(),
				request.getDescription(false));

		return new ResponseEntity(errorDetails, HttpStatus.NOT_FOUND);
	}

	// APi exception
	@ExceptionHandler(ApiException.class)
	public ResponseEntity<?> handleApiException(ApiException exception, WebRequest request) {

		ErrorDetails errorDetails = new ErrorDetails(new Date(0), exception.getMessage(),
				request.getDescription(false));

		return new ResponseEntity(errorDetails, HttpStatus.BAD_REQUEST);
	}

	// validation exception
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<?> handleValidationError(MethodArgumentNotValidException exception) {

		ErrorDetails errorDetails = new ErrorDetails(new Date(0), "validation error ",
				exception.getBindingResult().getFieldError().getDefaultMessage());

		return new ResponseEntity(errorDetails, HttpStatus.BAD_REQUEST);
	}

	// global exception
	@ExceptionHandler(Exception.class)
	public ResponseEntity<?> handleGlobalException(Exception exception, WebRequest request) {

		ErrorDetails errorDetails = new ErrorDetails(new Date(0), exception.getMessage(),
				request.getDescription(false));

		return new ResponseEntity(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
