package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.PassengerDetails;
import com.google.common.base.Optional;


@Repository
public interface PassengerRepository extends JpaRepository<PassengerDetails,Long> {



	Optional<PassengerDetails> findByEmail(String email);
	
}
