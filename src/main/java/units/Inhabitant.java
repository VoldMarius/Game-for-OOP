package units;

import addActions.Coordinates;

import java.util.ArrayList;

public class Inhabitant extends BaseHero {
    public Inhabitant(String name, int x, int y) {
        super("Житель", name,"\uD83D\uDC68", x, y, new Coordinates(x, y) ,100,100,23, 0,4,"Stand");
    }

    public String getInfo() {
        return "Житель";
    }

    @Override
    public void step(ArrayList<BaseHero> LightList, ArrayList<BaseHero> DarkList) {


    }
}
