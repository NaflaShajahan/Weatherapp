package com.demo.exceptionhandler;

import javax.security.auth.login.AccountNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import com.demo.service.exception.ErrorDetails;

@RestController
@ControllerAdvice
public class ExceptionResponseHandler {
	@ExceptionHandler(Exception.class)
	ResponseEntity<ErrorDetails> handleOtherError(Exception ex, WebRequest request){
		ErrorDetails details=new ErrorDetails();
		details.setEmail("nafla@ust.global.com");
		details.setErrorMessage("some internal server error please  contact ust global");
		details.setDetails(request.getDescription(false));
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(details);
	}
	
	@ExceptionHandler(AccountNotFoundException.class)
	ResponseEntity<ErrorDetails> handle404Error(Exception ex, WebRequest request){
		ErrorDetails details=new ErrorDetails();
		details.setEmail("nafla@ust.global.com");
		details.setErrorMessage(ex.getMessage());
		details.setDetails(request.getDescription(false));
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(details);
	}


}
