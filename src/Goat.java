public class Goat extends Herbivore {
    @Override
    public void eat(Grass feed) {
        System.out.println("Goat eats " + feed.getClass().getSimpleName());
    }
}
