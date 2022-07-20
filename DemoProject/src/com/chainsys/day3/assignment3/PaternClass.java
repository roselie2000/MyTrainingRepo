package com.chainsys.day3.assignment3;

public class PaternClass {
	public void getTriangle() {
		for(int i=0; i<5; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println("\n");
		}
	}
	
	public void getDiamond() {
	
	}
	
	public void getNumberPattern() {
		for(int i=0; i<5; i++) {
			for(int j=0; j>=1; j--) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
