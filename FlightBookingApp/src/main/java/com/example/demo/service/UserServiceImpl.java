package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exception.UserNotFoundException;
import com.example.demo.model.UserDetails;
import com.example.demo.repository.UserRepository;


@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public List<UserDetails> fetchUserDetails() throws UserNotFoundException {
	List<UserDetails> list=	userRepository.findAll();
	if(list==null||list.isEmpty()) {
		throw new UserNotFoundException("UserDetails Records Not Found From DB");
	}
		return list;
	}

	
	@Override
	public UserDetails saveUserDetails(UserDetails UserDetails)  {
		UserDetails emp=userRepository.save(UserDetails);
		
		return emp;
	}

	@Override
	public UserDetails findById(Long id) throws UserNotFoundException {
		Optional<UserDetails>  e=userRepository.findById(id);
		if(!e.isPresent()) {
			throw new UserNotFoundException("User Details not found From Db ");
		}
		return e.get();
	}
}
