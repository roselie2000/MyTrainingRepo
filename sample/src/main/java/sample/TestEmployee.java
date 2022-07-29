package sample;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class TestEmployee {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Employee emp = new Employee();
		Employeedb emp1 = new Employeedb();
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter any option :");
		System.out.println("Enter 'i' for insert");
		System.out.println("Enter 'u' for update");
		System.out.println("Enter 'dis' for Display");
		System.out.println("Enter 'd' for Delete");
		String option = sn.next();
		if(option.equals("i")) {
			System.out.println("Enter employee id :");
			int id = sn.nextInt();
			emp.setId(id);
			
			System.out.println("Enter employee name :");
			String name = sn.next();
			emp.setName(name);
			
			System.out.println("Enter employee designation :");
			String desig = sn.next();
			emp.setDesignation(desig);
			
			System.out.println("Enter employee salary :");
			int salary = sn.nextInt();
			emp.setSalary(salary);
			
			emp1.insertData(emp);
			emp1.displayData();
		}
		else if(option.equals("u")) {
			System.out.println("Enter a employee id which is want ot update :");
			int empid = sn.nextInt();
			emp1.updateData(empid);
			emp1.displayData();
		}	
		else if(option.equals("dis")) {
			emp1.displayData();
		}
		else if(option.equals("d")) {
			System.out.println("Enter a employee id which is want to delete :");
			int empid = sn.nextInt();
			emp1.deleteData(empid);
			emp1.displayData();
		}
		else {
			System.out.println("Please enter a valid option");
		}
	}
		
}

