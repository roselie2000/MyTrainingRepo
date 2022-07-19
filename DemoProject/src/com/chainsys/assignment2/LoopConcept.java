package com.chainsys.assignment2;

import java.util.Scanner;

public class LoopConcept {
	public static void main(String args []) {
		System.out.println("For Loop");
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println("While Loop");
		int sum = 100;
		while(sum > 0) {
			sum -= 20;
			System.out.println(sum);
		}
		System.out.println("Do While Loop");
		int num = 10;
		do {
			num -= 1;
			System.out.println(num);
		}while(num > 0);
	}
}
