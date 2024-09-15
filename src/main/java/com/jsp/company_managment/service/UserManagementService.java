package com.jsp.company_managment.service;

import com.jsp.company_managment.entity.UserManagement;

public interface UserManagementService {
	public  UserManagement createUser(UserManagement user);
	public UserManagement getUserByUsername(String username);
}
