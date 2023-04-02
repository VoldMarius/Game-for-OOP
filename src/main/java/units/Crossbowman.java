package units;

import addActions.Coordinates;

public class Crossbowman extends Shooter {
    int bolt;
    public Crossbowman(String name){
        super("Арбалетчик", name, 1, 3, new Coordinates(0, 4) ,12,122,23, new int[]{20, 40});
        this.bolt = 10;
        this.accuracy = 75;

    }

    public void step() {
    }

    public String getInfo() {
        return "Арбалетчик";
    }
}
