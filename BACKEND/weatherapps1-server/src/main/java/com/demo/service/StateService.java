package com.demo.service;

import java.util.List;

import com.demo.dto.State;


public interface StateService {
	public State getByCountryname(String countryName);
		
	public State addState(State state);
	
	 public List<State> getAllStates();

}
