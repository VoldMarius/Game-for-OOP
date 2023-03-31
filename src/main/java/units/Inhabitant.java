package units;

public class Inhabitant extends BaseHero {
    public Inhabitant(String name) {
        super(200, name, 9, 3, 20, new int[]{10, 30}, "Крестьянин");
    }

    public void step() {
    }

    public String getInfo() {
        return "Житель";
    }
}
