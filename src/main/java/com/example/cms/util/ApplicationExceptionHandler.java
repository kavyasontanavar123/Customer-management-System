package com.example.cms.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.cms.exception.UserNotFoundByIdException;



@RestControllerAdvice
public class ApplicationExceptionHandler {
	@ExceptionHandler
	public ResponseEntity<ErrorStructure> handleUserNotFoundByIdException(UserNotFoundByIdException ex) {
		return ResponseEntity.status(HttpStatus.NOT_FOUND)
				.body(ErrorStructure.create(HttpStatus.NOT_FOUND.value(),ex.getMessage(),"customer not found by the given ID"));
	
	}

}
