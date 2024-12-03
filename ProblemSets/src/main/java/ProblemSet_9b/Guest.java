package ProblemSet_9b;

import java.util.*;

public class Guest implements IGuest {
	/**
	 * Forename of the Guest object created.
	 */
	private String forename;

	/**
	 * Surname of the Guest object created.
	 */
	private String surname;

	/**
	 * Address of the Guest object created.
	 */
	private String address;

	/**
	 * Telephone of the Guest object created.
	 */
	private String telephone;

	/**
	 * List of charges the Guest owes.
	 */
	private List<Charge> charges;

	/**
	 * Guest object being created.
	 *
	 * @param forename
	 * @param surname
	 * @param address
	 * @param telephone
	 */
	public Guest(String forename, String surname, String address, String telephone) {
		super();
		this.forename = forename;
		this.surname = surname;
		this.address = address;
		this.telephone = telephone;
		this.charges = new ArrayList<Charge>();
	}

	public String getForename() {
		return forename;
	}

	public String getSurname() {
		return surname;
	}

	public String getAddress() {
		return address;
	}

	public String getTelephone() {
		return telephone;
	}

	public List<Charge> getCharges() {
		return charges;
	}

	/**
	 * Creates a new charge object with the following parameters
	 * and adds it to the list of charges.
	 * 
	 * @param s
	 * @param c
	 */
	@Override
	public void addCharge(Service s, double c) {
		this.charges.add(new Charge(s, c));
	}

	/**
	 * Calculates totL PRE-VAT.
	 * 
	 * @return total charge excluding vat
	 */
	@Override
	public double calculateTotalChargeWithoutVAT() {
		double total = 0;
		for (Charge charge: this.charges) {
			total += charge.getCharges();
		}
		return total;
	}

	/**
	 * Calculates sum of all vat percentages for all the charges.
	 * 
	 * @param r
	 * @return total of products that meet the rate provided
	 */
	
	@Override
	public double calculateVATChargeAtRate(VATRate r) {
		double total = 0;
		for (Charge charge: this.charges) {
			if (charge.getService().getRate().equals(r)) {
				total += charge.calculateVAT();
			}
		}
		return total;
	}

	/**
	 * Calculates total Post-VAT
	 * 
	 * @return total including vat
	 */
	@Override
	public double calculateTotalChargeIncVAT() {
		double total = 0;
		for (Charge charge : this.charges) {
			total += charge.getCharges() + charge.calculateVAT();
		}
		return total;
	}

	@Override
	public String toString() {
		return String.format("%s %s, %s, %s", this.forename, this.surname, this.address, this.telephone );
	}
}
