package com.chainsys.day2;

import java.util.Scanner;

public class AttendanceCalculator {
	
	public static void main(String[]args) {

		double perAttend; //Variable for hold the Percentage of Attendance.
				
		Scanner sn = new Scanner(System.in);
				
		//Getting no. of held classes 
		System.out.println("Number of Helded Classes :");
		double heldClasses = sn.nextInt();
				
		//Getting no. of attend classes
		System.out.println("Number of Attended Classes :");
		double attendClasses = sn.nextInt();
				
		//Calculation of percentage of attend classes
		perAttend = (attendClasses / heldClasses)*100;
		System.out.println("Percentage of Attended Classes :" + perAttend);
				
		//Check whether the percentage is greater than 75
		String msg = perAttend > 75 ? "You are eligible for attend the Examination" : "You are not eligible for attend the Examination";
		
		System.out.println(msg);
	}
}