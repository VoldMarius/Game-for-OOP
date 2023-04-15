package addActions;
import units.BaseHero;

import java.util.ArrayList;

public class Coordinates {
    protected int x;
    protected int y;


    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public String toString() {
        return "Координаты: " + x + " ." + y;
    }

    public double getDistance(BaseHero enemy) {
//        return  Math.round(Math.sqrt(Math.pow((float) (x- enemy.getCoords()[0]), 2.0)
//                + Math.pow((float) (y - enemy.getCoords()[1]), 2.0)));
        float dx = Math.abs(x - enemy.getCoords()[0]);
        float dy = Math.abs(y - enemy.getCoords()[1]);
        return (float) (Math.sqrt(dx * dx + dy * dy));
    }


    public int[] direction(BaseHero enemy) {
        return new int[]{enemy.getCoords()[0] - this.x, enemy.getCoords()[1] - this.y};
    }

//    public float distance(BaseHero target) {
//        float dx = Math.abs(x - target.x);
//        float dy = Math.abs(y - target.y);
//        return (float) Math.round(Math.sqrt(dx * dx + dy * dy));
//    }

    public boolean ifFriendOnTheWay(BaseHero enemy) {
        if (enemy.getCoords()[0] == this.x && enemy.getCoords()[1]  == this.y) return true;

        return false;
    }
}
