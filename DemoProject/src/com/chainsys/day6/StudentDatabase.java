package com.chainsys.day6;

public class StudentDatabase {

	String name;
	int age;
	String address;
	public StudentDatabase() {
		name = "Unknown";
		age = 0;
		address = "Not Available";
	}
	
	public void setInfo(String name, int age) {
		System.out.println("Name :" + name);
		System.out.println("Age :" + age);
	}
	
	public void setInfo(String name, int age, String address) {
		System.out.println("Name :" + name);
		System.out.println("Age :" + age);
		System.out.println("Address :" + address);
	}
	
	@Override
	public String toString() {
		return "StudentOverloading [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
}
