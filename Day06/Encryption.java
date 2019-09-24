/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author javauser
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        char[] message = {'H', 'e', 'l', 'l', 'o', ',', ' ', 'w', 'o',
//        'r', 'l', 'd', '!'};
        char[] message = "Hello, you are awesome. Have a nice day.".toCharArray();
        int offset = 8;
        System.out.println("Before:");
        print(message);
        System.out.println("After:");
        char[] encrypted = encrypt(message, offset);
        print(encrypted);
        System.out.println("Decrypted:");
        char[] decrypted = decrypt(encrypted, offset);
        print(decrypted);
    }
    
    public static char[] encrypt(char[] message, int offset) {
        char[] encrypted = new char[message.length]; //Make an array of the same size to store the encrypted letters
        for (int i=0; i<message.length; ++i) {
            encrypted[i] = (char)((int)message[i] + offset); //Since chars are just numbers, force it to add the offset to the char
        }
        return encrypted;
    }
    
    public static char[] decrypt(char[] message, int offset) {
        return encrypt(message, -offset); //Since decrypt is just a backwards encrypt, call encrypt with the opposite
    }
    
    public static void print(char[] message) {
        for (char c : message) {
            System.out.print(c);
        }
        System.out.println("");
    }
}
