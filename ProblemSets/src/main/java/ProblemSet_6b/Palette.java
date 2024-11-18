package ProblemSet_6b;

public class Palette {
	private P_COLOUR[] primaryColours = new P_COLOUR[3];
	private int counter = 0;

	public Palette() {

	}

	public Palette(P_COLOUR[] colours) {
		for (P_COLOUR colour: colours) {
			if (colour != null) {
				addColour(colour);
			}
		}
	}

	public String addColour(P_COLOUR colour) {
		if (counter >= 3) {
			throw new IllegalArgumentException(
					"Only up to 3 colours are allowed");
		}
		for (int i = 0; i < counter; i++) {
			if (primaryColours[i] == colour) {
				throw new IllegalArgumentException(
						"Colour already exists");
			}
		}
		primaryColours[counter] = colour;
		counter++;
		return colour + " added";
	}

	public String getColours() {
		if (counter == 0) {
			return "No colours added";
		}
		StringBuilder display = new StringBuilder();
		for (int i = 0; i < counter; i++) {
			display.append(primaryColours[i]);
			if (i < counter - 1) {
				display.append(", ");
			}
		}
		return display.toString();
	}

}
