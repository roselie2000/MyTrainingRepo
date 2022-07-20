package com.chainsys.assignment2;

import java.util.Scanner;

public class PlaceOfService {
	Scanner sn = new Scanner(System.in);
	
	//Get all Information from the user
	public String getInfo() {
		System.out.println("Enter your Age :");// Getting Age
		int age = sn.nextInt();
		
		System.out.println("Enter your Sex (M / F):");// Getting Sex
		String sex = sn.next();
		
		System.out.println("Enter your Marital Status (if yes then enter 'y' otherwise enter 'n'");// Getting Martial Status
		String martialStatus = sn.next();
		
		String result = displayServicePlace(age, sex, martialStatus);// calling displayServicePlace function
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

