package units;

import addActions.Coordinates;

import java.util.ArrayList;

public class Spearman extends BaseHero {
    public Spearman(String name, int x, int y) {

        super("Копейщик", name, x, y, new Coordinates(x, y) ,100,100,23, 65,1,"Stand");

    }
    @Override
    public void step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2) {
        super.step(team1, team2);
    }
    public String getInfo() {
        return "Копейщик";
    }


}
