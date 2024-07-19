package com.example.userManagement.repository;

import com.example.userManagement.model.User;
import com.example.userManagement.model.UserQuery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface UserQueryRepository extends JpaRepository<UserQuery, Long> {

}

