public class Goat extends Animal implements MeatFeed {
    private String name;

    public Goat(String name) {
        this.name = name;
    }

    @Override
    public void eat(Feed feed) {

    }
}
