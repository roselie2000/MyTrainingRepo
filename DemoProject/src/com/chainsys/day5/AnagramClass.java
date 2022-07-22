package com.chainsys.day5;

import java.util.Arrays;

public class AnagramClass {
	
	public void checkAnagram(String word1, String word2) {
		if(word1.length() != word2.length()) {
			System.out.println("Both are not Anagram");
		}
		else {
			char[] wordArray1 = word1.toCharArray();
			char[] wordArray2 = word2.toCharArray();
			
			Arrays.sort(wordArray1);
			Arrays.sort(wordArray2);
			
			boolean msg = Arrays.equals(wordArray1, wordArray2);
			if(msg) {
				System.out.println("Both are Anagram");
			}
			else {
				System.out.println("Both are not Anagram");
			}
		}
		
	}
}
