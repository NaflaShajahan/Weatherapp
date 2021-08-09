package com.demo.entities;



import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "favorite")
public class Favorite {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int id;
	private String location;
	private String temp;
	private Date date;
	private String minmax;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getTemp() {
		return temp;
	}
	public void setTemp(String temp) {
		this.temp = temp;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getMinmax() {
		return minmax;
	}
	public void setMinmax(String minmax) {
		this.minmax = minmax;
	}
	public Favorite( String location, String temp, Date date, String minmax) {
		super();
	
		this.location = location;
		this.temp = temp;
		this.date = date;
		this.minmax = minmax;
	}
	public Favorite(int id, String location, String temp, Date date, String minmax) {
		super();
		this.id = id;
		this.location = location;
		this.temp = temp;
		this.date = date;
		this.minmax = minmax;
	}
	public Favorite() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
