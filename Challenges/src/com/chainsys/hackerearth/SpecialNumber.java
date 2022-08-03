package com.chainsys.hackerearth;

import java.util.Scanner;

public class SpecialNumber {

	public Boolean sumOfDigit(int a) {
		int digit, sum = 0;
		while(a > 0)  
		{      
		digit = a % 10;    
		sum = sum + digit;    
		a = a / 10;  
		}  
		if(sum % 4 == 0) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	
	public static void main(String[] args) {
		SpecialNumber sp = new SpecialNumber();
		Scanner sn = new Scanner(System.in);
		int s = 0;
		System.out.println("Enter t :");
		int t = sn.nextInt();
		for(int i=0; i<t; i++) {
			String msg = "false";
			System.out.println("for loop");
			System.out.println("Enter a :");
			int a = sn.nextInt();
			System.out.println("getting");
			if(sp.sumOfDigit(a)) {
				System.out.println("if");
				s = a;
			}
			else {
				a += 1;
				while(msg.equals("false")) {
					System.out.println("While loop");
					if(sp.sumOfDigit(a)) {
						s = a;
						msg = "true";
					}
					else {
						a += 1;
					}
				}
			}
			System.out.println(s);
		}
	}

}
