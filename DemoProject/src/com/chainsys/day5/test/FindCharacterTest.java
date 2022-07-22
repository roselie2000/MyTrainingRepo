package com.chainsys.day5.test;

import com.chainsys.day5.FindCharacterClass;

public class FindCharacterTest {
	public static void main(String args []) {
		FindCharacterClass fc = new FindCharacterClass();
		int vow = fc.findVowels();
		System.out.println(vow);
		int digits = fc.findDigits();
		System.out.println(digits);
		int space = fc.findSpace();
		System.out.println(space);
		int conso = fc.findConsonents();
		System.out.println(conso);
	}
}
