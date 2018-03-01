package deck2;

import java.util.ArrayList;
import java.util.List;

public class Hand {
	
	private List<Card> hand;
	private int handScore;
	
	private Hand() {
		hand = new ArrayList<>();
		handScore = 0;
	}
	
	public void addCard(Card c) {
		hand.add(c);
	}
	
	public void addHand(Deck d) {
		hand.addAll(d.dealHand());
	}
	
	public int getScore() {
		for (Card card: hand) {
			handScore += card.getCardScore();
		}
		return handScore;
	}
}
