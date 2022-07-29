package com.chainsys.day4;

import java.util.Scanner;

public class AcendSequenceClass {
	Scanner sn = new Scanner(System.in);
	int[] numbers;
	int count=1;
	
	public void findAcendingSeq() {
		
		int tempn = 0;
		System.out.println("Enter the number of elements :");
		int n = sn.nextInt();
		numbers = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("Enter" + n + "numbers :");
			numbers[i] = sn.nextInt();
		}
		for(int i=0; i<n-1; i++) {
			if(numbers[i] < numbers[i+1]) {
				count += 1;
				System.out.println(numbers[i]+" "+numbers[i+1]);
				
			}
		}
		System.out.println("The max value is : " + count);
	}
}
