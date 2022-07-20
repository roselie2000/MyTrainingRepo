package com.chainsys.assignment2.test;

import com.chainsys.assignment2.PlaceOfService;

public class PlaceOfServiceTest {
	public static void main(String args []) {
		PlaceOfService pos = new PlaceOfService(); //Creating Object for PlaceOfService Class
		String result = pos.getInfo(); // Calling getInfo method
		System.out.println(result); // print the result
	}
}
