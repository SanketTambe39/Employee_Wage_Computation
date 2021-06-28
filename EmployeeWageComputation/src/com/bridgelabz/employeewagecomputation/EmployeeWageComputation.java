package com.bridgelabz.employeewagecomputation;

public class EmployeeWageComputation {


	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME=2;
	
	
	public static void main(String[] args) {
		int WORKING_DAYS=0;
		int WAGE_PER_HOUR=20;
		int EMP_HRs=0;
		int TOTAL_WAGE=0;
		int TOTAL_HRs=0;
		
		while( WORKING_DAYS <20 && TOTAL_HRs<100   ) 
		{
			WORKING_DAYS++;
			double empCheck=Math.floor(Math.random() * 10) % 3;
	
			switch ((int) empCheck) {
			case IS_FULL_TIME:
					EMP_HRs=8;
					break;
			case IS_PART_TIME:
					EMP_HRs=4;
					break;
			default:
					EMP_HRs=0;
			}

			TOTAL_HRs+=EMP_HRs;
			if(empCheck>=1) 
				TOTAL_WAGE=TOTAL_WAGE+WAGE_PER_HOUR*EMP_HRs;
		}
		
		System.out.println("Employee got Wage :: "+TOTAL_WAGE+" by working "+TOTAL_HRs+" HRs & "+WORKING_DAYS+" Days");

	}
}
