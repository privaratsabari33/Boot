package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.UserNotFoundException;
import com.example.demo.model.PassengerDetails;
import com.example.demo.service.PassengerService;

@RestController
@RequestMapping("/userdetails")
public class PassengerController {

	@Autowired
	private PassengerService passenger;
	

	@GetMapping
	public  List<PassengerDetails> getAllPassengers() {
		return passenger.getAllPassengers();
	}

	@GetMapping("passenger/{id}")
	public  PassengerDetails getPassengerById(@PathVariable("id") Long id) throws UserNotFoundException{
		PassengerDetails entity= passenger.getPassengerById(id);
	   return entity;
	}
	
	

	  
}
