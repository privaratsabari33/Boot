package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Flight;
import com.example.demo.repository.BookingRepo;

@Service
public class BookingService {

	@Autowired
	private BookingRepo repo;
	
	public void saveFlightDetails(Flight fligh) {
		repo.save(fligh);
 
    }

	public List<Flight> getAllFlights() {
		return repo.findAll();
	}
}
