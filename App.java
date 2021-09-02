// package Week6CodingAssignment;

public class App {
    
    public static void main(String[] args) {
        Deck newDeck = new Deck();
        // for (Card card : newDeck.getCards()) {
        //     card.describeCard();
        // }        This was a tester to see if the deck generation worked.
        newDeck.shuffle();
        // for (Card card : newDeck.getCards()) {
        //     card.describeCard();
        // }        This was a tester to see if the shuffler worked after deck generation.
        //Creating the new players.
        Player player1 = new Player("Tom");
        Player player2 = new Player("Jerry");
        //Use a traditional for loop to iterate 52 times calling draw method on other player.
        for (int i = 0; i < 52; i++) {
            if (i % 2 == 0) {
                player1.draw(newDeck);
            } else {
                player2.draw(newDeck);
            }
        }
        //Use a traditional for loop to iterate 26 times and call the flip method for each player.
        for (int i = 0; i < 26; i++) {
            player1.describePlayer();
            Card player1Card = player1.flip();
            player2.describePlayer();
            Card player2Card = player2.flip();
            //If value of card compared to value of other card is something, do something.
            if (player1Card.getValue() > player2Card.getValue()) {
                System.out.println("Player " + player1.getName() + " has been awarded one point.");
                player1.incrementScore();
            } else if (player2Card.getValue() > player1Card.getValue()) {
                System.out.println("Player " + player2.getName() + " has been awarded one point.");
                player2.incrementScore();
            } else {
                System.out.println("Draw, no score allocated to either player.");
            }
            //Regardless of outcome, state each player's current score.
            System.out.println("Player " + player1.getName() + " currently has a score of " + player1.getScores() + ".");
            System.out.println("Player " + player2.getName() + " currently has a score of " + player2.getScores() + ".");
        }   
        //Compares the final scores.
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
