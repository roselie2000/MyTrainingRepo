package com.chainsys.assignment2.test;

import com.chainsys.assignment2.ArithmeticOperation;

public class ArithmeticOperationTest {
	public static void main(String args []) {
		ArithmeticOperation aop = new ArithmeticOperation();
		aop.equal(2);
		aop.notequal(2);
		aop.andOperation(2,5);
		aop.orOperation(2,0);
		aop.Comparision(0);		
	}
}
