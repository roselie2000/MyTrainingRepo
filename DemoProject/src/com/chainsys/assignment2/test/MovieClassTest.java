package com.chainsys.assignment2.test;

import com.chainsys.assignment2.MovieClass;

public class MovieClassTest {
	public static void main(String[] args) {
		MovieClass mc = new MovieClass();
		mc.movie("Bigil");
		System.out.println("Producer :" + mc.producer());
		mc.director();
		System.out.println("Hero and Heroine :" + mc.hero("Bigil", "Atlee"));
	}
}
