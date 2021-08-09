package com.demo.config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.demo.service.DetailsService;

import org.springframework.security.core.userdetails.UserDetailsService;

//import com.demo.config.DetailsService;
@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Autowired
	private UserDetailsService userDetailsService;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService);	
	}
	
	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.csrf().disable().authorizeRequests()
		.antMatchers("/home/**").permitAll()
		.antMatchers("/register").permitAll()
//		.antMatchers("/login/**").hasAnyRole("USER","ADMIN")
		.antMatchers("/current-weather/**").hasAnyRole("USER","ADMIN")
		.antMatchers("/air-watcher/**").hasAnyRole("USER","ADMIN")
		.antMatchers("/deleteuser/{id}/**").hasAnyRole("ADMIN")
		.antMatchers("/favorite/**").hasAnyRole("ADMIN","USER")
		.antMatchers("/all-user/**").hasAnyRole("ADMIN")
		.antMatchers(HttpMethod.OPTIONS, "/**").permitAll()
		.anyRequest().authenticated()
		.and()
		.httpBasic()
		.and()
		.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
	}

}
