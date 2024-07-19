package com.example.userManagement.model;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "user_query")
public class UserQuery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_query_id")
    private Long userQueryId;
    
    @Column(name="user_queries",nullable = false)
    private String userQueries;

    @Column(name="user_id")
    private Long userId;
    
    @Column(name="created_at")
    private LocalDateTime createdAt;
    
	public Long getUserQueryId() {
		return userQueryId;
	}

	public void setUserQueryId(Long userQueryId) {
		this.userQueryId = userQueryId;
	}

	public String getUserQueries() {
		return userQueries;
	}

	public void setUserQueries(String userQueries) {
		this.userQueries = userQueries;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime localDateTime) {
		this.createdAt = localDateTime;
	}    

}
