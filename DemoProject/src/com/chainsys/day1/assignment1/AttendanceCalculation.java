package com.chainsys.day1.assignment1;

import java.util.Scanner;

public class AttendanceCalculation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Total No of Classes Conducted");
		int totalClasses=sc.nextInt();
		System.out.println("No.of Classes Attended");
		int attendedClasses=sc.nextInt();
		
		float attendancePercentage=attendedClasses*100/totalClasses;
		if(attendancePercentage>75) {
			System.out.println("Attendance Percentage % :"+attendancePercentage);
			System.out.println("The Student should be allowed to the exam");
		}
		else {
			System.out.println("Attendance Percentage % :"+attendancePercentage);
			System.out.println("The Student should not allowed to the exam");
		}
	}
}
