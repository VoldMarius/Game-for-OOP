package units;

import addActions.Coordinates;

import java.util.ArrayList;

abstract class Magic extends BaseHero {
    protected int mana;
    protected int maxMana;

    public Magic(String class_name, String name,String emoji, int x, int y, Coordinates pos, int hp, int max_hp, int armor, int speed, int mana, int maxMana, String state) {
        super(class_name, name,emoji, x, y, pos, hp, max_hp, armor, speed, mana, state);
        this.mana = mana;
        this.maxMana = maxMana;
    }

    public void step(ArrayList<BaseHero> lightList, ArrayList<BaseHero> darkList) {
        for (BaseHero hero : darkList) {
            if (darkList.contains(hero) && hero.pos != this.pos) {

                if (!hero.state.equals("Die") && (hero.getHp() < (hero.getMax_hp()))) {
                    if(mana>0) {
                        double attack = -(hero.getMax_hp()-hero.hp);
                        this.mana +=attack;
                        hero.getPain(attack);
                    }
                    else{
                        if(this.mana < -this.maxMana*5 ) {
                            mana = this.maxMana;
                        }
                        else mana -=mana/2;
                    }
                }
            }
        }
    }
}


