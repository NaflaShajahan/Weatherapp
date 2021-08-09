package com.demo.dto;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "city")
public class City {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String statename;
	private String cityname1;
	private String cityname2;
	private String cityname3;
//	private String cityname4;
//	private String cityname5;
//	private String cityname6;
//	private String cityname7;
	
	public City() {
		
	}
public City(int id, String statename, String cityname1, String cityname2, String cityname3) {
	super();
	this.id = id;
	this.statename = statename;
	this.cityname1 = cityname1;
	this.cityname2 = cityname2;
	this.cityname3 = cityname3;
}


public City(String statename, String cityname1, String cityname2, String cityname3) {
	this.statename = statename;
	this.cityname1 = cityname1;
	this.cityname2 = cityname2;
	this.cityname3 = cityname3;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getStatename() {
	return statename;
}
public void setStatename(String statename) {
	this.statename = statename;
}
public String getCityname1() {
	return cityname1;
}
public void setCityname1(String cityname1) {
	this.cityname1 = cityname1;
}
public String getCityname2() {
	return cityname2;
}
public void setCityname2(String cityname2) {
	this.cityname2 = cityname2;
}
public String getCityname3() {
	return cityname3;
}
public void setCityname3(String cityname3) {
	this.cityname3 = cityname3;
}
	

	
	
		

}
