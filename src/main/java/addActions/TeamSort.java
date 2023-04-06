package addActions;

import units.BaseHero;

import java.util.ArrayList;
import java.util.Comparator;

public class TeamSort {
    public static void sort(ArrayList team) {
        team.sort((Comparator<BaseHero>) (o2, o1) -> o2.getSpeed() == o1.getSpeed()
                ? (int) (o1.getHp() - o2.getHp()) : o2.getSpeed() - o1.getSpeed());
    }
}