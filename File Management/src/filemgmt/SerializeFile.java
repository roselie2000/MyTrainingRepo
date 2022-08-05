package filemgmt;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeFile {

	public static void main(String[] args) throws IOException {
		Employee emp1 = new Employee(34, "nagul", "pass123");
		Employee emp2 = new Employee(31, "nithin", "pass@123");
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println("Serialization started");

		FileOutputStream fout = new FileOutputStream("output.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(emp1);
		out.writeObject(emp2);

		// saving the state of an object in a file
		out.flush();
		System.out.println("Serialization completed");
		out.close();


	}
}
