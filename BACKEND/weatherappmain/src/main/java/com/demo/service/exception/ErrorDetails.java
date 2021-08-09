package com.demo.service.exception;

public class ErrorDetails {

	private String errorMessage;
	private String details;
	private String email;
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public ErrorDetails(String errorMessage, String details, String email) {
		this.errorMessage = errorMessage;
		this.details = details;
		this.email = email;
	}
	public ErrorDetails() {}


}
