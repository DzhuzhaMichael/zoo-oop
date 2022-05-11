public class Lion extends Animal {
    private String name;

    public Lion(String name) {
        this.name = name;
    }

    @Override
    public void eat(Feed feed) {
        System.out.println("lion eats " + feed.toString());
    }
}
