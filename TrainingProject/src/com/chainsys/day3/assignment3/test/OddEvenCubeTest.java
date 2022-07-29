package com.chainsys.day3.assignment3.test;

import java.util.Scanner;

import com.chainsys.day3.assignment3.OddEvenCubeClass;

public class OddEvenCubeTest {
	public static void main(String args[]) {
		OddEvenCubeClass oec = new OddEvenCubeClass();//Object Creation
		Scanner sn = new Scanner(System.in);
		int number;

		//get a number to know which multiplication  want to display
		System.out.println("Enter a number : ");
		number = sn.nextInt();

		oec.displayOdd(number);// calling method
		oec.displayEven(number);// calling method
		oec.displayCube(number);// calling method
	}
}
