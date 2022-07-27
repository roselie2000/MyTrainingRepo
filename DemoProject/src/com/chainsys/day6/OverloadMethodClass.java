package com.chainsys.day6;

public class OverloadMethodClass {

	//Method with (int n, char c) parameter.
	public void display(int n, char c) {
		System.out.println("\n");
		System.out.println("Method display(int n, char c");
		System.out.println("Number :" + n);
		System.out.println("Character :" + c);
	}
	
	//Method with (char c, int n) parameter.
	public void display(char c, int n) {
		System.out.println("Method display(char c, int n)");
		System.out.println("Number :" + n);
		System.out.println("Character :" + c);
	}
}
