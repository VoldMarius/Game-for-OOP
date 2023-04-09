package addActions;

import units.BaseHero;
import units.Shooter;

import java.util.ArrayList;

import static addActions.CreateObjectList.getName;

public class PrintArmy {
    public static void print(ArrayList team) {
        int index;
        for(index = 1; index < team.size()+1; ++index) {
            System.out.println("" + index + ". " + ((BaseHero)team.get(index - 1)).class_name
                    + " по имени: " + ((BaseHero)team.get(index - 1)).name
                    + ". Здоровье: " +((BaseHero) team.get(index - 1)).getHp());

        }
    }
}
