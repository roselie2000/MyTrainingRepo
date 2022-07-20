package com.chainsys.assignment2;

import java.util.Scanner;

public class PlaceOfService {
	Scanner sn = new Scanner(System.in);

	// Get all Information from the user
	public void getInfo() {
		System.out.println("Enter your Age :");// Getting Age
		int age = sn.nextInt();
		if (age > 0) {
			System.out.println("Enter your sex :");
			String sex = sn.next();
			if (sex.equals("M") || sex.equals("F")) {
				System.out.println("Enter your Martial Status (if yes enter 'y' otherwise enter 'n') :");
				String martialStatus = sn.next();
				if(martialStatus.equals("y") || martialStatus.equals("n")) {
					String result = displayServicePlace(age, sex, martialStatus);
					System.out.println(result);
				}
				else {
					System.out.println("ERROR");
				}
			}

			else {
				System.out.println("ERROR");
			}

		} else {
			System.out.println("ERROR");
		}
	}

	public String displayServicePlace(int age, String sex, String maritalStatus) {
		switch (sex) {
		case "F":
			return "Urban Areas";
		case "M":
			if ((age >= 20) && (age <= 40)) {
				return "Anywhere";
			} else if ((age >= 40) && (age <= 60)) {
				return "Urban Areas";
			}
		default:
			return "ERROR";
		}
	}
}
