package bankingsystem;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import sample.ConnectionUtil;

public class Customrdb implements CustomerDoa{

	//method for insert the data of customer
	public void insertCustDetails(Customer cust) {
		try {
			int id = 0;
			Connection con = ConnectionUtil.getConnection();
			String query1 = "select custid.nextval from dual";//query string get the next value of the sequence
			PreparedStatement ps = con.prepareStatement(query1);//create statement object
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				id = rs.getInt(1);
				cust.setCustId(id);
				System.out.println("Added");
			}
			//insert query
			String insertQuery = "insert into customers(cust_id, cust_name, dob, address, phone_no, branch_id)values(?, ?, ?, ?, ?, ?)";
			PreparedStatement ps1 = con.prepareStatement(insertQuery);
			System.out.println("Query created");
			//get the data by getter method and set it to  the query statement
			ps1.setInt(1, cust.getCustId());
			ps1.setString(2, cust.getCustName());
			ps1.setDate(3, cust.getDob());
			ps1.setString(4, cust.getAddress());
			ps1.setLong(5, cust.getPhoneno());
			ps1.setString(6, cust.getBranchId());
			System.out.println("Query created");
			ps1.executeUpdate();
			System.out.println("Query created");
			System.out.println("The new branch details are added to the db!");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	//method for delete the data of customer
	public void removeCustDetails(Customer cust) {
		try {
			Connection con = ConnectionUtil.getConnection();
			String q1 = "Delete from customers where cust_id =?";//query string for delete record from the database
			PreparedStatement ps1 = con.prepareStatement(q1);
			ps1.setInt(1, cust.getCustId());
			ps1.executeUpdate();//execute the query
			System.out.println("Deleted!");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	//method for change the address of the customer
	public void changeAddrOfCust(Customer cust) {
		try {
			Connection con = ConnectionUtil.getConnection();
			//update query
			String q1 = "update customers set address = ? where cust_id = ?";
			PreparedStatement ps = con.prepareStatement(q1);
			ps.setString(1, cust.getAddress());
			ps.setInt(2, cust.getCustId());
			ps.executeUpdate();//query execution
			System.out.println("Updated!");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	//method for change the phone number of the customer
	public void changePhnoOfCust(Customer cust) {
		try {
			Connection con = ConnectionUtil.getConnection();
			String q1 = "update customers set phone_no = ? where cust_id = ?";
			PreparedStatement ps = con.prepareStatement(q1);
			ps.setLong(1, cust.getPhoneno());
			ps.setInt(2, cust.getCustId());
			ps.executeUpdate();//change the phone number of the customer
			System.out.println("Updated!");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	//method for display the data of customer
	public List<Customer> displayCustDetails() {
		ArrayList<Customer> data = new ArrayList<Customer>();//array list created in customer type
		try {
			Connection con = ConnectionUtil.getConnection();
			String displayQuery = "select * from customers";//get all data from the db
			PreparedStatement ps = con.prepareStatement(displayQuery);
			ResultSet rs = ps.executeQuery();//execution of query
			while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				Date dob = rs.getDate(3);
				String addr = rs.getString(4);
				long phno = rs.getLong(5);
				String branchId = rs.getString(6);
				Customer cust = new Customer();//create object in each iteration
				//set the data to the object
				cust.setCustId(id);
				cust.setCustName(name);
				cust.setDob(dob);
				cust.setAddress(addr);
				cust.setPhoneno(phno);
				cust.setBranchId(branchId);
				data.add(cust);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	
	}
}
