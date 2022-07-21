package com.chainsys.day4.test;

import com.chainsys.day4.FacinateNumber;

public class FacinateNumberTest {
	public static void main(String args []) {
		FacinateNumber fn = new FacinateNumber();//Object creation
		String number = fn.getNumber();//calling getNumber method
		fn.checkFacNumber(number);//calling checkFacNumber method
	}
}
