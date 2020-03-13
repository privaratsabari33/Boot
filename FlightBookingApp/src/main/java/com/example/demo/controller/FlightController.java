package com.example.demo.controller;

import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.UserNotFoundException;
import com.example.demo.model.BookingInfo;
import com.example.demo.model.FlightBook;
import com.example.demo.model.UserDetails;
import com.example.demo.service.BookingService;
import com.example.demo.service.FlightService;
import com.example.demo.service.UserService;




@RestController
@RequestMapping("/flight")
public class FlightController {


	@Autowired
	private UserService userService;
	
	@Autowired
	private FlightService flightService;
	
	@Autowired
	private BookingService bookingService;
	
	@GetMapping(value="/userlist")
	public ResponseEntity<List<UserDetails>> fetchUserDetails() throws UserNotFoundException {
		List<UserDetails> list=userService.fetchUserDetails();
		return new ResponseEntity(list, HttpStatus.OK);
	}
	@PostMapping(value="/save")
	public ResponseEntity addUserDetails(@Valid @RequestBody UserDetails UserDetails) {
		return new ResponseEntity(userService.saveUserDetails(UserDetails),HttpStatus.OK);
	}
	
	@GetMapping(value="/user/id")
	public ResponseEntity<UserDetails> fetchUser(@PathVariable("id") Long id) throws UserNotFoundException {
		UserDetails list=userService.findById(id);
		return new ResponseEntity(list, HttpStatus.OK);
	}
	@GetMapping(value="/searchflights")
	public ResponseEntity<List<FlightBook>> fetchFlights(@RequestParam("source") String source,@RequestParam("destination") String destination,@RequestParam("availablity") Date availablity) {
		
		List<FlightBook> list=flightService.fetchFlightDetails(source, destination, availablity);
		return new ResponseEntity(list, HttpStatus.OK);
	}
	
	
	@PostMapping(value="/saveflight")
	public ResponseEntity<FlightBook> addFlightDetails(@Valid @RequestBody FlightBook flight) {
		return new ResponseEntity(flightService.addFlightDetails(flight),HttpStatus.OK);
	}
	
	@GetMapping(value="/allflights")
	public ResponseEntity<List<FlightBook>> getAllFlights() {
		List<FlightBook> list=flightService.allFlights();
		return new ResponseEntity(list, HttpStatus.OK);
	}
	
	  @PostMapping(value="/bookFlight")
	  public ResponseEntity<FlightBook> bookFlightDetails(@Valid  @RequestBody BookingInfo bookingInfo) throws UserNotFoundException{ return
	  new ResponseEntity(bookingService.flightBooking(bookingInfo),HttpStatus.OK); }
	 
	
	
}
