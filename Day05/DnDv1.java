package javaapplication98;

import java.util.Random; 

public class JavaApplication98 {

    public static void main(String[] args) {
        int[] stats = new int[6];
        String[] statNames = {"Str", "Dex", "Con", "Int", "Wis", "Cha"};
        Random random = new Random();
        
        for(int i=0; i<6; ++i) {
            
            //Roll 4 dice, and save the results in dieRolls. AND add to the stat
            int[] dieRolls = new int[4];
            for (int j=0; j<4; ++j) {
                dieRolls[j] = random.nextInt(6)+1;
                stats[i] += dieRolls[j];
            }
            
            //Find the minimum value (lowest die roll) of the 4 rolls.
            int minValue = 1247151;
            for (int j=0; j<4; ++j) {
                if (dieRolls[j] < minValue) {
                    minValue = dieRolls[j];
                }
            }
            
            //Subtract it from the stat, so that we get roll 4, keep highest 3.
            stats[i] -= minValue;
        }
        
        //Print out each stat.
        for(int i=0; i<6; ++i) {
            System.out.println(statNames[i] + ": " + stats[i]);
        }
    }
}
