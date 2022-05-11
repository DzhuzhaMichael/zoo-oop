public class Lion extends Animal {
    @Override
    public String eat(Feed feed) {
        return feed instanceof MeatFeed ? "Lion eats " + feed.getClass().getSimpleName()
                : "Lion does not eat " + feed.getClass().getSimpleName();
    }
}
