package units;

import addActions.Coordinates;

public class Priest extends BaseHero {
    int treatment = 10;
    int accuracy = 70;

    public Priest(String name) {
        super("Монах ", name, 1, 3, new Coordinates(0, 3) ,12,122,23, new int[]{20, 40});
    }

    public void step() {
    }

    public String getInfo() {
        return "Монах";
    }
}
