package com.bridgelabz.employeewagecomputation;

public class EmployeeWageComputation {

	public static final int isPresent = 1;
	
	public static void main(String[] args) {
		  
        double empCheck = Math.floor(Math.random() * 10 ) % 2;
        
        if (empCheck == isPresent)
        {
        	System.out.println("Employee is Present");
        }
        else
        {
        	System.out.println("Employee is Absent");
        }

	}

}
