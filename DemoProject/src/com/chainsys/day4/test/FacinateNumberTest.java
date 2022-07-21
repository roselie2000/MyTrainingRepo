package com.chainsys.day4.test;

import com.chainsys.day4.FacinateNumber;

public class FacinateNumberTest {
	public static void main(String args []) {
		FacinateNumber fn = new FacinateNumber();
		String number = fn.getNumber();
		fn.checkFacNumber(number);
	}
}
