package com.example.userManagement.DTO;

	public class QueryRequest {
	    private String query;
	    private Long userId;

	    public Long getUserId() {
			return userId;
		}

		public void setUserId(Long userId) {
			this.userId = userId;
		}

		public String getQuery() {
	        return query;
	    }

	    public void setQuery(String query) {
	        this.query = query;
	    }
	}


