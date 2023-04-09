package units;

import addActions.Coordinates;

import java.util.ArrayList;

public class Sniper extends Shooter {
    public Sniper(String name, int x, int y) {
        super("Снайпер",name,  x, y, new Coordinates(x, y), 100, 100, 12,60,1,"Stand");
        this.arrows = 10;

    }

    @Override
    public void step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2) {
        super.step(team1, team2);
    }

    public String getInfo() {
        return "Снайпер";
    }

}
