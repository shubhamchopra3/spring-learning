package com.spring.demo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StudentExcetionHandler {
	
	@ExceptionHandler
	public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException exception)
	{
		
		StudentErrorResponse response = new StudentErrorResponse();
		response.setStatus(HttpStatus.NOT_FOUND.value());
		response.setMessage(exception.getMessage());
		response.setTimestamp(System.currentTimeMillis());
		
		return new ResponseEntity<>(response,HttpStatus.NOT_FOUND);
		
		
	}
	
	
	@ExceptionHandler
	public ResponseEntity<StudentErrorResponse> handleException(Exception exception)
	{
		
		StudentErrorResponse response = new StudentErrorResponse();
		response.setStatus(HttpStatus.BAD_REQUEST.value());
		response.setMessage(exception.getMessage());
		response.setTimestamp(System.currentTimeMillis());
		
		return new ResponseEntity<>(response,HttpStatus.BAD_REQUEST);
		
		
	}

}
