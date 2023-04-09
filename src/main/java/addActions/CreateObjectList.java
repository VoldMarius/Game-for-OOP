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

        for (int i = 0; i <10; i++) {
            switch (i) {
                case 0:
                    lightList.add(new Spearman(getName(), ++x,y));
                    break;
                case 1:
                    lightList.add(new Priest(getName(), ++x, y));
                    break;
                case 2:
                    lightList.add(new Sniper(getName(), ++x, y));
                    break;
                case 3:
                    lightList.add(new Inhabitant(getName(), ++x, y));
                    break;
                case 4:
                    lightList.add(new Spearman(getName(), ++x,y));
                    break;
                case 5:
                    lightList.add(new Sniper(getName(), ++x, y));
                    break;
                case 6:
                    lightList.add(new Priest(getName(), ++x, y));
                    break;
                case 7:
                    lightList.add(new Inhabitant(getName(), ++x, y));
                    break;
                case 8:
                    lightList.add(new Spearman(getName(), ++x,y));
                    break;
                case 9:
                    lightList.add(new Sniper(getName(), ++x, y));
                    break;
            }
        }
        return lightList;
    }
    public static ArrayList createDarkList(int x,int y) {

            ArrayList<BaseHero> darkList = new ArrayList();

        for (int j = 0; j <10; j++) {
            switch (j) {
                    case 0:
                        darkList.add(new Wizard(getName(), ++x, y));
                        break;
                    case 1:
                        darkList.add(new Crossbowman(getName(), ++x,y));

                        break;
                    case 2:
                        darkList.add(new Thief(getName(), ++x, y));
                        break;
                    case 3:
                        darkList.add(new Inhabitant(getName(), ++x, y));
                        break;
                case 4:
                    darkList.add(new Crossbowman(getName(), ++x,y));
                    break;
                case 5:
                    darkList.add(new Wizard(getName(), ++x, y));
                    break;
                case 6:
                    darkList.add(new Thief(getName(), ++x, y));
                    break;
                case 7:
                    darkList.add(new Inhabitant(getName(), ++x, y));
                    break;
                case 8:
                    darkList.add(new Thief(getName(), ++x, y));
                    break;
                case 9:
                    darkList.add(new Wizard(getName(), ++x, y));
                    break;
                }
            }
        return darkList;
    }
        public static String getName () {

            return Names.values()[(new Random()).nextInt(Names.values().length)].toString();
        }
    }
