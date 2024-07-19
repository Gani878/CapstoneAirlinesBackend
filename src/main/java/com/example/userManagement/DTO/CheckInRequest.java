package com.example.userManagement.DTO;

import java.time.LocalDateTime;
import java.util.Date;

public class CheckInRequest {
    private Long userId;
    private Long flightId;
    private Date checkInDate;
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getFlightId() {
		return flightId;
	}
	public void setFlightId(Long flightId) {
		this.flightId = flightId;
	}
	public Date getCheckInDate() {
		return checkInDate;
	}
	public void setCheckInDate(Date checkInDate) {
		this.checkInDate = checkInDate;
	}
	
}

