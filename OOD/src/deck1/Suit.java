package deck1;

import java.util.HashMap;
import java.util.Map;

public enum Suit {
	Club (0), Diamond (1), Heart (2), Spade (3);
	
	private int value;
	
	/* I know what ```public final int ordinal()``` is, 
	 * but if the value associated with each enum is not in the ordinal order, 
	 * we want a reverse lookup map */
	private static final Map<Integer, Suit> lookup = new HashMap<Integer, Suit>();
	
	// The static block only gets called once, no matter how many objects of that type you create.
	static {
		for (Suit s: Suit.values()) {
			lookup.put(s.getValue(), s);
		}
	}
	
	private Suit(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	public static Suit getSuitFromValue(int val) {
		return lookup.get(val);
	}
}
