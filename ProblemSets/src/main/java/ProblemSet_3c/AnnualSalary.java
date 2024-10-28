package ProblemSet_3c;

public class AnnualSalary {
	private double salary;
	private static final double PERSONAL_ALLOWANCE = 12500.0;
	
	public AnnualSalary(double salary) {
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double calculateTax() {
		double taxableIncome = salary - PERSONAL_ALLOWANCE;
		if (taxableIncome <= 0) {
			return 0.0;
		} else if (taxableIncome <= 37500) {
			return taxableIncome * 0.20;
		} else {
			return (37500 * 0.20) + ((taxableIncome - 37500) * 0.40);
		}
	}

}
