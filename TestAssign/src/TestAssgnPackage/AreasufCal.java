package TestAssgnPackage;

public class AreasufCal extends AreaCalculation{

	//Override the method rectangleCal for calculate the surface of the rectangle
		@Override
		public void rectangleCal(int l, int b) {
			double surface = 2 * (l + b);
			System.out.println(surface);
		}
}
