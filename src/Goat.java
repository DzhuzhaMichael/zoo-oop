public class Goat extends Animal implements MeatFeed {

    @Override
    public String eat(Feed feed) {
        return feed instanceof PlantFeed ? "Goat eats " + feed.getClass().getSimpleName()
                : "Goat does not eat " + feed.getClass().getSimpleName();
    }
}
