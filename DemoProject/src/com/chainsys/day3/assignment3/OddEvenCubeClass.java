package com.chainsys.day3.assignment3;

public class OddEvenCubeClass {
	
	//Method for print odd numbers
	public void displayOdd(int n) {
		System.out.println("Odd Numbers");
		for(int i=0; i<n; i++) {
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
	}
	
	//Methods for print even numbers
	public void displayEven(int n) {
		System.out.println("Even Numbers");
		for(int i=0; i<n; i++) {
			if(i%2 != 0) {
				System.out.println(i);
			}
		}
	}
	
	//Method for print the cube of the given number
	public void displayCube(int n) {
		System.out.println("Cube");
		System.out.println("Cube of" + n + " " + n*n*n);
	}
}
