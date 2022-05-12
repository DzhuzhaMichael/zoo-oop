public class Lion extends Predator {
    @Override
    public void eat(Herbivore feed) {
        System.out.println("Lion eats " + feed.getClass().getSimpleName());
    }
}
