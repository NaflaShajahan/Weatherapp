package com.demo.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "state")
public class State {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String countryname;
	private String statename1;
	private String statename2;
//	private String statename3;
//	private String statename4;
//	private String statename5;
//	private String statename6;
//	private String statename7;
	
	
	public State() {
	}
	
public State(int id, String countryname, String statename1, String statename2) {
	super();
	this.id = id;
	this.countryname = countryname;
	this.statename1 = statename1;
	this.statename2 = statename2;
}

//	public State(String countryName, String stateName1, String stateName2, String stateName3, String stateName4,
//			String stateName5, String stateName6, String stateName7) {
//		this.countryName = countryName;
//		this.stateName1 = stateName1;
//		this.stateName2 = stateName2;
////		this.stateName3 = stateName3;
////		this.stateName4 = stateName4;
////		this.stateName5 = stateName5;
////		this.stateName6 = stateName6;
////		this.stateName7 = stateName7;
//	}
//
//	
	
	public State(String countryname, String statename1, String statename2) {
		super();
		this.countryname = countryname;
		this.statename1 = statename1;
		this.statename2 = statename2;
	}

	

	public String getCountryname() {
		return countryname;
	}

	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}

	public String getStatename1() {
		return statename1;
	}

	public void setStatename1(String statename1) {
		this.statename1 = statename1;
	}

	public String getStatename2() {
		return statename2;
	}

	public void setStatename2(String statename2) {
		this.statename2 = statename2;
	}

//	public String getStateName3() {
//		return stateName3;
//	}
//
//	public void setStateName3(String stateName3) {
//		this.stateName3 = stateName3;
//	}
//
//	public String getStateName4() {
//		return stateName4;
//	}
//
//	public void setStateName4(String stateName4) {
//		this.stateName4 = stateName4;
//	}
//
//	public String getStateName5() {
//		return stateName5;
//	}
//
//	public void setStateName5(String stateName5) {
//		this.stateName5 = stateName5;
//	}
//
//	public String getStateName6() {
//		return stateName6;
//	}
//
//	public void setStateName6(String stateName6) {
//		this.stateName6 = stateName6;
//	}
//
//	public String getStateName7() {
//		return stateName7;
//	}
//
//	public void setStateName7(String stateName7) {
//		this.stateName7 = stateName7;
//	}
	
	
	@Override
	public String toString() {
		return "State [countryname=" + countryname + ", statename1=" + statename1 + ", statename2=" + statename2 + "]";
	}
	
	
	
	
	
}
