public class Herbivore<T extends Grass> extends Animal<T> implements Feed {
    @Override
    public void eat(T feed) {
        System.out.println("Herbivore eats " + feed);
    }
}
