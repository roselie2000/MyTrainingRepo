package com.chainsys.day8;

import java.util.Stack;

public class StackClass {

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		System.out.println(st.capacity());
		st.add(1);
		st.add(3);
		st.add(1);
		System.out.println(st);
		System.out.println(st.capacity());
		System.out.println(st.lastIndexOf(1));
		System.out.println(st.remove(1));
		System.out.println(st);
		System.out.println(st.removeAll(st));
		System.out.println(st);
	}

}
