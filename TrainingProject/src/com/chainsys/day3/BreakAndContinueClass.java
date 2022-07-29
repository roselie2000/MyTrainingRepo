package com.chainsys.day3;

public class BreakAndContinueClass {
	public void displayNumbers() {
		for(int i=0;i<10;i++) {
			if(i == 3) {
				continue; //Continue statement skip print 3
			}
			else if(i == 5) {
				break; //break skip the entire remaining loop
			}
			else {
				System.out.println(i);
			}
		}
		
	}
	
}

