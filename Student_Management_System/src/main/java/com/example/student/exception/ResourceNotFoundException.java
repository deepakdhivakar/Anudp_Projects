package com.example.student.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(value = HttpStatus.ACCEPTED)
public class ResourceNotFoundException extends RuntimeException {

	
	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException() {
		super("Invalid credentials");
		// TODO Auto-generated constructor stub
	}

	
	
}