//Interest Calculation
import java.util.*;
import java.text.DecimalFormat;

class Account extends Thread {
     private String accountNumber;
     private double balance;
     private String accountHoldername;

     public String getAccountNumber() {
          return accountNumber;
     }

     public void setAccountNumber(String accountNumber) {
          this.accountNumber = accountNumber;
     }

     public double getBalance() {
          return balance;
     }

     public void setBalance(double balance) {
          this.balance = balance;
     }

     public String getAccountHoldername() {
          return accountHoldername;
     }

     public void setAccountHoldername(String accountHoldername) {
          this.accountHoldername = accountHoldername;
     }

     public void run() {
          double interest, amount;
          DecimalFormat d = new DecimalFormat("0.00");
          if (this.balance >= 10000) {
               interest = balance * 0.08;
               amount = balance + interest;
          } else {
               interest = balance * 0.05;
               amount = balance + interest;
          }
          System.out.println(d.format(interest));
          System.out.println(d.format(amount));
     }
}

class Main {
     public static void main(String[] args) {
          int i, n;
          Scanner scan = new Scanner(System.in);
          n = Integer.parseInt(scan.nextLine());
          for (i = 0; i < n; i++) {
               Account a = new Account();
               a.setAccountNumber(scan.nextLine());
               a.setBalance(Double.parseDouble(scan.nextLine()));
               a.setAccountHoldername(scan.nextLine());
               Thread t = new Thread(a);
               a.start();
          }
     }
}