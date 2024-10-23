package ProblemSet_2c;

public class Assessment {
	private String name = null;
	private double mark;
	public Assessment(String assessmentName, double mark) {
		this.name = assessmentName;
		this.mark = mark;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMark() {
		return mark;
	}
	public void setMark(double mark) {
		this.mark = mark;
	}
}
