package units;

import addActions.Coordinates;
import interfaces.GameInterface;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class BaseHero implements GameInterface {
    public String class_name;
    public String name;
    protected int x;
    protected int y;
    protected Coordinates pos ;
    protected int max_hp;
    protected int hp;
    protected int speed;
    protected int armor;
    protected int damage;
    protected String state;
    public String emogi;


    public BaseHero(String class_name, String name,String emoji, int x, int y, Coordinates pos, int hp, int max_hp, int armor, int damage,int speed,String state) {
        this.class_name = class_name;
        this.emogi=emoji;
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
    public int [] getCoords (){
        return new int[]{x,y};
    }

    public int getMax_hp() {
        return max_hp;
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
        return   this.emogi + " " + var10000+" X:"+x+" Y:"+y+"\uD83D\uDC97"+hp
                +"🛡️"+armor+"\uD83C\uDFAF"+damage;
    }

    public String getInfo() {
        return null;
    }

    public BaseHero findNearest(ArrayList<BaseHero> enemyTeam) {
        BaseHero findNearest = enemyTeam.get(0) ;
        double min = pos.getDistance(enemyTeam.get(0));

        for (int i = 1; i < enemyTeam.size(); i++) {
            if (this.pos.getDistance(enemyTeam.get(i)) < min && enemyTeam.get(i).getState().equals("Stand")) {
                min = this.pos.getDistance(enemyTeam.get(i));
               findNearest = enemyTeam.get(i);

            }
        }return findNearest;
    }

    public String getState() {
        return state;
    }

    protected void getPain(double attack) {
        this.hp -= (int) attack ;
        if (this.hp > this.max_hp) { this.hp = this.max_hp; }
        else if (this.hp <=0) {
            this.hp = 0;
            this.state="Die";
        }
    }
    public StringBuilder getEmoji() {
        return new StringBuilder("");
    }

    public void step(ArrayList<BaseHero> team, ArrayList<BaseHero> team2){

    };
}



