package sample;

import java.time.LocalDate;
import java.util.Scanner;

public class AgeCalculator {

		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter DOB");
			String dob = s.next();
			LocalDate birthday = LocalDate.parse(dob);
			LocalDate today = LocalDate.now();
			
			int i = today.compareTo(birthday);
			System.out.println(i);
			LocalDate days = today.minusDays(i);
			System.out.println(days);
			
			int dayOfMonth = birthday.getDayOfMonth();
			System.out.println(dayOfMonth);
		}
}


