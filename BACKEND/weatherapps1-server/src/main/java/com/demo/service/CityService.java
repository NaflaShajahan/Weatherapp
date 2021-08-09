package com.demo.service;

import com.demo.dto.City;
import com.demo.dto.State;

public interface CityService {
	public City getByStatename(String statename);
	public City addCity(City city);

}
