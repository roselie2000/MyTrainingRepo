package filemgmt.test;

import java.util.Scanner;

import filemgmt.FileOpereationClass;

public class FileOperationTest {

	public static void main(String[] args) {
		FileOpereationClass foc = new FileOpereationClass();//create object for FileOpereationClass
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter 'c' for create a file");
		System.out.println("Enter 'w'for write a file");
		System.out.println("Enter 'r' for read a file");
		System.out.println("Enter 'd' for delete a file");
		System.out.println("Enter your option :");
		String msg = sn.next();
		if(msg.equals("c")) {
			System.out.println("************************Creating!******************************");
			foc.createFile();//calling create method
		}
		else if(msg.equals("w")) {
			System.out.println("************************Writing!******************************");
			foc.writeFile();//calling write method
		}
		else if(msg.equals("r")) {
			System.out.println("************************Reading!******************************");
			foc.readFile();//calling read method
		}
		else if(msg.equals("d")) {
			System.out.println("************************Deleting!******************************");
			foc.deleteFile();//calling delete method
		}	
	}

}
