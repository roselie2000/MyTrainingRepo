package com.chainsys.day6.assignment6.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.chainsys.day6.assignment6.TodoApp;
import com.chainsys.day6.assignment6.TodoAppValidator;

public class TodoTest {

	public static void main(String args[]) {
		TodoApp tp = new TodoApp();//object creation for TodoApp class
		TodoAppValidator tpv = new TodoAppValidator();//object creation for TodoAppValidator class
		Scanner sn = new Scanner(System.in);
		
		//getting name from user
		System.out.println("Enter your name :");
		String name = sn.next();
		String validName = tpv.nameValidation(name);
		tp.setName(validName);
		System.out.println(tp.getName());
		
		//getting username from user
		System.out.println("Enter your username :");
		String user = sn.next();
		String validUser = tpv.userNameValidation(user);
		tp.setUserName(validUser);
		System.out.println(tp.getUserName());
		
		//getting password from user
		System.out.println("Enter your password :");
		String pwd = sn.next();
		String validPwd = tpv.passwordValidation(pwd);
		tp.setPassword(validPwd);
		System.out.println(tp.getPassword());
		
		//Add task 
		ArrayList<String> task = new ArrayList<String>();  
		System.out.println("Enter No of Tasks :");
        int n = sn.nextInt();
        for(int j=0;j<n;j++)
        {
            System.out.println("Enter the Task");
            task.add(sn.next());
        }
        
        //print the task
        System.out.println("The Tasks are :\n");
        System.out.println(task);
		
	}
}
