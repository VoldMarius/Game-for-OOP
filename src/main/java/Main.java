import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import addActions.CreateObjectList;
import addActions.PrintArmy;
import units.*;

public class Main {
    public Main() {
    }

    public static <objekt> void main(String[] args) {
        Sniper sn = new Sniper("Bob", 1, 5);
        Crossbowman cr = new Crossbowman("Greg", 5,4);
        Wizard wz = new Wizard("David", 3, 2);
        Priest pr = new Priest("Iov", 1, 6);
        Inhabitant inh = new Inhabitant("Ivan", 1, 2);
        Spearman sp = new Spearman("Gollem", 1, 7);
        Thief tf = new Thief("Igor", 1, 4);
        List unit = new ArrayList();
        unit.add(sn);
        unit.add(cr);
        unit.add(wz);
        unit.add(pr);
        unit.add(inh);
        unit.add(sp);
        unit.add(tf);
        Iterator Iterator = unit.iterator();

        while(Iterator.hasNext()) {
            Object n = Iterator.next();
            System.out.print(String.valueOf(n) + "\n");
        }

        System.out.println("=====================");
        System.out.println("Тьма ");
        ArrayList<BaseHero> team1 = CreateObjectList.createDarkList(4,4,1);
        PrintArmy.createList(team1,4);

        System.out.println("=====================");
        System.out.println("Свет ");
        ArrayList<BaseHero> team2 = CreateObjectList.createLightList(4,4,9);
        PrintArmy.createList(team2,4);
        System.out.println("=====================");
        team2.get(1).step(team1,team2);
        team2.get(0).step(team1,team2);
        team1.get(0).step(team2,team1);

    }
}