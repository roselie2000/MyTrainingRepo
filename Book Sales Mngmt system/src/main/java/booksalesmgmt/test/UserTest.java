package booksalesmgmt.test;

import java.util.Scanner;

import booksalesmgmt.user.User;
import booksalesmgmt.user.Userdb;

public class UserTest {

	public static void main(String[] args) {
		User us = new User();
		Userdb udb = new Userdb();
		Scanner sn = new Scanner(System.in);
//		System.out.println("Enter your name :");
//		String name = sn.next();
//		us.setName(name);
		
//		System.out.println("Enter your username :");
//		String uname = sn.next();
//		us.setUserName(uname);
//		
//		System.out.println("Enter the password :");
//		String password = sn.next();
//		us.setPassword(password);
//		
//		System.out.println("Enter your email id :");
//		String email = sn.next();
//		us.setEmail(email);
//		
//		System.out.println("Enter your door no. :");
//		String no = sn.next();
//		us.setDoorno(no);
//
//		System.out.println("Enter your city or village :");
//		String city = sn.next();
//		us.setCity(city);
//		
//		System.out.println("Enter your district :");
//		String dist = sn.next();
//		us.setDistrict(dist);
//		
//		System.out.println("Enter your state :");
//		String state = sn.next();
//		us.setState(state);
//		
//		udb.signUp(us);
		
		System.out.println("Enter your username :");
		String name = sn.next();
		
		System.out.println("Enter the password :");
		String pwd = sn.next();
		
		udb.login(name, pwd);
	}

}
