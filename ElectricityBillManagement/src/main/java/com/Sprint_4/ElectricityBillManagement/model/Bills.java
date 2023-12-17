package com.Sprint_4.ElectricityBillManagement.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("bills")
public class Bills {
	@Id
	int billId;
	long customerId;
	double billAmount;
	double due_amount;
	String billDate;
	
	
	public Bills() {
		super();
	}
	
	
	


	public Bills(int billId, long customerId, double billAmount, double due_amount, String billDate) {
		super();
		this.billId = billId;
		this.customerId = customerId;
		this.billAmount = billAmount;
		this.due_amount = due_amount;
		this.billDate = billDate;
	}





	public int getBillId() {
		return billId;
	}


	public void setBillId(int billId) {
		this.billId = billId;
	}


	public long getCustomerId() {
		return customerId;
	}


	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}


	public double getBillAmount() {
		return billAmount;
	}


	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}


	public double getDue_amount() {
		return due_amount;
	}


	public void setDue_amount(double due_amount) {
		this.due_amount = due_amount;
	}


	public String getBillDate() {
		return billDate;
	}


	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}


	@Override
	public String toString() {
		return "bills [billId=" + billId + ", customerId=" + customerId + ", billAmount=" + billAmount + ", due_amount="
				+ due_amount + ", billDate=" + billDate + "]";
	}
}
