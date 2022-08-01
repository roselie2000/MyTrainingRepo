package TestAssgnPackage.interfacedemo;

//class implements two interfaces
public class MultiInterface implements Interface1, interface2 {

	//override the add method
	@Override
	public void add() {
		int a = 10;
		int b = 20;
		System.out.println(a + b);
		
	}

	//override the subtract method
	@Override
	public void subtract() {
		int a = 10;
		int b = 20;
		System.out.println(b - a);
		
	}
	
	//method for multiplication
	public void multiple() {
		int a = 10;
		int b = 20;
		System.out.println(a * b);
	}
}