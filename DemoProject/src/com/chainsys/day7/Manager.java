package com.chainsys.day7;

import java.util.Arrays;
import java.util.Scanner;

public class Manager{
	public String branch = "Ayanambakam";
	public String task[];
	private String name;
	private String username;
	private String password;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getUserName() {
		return username;
	}
	
	public void setUserName(String username) {
		this.username = username;
	}
	
	public String getPassword(){
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
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
	
	public void task() {
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter No of Tasks");
        int n = sn.nextInt();
        task = new String[n];
        for(int j=0;j<n;j++)
        {
            System.out.println("Enter the Task");
            task[j]=sn.next();
            
        }
        
	}
	
	@Override
	public String toString() {
		return "Manager [branch=" + branch + ", task=" + Arrays.toString(task) + ", name=" + name + ", username="
				+ username + ", password=" + password + "]";
	}

	public void displayTask() {
		System.out.println(branch);
		System.out.println("The task assign by Manager from Ayanambakam branch to Madurai");
		for (String values : task) {
            System.out.println(values);
        }
		System.out.println("*******************************************************************");
	}
	
}
