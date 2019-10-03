package final2;

import java.text.NumberFormat;
import java.util.Scanner;
import java.util.Random;

public class Final2 {

    /**
     * Write a simulated ATM. Start with an initial balance, and allow the user
     * to deposit, withdraw, and examine funds as many times as they like, until
     * they quit they program. Each deposit should add to the balance, and each
     * withdrawal should subtract from the balance **IF** there’s enough money
     * in their account to cover the withdrawal. If there isn’t enough money,
     * inform the user of this fact, and don’t change the balance.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        //This is optional, but can be used to make doubles look like money.
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        
        int input;
        double balance = random.nextInt(3000); //Start with between $0 and $2999
        
        System.out.println("Welcome to the ATM Simulator 2019!");
        
        //Keep ATMing until they decide to quit.
        do {
            System.out.println("What would you like to do? Withdraw (1), " + 
                    "Deposit (2), See Balance (3), or Quit (4)");
            input = scanner.nextInt();
            
            if (input == 1) { //Withdraw
                
                System.out.println("How much would you like to withdraw?");
                double withdraw = scanner.nextDouble();
                if (withdraw <= balance) {
                    balance -= withdraw;
                    System.out.println("Done!");
                }
                else {
                    System.out.println("I'm sorry, you only have " + 
                            formatter.format(balance));
                }
            }
            else if (input == 2) { //Deposit
                
                System.out.println("How much would you like to deposit?");
                double deposit = scanner.nextDouble();
                if (deposit >= 0) {
                    balance += deposit;
                    System.out.println("Done!");
                }
                else { //Don't allow negative deposits (aka withdrawals)
                    System.out.println("Cheater, cheater...");
                }
            }
            else if (input == 3) { //See balance
                
                System.out.println("Your current balance is: " + 
                        formatter.format(balance));
            }
            
        } while (input != 4);
        
        System.out.println("See you later, alligator!");
    }
    
}
