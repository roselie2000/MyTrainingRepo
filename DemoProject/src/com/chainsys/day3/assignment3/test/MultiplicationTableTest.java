package com.chainsys.day3.assignment3.test;

import java.util.Scanner;

import com.chainsys.day3.assignment3.MultiplicationTableClass;

public class MultiplicationTableTest {
	public static void main(String args []) {
		MultiplicationTableClass mt = new MultiplicationTableClass();//Object Creation
		Scanner sn = new Scanner(System.in);
		
		
		System.out.println("Enter a number : ");//get a number to know which multiplication  want to display
		int number = sn.nextInt();
		
		
		System.out.println("Enter a number (for level of the table) : ");//get a number to know how long the table want to print
		int level = sn.nextInt();
		
		
		mt.printTable(number, level);// calling the printTable method
	}
}
