package com.chainsys.assignment2.test;

import com.chainsys.assignment2.ArithmeticOperation;

public class ArithmeticOperationTest {
		public static void main(String args []) {
			ArithmeticOperation aop = new ArithmeticOperation();//Creating object for ArithmeticOperation class
			aop.equal(2); //Calling equal method
			aop.notEqual(2); //Calling notequal method
			aop.andOperation(2,5); //Calling andOperation method
			aop.orOperation(2,0); //Calling orOperation method
			aop.comparision(0);	//Calling equal method
}
}