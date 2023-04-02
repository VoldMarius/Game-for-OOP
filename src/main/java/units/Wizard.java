package units;

import addActions.Coordinates;

public class Wizard extends BaseHero {
    int magic = 10;
    int accuracy = 70;

    public Wizard(String name) {
        super("Маг", name, 1, 3, new Coordinates(0, 9) ,12,122,23, new int[]{20, 40});
    }

    public void step() {
    }

    public String getInfo() {
        return "Маг";
    }
}
