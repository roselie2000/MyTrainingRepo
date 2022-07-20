package com.chainsys.day3;

import java.util.Scanner;

public class MarkSheet {
	Scanner sn = new Scanner(System.in);
	
	//method for increment the mark
	public void markIncrement() {
		System.out.println("Enter your mark :");
		int mark = sn.nextInt();
		System.out.println("Are you add mark for extra curricular activities (y/n) :");
		String msg = sn.next();
		if(msg.equals("y")) {
			System.out.println(mark++);
			System.out.println(++mark);
		}
		else {
			System.out.println(mark);
		}
	}
	
	//method for decrement the mark
	public void markDecrement() {
		System.out.println("Enter your mark :");
		int mark = sn.nextInt();
		System.out.println("Are you reduce mark for worst hand writting activities (y/n) :");
		String msg = sn.next();
		if(msg.equals("y")) {
			System.out.println(mark--);
			System.out.println(--mark);
		}
		else {
			System.out.println(mark);
		}
	}
		
	}

