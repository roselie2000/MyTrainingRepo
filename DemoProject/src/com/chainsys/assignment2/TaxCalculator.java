package com.chainsys.assignment2;

public class TaxCalculator {
	int tax, tax1, tax2, tax3;
	
	public void taxCalculator(int grossSalary, int savings) {
		int taxableIncome = grossSalary - savings;
		if(taxableIncome <= 100000) {
			tax = 0;
			System.out.println(tax);
		}
		else if((taxableIncome > 100000) && (taxableIncome <= 200000)) {
			tax1 = (taxableIncome * (100 - 10)) / 100;
			System.out.println(tax1);
		}
		else if((taxableIncome > 200000) && (taxableIncome <= 500000)) {
			tax2 = tax+tax1+(taxableIncome * (100 - 20)) / 100;
		}
		else {
			tax3 = tax+tax1+tax2+(taxableIncome * (100-30) / 100);
		}
	}
}
