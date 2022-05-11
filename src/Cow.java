public class Cow extends Animal implements MeatFeed {

    @Override
    public String eat(Feed feed) {
        return feed instanceof PlantFeed ? "Cow eats " + feed.getClass().getSimpleName()
                : "Cow does not eat " + feed.getClass().getSimpleName();
    }
}
