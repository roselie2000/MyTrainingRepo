package com.chainsys.hackerearth;

import java.util.Scanner;

public class DigitCube {

	//Partially solved
	public void fun(int n, int k) {
		if(k > 0) {
			int digit, sum = 0;
			while(n > 0)  
			{      
			digit = n % 10;    
			sum = sum + digit;
			n = n / 10;  
			}
			n = sum * sum * sum;
			k -= 1;
			fun(n, k);
		}
		else {
			System.out.println(n);;
		}
		
	}
	public static void main(String[] args) {
		DigitCube dc = new DigitCube();
		Scanner sn = new Scanner(System.in);
		System.out.println("ENter t :");
		int t = sn.nextInt();
		
		for(int i=0; i<t; i++) {
			System.out.println("Enter n :");
			int n = sn.nextInt();
			System.out.println("Enter k :");
			int k = sn.nextInt();
			dc.fun(n, k);
		}

	}

}
