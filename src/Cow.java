public class Cow extends Animal implements MeatFeed{
    private String name;

    public Cow(String name) {
        this.name = name;
    }

    @Override
    public void eat(PlantFeed plantFeed) {
        System.out.println("Cow accepted " + plantFeed);
    }
}
