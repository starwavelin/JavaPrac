package deck2;

import java.util.HashMap;
import java.util.Map;

public enum Suit {
	CLUB (1), DIAMOND (2), HEART (3), SPADE (4), JOKER(5);
	
	private int value;
	
	private Suit(int val) {
		this.value = val;
	}
	
	public int getValue() {
		return value;
	}
	
	private static final Map<Integer, Suit> map = new HashMap<>();
	static {
		for (Suit s: Suit.values()) {
			map.put(s.getValue(), s);
		}
	}
	public static Suit getSuitFromValue(int val) {
		return map.get(val);
	}
} 
