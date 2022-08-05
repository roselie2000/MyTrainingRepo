package filemgmt;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileInputStream fin = new FileInputStream("output.txt");
		ObjectInputStream in = new ObjectInputStream(fin);
		Employee emp1 = (Employee) in.readObject();
		System.out.println(emp1.id + "  " + emp1.name + "  " + emp1.password);
		Employee emp2 = (Employee) in.readObject();
		System.out.println(emp2.id + "  " + emp2.name + "  " + emp2.password);
		in.close();
		fin.close();
	}

}