public class Lion extends Predator {
    @Override
    public void eat(MeatFeed feed) {
        System.out.println("Lion eats " + feed.getClass().getSimpleName());
    }
}
