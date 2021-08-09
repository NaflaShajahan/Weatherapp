package com.demo.dto;

public class ResponseMessage {
	private String username;
	private String message;
	private String role;

	  

	  public ResponseMessage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ResponseMessage(String username,String message, String role) {
		super();
		this.username=username;
		this.message = message;
		this.role = role;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getMessage() {
	    return message;
	  }

	  public void setMessage(String message) {
	    this.message = message;
	  }

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	  
}
