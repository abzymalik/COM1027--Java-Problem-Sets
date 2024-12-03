package ProblemSet_9c;


public interface IGuest {
	/**
	 * Creates a new charge object with the following parameters.
	 * 
	 * @param s
	 * @param c
	 */
	public abstract void addCharge(Service s, double c);

	/**
	 * Calculates total Pre-VAT.
	 * 
	 * @return total charge excluding VAT
	 */
	public abstract double calculateTotalChargeWithoutVAT();

	/**
	 * Calculates the sum of all VAT percentages for all the charges that
	 * the guest has at the specified VAT Rate.
	 *
	 * @param r
	 * @return
	 */
	public abstract double calculateVATChargeAtRate(VATRate r);

	/**
	 * Calculates total Post-VAT
	 *
	 * @return total including VAT
	 */
	public abstract double calculateTotalChargeIncVat();
	
	public abstract String toString();
}
