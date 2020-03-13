package com.example.demo.service;

import java.util.Date;
import java.util.List;

import com.example.demo.model.FlightBook;



public interface FlightService {
	
	List<FlightBook> fetchFlightDetails(String source, String destination, Date availablity);

	FlightBook addFlightDetails(FlightBook flightBook) ;

	List<FlightBook> allFlights() ;

}
