package com.chainsys.day4;

public class ArrayClass {

	public static void main(String args []) {
		
		//declaration
		int[] numbers;
		//initialization
		numbers = new int[5];
		//value assignment
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		numbers[3] = 4;
		numbers[4] = 5;
		
		System.out.println("Numbers");
		for(int i=0; i<5; i++) {
			System.out.println(numbers[i]);
		}
		
		//declaration and initialization
		char[] characters = new char[5];
		//value assignment
		characters[0] = 'a';
		characters[1] = 'b';
		characters[2] = 'c';
		characters[3] = 'd';
		characters[4] = 'e';
		
		System.out.println("Characters");
		for(int c=0; c<5; c++) {
			System.out.println(characters[c]);
		}
		
		//declaration, initialization and value assignment
		double[] doubles = new double[] {2.635472, 3.142335, 7.63529280, 9.52437289, 6.45908567};
		
		System.out.println("Double");
		for(int d=0; d<5; d++) {
			System.out.println(doubles[d]);
		}
	}
}
