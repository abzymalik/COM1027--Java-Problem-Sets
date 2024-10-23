package ProblemSet_1a;

public class HelloWorld {
    // Private attribute called "text", which is being initialised to null.
	private String text = null;
	// Constructor for the class which takes a String as a parameter.
    // The constructor is called when an object of the class is created.
	public HelloWorld(String string) {
		text = string;
	}
	// Method to return the value of the private attribute "text".
	public String display() {
		// Return the value stored in the "text" variable.
		return text;
	}
}
