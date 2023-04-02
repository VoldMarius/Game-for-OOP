package units;

import addActions.Coordinates;

public class Spearman extends Shooter {
    public Spearman(String name) {

        super("Копейщик", name, 1, 3, new Coordinates(0, 7) ,12,122,23, new int[]{20, 40});
    }

    public void step() {
    }

    public String getInfo() {
        return "Копейщик";
    }
}
