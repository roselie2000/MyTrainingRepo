package com.chainsys.assignment1.test;

import com.chainsys.assignment1.BookClass;

public class BookTestClass {

	public static void main(String[] args) {
		BookClass bc = new BookClass(); // Object creation for the class BookClass
		
		// Initialization
		bc.bookname = "Wings of Fire";
		bc.authorName = "Dr.APJ Abdul Kalam";
		bc.edition = 1;
		bc.publicationDate= 1999;
		bc.publisher = "Universities Press";
		
		// Print the values
		System.out.println(bc.bookname);
		System.out.println(bc.authorName);
		System.out.println(bc.edition);
		System.out.println(bc.publisher);
		System.out.println(bc.publicationDate);
	}

}