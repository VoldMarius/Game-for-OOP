package units;

import interfaces.GameInterface;
import java.util.Arrays;

public abstract class BaseHero implements GameInterface {
    public String class_name;
    public String name;
    protected int x;
    protected int y;
    protected int hp;
    protected int max_hp;
    protected int armor;
    protected int[] damage;

    public String toString() {
        String var10000 = this.name;
        return "Имя - " + var10000 + " тип - " + this.class_name + " уровень здоровья: " + this.hp + " уровень брони:  " + this.armor + " наносимый урон в пределах: " + Arrays.toString(this.damage);
    }

    public BaseHero(int hp, String name, int x, int y, int armor, int[] damage, String class_name) {
        this.hp = hp;
        this.name = name;
        this.x = x;
        this.y = y;
        this.armor = armor;
        this.damage = damage;
        this.class_name = class_name;
    }
}
