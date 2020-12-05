package com.app;

public class Employee {
	private String name;
	private String password;
	private String employeeID;
	private String mobileNo;
	private String address;
	public Employee(String name, String password, String employeeID, String mobileNo, String address) {
		super();
		this.name = name;
		this.password = password;
		this.employeeID = employeeID;
		this.mobileNo = mobileNo;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", password=" + password + ", employeeID=" + employeeID + ", mobileNo="
				+ mobileNo + ", address=" + address + "]";
	}
}
	