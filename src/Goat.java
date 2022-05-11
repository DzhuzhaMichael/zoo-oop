public class Goat extends Animal implements MeatFeed {
    private String name;

    public Goat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void eat(PlantFeed plantFeed) {
        System.out.println("Goat eats " + plantFeed);
    }
}
