public class Lion extends Animal {
    private String name;

    public Lion(String name) {
        this.name = name;
    }

    @Override
    public void eat(MeatFeed meatFeed) {
        System.out.println("Lion eat " + meatFeed);
    }
}
