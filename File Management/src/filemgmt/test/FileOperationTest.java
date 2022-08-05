package filemgmt.test;

import java.util.Scanner;

import filemgmt.FileOpereationClass;

public class FileOperationTest {

	public static void main(String[] args) {
		FileOpereationClass foc = new FileOpereationClass();//create object for FileOpereationClass
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter 'c' for create a file");
		System.out.println("Enter 'w'for write a file");
		System.out.println("Enter 'a'for append a file");
		System.out.println("Enter 'md'for append a file");
		System.out.println("Enter 'r' for read a file");
		System.out.println("Enter 'd' for delete a file");
		System.out.println("Enter 'rn' for rename the file");
		System.out.println("Enter 'cp' for copy the file to another file");
		System.out.println("Enter 'm' for move the file to another place");
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
		else if(msg.equals("a")) {
			System.out.println("************************Appending!******************************");
			foc.appendFile();//calling write method
		}
		else if(msg.equals("md")) {
			System.out.println("************************Modifying!******************************");
			foc.modifyFile();//calling write method
		}
		else if(msg.equals("r")) {
			System.out.println("************************Reading!******************************");
			foc.readFile();//calling read method
		}
		else if(msg.equals("d")) {
			System.out.println("************************Deleting!******************************");
			foc.deleteFile();//calling delete method
		}
		else if(msg.equals("rn")) {
			System.out.println("************************Renaming!******************************");
			foc.RenameFile();
		}
		else if(msg.equals("cp")) {
			System.out.println("************************Copying!******************************");
			foc.copyFile();
		}
		else if(msg.equals("m")) {
			System.out.println("************************Moving!******************************");
			foc.moveFile();
		}
	}

}
