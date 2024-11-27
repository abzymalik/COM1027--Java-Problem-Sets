package ProblemSet_9a;

public class Charge {
	private Service service;
	private double charge;

	public Charge(Service service, double charge) {
		if (charge <= 0) {
			throw new IllegalArgumentException
			("No negative charge allowed");
		}
		this.service = service;
		this.charge = charge;
	}

	public Service getService() {
		return service;
	}

	public double getCharge() {
		return charge;
	}

	public double calculateVAT() {
		switch (service.getRate()) {
		case STANDARD:
			return charge * 0.20;
		case LOW:
			return charge * 0.05;
		case ZERO:
			return 0.0;
		
		default:
			throw new IllegalArgumentException
			("Unexpected VAT rate.");
		}
	}

}
