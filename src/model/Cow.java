package model;

public class Cow extends Animal implements MeatFeed {

    public void eat(PlantFeed feed) {
        System.out.println("Cow eats " + feed.toString());
    }

    @Override
    public String toString() {
        return "Cow{}";
    }
}
