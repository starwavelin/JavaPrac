package deck1;

import java.util.ArrayList;
import java.util.List;

/**
 * Suit order: Club (黑♣️), Diamond, Heart, Spade
 */
public class Deck {
	
	private List<Card> cards;
	private int dealtIndex = 0; 
		// { Suit: Club, FaceValue: 1 } to be index 0, FaceValue: { Suit: Club, FaceValue: 2 } to be index 1, etc.
	
	public Deck() {
		cards = new ArrayList<>();
		for (int suit = 0; suit <= 3; suit++) {
			for (int value = 1; value <= 13; value++) {
				cards.add(new Card(value, Suit.getSuitFromValue(suit)));
			}
		}
	}
	
	public void shuffle() {
		
	}
	
	public int remainingCards() {
		return cards.size() - dealtIndex;
	}
	
	public Card[] dealHand(int number) {
		/* Not the actual implementation yet, just keep the compiler happy */
		int cardsPerPlayer = 13;
		return new Card[26];
	}
	
	public Card dealCard() {
		if (remainingCards() == 0) {
			throw new IllegalStateException("No cards left for dealing!");
		}
		dealtIndex++;
		return cards.get(dealtIndex - 1);
	}
}
