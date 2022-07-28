package com.chainsys.day8;

public class Employee {

	String name;
	int empno;
	int salary;
	public Employee(String name,int empno,int salary) {
		this.name = name;
		this.empno = empno;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", empno=" + empno + ", salary=" + salary + "]";
	}
}
