package com.example.demo.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.FlightBook;
import com.example.demo.repository.FlightRepository;



@Service
public class FlightServiceImpl implements FlightService{

	@Autowired
	private FlightRepository flightRepository;
	
	@Override
	public List<FlightBook> fetchFlightDetails(String source, String destination, Date availablity) {
		List<FlightBook> avalilableFlights=flightRepository.getBySource(source, destination);
		
		return avalilableFlights;
	}


	@Override
	public FlightBook addFlightDetails(FlightBook flightBook)  {
		
		FlightBook flight=flightRepository.save(flightBook);
		
		return flight;
	}


	@Override
	public List<FlightBook> allFlights()  {
		//List<FlightBook> list=flightRepository.findAll();
		
		return flightRepository.findAll();
	}

	
}
