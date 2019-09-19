package javaapplication99;

import java.util.Scanner;

public class JavaApplication99 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please give me a number between 1 and 10.");
        System.out.println("I will convert it to the word for that number.");
        int input = scanner.nextInt();
        switch(input) {
            case 1:
                System.out.println("one");
//                break;
            case 2:
                System.out.println("two");
//                break;
            case 3:
                System.out.println("three");
//                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
//                break;
            default:
                System.out.println("Ok, I lied. It's somewhere between 6 and 10");
        }
    }
    
}
