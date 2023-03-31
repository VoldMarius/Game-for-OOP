package units;

public class Sniper extends BaseHero {
    int arrows = 10;
    int accuracy = 70;

    public Sniper(String name) {
        super(100, name, 1, 6, 30, new int[]{50, 100}, "Снайпер ");
    }

    public void step() {
    }

    public String getInfo() {
        return "Снайпер";
    }
}
