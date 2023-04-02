package addActions;

import units.BaseHero;

import java.util.ArrayList;

import static addActions.CreateObjectList.getName;

public class PrintArmy {
    public static void createList(ArrayList team,int length) {
        int index;
        for(index = 1; index < length+1; ++index) {
            System.out.println("" + index + ". " + ((BaseHero)team.get(index - 1)).class_name + " по имени: "
                    + getName() + ". " +(((BaseHero) team.get(index - 1)).pos).toString());
        }
    }
}
