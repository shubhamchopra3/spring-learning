package com.spring.demo.rest;

public class StudentNotFoundException extends RuntimeException {
	
	StudentNotFoundException(String message)
	{
		super(message);
	}
	

}
