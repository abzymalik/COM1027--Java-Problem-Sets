package ProblemSet_4b;

public class Classroom {
	private String room;
	private int capacity;
	private Student[] students;
	private int numberOfStudents;
	
	public Classroom(String room) {
		this.room = room;
		this.capacity = 20;
		this.students = new Student[capacity];
		this.numberOfStudents = 0;
	}
	public String getRoom() {
		return room;
	}
	public int getCapacity() {
		return capacity;
	}
	public void addStudents(int index, char initial, String lastName) {
		if (index >= 0 && index < capacity) {
			students[index] = new Student(initial, lastName);
			numberOfStudents++;
		} else {
			students[index] = new Student(initial, lastName);
		}
	}
	public String getSummary() {
		if(numberOfStudents == 0) {
			return "No students added";
		} else {
			StringBuilder summary = new StringBuilder();
			for (Student a: students) {
				if (a != null) {
					summary.append(a.toString()).append("\n");
				}
			}
			return summary.toString();
		}
	}
	public int howManyStudents() {
		return numberOfStudents;
	}
	
}
	

