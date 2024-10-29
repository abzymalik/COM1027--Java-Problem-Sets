package ProblemSet_5b;

public class GasBill {
	private String accountNumber;
	private double amount;
	private Customer customer;
	
	public GasBill(String accountNumber, double amount, Customer customer){
		if (checkAccountAccuracy(accountNumber)) {
			this.accountNumber = accountNumber;
		} else {
			this.accountNumber = "Invalid Account";
		}
		this.customer = customer;
		this.amount = amount;
	}
	public String getAccountNumber() {
		return accountNumber.toString();
	}
	public String getCustomer() {
		return customer.toString();
	}
	public boolean checkAccountAccuracy(String accountNumber) {
		return accountNumber.matches("G\\d{4}-\\d{4}-\\d{4}");
	}
	public String displayAccountDetails() {
		return "Gas Bill\n" + " Account Number:" + accountNumber + "\n" + " Customer:" + customer.toString() + "\n" + " Amount due:£" + String.format("%.2f", amount);
	}
}
