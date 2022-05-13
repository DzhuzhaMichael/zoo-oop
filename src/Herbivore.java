public abstract class Herbivore<T extends PlantFeed> extends Animal<T> implements MeatFeed {
    @Override
    public abstract void eat(T feed);
}
