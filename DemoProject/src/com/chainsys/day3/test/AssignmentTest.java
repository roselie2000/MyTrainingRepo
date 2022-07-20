package com.chainsys.day3.test;

import java.util.Scanner;

import com.chainsys.day3.assignment3.ExpressionEvalveClass;
import com.chainsys.day3.assignment3.LoginClass;
import com.chainsys.day3.assignment3.MultiplicationTableClass;
import com.chainsys.day3.assignment3.OddEvenCubeClass;
import com.chainsys.day3.assignment3.QuesAnswerClass;

public class AssignmentTest {
	public static void main(String args []) {
		MultiplicationTableClass mt = new MultiplicationTableClass();//Object Creation
		Scanner sn = new Scanner(System.in);
		
		
		System.out.println("Enter a number : ");//get a number to know which multiplication  want to display
		int number = sn.nextInt();
		
		
		System.out.println("Enter a number (for level of the table) : ");//get a number to know how long the table want to print
		int level = sn.nextInt();
		
		
		mt.printTable(number, level);// calling the printTable method
		
		OddEvenCubeClass oec = new OddEvenCubeClass();
		
		System.out.println("Enter a number : ");
		number = sn.nextInt();
		
		oec.displayOdd(number);
		oec.displayEven(number);
		oec.displayCube(number);
		
		LoginClass lc = new LoginClass();
		
		System.out.println("Enter username :");
		String user = sn.next();
		
		System.out.println("Enter password :");
		String pwd = sn.next();
		
		
		lc.login(user, pwd);
		
		
		ExpressionEvalveClass eec = new ExpressionEvalveClass();
		eec.evaluation();
		
		QuesAnswerClass qa = new QuesAnswerClass();
		qa.getAnswer();
		
	}
}
