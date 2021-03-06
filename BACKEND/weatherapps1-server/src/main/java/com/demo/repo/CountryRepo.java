package com.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.dto.Country;


@Repository
public interface CountryRepo extends JpaRepository<Country, Integer>{
	public Country findById(int id);

}
