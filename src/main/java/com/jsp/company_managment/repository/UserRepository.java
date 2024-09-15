package com.jsp.company_managment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.company_managment.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
public User findByUserName(String userName);
}
