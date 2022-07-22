package com.chainsys.day5;

public class ReverseStringClass {

	public void reverseString(String word) {
		StringBuilder newWord = new StringBuilder();
		newWord.append(word);
		newWord.reverse();
		System.out.println(newWord);
	}
}
