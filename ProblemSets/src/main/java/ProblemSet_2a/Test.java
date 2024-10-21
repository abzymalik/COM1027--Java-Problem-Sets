package ProblemSet_2a;

public class Test {

	public static void main(String[] args) {
		Student student = new Student("John", "Doe", 20);
		
		System.out.println("Forename: " + student.getForename());
		System.out.println("Surname: " + student.getSurname());
		System.out.println("Age: " + student.getAge());
		System.out.println("Full Name: " + student.getFullname());
		
		
		student.setForename("Jane");
		student.setSurname("Smith");
		student.setAge(22);
		
		System.out.println("Updated Forename: " + student.getForename());
		System.out.println("Updated Surname: " + student.getSurname());
		System.out.println("Updated Age: " + student.getAge());
		System.out.println("Updated Full Name: " + student.getFullname());


	}

}
