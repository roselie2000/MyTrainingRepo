package com.chainsys.day5.test;

import java.util.Scanner;

import com.chainsys.day5.AnagramClass;

public class AnagramTest {
	public static void main(String args []) {
		AnagramClass ac = new AnagramClass();
		Scanner sn = new Scanner(System.in);
		
		System.out.println("Enter first word :");
		String word1 = sn.next();
		
		System.out.println("Enter second word :");
		String word2 = sn.next();
		ac.checkAnagram(word1, word2);
	}
}
