package com.Sprint_4.ElectricityBillManagement.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("complaints")
public class Complaints {
	@Id
	int complaintId;
	String complaintType;
	String category;
	String contactPerson;
	String landmark;
	long consumerId;
	String problem;
	long mobileNumber;
	String address;
	
	public Complaints() {
		super();
	}

	public Complaints(int complaintId, String complaintType, String category, String contactPerson, String landmark,
			long consumerId, String problem, long mobileNumber, String address) {
		super();
		this.complaintId = complaintId;
		this.complaintType = complaintType;
		this.category = category;
		this.contactPerson = contactPerson;
		this.landmark = landmark;
		this.consumerId = consumerId;
		this.problem = problem;
		this.mobileNumber = mobileNumber;
		this.address = address;
	}

	public int getComplaintId() {
		return complaintId;
	}

	public void setComplaintId(int complaintId) {
		this.complaintId = complaintId;
	}

	public String getComplaintType() {
		return complaintType;
	}

	public void setComplaintType(String complaintType) {
		this.complaintType = complaintType;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getContactPerson() {
		return contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public long getConsumerId() {
		return consumerId;
	}

	public void setConsumerId(long consumerId) {
		this.consumerId = consumerId;
	}

	public String getProblem() {
		return problem;
	}

	public void setProblem(String problem) {
		this.problem = problem;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Complaints [complaintId=" + complaintId + ", complaintType=" + complaintType + ", category=" + category
				+ ", contactPerson=" + contactPerson + ", landmark=" + landmark + ", consumerId=" + consumerId
				+ ", problem=" + problem + ", mobileNumber=" + mobileNumber + ", address=" + address + "]";
	}
	
	
	
	
	
}
