package com.jsp.company_managment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.company_managment.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
