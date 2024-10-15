package labs.Week_04;

public class Test {
	public static void main(String [] args) {
		int[] houses = new int[3];
		
		houses[0] = 3;
		houses[1] = 0;
		houses[2] = 4;
		
		System.out.println("How many bottles in house 1 is " + houses[0]);
		System.out.println("How many bottles in house 2 is " + houses[1]);
		System.out.println("How many bottles in house 3 is " + houses[2]);
	
		
        int totalBottles = 0;

        
        for (int i = 0; i < houses.length; i++) {
            totalBottles += houses[i]; 
        }

        
        System.out.println("Total number of bottles: " + totalBottles);

    
        for (int house : houses) {
            System.out.println("How many bottles in house is " + house);
	}
	
	}

}
