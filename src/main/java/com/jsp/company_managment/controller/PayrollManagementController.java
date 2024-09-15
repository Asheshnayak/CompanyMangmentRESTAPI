package com.jsp.company_managment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.company_managment.entity.Payroll;
import com.jsp.company_managment.service.PayrollService;

@RestController
@RequestMapping("/api/payroll-management")
public class PayrollManagementController {

    @Autowired
    private PayrollService payrollService;

    @PostMapping
    public ResponseEntity<Payroll> createPayroll(@RequestBody Payroll payroll) {
        Payroll newPayroll = payrollService.createPayroll(payroll);
        return new ResponseEntity<>(newPayroll, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Payroll>> getAllPayrolls() {
        List<Payroll> payrolls = payrollService.getAllPayrolls();
        return new ResponseEntity<>(payrolls, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Payroll> getPayrollById(@PathVariable Long id) {
        Payroll payroll = payrollService.getPayrollById(id);
        return new ResponseEntity<>(payroll, payroll != null ? HttpStatus.OK : HttpStatus.NOT_FOUND);
    }
}