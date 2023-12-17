package com.Sprint_4.ElectricityBillManagement.controller;




/*
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.Sprint_4.ElectricityBillManagement.model.Complaints;
import com.Sprint_4.ElectricityBillManagement.service.ComplaintsService;

@Component
public class ComplaintsController  implements CommandLineRunner{

	Logger logger=LoggerFactory.getLogger(getClass());
	
	@Autowired
	private ComplaintsService complaintsService;
	
	@Override
	public void run(String... args) throws Exception {
		logger.info("Inserting in the Complaints");
		Complaints complaints=new Complaints(123456,"Electric","something","subba","airoli",23012,"Hi to EBM",630454,"airoli");
		this.complaintsService.insert(complaints);
		logger.info("Inserted Successfully");
		
	}

}
*/
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Sprint_4.ElectricityBillManagement.model.Complaints;
import com.Sprint_4.ElectricityBillManagement.service.ComplaintsService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class ComplaintsController{
	@Autowired
	private ComplaintsService complaintsService;
	
	@GetMapping("/Complaints")
    public List<Complaints> getComplaints() {
        return (List<Complaints>) complaintsService.get();
    }
	
	
	
	@GetMapping("/Complaints/{complaintId}")
	Complaints getComplaint(@PathVariable("complaintId") int complaintId){
		
		return   complaintsService.get(complaintId);
	}

	@PostMapping("/Complaints")
    boolean Register(@RequestBody Complaints complaints) {
		System.out.println(complaints);
		return complaintsService.insert(complaints);
		
		
    }
	
    
}

