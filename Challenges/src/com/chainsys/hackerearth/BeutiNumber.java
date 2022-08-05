package com.chainsys.hackerearth;

import java.util.Scanner;

public class BeutiNumber {
//partially solved
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		String msg = "Yes";
		System.out.println("Enter :");
		int t = sn.nextInt();
		for(int i =0; i<t; i++) {
			System.out.println("Enter x :");
			int x = sn.nextInt();
			System.out.println("ENter k :");
			int k = sn.nextInt();
			while(x > 0) {
				int ans = x % k;
				if(ans > 1) {
					msg = "No";
					break;
				}
				else {
					x = x / k;
				}
			}
			System.out.println(msg);
		}

	}

}
