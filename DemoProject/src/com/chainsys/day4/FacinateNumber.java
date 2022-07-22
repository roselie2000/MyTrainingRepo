package com.chainsys.day4;

import java.util.Scanner;

public class FacinateNumber {

	// method for getting number and concate the number
	public String getNumber() {
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sn.nextInt();
		String num1 = Integer.toString(n * 2);
		String num2 = Integer.toString(n * 3);
		String facNumber = n + num1 + num2;
		System.out.println(facNumber);
		return facNumber;
	}

	// method for check whether the number is facinate or not
	public void checkFacNumber(String fac) {
		String msg = "true";
		for (char c = '1'; c <= '9'; c++) {
			int count = 0;
			for (int j = 0; j < fac.length(); j++) {

				char ch = fac.charAt(j);
			//	System.out.println(ch);
				if (c == ch) {

					count++;
					System.out.println(count);

				}
				if ((count > 1) || (count == 0)) {
					msg = "false";
					break;
				}
			}

		}
		if (msg.equals("false")) {
			System.out.println("The number is not facinate number");
		} else {
			System.out.println("The number is facinate number");
		}
	}
}
