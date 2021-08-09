package com.demo.service.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class ProfileNotFoundException extends RuntimeException{

	public ProfileNotFoundException(String message) {
		super(message);
	}

}
