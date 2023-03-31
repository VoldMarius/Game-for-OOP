package units;

public class Priest extends BaseHero {
    int treatment = 10;
    int accuracy = 70;

    public Priest(String name) {
        super(100, name, 1, 3, 30, new int[]{20, 40}, "Монах ");
    }

    public void step() {
    }

    public String getInfo() {
        return "Монах";
    }
}
