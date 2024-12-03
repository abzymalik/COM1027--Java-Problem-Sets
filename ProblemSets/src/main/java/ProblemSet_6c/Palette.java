package ProblemSet_6c;

public class Palette {
	private P_COLOUR[] primaryColours = new P_COLOUR[3];
	private int counter = 0;

	public Palette() {
		super();
	}

	public Palette(P_COLOUR[] colours) throws IllegalArgumentException {
	    super();
	    for (P_COLOUR colour : colours) {
	        if (colour == null) {
	            throw new IllegalArgumentException("Null values are not allowed");
	        }
	        addColour(colour);
	    }
	}

	public String addColour(P_COLOUR colour) {
		if (counter > 3) {
			throw new IllegalArgumentException("Only up to 3 colours are allowed");
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

	public String display() {
		return this.getColours() + " = " + this.mixColours();
	}

	public String mixColours() {
		String[] colourMap = {"0", "0", "0"};
		for (P_COLOUR primaryColour : this.primaryColours) {
			if (primaryColour != null) {
				if (primaryColour.equals(P_COLOUR.RED)) {
					colourMap[0] = "1";
				} else if (primaryColour.equals(P_COLOUR.YELLOW)) {
					colourMap[1] = "1";
				} else if (primaryColour.equals(P_COLOUR.BLUE)) {
					colourMap[2] = "1";
			}
		}
	}
		String colourKey = String.join("", colourMap);

        switch (colourKey) {
            case "100":
                return "RED";
            case "010":
                return "YELLOW";
            case "001":
                return "BLUE";
            case "101":
                return "PURPLE";
            case "110":
                return "ORANGE";
            case "011":
                return "GREEN";
            case "111":
                return "BLACK";
            default:
                return "";
        }
    }
}
