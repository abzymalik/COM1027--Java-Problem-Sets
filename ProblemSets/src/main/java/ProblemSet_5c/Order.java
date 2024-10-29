package ProblemSet_5c;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private List<Pizza> pizzas;
	private Customer customer;
	
	public Order(Customer customer) {
		this.customer = customer;
		pizzas = new ArrayList<>();
	}
	public void addPizza(Pizza pizza) {
		pizzas.add(pizza);
	}
	public double calculateTotal() {
		double total = 0.0;
		for (Pizza pizza: pizzas) {
			total += pizza.calculateCost();
		}
		return total;
	}
	public String printReceipt() {
		StringBuilder receipt = new StringBuilder();
		receipt.append("Customer: ").append(customer.getName()).append(". ").append(customer.getSurname()).append("\n");
		receipt.append("Number of Pizzas: ").append(pizzas.size()).append("\n");
		receipt.append("Total Cost: ").append(String.format("%.2f", calculateTotal()));
		return receipt.toString();
		}
}
