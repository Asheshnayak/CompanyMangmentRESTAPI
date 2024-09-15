package com.jsp.company_managment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.company_managment.entity.UserManagement;
import com.jsp.company_managment.service.UserManagementService;

public class UserManagementController {
	@RestController
	@RequestMapping("/api/user-management")
	public class UserController {

	    @Autowired
	    private UserManagementService userManagementService;

	    @PostMapping
	    public ResponseEntity<UserManagement> createUser(@RequestBody UserManagement user) {
	        UserManagement newUser = userManagementService.createUser(user);
	        return new ResponseEntity<>(newUser, HttpStatus.CREATED);
	    }

	    @GetMapping("/{username}")
	    public ResponseEntity<UserManagement> getUserByUsername(@PathVariable String username) {
	        UserManagement user = userManagementService.getUserByUsername(username);
	        return new ResponseEntity<>(user, user != null ? HttpStatus.OK : HttpStatus.NOT_FOUND);
	    }
	}

}
