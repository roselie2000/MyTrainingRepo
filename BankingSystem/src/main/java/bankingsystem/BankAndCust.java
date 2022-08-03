package bankingsystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BankAndCust {

	public void displayByInnerJoin() {
		try {
			Connection con = ConnectionUtil.getConnection();
			String innerJoinQuery = "select * from customers inner join banks on customers.branch_id = banks.branch_id";
			PreparedStatement ps = con.prepareStatement(innerJoinQuery);
			ResultSet rs = ps.executeQuery();
			System.out.println("\n");
			System.out.println("***************************Inner join***************************************");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+ "  " +rs.getString(2)+ "  " +rs.getDate(3)+ "  " +rs.getString(4)+ "  "+rs.getString(5)+ "  " +rs.getString(6)+ "  " +rs.getString(8)+ "  " +rs.getString(9));
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void displayByLeftJoin() {
		try {
			Connection con = ConnectionUtil.getConnection();
			String innerJoinQuery = "select * from customers left join banks on customers.branch_id = banks.branch_id";
			PreparedStatement ps = con.prepareStatement(innerJoinQuery);
			ResultSet rs = ps.executeQuery();
			System.out.println("\n");
			System.out.println("***************************left join***************************************");
			while(rs.next()) { 
				System.out.println(rs.getInt(1)+ "  " +rs.getString(2)+ "  " +rs.getDate(3)+ "  " +rs.getString(4)+ "  "+rs.getString(5)+ "  " +rs.getString(6)+ "  " +rs.getString(8)+ "  " +rs.getString(9));
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void displayByRightJoin() {
		try {
			Connection con = ConnectionUtil.getConnection();
			String innerJoinQuery = "select * from customers right join banks on customers.branch_id = banks.branch_id";
			PreparedStatement ps = con.prepareStatement(innerJoinQuery);
			ResultSet rs = ps.executeQuery();
			System.out.println("\n");
			System.out.println("***************************left join***************************************");
			while(rs.next()) { 
				System.out.println(rs.getInt(1)+ "  " +rs.getString(2)+ "  " +rs.getDate(3)+ "  " +rs.getString(4)+ "  "+rs.getString(5)+ "  " +rs.getString(6)+ "  " +rs.getString(8)+ "  " +rs.getString(9));
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void displayByFullJoin() {
		try {
			Connection con = ConnectionUtil.getConnection();
			String innerJoinQuery = "select * from customers full join banks on customers.branch_id = banks.branch_id";
			PreparedStatement ps = con.prepareStatement(innerJoinQuery);
			ResultSet rs = ps.executeQuery();
			System.out.println("\n");
			System.out.println("***************************full join***************************************");
			while(rs.next()) { 
				System.out.println(rs.getInt(1)+ "  " +rs.getString(2)+ "  " +rs.getDate(3)+ "  " +rs.getString(4)+ "  "+rs.getString(5)+ "  " +rs.getString(6)+ "  " +rs.getString(8)+ "  " +rs.getString(9));
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
