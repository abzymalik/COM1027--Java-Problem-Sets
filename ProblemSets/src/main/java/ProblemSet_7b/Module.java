package ProblemSet_7b;

public class Module {
	private String name;
	
	public Module(String name) {
		super();
		if (name.matches("COM\\d{4}")) {
			this.name = name;  
		} else {
			this.name = "Error";
		}
	}
	
	public String getName() {
		return name;
	}

}
