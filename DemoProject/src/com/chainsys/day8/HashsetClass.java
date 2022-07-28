package com.chainsys.day8;

import java.util.HashSet;
import java.util.Set;

public class HashsetClass {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(2);
		set.add(3);
		System.out.println(set);
		System.out.println(set.size());
		System.out.println(set.stream());
		System.out.println(set.toArray());
		set.clear();
		System.out.println(set);
	}

}
