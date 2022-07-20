package com.chainsys.day3.assignment3.test;

import java.util.Scanner;

import com.chainsys.day3.assignment3.SumOfDigitsClass;

public class SumOfDigitsClassTest {
	public static void main(String args []) {
		SumOfDigitsClass sod = new SumOfDigitsClass();
		Scanner sn = new Scanner(System.in);
		
		System.out.println("Enter a number :");
		int number = sn.nextInt();
		sod.sumOfDigits(number);
	}
}
