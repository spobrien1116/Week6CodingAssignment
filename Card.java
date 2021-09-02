// package Week6CodingAssignment;

public class Card {

    //Fields listed below.
    //value (contains a value from 2-14 representing cards 2-Ace).
    private int value;
    //name (card names, such as Ace of Diamonds or Two of Hearts).
    private String name;

    //Constructor for Card.
    //None needed, using default constructor.

    //Methods listed below.
    //Method that prints out information about a card.
    public void describeCard() {
        System.out.println("This card is the " +  name + ". It has a value of " + value + ".");
    }
    //Getters and setters listed below.
    //Setter method for card value.
    public void setValue(int value) {
        this.value = value;
    }
    //Setter method for card name.
    public void setName(String name) {
        this.name = name;
    }
    //Getter method for card value.
    public int getValue() {
        return this.value;
    }
    //Getter method for card name.
    public String getName() {
        return this.name;
    }
}