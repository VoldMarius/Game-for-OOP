package units;

import addActions.Coordinates;

import java.util.ArrayList;

public class Spearman extends Shooter {
    public Spearman(String name, int x, int y) {

        super("Копейщик", name, x, y, new Coordinates(x, y) ,12,122,23, new int[]{20, 40});
    }
    @Override
    public void step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2) {
        super.step(team1, team2);
    }
    public String getInfo() {
        return "Копейщик";
    }


}
