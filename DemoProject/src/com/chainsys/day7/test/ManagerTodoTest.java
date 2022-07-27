package com.chainsys.day7.test;

import java.util.Scanner;

import com.chainsys.day7.HumanResources;
import com.chainsys.day7.Manager;
import com.chainsys.day7.ManagerTodoValidator;

public class ManagerTodoTest {

	public static void main(String[] args) {
		Manager tp = new Manager();
		ManagerTodoValidator tpv = new ManagerTodoValidator();
		HumanResources hr = new HumanResources();
		Scanner sn = new Scanner(System.in);
		
//		System.out.println("Enter your name :");
//		String name = sn.next();
//		String validName = tpv.nameValidation(name);
//		tp.setName(validName);
//		System.out.println(tp.getName());
//		
//		System.out.println("Enter your name :");
//		String user = sn.next();
//		String validUser = tpv.userNameValidation(user);
//		tp.setUserName(validUser);
//		System.out.println(tp.getUserName());
//		
//		System.out.println("Enter your name :");
//		String pwd = sn.next();
//		String validPwd = tpv.passwordValidation(pwd);
//		tp.setPassword(validPwd);
//		System.out.println(tp.getPassword());
		
		tp.task();
		tp.displayTask();
		hr.task();
		hr.displayTask();
		hr.display();

	}

}
