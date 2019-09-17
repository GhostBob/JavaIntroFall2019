package javaapplication88;

// Useful for getting user input.
import java.util.Scanner;

public class JavaApplication88 {

    public static void main(String[] args) {

        // Creates a scanner for getting user input.
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your ID?");
        int userId = scanner.nextInt(); //Get the next int from the user.
        System.out.println("User id: " + userId);

        System.out.println("What is your PIN?");
        int userPIN = scanner.nextInt(); //Get the next int from the user.
        System.out.println("PIN: " + userPIN);

        //Loops follow a pattern (not always in this order).
        //1. Initialize a variable.
        //2. Do a comparison.
        //3. Modify that variable.
        //Four types of loops.
        //Do-While loop -- always executes at least once!
        int x = 0;
        do {
            x++;
            System.out.println(x);
        } while (x < 10);
        
        //While loop -- might never execute.
        int y = 0;
        while(y < 10) {
            y++;
            System.out.println(y);
        }
        
        //For loop -- Saves us time and saves us from stupid mistakes.
        for(int i=1; i<=10; i += 2) {
            System.out.println(i);
        }

        //Casting a variable as something else.
        //In this case, casting a double to an int.
        double whammy = 23.54543;
        System.out.println((int)whammy);
        for(int j=2; j<=100; j+= 2) {
            int square = j*j;
            System.out.println(square);
        }
        
        //Nested loops, loops within loops.
        for (int row = 0; row < 10; row++) {
            System.out.print(row + " ");
            for (int col = 0; col < row; col++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        // Draw stars from 1 to 5.
        for (int i = 1; i <= 5; ++i) {
            for (int j = 0; j < i; ++j) {
                System.out.print("*");
            }
            System.out.println("");
        }
//
//        // Draw stars from 4 to 1.
        for (int i = 4; i > 0; --i) {
            for (int j = 0; j < i; ++j) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
        //Just for fun, an ill-advised way to do this in one loop.
        int num = 1;
        for (int row = 0; row > -1; row += num) {
            System.out.print(row + " ");
            for (int col = 0; col < row; col++) {
                System.out.print("*");
            }
            if (row == 5)
                num = -1;
            System.out.println("");
        }

        //Conditional statements
        x = 4;
        if (x == 3) {
            System.out.println("X is 3!");
        }
        else if (x == 4) {
            System.out.println("X is 4!");
        }
        else if (x == 5) {
            System.out.println("You get the idea.");
        }
        else {
            System.out.println("X is NOT 3 OR 4, or 5!");
        }
        // X's and O's
        for (int row = 0; row < 10; row++) {
            System.out.print(row + " ");
            for (int col = 0; col < row; col++) {
                if (col % 2 == 0) {
                    System.out.print("x");
                }
                else {
                    System.out.print("o");
                }
            }
            System.out.println("");
        }
        
        //Person standing on a 2d map, perhaps?
        for (int i=0; i<10; i++) {
            for (int j=0; j<10; j++) {
                if (i == 3 && j == 5)
                    System.out.print("O");
                else 
                    System.out.print("*");
            }
            System.out.println("");
        }
        for (int i=1000; i>-101; i-=3) {
            System.out.println(i);
        }
        //Foreach Loop -- Most common once you get into more advanced programming.
        int[] superArray = new int[10];
        for(int z : superArray) {
            System.out.println(z);
        }
    }
}
