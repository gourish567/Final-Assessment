package com.abcsolition.timesheet;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee {
	private String clientName;
	private Integer noOfPeopleReporting;
	public List<TimeSheet> timeSheetApproval=new ArrayList<TimeSheet>();
	
	public Manager(Integer empId, String empName, String projectName, String street, String city, String state, String pin,String clientName, Integer noOfPeopleReporting) {
		super(empId,empName,projectName, street, city, state, pin);
		this.clientName = clientName;
		this.noOfPeopleReporting = noOfPeopleReporting;
		
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public Integer getNoOfPeopleReporting() {
		return noOfPeopleReporting;
	}

	public void setNoOfPeopleReporting(Integer noOfPeopleReporting) {
		this.noOfPeopleReporting = noOfPeopleReporting;
	}

	public List<TimeSheet> getTimeSheetApproval() {
		return timeSheetApproval;
	}

	

	public void setTimeSheetApproval(List<TimeSheet> timeSheetApproval) {
		this.timeSheetApproval = timeSheetApproval;
	}

	@Override
	public String toString() {
		String name=getEmpName();
		return "Manager"+ name;
	}
	
	
	
}
