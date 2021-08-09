package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.dto.City;
import com.demo.dto.Country;
import com.demo.dto.State;
import com.demo.service.CityService;
import com.demo.service.CountryService;
import com.demo.service.StateService;

@SpringBootApplication
public class Weatherapps1ServerApplication implements CommandLineRunner{
	
	@Autowired
	public CountryService countryService;
	
	@Autowired
	public StateService stateService;
	
	@Autowired
	public CityService cityService;

	public static void main(String[] args) {
		SpringApplication.run(Weatherapps1ServerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		countryService.addCountry(new Country (1, "India"));
//		countryService.addCountry(new Country (2, "China"));
//		countryService.addCountry(new Country (3, "America"));
//		
//		stateService.addState(new State (1,"India","Kerala", "TamilNadu"));
//		stateService.addState(new State (2,"China","Beijing", "Fujian"));
//		stateService.addState(new State (3,"America"," New York", "California"));
//		
//		
//		cityService.addCity(new City(1,"Kerala", "Ernakulam", "Kollam", "Thrissur"));
//		cityService.addCity(new City(2,"Beijing", "Fengtai", "Pinggu", "Liangxiang"));
//		cityService.addCity(new City(3,"New York", "Queens", "Red Hook", "Flatlands"));
//		
		
	}

}
