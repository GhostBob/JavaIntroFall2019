
package practice1;

import java.util.Scanner;

public class Practice1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the balance due.");
        double balance = Double.parseDouble(scanner.nextLine().trim());
        double originalBalance = balance;
        double tax = 0;
        System.out.println("And what is the customer type? (E)mployee, (R)egular, or (T)ax-exempt");
        char customerType = scanner.nextLine().charAt(0);
        customerType = Character.toUpperCase(customerType);
        if (customerType == 'E') {
            balance = balance * 0.85;
            tax = balance * 0.08;
        }
        else if (customerType == 'R') {
            tax = balance * 0.08;
        }
        
        System.out.println("\n\n");
        System.out.println("Original Balance: " + originalBalance);
        if (customerType == 'E')
            System.out.println("Balance After Discount: " + balance);
        if (customerType != 'T')
            System.out.println("Sales Tax: " + tax);
        System.out.println("Total Due: " + (balance + tax));
    }
    
}
