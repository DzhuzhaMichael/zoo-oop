public abstract class Predator<T extends MeatFeed> extends Animal<T> {
    @Override
    public abstract void eat(T feed);
}
