// import java.util.HashMap;
// import java.util.Map;

// public class OldCodeDoNotRemoveYet {

//     public static void main(String[] args) {
//         //This part assigns the name of the cards
//         String[] cardNames = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
//         // This part sends the card names into a method (deckCreated) that will assign the card names suits, and also their values. 
//         // It then returns the completed deck of 52 cards, called createdDeck.
//         Map<String, Integer> createdDeck = (deckCreated(cardNames));
//         System.out.println(createdDeck);
//     }
//     // Creates the deck through a method which assigns the suits to the cards, and also their values. Returns the completed
//     // deck of 52 cards.
//     public static Map<String, Integer> deckCreated(String[] cards) {
//         Map<String, Integer> deckOf52 = new HashMap<String, Integer>();
//         for (int i = 0; i < cards.length; i++) {
//             deckOf52.put(cards[i] + " of Spades", i + 2);
//         }
//         for (int i = 0; i < cards.length; i++) {
//             deckOf52.put(cards[i] + " of Hearts", i + 2);
//         }
//         for (int i = 0; i < cards.length; i++) {
//             deckOf52.put(cards[i] + " of Clubs", i + 2);
//         }
//         for (int i = 0; i < cards.length; i++) {
//             deckOf52.put(cards[i] + " of Diamonds", i + 2);
//         }
//         return deckOf52;
//     }
// }
