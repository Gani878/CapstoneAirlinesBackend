package com.example.userManagement.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "flight")
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="flight_id")
    private Long flightId;

    @Column(name="source")
    private String source;

    @Column(name="destination")
    private String destination;

    @Column(name="flightName")
    private String flightName;
    
    @Column(name="seats")
    private Long seatAvailability;
    
    @Column(name="flight_scheduled_date")
    private Date flightScheduledDate;


	public Long getFlightId() {
		return flightId;
	}

	public void setFlightId(Long flightId) {
		this.flightId = flightId;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public Long getSeatAvailability() {
		return seatAvailability;
	}

	public void setSeatAvailability(Long seatAvailability) {
		this.seatAvailability = seatAvailability;
	}

	public Date getFlightScheduledDate() {
		return flightScheduledDate;
	}

	public void setFlightScheduledDate(Date flightScheduledDate) {
		this.flightScheduledDate = flightScheduledDate;
	} 
	
}
