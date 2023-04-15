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

    public static ArrayList createLightList( int x,int y) {
        ArrayList<BaseHero> lightList = new ArrayList();

        for (int i = 1; i <11; i++) {
            switch (new Random().nextInt(4)) {
                case 0:
                    lightList.add(new Spearman(getName(),  i,10));
                    break;
                case 1:
                    lightList.add(new Priest(getName(), i, 10));
                    break;
                case 2:
                    lightList.add(new Sniper(getName(),  i, 10));
                    break;
                case 3:
                    lightList.add(new Inhabitant(getName(), i, 10));
                    break;

            }
        }
        return lightList;
    }
    public static ArrayList createDarkList(int x,int y) {

            ArrayList<BaseHero> darkList = new ArrayList();

        for (int j = 1; j <11; j++) {
            switch (new Random().nextInt(4)) {
                    case 0:
                        darkList.add(new Wizard(getName(),j, 1));
                        break;
                    case 1:
                        darkList.add(new Crossbowman(getName(),j, 1));

                        break;
                    case 2:
                        darkList.add(new Thief(getName(),  j, 1));
                        break;
                    case 3:
                        darkList.add(new Inhabitant(getName(),  j, 1));
                        break;

                }
            }
        return darkList;
    }
        public static String getName () {

            return Names.values()[(new Random()).nextInt(Names.values().length)].toString();
        }
    }
