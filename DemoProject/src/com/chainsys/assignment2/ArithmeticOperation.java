package com.chainsys.assignment2;

public class ArithmeticOperation {
	public void equal(int x) {
		System.out.println(x==2);
	}
	
	public void notequal(int x) {
		System.out.println(x != 5);
	}
	public void andOperation(int x, int y) {
		System.out.println(x != 5 && y >= 5);
	}
	public void orOperation(int x, int z) {
		System.out.println(z != 0 || x == 2);
	}
	public void Comparision(int y) {
		System.out.println(!(y < 10));
	}
}
