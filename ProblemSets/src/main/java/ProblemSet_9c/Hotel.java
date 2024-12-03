package ProblemSet_9c;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
	/**
	 * Hotel name.
	 */
	private String name;
	
	/**
	 * List of all the guests at the hotel
	 */
	private List<IGuest> guests;

	/**
	 * @param name
	 */
	public Hotel(String name) {
		this.name = name;
		this.guests = new ArrayList<IGuest>();
	}

	/**
	 * Adds guest to the hotel guest list
	 *
	 * @param guest
	 */

	public void addGuest(IGuest guest) {
		this.guests.add(guest);
	}

	public List<IGuest> getGuests(){
		return this.guests;
	}

	public String getName() {
		return this.name;
	}

	/**
	 * Returns the guest list with the hotel name.
	 * @return list of all guests in the hotel
	 */
	public String printGuestList() {
		StringBuilder GuestList = new StringBuilder();
		GuestList.append(this.name).append(" Hotel\n").
		append("Guest List\n");
		for (IGuest guest: this.guests) {
			GuestList.append(guest.toString()).append("\n");
		}
		return GuestList.toString();
	}
}
