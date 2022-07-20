package com.chainsys.day3.assignment3;

import java.util.Scanner;

public class AverageProductClass {
	char msg = 'a';
	int sum = 0;
	int count = 0;
	int product = 1;
	public void getNumber() {
		
		Scanner sn = new Scanner(System.in);
		
		while(msg != 'q') {
			System.out.println("Enter a number :");
			int number = sn.nextInt();
			sum += number;
			count += 1;
			product *= number;
			System.out.println("if you want to quite enter 'q'");
			msg = sn.next().charAt(0);
			}
			getAverage();
			System.out.println("Product :" + product);
		}
	
	public void getAverage() {
		int average = sum/count;
		System.out.println("Average :" +average);
		
	}
}
