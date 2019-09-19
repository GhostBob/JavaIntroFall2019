package javaapplication101;

import java.util.Random;

public class JavaApplication101 {

    public static void main(String[] args) {
        int[] stats = new int[6];
        String[] statNames = {"Str", "Dex", "Con", "Int", "Wis", "Cha"};

        //Roll each stat.
        for (int i = 0; i < 6; ++i) {
            stats[i] = rollFourDropLowest();
        }

        printStats(statNames, stats);
    }

    public static int rollFourDropLowest() {
        int[] dieRolls = new int[4];
        int stat = rollFourDice(dieRolls);
        int minValue = findMin(dieRolls);
        stat -= minValue;
        return stat;
    }

    public static void printStats(String[] names, int[] stats) {
        for (int i = 0; i < 6; ++i) {
            System.out.println(names[i] + ": " + stats[i]);
        }
    }

    public static int findMin(int[] dieRolls) {
        int minValue = 1247151;
        for (int j = 0; j < 4; ++j) {
            if (dieRolls[j] < minValue) {
                minValue = dieRolls[j];
            }
        }
        return minValue;
    }

    public static int rollFourDice(int[] dieRolls) {
        Random random = new Random();
        int sum = 0;
        for (int j = 0; j < 4; ++j) {
            dieRolls[j] = random.nextInt(6) + 1;
            sum += dieRolls[j];
        }
        return sum;
    }
}
