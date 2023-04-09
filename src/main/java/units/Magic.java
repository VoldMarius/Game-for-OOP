package units;

import addActions.Coordinates;

import java.util.ArrayList;

abstract class Magic extends BaseHero {
    protected int mana;
    protected int maxMana;

    public Magic(String class_name, String name, int x, int y, Coordinates pos, int hp, int max_hp, int armor, int speed, int mana, int maxMana, String state) {
        super(class_name, name, x, y, pos, hp, max_hp, armor, speed, mana, state);
        this.mana = mana;
        this.maxMana = maxMana;
    }

    public void step(ArrayList<BaseHero> lightList, ArrayList<BaseHero> darkList) {
        for (BaseHero hero : darkList) {
            if (darkList.contains(hero)) {
                if (!this.state.equals("Die") && hero.getHp() < hero.getMax_hp() && !hero.state.equals("Die") && this.mana > -(this.maxMana / 2 - 1)) {
                    double attack = -hero.getHp() - this.mana;
                    hero.getPain(attack);
                    this.mana += (int) attack;
                    if (this.mana < (-(this.maxMana / 2))) {
                        mana = this.maxMana;
                    }
                    break;
                }
            }
        }
    }
}

