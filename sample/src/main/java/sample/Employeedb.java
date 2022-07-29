package sample;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Employeedb {

	//object creation for Employee class
	Employee emp = new Employee();
	
	//method for insert the data to the Employee table
	public void insertData(Employee emp) {
		Connection con;
		
		try {
			con = ConnectionUtil.getConnection();
			//insert query
			String query = "insert into Employee(id, name, designation, salary)values(?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(query);//creating statement object
			
			ps.setInt(1, emp.getId());//set id value
			ps.setString(2, emp.getName());//set name value
			ps.setString(3, emp.getDesignation());//set designation value
			ps.setLong(4, emp.getSalary());//set salary value
			int i = ps.executeUpdate();//execute the query
		}
		 catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	//method for update the data to the Employee table
	public void updateData(int id) {
		Connection con;
		
		try {
			//get the connection from the ConnectionUtil class
			con = ConnectionUtil.getConnection();
			//query for update the salary where the given id is present
			String query = "Update Employee set salary = 25000 where id = ?";
			PreparedStatement ps = con.prepareStatement(query);//object creation for statement
			ps.setInt(1, id);//set the value of id
			int i = ps.executeUpdate();//execute the query
			System.out.println(i);
		}
		 catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}
	
	//method for display the data which is present in the Employee
	public void displayData() {
		try {
			Connection con = ConnectionUtil.getConnection();
			String q1 = "select * from employee";
			PreparedStatement ps1 = con.prepareStatement(q1);
			ResultSet rs = ps1.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String designation = rs.getString("designation");
				long salary = rs.getLong("salary");
				System.out.println(id + " " + name + " " + designation + " " + salary);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//method for delete the record where the given id is present
	public void deleteData(int empid) {
		try {
			Connection con = ConnectionUtil.getConnection();
			String q1 = "Delete from Employee where id =?";
			PreparedStatement ps1 = con.prepareStatement(q1);
			ps1.setInt(1, empid);
			ps1.executeUpdate();
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
