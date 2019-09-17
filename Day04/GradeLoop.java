/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication94;

import java.util.Scanner;

/**
 *
 * @author Schroeder <schroeder.austincc.edu>
 */
public class JavaApplication94 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] characters = new char[20];
        System.out.println("Please enter at least 20 characters:");
        for (int i=0; i<20; ++i) {
            char c = (char)scanner.next().charAt(0);
            characters[i] = c;
        }
        
        for (int i=0; i<20; ++i) {
            System.out.println(characters[i]);
        }
    }
    
}
