package com.chainsys.day4;

public class ArrayObjectClass {
		public int id;
	    public String name;
	  
	    // Student class constructor
	    public ArrayObjectClass(int id, String name)
	    {
	        this.id = id;
	        this.name = name;
	    }
	  
	    // display() method to display
	    // the student data
	    public void display()
	    {
	        System.out.println("Student id is: " + id + " "
	                           + "and Student name is: "
	                           + name);
	      
	    }
}
