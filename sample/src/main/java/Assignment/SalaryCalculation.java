package Assignment;

public class SalaryCalculation {

	public void calculateSal(int salary, int shifts) {
		
			double expForFood = (salary * 20) / 100;
			double expForTravel = (salary * 30) / 100;
			double expForShifts = (salary * 2) / 100;
			double totalExpForShifts = expForShifts * shifts;
			double savings = salary - (expForFood + expForTravel + totalExpForShifts);
			System.out.println(savings);
	}
}
