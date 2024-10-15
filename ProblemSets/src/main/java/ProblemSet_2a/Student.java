package ProblemSet_2a;

public class Student {
	private String forename = null;
	private String surname = null;
	private int age = 0;
	
	public Student(String string, String string2, int i) {
		this.forename = string;
		this.surname = string2;
		this.age = i;
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
	public String getFullName() {
		return forename + " " + surname;
	}
}
