package ProblemSet_8a;

public class Customer {
	private String name;
	private String surname;
	
	public Customer(String name, String surname) {
		super();
		if (validateInfo(name) && validateInfo(surname)) {
			this.name = name;
			this.surname = surname;
			} else {
				throw new IllegalArgumentException("Invalid name and/or surname format");
			}
	}
	
	public char getName() {
		return name.charAt(0);
	}
	

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public boolean validateInfo(String info) {
		return info.matches("[A-Z][a-z]*");
	}
	
	
	@Override
	public String toString() {
		return  getName() + ". " + surname;
	}

}
