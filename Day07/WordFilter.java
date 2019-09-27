
package javaapplication107;

import java.util.Scanner;

public class JavaApplication107 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please enter a sentence: ");
        String input = scanner.nextLine();
        char[] inputChars = input.toCharArray();
        boolean[] uppers = new boolean[input.length()];
        for (int i=0; i< inputChars.length; ++i) {
            if (Character.isUpperCase(inputChars[i]))
                uppers[i] = true;
        }
        input = input.toLowerCase();
        input = input.replaceAll("fork", "****");
        input = input.replaceAll("spoon", "*****");
        
        for (int i=0; i< uppers.length; ++i) {
            char c = input.charAt(i);
            if (uppers[i] == true) {
                c = Character.toUpperCase(c);
            }
            System.out.print(c);
        }
        System.out.println("");
        
    }
    
}
