package Assignment;

import java.util.Scanner;

public class SalaryCalculationTest {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter the Salary :");
			int salary = scan.nextInt();
			if(salary > 8000) {
				System.out.println("Salary too large");
			}
			else if(salary < 0) {
				System.out.println("Salary too small");
			}
			System.out.println("Enter no. of shifts :");
			int shifts = scan.nextInt();
			if(shifts < 0) {
				System.out.println("Shifts too small");
			}
			SalaryCalculation salaryCalculation = new SalaryCalculation();
			salaryCalculation.calculateSal(salary, shifts);
		}
	}
}
