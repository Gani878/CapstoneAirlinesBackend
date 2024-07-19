package com.example.userManagement.controller;

import com.example.userManagement.DTO.BookingDTO;
import com.example.userManagement.DTO.BookingPostDTO;
import com.example.userManagement.model.Bookings;
import com.example.userManagement.model.Passengers;
import com.example.userManagement.model.User;
import com.example.userManagement.service.BookingService;
import com.example.userManagement.service.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api/user")
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {

	@Autowired
	private BookingService bookingService;

	@Autowired
	private UserService userService;

	@PostMapping("/login")
	public ResponseEntity<?> loginUser(@RequestBody Map<String, String> loginRequest) {
		String email = loginRequest.get("email");
		String password = loginRequest.get("password");

		try {
			User user = userService.findByEmail(email);
			System.out.println(user + "resultttt");
			if (user != null && userService.validatePassword(password, user.getPassword())) {
				// Authentication successful
				System.out.println("authenticattttttttt");
				return ResponseEntity.ok(new Object() {
					public Long userId = user.getUserId();
					public String email = user.getEmail();
					public String role = user.getRole();
				});
			} else {
				return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("No Credentials found ");
			}

		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error during login");
		}

	}

	@PostMapping("/signUp")
	public ResponseEntity<?> signup(@RequestBody User user) {
		if (userService.findByEmail(user.getEmail()) != null) {
			return ResponseEntity.status(HttpStatus.CONFLICT).body("Email already in use");
		}
		userService.saveUser(user);
		return ResponseEntity.status(HttpStatus.CREATED).body("User registered successfully");
	}

	// Other endpoints and methods

	@PostMapping("/booking")
	public ResponseEntity<String> bookTicket(@RequestBody BookingPostDTO request) {

		System.out.println("Inside Booking controller" + request.toString());

		try {
            
			
			System.out.println(new ObjectMapper().writeValueAsString(request));
			Bookings booking = new Bookings();
			
			booking.setUser(request.getUser());
			booking.setFlight(request.getFlight());
			booking.setBooking_date(request.getBookingDate());
			booking.setStatus(request.getStatus());
			booking.setPassengers(request.getPassengerDetails());
			
			
//			System.out.println(new ObjectMapper().writeValueAsString(booking));
			
//			List<Passengers> newPassengers = new ArrayList<>();
//			
//			for ()

			bookingService.saveBooking(booking.getUser().getUserId(), booking.getFlight().getFlightId(), booking);
			
			System.out.println("Booking is done");
			return ResponseEntity.status(HttpStatus.CREATED)
					.body("Booking is successfull will confirm you in few moments on seat allocation");
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error");
		}

	}

//	@GetMapping("/getBookingDetails/{user_id}")
	public ResponseEntity<Optional<List<Bookings>>> getBookingDetails(@PathVariable Long user_id) {

		System.out.println("Inside getBookingDetails controller");

		try {

//			Optional<List<Bookings>> bookings = userService.getBookingsById(user_id);
//			System.out.println("Bookings->"+bookings.toString());
//			return ResponseEntity.ok(bookings);
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return (ResponseEntity<Optional<List<Bookings>>>) ResponseEntity.notFound();
		}

	}

	@GetMapping("/getBookingDetails/{userId}")
	public ResponseEntity<List<Bookings>> getBookingsByUserId(@PathVariable Long userId) {

		System.out.println("Inside booking controller");
		List<Bookings> bookings = bookingService.getBookingsByUserId(userId);
		return ResponseEntity.ok(bookings);
	}
}
