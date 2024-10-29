package ProblemSet_5a;

public class RainfallYear {
	private int year;
	private double[] rainfallMonths;
	public RainfallYear(int year) {
		this.year = year;
		this.rainfallMonths = new double[12];
	}
	public double calculateMeanRainfall() {
		double total_sum = 0;
		for (double rainfall : rainfallMonths) {
			total_sum += rainfall;
		}
		return (total_sum / rainfallMonths.length);
	}
	public double calculateHighestRainfall() {
		double highest = rainfallMonths[0];
		for(double rainfall : rainfallMonths) {
			if (rainfall > highest) {
				highest = rainfall;
			}
		}
		return highest;
	}
	public void enterData(double[] rainfall) {
		if (rainfall.length == 12) {
			this.rainfallMonths = rainfall;
		}
	}
	public int getYear() {
		return year;
	}
	public double getRainfallMonth(String month) {
		int index = 0;
		switch (month.toUpperCase()) {
		case "JANUARY":
			index = 0;
			break;
		case "FEBRUARY":
			index = 1;
			break;
		case "MARCH":
			index = 2;
			break;
		case "APRIL":
			index = 3;
			break;
		case "MAY":
			index = 4;
			break;
		case "JUNE":
			index = 5;
			break;
		case "JULY":
			index = 6;
			break;
		case "AUGUST":
			index = 7;
			break;
		case "SEPTEMBER":
			index = 8;
			break;
		case "OCTOBER":
			index = 9;
			break;
		case "NOVEMBER":
			index = 10;
			break;
		case "DECEMBER":
			index = 11;
			break;
		
		}
		return rainfallMonths[index];
	}
}
