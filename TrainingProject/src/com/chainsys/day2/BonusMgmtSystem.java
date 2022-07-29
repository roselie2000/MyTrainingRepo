package com.chainsys.day2;

import java.util.Scanner;

public class BonusMgmtSystem {

	public static void main(String[] args) {
		int bonus = 0; //Variable to hold bonus value
		Scanner sn = new Scanner(System.in);
		
		//Getting Salary from the user
		System.out.println("Enter your Salary :");
		int salary = sn.nextInt();
		
		//Getting Year of Service from the user
		System.out.println("Enter your Year of Service :");
		int service  = sn.nextInt();
		
		//Check whether the user have 5 years experience.
		bonus = service >5 ? (salary * 5) / 100 : 0;
		System.out.println("Salary :" + salary);
		System.out.println("Service :" + service);
		
		switch (service) {
		case 1:
			System.out.println("Bonus :" + bonus);
			break;
		case 2:
			System.out.println("Bonus :" + bonus);
			break;
		case 3:
			System.out.println("Bonus :" + bonus);
			break;
		case 4:
			System.out.println("Bonus :" + bonus);
			break;
		case 5:
			System.out.println("Bonus :" + bonus);
			break;
		default:
			bonus = service >5 ? (salary * 5) / 100 : 0;
			System.out.println("Bonus :" + bonus);
		}
	}
}