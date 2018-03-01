package deck2;

import java.util.ArrayList;
import java.util.List;

public class Deck {
	
	/**
	 * A deck may contain 52 or 54 cards (containing two jokers)
	 */
	private Card[] deck;
	
	private int cardUsed;
	
	public Deck() {
		this(false); 
			/* this keyword statement invokes another constructor within this class 
			 * and it should be placed before other statements
			 */
		cardUsed = 0;
	}
	
	public Deck(boolean includeJokers) {
		deck = (includeJokers) ? new Card[54] : new Card[52];
		int cardIndex = 0;
		for (int suit = 1; suit <= 4; suit++) {
			for (int value = 1; value <= 13; value++) {
				deck[cardIndex++] = new Card(value, Suit.getSuitFromValue(suit));
			}
		}
		if (includeJokers) {
			deck[52] = new Card(20, Suit.JOKER);
			deck[53] = new Card(21, Suit.JOKER);
		}
	}
	
	public void shuffle() {
		for (int i = deck.length - 1; i > 0; i--) {
			int rand = (int) (Math.random() * (i + 1)); // then rand will be between the indices [0, deck.length-1]
			swap(deck, i, rand);
		}
		cardUsed = 0; //reset cardUsed
	}
	
	private void swap(Card[] deck, int i, int j) {
		Card tmp = deck[i];
		deck[i] = deck[j];
		deck[j] = tmp;
	}
	
	public int cardsLeft() {
		return deck.length - cardUsed;
	}
	
	/**
	 * Deal a single card
	 * @return
	 */
	public Card dealCard() {
		if (cardUsed == deck.length)
			throw new IllegalStateException("No more cards for dealing!");
		cardUsed++;
		return deck[cardUsed - 1];
	}
	
	/**
	 * Deal a handful card to one player
	 * Assume each player should get 13 cards
	 * @return
	 */
	public List<Card> dealHand() {
		List<Card> hand = new ArrayList<>();
		for (int i = 0; i < 13; i++) {
			hand.add(dealCard());
		}
		return hand;
	}
	
	public boolean hasJokers() {
		return deck.length == 54;
	}
}
