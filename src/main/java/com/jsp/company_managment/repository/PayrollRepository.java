package com.jsp.company_managment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.company_managment.entity.Payroll;

public interface PayrollRepository extends JpaRepository<Payroll,Long> {

}
