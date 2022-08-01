package TestAssgnPackage.overridingdemo;

public class RectCalTest {

	public static void main(String[] args) {
		AreaCalculation ac = new AreaCalculation();
		AreasufCal asc = new AreasufCal();
		ac.rectangleCal(10, 20);//calling child class method
		asc.rectangleCal(10, 20);//calling super class method
	}

}
