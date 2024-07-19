package com.example.userManagement.repository;

import com.example.userManagement.model.CheckIn;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface CheckInRepository extends JpaRepository<CheckIn, Long> {

	Optional<CheckIn> findByUserIdAndFlightIdAndCheckInDate(Long userId, Long flightId, Date date);

}

