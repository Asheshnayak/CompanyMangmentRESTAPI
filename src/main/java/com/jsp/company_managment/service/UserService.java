package com.jsp.company_managment.service;

import java.util.List;

import com.jsp.company_managment.entity.User;

public interface UserService {
	public User createUser(User user);
	public User getUserById(Long id);
	public List<User> getAllUsers();
}
