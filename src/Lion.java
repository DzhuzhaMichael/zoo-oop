public class Lion extends Animal {

    @Override
    public void eat(Feed feed) {
        System.out.println("lion eats " + feed.toString());
    }
}
