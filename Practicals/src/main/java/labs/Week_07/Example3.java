package labs.Week_07;

import java.util.ArrayList;
import java.util.List;

public class Example3 {
	private List <Double> values;
	
	public Example3() {
		this.values = new ArrayList<>();
	}
	public void addElement(double value) {
		this.values.add(value);
	}
	public void removeElement(double value) {
		if (checkifElementExists(value)) {
			this.values.remove(value);
		}
	}
	
	private boolean checkifElementExists(double value) {
		return this.values.contains(value);
	}
	public double retrieveElement(int index) {
		if (index >= 0 && index < this.values.size()) {
			return this.values.get(index);
		} else {
			System.out.println("Invalid index");
			return 0;
		}
	}
	
	public String displayList() {
		StringBuilder buffer = new StringBuilder();
		for (double value: this.values) {
			buffer.append(value).append(" ");
		}
		return buffer.toString().trim();
	}
	public double calculateAverage() {
		if (this.values.isEmpty()) {
			return 0;
		} else {
			double sum = 0;
			for(double value: this.values) {
				sum += value;
			}
			return sum/this.values.size();
		}
	}
	
	public static void main(String[] args) {
		Example3 test = new Example3();
		test.addElement(10);
		test.addElement(20);
		test.addElement(100);
		
		test.removeElement(20);
		
		System.out.println("Value at index 0 is: " + test.retrieveElement(0));
		System.out.println("Value at index 2 is: " + test.retrieveElement(2));
		
		System.out.println(test.displayList());
		
		System.out.println(test.calculateAverage());

	}
	
	
	

}
