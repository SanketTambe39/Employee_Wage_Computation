package com.bridgelabz.employeewagecomputation;

public class EmployeeWageCalculate {

	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME=2;
	
	public void calculateWage(int workingDays,int wagePerHrs,int empHrsFull,int empHrsHalf, String companyName) 
	{
		int totalWage=0;
		int totalHrs=0;
		int empHrs=0;
		for (int i = 0; i < workingDays; i++) {

			double empCheck=Math.floor(Math.random() * 10) % 3;
			switch ((int) empCheck) {
			case IS_FULL_TIME:
					empHrs = empHrsFull;
					break;
			case IS_PART_TIME:
					empHrs = empHrsHalf;
					break;
			default:
					empHrs = 0;
			}

			totalHrs += empHrs;
			if(empCheck>=1) 
				totalWage = totalWage+wagePerHrs*empHrs;
		}	
		System.out.println("Employee got Wage :: "+totalWage+" by working "+totalHrs+" HRs & "+workingDays+" Days in "+companyName);
	}
	
}
