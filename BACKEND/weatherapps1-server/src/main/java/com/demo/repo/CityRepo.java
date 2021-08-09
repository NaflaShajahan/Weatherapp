package com.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.dto.City;


@Repository
public interface CityRepo extends JpaRepository<City, Integer>{
	public City findByStatename(String statename);

}
