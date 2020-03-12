package com.example.demo.service;

import java.util.List;
import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exception.UserNotFoundException;
import com.example.demo.model.PassengerDetails;
import com.example.demo.repository.PassengerRepository;

@Service
public class PassengerService {

	@Autowired
	private PassengerRepository passengerRepo;
	

	public List<PassengerDetails> getAllPassengers() {
		return passengerRepo.findAll();
	}

	public PassengerDetails getPassengerById(Long id) throws UserNotFoundException 
    {
        Optional<PassengerDetails> pass = passengerRepo.findById(id);
         
        if(pass.isPresent()) {
            return pass.get();
        } else {
            throw new UserNotFoundException("No passenger record exist for given id");
        }
    }
	
	
}
