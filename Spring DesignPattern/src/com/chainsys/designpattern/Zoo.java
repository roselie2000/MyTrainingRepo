package com.chainsys.designpattern;

public class Zoo {

	public Animals getAnimalType(String type) {
		Animals animal;
		
		switch (type.toLowerCase()) {
		case "wild":
			return new WildAnimals();
			

		case "domestic":
			return new DomesticAnimals();
			
		default:
			break;
		}
		return null;
	}
}
