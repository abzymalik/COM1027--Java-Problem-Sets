package ProblemSet_2b;

public class Food {
	private String name;
	private double amountOfSugar;
	
	public Food(String name, double amountOfSugar) {
		this.name = name;
		this.amountOfSugar = amountOfSugar;
	}
	public double getAmountOfSugar() {
		return this.amountOfSugar;
	}
	public String getName() {
		return this.name;
	}

}
