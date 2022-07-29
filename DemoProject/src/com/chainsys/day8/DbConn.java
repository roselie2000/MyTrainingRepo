package com.chainsys.day8;

import java.sql.Connection;
//import java.sql.PreparedStatement;
import java.sql.SQLException;


public class DbConn {

	JdbcApp emp = new JdbcApp();

	public void saveEmp(JdbcApp emp2) {
		Connection con;
		try {
			con = JdbcConnection.getConnection();
//			String save = "insert into employee(id,name,designation,basicsalary)values(?,?,?,?)";
//			PreparedStatement ps = con.prepareStatement(save);


		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
