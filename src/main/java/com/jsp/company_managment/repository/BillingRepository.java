package com.jsp.company_managment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.company_managment.entity.Bill;

public interface BillingRepository extends JpaRepository<Bill, Long>{

}
