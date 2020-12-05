package com.app;

import java.util.List;
import java.util.Map;

public class Employee {
	private int empId;
	private List<Integer> empProjects;
	private Map<Integer,String> empMap;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
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
		return "Employee [empId=" + empId + ", empProjects=" + empProjects + ", empMap=" + empMap + "]";
	}

}
