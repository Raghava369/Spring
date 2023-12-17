package com.Sprint_4.ElectricityBillManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Sprint_4.ElectricityBillManagement.model.Customer;
import com.Sprint_4.ElectricityBillManagement.repository.CustomerRepo;

@Service
public class CustomerService {
	@Autowired
	private CustomerRepo customerRepo;
	
	public Customer insert(Customer customer){
		Customer customers=this.customerRepo.save(customer);
		Customer c=new Customer();
		if(customers!=null) {
			c.setEmail(customers.getEmail());
			c.setCustomerName(customers.getCustomerName());
		}
		return c;
	}
	
	public void update(Customer customer){
		this.customerRepo.save(customer);
	}
	
	public void delete(Customer customer){
		this.customerRepo.delete(customer);
	}
	
	public Customer get(int id){
		return this.customerRepo.findById(id).get();
	}
	
	public List<Customer> get(){
		return this.customerRepo.findAll();
	}

	public Customer login(Customer customer) {
		Customer customer1=customerRepo.findByUserIdAndPassword(customer.getUserId(),customer.getPassword());
		System.out.println("Customer Service login method"+customer1);
		Customer c=new Customer();
		if(customer1!=null) {
			c.setEmail(customer1.getEmail());
			c.setCustomerName(customer1.getCustomerName());
			c.setCustomerId(customer1.getCustomerId());
		}
		return c;
	}
		
}
