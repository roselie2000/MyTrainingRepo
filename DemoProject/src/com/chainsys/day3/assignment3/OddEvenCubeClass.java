package com.chainsys.day3.assignment3;

public class OddEvenCubeClass {
	public void displayOdd(int n) {
		System.out.println("Odd Numbers");
		for(int i=0; i<n; i++) {
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
	}
	
	public void displayEven(int n) {
		System.out.println("Even Numbers");
		for(int i=0; i<n; i++) {
			if(i%2 != 0) {
				System.out.println(i);
			}
		}
	}
	
	public void displayCube(int n) {
		System.out.println("Cube");
		System.out.println("Cube of" + n + " " + n*n*n);
	}
}
