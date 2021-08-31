import java.util.ArrayList;
import java.util.List;

// package Week6CodingAssignment;

public class Player {
    
    //hand (List of Card)
    private List<Card> hand = new ArrayList<Card>();
    //score (set to 0 in the constructor)
    private int score;
    //name
    private String name;


    public Player(String string) {
        this.name = string;
        this.score = 0;
    }
    //Methods
    //describe
    public void describePlayer() {
        System.out.println("Player " + name + " currently has a score of: " + score + ".");
        for (Card card : hand) {
            card.describeCard();
        }
    }
    //flip
    public Card flip() {
        return hand.remove(0);
    }
    //draw
    public void draw(Deck deck) {
        hand.add(deck.draw());
    }
    //incrementScore
    public void addToScore() {
        this.score++;
    }

    //Setter method for Player One Score and Player Two Score
    public void setScores(int score) {
        this.score = score;
    }

    //Getter method for Player One Score and Player Two Score
    public int getScores() {
        return this.score;
    }

    //Getter method for Player Name
    public String getName() {
        return name;
    }
}
