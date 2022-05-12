public class Cow extends Herbivore {
    @Override
    public void eat(Grass feed) {
        System.out.println("Cow eats " + feed.getClass().getSimpleName());
    }
}
