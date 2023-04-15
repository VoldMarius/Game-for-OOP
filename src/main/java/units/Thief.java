package units;

import addActions.Coordinates;

import java.util.ArrayList;

public class Thief extends Melee {
    public Thief(String name, int x, int y) {
        super("Вор", name,"\uD83E\uDDD4\uD83C\uDFFE", x, y, new Coordinates(x, y) ,100, 100,23, 9,2,"Stand");
    }


    @Override
    public void step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2) {
        super.step(team1, team2);
    }



    public String getInfo() {
        return "Вор";
    }


}
