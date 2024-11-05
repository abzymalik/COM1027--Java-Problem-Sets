package labs.Week_07;

public class Example2 {
	public static void main(String[] args) {
		Weekdays lateNightShoppingDay = Weekdays.THURSDAY;
		
		System.out.println("Late night shopping is on " + lateNightShoppingDay);
		System.out.println("Days of the week");
		
		for (Weekdays day: Weekdays.values()) {
			System.out.println(day + " is a " + day.getDayType() + " " + day.getDayNumber());
		}
	}

}
