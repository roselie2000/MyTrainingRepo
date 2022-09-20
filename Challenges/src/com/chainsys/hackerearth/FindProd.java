package com.chainsys.hackerearth;

import java.util.Scanner;

public class FindProd {

	public static void main(String[] args) {
		double prod = 1;
		double cont = Math.pow(10, 9) + 7;
		System.out.println(cont);
		Scanner sn = new Scanner(System.in);
		int n = sn.nextInt();
		double arr[] = new double[n];
		for(int i=0; i<n; i++) {
			arr[i] = sn.nextInt();
			prod = (prod * arr[i]) % cont;
		}
		System.out.println(Math.round(prod));
	}

}
