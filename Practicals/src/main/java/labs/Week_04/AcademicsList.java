package labs.Week_04;

import java.util.ArrayList;

public class AcademicsList {
	private ArrayList<String> namesList;
	
	public AcademicsList() { //Default constructor
		namesList = new ArrayList<>(); // Initialising the ArrayList
	}
	
	public void addNames() {
		namesList.add("Hellen");
		namesList.add("Stella");
	}
	
	public String displayNames() {
		StringBuilder names = new StringBuilder();
		
		for (String name: namesList) {
			names.append(name).append("\n");
		}
		
		return names.toString();
	}
	public static void main(String[] args) {
		AcademicsList computing = new AcademicsList();
		computing.addNames();
		System.out.println(computing.displayNames());
	}
}
