package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Flight;
import com.example.demo.service.BookingService;

@RestController
@RequestMapping("/flightbook")
public class BookingController {

	@Autowired
	private BookingService service;
	
	@GetMapping
	public void saveFlightDetails(Flight fligh)
	{
		service.saveFlightDetails(fligh);
	}
	
	@GetMapping
	public  List<Flight> getAllFlights() {
		return service.getAllFlights();
	}
	
}
