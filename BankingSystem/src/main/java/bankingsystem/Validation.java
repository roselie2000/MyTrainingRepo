package bankingsystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;

public class Validation {

	public Boolean checkId(int id) {
		try {
			ArrayList<Integer> CustId = new ArrayList<Integer>();
			Connection con = ConnectionUtil.getConnection();
			String q = "select cust_id from customers";
			PreparedStatement ps = con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				CustId.add(rs.getInt(1));
			}
			if(CustId.contains(id)) {
				return true;
			}
			else {
				System.out.println("Please! enter a valid customer id!");
				return false;
			}
		}
		catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}
	public Boolean checkBranchId(String id) {
		try {
			ArrayList<String> branchId = new ArrayList<String>();
			Connection con = ConnectionUtil.getConnection();
			String q = "select branch_id from banks";
			PreparedStatement ps = con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				branchId.add(rs.getString(1));
			}
			if(branchId.contains(id)) {
				return true;
			}
			else {
				System.out.println("Our branches are :");
				for(int i =0; i<branchId.size(); i++) {
					System.out.println(branchId.get(i));
				}
				System.out.println("Please enter any one of this id");
				return false;
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public Boolean checkDob(String date) {
		LocalDate locdob = LocalDate.parse(date);//change the string to local date
		if(locdob.isAfter(LocalDate.now())) {
			System.out.println("Please! enter a valid date of birth");
			return false;
		}
		else {
			return true;
		}
	}
	
	public Boolean checkName(String name) {
		if(name == null || name.equals("") || name.trim().equals("") || name.length() < 3) {
			System.out.println("Please!, enter a valid name");
			return false;
		}
		else {
			return true;
		}
	}
	
	public Boolean checkPhno(long phno) {
		int length = String.valueOf(phno).length();
		if((length > 10) || (length < 10)){
			System.out.println("Please!, enter a valid phone number");
			return false;
		}
		else {
			return true;
		}
	}
	
	public Boolean checkBankId(String brId) {
		if((brId.length() > 7 ) || (brId.length() < 7) || ((!Character.isAlphabetic(brId.charAt(0)) && (!Character.isAlphabetic(brId.charAt(1)))))){
			System.out.println("Please! enter a valid id. \n The first two letter of the id should be alphabet \n and next 5 letters should be numeric. \n And the length should be 7");
			return false;
		}
		else {
			return true;
		}
		
	}
}
