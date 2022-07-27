package com.chainsys.day6.test;

import java.util.Scanner;

import com.chainsys.day6.Bank;

public class BankTest {
	public static void main(String args[]) {
		Bank bk = new Bank();
		
		Scanner sn = new Scanner(System.in);
		System.out.println("Select the bank name (A/B/C) :");
		String msg = sn.next();
		bk.getBalance(msg.toUpperCase());
	}
}
	