package TestAssgnPackage.exceptiondemo;

public class UserDefExTest {

	public static void main(String[] args) {
		try {
			int n = 10;
			if(n > 5) {
				throw new UserDefExptn("The number is larger than 5");//throw the exception
			}
		}
		catch(UserDefExptn e) {
			e.printStackTrace();
		}
		
	}

}
