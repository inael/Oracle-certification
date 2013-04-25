package enums.oracleDocs;

import java.util.*;

public class Card {
	public enum Rank {
		DEUCE, THREE, FOUR{
			public String toString() {
				return "Four";
			}
		}, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE
	}

	public enum Suit {
		CLUBS {
			public String toString() {
				return "Clubs";
			}
		},
		DIAMONDS, HEARTS, SPADES
	}

	private final Rank rank;
	private final Suit suit;

	private Card(Rank rank, Suit suit) {
		this.rank = rank;
		this.suit = suit;
	}

	public Rank rank() {
		return rank;
	}

	public Suit suit() {
		return suit;
	}

	public String toString() {
		return rank + " of " + suit;
	}
	
	private static Map<Suit, Map<Rank, Card>> table = new EnumMap<Suit, Map<Rank, Card>>(
			Suit.class);
	static {
		for (Suit suit : Suit.values()) {
			Map<Rank, Card> suitTable = new EnumMap<Rank, Card>(Rank.class);
			for (Rank rank : Rank.values())
				suitTable.put(rank, new Card(rank, suit));
			table.put(suit, suitTable);
		}
	}
	
	public static Card valueOf(Rank rank, Suit suit) {
		return table.get(suit).get(rank);
	}

	private static final List<Card> protoDeck = new ArrayList<Card>();

	// Initialize prototype deck
	static {
		for (Suit suit : Suit.values())
			for (Rank rank : Rank.values())
				//protoDeck.add(new Card(rank, suit));
				protoDeck.add(Card.valueOf(rank, suit));
	}

	public static ArrayList<Card> newDeck() {
		return new ArrayList<Card>(protoDeck); // Return copy of prototype deck
	}		
}