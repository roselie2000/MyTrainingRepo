package com.chainsys.assignment2.test;

import com.chainsys.assignment2.BookClass;

public class BookTest {

	public static void main(String[] args) {
		BookClass bc = new BookClass(); //Creating Object for BookClass Class
		bc.book("Wings of Fires", 1); // Calling book method
		bc.author(); //Calling author method
		System.out.println("Publisher :" + bc.publisher()); //Calling publisher method
		System.out.println("Published Date :" + bc.publicationDate("Wing of Fires"));// Calling publicationDate method
	}
}
