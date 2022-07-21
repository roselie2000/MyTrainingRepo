package com.chainsys.day3.assignment3;

public class ExpressionEvalveClass {
	
	//method for solve the expression
	public void evaluate() {
		int result = 0;
		for(int i = 5; i <= 10; i++) {
			result =  2 * i * 2 + i + 5; 
			System.out.println("The solution of the Expression is "+ result);
		}
	}
}
