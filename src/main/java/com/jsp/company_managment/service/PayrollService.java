package com.jsp.company_managment.service;

import java.util.List;

import com.jsp.company_managment.entity.Payroll;

public interface PayrollService {

	public Payroll createPayroll(Payroll payroll);

	public List<Payroll> getAllPayrolls();

	public Payroll getPayrollById(Long id);

}
