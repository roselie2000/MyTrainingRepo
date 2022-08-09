package com.chainsys.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employee {

	//Data members
	int empId;
	String empName;
	int age;
	String gender;
	String department;
	int salary;
	int yearOfJoin;

	//Default Constructor
	public Employee() {
		
	}
	Employee(int empId, String empName, int age, String gender, String department, int salary, int yearOfJoin){
		this.empId = empId;
		this.empName = empName;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.salary = salary;
		this.yearOfJoin = yearOfJoin;
	}
	
	public int getSalary() {
		return salary;
	}
	
	//method for find the no. of Employees 
	public int NoOfMale(ArrayList<Employee> emp) {
		Stream<Employee> empList = emp.stream();
		//filter() filer the male employee and count() count the number
		int n = (int) empList.filter(s -> s.gender.startsWith("M")).count();
		return n;
	}
	
	public int NoOfFemale(ArrayList<Employee> emp) {
		Stream<Employee> empList = emp.stream();
		//filter() filer the female employee and count() count the number
		int n = (int) empList.filter(s -> s.gender.startsWith("F")).count();
		return n;
	}
	
	public void getHRName(ArrayList<Employee> emp) {
		Stream<Employee> empList = emp.stream();
		System.out.println("HR :");
		//filter() filer the HR employee and forEach() print each name of the HR
		empList.filter(s -> s.department == "HR").forEach(s -> System.out.println(s.empName));
	}
	
	public void getOlderEmp(ArrayList<Employee> emp) {
		Stream<Employee> empList = emp.stream();
		System.out.println("Older Employees name");
		//filter() filters the employee who is older than 35 and forEach() print each name, age, salary of each employee
		empList.filter(s -> s.age > 35).forEach(s -> System.out.println(s.empName + " " +s.age + " " + s.salary));
	}
	
	public void getMaxSalary(ArrayList<Employee> emp) {
		/*
		 * First Comparator.comparing() compare each salary of the employee
		 * Next maxBy() find the maximum salary 
		 * collect() store the maximum salary*/
	        Optional<Employee> maxSalaryEmp = emp.stream()
	                .collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
	        //here if the maxSalaryEmp have value then get all details of the employee who get the maximum salary
	        System.out.println("Employee with max salary:" + (maxSalaryEmp.isPresent() ? maxSalaryEmp.get().empName : "Not Applicable"));
	}
	
	public void getMinSalary(ArrayList<Employee> emp) {
		/*
		 * First Comparator.comparing() compare each salary of the employee
		 * Next minBy() find the minimum salary 
		 * collect() store the minimum salary*/
        Optional<Employee> minSalaryEmp = emp.stream()
                .collect(Collectors.minBy(Comparator.comparing(Employee::getSalary)));
        //here if the minSalaryEmp have value then get all details of the employee who get the minimum salary
        System.out.println("Employee with min salary:" + (minSalaryEmp.isPresent() ? minSalaryEmp.get().empName : "Not Applicable"));
}
	
	public void getNoOfDeptEmp(ArrayList<Employee> emp) {
		Stream<Employee> empList1 = emp.stream();
		int ItDeptEmp = (int) empList1.filter(s -> s.department == "IT").count();
		Stream<Employee> empList2 = emp.stream();
		int DevptEmp = (int) empList2.filter(s -> s.department == "Development").count();
		Stream<Employee> empList3 = emp.stream();
		int HrEmp = (int) empList3.filter(s -> s.department == "HR").count();
		System.out.println("No. of Employees in IT Department  :" + ItDeptEmp);
		System.out.println("No. of Employees in Development Department  :" + DevptEmp);
		System.out.println("No. of Employees in Hr Department  :" + HrEmp);
	}
	
	public void getAvgSalaryMale(ArrayList<Employee> emp) {
		Stream<Employee> empList = emp.stream();
		int n = NoOfMale(emp);//return the no. of male employees
		/*
		 * filter() filter all male employee details
		 *and mapToInt() get the salary of male
		 *sum() sum all the salary of the male */
		int sum = empList.filter(s -> s.gender == "Male").mapToInt(s -> s.salary).sum();
		System.out.println("Average Salary of Male : " + sum/n);
	}
	
	public void getAvgSalaryFemale(ArrayList<Employee> emp) {
		Stream<Employee> empList = emp.stream();
		int n = NoOfFemale(emp);
		/*
		 * filter() filter all male employee details
		 *and mapToInt() get the salary of male
		 *sum() sum all the salary of the male */
		int sum = empList.filter(s -> s.gender == "Female").mapToInt(s -> s.salary).sum();
		System.out.println("Average Salary of Female : " + sum/n);
	}
	
	public void getAvgTotSalary(ArrayList<Employee> emp) {
		Stream<Employee> empList = emp.stream();
		/*
		 * mapToInt() get all salary of the Employees
		 * sum() add all the employees salary*/
		
		int sum = empList.mapToInt(s -> s.salary).sum();
		System.out.println("Total salary of the Employees :" + sum);
		Stream<Employee> empList1 = emp.stream();
		int n = (int) empList1.count();
		System.out.println("Average salary of the Employess :" + sum/n);
	}
	
	public void createMap(ArrayList<Employee> emp) {
		/*
		 * Function.identity() returns the input arguments of the function*/
		Map<Object, Employee> empMap = emp.stream().collect(Collectors.toMap(x -> x.empId, Function.identity()));
		System.out.println("Employee Name :" + empMap.get(3001).empName + "  " + empMap.get(3002).empName + "  "
				+ empMap.get(3003).empName + "  " + empMap.get(3004).empName + "  " + empMap.get(3005).empName
				+ "  " + empMap.get(3006).empName + "  " + empMap.get(3007).empName);
		
	}
}
