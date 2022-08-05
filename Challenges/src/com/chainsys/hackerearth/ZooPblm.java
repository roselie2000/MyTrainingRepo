package com.chainsys.hackerearth;

import java.util.Scanner;

public class ZooPblm {

	public static void main(String args[]) {
		//solved
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter a String :");
		int x = 0;
		int y = 0;
		String zooString = sn.next();
		for(int i=0; i<zooString.length(); i++) {
			if(zooString.charAt(i) == 'z') {
				x += 1;
			}
			else if(zooString.charAt(i) == 'o') {
				y += 1;
			}
			else {
				System.out.println("enter only z and o");
			}
		}
		if(2*x == y) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}
