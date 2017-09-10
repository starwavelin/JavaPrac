package guitarInventory;

public class GITester {

	/*
	 * GuitarSpec includes: builder, model, type, backWood, topWood, numOfStrings.
	 * 
	 * Builder: FENDER, MARTIN, GIBSON 
	 * Type: ACOUSTIC, ELECTRIC
	 * Wood: ROSEWOOD, MAHOGANY, MAPLE
	 * 
	 * Spec 1: FENDER, Stratocastor, ELECTRIC, MAPLE, MAPLE, 6
	 * Spec 2: GIBSON, Spiner, ACOUSTIC, MAHOGANY, ROSEWOOD, 12
	 * Spec 3: GIBSON, Bookeno, ACOUSTIC, MAHOGANY, MAHOGANY, 4
	 * */
	public static void main(String[] args) {
		// Create two guitar specs
		GuitarSpec spec1 = new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.MAPLE
				, Wood.MAPLE, 6);
		GuitarSpec spec2 = new GuitarSpec(Builder.GIBSON, "Spiner", Type.ACOUSTIC, Wood.MAHOGANY
				, Wood.ROSEWOOD, 12);
		GuitarSpec spec3 = new GuitarSpec(Builder.GIBSON, "Bookeno", Type.ACOUSTIC, Wood.MAHOGANY
				, Wood.MAHOGANY, 4);
		
		// Create 2 guitars of spec1
		Guitar g1 = new Guitar("S33", 605.88, spec1);
		Guitar g2 = new Guitar("S49", 1005.88, spec1);
		
		// Create 1 guitar of spec2
		Guitar g3 = new Guitar("S50", 398.84, spec2);
		
		// Add these 3 guitars to inventory
		Inventory xianGuitarStore = new Inventory();
		xianGuitarStore.addGuitar(g1);
		xianGuitarStore.addGuitar(g2);
		xianGuitarStore.addGuitar(g3);
		
		// Test
		GuitarSpec whatWenbinWants = new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.MAPLE
				, Wood.MAPLE, 6);
		GuitarSpec whatLophyWants = new GuitarSpec(Builder.GIBSON, "Bookeno", Type.ACOUSTIC, Wood.MAHOGANY
				, Wood.MAHOGANY, 4);
		
		System.out.println("For Wenbin: ");
		xianGuitarStore.search(whatWenbinWants);
		xianGuitarStore.displaySearchResult(); // should display 2 guitars available
		
		System.out.println("For Lophy: ");
		xianGuitarStore.search(whatLophyWants);
		xianGuitarStore.displaySearchResult(); // should display 0 guitars available	
	}
}
