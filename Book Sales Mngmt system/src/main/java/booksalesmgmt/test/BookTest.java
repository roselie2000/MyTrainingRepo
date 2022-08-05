package booksalesmgmt.test;

import java.util.ArrayList;
import java.util.Scanner;

import booksalesmgmt.book.Bookdb;
import booksalesmgmt.book.Books;

public class BookTest {

	public static void main(String[] args) {
		Books bk = new Books();
		Bookdb bdb = new Bookdb();
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter 'a' for add new books");
		System.out.println("Enter 'u' for update the quantity of the book");
		System.out.println("Enter 'd' for display all books");
		System.out.println("Enter your choice :");
		String msg = sn.next();
		if(msg.equals("a")) {
			System.out.println("Enter the book id :");
			String bookId = sn.next();
			bk.setBookId(bookId);
			System.out.println("Enter the book name :");
			String bookName = sn.next();
			bk.setBookName(bookName);
			System.out.println("Enter the author name of the book :");
			String authorName = sn.next();
			bk.setAuthorName(authorName);
			System.out.println("Enter the version of the book :");
			int versionNo = sn.nextInt();
			bk.setVersion(versionNo);
			System.out.println("Enter the publisher name of the book :");
			String publisher = sn.next();
			bk.setPublisher(publisher);
			System.out.println("Enter the subject of the book :");
			String subject = sn.next();
			bk.setSubject(subject);
			System.out.println("Enter the price of the book :");
			int price = sn.nextInt();
			bk.setPrice(price);
			System.out.println("Enter the available quantity of the book :");
			int quantity = sn.nextInt();
			bk.setQuantity(quantity);
			bdb.addBooks(bk);
		}
		else if(msg.equals("u")) {
			System.out.println("Enter the book id :");
			String bookId = sn.next();
			System.out.println("Enter the quant :");
			int quant = sn.nextInt();
			bdb.updateQuantity(bookId, quant);
		}
		else if(msg.equals("d")) {
			ArrayList<Books> data = new ArrayList<Books>(); 
			data = (ArrayList<Books>) bdb.getBookDetails();
			System.out.println("Data");
			for(int i=0; i<data.size(); i++) {
				System.out.println(data.get(i).getBookId() + " " +
			data.get(i).getBookName() + " " + data.get(i).getAuthorName() + " " + data.get(i).getVersion()
			+ "  " + data.get(i).getSubject() + "  " + data.get(i).getPublisher() + "  " + data.get(i).getPrice()
			+ "  " + data.get(i).getQuantity());
			}
		}	
	}

}
