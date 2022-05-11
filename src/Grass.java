public class Grass implements PlantFeed {
    private String name;

    public Grass(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Grass{"
                + "name='" + name + '\''
                + '}';
    }
}
