package com.Sprint_4.ElectricityBillManagement.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.Sprint_4.ElectricityBillManagement.model.Complaints;

@Repository
public interface ComplaintsRepo extends MongoRepository<Complaints,Integer>{

}
