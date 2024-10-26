package ProblemSet_3b;

public class AnnualSalary{
	private double salary;
	private static final double PERSONAL_ALLOWANCE = 12570;
	public AnnualSalary(double salary) {
		this.salary = salary;
	}
	public AnnualSalary() {
		this.salary = 0.0;
	}
	public double getSalary() {
		return this.salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double calculateTax() {
		double taxIncome = this.salary;
		double tax = 0;
		if (taxIncome <= PERSONAL_ALLOWANCE) {
			tax = 0;
		} else if (taxIncome <= 50270) {
			tax = (taxIncome - PERSONAL_ALLOWANCE) * 0.20;
		} else if (taxIncome  <= 125140) {
			tax = ((50270 - PERSONAL_ALLOWANCE) * 0.20)  +((taxIncome - 50270) * 0.40);
		} else {
			tax = ((50270 - PERSONAL_ALLOWANCE) * 0.20) + ((125140 - 50270) * 0.40) + ((taxIncome - 125140) * 0.45);
		}
		return tax;
	}
}
	 






















