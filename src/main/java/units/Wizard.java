package units;

import addActions.Coordinates;

import java.util.ArrayList;

public class Wizard extends BaseHero {
    int magic = 10;
    int accuracy = 70;

    public Wizard(String name, int x, int y) {
        super("Маг", name, x, y, new Coordinates(x, y) ,12,122,23, new int[]{20, 40});
    }

    public void step() {
    }

    public String getInfo() {
        return "Маг";
    }

    @Override
    public void step(ArrayList<BaseHero> LightList, ArrayList<BaseHero> DarkList) {

    }
}
