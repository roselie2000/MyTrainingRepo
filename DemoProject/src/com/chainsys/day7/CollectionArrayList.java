package com.chainsys.day7;

import java.util.ArrayList;
import java.util.LinkedList;

public class CollectionArrayList {

	public static void main(String args[]) {
		//Array list
		System.out.println("Array List");
		ArrayList<String> list1 = new ArrayList<String>();  
		ArrayList<String> list2 = new ArrayList<String>();  
		list1.add("Apple");
		list1.add("Orange");
		list2.add("Rose");
		list2.add("Lily");
		System.out.println(list1);
		list1.clear();
		System.out.println(list1);
		list1.add("Apple");
		list1.add("Orange");
		System.out.println(list1.contains("Apple"));
		list1.equals(list1);
		System.out.println(list1.equals(list2));
		System.out.println(list1.get(0));
		
		//Linked list
		System.out.println("Linked List");
		LinkedList<String> flowers1= new LinkedList<String>();
		flowers1.add(0, "Rose");
		flowers1.addLast("Lily");
		LinkedList<String> flowers2 = (LinkedList<String>) flowers1.clone();
		System.out.println(flowers2);
		System.out.println(flowers1.element());
		System.out.println(flowers1.getClass());
		System.out.println(flowers1.peek());
		System.out.println(flowers1.peekLast());
		System.out.println(flowers1.size());
		System.out.println(flowers1.isEmpty());
	}
}
