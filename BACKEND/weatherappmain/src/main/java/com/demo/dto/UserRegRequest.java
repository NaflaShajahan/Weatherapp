package com.demo.dto;

public class UserRegRequest {
	
	private String username;
	private String nationality;
	private String email;
	private String phoneNumber;
	private String password;
	private String gender;
	private String roles;
	
	
	
	public UserRegRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserRegRequest(String username, String nationality, String email, String phoneNumber, String password,
			String gender, String roles) {
		super();
		this.username = username;
		this.nationality = nationality;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.password = password;
		this.gender = gender;
		this.roles = roles;
	}
	
	
	
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRoles() {
		return roles;
	}
	public void setRoles(String roles) {
		this.roles = roles;
	}
	@Override
	public String toString() {
		return "UserRegRequest [username=" + username + ", nationality=" + nationality + ", email=" + email
				+ ", phoneNumber=" + phoneNumber + ", password=" + password + ", gender=" + gender + ", roles=" + roles
				+ "]";
	}
	
	
	
	

}
