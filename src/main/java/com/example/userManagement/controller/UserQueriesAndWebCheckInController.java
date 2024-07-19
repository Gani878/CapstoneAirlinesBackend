package com.example.userManagement.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.userManagement.DTO.CheckInRequest;
import com.example.userManagement.DTO.CheckInResponse;
import com.example.userManagement.DTO.QueryRequest;
import com.example.userManagement.model.UserQuery;
import com.example.userManagement.service.UserQueriesAndWebCheckinService;

@RestController
@RequestMapping("/api/user")
@CrossOrigin(origins = "http://localhost:3000")

public class UserQueriesAndWebCheckInController {

    @Autowired
    private UserQueriesAndWebCheckinService userQueriesAndWebCheckinService;

    @PostMapping("/query")
    public ResponseEntity<String> sendQuery(@RequestBody QueryRequest queryRequest) throws Exception {
    	String message=userQueriesAndWebCheckinService.saveQuery(queryRequest);
        return ResponseEntity.ok(message);
    }

    @PostMapping("/checkin")
    public ResponseEntity<CheckInResponse> performCheckIn(@RequestBody CheckInRequest checkInRequest) {
        String message = userQueriesAndWebCheckinService.performCheckIn(checkInRequest);
        CheckInResponse response = new CheckInResponse("Checked in successfully!", message);
        return ResponseEntity.ok(response);
    }
    
    @GetMapping("/getAllQueries")
    public ResponseEntity<List<UserQuery>> getQueries() {
        List<UserQuery> queries = userQueriesAndWebCheckinService.getAllQueries();
        return ResponseEntity.ok(queries);
    }
}
