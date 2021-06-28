package com.bridgelabz.employeewagecomputation;

public class EmployeeWageComputation {
	
	public static void main(String[] args) {

		int totalWage=0;
		int totalHrs=0;
		int workingDays=0;
		int wagePerHrs=20;
		int empHrs=0;
		
		EmployeeWageCalculate employeeWageCalculate = new EmployeeWageCalculate();
		employeeWageCalculate.calculateWage(totalWage, totalHrs, workingDays, wagePerHrs, empHrs);
		
	}
	
}
