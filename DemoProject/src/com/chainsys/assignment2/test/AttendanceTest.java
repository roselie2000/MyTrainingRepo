package com.chainsys.assignment2.test;

import java.util.Scanner;

import com.chainsys.assignment2.Attendance;

public class AttendanceTest {
	public static void main(String args []) {
		Attendance att = new Attendance();
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter the number of classes helded :");
		double heldclass = sn.nextDouble();
		
		System.out.println("Enter the number of classes attended :");
		double attendclass = sn.nextDouble();
		
		att.percentageCalc(heldclass, attendclass);
	}
}
