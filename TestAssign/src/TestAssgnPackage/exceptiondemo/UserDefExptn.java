package TestAssgnPackage.exceptiondemo;

//User Defined Exception class
public class UserDefExptn extends Exception {
	String msg = "NumberOutOfRange Exception";
	
	//user defined exception method
	public UserDefExptn(String s) {
		super(s);
		System.out.println(msg);
	}
}
