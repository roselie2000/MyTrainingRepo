package com.chainsys.day7;

import java.util.ArrayList;

public class CollectionArrayList {

	public static void main(String args[]) {
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
	}
}
