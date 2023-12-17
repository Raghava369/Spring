package com.Sprint_4.ElectricityBillManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages="com.Sprint_4.ElectricityBillManagement")
public class ElectricityBillManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElectricityBillManagementApplication.class, args);
	}

}
