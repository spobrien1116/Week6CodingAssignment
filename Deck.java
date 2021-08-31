// package Week6CodingAssignment;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    
    //Fields
    private List<Card> cards = new ArrayList<Card>();
    private String[] cardNames = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
    private int[] cardValues = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

    // Constructor for Deck
    public Deck () {
        for (int i = 0; i < cardNames.length; i++) {
            Card newCard = new Card();
            newCard.setName(cardNames[i] + " of Spades");
            newCard.setValue(cardValues[i]);
            cards.add(newCard);
        }
        for (int i = 0; i < cardNames.length; i++) {
            Card newCard = new Card();
            newCard.setName(cardNames[i] + " of Hearts");
            newCard.setValue(cardValues[i]);
            cards.add(newCard);
        }
        for (int i = 0; i < cardNames.length; i++) {
            Card newCard = new Card();
            newCard.setName(cardNames[i] + " of Clubs");
            newCard.setValue(cardValues[i]);
            cards.add(newCard);
        }
        for (int i = 0; i < cardNames.length; i++) {
            Card newCard = new Card();
            newCard.setName(cardNames[i] + " of Diamonds");
            newCard.setValue(cardValues[i]);
            cards.add(newCard);
        }
    }

    public String[] getCardNames() {
        return cardNames;
    }
    public int[] getCardValues() {
        return cardValues;
    }
    public List<Card> getCards() {
        return cards;
    }

    //Methods

    //Shuffle (randomizes the order of the cards)
    public void shuffle() {
        Collections.shuffle(cards);
    }

    //Draw (removes and returns the top card of the Cards field)
    public Card draw() {
        return cards.remove(0);
    }

    //      --In the constructor, when a new Deck is instantiated, the Cards field should
    //      be populated with the standard 52 cards--
}
