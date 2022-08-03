package com.chainsys.hackerearth;

import java.util.Scanner;

public class specialNum {

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
	
	public static void main(String args[]) {
		Scanner sn = new Scanner(System.in);
		
	}
}
