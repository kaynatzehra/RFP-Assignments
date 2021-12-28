package com.day8;

public class EmployeeWageClassMethod {

	public static final int Is_Full_Time = 1;
	public static final int Is_Part_Time = 2;
	public static final int Wage_Per_Hour = 20;
	public static final int Num_Of_Working_Days = 20;
	public static final int Max_Hrs_Per_Month = 100;

public static  int computeEmpWage()
{
	
	int empHr = 0;
	 int totalWorkingDays = 0;
	 int totalEmpHrs = 0;
	 while(totalEmpHrs <= Max_Hrs_Per_Month && totalWorkingDays <= Num_Of_Working_Days)
		{
			totalWorkingDays++;
		}
		for (int day = 0; day < Num_Of_Working_Days ; day++)
		{
		int Random = (int)(Math.random() *3);
		switch (Random)
		{
		case Is_Part_Time:
			empHr = 4;
			break;
			
		case Is_Full_Time:
			empHr = 8;
			break;
			
		default:
			empHr = 0;
		}
		totalEmpHrs += empHr;
		System.out.println("Days#: " + totalWorkingDays + " Emp Hr: " +empHr);
	}
	int totalEmpWage = totalEmpHrs * Wage_Per_Hour;
	System.out.println("Total Emp Wage: " + totalEmpWage);
	return totalEmpWage;
}
public static void main(String[] args) {
	computeEmpWage();
}
}