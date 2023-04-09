package units;

import addActions.Coordinates;

import java.util.ArrayList;

public class Crossbowman extends Shooter {
    public Crossbowman(String name, int x, int y){
        super("Арбалетчик", name, x, y, new Coordinates(x, y) ,100,100,23, 60,1,"Stand");
        this.arrows = 10;

    }
    @Override
    public void step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2) {
        super.step(team1, team2);
    }

    public String getInfo() {
        return "Арбалетчик";
    }

}
