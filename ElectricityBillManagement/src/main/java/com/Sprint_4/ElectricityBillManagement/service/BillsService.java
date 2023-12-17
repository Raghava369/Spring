package com.Sprint_4.ElectricityBillManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Sprint_4.ElectricityBillManagement.model.Bills;
import com.Sprint_4.ElectricityBillManagement.repository.BillsRepo;


@Service
public class BillsService {
	@Autowired
	private BillsRepo billsRepo;
	
	public void insert(Bills bills){
		this.billsRepo.save(bills);
	}
	public void update(Bills bills){
		this.billsRepo.save(bills);
	}
	
	public void delete(Bills bills){
		this.billsRepo.delete(bills);
	}
	
	public List<Bills> get(long customerId){
		return this.billsRepo.findByCustomerId(customerId);
	}
	
	public List<Bills> get(){
		return this.billsRepo.findAll();
	}
	
}
