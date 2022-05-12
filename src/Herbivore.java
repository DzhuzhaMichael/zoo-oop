public abstract class Herbivore<T extends Grass> extends Animal<T> implements Feed {
    @Override
    public abstract void eat(T feed);
}
