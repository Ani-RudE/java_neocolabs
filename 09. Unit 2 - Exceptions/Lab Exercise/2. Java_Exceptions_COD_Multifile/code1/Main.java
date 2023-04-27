//Develop a Java program that simulates a simple banking system
//Main.java
import java.util.*;

public class Main {
     public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          System.out.println("Welcome to the Neo bank!");
          // Create a new account for the user
          Account account = new Account();
          while (true) {
               /*
                * System.out.println("\nPlease select an option:");
                * System.out.println("1. Deposit money");
                * System.out.println("2. Withdraw money");
                * System.out.println("3. Check balance");
                * System.out.println("4. Exit");
                */
               int choice = scan.nextInt();
               switch (choice) {
                    case 1:
                         // System.out.print("Enter the amount to deposit: ");
                         double depositAmount = scan.nextDouble();
                         try {
                              account.deposit(depositAmount);
                              System.out.println("Deposit successful!");
                         } catch (IllegalArgumentException e) {
                              System.out.println(e.getMessage());
                         }
                         break;
                    case 2:
                         // System.out.print("Enter the amount to withdraw: ");
                         double withdrawAmount = scan.nextDouble();
                         try {
                              account.withdraw(withdrawAmount);
                              System.out.println("Withdrawal successful!");
                         } catch (IllegalArgumentException | InsufficientFundsException e) {
                              System.out.println(e.getMessage());
                         }
                         break;
                    case 3:
                         System.out.println("Your current balance is: $" +
                                   account.getBalance());
                         break;
                    case 4:
                         System.out.println("Thank you for banking with us!");
                         System.exit(0);
                    default:
                         System.out.println("Invalid choice. Please try again.");
                         break;
               }
               
               // scan.close();
          }
     }
}
