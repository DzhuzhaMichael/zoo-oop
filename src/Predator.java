public class Predator<T extends Herbivore<Grass>> extends Animal<T> {
    @Override
    public void eat(T feed) {
        System.out.println("Predator eats " + feed);
    }
}
