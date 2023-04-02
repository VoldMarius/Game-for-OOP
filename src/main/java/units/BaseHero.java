package units;

import addActions.Coordinates;
import interfaces.GameInterface;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class BaseHero implements GameInterface {
    public String class_name;
    public String name;
    public int x;
    public int y;
    public Coordinates pos = new Coordinates(x,y);
    protected int hp;
    protected int max_hp;
    protected int armor;
    protected int[] damage;

    public BaseHero(String class_name, String name, int x, int y, Coordinates pos, int hp, int max_hp,
                    int armor, int[] damage) {
        this.class_name = class_name;
        this.name = name;
        this.x = x;
        this.y = y;
        this.pos = pos;
        this.hp = hp;
        this.max_hp = max_hp;
        this.armor = armor;
        this.damage = damage;
    }


    public String toString() {
        String var10000 = this.name;
        return "Имя - " + var10000 + " тип - " + this.class_name + " уровень здоровья: " + this.hp + " уровень брони: "
                + " " + this.armor + " наносимый урон в пределах: " + Arrays.toString(this.damage)+ pos;
    }

    public String getInfo() {
        return null;
    }
    public ArrayList getTeam() {

        return null;
    }
    public String findNearest(ArrayList<BaseHero> team) {

        double min = 100;
        String findNearest = null;
        for (int i = 1; i < team.size(); ++i) {

            if (this.pos.getDistance(team.get(i).pos) < min) {
                min = this.pos.getDistance(team.get(i).pos);
                findNearest = ((BaseHero) team.get(i)).getInfo();

            }
        }return findNearest;
    }
}



