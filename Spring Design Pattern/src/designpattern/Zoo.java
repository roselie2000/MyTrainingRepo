package com.chainsys.sample.designpattern;

public class Zoo {

	public void getAnimalType(String type) {
		Animals animal;
		
		switch (type.toLowerCase()) {
		case "wild":
			animal = new WildAnimals();
			break;

		case "domestic":
			animal = new DomesticAnimal();
			break;
			
		default:
			break;
		}
	}
}
