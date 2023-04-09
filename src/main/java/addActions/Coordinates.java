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
            return "Координаты: "+ this.x +" " +this.y ;
        }

         public double getDistance(Coordinates enemy) {
                return Math.sqrt(Math.pow((double) ( this.x- enemy.x), 2.0)
                        + Math.pow((double) (this.y - enemy.y), 2.0));
        }

}