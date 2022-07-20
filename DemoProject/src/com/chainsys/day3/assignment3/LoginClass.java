package com.chainsys.day3.assignment3;

import java.util.Scanner;

public class LoginClass {
	String userName = "Roselie";
	String password = "123chain";
	
	public void login() {
		
		Scanner sn = new Scanner(System.in);
		
		System.out.println("Enter username :");
		String user1 = sn.next();
		
		System.out.println("Enter password :");
		String pwd1 = sn.next();
		
		if((user1.equals(userName)) && (pwd1.equals(password))) {
			System.out.println("Logged in");
		}
		else {
			System.out.println("Invalid Credentials");
		}
	}
}
