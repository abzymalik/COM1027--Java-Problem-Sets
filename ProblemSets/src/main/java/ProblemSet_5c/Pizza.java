package ProblemSet_5c;

public class Pizza {
	private String[] toppings;
	private static final int MAX_TOPPINGS = 10;
	
	public Pizza() {
		this.toppings = new String [10];
	}
	public void addToppings(String[] toppings) {
		if (toppings.length <= MAX_TOPPINGS) {
			this.toppings = toppings;
		} else {
			System.out.println(" Max toppings can only be 10");
		}
	}
	public String printToppings() {
		StringBuilder toppingList = new StringBuilder();
		for (String topping: toppings) {
			if (topping != null) {
				if (toppingList.length() > 0) {
					toppingList.append(",");
				}
				toppingList.append(topping);
			}
		}
		return toppingList.toString();
	}
	public double calculateCost() {
		int toppingCount = 0;
		for (String topping: toppings) {
			if (topping != null) {
				toppingCount++;
			}
		}
		switch (toppingCount) {
		case 0:
			return 0.0;
		case 1:
			return 9.99;
		case 2:
		case 3:
			return 10.99;
		case 4:
		case 5:
			return 11.99;
		case 6:
			return 12.99;
		case 7:
			return 13.99;
		case 8:
			return 14.99;
		case 9:
			return 15.99;
		case 10:
			return 14.99; // This is the special offer
		default:
			return 0.0;
		}
	}
}
