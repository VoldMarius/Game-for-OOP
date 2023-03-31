package addActions;

import java.util.ArrayList;
import java.util.Random;
import units.BaseHero;
import units.Crossbowman;
import units.Inhabitant;
import units.Priest;
import units.Sniper;
import units.Spearman;
import units.Thief;
import units.Wizard;

public class CreateObjectList {

    public static void createList(int num, int numClass) {
        ArrayList<BaseHero> heroList = new ArrayList();
        Random random = new Random();

        int index;
        for(index = 0; index < num; ++index) {
            switch (random.nextInt(numClass)) {
                case 0:
                    heroList.add(new Spearman(getName()));
                case 1:
                    heroList.add(new Sniper(getName()));
                case 2:
                    heroList.add(new Crossbowman(getName()));
                case 3:
                    heroList.add(new Inhabitant(getName()));
                case 4:
                    heroList.add(new Priest(getName()));
                case 5:
                    heroList.add(new Wizard(getName()));
                default:
                    heroList.add(new Thief(getName()));
            }
        }

        for(index = 1; index < num + 1; ++index) {
            System.out.println("" + index + ".  " + ((BaseHero)heroList.get(index - 1)).class_name + " по имени:  " + getName());
        }

    }

    private static String getName() {
        return Names.values()[(new Random()).nextInt(Names.values().length)].toString();
    }
}