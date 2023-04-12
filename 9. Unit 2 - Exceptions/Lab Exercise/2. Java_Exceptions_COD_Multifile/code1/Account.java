//Develop a Java program that simulates a simple banking system
//Account.java
public class Account {
     private double balance;

     public Account() {
          balance = 0;
     }

     public void deposit(double amount) throws IllegalArgumentException {
          if (amount <= 0) {
               throw new IllegalArgumentException("Deposit amount must be positive.");
          }
          balance += amount;
     }

     public void withdraw(double amount) throws IllegalArgumentException,
               InsufficientFundsException {
          if (amount <= 0) {
               throw new IllegalArgumentException("Withdrawal amount must be positive.");
          }
          if (amount > balance) {
               throw new InsufficientFundsException("Insufficient funds.");
          }
          balance -= amount;
     }

     public double getBalance() {
          return balance;
     }
}