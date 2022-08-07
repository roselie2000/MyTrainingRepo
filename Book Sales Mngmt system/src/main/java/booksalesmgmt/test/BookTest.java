package booksalesmgmt.test;

import java.util.ArrayList;
import java.util.Scanner;

import booksalesmgmt.Validator;
import booksalesmgmt.book.Bookdb;
import booksalesmgmt.book.Books;

public class BookTest {

	public static void main(String[] args) {
		Books bk = new Books();
		Bookdb bdb = new Bookdb();
		Validator vd = new Validator();
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter 'a' for add new books");
		System.out.println("Enter 'mq' for reduce the quantity of a book");
		System.out.println("Enter 'aq' for add the quantity of a book");
		System.out.println("Enter 'd' for display all books");
		System.out.println("Enter 'o' for see the order details");
		System.out.println("Enter 'u' for see the user details");
		System.out.println("Enter 'ou' for see the book ordered users");
		System.out.println("Enter your choice :");
		String msg = sn.next();
		if(msg.equals("a")) {
			System.out.println("Enter the book id :");
			String bookId = sn.next();
			if(vd.checkBookId(bookId)) {
				bk.setBookId(bookId);//set book id
				System.out.println("Enter the book name :");
				String bookName = sn.next();
				bk.setBookName(bookName);//set book name
				System.out.println("Enter the author name of the book :");
				String authorName = sn.next();
				bk.setAuthorName(authorName);//set author name
				System.out.println("Enter the version of the book :");
				int versionNo = sn.nextInt();
				bk.setVersion(versionNo);//set version
				System.out.println("Enter the publisher name of the book :");
				String publisher = sn.next();
				bk.setPublisher(publisher);//set publisher
				System.out.println("Enter the subject of the book :");
				String subject = sn.next();
				bk.setSubject(subject);//set subject
				System.out.println("Enter the price of the book :");
				int price = sn.nextInt();
				bk.setPrice(price);//set price
				System.out.println("Enter the available quantity of the book :");
				int quantity = sn.nextInt();
				bk.setQuantity(quantity);//set quantity
				bdb.addBooks(bk);//call the addBooks method
			}			
		}
		else if(msg.equals("aq")) {
			System.out.println("Enter the book id :");
			String bookId = sn.next();
			System.out.println("Enter the quant :");
			int quant = sn.nextInt();
			bdb.addQuantity(bookId, quant);//call the addQuantity method
		}
		else if(msg.equals("mq")) {
			System.out.println("Enter the book id :");
			String bookId = sn.next();
			System.out.println("Enter the quant :");
			int quant = sn.nextInt();
			bdb.minusQuantity(bookId, quant);//call the minusQuantity method
		}
		else if(msg.equals("d")) {
			ArrayList<Books> data = new ArrayList<Books>(); 
			data = (ArrayList<Books>) bdb.getBookDetails();//call the getBookDetails method
			System.out.println("Data");
			for(int i=0; i<data.size(); i++) {
				System.out.println(data.get(i).getBookId() + " " +
			data.get(i).getBookName() + " " + data.get(i).getAuthorName() + " " + data.get(i).getVersion()
			+ "  " + data.get(i).getSubject() + "  " + data.get(i).getPublisher() + "  " + data.get(i).getPrice()
			+ "  " + data.get(i).getQuantity());
			}
		}
		else if(msg.equals("o")) {
			bdb.getOrders();//call getOrders method
		}
		else if(msg.equals("u")) {
			bdb.getUserDetails();//call getUserDetails method
		}
		else if(msg.equals("ou")) {
			bdb.getOrderedUser();//call getOrderedUser method
		}
		else {
			System.out.println("Please!, enter a valid choice");
		}
	}

}
