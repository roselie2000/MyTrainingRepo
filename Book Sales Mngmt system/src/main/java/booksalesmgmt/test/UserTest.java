package booksalesmgmt.test;

import java.util.Scanner;

import booksalesmgmt.Validator;
import booksalesmgmt.user.User;
import booksalesmgmt.user.Userdb;

public class UserTest {

	private static Scanner sn;

	public static void main(String[] args) {
		User us = new User();
		Userdb udb = new Userdb();
		Validator vd = new Validator();
		sn = new Scanner(System.in);
		System.out.println("Enter 's' for sign up");
		System.out.println("Enter 'l' for login");
		System.out.println("Enter 'lo' for logout");
		String msg = sn.next();
		if(msg.equals("s")) {
			System.out.println("Enter your name :");
			String name = sn.next();
			if(vd.checkName(name)) {
				us.setName(name);//set name
				System.out.println("Enter your username :");
				String uname = sn.next();
				if(vd.checkUserName(uname, name)) {
					us.setUserName(uname);//set user name
					System.out.println("Enter the password :");
					String password = sn.next();
					if(vd.checkPwd(password, uname)) {
						us.setPassword(password);//set password
						System.out.println("Enter your email id :");
						String email = sn.next();
						if(vd.checkEmail(email));{
							us.setEmail(email);//set email
							System.out.println("Enter your door no. :");
							String no = sn.next();
							if(vd.checkDoorno(no)) {
								us.setDoorno(no);//set door no
								System.out.println("Enter your city or village :");
								String city = sn.next();
								if(vd.checkAddr(city)) {
									us.setCity(city);//set city
									System.out.println("Enter your district :");
									String dist = sn.next();
									if(vd.checkAddr(dist)) {
										us.setDistrict(dist);//set district
										System.out.println("Enter your state :");
										String state = sn.next();
										if(vd.checkAddr(state)) {
											us.setState(state);//set state
											udb.signUp(us);//call signUp method
										}
									}	
								}
							}
						}
					}
				}
			}			
		}
		else if(msg.equals("l")) {
			System.out.println("Enter your username :");
			String name = sn.next();
			
			System.out.println("Enter the password :");
			String pwd = sn.next();
			
			udb.login(name, pwd);//call login method
		}
		else if(msg.equals("lo")) {
			System.out.println("Enter your userId :");
			int userId = sn.nextInt();
			if(vd.checkUserId(userId)) {
				udb.logout(userId);//call the logout method
			}
			
		}
		else {
			System.out.println("Please!, enter a valid choice");
		}
	}

}
