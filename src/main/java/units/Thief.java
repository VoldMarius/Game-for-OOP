package units;

import addActions.Coordinates;

public class Thief extends BaseHero {
    public Thief(String name) {
        super("Вор", name, 1, 3, new Coordinates(0, 5) ,12,
                122,23, new int[]{20, 40});
    }

    public void step() {
    }

    public String getInfo() {
        return "Вор";
    }
}
