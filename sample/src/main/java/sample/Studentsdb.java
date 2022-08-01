package sample;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Studentsdb {

	//Method for create a table
	public void createTable(String tableName) {
		
		Connection con;
		try {
			con = ConnectionUtil.getConnection();
			//query string for create a table
			String createQuery = "create table student(id number(10), name varchar(30))";
			PreparedStatement ps = con.prepareStatement(createQuery);//statement object creation
			ps.executeUpdate(createQuery);//execute the query
			System.out.println("created");
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//method for insert a table
	public void insertData(String name, String email, int age) {
		Connection con;
		int id = 0;
		try {
			
			con = ConnectionUtil.getConnection();//getting database connection
			String query1 = "select id_autono.nextval from dual";//query string get the next value of the sequence
			PreparedStatement ps = con.prepareStatement(query1);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				id = rs.getInt(1);
			}
			//query string for insert a table
			String query = "insert into students(id, name, email, age)values(?, ?, ?, ?)";
			PreparedStatement ps1 = con.prepareStatement(query);
			ps1.setInt(1, id);//set the value of id
			ps1.setString(2, name);//set the value of
			ps1.setString(3, email);//set the value of email
			ps1.setInt(4, age);//set the value of age
			ps1.executeUpdate();//execute the query
			System.out.println("created!");
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void altertable() {
		Connection con;
		try {
			con = ConnectionUtil.getConnection();
			//query string for alter the id as primary key
			String query = "alter table students add constraint addPrimary primary key(id)";
			PreparedStatement ps = con.prepareStatement(query);
			ps.executeUpdate();//execution of query
			System.out.println("Updated");
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void alterColumn() {
		Connection con;
		try {
			con = ConnectionUtil.getConnection();
			//query string for add a column named as age
			String query = "alter table students add age number(10)";
			PreparedStatement ps = con.prepareStatement(query);
			ps.executeUpdate();//execute the query
			System.out.println("Table Updated!");
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void updateData() {
		Connection con;
		try {
			con = ConnectionUtil.getConnection();
			//query string for update the data of age
			String query = "Update Students set age = 25 where id = 1";
			PreparedStatement ps = con.prepareStatement(query);
			ps.executeUpdate();//execution of query
			System.out.println("Table Updated!");
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
//	public void addCheck() {
//		Connection con;
//		try {
//			con = ConnectionUtil.getConnection();
//			String query = "alter table students add constraint chk_age check(age > 20)";
//			PreparedStatement ps = con.prepareStatement(query);
//			ps.executeUpdate();
//			System.out.println("Table Updated!");
//		}
//		catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	
	//method in student return type for display the data stored in the database
	public List<Students> displayData() {
		Connection con;
		ArrayList<Students> data = new ArrayList<Students>(); //array creation in Students type
		try {
			con = ConnectionUtil.getConnection();
			String query = "select * from students";//query string for select all data from the database
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();//execution of query
			while(rs.next()) {
				int id = rs.getInt(1);//get id from the database
				String name = rs.getString(2);//get name from the database
				String email = rs.getString(3);//get email from the database
				int age = rs.getInt(4);//get age from the database
				Students stud = new Students();//object creation for Students class
				stud.idSetter(id);
				stud.nameSetter(name);
				stud.emailSetter(email);
				stud.ageSetter(age);
				data.add(stud);
				
			}
			System.out.println("Table Updated!");
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return data;
	}
	
	public void deleteStudRecord(int id) {
		try {
			Connection con = ConnectionUtil.getConnection();
			String q1 = "Delete from Students where id =?";//query string for delete record from the database
			PreparedStatement ps1 = con.prepareStatement(q1);
			ps1.setInt(1, id);
			ps1.executeUpdate();//execute the query
			System.out.println("Deleted!");
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
