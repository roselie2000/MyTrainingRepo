package com.chainsys.day1.assignment1;

import java.util.Scanner;

public class ShopBillMagmt {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Quantity");
		int quantity=sc.nextInt();
		int amount=quantity*100;
		if(quantity>10) {
			int discount = (amount * 10) / 100;
			int totalCost = amount - discount;
			System.out.println("Discount Amount :" + discount);
			System.out.println("Total cost is :"+totalCost);
		}
		else {
			System.out.println("Amount is :"+amount);
		}		
	}

}
