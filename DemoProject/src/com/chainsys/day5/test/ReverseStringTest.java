package com.chainsys.day5.test;

import java.util.Scanner;

import com.chainsys.day5.ReverseStringClass;

public class ReverseStringTest {
	public static void main(String args []) {
		ReverseStringClass rs = new ReverseStringClass();
		
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter a word for reverse :");
		String word = sn.next();
		rs.reverseString(word);
		
	}
}
