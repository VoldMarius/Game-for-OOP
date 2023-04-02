package units;

import addActions.Coordinates;

public class Inhabitant extends BaseHero {
    public Inhabitant(String name) {
        super("Житель", name, 1, 3, new Coordinates(0, 3) ,12,122,23, new int[]{20, 40});
    }

    public void step() {
    }

    public String getInfo() {
        return "Житель";
    }
}
