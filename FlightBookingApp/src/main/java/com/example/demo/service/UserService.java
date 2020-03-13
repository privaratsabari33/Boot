package com.example.demo.service;

import java.util.List;

import com.example.demo.exception.UserNotFoundException;
import com.example.demo.model.UserDetails;


public interface UserService {
	
	List<UserDetails> fetchUserDetails() throws UserNotFoundException ;
	UserDetails saveUserDetails(UserDetails UserDetails) ;
	UserDetails findById(Long id) throws UserNotFoundException;

}
