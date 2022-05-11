package model;

public class Lion extends Animal {
    public void eat(MeatFeed feed) {
        System.out.println("Lion eats " + feed);
    }

    @Override
    public String toString() {
        return "Lion{}";
    }
}
