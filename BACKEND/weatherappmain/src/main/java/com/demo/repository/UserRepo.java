package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;
import org.springframework.stereotype.Repository;

import com.demo.entities.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer>{
    public User findByUsername(String username);
//	public User findByUsernameAndPassword(String username, String password); 
	
}
