package units;
import addActions.Coordinates;

import java.util.ArrayList;
import java.util.Iterator;


public abstract class Shooter extends BaseHero {
    protected int arrows;



    public Shooter(String class_name, String name, String emoji,int x, int y,Coordinates pos, int hp,
                   int max_hp, int armor, int damage, int speed, String state) {
        super(class_name, name,emoji, x, y, pos, hp, max_hp, armor, damage, speed, state);
        this.arrows = arrows;

    }


    @Override
    public void step(ArrayList<BaseHero> lightList, ArrayList<BaseHero> darkList) {
        if (this.hp == 0 && arrows == 0) {
            this.state = "Die";
        } else {
                BaseHero target = this.findNearest(lightList);
                double attack = this.damage - (target.armor * (10/(pos.getDistance(target))));
                target.getPain(attack);
                --this.arrows;
                for (int i = 0; i < darkList.size(); ++i) {
                    if (darkList.get(i) instanceof Inhabitant && ((BaseHero) darkList.get(i)).state.equals("Stand")) {
                        if (this.arrows < 10) {
                            darkList.get(i).state = "Busy ";
                            ++this.arrows;
                        }
                    }
                    if (darkList.get(i).state == "Busy ") {
                        darkList.get(i).state = "Stand";
                    }
                }
            }
        }

    }

