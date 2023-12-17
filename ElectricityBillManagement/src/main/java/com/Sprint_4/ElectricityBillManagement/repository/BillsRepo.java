package com.Sprint_4.ElectricityBillManagement.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.Sprint_4.ElectricityBillManagement.model.Bills;

@Repository
public interface BillsRepo extends MongoRepository<Bills,Integer> {
	List<Bills> findByCustomerId(long CustomerId);
}
