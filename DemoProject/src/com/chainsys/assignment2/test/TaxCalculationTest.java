package com.chainsys.assignment2.test;

import java.util.Scanner;

import com.chainsys.assignment2.BookClass;
import com.chainsys.assignment2.TaxCalculator;

public class TaxCalculationTest {

	public static void main(String args []) {
		TaxCalculator tc = new TaxCalculator(); //Creating Object for BookClass Class
		
		Scanner sn = new Scanner(System.in);
		
		//Getting Gross Salary and Saving Amount
		System.out.println("Enter your Gross Salary :");
		int grossSalary = sn.nextInt();
		System.out.println("Enter your Saving Amount :");
		int savings = sn.nextInt();
		
		tc.taxCalculator(grossSalary, savings); //Calling taxCalculator method
	}
	
}
