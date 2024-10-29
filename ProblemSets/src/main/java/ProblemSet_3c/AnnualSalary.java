package ProblemSet_3c;

public class AnnualSalary {
	private double salary;
	private static final double PERSONAL_ALLOWANCE = 12500.0;

	public AnnualSalary() {}
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
		double tax = 0.0;
		
		if (taxableIncome <= 0) {
			return tax;
		} 
		if (taxableIncome <= 37500) {
			tax =  taxableIncome * 0.20;
		} else {
			tax = 37500 * 0.20;
			
			tax += (taxableIncome - 37500) * 0.40;
		}
		
		return tax;
	}

}
