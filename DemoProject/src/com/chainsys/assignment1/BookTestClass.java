package com.chainsys.assignment1;

public class BookTestClass {

	public static void main(String[] args) {
		BookClass bc = new BookClass();
		bc.bookname = "Wings of Fire";
		bc.authorName = "Dr.APJ Abdul Kalam";
		bc.edition = 1;
		bc.publicationDate= 1999;
		bc.publisher = "Universities Press";
		System.out.println(bc.bookname);
		System.out.println(bc.authorName);
		System.out.println(bc.edition);
		System.out.println(bc.publisher);
		System.out.println(bc.publicationDate);
	}

}
