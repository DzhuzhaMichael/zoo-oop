public class Goat extends Herbivore {
    @Override
    public void eat(PlantFeed feed) {
        System.out.println("Goat eats " + feed.getClass().getSimpleName());
    }
}
