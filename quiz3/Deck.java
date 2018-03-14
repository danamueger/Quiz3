package pkgCore;


import java.util.*;
import pkgEnum.*;
import java.lang.Math.*;


public class Deck {
	
	Random rand = new Random();
	
	public ArrayList<Card> Cards = new ArrayList<Card>();

	public Deck(int numDecks) {
		super();
		for (int i = 1; i <= numDecks; i++) {
				for (int j = 1; j <= eSuit.values().length; j++) {
						for (int k = 1; k <= eRank.values().length; k++) {
								Card card = new Card(eSuit.values()[j-1],eRank.values()[k]);
								this.Cards.add(card);
						}
				}
		}
		Collections.shuffle(Cards);
	}
	
	public Deck() {
		this(1);
	}
	
	public Card draw() throws Exception {
		if (Cards.size() == 0) {
			throw new Exception("Deck is empty");
		}
		Card drawnCard = this.Cards.get(0);
		Cards.remove(drawnCard);
		return drawnCard;
	}
	
	public int getRemaining(Object eNum) {
		
		int count = 0;
		
		if(eNum instanceof eRank) {
			for(Card c : cards)
			{
				if(c.getERank() == eNum)
					count++;
			}
		}
		else {
			for(Card c : cards)
			{
				if(c.getESuit() == eNum)
					count++;
			}
		}
		return count;	
		
	}
}







