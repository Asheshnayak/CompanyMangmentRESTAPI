package com.jsp.company_managment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.company_managment.entity.UserManagement;

public interface UserManagementRepository extends JpaRepository<UserManagement, Long> {
	public UserManagement findByUserName(String roleName);
}
