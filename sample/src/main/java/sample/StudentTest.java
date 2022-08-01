package sample;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		Studentsdb tc = new Studentsdb();
		Scanner sn = new Scanner(System.in);
		
		System.out.println("Enter an option:");
		System.out.println("Enter 'c' for create a table");
		System.out.println("Enter 'i' for insert a date");
		System.out.println("Enter 'd' for display all data");
		System.out.println("Enter 'del' for delete a record");
		String option = sn.next();
		if(option.equals("c")) {
			System.out.println("Table already created.");
		}
		else if(option.equals("i")) {
			System.out.println("Enter student name :");
			String name = sn.next();
			System.out.println("Enter student email :");
			String email = sn.next();
			System.out.println("Enter student age :");
			int age = sn.nextInt();
			tc.insertData(name, email, age);
		}
		else if(option.equals("d")) {
			ArrayList<Students> data = new ArrayList<Students>(); 
			data = (ArrayList<Students>) tc.displayData();
			System.out.println("Data");
			for(int i=0; i<data.size(); i++) {
				System.out.println(data.get(i).idGetter() + " " +data.get(i).nameGetter() + " " + data.get(i).emailGetter() + " " + data.get(i).ageGetter());
			}
		}
		else if(option.equals("del")) {
			System.out.println("Enter a id for delete :");
			int id = sn.nextInt();
			tc.deleteStudRecord(id);
		}

	}

}
