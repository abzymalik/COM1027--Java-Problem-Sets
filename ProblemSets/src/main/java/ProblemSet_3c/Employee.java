package ProblemSet_3c;

public class Employee {
	private int id;
	private String forename;
	private String surname;
	private AnnualSalary salary;
	private Position companyPosition;
	
	public Employee(int id, String forename, String surname, AnnualSalary salary, Position companyPosition) {
		this.id = id;
		this.forename = forename;
		this.surname = surname;
		this.salary = salary;
		this.companyPosition = companyPosition;
	}
	public void displayEmployeeName() {
		System.out.println(forename + " " + surname);
	}
	public boolean eligibleForBonus() {
		return salary.getSalary() > 40000;
 	}
	@Override
	public String toString() {
		double tax = salary.calculateTax();
		String eligibility = eligibleForBonus() ? "is eligible for bonus." : "is not eligible for bonus.";
		return surname + ", " + forename + " (" + id + "): " + companyPosition + " at $" + salary.getSalary() + " ($" + tax + "tax) and " + eligibility;
	}
	
	
}
