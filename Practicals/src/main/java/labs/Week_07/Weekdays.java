package labs.Week_07;

public enum Weekdays {
	MONDAY("working day", 1),
	TUESDAY("working day", 2),
	WEDNESDAY("working day", 3),
	THURSDAY("working day", 4),
	FRIDAY("working day", 5),
	SATURDAY("weekend", 6),
	SUNDAY("weekend", 7);
	
	private final String dayType;
	private final int dayNumber;
	
	private Weekdays(String dayType, int dayNumber) {
		this.dayType = dayType;
		this.dayNumber = dayNumber;
	}
	
	public String getDayType() {
		return this.dayType;
	}
	
	public int getDayNumber() {
		return this.dayNumber;
	}

}
