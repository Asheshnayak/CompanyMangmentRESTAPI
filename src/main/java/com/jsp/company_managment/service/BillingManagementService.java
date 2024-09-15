package com.jsp.company_managment.service;

import java.util.List;

import com.jsp.company_managment.entity.Bill;

public interface BillingManagementService {
	public List<Bill> viewBills();
	public Bill createBill(Bill bill);
}
