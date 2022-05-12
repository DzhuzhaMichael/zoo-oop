public class MainApp {
    public static void main(String[] args) {
        Lion lion = new Lion();
        Cow cow = new Cow();
        Goat goat = new Goat();
        Grass grass = new Grass();

        lion.eat(cow);
        lion.eat(goat);
        cow.eat(grass);
        goat.eat(grass);
    }
}
