package com.chainsys.day3.assignment3;

import java.util.Scanner;

public class QuesAnswerClass {
	Scanner sn = new Scanner(System.in);
	
	public void getAnswer() {
		System.out.println("Is it raining?");
		String answer = sn.next();
		if (answer.equals("y")) {
			System.out.println("Please get an umbrella.");
		}
		System.out.println("Enter the current surrounding tenperature :");
		int temperature = sn.nextInt();
		if(temperature <= 32) {
			System.out.println("Please bring a heavy jacket");
		}
		else {
			if((temperature > 32) && (temperature <= 50)) {
				System.out.println("Please bring a light jacket");
			}
			else {
				System.out.println("No need to bring jackets");
			}
			}
	}
}
