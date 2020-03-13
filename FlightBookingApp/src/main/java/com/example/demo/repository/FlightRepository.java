package com.example.demo.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.FlightBook;


@Repository
public interface FlightRepository extends JpaRepository<FlightBook, Long>{

	List<FlightBook> getBySource(String source, String destination);
	
}

