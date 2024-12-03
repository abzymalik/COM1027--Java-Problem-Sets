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
	public Guest() {
		super();
		this.forename = forename;
		this.surname = surname;
		this.address = address;
		this.telephone = telephone;
		this.charges = new ArrayList<Charge>();
	}

	@Override
	public addCharge(Service s, double c) {
		double sum = 0.0;
		for (Charge charge: charges ) {
			sum += charge.getCharge();
		}
		return sum;
	}
	
	

	

}
