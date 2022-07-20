package com.chainsys.day3.assignment3;

public class SumOfDigitsClass {
	int sum = 0;
	public void sumOfDigits(int n) {
		int num;
		while(n > 0) {
			num = n;
			num = n % 10;
			sum += num;
			n = n / 10;
		}
		System.out.println(sum);
	}
	
}
