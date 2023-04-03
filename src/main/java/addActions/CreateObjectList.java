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

    public static ArrayList createLightList(int num, int numClass, int x) {
        ArrayList<BaseHero> lightList = new ArrayList();

        for (int i = 1; i < num; i++) {
            switch (i) {
                case 1:
                    lightList.add(new Spearman(getName(), x,1));
                case 2:
                    lightList.add(new Sniper(getName(), x, 2));
                case 3:
                    lightList.add(new Priest(getName(), x, 3));
                default:
                    lightList.add(new Inhabitant(getName(), x, 4));
            }

        }
        return lightList;
    }
    public static ArrayList createDarkList(int num, int numClass, int x) {

            ArrayList<BaseHero> darkList = new ArrayList();

            for (int j = 1; j < num; j++) {
                switch (j) {
                    case 1:
                        darkList.add(new Crossbowman(getName(), x, 1));
                    case 2:
                        darkList.add(new Wizard(getName(), x, 2));
                    case 3:
                        darkList.add(new Thief(getName(), x, 3));
                    default:
                        darkList.add(new Inhabitant(getName(), x, 4));
                }
            }
        return darkList;
    }
        public static String getName () {

            return Names.values()[(new Random()).nextInt(Names.values().length)].toString();
        }
    }
