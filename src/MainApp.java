import model.Cow;
import model.Goat;
import model.Grass;
import model.Lion;
import model.PlantFeed;

public class MainApp {
    public static void main(String[] args) {
        Lion lion = new Lion();
        Cow cow = new Cow();
        Goat goat = new Goat();
        PlantFeed grass = new Grass();
        lion.eat(cow);
        lion.eat(goat);
        cow.eat(grass);
        goat.eat(grass);
    }
}
