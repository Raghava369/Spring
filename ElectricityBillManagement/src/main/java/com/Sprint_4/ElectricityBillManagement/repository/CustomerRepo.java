package com.Sprint_4.ElectricityBillManagement.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.Sprint_4.ElectricityBillManagement.model.Customer;


@Repository
public interface CustomerRepo extends MongoRepository<Customer,Integer> {
	
	Customer findByUserIdAndPassword(String userId, String password);

}
