public class Cow extends Herbivore {
    @Override
    public void eat(PlantFeed feed) {
        System.out.println("Cow eats " + feed.getClass().getSimpleName());
    }
}
