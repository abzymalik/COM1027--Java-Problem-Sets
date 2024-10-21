package ProblemSet_2a;

public class Student {
	private String forename = null;
	private String surname = null;
	private int age = 0;
	
	public Student(String forename, String surname, int age) {
		this.forename = forename;
		this.surname = surname;
		this.age = age;
	}

	public String getForename() {
		return forename;
	}

	public void setForename(String forename) {
		this.forename = forename;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public String getFullname() {
		return forename + " " + surname;
	}
}
