package com.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.dto.State;

@Repository
public interface StateRepo extends JpaRepository<State, Integer>{
	public State findByCountryname(String countryname);

}
