package com.chainsys.day3;

import java.util.Scanner;

public class CabBookingSystem {
	Scanner sn = new Scanner(System.in);
	
	//Data members
	int noOfCab;
	String cabType;
	int distance;
	int total = 0;
	
	//method for displaying the Information of Cab
	public void InfoDisplay() {
		System.out.println("no. of Members \t\t\t\t Type of car \t\t\t\t Fare per km");
		System.out.println("3 to 5 \t\t\t\t\t mini Cab \t\t\t\t 100");
		System.out.println("more than 5 \t\t\t\t big Cab \t\t\t\t 150");
		getInfo();
	}
	
	//method for getting user information
	public void getInfo() {
		System.out.println("How many Cab you want :");
		noOfCab = sn.nextInt();
		System.out.println((noOfCab < 0) ? "Please enter valid number" : " ");
		
		for(int i=0; i < noOfCab; i++) {
			System.out.println("Enter Type of Cab :");
			String cabType = sn.next();
			if(cabType.equals("mini")) {
				miniCabFareCalculation();
			}
			else if(cabType.equals("big")) {
				bigCabFareCalculation();
			}
			else {
				System.out.println("Please only enter the car type as mini or big");
			}
		}
		System.out.println("Total Amount :" + total);
			
	}
	
	//method for calculate the fare for mini cab
	public void miniCabFareCalculation() {
		System.out.println("How many kilometers you want to go :");
		distance = sn.nextInt();
		if(distance <= 0) {
			System.out.println("Please enter valid number");
		}
		else {
			int amount = 100 * distance;
			total += amount;
			System.out.println("Amount :" + amount);
		}
	}
	
	//method for calculate the fare for big cab
	public void bigCabFareCalculation() {
		System.out.println("How many kilometers you want to go :");
		int distance = sn.nextInt();
		if(distance <= 0) {
			System.out.println("Please enter valid number");
		}
		else {
			int amount = 150 * distance;
			total += amount;
			System.out.println("Amount :" + amount);
		}	
	}
	
}
