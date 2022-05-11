public class MainApp {
    public static void main(String[] args) {
        Lion lion = new Lion();
        Cow cow = new Cow();
        Goat goat = new Goat();
        Grass grass = new Grass();

        System.out.println(lion.eat(goat));
        System.out.println(lion.eat(cow));
        System.out.println(lion.eat(grass));

        System.out.println(cow.eat(grass));
        System.out.println(cow.eat(cow));
        System.out.println(cow.eat(goat));

        System.out.println(goat.eat(grass));
        System.out.println(goat.eat(goat));
        System.out.println(goat.eat(cow));
    }
}
