package com.chainsys.day6;

public class Bank {
	
	public void getBalance(String bkName) {
		if(bkName.equals("A")) {
			bankA();
		}
		
		else if(bkName.equals("B")) {
			bankB();
		}
		
		else if(bkName.equals("C")) {
			bankC();
		}
	}

	public void bankA() {
		int balance = 1000;
		System.out.println("Your Available balance in bankA :" +balance);
		
	}
	
	public void bankB() {
		int balance = 1500;
		System.out.println("Your Available balance in bankA :" + balance);
		
	}
	
	public void bankC() {
		int balance = 2000;
		System.out.println("Your Available balance in bankA :" + balance);
	}
}
