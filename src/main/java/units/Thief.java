package units;

public class Thief extends BaseHero {
    public Thief(String name) {
        super(100, name, 1, 6, 50, new int[]{25, 40}, "Вор");
    }

    public void step() {
    }

    public String getInfo() {
        return "Вор";
    }
}
