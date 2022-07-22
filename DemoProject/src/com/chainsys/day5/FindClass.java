package com.chainsys.day5;

import java.util.Scanner;

public class FindClass {
	public void findE() {
		String word = "Umbrella";
		System.out.println("presence of 'e' in umbrella");
		System.out.println(word.contains("e"));
	}
	
	public void findOrange() {
		String sentence = "This is orange juice";
		System.out.println("presence of 'orange' in 'This is orange juice'");
		System.out.println(sentence.contains("orange"));
	}
	
	public void findOccurrence() {
		String sentence = "There are orange juice, apple juice and orange juice";
		System.out.println("Occurrence of 'o' and ','");
		if(sentence.indexOf('o') < 0) {
			System.out.println("o is not present in the sentence");
		}
		else {
			System.out.println(sentence.indexOf('o'));
			System.out.println(sentence.lastIndexOf('o'));
		}
		if(sentence.indexOf(',') < 0) {
			System.out.println(", is not present in the sentence");
		}
		else {
			System.out.println("occurence of ','" + sentence.lastIndexOf(','));
		}
		
	}
	
	public void trimName() {
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter your name :");
		String name = sn.nextLine();
		String[] words=name.split("\\s");
		if(words.length != 3) {
			System.out.println("Please enter your firstname, middlename and lastname with spaces");
		}
		else {
			System.out.println(words[0].charAt(0) + "." + words[1].charAt(0) + "." + words[2]);
		}
		}
}
