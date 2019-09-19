package javaapplication97;

// Allow me to use random numbers!
import java.util.Random;

public class JavaApplication97 {

    public static void main(String[] args) {
        Random random = new Random(); //Gotta get me a random to random.
        int[] randomNumbers = new int[100];
        
        // Get some random numbers.
        for(int i=0; i<100; ++i) {
            randomNumbers[i] = random.nextInt(30) + 1;
        }
        
        // Print out the numbers
        for (int i : randomNumbers) {
            System.out.println(i);
        }
    }
    
}
