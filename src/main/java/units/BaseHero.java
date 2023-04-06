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
    protected int max_hp;
    protected int hp;
    protected int speed;
    protected int armor;
    protected int damage;
    protected String state;


    public BaseHero(String class_name, String name, int x, int y, Coordinates pos, int hp, int max_hp,
                    int armor, int damage,int speed,String state) {
        this.class_name = class_name;
        this.name = name;
        this.x = x;
        this.y = y;
        this.pos = pos;
        this.hp = hp;
        this.max_hp = max_hp;
        this.armor = armor;
        this.speed = speed;
        this.state = "Stand";
        this.damage = damage;


    }

    public int getHp() {
        return hp;
    }

    public int getSpeed() {
        return speed;
    }

    public int getDamage() {
        return damage;
    }
    public int getArmor() {
        return armor;
    }

    public String toString() {
        String var10000 = this.name;
        return "Имя - " + var10000 + " тип - " + this.class_name + " уровень здоровья: " + this.hp + " уровень брони: "
                + " " + this.armor + " наносимый урон в пределах: " + this.damage+ pos;
    }

    public String getInfo() {
        return null;
    }

    public int findNearest(ArrayList<BaseHero> enemyTeam) {
        int index = 0;
        double min = 100;
        String findNearest;
        for (int i = 0; i < enemyTeam.size(); ++i) {

            if (this.pos.getDistance(enemyTeam.get(i).pos) < min && !((BaseHero)enemyTeam.get(i)).state.equals("Die")) {
                min = this.pos.getDistance(enemyTeam.get(i).pos);
                index =i;
            }
        }return index;
    }
    protected void getPain(double attack) {
        this.hp -= (int) attack ;
        if (this.hp > this.max_hp) {
            this.hp = this.max_hp;
        }

        if (this.hp < 0) {
            this.state = "Die";
        }
    }


    public void step(ArrayList<BaseHero> team, ArrayList<BaseHero> team2){

    };
}



