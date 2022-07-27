package com.chainsys.assignment2.test;

import com.chainsys.assignment2.MovieClass;

public class MovieTest {

	public static void main(String[] args) {
		MovieClass mc = new MovieClass();//Creating Object for BookClass Class
		mc.movie("Bigil"); // Calling movie method
		System.out.println("Producer :" + mc.producer()); // Calling producer method
		mc.director(); // Calling director method
		System.out.println("Hero and Heroine :" + mc.hero("Bigil", "Atlee")); // Calling hero method
	}
}
