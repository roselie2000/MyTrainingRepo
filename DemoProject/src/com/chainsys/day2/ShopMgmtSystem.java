package com.chainsys.day2;

import java.util.Scanner;

public class ShopMgmtSystem {
	
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		
		//Getting Quantity of Purchased things
		System.out.println("Enter the Quantity of things Purchased: ");
		int quantity = sn.nextInt();
		
		int total = quantity * 100; //Calculate the total value
		System.out.println(total);
		
		// Check whether the total value is greater than 1000 and calculate the discount
		int discount = total > 1000 ? (total * 10) / 100 : 0;
		float amount = total - discount;
		System.out.println("Discount :" + discount);
		System.out.println("Amount :" + amount);
		
		ShopMgmtSystem sms = new ShopMgmtSystem();
	}
}
