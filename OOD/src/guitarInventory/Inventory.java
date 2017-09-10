package guitarInventory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Inventory {
	
	private List<Guitar> guitars;
	private List<Guitar> matchedGuitars;
	
	public Inventory() {
		guitars = new ArrayList<>();
	}
	
	public void addGuitar(Guitar g) {
		guitars.add(g);
	}
	
	public Guitar getGuiter(String serial) {
		Iterator<Guitar> it = guitars.iterator();
		while (it.hasNext()) {
			Guitar g = it.next();
			if (g.getSerial().equals(serial)) {
				return g;
			}
		}
		return null;
	}
	
	public List<Guitar> search(GuitarSpec clientRequestedSpec) {
		matchedGuitars = new ArrayList<>(); // set/reset matchedGuitars
		for (Guitar g : guitars) {
			if (g.getSpec().matchSpec(clientRequestedSpec)) {
				matchedGuitars.add(g);
			}
		}
		return matchedGuitars;
	}
	
	public void displaySearchResult() {
		if (!matchedGuitars.isEmpty()) {
			System.out.println("We have " + matchedGuitars.size() + " guitar(s) for this client:");
			for (Guitar g : matchedGuitars) {
				System.out.println(g.toString());
			}
		} else {
			System.out.println("No guitars available for this client");
		} 
	}
	
}
