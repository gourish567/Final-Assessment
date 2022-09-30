package com.abcsolition.timesheet;

import java.util.Date;
import java.util.List;

import com.abcsolition.timesheet.TimeSheet.Status;


public interface TimeSheetInterface {

	public TimeSheet creatTimeSheet(int empId, Date date, String activity);
	public void addTimeSheet(TimeSheet t,Manager M);
	public void changeStatus(TimeSheet t,Status s,Manager M);
	public  List<TimeSheet> getTimeSheet(Employee e,Manager M);
}
