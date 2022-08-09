package com.chainsys.streams;

import java.util.ArrayList;

public class EmployeeAnalysis {

	public static void main(String args[]) {
		ArrayList<Employee> emp = new ArrayList<Employee>();
		Employee employee = new Employee();
		Employee emp1 = new Employee(3001, "Roselie", 22, "Female", "Development", 25000, 2021);
		Employee emp2 = new Employee(3002, "Rishi", 21, "Female", "IT", 28000, 2022);
		Employee emp3 = new Employee(3003, "Tiny", 35, "Female", "Development", 33000, 2018);
		Employee emp4 = new Employee(3004, "Bob", 28, "Male", "HR", 40000, 2015);
		Employee emp5 = new Employee(3005, "Ani", 41, "Female", "HR", 42000, 2022);
		Employee emp6 = new Employee(3006, "Karthi", 25, "Male", "Development", 43000, 2020);
		Employee emp7 = new Employee(3007, "Alex", 46, "Male", "IT", 22000, 2022);
		emp.add(emp1);
		emp.add(emp2);
		emp.add(emp3);
		emp.add(emp4);
		emp.add(emp5);
		emp.add(emp6);
		emp.add(emp7);
		
		int n = employee.NoOfMale(emp);
		System.out.println("No.Of Male Employee :" + n);
		int f = employee.NoOfFemale(emp);
		System.out.println("No.Of Male Employee :" + n);
		employee.getMaxSalary(emp);
		employee.getMinSalary(emp);
		employee.getHRName(emp);
		employee.getOlderEmp(emp);
		employee.getNoOfDeptEmp(emp);
		employee.getAvgSalaryMale(emp);
		employee.getAvgSalaryFemale(emp);
		employee.getAvgTotSalary(emp);
		employee.createMap(emp);
	}
	
	
	
}
