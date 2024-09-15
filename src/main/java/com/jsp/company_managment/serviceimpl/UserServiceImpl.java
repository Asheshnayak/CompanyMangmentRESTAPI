package com.jsp.company_managment.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.company_managment.entity.User;
import com.jsp.company_managment.repository.UserRepository;
import com.jsp.company_managment.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;

	@Override
	public User createUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public User getUserById(Long id) {
		return userRepository.findById(id).orElseThrow(()->new RuntimeException("user not found"));
	}

	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

}
