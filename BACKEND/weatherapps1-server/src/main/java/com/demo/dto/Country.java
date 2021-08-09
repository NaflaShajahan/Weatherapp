package com.demo.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Primary;

@Entity
@Table(name = "country")

public class Country {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	public String country;

	public Country() {
		
	}

	

	public Country(String country) {
		super();
		this.country = country;
	}



	public Country(int id, String country) {
		super();
		this.id = id;
		this.country = country;
	}


	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	

}
