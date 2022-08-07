package booksalesmgmt.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

import booksalesmgmt.ConnectionUtil;
import booksalesmgmt.Validator;
import booksalesmgmt.book.Bookdb;
import booksalesmgmt.book.Books;

public class Userdb implements UserDoa {
	
	public int insertOrder(String bookId, User us, int qty, String status) {
		int id = 0;
		try {
			Connection con = ConnectionUtil.getConnection();
			String query = "select order_id.nextval from dual";
			PreparedStatement ps1 = con.prepareStatement(query);
			ResultSet rs = ps1.executeQuery();
			if (rs.next()) {
				id = rs.getInt(1);
			}
			String q = "insert into users_ordered(user_id, book_id, quantity, status, order_id) values (?, ?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(q);
			ps.setInt(1, us.getUserId());
			ps.setString(2, bookId);
			ps.setInt(3, qty);
			ps.setString(4, status);
			ps.setInt(5, id);
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return id;
	}
	
	public void updateOrder(int orderId, String status) {
		try {
			Connection con = ConnectionUtil.getConnection();
			String q = "update users_ordered set status = ? where order_id = ?";
			PreparedStatement ps = con.prepareStatement(q);
			ps.setString(1, status);
			ps.setInt(2, orderId);
			ps.executeUpdate();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void signUp(User us) {
		int id = 0;
		try {
			Connection con = ConnectionUtil.getConnection();
			String query = "select user_id.nextval from dual";
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				id = rs.getInt(1);
				us.setUserId(id);
			}
			String query1 = "insert into users(user_id, user_name, password, email, door_no, city, district,"
					+ "state, name) values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement ps1 = con.prepareStatement(query1);
			ps1.setInt(1, us.getUserId());
			ps1.setString(2, us.getUserName());
			ps1.setString(3, us.getPassword());
			ps1.setString(4, us.getEmail());
			ps1.setString(5, us.getDoorno());
			ps1.setString(6, us.getCity());
			ps1.setString(7, us.getDistrict());
			ps1.setString(8, us.getState());
			ps1.setString(9, us.getName());
			ps1.executeUpdate();
			System.out.println("Your are Successfully signed up!");
			System.out.println("Your user ID is " + id);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void logout(int userId) {
		try {
			Connection con = ConnectionUtil.getConnection();
			String q = "delete from users where user_id = ?";
			PreparedStatement ps = con.prepareStatement(q);
			ps.setInt(1, userId);
			ps.executeUpdate();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void login(String name, String pwd) {
		String passwd = "";
		try {
			Connection con = ConnectionUtil.getConnection();
			String q = "select user_id, password, book_rev, book_can from users where user_name = ?";
			PreparedStatement ps = con.prepareStatement(q);
			ps.setString(1, name);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				passwd = rs.getString(2);
				if (passwd.equals(pwd)) {
					System.out.println("your successfully login");
					User us = new User();
					us.setUserId(rs.getInt(1));
					us.setUserName(name);
					us.setPassword(passwd);
					us.setBookRev(rs.getInt(3));
					us.setBookCan(rs.getInt(4));
					Scanner sn = new Scanner(System.in);
					System.out.println("you want to search book or place order! or quite");
					System.out.println("Enter 's' for search");
					System.out.println("Enter 'o' for place the order");
					System.out.println("Enter 'c' for Cancel the order");
					System.out.println("Enter 'q' for quite");
					String msg = sn.next();
					if (msg.equals("s")) {
						search(us);
					} else if (msg.equals("o")) {
						order(us);
					} else if (msg.equals("c")) {
						cancel(us);
					} else if (msg.equals("q")) {
						System.out.println("Thank you for visiting!");
					} else {
						System.out.println("Please enter a valid choice");
					}
				} else {
					System.out.println("Please! enter a valid password");
				}
			} else {
				System.out.println("The username is not exist please! check your username or sign up into the system");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void order(User us) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter the book ID :");
		String bookId = sn.next();
		try {
			Connection con = ConnectionUtil.getConnection();
			String q = "Select price, quantity from books where book_id = ?";
			PreparedStatement ps = con.prepareStatement(q);
			ps.setString(1, bookId);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				int price = rs.getInt(1);
				int quantity = rs.getInt(2);
				System.out.println("The price of the book is " + price);
				System.out.println("Are you want to buy it!");
				String msg = sn.next();
				msg = msg.toLowerCase();
				if (msg.equals("y") || msg.equals("yes")) {
					System.out.println("how many books you want? ");
					int qty = sn.nextInt();
					if(quantity < qty) {
						System.out.println("Sorry! we have only " + quantity + "books");
						System.out.println("if you don't mind please wait for two days");
						System.out.println("Are you want to buy it!");
						msg = sn.next();
						if(msg.equals("y")) {
							String upQuery = "update users set book_rev = ? where user_id = ?";
							PreparedStatement ps1 = con.prepareStatement(upQuery);
							int quant = qty + us.getBookRev();
							ps1.setInt(1, quant);
							ps1.setInt(2, us.getUserId());
							ps1.executeUpdate();
							us.setBookRev(quant);
							String status = "Ordered";
							int orderId = insertOrder(bookId, us, qty, status);
							System.out.println("Your order is placed.");
							System.out.println("book :" + bookId + "  " + "Quantity :" + qty + "  " + 
							"Price :" + qty * price);
							System.out.println("Your order id is " + orderId);
							Bookdb bdb = new Bookdb();
							bdb.minusQuantity(bookId, qty);
							System.out.println("Thank you");
						}
					}
					else {
						System.out.println("Your order is placed.");
						System.out.println("book :" + bookId + "  " + "Quantity :" + qty + "  " + "Price :" + qty * price);
						String upQuery = "update users set book_rev = ? where user_id = ?";
						PreparedStatement ps1 = con.prepareStatement(upQuery);
						int quant = Math.max(0, qty + us.getBookRev());
						ps1.setInt(1, quant);
						ps1.setInt(2, us.getUserId());
						ps1.executeUpdate();
						us.setBookRev(quant);
						String status = "Ordered";
						int orderId = insertOrder(bookId, us, qty, status);
						System.out.println("book :" + bookId + "  " + "Quantity :" + qty + "  " + 
								"Price :" + qty * price);
								System.out.println("Your order id is " + orderId);
						Bookdb bdb = new Bookdb();
						bdb.minusQuantity(bookId, qty);
						System.out.println("Thank you");
					}					
				} else {
					System.out.println("Thank for visiting!");
				}
			} else {
				System.out.println("The book id is not present. Please! check it!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void search(User us) {
		Scanner sn = new Scanner(System.in);
		System.out.println("How do to want to search the book");
		System.out.println("Enter 'id' for search the book id");
		System.out.println("Enter 'name' for search the book name");
		System.out.println("Enter 'author' for search the book author");
		System.out.println("Enter 'publisher' for search the book publisher");
		String choice = sn.next();
		if(choice.equals("id") || choice.equals("name") || choice.equals("author") || choice.equals("publisher")) {
			System.out.println("Enter the " + choice + ":");
			String val = sn.next();
			String q = "";
			if(choice.equals("id")) {
				q = "select * from books where book_id = ?";
			}
			else if(choice.equals("name")) {
				q = "select * from books where book_name = ?";
			}
			else if(choice.equals("author")) {
				q = "select * from books where author_name = ?";
			}
			else if(choice.equals("publisher")) {
				q = "select * from books where publisher = ?";
			}
			try {
				Connection con = ConnectionUtil.getConnection();
				ArrayList<Books> data = new ArrayList<Books>();
				PreparedStatement ps = con.prepareStatement(q);
				ps.setString(1, val);
				ResultSet rs = ps.executeQuery();
				while(rs.next()) {
					String id = rs.getString(1);//get id from the database
					String name = rs.getString(2);//get name from the database
					String author = rs.getString(3);//get email from the database
					int version = rs.getInt(4);
					String pub = rs.getString(5);
					String sub = rs.getString(6);
					int price = rs.getInt(7);
					int qty = rs.getInt(8);
					Books bk = new Books();//object creation for Students class
					bk.setBookId(id);
					bk.setBookName(name);
					bk.setAuthorName(author);
					bk.setVersion(version);
					bk.setPublisher(pub);
					bk.setSubject(sub);
					bk.setPrice(price);
					bk.setQuantity(qty);
					data.add(bk);
				}
				for(int i=0; i<data.size(); i++) {
					System.out.println(data.get(i).getBookId() + "  " + data.get(i).getBookName() 
							+ "  " + data.get(i).getAuthorName() + "  " + data.get(i).getVersion() + "  " +
							data.get(i).getPublisher() + "  " + data.get(i).getSubject() + "  " + 
							data.get(i).getPrice() + "  " + data.get(i).getQuantity());
				}
				order(us);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		else {
			System.out.println("Please!, enter a valid choice");
		}
	}

	public void cancel(User us) {
		Scanner sn = new Scanner(System.in);
		Validator vd = new Validator();
		System.out.println("Enter your order ID :");
		int id = sn.nextInt();
		if(vd.checkOrderId(id)) {
			try {
				Connection con = ConnectionUtil.getConnection();
				String query = "select * from users_ordered where order_id = ?";
				PreparedStatement ps = con.prepareStatement(query);
				ps.setInt(1, id);
				ResultSet rs = ps.executeQuery();
				if(rs.next()) {
					int userId = rs.getInt(2);
					String bookId = rs.getString(3);
					int qty = rs.getInt(4);
					String status = rs.getString(5);
					int quant = us.getBookCan();
					quant += qty;
					String q = "update users set book_can = ? where user_id = ?";
					PreparedStatement ps1 = con.prepareStatement(q);
					ps1.setInt(1, quant);
					ps1.setInt(2, us.getUserId());
					ps1.executeUpdate();
					
					quant = us.getBookRev();
					quant -= qty;
					String q1 = "update users set book_rev = ? where user_id = ?";
					PreparedStatement ps2 = con.prepareStatement(q);
					ps2.setInt(1, quant);
					ps2.setInt(2, userId);
					ps2.executeUpdate();
					status = "Cancelled";
					updateOrder(id, status);
					Bookdb bdb = new Bookdb();
					bdb.addQuantity(bookId, qty);
					System.out.println("Your order was cancelled!");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
