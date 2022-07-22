package com.chainsys.day5;

import java.util.Arrays;

public class SortingClass {
	String[] friends = {"Bobs", "Tiny", "Rose", "Rishi", "Alex", "Lily", "Jasmine", "Pooja", "Gayathri", "hena"};
	public void sortAlpha() {
		Arrays.sort(friends);
		System.out.println("Ascending order" + Arrays.toString(friends));
	}
}
