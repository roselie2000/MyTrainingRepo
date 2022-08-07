package booksalesmgmt.book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import booksalesmgmt.ConnectionUtil;
import booksalesmgmt.user.User;

public class Bookdb implements BookDoa{

	public void addBooks(Books bk) {
		try {
			Connection con = ConnectionUtil.getConnection();
			String addQuery = "insert into books(book_id, book_name, author_name, version_no, publisher,"
					+ "subject, price, quantity) values (?, ?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement ps1 = con.prepareStatement(addQuery);
			ps1.setString(1, bk.bookId);
			ps1.setString(2, bk.bookName);
			ps1.setString(3, bk.authorName);
			ps1.setInt(4, bk.versionNo);
			ps1.setString(5, bk.publisher);
			ps1.setString(6, bk.subject);
			ps1.setInt(7, bk.price);
			ps1.setInt(8, bk.quantity);
			ps1.executeUpdate();
			System.out.println("Added!");
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}

	public void minusQuantity(String id, int quant) {
		int quantdb = 0;
		try {
			Connection con = ConnectionUtil.getConnection();
			String getQuan = "select quantity from books where book_id = ?";
			PreparedStatement ps = con.prepareStatement(getQuan);
			ps.setString(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				quantdb = rs.getInt(1);
				String upQuery = "update books set quantity = ? where book_id = ?";
				PreparedStatement ps1 = con.prepareStatement(upQuery);
				quant = Math.max(0, quantdb - quant);
				ps1.setInt(1, quant);
				ps1.setString(2, id);
				ps1.executeUpdate();
			}
			else {
				System.out.println("There is no books in this book id. Please! check your book id");
			}
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
	

	public List<Books> getBookDetails() {
		ArrayList<Books> data = new ArrayList<Books>(); //array creation in Students type
		try {
			Connection con = ConnectionUtil.getConnection();
			String selectQuery = "select * from books";//query string for select all data from the database
			PreparedStatement ps = con.prepareStatement(selectQuery);
			ResultSet rs = ps.executeQuery();//execution of query
			while(rs.next()) {
				String id = rs.getString(1);
				String name = rs.getString(2);
				String author = rs.getString(3);
				int ver = rs.getInt(4);
				String pub = rs.getString(5);
				String sub = rs.getString(6);
				int price = rs.getInt(7);
				int quant = rs.getInt(8);
				Books bk = new Books();//object creation for Students class
				bk.setBookId(id);
				bk.setBookName(name);
				bk.setAuthorName(author);
				bk.setVersion(ver);
				bk.setPublisher(pub);
				bk.setSubject(sub);
				bk.setPrice(price);
				bk.setQuantity(quant);
				data.add(bk);
			}
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return data;
	}

	public void addQuantity(String id, int quant) {
		int quantdb = 0;
		try {
			Connection con = ConnectionUtil.getConnection();
			String getQuan = "select quantity from books where book_id = ?";
			PreparedStatement ps = con.prepareStatement(getQuan);
			ps.setString(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				quantdb = rs.getInt(1);
				String upQuery = "update books set quantity = ? where book_id = ?";
				PreparedStatement ps1 = con.prepareStatement(upQuery);
				quant = quantdb + quant;
				ps1.setInt(1, quant);
				ps1.setString(2, id);
				ps1.executeUpdate();
				System.out.println("updated!");
			}
			else {
				System.out.println("There is no books in this book id. Please! check your book id");
			}
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
	}

	public void getOrders() {
		try {
			Connection con = ConnectionUtil.getConnection();
			String q = "select * from user_ordered";
			PreparedStatement ps = con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				int id = rs.getInt(1);
				String bid = rs.getString(2);
				int qty = rs.getInt(3);
				String status = rs.getString(4);
				System.out.println(id + "  " + bid + "  " + qty + "  " + status);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<User> getUserDetails() {
		ArrayList<User> data = new ArrayList<User>();
		try {
			Connection con = ConnectionUtil.getConnection();
			String q = "select * from users";
			PreparedStatement ps = con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				int id = rs.getInt(1);
				String uname = rs.getString(2);
				String email = rs.getString(4);
				int rev = rs.getInt(5);
				String doorno = rs.getString(6);
				String city = rs.getString(7);
				String dist = rs.getString(8);
				String state = rs.getString(9);
				String name = rs.getString(10);
				int can = rs.getInt(11);
				User us = new User();
				us.setUserId(id);
				us.setUserName(uname);
				us.setEmail(email);
				us.setBookRev(rev);
				us.setBookCan(can);
				us.setDoorno(doorno);
				us.setCity(city);
				us.setDistrict(dist);
				us.setState(state);
				us.setName(name);
				data.add(us);
				System.out.println(id + "  " + uname + "  " + name + "  " + email + "  " + rev + "  " + 
				"  " + can + "  " + doorno + "  " + city + "  " + dist + "  " + state);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}
		
}

	

	
