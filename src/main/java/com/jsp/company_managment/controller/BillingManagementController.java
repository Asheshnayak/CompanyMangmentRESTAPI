package com.jsp.company_managment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.company_managment.entity.Bill;
import com.jsp.company_managment.service.BillingManagementService;

@RestController
@RequestMapping("/api/billing-management")
public class BillingManagementController {

    @Autowired
    private BillingManagementService billingManagementService;

    @GetMapping("/view")
    public List<Bill> viewBills() {
        return billingManagementService.viewBills();  // Fetch bills from DB
    }

    @PostMapping("/create")
    public Bill createBill(@RequestBody Bill bill) {
        return billingManagementService.createBill(bill);  // Save bill in DB
    }
}
