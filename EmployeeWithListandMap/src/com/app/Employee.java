package com.app;

public class Employee {
	
	private String janapassword;
	private String janaemployeeID;
	private String janamobileNo;
	private String janaaddress;
	public Employee(String janapassword, String janaemployeeID, String janamobileNo, String janaaddress) {
		super();
		this.janapassword = janapassword;
		this.janaemployeeID = janaemployeeID;
		this.janamobileNo = janamobileNo;
		this.janaaddress = janaaddress;
	}
	public String getJanapassword() {
		return janapassword;
	}
	public void setJanapassword(String janapassword) {
		this.janapassword = janapassword;
	}
	public String getJanaemployeeID() {
		return janaemployeeID;
	}
	public void setJanaemployeeID(String janaemployeeID) {
		this.janaemployeeID = janaemployeeID;
	}
	public String getJanamobileNo() {
		return janamobileNo;
	}
	public void setJanamobileNo(String janamobileNo) {
		this.janamobileNo = janamobileNo;
	}
	public String getJanaaddress() {
		return janaaddress;
	}
	public void setJanaaddress(String janaaddress) {
		this.janaaddress = janaaddress;
	}
	@Override
	public String toString() {
		return "Employee [janapassword=" + janapassword + ", janaemployeeID=" + janaemployeeID + ", janamobileNo="
				+ janamobileNo + ", janaaddress=" + janaaddress + "]";
	}
}
	