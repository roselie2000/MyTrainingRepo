package com.chainsys.day3.assignment3;

public class LoginClass {
	String userName = "Roselie";
	String password = "123chain";
	
	public void login(String user, String pwd) {
		if((user.equals(user)) && (pwd.equals(pwd))) {
			System.out.println("Logged in");
		}
		else {
			System.out.println("Invalid Credentials");
		}
	}
}
