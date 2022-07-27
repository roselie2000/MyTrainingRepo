package com.chainsys.day7.test;

import java.util.Scanner;

import com.chainsys.day7.Manager;

public class HumanResource extends Manager{

	String branch = "Madurai";
	String task[];
	@Override
	public void task() {
		
		System.out.println("\n");
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter No of Tasks");
        int n = sn.nextInt();
        task = new String[n];
        for(int j=0;j<n;j++)
        {
            System.out.println("Enter the Task");
            task[j]=sn.next();
        }
        
        System.out.println("Branch :" + branch);
		System.out.println("The HR from Madurai assign the task to the employees");
        System.out.println("The total task asign to the employees");
        System.out.println("ToDo are :");
        for (String values : task) {
            System.out.println(values);
        }
		
        System.out.println(super.branch);
        System.out.println(super.task);
//        for (String values : super.task) {
//            System.out.println(values);
//        }
	}
	
}
