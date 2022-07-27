package com.chainsys.day6.assignment6.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.chainsys.day6.assignment6.TodoApp;
import com.chainsys.day6.assignment6.TodoAppValidator;

public class TodoTest {

	public static void main(String args[]) {
		TodoApp tp = new TodoApp();
		TodoAppValidator tpv = new TodoAppValidator();
		Scanner sn = new Scanner(System.in);
		
		System.out.println("Enter your name :");
		String name = sn.next();
		String validName = tpv.nameValidation(name);
		tp.setName(validName);
		System.out.println(tp.getName());
		
		System.out.println("Enter your name :");
		String user = sn.next();
		String validUser = tpv.userNameValidation(user);
		tp.setUserName(validUser);
		System.out.println(tp.getUserName());
		
		System.out.println("Enter your name :");
		String pwd = sn.next();
		String validPwd = tpv.passwordValidation(pwd);
		tp.setPassword(validPwd);
		System.out.println(tp.getPassword());
		
		ArrayList<String> task = new ArrayList<String>();  
		System.out.println("Enter No of Tasks :");
        int n = sn.nextInt();
        for(int j=0;j<n;j++)
        {
            System.out.println("Enter the Task");
            task.add(sn.next());
        }
        
        System.out.println("The Tasks are :\n");
        System.out.println(task);
		
	}
}
