package com.chainsys.assignment1;

import java.util.Scanner;

public class AttendenceCalculator {

	public static void main(String[] args) {
		
		double perAttend;
		
		Scanner sn = new Scanner(System.in);
		
		System.out.println("Number of Helded Classes :");
		double heldClasses = sn.nextInt();
		
		System.out.println("Number of Attended Classes :");
		double attendClasses = sn.nextInt();
		
		perAttend = (attendClasses / heldClasses)*100;
		System.out.println(perAttend);
		
		if (perAttend > 75) {
			System.out.println("You are eligible for attend the Examination");
		}
		else {
			System.out.println("You are not eligible for attend the Examination");
		}
	}
}
