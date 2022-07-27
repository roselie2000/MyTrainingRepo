package com.chainsys.day1.test;

import com.chainsys.day1.assignment1.MovieClass;

public class MovieTest {

	public static void main(String args []) {
		MovieClass m=new MovieClass();
		m.hero="Kamal";
		m.directorName="Lokesh";
		m.movieName="Bigil";
		m.producer="Sun Pictures";
		m.heroine="Nayanthara";
		System.out.println("movieName :"+m.movieName);
		System.out.println("actor :"+m.producer);
		System.out.println("director :"+m.directorName);
		System.out.println("musicDirector :"+m.hero);
		System.out.println("releasingYear :"+m.heroine);
	}
}
