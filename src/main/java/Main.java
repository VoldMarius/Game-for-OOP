import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import addActions.CreateObjectList;
import addActions.PrintArmy;
import units.*;

import static addActions.CreateObjectList.*;

public class Main {
    public Main() {
    }

    public static <objekt> void main(String[] args) {
        Sniper sn = new Sniper("Bob");
        Crossbowman cr = new Crossbowman("Greg");
        Wizard wz = new Wizard("David");
        Priest pr = new Priest("Iov");
        Inhabitant inh = new Inhabitant("Ivan");
        Spearman sp = new Spearman("Gollem");
        Thief tf = new Thief("Igor");
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
        System.out.println("Первый набор юнитов");
        ArrayList<BaseHero> team1 = CreateObjectList.createList(10,7);
        PrintArmy.createList(team1,10);

        System.out.println("=====================");
        System.out.println("Второй набор юнитов");
        ArrayList<BaseHero> team2 = CreateObjectList.createList(10,7);
        PrintArmy.createList(team2,10);

        System.out.println(team1.get(10).findNearest(team2));
    }
}