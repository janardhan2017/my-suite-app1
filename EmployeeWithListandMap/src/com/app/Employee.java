package com.app;

import java.util.List;
import java.util.Map;

public class Employee {
	private int employeeId;
	private double employeeSalary;
	private String companyName;
	private List<Integer> empProjects;
	private Map<Integer,String> empMap;
	
	public Employee(int employeeId, double employeeSalary, String companyName, List<Integer> empProjects,
			Map<Integer, String> empMap) {
		super();
		this.employeeId = employeeId;
		this.employeeSalary = employeeSalary;
		this.companyName = companyName;
		this.empProjects = empProjects;
		this.empMap = empMap;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public List<Integer> getEmpProjects() {
		return empProjects;
	}
	public void setEmpProjects(List<Integer> empProjects) {
		this.empProjects = empProjects;
	}
	public Map<Integer, String> getEmpMap() {
		return empMap;
	}
	public void setEmpMap(Map<Integer, String> empMap) {
		this.empMap = empMap;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeSalary=" + employeeSalary + ", companyName="
				+ companyName + ", empProjects=" + empProjects + ", empMap=" + empMap + "]";
	}
	
}
