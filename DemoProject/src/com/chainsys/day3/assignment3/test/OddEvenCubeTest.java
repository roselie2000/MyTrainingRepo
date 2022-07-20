package com.chainsys.day3.assignment3.test;

import java.util.Scanner;

import com.chainsys.day3.assignment3.OddEvenCubeClass;

public class OddEvenCubeTest {
	public static void main(String args[]) {
		OddEvenCubeClass oec = new OddEvenCubeClass();
		Scanner sn = new Scanner(System.in);
		int number;

		System.out.println("Enter a number : ");
		number = sn.nextInt();

		oec.displayOdd(number);
		oec.displayEven(number);
		oec.displayCube(number);
	}
}
