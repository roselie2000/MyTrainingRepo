package TestAssgnPackage;

public class SquareSuf extends RectangleSuface{

	//overloading the sufaceCal method for calculate the surface of square
	public void sufaceCal(int a) {
		double suf = 2 * a;
		System.out.println(suf);
	}
	
	//calling the sufaceCal from super class
	public void rectSuf() {
		super.sufaceCal(10, 20);
	}
}
