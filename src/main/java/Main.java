import java.util.*;

import addActions.CreateObjectList;
import addActions.PrintArmy;
import addActions.TeamSort;
import units.*;

public class Main {
    public static ArrayList<BaseHero> team = new ArrayList();
    public static ArrayList<BaseHero> dark = new ArrayList();
    public static ArrayList<BaseHero> light = new ArrayList();
    static int dieTeam1 = 0;
    static int dieTeam2 = 0;

    public static void main(String[] args) {


        Scanner user_input = new Scanner(System.in);
        System.out.print("Press Enter to begin.");
        user_input.nextLine();
        dark = CreateObjectList.createDarkList(0, 1);
        light = CreateObjectList.createLightList(0, 10);
        team.addAll(dark);
        team.addAll(light);
        TeamSort.sort(team);
        while (true) {
            View.view();
            user_input.nextLine();
            for (BaseHero hero : team) {
                if (light.contains(hero)) {
                    hero.step(dark, light);
                } else {
                    hero.step(light, dark);
                }

            } TeamSort.sort(team);
            Iterator var2 = light.iterator();
            BaseHero baseHero;
            while(var2.hasNext()) {
                baseHero = (BaseHero)var2.next();
                if (baseHero.getState() == "Die") {
                    ++dieTeam1;
                }
            }

            if (dieTeam1 == 10) {
                System.out.println("******************************************Team Light winner!******************************************");
                break;
            }

            dieTeam1 = 0;
            var2 = dark.iterator();

            while(var2.hasNext()) {
                baseHero = (BaseHero)var2.next();
                if (baseHero.getState() == "Die") {
                    ++dieTeam2;
                }
            }

            if (dieTeam2 == 10) {
                System.out.println("******************************************Team Dark winner!******************************************");
                break;
            }

            dieTeam2 = 0;
        }
    }
}
