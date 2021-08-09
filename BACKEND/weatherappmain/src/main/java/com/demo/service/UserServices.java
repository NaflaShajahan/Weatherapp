package com.demo.service;

import java.util.List;

import com.demo.entities.User;

public interface UserServices {
	
	 public List<User> getAllUsers();
	 public void saveUser(User user);
	 public User findByUsername(String username); 
	 public User deleteUser(int id);
	 public User getUserById(int id);
	

}