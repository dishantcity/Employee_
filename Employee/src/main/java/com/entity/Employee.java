package com.entity;

public class Employee {
	
	private int id;
	private String fullName;
	private String dob;
	private String address;
	private String qulification;
	private String email;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String fullName, String dob, String address, String qulification, String email) {
		super();
		this.fullName = fullName;
		this.dob = dob;
		this.address = address;
		this.qulification = qulification;
		this.email = email;
	}
	
	
	public Employee(int id, String fullName, String dob, String address, String qulification, String email) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.dob = dob;
		this.address = address;
		this.qulification = qulification;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
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

	public String getQulification() {
		return qulification;
	}

	public void setQulification(String qulification) {
		this.qulification = qulification;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", fullName=" + fullName + ", dob=" + dob + ", address=" + address
				+ ", qulification=" + qulification + ", email=" + email + "]";
	}
	
	
}
