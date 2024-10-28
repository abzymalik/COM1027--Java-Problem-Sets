package ProblemSet_3c;

public class Test {

	public static void main(String[] args) {
		Position director = new Position("Director");
		Position developer = new Position("Developer");
		
		AnnualSalary salary1 = new AnnualSalary(53875.0);
		AnnualSalary salary2 = new AnnualSalary(40000.0);
		
		Employee emp1 = new Employee(5438, "Sid", "Jammy", salary1, director);
		Employee emp2 = new Employee(9876, "Ali", "Wonder", salary2, developer);
		
		emp1.displayEmployeeName();
		System.out.println(emp1);
		
		emp2.displayEmployeeName();
		System.out.println(emp2);
	}
	

}
