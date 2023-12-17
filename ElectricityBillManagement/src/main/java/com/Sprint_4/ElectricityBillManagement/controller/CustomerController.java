package com.Sprint_4.ElectricityBillManagement.controller;


/*
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.Sprint_4.ElectricityBillManagement.model.Customer;
import com.Sprint_4.ElectricityBillManagement.service.CustomerService;

@Component
public class CustomerController implements CommandLineRunner{
	
	Logger logger=LoggerFactory.getLogger(getClass());
	
	@Autowired
	private CustomerService customerService;
	
	
	@Override
	public void run(String... args)throws Exception{
		logger.info("Inserting in the Customer");
		Customer customer=new Customer(210123,210123,"Mr.","Subbareddy","Subbareddy934@gmail.com",544853,"Subba82","1234","1234");
		this.customerService.insert(customer);
		logger.info("Inserted Successfully");
		
	}
}
*/

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Sprint_4.ElectricityBillManagement.model.Customer;
import com.Sprint_4.ElectricityBillManagement.service.CustomerService;
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class CustomerController{
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/Customer")
    public List<Customer> getUsers() {
        return (List<Customer>) customerService.get();
    }

	@PostMapping("/Customer")
    Customer Login(@RequestBody Customer customer) {
		if(customer.getBillNumber()!=0 && customer.getCustomerId()!=0 && customer.getCustomerName()!="" && customer.getEmail()!="" && customer.getMobileNumber()!=0 && customer.getUserId()!="" && customer.getPassword()!="" && customer.getConfirmPassword()!="" && customer.getTitle()!=""){
			System.out.println(customer);
			return customerService.insert(customer);
		}
		else{
			
			System.out.println(customer);
			return customerService.login(customer);
			
		}
		
    }
    @PostMapping("/Customer/register")
    void addUser(@RequestBody Customer customer) {
    	customerService.insert(customer);
    }
}
