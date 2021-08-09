package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
//import org.springframework.security.core.userdetails.User;

import com.demo.dto.SecUser;
//import com.demo.entities.User;
import com.demo.service.UserServices;



@Service
public class DetailsService implements UserDetailsService {
	
	@Autowired 
	private UserServices userServices;
	
//	public UserDetails loadUserByUsernameAndPassword(String Username,String Password) throws UsernameNotFoundException {
//		com.demo.entities.User user=userServices.findByUsernameAndPassword(Username, Password);
//		if(user==null)
//			throw new UsernameNotFoundException("username is not found");
////		return new User(user.getUsername(),user.getPassword(),
////				AuthorityUtils.createAuthorityList(new String[] {user.getRoles()}));
//		return new SecUser(user);
//	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		com.demo.entities.User user=userServices.findByUsername(username);
		if(user==null)
			throw new UsernameNotFoundException("username is not found");
//		return new User(user.getUsername(),user.getPassword(),
//				AuthorityUtils.createAuthorityList(new String[] {user.getRoles()}));
		
		return new SecUser(user);
		
	}


}
