package com.chainsys.day3.assignment3;

public class EvenDigitsClass {
	int digit = 0;
	
	//method for find the even digits of given number
	public void getEvenDigits(int n) {
		int num;
		while(n > 0) {
			num = n;
			num = n % 10;
			if(digit % 2 == 0) {
				System.out.println(num);
			}
			digit += 1;
			n = n / 10;
		}
	}
}
