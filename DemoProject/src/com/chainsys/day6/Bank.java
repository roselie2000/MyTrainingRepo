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

	
	//method for display the balance of account in bankA
	public void bankA() {
		int balance = 1000;
		System.out.println("Your Available balance in bankA :" +balance);
		
	}
	
	//method for display the balance of account in bankB
	public void bankB() {
		int balance = 1500;
		System.out.println("Your Available balance in bankA :" + balance);
		
	}
	
	//method for display the balance of account in bankC
	public void bankC() {
		int balance = 2000;
		System.out.println("Your Available balance in bankA :" + balance);
	}
}
