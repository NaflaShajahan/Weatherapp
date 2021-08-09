package com.demo.service;

import java.util.List;

import com.demo.dto.Country;
import com.demo.dto.State;

public interface CountryService {
	public Country getById(int id);
	public Country addCountry (Country country);
	public List<Country> getAllCountry();
	

}
