package deck1;

public class Card {
	
	private int value;
	private Suit suit;
	
	public Card(int value, Suit suit) {
		this.value = value;
		this.suit = suit;
	}
	
	public int getScoreValue() {
		return (suit.getValue() + 1) * value;
	}
}
