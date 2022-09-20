package sample;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateClass {

	public static void main(String args[]) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter a Date :");
		String date = sn.next();
		DateTimeFormatter datetimeformat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dobDate = LocalDate.parse(date, datetimeformat);
		Date sqlDate = Date.valueOf(dobDate);
		System.out.println("Local Date :" + dobDate);
		
		LocalDate locdate = sqlDate.toLocalDate();
		System.out.println("SQL Date" +locdate);
		
		System.out.println("Enter no of days for add :");
		int n = sn.nextInt();
		locdate = locdate.plusDays(n);
		
		
		System.out.println("Date with addition of " + n + ": " + locdate);
	}
}
