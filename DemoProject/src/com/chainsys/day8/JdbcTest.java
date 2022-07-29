package com.chainsys.day8;

public class JdbcTest {

	public static void main(String[] args) {
		
		DbConn emp1 = new DbConn();
		JdbcApp jdbc = new JdbcApp();
		
		jdbc.setUserName("Roselie");
		jdbc.setEmpno(3001);
		jdbc.setContact(6378749231l);
		jdbc.setDesignation("Trainee");
		jdbc.setSalary(27000);
		
		emp1.saveEmp(jdbc);
	}

}
