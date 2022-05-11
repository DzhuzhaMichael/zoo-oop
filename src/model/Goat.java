package model;

public class Goat extends Animal implements MeatFeed {
    public void eat(PlantFeed feed) {
        System.out.println("Goat eats " + feed);
    }

    @Override
    public String toString() {
        return "Goat{}";
    }
}
