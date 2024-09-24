package ProblemSet_1a; 

public class HelloWorld {

    // Private attribute/field called "text", which is being initialised to null or empty.
	private String text = null; 

	// Constructor for the HelloWorld class which takes a String as a parameter.
    // The constructor is called when an object of the class is created.
	public HelloWorld(String string) {
		// The parameter "string" is assigned to the private attribute "text".
		text = string;
	}

	// Method to return the value of the private attribute "text".
	public String display() {
		// Return the value stored in the "text" variable.
		return text; 
	}
}
