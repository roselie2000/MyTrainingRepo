package com.chainsys.assignment2.test;

import java.util.Scanner;

import com.chainsys.assignment2.Attendence;

public class AttendenceTest {

	public static void main(String[] args) {
		Attendence att = new Attendence(); //creating object for  class
		
		Scanner sn = new Scanner(System.in);
		
		//Get number of Held classes
		System.out.println("Enter the number of classes helded :");
		double heldclass = sn.nextDouble();
		
		//Get number of Attended Classes
		System.out.println("Enter the number of classes attended :");
		double attendclass = sn.nextDouble();
		
		att.percentageCalc(heldclass, attendclass);
	}

}

