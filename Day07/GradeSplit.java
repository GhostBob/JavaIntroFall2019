package javaapplication108;

import java.util.Scanner;

public class JavaApplication108 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter some grades, split by commas.");
        String gradeString = scanner.nextLine().trim();
        String[] gradeSplit = gradeString.split(",");
        double sum = 0;
        for (String s : gradeSplit) {
            double grade = Double.valueOf(s);
            sum += grade;
        }
        
        double average = sum / gradeSplit.length;
        System.out.println("Sum: " + sum);
        System.out.println("Avg: " + average);
    }
    
}
