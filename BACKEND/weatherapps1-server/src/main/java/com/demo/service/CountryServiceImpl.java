package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.dto.Country;
import com.demo.repo.CountryRepo;
import com.demo.repo.StateRepo;

@Service
@Transactional
public class CountryServiceImpl implements CountryService{
	
	@Autowired
	public CountryRepo countryRepo;

	@Override
	public Country getById(int id) {
		return countryRepo.findById(id);
	}

	@Override
	public Country addCountry(Country country) {
		countryRepo.save(country);
		return country;
	}

	@Override
	public List<Country> getAllCountry() {
		return countryRepo.findAll();
	}

	
}
