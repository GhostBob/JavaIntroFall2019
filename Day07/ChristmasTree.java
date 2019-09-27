/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication109;

import java.util.Random;

public class JavaApplication109 {

    /**
     * Draws a Christmas tree.
     * 
     * @param args The arguments that we never use.
     */
    public static void main(String[] args) {
        Random random = new Random();
        int rowCount = 6;
        for (int row = 0; row < rowCount; ++row) {
            for (int j = rowCount - row; j > 0; --j) {
                System.out.print(" ");
            }
//            for (int j = row * 2 + 1; j > 0; --j) {
//                System.out.print("*");
//            }
            boolean ornamented = false;
            for (int j = 0; j < 1 + 2 * row; j++) {
                if (!ornamented && j != 0 && j != 2 * row && random.nextInt(2) == 0) {
                    System.out.print("o");
                    ornamented = true;
                } else {
                    System.out.print("*");
                    ornamented = false;
                }
            }
            System.out.println("");
        }
        for (int i = 0; i < rowCount; ++i) {
            System.out.print(" ");
        }
        System.out.println("*");

    }

    public static void drawTree(int numRows) {
        for (int i = 0; i < numRows; ++i) {
            for (int j = numRows - i; j > 0; --j) {
                System.out.print(" ");
            }
//            for (int j = i * 2 + 1; j > 0; --j) {
//                System.out.print("*");
//            }
            for (int j = 0; j < 1 + 2 * i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = 0; i < numRows; ++i) {
            System.out.print(" ");
        }
        System.out.print("*");
        System.out.println("");
    }

}
