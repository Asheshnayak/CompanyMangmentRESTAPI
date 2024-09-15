package com.jsp.company_managment.service;

import java.util.List;

import com.jsp.company_managment.entity.Customer;

public interface CustomerManagementService {
public List<Customer> viewCustomers();
public Customer createCustomer(Customer customer);
}
