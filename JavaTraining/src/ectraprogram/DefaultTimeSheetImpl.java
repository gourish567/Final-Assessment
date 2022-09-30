package com.abcsolition.timesheet;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import com.abcsolition.timesheet.TimeSheet.Status;


public class DefaultTimeSheetImpl implements TimeSheetInterface{

	@Override
	public TimeSheet creatTimeSheet(int empId, Date date, String activity) {
		Random r=new Random();
		int n=r.nextInt(10);
		TimeSheet t=new TimeSheet(empId,date,activity,"No-Description",n, Status.SUBMITTED);
		return t;
	}

	@Override
	public void addTimeSheet(TimeSheet t, Manager M) {
		M.timeSheetApproval.add(t);
	}

	@Override
	public void changeStatus(TimeSheet t, Status s,Manager M) {
		t.setStatus(s);
		for(TimeSheet t1:M.timeSheetApproval) {
			if(t1.getTimeSheetId()==t.getTimeSheetId())
				t1.setStatus(s);
		}
	}

	@Override
	public List<TimeSheet> getTimeSheet(Employee e,Manager M) {
		List<TimeSheet> timeSheet=new ArrayList<TimeSheet>();
		for(TimeSheet t:M.timeSheetApproval) {
			if (e.getEmpId()==t.getTimeSheetId())
				timeSheet.add(t);
		}
		return timeSheet;
		
	}

	@Override
	public String toString() {
		return "DefaultTimeSheetImpl";
	}
	
}
