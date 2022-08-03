package com.chainsys.hackerearth;

import java.util.Scanner;

public class DividedClass {

	public static void main(String args[]) {
		
		Scanner sn = new Scanner(System.in);
		String ans;
        StringBuilder number = new StringBuilder();
        System.out.println("Enter n value :");
        int n = sn.nextInt();
        System.out.println("ENter");
        int[] data = new int[n];
        for(int i=0; i<n; i++){
            data[i] = sn.nextInt();
        }
        
        for(int i=0; i<n; i++){
            String num = String.valueOf(data[i]);
            int len = num.length();
            number.append(num.charAt(len-1));
        }
        System.out.println(number);
        if(number.charAt(n-1) == '0') {
        	ans = "Yes";
        }
        else {
        	ans = "No";
        }
        System.out.println(ans);
	}

}
