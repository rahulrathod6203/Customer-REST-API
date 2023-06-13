package com.cg.exceptions;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GloabalExceptionHandler {

	@ExceptionHandler(CustomerNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public Map<String, String> exceptionHandler(CustomerNotFoundException exception) {

		Map<String, String> errorMap = new HashMap<>();

		errorMap.put("errorMessage", exception.getMessage());

		return errorMap;
	}

}
