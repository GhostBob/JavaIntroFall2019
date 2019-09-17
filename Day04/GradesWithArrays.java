/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication93;

import java.util.Scanner;

public class JavaApplication93 {

    public static void main(String[] args) {
        //Step 1: Set stuff up
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double average = 0;
        double[] myGrades = new double[10]; 
        
        //To get something one character at a time:
        char c = scanner.next().charAt(0);
        
        //Step 2: Do stuff
        for (int gradeNum = 0; gradeNum <= 9; ++gradeNum) {
            System.out.println("Please enter an acceptable grade " + (gradeNum+1) + ":");
            double grade = scanner.nextDouble();
            
            if (grade <= 100 && grade >= 0) {
                sum += grade;
                myGrades[gradeNum] = grade;
            }
            else {
                System.out.println("That's not a valid grade...");
                gradeNum--;
            }
        }
        average = sum / 10;
        
        //Step 3: Print results
        for (int i=0; i<10; ++i) {
            System.out.println("Grade " + (i+1) + ": " + myGrades[i]);
        }
        System.out.println("The sum is: " + sum);
        System.out.println("The average is: " + average);
    }
}
