package units;

import addActions.Coordinates;

import java.util.ArrayList;


public class Wizard extends Magic {
    protected int manna;
    protected int maxMana;


    public Wizard(String name, int x, int y) {
        super("Маг",name,"\uD83E\uDDD9",x,y,new Coordinates(x, y), 100, 100, 12,3,20,30,"Stand");
    }
    public String getInfo() {
        return "Маг";
    }
    @Override
    public void step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2) {
        super.step(team1, team2);
    }
    }
