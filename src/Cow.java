public class Cow extends Animal implements MeatFeed {
    private String name;

    public Cow(String name) {
        this.name = name;
    }

    @Override
    public void eat(Feed feed) {
        System.out.println("Cow accepted " + feed.toString());
    }
}
