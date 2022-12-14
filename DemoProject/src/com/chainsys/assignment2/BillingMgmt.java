package com.chainsys.assignment2;

import java.util.Scanner;

public class BillingMgmt {
	//data members of BillingMgmt
		int quantity = 0;
		int price = 0;
		
		//Getting the quantity and price from the user
		public void getInfor() {
			int msg = 1;
			int sum = 0;
			Scanner sn = new Scanner(System.in);
			
			/* Here the while ask the user for continue the process
			 * Until the end of the process the user want to enter the quantity and price */
			
			while(msg == 1) {
				System.out.println("Enter the quantity of the product"); //Get the quantity
				quantity = sn.nextInt();
				
				System.out.println("Enter the price of the product");// Get the price
				price = sn.nextInt();
				
				int prodPrice = priceCalc(); // Calculate the total cost of the product
				System.out.println(prodPrice);
				
				sum += prodPrice;
				
				System.out.println("Are you want to continue the process. If you want click '1'");
				msg = sn.nextInt();
			}
			System.out.println("Total Amount: " + discountCalc(sum));
		}
		
		// Calculating the total price of purchased product
		public int priceCalc() {
			int total = quantity * price;
			return total;
		}
		
		//Calculating the discount
		public int discountCalc(int sum) {
			int discount = sum > 1000 ? (sum * 10) / 100 : 0;
			System.out.println("Discount Amount :" + discount);
			int total = sum - discount;
			return total;
		}
}
