package com.chainsys.assignment2;

import java.util.Scanner;

public class PlaceOfService {
	Scanner sn = new Scanner(System.in);
	
	public String getInfo() {
		System.out.println("Enter your Age :");
		int age = sn.nextInt();
		
		System.out.println("Enter your Sex (M / F):");
		String sex = sn.next();
		
		System.out.println("Enter your Marital Status (if yes then enter 'y' otherwise enter 'n'");
		String maritalStatus = sn.next();
		
		String result = displayServicePlace(age, sex, maritalStatus);
		return result;
	}
	
	public String displayServicePlace(int age, String sex, String maritalStatus) {
		switch (sex) {
		case "F":
			return "Urban Areas";
		case "M":
			if ((age >= 20) && (age <= 40)) {
				return "Anywhere";
			}
			else if ((age >= 40) && (age <= 60)) {
				return "Urban Areas";
			}
		default: 
			return "ERROR";
		}
	}
}

