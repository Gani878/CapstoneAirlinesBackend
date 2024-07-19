//<<<<<<< HEAD
package com.example.userManagement.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.userManagement.model.Flights;

@Repository
public interface FlightRepository extends JpaRepository<Flights, Long> {

}
