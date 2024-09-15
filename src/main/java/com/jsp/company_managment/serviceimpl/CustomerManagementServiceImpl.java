package com.jsp.company_managment.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.company_managment.entity.Customer;
import com.jsp.company_managment.repository.CustomerRepository;
import com.jsp.company_managment.service.CustomerManagementService;
@Service
public class CustomerManagementServiceImpl implements CustomerManagementService{
	@Autowired
	private CustomerRepository customerRepository;
	@Override
	public List<Customer> viewCustomers() {
		return customerRepository.findAll();
	}

	@Override
	public Customer createCustomer(Customer customer) {
		return customerRepository.save(customer);
	}
	
}



