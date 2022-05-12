public abstract class Predator<T extends Herbivore<Grass>> extends Animal<T> {
    @Override
    public abstract void eat(T feed);
}
