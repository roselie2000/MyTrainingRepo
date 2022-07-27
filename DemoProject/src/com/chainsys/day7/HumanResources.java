package com.chainsys.day7;

import java.util.Scanner;

public class HumanResources extends Manager{

	String task[];
	String branch = "Madurai";
	@Override
	public void task() {
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter No of Tasks");
        int n = sn.nextInt();
        task = new String[n];
        for(int j=0;j<n;j++)
        {
            System.out.println("Enter the Task");
            task[j]=sn.next();
        }
	}
	
	@Override
	public void displayTask() {
		System.out.println(branch);
		System.out.println("The task assign by Manager from Ayanambakam branch to Madurai");
		for (String values : task) {
            System.out.println(values);
        }
		System.out.println("*******************************************************************");		
	}
	
	public void display() {
//		System.out.println(task);
//		System.out.println(super.branch);
		
		super.displayTask();
		
		
	}
}
