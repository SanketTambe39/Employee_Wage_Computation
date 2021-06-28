package com.bridgelabz.employeewagecomputation;

public class EmployeeWageCalculate {

	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME=2;
	
	public void calculateWage(int totalWage,int totalHrs,int workingDays,int wagePerHrs,int empHrs) {
		while( workingDays <20 && totalHrs<100   ) 
		{
			workingDays++;
			double empCheck=Math.floor(Math.random() * 10) % 3;
	
			switch ((int) empCheck) {
			case IS_FULL_TIME:
					empHrs=8;
					break;
			case IS_PART_TIME:
					empHrs=4;
					break;
			default:
					empHrs=0;
			}

			totalHrs+=empHrs;
			if(empCheck>=1) 
				totalWage=totalWage+wagePerHrs*empHrs;
		}
		
		System.out.println("Employee got Wage :: "+totalWage+" by working "+totalHrs+" HRs & "+workingDays+" Days");
	}
	
}
