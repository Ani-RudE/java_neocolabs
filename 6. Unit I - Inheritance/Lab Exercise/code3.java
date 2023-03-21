//Account Detai
import java.util.*;

class Account {
     protected String accountNumber;
     protected double balance;
     protected String accountHoldername;

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
}

class SavingAccount extends Account {
     protected double minimumBalance;

     public double getMinimumBalance() {
          return minimumBalance;
     }

     public void setMinimumBalance(double minimumBalance) {
          this.minimumBalance = minimumBalance;
     }
}

class FixedAccount extends SavingAccount {
     private int lockingPeriod;

     public int getLockingPeriod() {
          return lockingPeriod;
     }

     public void setLockingPeriod(int lockingPeriod) {
          this.lockingPeriod = lockingPeriod;
     }
}

class AccountBO {
     public void getAccountDetail(String detail) {
          String[] bank = detail.split(",");
          System.out.format("%-20s %-10s %-20s %-20s %s\n", "Account Number", "Balance", "Account holder name",
                    "Minimum balance", "Locking period");
          System.out.format("%-20s %-10s %-20s %-20s%s\n", bank[0], bank[1], bank[2], bank[3], bank[4]);
     }
}

class Main {
     public static void main(String[] args) {
          String detail;
          Scanner scan = new Scanner(System.in);
          detail = scan.nextLine();
          AccountBO ab = new AccountBO();
          ab.getAccountDetail(detail);

          scan.close();
     }
}