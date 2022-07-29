package com.chainsys.assignment2;

public class MovieClass {
	
	//Get Movie Name
	public void movie(String movieName) {
		System.out.println("Movie Name :" + movieName);
	}

	//Get Producer name
	public String producer() {
		String prod = "Sun Pictures";
		return prod;
	}
	
	//Get Director name
	public void director() {
		String direc = "Atlee";
		System.out.println("Director name :" + direc);
	}
	
	//Get Hero and Heroine 
	public String hero(String movie, String director) {
		String hero = "Vijay";
		String heroine = "Nayanthara";
		return hero + " " + "and" + " " + heroine;
		
	}
}
