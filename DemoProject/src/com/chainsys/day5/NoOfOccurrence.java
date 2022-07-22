package com.chainsys.day5;

public class NoOfOccurrence {
	String word = "google";
	int count1 = 0;
	
	public void findMaxOccurrence() {
		char temp;
		for(int i=0; i < word.length(); i++) {
			int count = 0;
			temp = word.charAt(i);
			System.out.println(temp);
			for(int j=0; j < word.length(); j++) {
				if(word.charAt(j) == temp) {
					count += 1;
				}
				
			}
			if(count > count1) {
				count1 = count;
				System.out.println(count1);
			}
		}
	}
}
