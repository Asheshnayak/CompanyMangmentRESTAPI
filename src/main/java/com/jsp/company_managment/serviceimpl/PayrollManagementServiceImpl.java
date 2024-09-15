package com.jsp.company_managment.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.company_managment.entity.Payroll;
import com.jsp.company_managment.repository.PayrollRepository;
import com.jsp.company_managment.service.PayrollService;
@Service
public class PayrollManagementServiceImpl implements PayrollService {

	@Autowired
    private PayrollRepository payrollRepository;

    @Override
    public Payroll createPayroll(Payroll payroll) {
        return payrollRepository.save(payroll);
    }

    @Override
    public List<Payroll> getAllPayrolls() {
        return payrollRepository.findAll();
    }

    @Override
    public Payroll getPayrollById(Long id) {
        return payrollRepository.findById(id).orElse(null);
    }
}
