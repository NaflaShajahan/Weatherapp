
package com.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestController;

import com.demo.dto.City;
import com.demo.dto.Country;
//import com.demo.dto.City;
//import com.demo.dto.Country;
import com.demo.dto.State;
import com.demo.service.CityService;
import com.demo.service.CountryService;
//import com.demo.service.StateService;
import com.demo.service.StateService;

@RestController
public class WeatherController {
	
	@Autowired
	private CountryService countryService;
	
	@Autowired
	private StateService stateService;
	
	@Autowired
	private CityService cityService;
	
	
	@GetMapping(path = "countries/{id}")
	public Country country(@PathVariable (name = "id") int id){
		return countryService.getById(id);
	}
	
	@GetMapping("countries")
	public List<Country> country() {
		return countryService.getAllCountry();
		}
	
//	@GetMapping("countries")
//	public List<Country> countries(){
//		return getAllCountries();
//	}
	
	@GetMapping(path = "states/{countryname}")
	public State states(@PathVariable (name = "countryname") String countryname){
		return stateService.getByCountryname(countryname);
	}
	

	@GetMapping(path = "city/{statename}")
	public City city(@PathVariable (name = "statename") String statename){
		return cityService.getByStatename(statename);
		}
	
	@GetMapping(path = "states")
	public List<State> state(){
		return stateService.getAllStates();
	}
	
//	@GetMapping(path = "cities")
//	public List<City> city(){
//		return getAllCities();
//	}
	
//	private List<Country> getAllCountries(){
//		List<Country>countries=new ArrayList<Country>();
//		countries.add(new Country("Afghanistan"));
//		countries.add(new Country("Algeria"));
//		countries.add(new Country("Andorra"));
//		countries.add(new Country("Angola"));
//		countries.add(new Country("Argentina"));
//		countries.add(new Country("India"));
////		countries.add(new Country("Australia"));
////		countries.add(new Country("Austria"));
////		countries.add(new Country("Bahamas"));
////		countries.add(new Country("Canada"));
////		countries.add(new Country("Croatia"));
////		countries.add(new Country("France"));
////		countries.add(new Country("India"));
////		countries.add(new Country("Mexico"));
////		countries.add(new Country("Russia"));
//		return countries;
//	}
	
//	private List<State> getAllStates(){
//		List<State> states = new ArrayList<State>();
//		states.add(new State("Afghanistan", "Kabul", "Kandahar")); //, "Kapisa", "Ghaznī", "Balkh","Zaranj", "Baghlān"
//		states.add(new State("Algeria", "Batna ", "Biskra ")); //, "Chlef", "Djelfa", "Guelma ","Oran", "Ouargla"
//		states.add(new State("Andorra", "Sant Julia de Loria", "La Massana")); //, "Encamp", "Canillo", "Andorra la Vella ","Escaldes-Engordany", "Ordino"
//		states.add(new State("India", "Kerala ", " Tamil Nadu"));
//		states.add(new State("Algeria", "Batna ", "Biskra "));
//		states.add(new State("Algeria", "Batna ", "Biskra "));
//		return states;
//		
//	}
	
//	private List<City> getAllCities(){
//		List<City> cities = new ArrayList<City>();
//		cities.add(new City("Kabul", "Kabul" ));
//		cities.add(new City("Kandahar", "Kandahar" ));
//		cities.add(new City("Kerala", "Ernakulam" ));
//		return cities;
//		
//		
//	}
}
