package com.example.userManagement.repository;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.userManagement.DTO.BookingDTO;
import com.example.userManagement.model.Bookings;

@Repository
public interface BookingRepository extends JpaRepository<Bookings, Integer>{

	
//	 Optional<List<Bookings>> findByUserId(Long user_id);

	List<Bookings> findByUser_UserId(Long userId);
	

}
