package com.demo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.demo.dto.State;
import com.demo.entities.Favorite;
import com.demo.service.FavoriteService;

@SpringBootApplication
public class WeatherappmainApplication implements CommandLineRunner {
	
	@Autowired
	private FavoriteService favoriteService;

	public static void main(String[] args) {
		SpringApplication.run(WeatherappmainApplication.class, args);
	}
	
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

	@Override
	public void run(String... args) throws Exception {
//	favoriteService.addFavorite(new Favorite(1, "Delhi","26.49°C",new Date(),"Min 26.49°C | Max 26.49°C"));
    //	favoriteService.addFavorite(new Favorite(2, "Kerala","31.49°C",new Date(),"Min 31.49°C | Max 32.49°C"));
		
	}

	

}
