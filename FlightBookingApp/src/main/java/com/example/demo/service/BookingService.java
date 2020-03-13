package com.example.demo.service;

import com.example.demo.exception.UserNotFoundException;
import com.example.demo.model.BookingInfo;

public interface BookingService {
	 BookingInfo flightBooking(BookingInfo bookingInfo) throws UserNotFoundException; 

}
