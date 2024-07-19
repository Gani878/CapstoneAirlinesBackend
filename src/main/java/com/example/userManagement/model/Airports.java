package com.example.userManagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "BOOKINGS")
public class Airports {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int airportId;// int auto_increment Primary Key,
	private String airportCode; // varchar(100),
	private String airportName;
	private String city;// varchar(100),
	private String country;// varchar(50)
	public int getAirportId() {
		return airportId;
	}
	public void setAirportId(int airportId) {
		this.airportId = airportId;
	}
	public String getAirportCode() {
		return airportCode;
	}
	public void setAirportCode(String airportCode) {
		this.airportCode = airportCode;
	}
	public String getAirportName() {
		return airportName;
	}
	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Airports [airportId=" + airportId + ", airportCode=" + airportCode + ", airportName=" + airportName
				+ ", city=" + city + ", country=" + country + "]";
	}
	
	
	
	
	

}
