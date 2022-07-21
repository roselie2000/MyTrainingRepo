package com.chainsys.day3.assignment3;

import java.util.Scanner;

public class LoginClass {
	String userName = "Roselie";
	String password = "123chain";
	
	public void login() {
		
		Scanner sn = new Scanner(System.in);
		
		//Get user name from the user
		System.out.println("Enter username :");
		String user1 = sn.next();
		
		//Getting password form the user
		System.out.println("Enter password :");
		String pwd1 = sn.next();
		
		//Validation
		if((user1.equals(userName)) && (pwd1.equals(password))) {
			System.out.println("Logged in");
		}
		else {
			System.out.println("Invalid Credentials");
		}
	}
}
