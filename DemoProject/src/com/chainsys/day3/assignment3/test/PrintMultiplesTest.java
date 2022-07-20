package com.chainsys.day3.assignment3.test;

import java.util.Scanner;

import com.chainsys.day3.assignment3.PrintMultiples;

public class PrintMultiplesTest {
	public static void main(String args []) {
		PrintMultiples pm = new PrintMultiples();
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter a number :");
		int number = sn.nextInt();
		pm.displayMultiples(number);
	}
}
