package ProblemSet_9a;

public class Charge {
	private Service service;
	private double charges;

	public Charge(Service service, double charges) throws IllegalArgumentException {
		if (charges <= 0) {
			throw new IllegalArgumentException(
					"No negative charge allowed");
		}
		this.service = service;
		this.charges = charges;
	}

	public Service getService() {
		return this.service;
	}

	public double getCharge() {
		return this.charges;
	}
	/**
	 * Calculates the VAT based on the rate provided by the service.
	 * The VAT Rate can be one of the following
	 * 
	 * @return the calculated VAT as a double value
	 * @throws IllegalArgumentException if the VAT Rate is not recognised.
	 */
	public double calculateVAT() {
		switch (service.getRate()) {
		case STANDARD:
			return charges * 0.20;
		case LOW:
			return charges * 0.05;
		case ZERO:
			return 0.0;

		default:
			throw new IllegalArgumentException(
					"Unexpected VAT rate.");
		}
	}

}
