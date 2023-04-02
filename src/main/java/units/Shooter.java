package units;
import addActions.Coordinates;

public abstract class Shooter extends BaseHero {
    protected int arrows;
    protected int accuracy;

    public Shooter(String class_name, String name, int x, int y, Coordinates pos, int hp, int max_hp, int armor, int[] damage) {
        super(class_name, name, x, y, pos, hp, max_hp, armor, damage);
        this.arrows = arrows;
        this.accuracy = accuracy;
    }

}




