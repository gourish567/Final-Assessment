package ectraprogram;

import java.util.Scanner;

class Address
{
	String street,city,state;
	int pin;
}
class Employee extends Address
{
	int emp_id;
	String emp_name,project_name;
}
class Manager extends Employee
{
	String client_name;
	int no_of_people_reporting;
}
class TimeSheet
{
	int TimeSheet_id,hours_spent;
	String date,activity,discription;
	enum status
	{
	  Approved,
	  Rejected,
	  Submitted
	}
}
interface TimeSheetInterface
{
	void employee();
	void sheetlist();
	void sheetstatus();
	void getsheet();
}
class DefaultTimeSheettime implements TimeSheetInterface
{

	@Override
	public void employee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sheetlist() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sheetstatus() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getsheet() {
		// TODO Auto-generated method stub
		
	}
	
}
public class Employee_class extends DefaultTimeSheettime {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Employee_class obj=new Employee_class();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 1: Employee and 2: Manager");
		n=s.nextInt();
		if(n==1)
		{
			
		}
		else if(n==2)
		{
			
		}
		else
		{
			System.out.println("Enter valid input");
		}
		

	}

}
