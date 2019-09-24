/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Random;

public class JavaApplication1 {

    public static void main(String[] args) {
        Random random = new Random();
        int passLength = random.nextInt(11) + 14; // Password will be between 14 and 24 characters.
        char[] password = new char[passLength];
        for (int i = 0; i < passLength; ++i) {
            password[i] = getBetterCharacter(random);
        }

        printOut(password, passLength);
    }

    // Use random and a switch to get a random character from either lower, upper, or digit.
    public static char getRandomCharacter(Random random) {
        char c;
        int choice = random.nextInt(5);
        switch (choice) {
            case 0:
            case 1:
                c = (char) (random.nextInt(26) + 97); //Random Lowercase based on ascii table 
                break;
            case 2:
            case 3:
                c = (char) (random.nextInt(26) + 65); //Uppercase from ascii
                break;
            default:
                c = (char) (random.nextInt(10) + 48); //digits from ascii 
                break;
        }
        return c;
    }
    
    // Turns the string of possible characters into a character array and chooses randomly from it.
    public static char getBetterCharacter(Random random) {
        String possibles = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$^&*()";
        char[] characters = possibles.toCharArray();
        char c = characters[random.nextInt(characters.length)];
        return c;
    }

    // Uses a foreach to print out each character in the password
    public static void printOut(char[] password, int length) {
        for (int i = 0; i < length; ++i) {
            System.out.print(password[i]);
        }
        System.out.println("");
    }
}
