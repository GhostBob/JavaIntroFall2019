package javaapplication104;

import java.util.Scanner;

public class JavaApplication104 {

    public static void main(String[] args) {
        //Step 1: Set stuff up
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many grades do you have?");
        int numGrades = scanner.nextInt();
        double[] myGrades = getGrades(numGrades);

        replaceLowest(myGrades);
        replaceLowest(myGrades);
        
        double sum = findSum(myGrades);
        double average = findAverage(sum, myGrades.length);

        printResults(myGrades, sum, average);
    }
    
    /**
     * Replaces the lowest grade in the array with the highest grade in
     * the array.
     * 
     * @param grades The array of existing grades.
     */
    public static void replaceLowest(double[] grades) {
        double min = 101;
        double max = -1;
        for (double grade : grades) {
            if (grade < min) {
                min = grade;
            }
            if (grade > max) {
                max = grade;
            }
        }

        for (int i = 0; i < grades.length; ++i) {
            if (grades[i] == min) {
                System.out.println("Replacing " + min + " with " + max);
                grades[i] = max;
                break;
            }
        }
    }

    public static double[] getGrades(int numGrades) {
        Scanner scanner = new Scanner(System.in);
        double[] grades = new double[numGrades];

        for (int gradeNum = 0; gradeNum < numGrades; ++gradeNum) {
            System.out.println("Please enter an acceptable grade " + (gradeNum + 1) + ":");
            double grade = scanner.nextDouble();

            if (grade <= 100 && grade >= 0) {
                grades[gradeNum] = grade;
            } else {
                System.out.println("That's not a valid grade...");
                gradeNum--;
            }
        }
        return grades;
    }

    public static void printResults(double[] grades, double sum, double average) {
        for (int i = 0; i < grades.length; ++i) {
            System.out.println("Grade " + (i + 1) + ": " + grades[i]);
        }
        System.out.println("The sum is: " + sum);
        System.out.println("The average is: " + average);
    }

    public static double findSum(double[] grades) {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum;
    }

    public static double findAverage(double sum, int count) {
        return sum / count;
    }

}
