package com.chainsys.assignment1.test;

import com.chainsys.assignment1.MovieClass;

public class MovieTestClass {

	public static void main(String[] args) {
		MovieClass mc = new MovieClass();// Object creation for the class BookClass
		
		// Initialization
		mc.movieName = "Bigil";
		mc.directorName = "Atlee";
		mc.producerName = "Sun Pictures";
		mc.heroName = "Vijay";
		mc.herionName = "Nayanthara";
		
		// Print the values
		System.out.println(mc.movieName);
		System.out.println(mc.directorName);
		System.out.println(mc.producerName);
		System.out.println(mc.heroName);
		System.out.println(mc.herionName);
	}

}
