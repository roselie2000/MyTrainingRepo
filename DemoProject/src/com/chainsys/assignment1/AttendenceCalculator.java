package com.chainsys.assignment1;

import java.util.Scanner;

public class AttendenceCalculator {

	public static void main(String[] args) {
		
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
		System.out.println(perAttend);
		
		//Check whether the percentage is greater than 75
		if (perAttend > 75) {
			System.out.println("You are eligible for attend the Examination");
		}
		else {
			System.out.println("You are not eligible for attend the Examination");
		}
	}
}
