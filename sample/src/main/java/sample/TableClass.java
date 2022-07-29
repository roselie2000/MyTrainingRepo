package sample;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TableClass {

	public void createTable(String tableName) {
		
		Connection con;
		try {
			con = ConnectionUtil.getConnection();
			String createQuery = "create table student(id number(10), name varchar(30))";
			PreparedStatement ps = con.prepareStatement(createQuery);
			ps.executeUpdate(createQuery);
			System.out.println("created");
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void insertData(String name, String email, int age) {
		Connection con;
		int id = 0;
		try {
			
			con = ConnectionUtil.getConnection();
			String query1 = "select id_autono.nextval from dual";
			PreparedStatement ps = con.prepareStatement(query1);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				id = rs.getInt(1);
			}
			String query = "insert into students(id, name, email, age)values(?, ?, ?, ?)";
			PreparedStatement ps1 = con.prepareStatement(query);
			ps1.setInt(1, id);
			ps1.setString(2, name);
			ps1.setString(3, email);
			ps1.setInt(4, age);
			ps1.executeUpdate();
			System.out.println("created!");
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void altertable() {
		Connection con;
		try {
			con = ConnectionUtil.getConnection();
			String query = "alter table students add constraint addPrimary primary key(id)";
			PreparedStatement ps = con.prepareStatement(query);
			ps.executeUpdate();
			System.out.println("Updated");
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void alterColumn() {
		Connection con;
		try {
			con = ConnectionUtil.getConnection();
			String query = "alter table students add age number(10)";
			PreparedStatement ps = con.prepareStatement(query);
			ps.executeUpdate();
			System.out.println("Table Updated!");
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void updateData() {
		Connection con;
		try {
			con = ConnectionUtil.getConnection();
			String query = "Update Students set age = 25 where id = 1";
			PreparedStatement ps = con.prepareStatement(query);
			ps.executeUpdate();
			System.out.println("Table Updated!");
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
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
	
	public List<Students> displayData() {
		Connection con;
		ArrayList<Students> data = new ArrayList<Students>(); 
		try {
			con = ConnectionUtil.getConnection();
			String query = "select * from students";
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				int age = rs.getInt(4);
				Students stud = new Students();
				stud.idSetter(id);
				stud.nameSetter(name);
				stud.emailSetter(email);
				stud.ageSetter(age);
				data.add(stud);
				
			}
			System.out.println("Table Updated!");
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
	}
	
	public void deleteStudRecord(int id) {
		try {
			Connection con = ConnectionUtil.getConnection();
			String q1 = "Delete from Students where id =?";
			PreparedStatement ps1 = con.prepareStatement(q1);
			ps1.setInt(1, id);
			ps1.executeUpdate();
			System.out.println("Deleted!");
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
