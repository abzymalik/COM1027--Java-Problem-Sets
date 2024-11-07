package ProblemSet_6a;

public class Supplier {
	private String name;
	private String phone;
	
	public Supplier(String name, String phone) {
		this.name = name;
		if (phone.matches("01483\\d{6}") || phone.matches("01483-\\d{6}")) {
			this.phone = phone;
		} else {
			throw new IllegalArgumentException("Invalid phone number structure");
		}
	}

	@Override
	public String toString() {
		return name + "(" + phone +")";
	}
	public String getName() {
		return name;
	}
	public String getPhone() {
		return phone;
	}
}
