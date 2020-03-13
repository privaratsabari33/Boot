package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.BookingInfo;


@Repository
public interface BookingRepository extends JpaRepository<BookingInfo, Long>  {

}
