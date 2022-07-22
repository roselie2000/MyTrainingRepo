package com.chainsys.day5;

import java.util.Arrays;

public class PalindromeClass {
	String word = "bob has a radar plane";
	
	StringBuilder temp = new StringBuilder();
	StringBuilder result = new StringBuilder();
	
	public void checkPalindrome() {
		int len;
		String[] sentence = word.split("\\s");
		System.out.println(Arrays.toString(sentence));
		
		for(int i=0; i < word.length() -2; i++) {
			StringBuilder temp = new StringBuilder();
			temp.append(sentence[i]);
			temp.reverse();
			if((temp.toString().equals(sentence[i]) && (temp.length() > 1))){
				System.out.println(sentence[i]);
				len = temp.length();
				for(int k = 0; k<len; k++) {
					result.append('*');
				}
				result.append(' ');
			}
			else {
				result.append(sentence[i]);
				result.append(' ');
			}
			System.out.println(result);
		}
		System.out.println(result);
		
	}
	
	
}
