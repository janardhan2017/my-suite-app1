package com.app;

public class Company {
	private String companyId;
	private String companyName;
	private String location;
	
	public Company(String companyId, String companyName, String location) {
		super();
		this.companyId = companyId;
		this.companyName = companyName;
		this.location = location;
	}
	public String getCompanyId() {
		return companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Company [companyId=" + companyId + ", companyName=" + companyName + ", location=" + location + "]";
	}
	
	
	

	

}
