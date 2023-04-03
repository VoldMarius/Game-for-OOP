package units;

import addActions.Coordinates;

import java.util.ArrayList;

public class Thief extends BaseHero {
    public Thief(String name, int x, int y) {
        super("Вор", name, x, y, new Coordinates(x, y) ,12,
                122,23, new int[]{20, 40});
    }


    @Override
    public void step(ArrayList<BaseHero> team, ArrayList<BaseHero> team2) {

    }

    public String getInfo() {
        return "Вор";
    }


}
