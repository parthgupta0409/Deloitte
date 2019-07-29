package com.deloitte.ems.model;

import java.io.Serializable;

public class Employee implements Serializable{
	
	private String fName;
	private String lName;
	private String empId;
	private String dob;
	private String address;
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [fName=" + fName + ", lName=" + lName + ", empId=" + empId + ", dob=" + dob + ", address="
				+ address + "]";
	}
	public Employee(String fName, String lName, String empId, String dob, String address) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.empId = empId;
		this.dob = dob;
		this.address = address;
	}
	public Employee() {
		super();
	}
	
	
	

}
