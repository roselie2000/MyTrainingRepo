package com.chainsys.day4.test;

import com.chainsys.day4.ArrayObjectClass;

public class ArrayObjectClassTest {
	public static void main(String args []) {
	  
	        // Declaring an array of student
			ArrayObjectClass[] arr;
	  
	        // Allocating memory for 2 objects
	        arr = new ArrayObjectClass[2];
	  
	        //value assignment
	        arr[0] = new ArrayObjectClass(1701289270, "Tiny");
	        arr[1] = new ArrayObjectClass(1701289219, "Rose");
	  
	        // Displaying the student data
	        System.out.println(
	            "Student data in student arr 0: ");
	        arr[0].display();
	        arr[1].display();
	  
	}
}
