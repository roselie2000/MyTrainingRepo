package booksalesmgmt.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import booksalesmgmt.ConnectionUtil;
import booksalesmgmt.book.Bookdb;

public class Userdb implements UserDoa{

	public void insertOrder(String bookId, User us, int qty) {
		try {
			Connection con = ConnectionUtil.getConnection();
			System.out.println("update!");
			String q = "insert into user_ordered(user_id, book_id, status) values (?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(q);
			ps.setInt(1, us.getUserId());
			ps.setString(2, bookId);
			ps.setString(3, "Ordered");
			ps.executeUpdate();
			System.out.println("order updated!");
			Bookdb bdb = new Bookdb();
			bdb.updateQuantity(bookId, qty);
			
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
	public void signUp(User us) {
		int id = 0;
		try {
			Connection con = ConnectionUtil.getConnection();
			String query = "select user_id.nextval from dual";
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
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
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}

	public boolean login(String name, String pwd) {
		String passwd = "";
		try {
			Connection con = ConnectionUtil.getConnection();
			String q = "select user_id, password, book_rev from users where user_name = ?";
			PreparedStatement ps = con.prepareStatement(q);
			ps.setString(1, name);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				passwd = rs.getString(2);
				if(passwd.equals(pwd)) {
					System.out.println("your successfully login");
					User us = new User();
					us.setUserId(rs.getInt(1));
					us.setUserName(name);
					us.setPassword(passwd);
					us.setBookRev(rs.getInt(3));
					order(us);
					return true;
					
				}
				else {
					System.out.println("Please! enter a valid password");
					return false;
				}
			}
			else {
				System.out.println("The username is not exist please! check your username or sign up into the system");
				return false;
			}
			
		}
		catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}

	public void order(User us) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter the book ID :");
		String bookId = sn.next();
		try {
			Connection con = ConnectionUtil.getConnection();
			String q = "Select price from books where book_id = ?";
			PreparedStatement ps = con.prepareStatement(q);
			ps.setString(1, bookId);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				int price = rs.getInt(1);
				System.out.println("The price of the book is "+ price);
				System.out.println("Are you want to buy it!");
				String msg = sn.next();
				msg = msg.toLowerCase();
				if(msg.equals("y") || msg.equals("yes")) {
					System.out.println("how many books you want? ");
					int qty = sn.nextInt();
					System.out.println("Your order is placed.");
					System.out.println("Thank you");
//					String q1 = "update users set book_rev = ? where user_id = ?";
//					PreparedStatement ps1 = con.prepareStatement(q);
//					int quant = qty + us.getBookRev();
//					System.out.println(quant);
//					ps1.setInt(1, quant);
//					ps1.setInt(2, us.getUserId());
//					ps.executeUpdate();
					String upQuery = "update users set book_rev = ? where user_id = ?";
					PreparedStatement ps1 = con.prepareStatement(upQuery);
					int quant = qty + us.getBookRev();
					ps1.setInt(1, quant);
					ps1.setInt(2, us.getUserId());
					ps1.executeUpdate();
					us.setBookRev(quant);
					System.out.println("updated!");
					insertOrder(bookId, us, qty);
				}
				else {
					System.out.println("Thank for visiting!");
				}
			}
			else {
				System.out.println("The book id is not present. Please! check it!");
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void search(User us) {
		// TODO Auto-generated method stub
		
	}

	public void cancel(User us) {
		// TODO Auto-generated method stub
		
	}

}
