package units;
import addActions.Coordinates;

import java.util.ArrayList;
import java.util.Iterator;


public abstract class Shooter extends BaseHero {
    protected int arrows;
    protected int accuracy;

    public Shooter(String class_name, String name, int x, int y, Coordinates pos, int hp,
                   int max_hp, int armor, int damage, int speed, String state) {
        super(class_name, name, x, y, pos, hp, max_hp, armor, damage, speed, state);
        this.arrows = arrows;
        this.accuracy = accuracy;
    }

    @Override
    public void step(ArrayList<BaseHero> lightList, ArrayList<BaseHero> darkList) {

        if (this.hp == 0 && arrows == 0) {
            this.state = "Die";
        } else {
            if (!this.state.equals("DIe") && this.arrows != 0) {
                int target = this.findNearest(lightList);
                double attack = this.damage - (lightList.get(target)).armor * (10 - (this.pos.getDistance(lightList.get(target).pos)));
                (lightList.get(target)).getPain(attack);
                --this.arrows;
                System.out.println(this.name + " " + String.valueOf(this.getInfo()) + " стрел у него  " + this.arrows+ " " + " выстрелил в ->  "
                        + String.valueOf(lightList.get(target).getInfo()) + " " + lightList.get(target).name +
                        " его здоровье теперь-> " + lightList.get(target).hp + " его статус -> " + lightList.get(target).state);
                for (int i = 0; i < darkList.size(); ++i) {
                    if (darkList.get(i) instanceof Inhabitant && ((BaseHero) darkList.get(i)).state.equals("Stand")) {

                        if (this.arrows<11){
                            darkList.get(i).state = "Busy ";
                            System.out.println(darkList.get(i).class_name+ " " +darkList.get(i).name+ " статус: " +darkList.get(i).state);
                            ++this.arrows;}
                    }
                }
            }
        }
    }
}
