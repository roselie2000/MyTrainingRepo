package com.chainsys.day3.assignment3.test;

import java.util.Scanner;

import com.chainsys.day3.assignment3.SumOfDigitsClass;

public class SumOfDigitsClassTest {
	public static void main(String args []) {
		SumOfDigitsClass sod = new SumOfDigitsClass();//Object Creation
		Scanner sn = new Scanner(System.in);
		
		//get a number to know which multiplication  want to display
		System.out.println("Enter a number :");
		int number = sn.nextInt();
		
		sod.sumOfDigits(number);// calling method
	}
}
