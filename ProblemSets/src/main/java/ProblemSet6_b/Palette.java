package ProblemSet6_b;

public class Palette {
	private P_COLOUR[] primaryColours = new P_COLOUR[3];
	private int counter = 0;
	
	public String getColours() {
		if (counter == 0){
			return "No Colours Added";
		}
		StringBuilder display = new StringBuilder();
		for (int i = 0; i<counter; i++) {
			display.append(primaryColours[i]);
			if (i< counter - 1) {
				display.append(", ");
			}
		}
		return display.toString();
	}
	public void addColours(P_COLOUR colour) {
		if(counter < 3) {
			for (int i = 0; i<counter; i++) {
				if (primaryColours[i] == colour) {
					throw new IllegalArgumentException("Colour is already added.");
				}
				primaryColours[counter] = colour;
				counter++;
			}
			}
		else {
			throw new IllegalArgumentException("Only up to 3 colours are allowed...");
		}
	}
	
	

}
