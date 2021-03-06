package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.PassengerDetails;


@Repository
public interface PassengerRepository extends JpaRepository<PassengerDetails, Long>{

}
