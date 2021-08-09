package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigDecimal;

import java.net.http.HttpResponse;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.dto.AuthResponse;
import com.demo.dto.City;
import com.demo.dto.Country;
import com.demo.dto.ResponseMessage;
import com.demo.dto.SecUser;
import com.demo.dto.State;
import com.demo.dto.UserRegRequest;
import com.demo.entities.Favorite;
//import com.demo.dto.AuthResponse;
import com.demo.entities.User;
import com.demo.repository.UserRepo;
import com.demo.service.FavoriteService;
import com.demo.service.UserServices;
import com.fasterxml.jackson.databind.JsonNode;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@Primary
public class UserController {
	
	@Autowired
	public UserServices userServices;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private FavoriteService favoriteService;
	
	//private static String url="https://raw.githubusercontent.com/dr5hn/countries-states-cities-database/master/countries%2Bstates%2Bcities.json";
	 
//	private static String url="http://api.airvisual.com/v2/countries?key=3689f4b3-a21b-4552-89e3-b59bd3edab40";
//	@GetMapping(path="countrys")
//	public List<Object> getCountries(){
//		Object[] countries=restTemplate.getForObject(url,Object[].class);
//		return Arrays.asList(countries);
//	}
	
	
	
	
	
	@GetMapping(path="user")
	public ResponseEntity<List<User>> getAllUsers(){
		return ResponseEntity.ok(userServices.getAllUsers());
	}
	

	
	@PostMapping(path="register")
	public ResponseMessage registerUser(@RequestBody UserRegRequest user) {
		User users = new User();
		users.setUsername(user.getUsername());
		users.setPassword(user.getPassword());
		users.setRoles(user.getRoles());
		users.setPhoneNumber(user.getPhoneNumber());
		users.setEmail(user.getEmail());
		users.setGender(user.getGender());
		users.setNationality(user.getNationality());
		//users.setImg(file.getBytes());
		//users.setType(file.getOriginalFilename());
		userServices.saveUser(users);
		return new ResponseMessage(users.getUsername(), "Hello "+user.getUsername()+", your registration is successful!",users.getRoles());
		//"Hello "+user.getUsername()+", your registration is successful!"
	}

	
	@GetMapping("login")
	public AuthResponse validateLogin(@AuthenticationPrincipal SecUser secUser) {
		System.out.println("------------------------------");
		System.out.println(secUser.getUser());
		System.out.println("------------------------------");
		return new AuthResponse("User successfully authenticated", secUser.getUser().getRoles());
	}
	
	@GetMapping("user/{id}")
	public ResponseEntity<User> getAnUser(@PathVariable ("id") int id){
		return ResponseEntity.ok(userServices.getUserById(id));
	}
	
	
	@DeleteMapping("user/{id}")
	public ResponseEntity<Void> deleteAnEmployee(@PathVariable("id") int id){
	userServices.deleteUser(id);
	return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);	
	
	}
	
	
	
	@GetMapping("login/countries")
	public List<Country> countries(){
		List<Country> list = restTemplate.getForObject("http://localhost:8081/weatherapp/countries", List.class);
		return list;
	}
	
	
	
	@GetMapping("login/states/{countryname}")
	public State state(@PathVariable (name = "countryname") String countryname){		
		Map<String, String> params = new HashMap<String, String>();
		params.put("countryname",  countryname);
		State list = restTemplate
				.getForObject("http://localhost:8081/weatherapp/states/{countryname}"
				, State.class,params);
		
		return list;
	}
	
	@GetMapping("login/city-client/{statename}")
	public City city(@PathVariable (name = "statename") String statename){
		 HttpHeaders headers = new HttpHeaders();
		 headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	      HttpEntity <String> entity = new HttpEntity<String>(headers);
	       Map<String, String> params = new HashMap<String, String>();
	    params.put("statename",  statename);
		City list = restTemplate
				.exchange("http://localhost:8081/weatherapp/city/{statename}",HttpMethod.GET,entity,
				 City.class,params).getBody();
	   
		
		return list;
	}
	

	@GetMapping("login/favorite")
	public ResponseEntity<List<Favorite>> getAllFavorite(){
		return ResponseEntity.ok(favoriteService.getAllFavorite());
	}
	
	@GetMapping("favorite/{id}")
	public ResponseEntity<Favorite> getFavoriteById(@PathVariable("id") int id){
		return ResponseEntity.ok(favoriteService.getFavoriteById(id));
	}
	
	@GetMapping("login/favorite/{location}")
	public ResponseEntity<Favorite> getFavoriteByLocation(@PathVariable(name="location")String location){
		return ResponseEntity.ok(favoriteService.getByLocation(location));
	}
	
	@DeleteMapping("login/favorite/{id}")
	public ResponseEntity<Void> deleteFavorite(@PathVariable(name="id")int id){
		favoriteService.deleteFavorite(id)
;		return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
	}
	
	
}

