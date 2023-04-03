package units;

import addActions.Coordinates;

import java.util.ArrayList;

public class Priest extends BaseHero {
    int treatment = 10;
    int accuracy = 70;

    public Priest(String name, int x, int y) {
        super("Монах ", name, x, y, new Coordinates(x, y) ,12,122,23, new int[]{20, 40});
    }

    public void step() {
    }

    public String getInfo() {
        return "Монах";
    }

    @Override
    public void step(ArrayList<BaseHero> LightList, ArrayList<BaseHero> DarkList) {

    }
}
