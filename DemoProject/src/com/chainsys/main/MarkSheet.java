package com.chainsys.main;

import java.util.Scanner;

public class MarkSheet {

	public static void main(String[] args) {
		int sum = 0;
		int mark1;
		int mark2;
		int mark3;
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter Mark1:");
		
		mark1 = sn.nextInt();
		if((mark1 > 0) && (mark1 < 100)) {
			sum += mark1;
			
			System.out.println("Enter Mark2: ");
			mark2 = sn.nextInt();
			if((mark2 > 0) && (mark2 < 100)) {
				sum += mark2;
				System.out.println("Enter Mark3: ");
				mark3 = sn.nextInt();
				if((mark3 > 0) && (mark3 < 100)) {
					sum += mark3;
					System.out.println("Mark1:" + mark1);
					System.out.println("Mark2 :" + mark2);
					System.out.println("Mark3 :" + mark3);
					System.out.println("Total: "+ sum);
					int avg = sum/3;
					System.out.println("Average: " + avg);
					System.out.println(mark1 > mark2);
					if (avg > 90) {
						System.out.println("Grade A");
					}
					else if((avg < 90) && (avg > 80)) {
						System.out.println("Grade B");
					}
					else if((avg < 80) && (avg > 70)) {
						System.out.println("Grade C");
					}
					else if((avg < 70) && (avg > 60)) {
						System.out.println("Grade D");
					}
					else if((avg < 60) && (avg > 50)) {
						System.out.println("Grade E");
					}
					else if(avg < 50){
						System.out.println("Unfortunately you are fail in this exam");
					}
				}
				else {
					System.out.println("The Mark3 should be greater than 0 and less than or equal to 100");
				}
			}
			else {
				System.out.println("The Mark2 should be greater than 0 and less than or equal to 100");
			}
			
	}
		else {
			System.out.println("The Mark1 should be greater than 0 and less than or equal to 100");
		}
	
}
}