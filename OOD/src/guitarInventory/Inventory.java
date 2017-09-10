package guitarInventory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Inventory {
	
	private List<Guitar> guitars;
	
	public Inventory() {
		guitars = new ArrayList<>();
	}
	
	public void addGuitar(String serial, double price, GuitarSpec spec) {
		guitars.add(new Guitar(serial, price, spec));
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
	
	public List<Guitar> search(GuitarSpec spec) {
		List<Guitar> matchedGuitars = new ArrayList<>();
		for (Guitar g : guitars) {
			if (g.getSpec().matchSpec(spec)) {
				matchedGuitars.add(g);
			}
		}
		return matchedGuitars;
	}
	
}
