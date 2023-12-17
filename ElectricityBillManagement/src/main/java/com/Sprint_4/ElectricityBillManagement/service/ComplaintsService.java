package com.Sprint_4.ElectricityBillManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Sprint_4.ElectricityBillManagement.model.Complaints;
import com.Sprint_4.ElectricityBillManagement.repository.ComplaintsRepo;

@Service
public class ComplaintsService {
	@Autowired
	private ComplaintsRepo complaintsRepo;
	
	public boolean insert(Complaints complaints){
		Complaints complaint=this.complaintsRepo.save(complaints);
		return complaint!=null;
	}
	public void update(Complaints complaints){
		this.complaintsRepo.save(complaints);
	}
	
	public void delete(Complaints complaints){
		this.complaintsRepo.delete(complaints);
	}
	
	public Complaints get(int ComplaintId){
		return this.complaintsRepo.findById(ComplaintId).get();
	}
	
	public List<Complaints> get(){
		return this.complaintsRepo.findAll();
	}
}
