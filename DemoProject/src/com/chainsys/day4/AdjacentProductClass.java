package com.chainsys.day4;

import java.util.Scanner;

public class AdjacentProductClass {
	public void getAdjacentProd() {
		Scanner sn = new Scanner(System.in);
		int[] numbers;
		int product = 0;
		System.out.println("Enter number of number to find the product :");
		int n = sn.nextInt();
		numbers = new int[n];
		for(int i=0; i<n; i++) {
			System.out.println("Enter" + n + "numbers :");
			numbers[i] = sn.nextInt();
		}
		for(int i = 0; i<n-1; i++){
            if (numbers[i]*numbers[i+1]>product){
                product=numbers[i]*numbers[i+1]; 
            }
        }
		System.out.println("The maximum product: " + product);
	}
}
