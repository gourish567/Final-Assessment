package com.abcsolition.timesheet;

public class Employee {
	private Integer empId;
	private String empName;
	private String projectName;
	private Address employeeAddress;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(Integer empId, String empName, String projectName, String street, String city, String state, String pin) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.projectName = projectName;
		setAddress(street,city,state,pin);
	}
	public void setAddress(String street, String city, String state, String pin) {
		this.employeeAddress = new Address(street,city,state,pin);
		}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	@Override
	public String toString() {
		
		String output= "Employee" + empName;
		
		return output;
	}
	
	
}
