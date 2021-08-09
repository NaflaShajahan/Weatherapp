package com.demo.dto;

public class AuthResponse {
	
	private String status;
	private String roles;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getRoles() {
		return roles;
	}
	public void setRoles(String roles) {
		this.roles = roles;
	}
	public AuthResponse(String status, String roles) {
		super();
		this.status = status;
		this.roles = roles;
	}
	public AuthResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "AuthResponse [status=" + status + ", roles=" + roles + "]";
	}
	

}
