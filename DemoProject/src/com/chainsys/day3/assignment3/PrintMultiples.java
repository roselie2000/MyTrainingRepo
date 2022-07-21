package com.chainsys.day3.assignment3;

public class PrintMultiples {
	public void displayMultiples(int n) {
		
		for(int i=0; i<n; i++) {
			
			//Checking whether the number is divided by 3 and 5
			if((i % 3 == 0) && (i % 5 == 0)) {
				System.out.println("Fizz");
			}
			
			// Checking whether the number id divided by 3
			else if(i % 3 == 0) {
				System.out.println("Buzz");
			}
			
			//checking whether the number is divided by 5
			else if(i % 5 == 0) {
				System.out.println("FizzBuzz");
			}
			
			// print the number if it is not divided by 3 and 5
			else {
				System.out.println(i);
			}
		}
	}
}
