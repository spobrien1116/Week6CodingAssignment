// package Week6CodingAssignment;

public class Card {

    private String name;
    private int value;

    //Constructor for Card
    //None needed, using default constructor

    //Describe method     (prints out information about a card)
    public void describeCard() {
        System.out.println("This card is the " +  name + ". It has a value of " + value + ".");
    }
    
    //Setter methods for card value and name
    public void setValue(int value) {
        this.value = value;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    //Getter methods for card value and name
    public int getValue() {
        return this.value;
    }

    public String getName() {
        return this.name;
    }
}