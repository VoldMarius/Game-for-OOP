package units;
import addActions.Coordinates;

import java.util.ArrayList;

public abstract class Shooter extends BaseHero  {
    protected int arrows;
    protected int accuracy;

    public Shooter(String class_name, String name, int x, int y, Coordinates pos, int hp,
                   int max_hp, int armor, int[] damage) {
        super(class_name, name, x, y, pos, hp, max_hp, armor, damage);
        this.arrows = arrows;
        this.accuracy = accuracy;
    }
    @Override
    public void step(ArrayList<BaseHero> LightList, ArrayList<BaseHero> DarkList) {

        if (this.hp == 0 && arrows == 0) {
            return;
        } else {
            System.out.println("Ближайшая цель для "+this.class_name+" -> " + findNearest(LightList));
        }
    }


}