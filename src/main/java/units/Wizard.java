package units;

public class Wizard extends BaseHero {
    int magic = 10;
    int accuracy = 70;

    public Wizard(String name) {
        super(100, name, 1, 1, 30, new int[]{25, 40}, "Маг ");
    }

    public void step() {
    }

    public String getInfo() {
        return "Маг";
    }
}
