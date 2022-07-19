package com.chainsys.assignment1;

import java.util.Scanner;

public class ShopManagement {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		
		//Getting Quantity of Purchased things
		System.out.println("Enter the Quantity of things Purchased: ");
		int quantity = sn.nextInt();
		
		int total = quantity * 100; //Calculate the total value
		System.out.println(total);
		
		// Check whether the total value is greater than 1000 and calculate the discount
		if(total > 1000) {
			float discount = (total * 10) / 100;
			float amount = total - discount;
			System.out.println("Discount :" + discount);
			System.out.println("Amount :" + amount);
		}
		else {
			System.out.println("Discount : 0 ");
			System.out.println("Amount :" + total);
		}

		}
}
