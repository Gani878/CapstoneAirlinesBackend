package com.example.userManagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "AIRLINES")
public class Airlines {
	
	

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int airline_id;// int auto_increment primary Key,
	private String airline_name;// varchar(100),
	private String airline_code;// varchar(20),
	private String country;// varchar(50)
	
	@Override
	public String toString() {
		return "Airlines [airline_id=" + airline_id + ", airline_name=" + airline_name + ", airline_code="
				+ airline_code + ", country=" + country + "]";
	}
	public int getAirline_id() {
		return airline_id;
	}
	public void setAirline_id(int airline_id) {
		this.airline_id = airline_id;
	}
	public String getAirline_name() {
		return airline_name;
	}
	public void setAirline_name(String airline_name) {
		this.airline_name = airline_name;
	}
	public String getAirline_code() {
		return airline_code;
	}
	public void setAirline_code(String airline_code) {
		this.airline_code = airline_code;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	

}
