package bankingsystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Bankdb implements BankDoa{

	//method for insert bank details
	public void insertBranchDetails(Bank bk) {
		try {
			Connection con = ConnectionUtil.getConnection();
			//query string for insert record from the database
			String insertQuery = "insert into banks(branch_id, branch_name, address)values(?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(insertQuery);
			ps.setString(1, bk.getBranchId());
			ps.setString(2, bk.getBranchName());
			ps.setString(3, bk.getAddress());
			ps.executeUpdate();
			System.out.println("The new branch details are added to the db!");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	//method for display the bank details
	public List<Bank> displayBankDetails() {
		ArrayList<Bank> data = new ArrayList<Bank>();
		try {
			Connection con = ConnectionUtil.getConnection();
			String displayQuery = "select * from banks";//query string for get record from the database
			PreparedStatement ps = con.prepareStatement(displayQuery);
			ResultSet rs = ps.executeQuery();//execution of query
			while(rs.next()) {
				String id = rs.getString(1);
				String name = rs.getString(2);
				String address = rs.getString(3);
				Bank bk = new Bank();
				bk.setBranchId(id);
				bk.setBranchName(name);
				bk.setAddress(address);
				data.add(bk);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}

	//method for remove the bank details
	public void removeBranchDetails(Bank bk) {
		try {
			Connection con = ConnectionUtil.getConnection();
			String q1 = "Delete from banks where branch_id =?";//query string for delete record from the database
			PreparedStatement ps1 = con.prepareStatement(q1);
			ps1.setString(1, bk.getBranchId());
			ps1.executeUpdate();//execute the query
			System.out.println("Deleted!");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	//method for change the address of the bank details
	public void changeAddrOfBranch(String addr, String id) {
		try {
			Connection con = ConnectionUtil.getConnection();
			//query string for update the address of the bank in the database
			String q1 = "update banks set address = ? where branch_id = ?";
			PreparedStatement ps = con.prepareStatement(q1);
			ps.setString(1, addr);
			ps.setString(2, id);
			
			ps.executeUpdate();
			System.out.println("Updated!");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
