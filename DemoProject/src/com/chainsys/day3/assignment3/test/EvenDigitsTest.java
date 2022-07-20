package com.chainsys.day3.assignment3.test;

import java.util.Scanner;

import com.chainsys.day3.assignment3.EvenDigitsClass;

public class EvenDigitsTest {

	public static void main(String[] args) {
		EvenDigitsClass ed = new EvenDigitsClass();
		Scanner sn = new Scanner(System.in);
		
		System.out.println("Enter a number :");
		int number = sn.nextInt();
		ed.evenDigits(number);

	}

}
