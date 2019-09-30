package javaapplication111;

import java.util.Scanner;
import java.util.Random;

public class JavaApplication111 {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean again = true;
        do {

            playGame(random, scanner);
            
            System.out.println("That was fun. Do you want to play again?");
            String answer = scanner.nextLine();
            if (answer.charAt(0) != 'y' && answer.charAt(0) != 'Y') {
                again = false;
            }
            
            System.out.println("");
        } while(again);
        System.out.println("Goodbye!");
    }

    public static boolean checkGuess(int secretNumber, int input) {
        boolean guessed = false;
        if (input == secretNumber) {
            System.out.println("You guessed it!");
            guessed = true;
        } else if (input < secretNumber) {
            System.out.println("Higher...");
        } else {
            System.out.println("Lower...");
        }
        return guessed;
    }

    public static void playGame(Random random, Scanner scanner) {
        int secretNumber = random.nextInt(100) + 1;
        boolean guessed = false;
        System.out.println("I'm thinking of a number between 1 and 100...");

        while (!guessed) {
            System.out.println("Guess what it is!");
            int input = Integer.parseInt(scanner.nextLine().trim());
            guessed = checkGuess(secretNumber, input);
        }
    }
}
