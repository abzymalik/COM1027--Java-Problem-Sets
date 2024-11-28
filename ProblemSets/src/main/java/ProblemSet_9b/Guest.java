package ProblemSet_9b;

import java.util.*;

public class Guest implements IGuest {
	private String forename;	
	
	private String surname;
	
	private String address;
	
	private String telephone;
	
	private List<Charge> charges;
	
	public Guest() {
		super();
		this.forename = forename;
		this.surname = surname;
		this.address = address;
		this.telephone = telephone;
		this.charges = new ArrayList<Charge>();

	}
	
	@Override
	public  addCharge(Service s, double c) {
		double sum = 0.0;
		for (Charge charge: charges ) {
			sum += charge.getCharge();
		}
		return sum;
	}
	
	

	

}
