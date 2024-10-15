package labs.Week_04;

public class Academics {

	public static void main(String[] args) {
		String[] names = new String[21];
		
		names[0] = "Helen";
		names[1] = "Stella";
		names[20] = "Bobby";
		
		for (String name : names) {
			if (name != null) {
				System.out.println("Name is: " + name);
			}
		}

	}

}
