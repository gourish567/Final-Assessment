package com.abcsolition.timesheet;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.abcsolition.timesheet.TimeSheet.Status;



public class UsingTimeSheet {

	public static void main(String[] args) throws Exception {
		String sDate1="31/12/2021";  
	    Date date=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);  
	    
		Employee e=new Employee(101, "QRS", "Java","HHL", "TMK", "KA", "572168");
		Employee e1=new Employee(102, "Abc", "ss","aHL", "MK", "TN", "58868");
		Employee e2=new Employee(103, "ssd", "Jaddva","bHHL", "Kfh", "AP", "573268");
		
		Employee m=new Manager(105, "MGR", "Management","BLR", "BCITY", "KA", "570001","Client1",3);
		
		DefaultTimeSheetImpl d=new DefaultTimeSheetImpl();
		TimeSheet t=d.creatTimeSheet(101,date, "Coding");
		Manager m1=(Manager)m;
		List<TimeSheet> l1=m1.getTimeSheetApproval();
		try {
			if (l1.contains(t)) {
				throw new DuplicateTimeSheetException("Duplicate Entry");
			}
			d.addTimeSheet(t,(Manager)m);
			d.changeStatus(t, Status.APPROVED, (Manager)m);
			List<TimeSheet> l=d.getTimeSheet(e1, (Manager)m);
			l.forEach((emp)->System.out.println(emp));
		} catch (DuplicateTimeSheetException ex) {
			System.out.println(ex.getMessage());
		}
		
	}

}

