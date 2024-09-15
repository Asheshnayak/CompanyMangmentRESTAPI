package com.jsp.company_managment.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.company_managment.entity.UserManagement;
import com.jsp.company_managment.repository.UserManagementRepository;
import com.jsp.company_managment.service.UserManagementService;
@Service
public class UserManagementServiceImpl implements UserManagementService {
	@Autowired
    private UserManagementRepository userManagementRepository;
	@Override
	public UserManagement createUser(UserManagement user) {
		return userManagementRepository.save(user);
	}

	@Override
	public UserManagement getUserByUsername(String username) {
		return userManagementRepository.findByUserName(username);
	}

}
