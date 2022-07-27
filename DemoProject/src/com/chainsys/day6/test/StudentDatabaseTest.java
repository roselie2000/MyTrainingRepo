package com.chainsys.day6.test;

import com.chainsys.day6.StudentDatabase;

public class StudentDatabaseTest {
	public static void main(String args[]) {
		
		StudentDatabase so=new StudentDatabase();//Object creation
		System.out.println(so);
		so.setInfo("Roselie", 21);
		
		int age[]= {21,22,21,19,20,19,17,18,20,19};//Array of age
		String name[]= {"Tiny","Rishi","Gaya","Moses","Bob","Mano","Karthick","Rosy","Lily","Vijay"};//array of name
		String address[]= {"19 Anna Nagar","123 KK Nagar","78 MR Nagar","102 KK Nagar","10 Anna Naga","125 KK Nagar","15 Anna Naga","88 MR Nagar","120 KK Nagar","12 Anna Naga"};//array of address
		
		//Print the student Details
		for(int i=0;i<10;i++) {
			so.setInfo(name[i], age[i], address[i]);			
		}
		
	}
}
