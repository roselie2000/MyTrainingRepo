package com.chainsys.assignment2.test;

import com.chainsys.assignment2.BookClass;

public class BookClassTest {

	public static void main(String[] args) {
		BookClass bc = new BookClass();
		bc.book("Wings of Fires", 1);
		bc.author();
		System.out.println("Publisher :" + bc.publisher());
		System.out.println("Published Date :" + bc.publicationDate("Wing of Fires"));
	}

}
