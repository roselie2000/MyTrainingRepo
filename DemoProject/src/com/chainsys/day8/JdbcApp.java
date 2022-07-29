package com.chainsys.day8;

public class JdbcApp {

	private String username;
	private int empno;
	private long contactNumber;
	private int salary;
	private String designation;
	
	JdbcApp(){
		
	}
	
	JdbcApp(String username, int empno, long contactNumber, int  salary, String designation){
		this.username = username;
		this.empno = empno;
		this.contactNumber = contactNumber;
		this.salary = salary;
		this.designation = designation;
	}
	
	public void setUserName(String username) {
		this.username = username;
	}
	
	public String getUserName() {
		return username;
	}
	
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	
	public int getEmpno() {
		return empno;
	}
	
	public void setContact(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	public long getContact() {
		return contactNumber;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public long getSalary() {
		return salary;
	}
	
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public String getDesignation() {
		return designation;
	}
	
	
}
