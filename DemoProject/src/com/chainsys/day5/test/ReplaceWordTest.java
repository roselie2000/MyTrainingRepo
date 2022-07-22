package com.chainsys.day5.test;

import java.util.Scanner;

import com.chainsys.day5.ReplaceWordClass;

public class ReplaceWordTest {
	public static void main(String args[]) {
		ReplaceWordClass rw = new ReplaceWordClass();
		
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter a sentence :");
		String sentence = sn.nextLine();
		
		System.out.println("Enter which character sequence want to change :");
		String oldWord = sn.next();
		
		System.out.println("Enter new character sequence :");
		String newWord = sn.next();
		
		rw.replaceWord(sentence, oldWord, newWord);
	}
}
