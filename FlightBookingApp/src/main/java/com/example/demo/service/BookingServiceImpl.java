package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exception.UserNotFoundException;
import com.example.demo.model.BookingInfo;
import com.example.demo.model.PassengerDetails;
import com.example.demo.model.UserDetails;
import com.example.demo.repository.BookingRepository;
import com.example.demo.repository.PassengerRepository;


@Service
public class BookingServiceImpl implements BookingService{

	@Autowired
	private UserService  userService;
	
	@Autowired
	private BookingRepository bookingRepository;
	
	
	  @Override 
	public BookingInfo flightBooking(BookingInfo bookingInfo) throws UserNotFoundException {
		UserDetails user = bookingInfo.getUserDetails();
		
		
		if (user == null) {
			throw new UserNotFoundException("USER MUST LOGIN THE PAGE");
		}
		UserDetails user1 = userService.findById(user.getUserid());
		if (user1 == null) {
			throw new UserNotFoundException("UserName Not Found Exception");
		}
		BookingInfo info=bookingRepository.save(bookingInfo);
		
		return info;
	}
	 
}
