package filemgmt;
import java.io.Serializable;

public class Employee implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int id;
	static String name = "Rose";
	transient String password;
	Employee(){
		
	}
	
	Employee(int id, String name, String password){
		this.id = id;
		this.name = name;
		this.password = password;
	}
}
