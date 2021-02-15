package com.springboot.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.springboot.dto.UserRegistrationDto;
import com.springboot.model.User;

public interface UserService extends UserDetailsService {
	User save(UserRegistrationDto registrationDto);
}
