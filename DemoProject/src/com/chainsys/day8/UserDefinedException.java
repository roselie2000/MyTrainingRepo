package com.chainsys.day8;

public class UserDefinedException extends Exception{
	
	String message = "Here is an exception";
	public UserDefinedException(String s) {
		super(s);
		System.out.println(message);
		
	}
}
