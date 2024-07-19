package com.example.userManagement.DTO;

public class BookingDTO {
	
	
	    private int bookingId;
	    private String passengerName;
	    private Long flightId;
	    private int flightNumber;
	    private String departureAirport;
	    private String arrivalAirport;
	    private Long userId;
	    private String username;
		
	    public int getBookingId() {
			return bookingId;
		}
		public void setBookingId(int i) {
			this.bookingId = i;
		}
		public String getPassengerName() {
			return passengerName;
		}
		public void setPassengerName(String passengerName) {
			this.passengerName = passengerName;
		}
		public Long getFlightId() {
			return flightId;
		}
		public void setFlightId(Long long1) {
			this.flightId = long1;
		}
		public int getFlightNumber() {
			return flightNumber;
		}
		public void setFlightNumber(int flightNumber) {
			this.flightNumber = flightNumber;
		}
		public String getDepartureAirport() {
			return departureAirport;
		}
		public void setDepartureAirport(String departureAirport) {
			this.departureAirport = departureAirport;
		}
		public String getArrivalAirport() {
			return arrivalAirport;
		}
		public void setArrivalAirport(String arrivalAirport) {
			this.arrivalAirport = arrivalAirport;
		}
		public Long getUserId() {
			return userId;
		}
		public void setUserId(Long userId) {
			this.userId = userId;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}

	    
}
