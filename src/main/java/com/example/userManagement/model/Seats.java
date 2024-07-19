package com.example.userManagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "SEATS")
public class Seats {
	

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int seat_id;// int auto_increment Primary Key,
	private int flight_id;// int,
	private int seat_number;// int,
	private String seat_class;// varchar(100),
	private boolean is_available;// Boolean,
	//Foreign Key (flight_id) references Flights(flight_id)
	public int getSeat_id() {
		return seat_id;
	}
	public void setSeat_id(int seat_id) {
		this.seat_id = seat_id;
	}
	public int getFlight_id() {
		return flight_id;
	}
	public void setFlight_id(int flight_id) {
		this.flight_id = flight_id;
	}
	public int getSeat_number() {
		return seat_number;
	}
	public void setSeat_number(int seat_number) {
		this.seat_number = seat_number;
	}
	public String getSeat_class() {
		return seat_class;
	}
	public void setSeat_class(String seat_class) {
		this.seat_class = seat_class;
	}
	public boolean isIs_available() {
		return is_available;
	}
	public void setIs_available(boolean is_available) {
		this.is_available = is_available;
	}
	@Override
	public String toString() {
		return "Seats [seat_id=" + seat_id + ", flight_id=" + flight_id + ", seat_number=" + seat_number
				+ ", seat_class=" + seat_class + ", is_available=" + is_available + "]";
	}


}
