package com.chainsys.designpattern;

public class MainANimalClass {

	public static void main(String args[]) {
		Zoo zoo = new Zoo();
		
		Animals a = zoo.getAnimalType("wild");
		a.printAnimalType();
		
		Animals a1 = zoo.getAnimalType("domestic");
		a1.printAnimalType();
	}
}
