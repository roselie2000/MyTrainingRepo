package com.chainsys.hackerearth;

import java.util.Scanner;

public class toggleString {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter a String :");
		String s = sn.next();
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<s.length(); i++) {
			if(Character.isUpperCase(s.charAt(i))) {
				sb.append(Character.toLowerCase(s.charAt(i)));
			}
			else if(Character.isLowerCase(s.charAt(i))) {
				sb.append(Character.toUpperCase(s.charAt(i)));
			}
		}
		
		System.out.println(sb);
	}

}
