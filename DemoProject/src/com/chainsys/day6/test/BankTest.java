package com.chainsys.day6.test;

import java.util.Scanner;

import com.chainsys.day6.Bank;

public class BankTest {
	public static void main(String args[]) {
		Bank bk = new Bank();//Object creation
		Scanner sn = new Scanner(System.in);
		
		//Get the Bank name
		System.out.println("Select the bank name (A/B/C) :");
		String msg = sn.next();
		bk.getBalance(msg.toUpperCase());//method calling
	}
}
	