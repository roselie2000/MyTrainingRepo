package com.chainsys.day1.test;

import com.chainsys.day1.assignment1.BookClass;

public class BookTest {
	public static void main(String args []) {
		BookClass b=new BookClass();
		b.authorName="APJ Abdul Kalam";
		b.bookName="Wings of Fire";
		b.edition = 1;
		b.publisher="World Universities";
		b.publicationDate = 1999;
		System.out.println("authorName :"+ b.authorName);
		System.out.println("bookName :"+b.bookName);
		System.out.println("bookPrice :"+b.edition);
		System.out.println("publisher :"+b.publisher);
		System.out.println("year :"+b.publicationDate);
	}
}
