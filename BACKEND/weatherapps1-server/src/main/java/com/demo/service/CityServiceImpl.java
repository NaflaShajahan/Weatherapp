package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.dto.City;
import com.demo.repo.CityRepo;

@Service
@Transactional
public class CityServiceImpl implements CityService{
	
	@Autowired
	public CityRepo cityRepo;
	
	@Override
	public City getByStatename(String statename) {
		return cityRepo.findByStatename(statename);
	}

	@Override
	public City addCity(City city) {
		cityRepo.save(city);
		return city;
	}

}
