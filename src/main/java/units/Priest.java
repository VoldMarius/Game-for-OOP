package units;

import addActions.Coordinates;

import java.util.ArrayList;

public class Priest extends Magic {


    public Priest(String name, int x, int y) {
        super("Пастырь",name,"✝️",x,y,new Coordinates(x, y), 100, 100, 12,3,20,30,"Stand");
    }


    public String getInfo() {
        return "Пастырь";
    }

    @Override
    public void step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2) {
        super.step(team1, team2);
    }


}
