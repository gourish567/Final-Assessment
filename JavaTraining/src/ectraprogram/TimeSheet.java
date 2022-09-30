package com.abcsolition.timesheet;

import java.util.Date;

public class TimeSheet {
	private Integer timeSheetId;
	private Date timeSheetDate;
	private String activity;
	private String description;
	private Integer hoursSpent;
	public enum Status { APPROVED,REJECTED,SUBMITTED}
	private Status status;
	public TimeSheet(Integer timeSheetId, Date timeSheetDate, String activity, String description, Integer hoursSpent,
			Status s) {
		super();
		this.timeSheetId = timeSheetId;
		this.timeSheetDate = timeSheetDate;
		this.activity = activity;
		this.description = description;
		this.hoursSpent = hoursSpent;
		this.status = s;
	}
	
	public Integer getTimeSheetId() {
		return timeSheetId;
	}

	public void setTimeSheetId(Integer timeSheetId) {
		this.timeSheetId = timeSheetId;
	}

	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "TimeSheet";
	}
	
	
	
	

	
}
