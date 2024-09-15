package com.jsp.company_managment.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.company_managment.entity.Bill;
import com.jsp.company_managment.repository.BillingRepository;
import com.jsp.company_managment.service.BillingManagementService;

@Service
public class BillingManagementServiceImpl implements BillingManagementService {

    @Autowired
    private BillingRepository billingRepository;

    @Override
    public List<Bill> viewBills() {
        return billingRepository.findAll();  // Retrieve all bills from the database
    }

    @Override
    public Bill createBill(Bill bill) {
        return billingRepository.save(bill);  // Save a new bill to the database
    }
}