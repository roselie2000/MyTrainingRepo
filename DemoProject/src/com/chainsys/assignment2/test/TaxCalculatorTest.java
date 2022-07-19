package com.chainsys.assignment2.test;

import java.util.Scanner;

import com.chainsys.assignment2.TaxCalculator;

public class TaxCalculatorTest {
	public static void main(String args []) {
		TaxCalculator tc = new TaxCalculator();
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter your Gross Salary :");
		int grossSalary = sn.nextInt();
		System.out.println("Enter your Saving Amount :");
		int savings = sn.nextInt();
		tc.taxCalculator(grossSalary, savings);
	}
}
