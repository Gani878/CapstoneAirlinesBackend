package com.example.userManagement.model;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "FLIGHTS")
public class Flights {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="flight_id")
	private Long flightId;
	private int flightNumber;
	@Column(name="departure_airport")
	private String source;
	@Column(name="arrival_airport")
	private String destination;
	private Date departureTime;
	private Date arrivalTime;
	private String airline;
	private String status;
	@Column(name="flight_name")
    private String flightName;
	@Column(name="flight_scheduled_date")
	private Date flightScheduledDate;
	
	
	
	
	@OneToMany(mappedBy = "flight", cascade = CascadeType.ALL)
	private List<Bookings> bookings;

	public Long getFlightId() {
		return flightId;
	}

	public void setFlightId(Long flightId) {
		this.flightId = flightId;
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
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

	public Date getFlightScheduledDate() {
		return flightScheduledDate;
	}

	public void setFlightScheduledDate(Date flightScheduledDate) {
		this.flightScheduledDate = flightScheduledDate;
	}

	public Date getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}

	public Date getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(Date arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getAirline() {
		return airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Flights [flightId=" + flightId + ", flightNumber=" + flightNumber + ", source=" + source
				+ ", destination=" + destination + ", departureTime=" + departureTime + ", arrivalTime=" + arrivalTime
				+ ", airline=" + airline + ", status=" + status + ", flightName=" + flightName
				+ ", flightScheduledDate=" + flightScheduledDate + ", bookings=" + bookings + "]";
	}

	
}
