package com.chainsys.assignment2;

public class BookClass {
	
	//Get Book name and Edition
	public void book(String bookname, int edition) {
		System.out.println("Book Name :" + bookname);
		System.out.println("Edition :" + edition);
	}

	//Get Publisher name
	public String publisher() {
		String pub = "World Universities";
		return pub;
	}
	
	//Get Author name
	public void author() {
		String authorName = "APJ. Abdul Kalam";
		System.out.println("Author name :" + authorName);
	}
	
	//Get Publication Date
	public int publicationDate(String book) {
		int date = 1999;
		return date;
		
	}
}
