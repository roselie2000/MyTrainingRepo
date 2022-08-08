package filemgmt;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println("today: " + today);				
		DateTimeFormatter datetimeformat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String format = datetimeformat.format(today);
		System.out.println(format);

		String dob="19/09/1976";  // dd/mm/yyyy
		LocalDate dobDate = LocalDate.parse(dob, datetimeformat);
		System.out.println(dobDate); // yyyy-mm-dd
		
	}

}