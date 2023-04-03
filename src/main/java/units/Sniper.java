package units;

import addActions.Coordinates;

import java.util.ArrayList;

public class Sniper extends Shooter {
    public Sniper(String name, int x, int y) {

        super("Снайпер",name,  x, y, new Coordinates(x, y), 100, 200, 12,
                new int[]{20, 40});
        this.arrows = 10;
        this.accuracy = 75;
    }


    @Override
    public void step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2) {
        super.step(team1, team2);
    }

    public String getInfo() {
        return "Снайпер";
    }

}
