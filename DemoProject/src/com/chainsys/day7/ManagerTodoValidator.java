package com.chainsys.day7;

public class ManagerTodoValidator {

	public String nameValidation(String name) {
		String nameCondition = "^[a-zA-Z\\s]+";
		
		if(name.isEmpty()) {
			System.out.println("Please enter a valid name. The name should not be empty.");
		}
		else if(!(name.matches(nameCondition))) {
			System.out.println("The should be only in Alphabets");
		}
		
		else if(!(name.trim().length() > 3)) {
			System.out.println("Please enter a valid human name.");
		}
		else {
			return name;
		}
		return null;
	}
	
	public String userNameValidation(String username) {
		if(username.isEmpty()) {
			System.out.println("Please!, enter a valid username");
		}
		else if(username.trim().length() < 5){
			System.out.println("The username should be more than five letters ");
		}
		else {
			System.out.println("Valid username");
			return username;
		}
		return null;
	}
	
	public String passwordValidation(String password) {
		
		String pwdCondition = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}";
		if(password.isEmpty()) {
			System.out.println("Please!, enter a valid password");
		}
		else if(!(password.matches(pwdCondition))) {
			System.out.println("The should be more than 8 characters. \n Its should have numbers, special characters, Capitalised letter.");
		}
		else {
			System.out.println("Valid Password");
			return password;
		}
		return null;
	}
}
