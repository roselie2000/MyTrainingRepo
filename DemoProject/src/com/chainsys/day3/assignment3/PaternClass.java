package com.chainsys.day3.assignment3;

public class PaternClass {
	
	//Method for print the triangle pattern
	public void getTriangle() {
		for(int i=0; i<5; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println("\n");
		}
	}
	
	//Method for print the diamond pattern
	public void getDiamond() {
		int n, i, j, k;
        n = 5;
        for (i = 0; i < n; i++) {
            for (k = n - i; k >= 1; k--) {
                System.out.print(" ");
            }
            for (j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (i = 0; i <= n - 1; i++) {
            for (j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (k = 0; k <= n - (i + 1); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
	}
}
