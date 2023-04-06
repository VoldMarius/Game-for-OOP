import java.util.*;

import addActions.CreateObjectList;
import addActions.PrintArmy;
import addActions.TeamSort;
import units.*;

public class Main {
    public Main() {
    }

    public static <objekt> void main(String[] args) {
        Sniper sn = new Sniper("Bob", 1, 5);
        Crossbowman cr = new Crossbowman("Greg", 5, 4);
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

//        while (Iterator.hasNext()) {
//            Object n = Iterator.next();
//            System.out.print(String.valueOf(n) + "\n");
//        }
        Scanner user_input = new Scanner(System.in);
        System.out.print("Press Enter to begin.");
        user_input.nextLine();
        System.out.println("=====================");
        System.out.println("Тьма ");
        ArrayList<BaseHero> dark = CreateObjectList.createDarkList(1, 0);
        PrintArmy.print(dark);
        System.out.println("=====================");
        System.out.println("Свет ");
        ArrayList<BaseHero> light = CreateObjectList.createLightList(9, 0);
        PrintArmy.print(light);
        System.out.println("=====================");
        ArrayList<BaseHero> team = new ArrayList();
        team.addAll(dark);
        team.addAll(light);
        TeamSort.sort(team);

        for (BaseHero hero : team) {
            if (light.contains(hero)) {
                hero.step(dark, light);
            } else {
                hero.step(light, dark);
            }

        }
        System.out.println("=====================");
        TeamSort.sort(team);
        PrintArmy.print(team);
    }
}
