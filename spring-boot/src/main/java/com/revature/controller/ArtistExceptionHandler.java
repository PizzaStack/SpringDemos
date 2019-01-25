package com.revature.controller;

import java.sql.SQLException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ArtistExceptionHandler {
	@ResponseStatus(HttpStatus.I_AM_A_TEAPOT)
	@ExceptionHandler(SQLException.class)
	public void sqlex() {
		
	}
}
