package com.bridgelabz.employeewagecomputation;

public class EmployeeWageComputation {
	
	public static void main(String[] args) {

		EmployeeWageCalculate employeeWageCalculate = new EmployeeWageCalculate();
		employeeWageCalculate.calculateWage(20, 40, 8, 4, "Bridgelabz");
		employeeWageCalculate.calculateWage(30, 50, 9, 4, "EC-Mobility");
		employeeWageCalculate.calculateWage(24, 30, 7, 4, "Mphasis");
		employeeWageCalculate.calculateWage(28, 60, 5, 2, "Four Piller");
	}
	
}
