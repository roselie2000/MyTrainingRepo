package com.chainsys.assignment2;

import java.util.Scanner;

public class Attendance {
	
	public void percentageCalc(double helded, double attended) {
		
		double perAttend; //Variable for hold the Percentage of Attendance.
	
		//Calculation of percentage of attend classes
		perAttend = (attended / helded)*100;
		System.out.println(perAttend);
	
		//Check the eligibility
		if (perAttend > 75) {
			System.out.println("You are eligible for attend the Examination");
		}
		else {
			Scanner sn = new Scanner(System.in);
			
			System.out.println("Any Medical causes (for yes enter 'y' and for no enter 'n')  :");
			char mediCauses = sn.next().charAt(0);
			
			if (mediCauses == 'y') { 
				System.out.println("You are eligible for attend the Examination"); //if the user has medical causes then print eligible
			}
			else {
				System.out.println("You are not eligible for attend the Examination"); //if the user not has medical causes then print eligible
			}
		}
}
}
