package filemgmt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class FileOpereationClass {

	//method for check whether the file is exist or not
	public Boolean checkExist(File obj) {
		try {
			if(obj.exists()) {
				//If the file exist return the following
				System.out.println("File is already created!");
				System.out.println("File path :" + obj.getAbsolutePath());
				return true;
			}
			else {
				//otherwise false
				return false;
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	//method for create a file
	public void createFile() {
		try {
			File myfile = new File("textfile.txt");//create a file object
			if(!checkExist(myfile)) {
				myfile.createNewFile();//create a new file
			}	
			else {
				System.out.println("File created");
				System.out.println("The file can be read :" + myfile.canRead());
				System.out.println("The file can be write :" + myfile.canWrite());
				System.out.println("The name of the file :" + myfile.getName());
				System.out.println("Parent of the file :"+ myfile.getParent());
				System.out.println("Total space allocated to file is "+ myfile.getTotalSpace());
				System.out.println("Last modified time in miliseconds :" + myfile.lastModified());
				System.out.println("Total length of the file :"+ myfile.length());
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//method for write a file
	public void writeFile() {
		File f = new File("textfile.txt");//create a file object
		//check whether the file is exist are not
		if(checkExist(f)) {
			try {
				FileWriter writer = new FileWriter(f);//create a writer object
				System.out.println("File writing!");
				writer.write("This is my new file. which is created through java.");//write the content
				System.out.println("Writing completed!");
				
				BufferedWriter wt = new BufferedWriter(writer);//create a BufferWriter object
				System.out.println("Buffer Writting!");
				wt.newLine();//it go to the next line of the file.
				wt.write("Buffer writer");//write the file using BufferWriter
				System.out.println("Writing Completed!");
				wt.close();//close the file writer
				writer.close();//close the buffer writer
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		else {
			createFile();//if the file is not exist then create a new file
			try {
				FileWriter writer = new FileWriter(f);//create a writer object
				writer.write("This is my new file. which is created through java.");//write the content
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	//method for read a file
	public void readFile() {
		try {
			File f = new File("textfile.txt");//create a file object
			//check whether the file is exist are not
			if(checkExist(f)) {
				try {
					Scanner Reader = new Scanner(f);//create a Scanner object for read the file
					//read all the line of the file
					while(Reader.hasNextLine()) {
						String data = Reader.nextLine();
						System.out.println(data);
						
				}
				FileReader file = new FileReader(f);//create a FileReader object
				BufferedReader read = new BufferedReader(file);//create a BufferedReader object
				int i;
				//read all the line of the file
				while(((i=read.read())!=-1)) {
					System.out.print((char)i);  
				}
				read.close();//close Scanner
				Reader.close();//close BufferReader
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			}
			else {
				System.out.println("The file not found!");
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//method for delete a file
	public void deleteFile() {
		try {
			File f = new File("textfile.txt");//create file object
			//check whether the file is exist are not
			if(checkExist(f)) {
				try {
					f.delete();// delete the file
					System.out.println("Deleted!");
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
			else {
				System.out.println("The file not found!");
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
