package com.Sprint_4.ElectricityBillManagement.controller;

/*
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.Sprint_4.ElectricityBillManagement.model.Bills;
import com.Sprint_4.ElectricityBillManagement.service.BillsService;

@Component
public class BillController  implements CommandLineRunner{

	Logger logger=LoggerFactory.getLogger(getClass());
	
	@Autowired
	private BillsService billsService;
	
	@Override
	public void run(String... args) throws Exception {
		logger.info("Inserting in the Bills");
		Bills bills=new Bills(230123,230123,8500,2500,"30-08-2023");
		this.billsService.insert(bills);
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

import com.Sprint_4.ElectricityBillManagement.model.Bills;
import com.Sprint_4.ElectricityBillManagement.service.BillsService;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class BillController{
	@Autowired
	private BillsService billsService;
	
	@GetMapping("/Bill")
    public List<Bills> getBills() {
        return (List<Bills>) billsService.get();
    }
	
	@PostMapping("/Bill")
	public List<Bills> getBillsById(@RequestBody long customerId){
		return (List<Bills>) billsService.get(customerId);
	}

	
}

