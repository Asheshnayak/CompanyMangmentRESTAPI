package com.jsp.company_managment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.company_managment.entity.Customer;
import com.jsp.company_managment.service.CustomerManagementService;
@RestController
@RequestMapping("/api/customer-management")
public class CustomerManagementController {
	
	
@Autowired
private CustomerManagementService customerManagementService;


@GetMapping("/view")
public List<Customer> viewCustomers(){
	return customerManagementService.viewCustomers();
}

@PostMapping("/create")
public Customer createCustomer(@RequestBody Customer customer) {
	return customerManagementService.createCustomer(customer);
}

}
