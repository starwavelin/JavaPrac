package deck2;

public class Card {
	
	private int faceValue;
	private Suit suit;
	
	public Card(int faceValue, Suit suit) {
		this.faceValue = faceValue;
		this.suit = suit;
	}
	
	public int getCardScore() {
		return suit.getValue() * faceValue;
	}
}
