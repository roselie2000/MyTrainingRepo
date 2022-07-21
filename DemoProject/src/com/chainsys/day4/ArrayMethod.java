package com.chainsys.day4;

import java.util.Arrays;

public class ArrayMethod {
	public static void main(String args []) {
		int[] number1 = {1,2,3,4,5};
		int[] number2 = {6,7,8,9,10,11};
		
		//using asList(array) method
		System.out.println("as List");
		System.out.println(Arrays.asList(number1));//return a location
		
		//using binarySearch(array, key)
		System.out.println("Binary Search");
		System.out.println(Arrays.binarySearch(number1, 3));//return the index of the key
		
		//using Compare(array1, array2)
		System.out.println("Compare two arrays");
		/*return 0 - first element is equal to another.
		 * 1 - first element of 1st array is greater than second. 
		 * -1 - first element of 1st array is less than second*/
		System.out.println(Arrays.compare(number1, number2));
		
		//using copyOf(array, size)
		System.out.println("Copy and Filling");
		int[] number3 = Arrays.copyOf(number2, 10);
		//fill the number3 with 0
		Arrays.fill(number3, 3, 5, 0);
		for (int i : number3) {
			System.out.println(i); //print the values of number3
		}
		
		//using copyOfRange(array, start_index, end_index)
		int[] number4 = Arrays.copyOfRange(number3, 1, 6);
		System.out.println("copy form a range");
		for (int i : number4) {
			System.out.println(i);// print the value of number4
		}
		
		//using equals(array1, array2) method
		System.out.println("Equals method");
		/* return True - both array has same elements
		 * False - both array has different elements*/
		System.out.println(Arrays.equals(number3, number4));
		
		//using mismatch(array1, array2)
		System.out.println("First mismatch between number3 and number4");
		System.out.println(Arrays.mismatch(number3, number4));// return first mismatch of between array
		
		//using sort(array)
		int[] number5 = {7,8,3,2,4,0};
		System.out.println("Sorting");
		Arrays.sort(number5);//return sorted array
		for (int i : number5) {
			System.out.println(i);
		}
	}
}
