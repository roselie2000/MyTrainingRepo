package com.chainsys.day3.assignment3;

import java.util.Scanner;

public class AverageProductClass {
	//Data members
	char msg = 'a';
	int sum = 0;
	int count = 0;
	int product = 1;
	
	// method for getting a number for calculation from the user
	public void getNumber() {
		
		Scanner sn = new Scanner(System.in);
		
		while(msg != 'q') {
			System.out.println("Enter a number :");
			int number = sn.nextInt();
			
			sum += number; //add each given number
			count += 1; //count how many numbers are given
			product *= number; // multiple each given numbers
			
			System.out.println("if you want to quite enter 'q'");//Ask the user whether quite the process
			msg = sn.next().charAt(0);
			}
			getAverage();//Calling the getAverage method for get the average of the given numbers
			System.out.println("Product :" + product);
		}
	
	
	// method for calculate the Average
	public void getAverage() {
		int average = sum/count;
		System.out.println("Average :" +average);
		
	}
}
