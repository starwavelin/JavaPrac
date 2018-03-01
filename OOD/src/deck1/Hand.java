package deck1;

import java.util.ArrayList;
import java.util.List;

public class Hand {
	
	private List<Card> cards;
	
	public Hand() {
		cards = new ArrayList<>();
	}
	
	public void addCard(Card card) {
		cards.add(card);
	}
	
	public int score() {
		int score = 0;
		for (Card c: cards) {
			score += c.getScoreValue();
		}
		return score;
	}
}
