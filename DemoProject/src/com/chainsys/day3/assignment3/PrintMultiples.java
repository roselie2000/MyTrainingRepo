package com.chainsys.day3.assignment3;

public class PrintMultiples {
	public void displayMultiples(int n) {
		for(int i=0; i<n; i++) {
			if((i % 3 == 0) && (i % 5 == 0)) {
				System.out.println("Fizz");
			}
			else if(i % 3 == 0) {
				System.out.println("Buzz");
			}
			else if(i % 5 == 0) {
				System.out.println("FizzBuzz");
			}
			else {
				System.out.println(i);
			}
		}
	}
}
