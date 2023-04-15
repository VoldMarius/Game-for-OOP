import units.BaseHero;

import java.util.Collections;
import java.util.Iterator;

public class View1 {
    private static int step = 1;
    private static final int[] l = new int[]{0};
    private static final String top10;
    private static final String midl10;
    private static final String bottom10;


    private static void tabSetter(int cnt, int max) {
        int dif = max - cnt + 5;
        if (dif > 0) {
            System.out.printf("%" + dif + "s", ":\t");
        } else {
            System.out.print(":\t");
        }

    }

    private static String formatDiv(String str) {
        return str.replace('a', '┌').replace('b', '-').replace('c', '┐')
                .replace('d', '├').replace('e', '-').replace('f', '┤').
                replace('g', '└').replace('h', '-').replace('i', '┘').
                replace('-', '─');
    }

    static String emoji(String a) {
        return a.replace("А", "\ud83c\udff9").replace("С", "\ud83c\udff9").
                replace("Ф", "\ud83d\udc77").replace("В", "\ud83e\uddd9").
                replace("М", "\ud83e\uddd9").replace("К", "\ud83d\udc82").
                replace("Р", "\ud83d\udc82");
    }

    private static String getChar(int x, int y) {
        String out = "|\u001b[30m->\u001b[0m";
        Iterator var3 = Main.team.iterator();

        while(var3.hasNext()) {
            BaseHero baseHero = (BaseHero) var3.next();
            if (baseHero.getCoords()[0] == x && baseHero.getCoords()[1] == y) {
                if (baseHero.getHp() == 0) {
                    out = "|\ud83e\uddb4";
                } else {
                    if (Main.dark.contains(baseHero)) {
                        out = "|" + String.valueOf(baseHero.getEmoji());
                    }

                    if (Main.light.contains(baseHero)) {
                        out = "|" + String.valueOf(baseHero.getEmoji());
                    }
                }
                break;
            }
        }

        return out;
    }

    public static void view1() {
        if (step == 1) {
            System.out.print("\u001b[31mFirst step\u001b[0m");
        } else {
            System.out.print("\u001b[31mStep:" + step + "\u001b[0m");
        }

        ++step;
        Main.team.forEach((v) -> {
            l[0] = Math.max(l[0], v.toString().length());
        });

        int j;
        for(j = 0; j < l[0] * 2; ++j) {
            System.out.print("_");
        }

        System.out.println();
        System.out.print(top10 + "    ");
        System.out.print("\u001b[34mTeam Light\u001b[0m");

        for(j = 0; j < l[0] - 8; ++j) {
            System.out.print(" ");
        }

        System.out.println(":\t\u001b[32mTeam Dark\u001b[0m");

        for(j = 1; j < 11; ++j) {
            System.out.print(getChar(1, j));
        }

        System.out.print("|    ");
        System.out.print("\u001b[34m" + String.valueOf(Main.light.get(0)) + "\u001b[0m");
        tabSetter(((BaseHero)Main.light.get(0)).toString().length(), l[0]);
        System.out.println("\u001b[32m" + String.valueOf(Main.dark.get(0)) + "\u001b[0m");
        System.out.println(midl10);

        for(j = 2; j < 10; ++j) {
            for( j = 1; j < 10; ++j) {
                System.out.print(getChar(j, j));
            }

            System.out.print("|    ");
            System.out.print("\u001b[34m" + String.valueOf(Main.light.get(j - 1)) + "\u001b[0m");
            tabSetter(((BaseHero)Main.light.get(j - 1)).toString().length(), l[0]);
            System.out.println("\u001b[32m" + String.valueOf(Main.light.get(j - 1)) + "\u001b[0m");
            System.out.println(midl10);
        }

        for(j = 1; j < 11; ++j) {
            System.out.print(getChar(10, j));
        }

        System.out.print("|    ");
        System.out.print("\u001b[34m" + String.valueOf(Main.light.get(9)) + "\u001b[0m");
        tabSetter(((BaseHero)Main.light.get(9)).toString().length(), l[0]);
        System.out.println("\u001b[32m" + String.valueOf(Main.dark.get(9)) + "\u001b[0m");
        System.out.println(bottom10);
    }

    static {
        String var10000 = formatDiv("a");
        top10 = var10000 + String.join("", Collections.nCopies(14, formatDiv("-b"))) + formatDiv("-c");
        var10000 = formatDiv("d");
        midl10 = var10000 + String.join("", Collections.nCopies(14, formatDiv("-e"))) + formatDiv("-f");
        var10000 = formatDiv("g");
        bottom10 = var10000 + String.join("", Collections.nCopies(14, formatDiv("-h"))) + formatDiv("-i");
    }
}
