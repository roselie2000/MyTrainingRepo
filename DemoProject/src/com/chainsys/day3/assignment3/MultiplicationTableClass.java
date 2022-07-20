package com.chainsys.day3.assignment3;

public class MultiplicationTableClass {
	public void printTable(int number, int level) {
		for(int i=0; i <= level; i++) {
			System.out.println(number + "x" + i + "=" + number * i);//display the multiplication table
		}
	}
}
