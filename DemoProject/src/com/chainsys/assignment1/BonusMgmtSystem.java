package com.chainsys.assignment1;

import java.util.Scanner;

public class BonusMgmtSystem {

	public static void main(String[] args) {
		int bonus = 0;
		Scanner sn = new Scanner(System.in);
		
		System.out.println("Enter your Salary :");
		int salary = sn.nextInt();
		
		System.out.println("Enter your Year of Service :");
		int service  = sn.nextInt();
		
		if(service > 5) {
			bonus = (salary * 5) / 100;
			System.out.println("Salary :" + salary);
			System.out.println("Year of Service :" + service);
			System.out.println("Bonus Amount :" + bonus);
		}
		else {
			System.out.println("Salary :" + salary);
			System.out.println("Year of Service :" + service);
			System.out.println("Bonus Amount :" + bonus);
		}
	}

}
