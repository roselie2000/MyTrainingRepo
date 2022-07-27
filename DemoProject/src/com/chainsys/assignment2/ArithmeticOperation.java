package com.chainsys.assignment2;

public class ArithmeticOperation {

		//Checking x==2
		public void equal(int x) {
			System.out.println(x==2);
		}
		
		//Checking x != 5
		public void notEqual(int x) {
			System.out.println(x != 5);
		}
		
		//Checking x != 0 && y >= 5
		public void andOperation(int x, int y) {
			System.out.println(x != 5 && y >= 5);
		}
		
		//Checking z != 0 || x == 2
		public void orOperation(int x, int z) {
			System.out.println(z != 0 || x == 2);
		}
		
		//Checking !(y < 10)
		public void comparision(int y) {
			System.out.println(!(y < 10));
		}
}
