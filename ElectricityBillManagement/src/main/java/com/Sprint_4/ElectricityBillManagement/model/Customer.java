package com.Sprint_4.ElectricityBillManagement.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("customer")
public class Customer {
	@Id
	long customerId;
	int billNumber;
	String title;
	String customerName;
	String email;
	long mobileNumber;
	String userId;
	String password;
	String confirmPassword;
	
	//default Constructor
	public Customer() {
		super();
	}
	
	public Customer(String userId, String password) {
		super();
		this.userId = userId;
		this.password = password;
	}


	
	//Parameterized Constructor
	public Customer(long customerId, int billNumber, String title, String customerName, String email, long mobileNumber,
			String userId, String password, String confirmPassword) {
		super();
		this.customerId = customerId;
		this.billNumber = billNumber;
		this.title = title;
		this.customerName = customerName;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.userId = userId;
		this.password = password;
		this.confirmPassword = confirmPassword;
	}
	
	//Getters and Setters 
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public int getBillNumber() {
		return billNumber;
	}
	public void setBillNumber(int billNumber) {
		this.billNumber = billNumber;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	
	
	//to String method 
	@Override
	public String toString() {
		return "customer [customerId=" + customerId + ", billNumber=" + billNumber + ", title=" + title
				+ ", customerName=" + customerName + ", email=" + email + ", mobileNumber=" + mobileNumber + ", userId="
				+ userId + ", password=" + password + ", confirmPassword=" + confirmPassword + "]";
	}
}
