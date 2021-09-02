// package Week6CodingAssignment;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    
    //Fields listed below.
    //cards (List of Card).
    private List<Card> cards = new ArrayList<Card>();
    //cardNames (Base card names that will be added suits later in the constructor for Deck).
    private String[] cardNames = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
    //cardValues (Card values assigned, range from 2 to 14).
    private int[] cardValues = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

    //Constructor for Deck.
    //In the constructor, when a new Deck is instantiated, the Cards field should be
    //populated with the standard 52 cards.
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
    //Getters and setters listed below.
    //Getter method for card names.
    public String[] getCardNames() {
        return cardNames;
    }
    //Getter method for card values.
    public int[] getCardValues() {
        return cardValues;
    }
    //Getter method for List of cards that will make up the deck.
    public List<Card> getCards() {
        return cards;
    }
    //Methods listed below.
    //Method that randomizes the order of the cards.
    public void shuffle() {
        Collections.shuffle(cards);
    }
    //Method that removes and returns the top card of the Cards field.
    public Card draw() {
        return cards.remove(0);
    }
}
