// package Week6CodingAssignment;

public class App {
    
    public static void main(String[] args) {
        Deck newDeck = new Deck();
        // for (Card card : newDeck.getCards()) {
        //     card.describeCard();
        // }
        newDeck.shuffle();
        // for (Card card : newDeck.getCards()) {
        //     card.describeCard();
        // }
        Player player1 = new Player("Tom");
        Player player2 = new Player("Jerry");
        // for each card in deck, call draw on other player
        for (int i = 0; i < 26; i++) {
            player1.draw(newDeck);
            player2.draw(newDeck);
        }
        // use a traditional for loop to iterate 26 times and call the flip method for each player
        for (int i = 0; i < 26; i++) {
            Card player1Card = player1.flip();
            Card player2Card = player2.flip();
            // if value compared to value, something
            if (player1Card.getValue() > player2Card.getValue()) {
                player1.addToScore();
            } else if (player2Card.getValue() > player1Card.getValue()) {
                player2.addToScore();
            } else {
                System.out.println("Draw, no score allocated to either player.");
            }
        }   
        // compare final scores
        int player1Score = player1.getScores();
        int player2Score = player2.getScores();
        if (player1Score > player2Score) {
            System.out.println("The winner is " + player1.getName() + ". The final score is " + player1Score + " to " +player2Score + ".");
        } else if (player2Score > player1Score) {
            System.out.println("The winner is " + player2.getName() + ". The final score is " + player2Score + " to " +player1Score + ".");
        } else {
            System.out.println("The game ended in a draw. The final score is " + player1Score + " to " +player2Score + ".");
        }
    }
}
