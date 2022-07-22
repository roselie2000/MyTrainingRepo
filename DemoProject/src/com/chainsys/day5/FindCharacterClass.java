package com.chainsys.day5;

public class FindCharacterClass {
	String word = "roselie 2000";
	public int findVowels() {
		int count = 0;
		char vowels[] = {'a', 'e', 'i', 'o', 'u'};
		for(int i=0; i < word.length(); i++) {
			char c = word.charAt(i);
			for(int j=0; j < vowels.length; j++) {
				if(c == vowels[j]) {
					count += 1;
				}
			}
		}
		return count;
	}
	
	public int findDigits() {
		int count = 0;
		for(int i = 0; i < word.length(); i++) {
			if(Character.isDigit(word.charAt(i))) {
				count += 1;
			}
		}
		return count;
	}
	
	public int findSpace() {
		int count = 0;
		for(int i = 0; i < word.length(); i++) {
			if(Character.isWhitespace(word.charAt(i))) {
				count += 1;
			}
		}
		return count;
	}
	
	public int findConsonents() {
		int vowels = findVowels();
		int digits = findDigits();
		int space = findSpace();
		int conso = word.length() - (vowels + digits + space);
		return conso;
	}
}
