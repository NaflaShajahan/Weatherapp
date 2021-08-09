package com.demo.service;

import java.util.List;
import org.springframework.security.crypto.password.PasswordEncoder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.entities.User;
import com.demo.repository.UserRepo;
import com.demo.service.exception.*;

@Service
@Transactional
public class UserServiceImp implements UserServices{
	
	private UserRepo userRepo;
	
	@Autowired
	private PasswordEncoder encoder;
	
	@Autowired
	public UserServiceImp(UserRepo userRepo) {
		this.userRepo = userRepo;
	}

	@Override
	public List<User> getAllUsers() {
		return userRepo.findAll();
	}

	@Override
	public void saveUser(User user) {
		user.setPassword(encoder.encode(user.getPassword()));
	    userRepo.save(user);
	}

//	@Override
//	public User findByUsernameAndPassword(String username, String password) {
//		
//		return userRepo.findByUsernameAndPassword(username, password);
//	}

	@Override
	public User findByUsername(String username) {
		
		return userRepo.findByUsername(username);
	}
	
	
	@Override
	public User deleteUser(int id) {
		User userToDelete = getUserById(id);
		userRepo.delete(userToDelete);
		return userToDelete;
	}
	@Override
	public User getUserById(int id) {
		return userRepo.findById(id).orElseThrow(UserNotFoundException :: new);
	}
	
	
}	



