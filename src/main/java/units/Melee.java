package units;

import addActions.Coordinates;

import java.util.ArrayList;

abstract class Melee extends BaseHero {


    public Melee(String class_name, String name,String emoji, int x, int y, Coordinates pos, int hp,
                 int max_hp, int armor, int damage, int speed, String state) {
        super(class_name, name, emoji, x, y, pos, hp, max_hp, armor, damage, speed, state);
    }

    @Override
    public void step(ArrayList<BaseHero> lightList, ArrayList<BaseHero> darkList) {
        if (state.equals("Die"))     return;
        BaseHero target = findNearest(lightList);
        if (this.pos.getDistance(target) <2 && target.getState().equals("Stand")) {
            double attack = this.damage ;
            target.getPain(attack);
        }
      if(this.pos.getDistance(target) >2&& target.getState().equals("Stand")) {
            if (Math.abs(target.x-this.x ) > Math.abs(target.y- this.y)) {

                x += Math.signum(target.x-this.x );
            } else {
                y += Math.signum(target.y- this.y);

            }
        }
    }
}


