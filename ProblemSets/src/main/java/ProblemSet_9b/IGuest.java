package ProblemSet_9b;

public interface IGuest {
	
	public abstract void addCharge(Service s, double c);
	
	public abstract double calculateTotalChargeWithoutVAT();
	
	public abstract double calculateVATChargeAtRate(VATRate r);
	
	public abstract double calculateTotalChargeIncVAT();
	
	public abstract String toString();
}
