package com.chainsys.day1.assignment1;

import java.util.Scanner;

public class BonusCalculation {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Salary");
		int salary=sc.nextInt();
		System.out.println("Enter Year of service");
		int experience=sc.nextInt();
		if(experience>5) {
			double bonus=salary*0.05;
			System.out.println("Net Bonus Amount :"+bonus);
		}

	}

}
