package units;

public class Crossbowman extends BaseHero {
    int bolt = 30;
    int accuracy = 50;

    public Crossbowman(String name) {
        super(100, name, 1, 6, 50, new int[]{30, 60}, "Арбалетчик ");
    }

    public void step() {
    }

    public String getInfo() {
        return "Арбалетчик";
    }
}
