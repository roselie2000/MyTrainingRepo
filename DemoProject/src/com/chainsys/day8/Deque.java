package com.chainsys.day8;

import java.util.ArrayDeque;

public class Deque {

	public static void main(String[] args) {
		ArrayDeque<Employee> dq=new ArrayDeque<Employee>();
		
		Employee e=new Employee("Roselie", 3001, 20000);
		
		dq.add(e);
		System.out.println(dq);

		dq.addLast(new Employee("tyur", 4657, 200000));
		System.out.println(dq);
	}

}
