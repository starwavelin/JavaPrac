package guitarInventory;

public class FindGuitarTester {
	
	public static void main(String[] args) {
		// Set up Rick's guitar inventory
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		
		Guitar whatErinLiks = new Guitar("", 0, "fender", "Stratocastor", "electric", "Alder", "Alder");
		
		Guitar guitar = inventory.search(whatErinLiks);
		if (guitar != null) {
			System.out.println("Erin, you might like this " +
				guitar.getBuilder() + " " +
				guitar.getModel() + " " +
				guitar.getType() + " guitar:\n   " +
				guitar.getBackWood() + " back and sides, \n   " +
				guitar.getTopWood() + " top.\nYOu can have it for only $" +
				guitar.getPrice() + "!");
		} else {
			System.out.println("Sorry, Erin, we have nothing for you.");
		}
	}
	
	private static void initializeInventory(Inventory inventory) {
		inventory.addGuitar("V98765", 1499.80, "Fender", "Stratocastor", "electric", "Alder", "Alder");
		inventory.addGuitar("V34789", 2000.01, "Fender", "Stratocastor", "electric", "Alder", "Alder");
	}
}
