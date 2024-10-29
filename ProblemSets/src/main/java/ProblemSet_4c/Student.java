package ProblemSet_4c;

public class Student {
	private char initial;
	private String surname;
	private Module[] modules;
	public Student(char initial, String surname) {
		this.initial = initial;
		this.surname = surname;
		this.modules = new Module[8];
		for (int i = 0; i < 8; i++) {
			modules[i] = new Module("empty", 0);
		}
	}
	public void setModules(int index, String code, double average) {
		if (index >= 0 && index < 8) {
			modules[index] = new Module(code, average);
		}
	}
	public Module getModules(int index) {
		if (index >= 0 && index < 8) {
			return modules[index];
		}
		return null;
	}
	public String displayArray() {
		StringBuilder builder = new StringBuilder();
		for (Module module: modules) {
			builder.append(module.toString()).append("\n");
		}
		builder.append("Year Average: ").append(calculateYearAverage()).append("%");
		return builder.toString();
	}
	public int calculateYearAverage() {
		double total = 0;
		for (Module module: modules) {
			total += module.getAverage();
		}
		return (int) (total / modules.length);
	}
	public String getStudentDetails() {
		return initial + ". " + surname + " " + calculateYearAverage() + "%";
	}

}
