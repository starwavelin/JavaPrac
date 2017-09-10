package guitarInventory;

public enum Wood {

	ROSEWOOD, MAHOGANY, MAPLE;
	
	public String toString() {
		switch(this) {
		case ROSEWOOD: return "rosewood";
		case MAHOGANY: return "mahogany";
		case MAPLE: return "maple";
		default: return "rosewood";
		}
	}
}
