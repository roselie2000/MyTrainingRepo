package booksalesmgmt;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Validator {

	public boolean checkName(String name) {
		if(name == null || name.equals("") || name.trim().equals("") || name.length() < 3) {
			System.out.println("Please!, enter a valid name");
			return false;
		}
		else {
			return true;
		}
	}
	
	public boolean checkUserName(String uname, String name) {
		if(!uname.equals(name)) {
			if(name == null || name.equals("") || name.trim().equals("") || name.length() < 3) {
				System.out.println("Please!, enter a valid name");
				return false;
			}
			else {
				return true;
			}
		}
		else {
			System.out.println("The username should not match with the name");
			return false;
		}
	}
	
	public boolean checkPwd(String pwd, String uname) {
		if(!pwd.equals(uname)) {
			if(uname == null || uname.equals("") || uname.trim().equals("") || uname.length() < 3) {
				System.out.println("Please!, enter a valid name");
				return false;
			}
			else {
				return true;
			}
		}
		else {
			System.out.println("The password should not match with the username");
			return false;
		}
	}
	
	public boolean checkEmail(String email) {
		if(email.endsWith("@gmail.com")) {
			return true;
		}
		else {
			System.out.println("Please!, enter a valid emil address!");
			return false;
		}
	}
	
	public boolean checkDoorno(String dno) {
		if(dno.isBlank()) {
			System.out.println("Please enter a valid door no");
			return false;
		}
		else {
			return true;
		}
	}
	
	public boolean checkAddr(String city) {
		if(city.isBlank() || city.length() < 5 ) {
			System.out.println("Please!, enter a valid city name");
			return false;
		}
		else {
			return true;
		}
	}
	
	public boolean checkBookId(String id) {
		try {
			Connection con = ConnectionUtil.getConnection();
			String q = "select book_id from books";
			PreparedStatement ps = con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				System.out.println("The Book id is already given to another book.\n"
						+ "Please! enter differnt book id");
				return false;
			}
			else {
				return true;
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean checkUserId(int id) {
		try {
			Connection con = ConnectionUtil.getConnection();
			String q = "select user_id from users";
			PreparedStatement ps = con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				return true;
			}
			else {
				System.out.println("The user id id not exist. Please! check your user Id");
				return false;
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean checkOrderId(int id) {
		try {
			Connection con = ConnectionUtil.getConnection();
			String q = "select order_id from users_ordered";
			PreparedStatement ps = con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				return true;
			}
			else {
				System.out.println("The order id id not exist. Please! check your order Id");
				return false;
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
