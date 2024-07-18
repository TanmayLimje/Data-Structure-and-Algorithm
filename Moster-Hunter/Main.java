package Moster_hunter;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    private int level;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int exp = sc.nextInt();

        int mon[] = new int[n];
        int bonus[] = new int[n];

        Monster[] monsters = new Monster[n];

        for (int i = 0; i < n; i++) {
            mon[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            bonus[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            monsters[i] = new Monster(mon[i], bonus[i]);
        }

        Arrays.sort(monsters, Comparator.comparingInt(m -> m.power));

        int count = 0;

        for (int i = 0; i < n; i++) {
            if (monsters[i].power > exp) {
                break;
            }
            exp += monsters[i].bonus;
            count++;
        }

        System.out.println("mosters defeated = " + count);

    }
}
