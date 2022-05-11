public class MainApp {
    public static void main(String[] args) {
        Animal lion = new Lion("lion");
        Animal cow = new Cow("cow");
        Grass grass = new Grass("grass");
        Animal goat = new Goat("goat");

        MeatFeed cowOne = new Cow("cow");

       lion.eat(cowOne);








    }
}
