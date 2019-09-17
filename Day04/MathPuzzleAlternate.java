package javaapplication89;

import java.util.Scanner;

public class JavaApplication89 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        int retries = 0;
        do {
            System.out.println("Give me an integer between 1 and 100!");
            input = scanner.nextInt();
            if (input > 100 || input < 1) {
                System.out.println("You're stupid.");
                retries++;
            }
            
            if (retries == 3) {
                System.out.println("You're hopless. I give up.");
                return;
            }
        } while ((input > 100 || input < 1) && retries < 3);

        int secretNumber = input;
        input *= 4;
        input += 12;
        input *= 2;
        input += 16;
        input /= 8;
        input -= secretNumber;
        System.out.println("Your number is now: " + input);

    }
}
