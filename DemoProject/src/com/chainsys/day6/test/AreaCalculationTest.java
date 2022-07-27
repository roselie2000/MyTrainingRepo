package com.chainsys.day6.test;

import com.chainsys.day6.AreaCalculation;

public class AreaCalculationTest {

	public static void main(String[] args) {
		AreaCalculation ac = new AreaCalculation();//Object creation
		ac.getArea(10);// for square
		ac.getArea(10, 20);// for rectangle
	}

}
