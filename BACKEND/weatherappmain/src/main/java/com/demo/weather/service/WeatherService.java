package com.demo.weather.service;
import java.math.BigDecimal;

import org.springframework.stereotype.Service;



//package com.demo.weather.service;
//
//import java.util.ArrayList;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.client.HttpClientErrorException;
//import org.springframework.web.client.RestTemplate;
//
//public class WeatherService {
//
//	 private final String URI = "http://api.openweathermap.org/data/2.5/forecast";
//	 private final String API_ID = "9e5d41d0aa4d4f165a6546d160fb78eb";
//	 
//	 @Autowired
//		private RestTemplate restTemplate;
//	 
//	 public ResponseEntity<?> weatherForecastAverage(String city) {
//	        List<WeatherAverageDTO> result = new ArrayList<WeatherAverageDTO>();
//	        try {
//	            WeatherMapDTO weatherMap = this.restTemplate.getForObject(this.url(city), WeatherMapDTO.class);
//
//	            for (LocalDate reference = LocalDate.now();
//	                 reference.isBefore(LocalDate.now().plusDays(4));
//	                 reference = reference.plusDays(1)) {
//	                final LocalDate ref = reference;
//	                List<WeatherMapTimeDTO> collect = weatherMap.getList().stream()
//	                        .filter(x -> x.getDt().toLocalDate().equals(ref)).collect(Collectors.toList());
//	                if (!CollectionUtils.isEmpty(collect)) {
//	                    result.add(this.average(collect));
//	                }
//
//	            }
//	        } catch (HttpClientErrorException e) {
//	            return new ResponseEntity<>(new Json(e.getResponseBodyAsString()), e.getStatusCode());
//	        }
//
//	        return new ResponseEntity<>(result, HttpStatus.OK);
//	    }
//
//}


