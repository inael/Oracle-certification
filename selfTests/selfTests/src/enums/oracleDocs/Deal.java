package enums.oracleDocs;

import java.util.*;

public class Deal {
	public static int NUM_HANDS=4;
	public static int NUM_CARDS=5;
    public static void main(String args[]) {
        //int numHands = Integer.parseInt(args[0]);
        //int cardsPerHand = Integer.parseInt(args[1]);
        int numHands = NUM_HANDS;
        int cardsPerHand = NUM_CARDS;
        List<Card> deck  = Card.newDeck();
        Collections.shuffle(deck);
        
        Card fourOfClubs=Card.valueOf(Card.Rank.FOUR, Card.Suit.CLUBS);
        System.out.println("fourOfClubs="+fourOfClubs);
        
        for (int i=0; i < numHands; i++)
            System.out.println(deal(deck, cardsPerHand));
    }

    public static ArrayList<Card> deal(List<Card> deck, int n) {
         int deckSize = deck.size();
         List<Card> handView = deck.subList(deckSize-n, deckSize);
         ArrayList<Card> hand = new ArrayList<Card>(handView);
         handView.clear();
         return hand;
     }
}