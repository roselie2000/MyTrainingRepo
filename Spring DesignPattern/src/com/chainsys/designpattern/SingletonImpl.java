package com.chainsys.designpattern;

public class SingletonImpl {

	public static void main(String args[]) {
		SingletonClass text = SingletonClass.getInstance();
		System.out.println(text.msg);;
	}
	
}
