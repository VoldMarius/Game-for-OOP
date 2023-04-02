package units;

import addActions.Coordinates;
import addActions.Coordinates.*;

public class Sniper extends Shooter {
    public Sniper(String name) {

        super("Снайпер",name,  0, 3, new Coordinates(0,3), 100, 200, 12,
                new int[]{20, 40});
        this.arrows = 10;
        this.accuracy = 75;
    }

    public void step() {
    }

    public String getInfo() {
        return "Снайпер";
    }
}
