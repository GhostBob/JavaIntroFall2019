package javaapplication90;

import java.util.Scanner;

public class JavaApplication90 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; ++i) {
            System.out.println("Give me an integer between 1 and 100!");
            int input = scanner.nextInt();
            if (input >= 1 && input <= 100) {
                int secretNumber = input;
                input *= 4;
                input += 12;
                input *= 2;
                input += 16;
                input /= 8;
                input -= secretNumber;
                System.out.println("Your number is now: " + input);
                return;
            }
            else {
                System.out.println("You're stupid.");
            }
        }
        System.out.println("I've lost all hope in humanity thanks to you.");
    }

}
