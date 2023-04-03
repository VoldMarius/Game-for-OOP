package units;

import addActions.Coordinates;

import java.util.ArrayList;

public class Inhabitant extends BaseHero {
    public Inhabitant(String name, int x, int y) {
        super("Житель", name, x, y, new Coordinates(x, y) ,12,122,23, new int[]{20, 40});
    }

    public String getInfo() {
        return "Житель";
    }

    @Override
    public void step(ArrayList<BaseHero> LightList, ArrayList<BaseHero> DarkList) {

    }
}
