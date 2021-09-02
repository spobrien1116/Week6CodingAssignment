import java.util.ArrayList;
import java.util.List;

// package Week6CodingAssignment;

public class Player {
    
    //Fields listed below.
    //hand (List of Card).
    private List<Card> hand = new ArrayList<Card>();
    //score (set to 0 in the constructor).
    private int score;
    //name (Player name).
    private String name;

    //Constructor for Player.
    public Player(String string) {
        this.name = string;
        this.score = 0;
    }
    //Methods listed below.
    //Method that prints out information about the player and calls the describe method for each
    //card in the Hand List.
    public void describePlayer() {
        System.out.println("Player " + name + " flips a card.");
        // for (Card card : hand) {
        //     card.describeCard();
        // }                Old way, changed to just describing the current card being flipped.
        hand.get(0).describeCard();
    }
    //Method that removes and returns the top card of the Hand.
    public Card flip() {
        return hand.remove(0);
    }
    //Method that takes Deck as an argument and calls the draw method on the deck, adding the
    //returned Card to the hand field.
    public void draw(Deck deck) {
        hand.add(deck.draw());
    }
    //Method to add 1 point to the player's score.
    public void incrementScore() {
        this.score++;
    }
    //Getters and setters listed below.
    //Setter method for Player One Score and Player Two Score.
    public void setScores(int score) {
        this.score = score;
    }

    //Getter method for Player One Score and Player Two Score.
    public int getScores() {
        return this.score;
    }

    //Getter method for Player Name.
    public String getName() {
        return name;
    }
}
