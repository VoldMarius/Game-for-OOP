import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import addActions.CreateObjectList;
import units.Crossbowman;
import units.Inhabitant;
import units.Priest;
import units.Sniper;
import units.Spearman;
import units.Thief;
import units.Wizard;

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
        Iterator var9 = unit.iterator();

        while(var9.hasNext()) {
            Object n = var9.next();
            System.out.print(String.valueOf(n) + "\n");

        }
        System.out.println("=====================");
        System.out.println("Первый набор юнитов");

        CreateObjectList.createList(10,7);
        System.out.println("=====================");
        System.out.println("Второй набор юнитов");

        CreateObjectList.createList(10,7);
    }
}