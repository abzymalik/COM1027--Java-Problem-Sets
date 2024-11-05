package labs.Week_07;

public class Example1 {
	public static void main(String[] args) {
		Weekday lateNightShoppingDay = Weekday.THURSDAY;
		System.out.println("Late night shopping is on " + lateNightShoppingDay);
		
		System.out.println("Days of the week");
		for (Weekday day: Weekday.values()) {
			switch (day) {
			case SATURDAY:
			case SUNDAY:
				System.out.println(day + " is a weekend");
				break;
			default:
				System.out.println(day + " is a working day");
			}
		}
		System.out.println(Weekday.FRIDAY.ordinal());
	}
}
