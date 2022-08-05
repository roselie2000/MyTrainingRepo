package com.chainsys.hackerearth;

import java.util.Scanner;

public class Excursion {

	public static void main(String[] args) {
		//solved
		Scanner sn = new Scanner(System.in);
		int rooms;
		System.out.println("Enter t :");
		int t = sn.nextInt();
		for(int i=0; i<t; i++) {
			System.out.println("Enter n:");
			int n = sn.nextInt();
			System.out.println("Enter m :");
			int m = sn.nextInt();
			System.out.println("Enter k :");
			int k = sn.nextInt();
			if((n % k != 0) && (m % k != 0) ) {
				rooms = ((n/k) + 1) + ((m/k)+1);
			}
			else {
				rooms = (n/k) + (m/k);
			}
			System.out.println(rooms);
		}
		
	}

}
