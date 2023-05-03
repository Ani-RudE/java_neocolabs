import java.util.Scanner;

public class Main {
     /** Main method */
     public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
          // Create an Account object with an account
          // ID of 1122, and a balance of $20,000
          int id = in.nextInt();
          int bal = in.nextInt();
          double ir = in.nextDouble();
          int withdr = in.nextInt();
          int deposite = in.nextInt();
          Account account = new Account(id, bal);
          // Set annual interest rate of 4.5%
          account.setAnnualInterestRate(ir);
          // Withdraw $2,500
          account.withdraw(withdr);
          // Deposit $3,000
          account.deposit(deposite);
          // Display the balance, the monthly interest,
          // and the date when this account was created
          System.out.println("ACCOUNT STATEMENT");
          System.out.println("Account ID: " + account.getId());
          System.out.printf("Balance: $%.2f\n", account.getBalance());
          System.out.printf("Monthly interest: $%.2f\n",
                    account.getMonthlyInterest());
     }
}





//Account.java
import java.util.Date;

public class Account {
     // Data fields
     private int id;
     private double balance;
     private static double annualInterestRate;

     // Constructors
     /** Creates a default account */
     Account() {
          id = 0;
          balance = 0;
          annualInterestRate = 0;
     }

     /** Creates an account with the specified id and initial balance */
     Account(int newId, double newBalance) {
          id = newId;
          balance = newBalance;
     }

     // Mutator methods
     /** Set id */
     public void setId(int newId) {
          id = newId;
     }

     /** Set balance */
     public void setBalance(double newBalance) {
          balance = newBalance;
     }

     /** Set annualInterestRate */
     public void setAnnualInterestRate(double newAnnualInterestRate) {
          annualInterestRate = newAnnualInterestRate;
     }

     // Accessor methods
     /** Return id */
     public int getId() {
          return id;
     }

     /** Return balance */
     public double getBalance() {
          return balance;
     }

     /** Return annualInterestRate */
     public double getAnnualInterestRate() {
          return annualInterestRate;
     }

     /** Return monthly interest rate */
     public double getMonthlyInterestRate() {
          return annualInterestRate / 12;
     }

     // Methods
     /** Return monthly interest */
     public double getMonthlyInterest() {
          return balance * (getMonthlyInterestRate() / 100);
     }

     /** Decrease balance by amount */
     public void withdraw(double amount) {
          balance -= amount;
     }

     /** Increase balance by amount */
     public void deposit(double amount) {
          balance += amount;
     }
}