package com.example.demo.repository;






import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Flight;

@Repository
public interface BookingRepo extends JpaRepository<Flight,Long>{
	


}
