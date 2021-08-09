package com.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "user")
@NoArgsConstructor
@AllArgsConstructor
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int id;
	private String username;
	private String nationality;
	private String email;
	private String phoneNumber;
	private String password;
	private String gender;
	private String roles;
	@Column(name = "img", length = 10000)
	 @Lob
	private byte[] img;
	private String type;
	
	public String getRoles() {
		return roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	public byte[] getImg() {
		return img;
	}

	public void setImg(byte[] img) {
		this.img = img;
	}
	
	

	

	public User() {
		//super();
		// TODO Auto-generated constructor stub
	}

	public User(String username, String nationality, String email, String phoneNumber, String password,String gender,byte[] img,String type,String roles) {
		
		this.username = username;
		this.nationality = nationality;
		this.email = email;
		this.phoneNumber=phoneNumber;
		this.password = password;
		this.gender = gender;
		this.img=img;
		this.type=type;
		this.roles=roles;
	}

	public User(int id, String username, String nationality, String email, String phoneNumber, String password,
			String gender, byte[] img,String type,String roles) {
		//super();
		this.id = id;
		this.username = username;
		this.nationality = nationality;
		this.email = email;
		this.phoneNumber=phoneNumber;
		this.password = password;
		this.gender = gender;
		this.img = img;
		this.type=type;
		this.roles=roles;
	}

	


}
